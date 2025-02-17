"""
Metaclasses são classes que criam classes. Ou seja, Metaclasses são classes que definem o comportamento de classes.
Normalmente, em Python, criamos instâncias a partir de classes. Mas as classes em si também são instâncias — de uma metaclasse!

Metaclasses são raramente usadas no dia a dia, mas são úteis quando:
✅ Você quer validar classes automaticamente.
✅ Você precisa modificar a criação de classes (ex: adicionando atributos automaticamente).
✅ Você quer criar frameworks que controlam a estrutura das classes que os desenvolvedores criam.

Metaclasses são "classes de classes" — elas controlam como outras classes são criadas.
Por padrão, o Python usa type como metaclasse.
Podemos criar metaclasses personalizadas herdando de type.
Na maioria dos casos, decorators ou herança são alternativas melhores.
"""
class Meta(type):
    def __new__(mcs, name, bases, namespace):
        namespace['adicionei'] = 'um valor'

        cls = super().__new__(mcs, name, bases, namespace)

        for base in bases:
            for key, value in base.__dict__.items():
                if getattr(value, '__is_abstract__', False):
                    if key not in cls.__dict__.keys():
                        raise NotImplementedError(
                            f'{key} not implemented in {cls.__name__}')

        return cls


def abstractmethod(method):
    method.__is_abstract__ = True
    return method


class SuperPerson(metaclass=Meta):
    def __new__(cls, *args, **kwargs):
        print('__new__ da class')
        return super().__new__(cls)

    def __init__(self, name, lastname):
        print('__init__ da class')
        self.name = name
        self.lastname = lastname

    @abstractmethod
    def full_name(self):
        ...


class Person(SuperPerson):
    ...

    # def full_name(self):
    #     return 'Sei lá'

# def init_person(self, name, lastname):
#     self.name = name
#     self.lastname = lastname


# Person = type('Person', (), {
#     '__init__': init_person
# })

print(type(Person))
person1 = Person('Luiz', 'Otávio')
person2 = Person('Maria', 'Oliveira')
print(person1.name)
print(person2.name)
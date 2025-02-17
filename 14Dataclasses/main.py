from dataclasses import dataclass, field

class OldPerson:
    def __init__(self, name: str, last_name: str):
        self.name = name
        self.last_name = last_name

    def __str__(self):  # Representação do objeto
        return f'{self.name} {self.last_name}'
    
    def __repr__(self):  # Representação do objeto
        return f'{self.name} {self.last_name}'
    
    def __eq__(self, other):  # Comparação de igualdade
        if not isinstance(other, OldPerson):
            return NotImplemented
        return self.name == other.name and self.last_name == other.last_name
    
    def __hash__(self):  # Geração de hash
        return hash((self.name, self.last_name))
    
    def __lt__(self, other):  # Comparação de menor que
        if not isinstance(other, OldPerson):
            return NotImplemented
        return (self.name, self.last_name) < (other.name, other.last_name)
    
    def __le__(self, other):  # Comparação de menor ou igual
        if not isinstance(other, OldPerson):
            return NotImplemented
        return (self.name, self.last_name) <= (other.name, other.last_name)
    
    def __gt__(self, other):  # Comparação de maior que
        if not isinstance(other, OldPerson):
            return NotImplemented
        return (self.name, self.last_name) > (other.name, other.last_name)
    
    def __ge__(self, other):  # Comparação de maior ou igual
        if not isinstance(other, OldPerson):
            return NotImplemented
        return (self.name, self.last_name) >= (other.name, other.last_name)
    
    def __del__(self):  # Destrutor
        print(f'{self.name} foi apagado...')

"""
Dataclasses são uma forma de criar classes de dados em Python. Elas são úteis para criar classes que são usadas principalmente para armazenar dados, sem a necessidade de implementar métodos especiais como __init__, __repr__, __eq__, __hash__, etc.

Para criar uma dataclass, você deve decorar a classe com o decorador @dataclass e definir os atributos da classe como variáveis de classe.

Por exemplo, se você tem uma classe Pessoa com atributos como nome, sobrenome e idade, você pode criar uma dataclass Pessoa com os atributos nome, sobrenome e idade.

Mais Duvidas: https://docs.python.org/3/library/dataclasses.html
"""

@dataclass
class Person:
    name: str
    last_name: str
    active: bool = field(default=True)
    address: list = field(default_factory=list, repr=False)
    full_name: str = field(default='Missing',init=False,repr=False)

    def __post_init__(self):
        self.full_name = f'{self.name} {self.last_name}'
    
    def __hash__(self):
        return hash((self.name, self.last_name))

    @property
    def p_full_name(self):
        return self.full_name



if __name__ == '__main__':
    p1 = OldPerson('Luiz', 'Otávio')
    p2 = OldPerson('Luiz', 'Otávio')

    print(p1 == p2)  # ✅ True
    print(p1)  # ✅ Luiz Otávio
    print(p2)  # ✅ Luiz Otávio
    print(hash(p1))  # ✅ Hash gerado corretamente
    print(hash(p2))  # ✅ Hash gerado corretamente
    print(p1 < p2)  # ✅ False, pois os nomes são iguais
    
    p3 = Person('Luiz', 'Otávio')
    p4 = Person('Luiz', 'Otávio')

    print(p3 == p4)  # ✅ True (dataclasses já implementam __eq__)
    print(p3)  # ✅ Person(name='Luiz', last_name='Otávio', active=True, address=[])
    print(p4)
    print(hash(p3))  # ✅ Hash gerado corretamente
    print(hash(p4))  # ✅ Hash gerado corretamente

    # Exemplo de mutabilidade da lista
    p3.address.append('Belo Horizonte')
    print(p3.address)  # ✅ ['Belo Horizonte']
    print(p4.address)  # ❌ Também será ['Belo Horizonte'] devido ao uso incorreto de `default=[]`

    # Criando novas pessoas
    p5 = Person('Maria', 'Miranda', False)
    print(p5)
    print(p5.active)

    p6 = Person('João', 'Moreira', False, ['São Paulo'])
    print(p6)
    print(p6.active)
    print(p6.address)
    print(p6.p_full_name)

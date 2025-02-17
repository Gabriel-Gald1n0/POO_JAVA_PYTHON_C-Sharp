from abc import ABC, abstractmethod 
"""
Interface é um tipo de classe abstrata que contém apenas métodos abstratos.
Uma interface é uma forma de definir um contrato que as classes devem seguir.
Em Python, interfaces são criadas utilizando a classe ABC e a função abstractmethod do módulo abc.
Para criar uma interface, você precisa importar a classe ABC e a função abstractmethod do módulo abc.
Para criar um método abstrato, você precisa decorá-lo com a função abstractmethod.
Em exemplo de interface, temos a interface IFormas que contém os métodos abstratos calcular_area e get_perimetro.
As classes Quadrado e Circulo implementam a interface IFormas e implementam os métodos calcular_area e get_perimetro.

Diferença entre Interface e Classe Abstrata:
- Uma classe abstrata pode conter métodos abstratos e métodos concretos, enquanto uma interface só pode conter métodos abstratos.
- Uma classe abstrata pode conter atributos, enquanto uma interface não pode conter atributos.
- Uma classe pode herdar de várias interfaces, mas só pode herdar de uma classe abstrata.
- Uma classe abstrata pode ter construtores, enquanto uma interface não pode ter construtores.
- Uma classe abstrata pode ter métodos estáticos, enquanto uma interface não pode ter métodos estáticos.

Quando Usar Cada Uma?
Use Classe Abstrata quando:
✔ Você quer compartilhar código e comportamento com subclasses.
✔ Algumas partes da implementação podem ser reutilizadas.

Use Interface quando:
✔ Você quer apenas definir um contrato (métodos obrigatórios) sem implementação.
✔ Você quer garantir que todas as classes implementem os mesmos métodos.

📌 Exemplo real:

Animal pode ser uma classe abstrata (pois pode ter atributos e métodos concretos).
Veiculo pode ser uma interface (pois só define métodos obrigatórios).
"""
class IFormas(ABC):  # Interface
    @abstractmethod
    def calcular_area(self):
        pass

    @abstractmethod
    def get_perimetro(self) -> float:
        pass

class Quadrado(IFormas):
    def __init__(self, lado):
        self.lado = lado

    def calcular_area(self):
        return self.lado ** 2

    def get_perimetro(self) -> float:
        return 4 * self.lado
    
class Circulo(IFormas):
    def __init__(self, raio):
        self.raio = raio

    def calcular_area(self):
        return 3.14 * (self.raio ** 2)

    def get_perimetro(self) -> float:
        return 2 * 3.14 * self.raio
    

q = Quadrado(4)
print(q.calcular_area())  # Saída: 16
print(q.get_perimetro())  # Saída: 16

c = Circulo(5)
print(c.calcular_area())  # Saída: 78.5
print(c.get_perimetro())  # Saída: 31.400000000000002

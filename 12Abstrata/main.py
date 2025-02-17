from abc import ABC, abstractmethod # Importa o módulo ABC e a função abstractmethod

"""
Classe abstrata é uma classe que não pode ser instanciada, mas pode ser herdada.
Uma classe abstrata é uma classe que contém métodos abstratos.
Um método abstrato é um método que não possui implementação.
Para criar uma classe abstrata, você precisa importar a classe ABC e a função abstractmethod do módulo abc.
Para criar um método abstrato, você precisa decorá-lo com a função abstractmethod.

Em exemplo de classe abstrata, temos a classe Forma que contém um método abstrato calcular_area.
As classes Quadrado e Circulo herdam de Forma e implementam o método calcular_area.
"""

class Forma(ABC):  # Classe abstrata
    @abstractmethod
    def calcular_area(self):
        pass

class Quadrado(Forma):
    def __init__(self, lado):
        self.lado = lado

    def calcular_area(self):
        return self.lado ** 2
    
class Circulo(Forma):
    def __init__(self, raio):
        self.raio = raio

    def calcular_area(self):
        return 3.14 * (self.raio ** 2)

q = Quadrado(4)
print(q.calcular_area())  # Saída: 16

c = Circulo(5)
print(c.calcular_area())  # Saída: 78.5


from main import *
from typing import Type

class Engennheiro:
    def __init__(self, nome: str) -> None:
        self.nome = nome
    
    def medir_perimetro(self, forma: Type[IFormas]) -> None:
        print(f'{self.nome} medindo o perímetro da forma {forma.get_perimetro()}')

    def calcular_area(self, forma: Type[IFormas]) -> None:
        print(f'{self.nome} calculando a área da forma {forma.get_perimetro()}')

e = Engennheiro('José')
q = Quadrado(4)
e.medir_perimetro(q)
e.calcular_area(q)
c = Circulo(5)
e.medir_perimetro(c)
e.calcular_area(c)
# Saída:

    
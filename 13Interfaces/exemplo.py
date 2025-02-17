from abc import ABC, abstractmethod

class Veiculo(ABC):  # Interface (não tem atributos ou métodos concretos)
    @abstractmethod
    def mover(self):
        pass  # Método obrigatório

class Carro(Veiculo):
    def mover(self):
        print("O carro está andando.")

class Bicicleta(Veiculo):
    def mover(self):
        print("A bicicleta está pedalando.")

# Criando objetos
carro = Carro()
carro.mover()  # ✅ O carro está andando.

bike = Bicicleta()
bike.mover()  # ✅ A bicicleta está pedalando.

# Criação da classe Pessoa
class Pessoa:
    # Construtor
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    # Métodos
    def __str__(self):
        return f'{self.nome} tem {self.idade} anos'

    def is_adulto(self):
        return self.idade >= 18

    def aniversario(self):
        self.idade += 1
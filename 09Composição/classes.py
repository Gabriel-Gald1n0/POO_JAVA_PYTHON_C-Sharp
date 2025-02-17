"""
Em cliente e endereço, temos um exemplo de composição. Onde a classe cliente é dona de objetos da classe endereço.
Assim como em agregação, a classe cliente é composta por objetos da classe endereço, mas a classe endereço não pode ser compartilhada com outras classes.

Ou seja, a classe endereço só existe enquanto a classe cliente existir.
"""
class Cliente:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.enderecos = []

    def inserir_endereco(self, cidade, estado):
        self.enderecos.append(Endereco(cidade, estado))

    def lista_enderecos(self):
        for endereco in self.enderecos:
            print(endereco.cidade, endereco.estado)

    def __del__(self):
        print(f'{self.nome} foi apagado...')

class Endereco:
    def __init__(self, cidade, estado):
        self.cidade = cidade
        self.estado = estado

    def __del__(self):
        print(f'{self.cidade}/{self.estado} foi apagado...')
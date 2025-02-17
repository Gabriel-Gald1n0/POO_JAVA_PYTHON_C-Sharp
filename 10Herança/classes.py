"""
Herança é um conceito importante em programação orientada a objetos. Ele permite criar uma nova classe que herda atributos e métodos de uma classe existente.

A classe que herda é chamada de classe filha ou subclasse, e a classe de onde ela herda é chamada de classe pai ou superclasse.

A herança é uma forma de reutilização de código, pois permite que você crie uma nova classe que reutiliza os atributos e métodos de uma classe existente, sem precisar reescrevê-los.

Em Python, você pode criar uma nova classe que herda de uma classe existente, passando a classe pai como argumento para a definição da nova classe.

Por exemplo, se você tem uma classe Pessoa com atributos como nome e idade, você pode criar uma nova classe Cliente que herda de Pessoa e adiciona atributos específicos para clientes, como endereço e telefone.
"""
class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.nomeClasse = self.__class__.__name__

    def falar(self):
        print(f'{self.nomeClasse}: {self.nome} está falando...')
 
class Cliente(Pessoa): # Herança de Pessoa
    def comprar(self):
        print(f'{self.nomeClasse}: {self.nome} está comprando...')

    def falar(self): # Sobrescrita de método 
        print(f'{self.nomeClasse}: {self.nome} está falando ao telefone...') 
        

class Aluno(Pessoa):
    def estudar(self):
        print(f'{self.nomeClasse}: {self.nome} está estudando...')
        
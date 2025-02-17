"""
Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.
Em Python, o polimorfismo é implementado através do conceito de sobrescrita de métodos.
Sobrescrita de métodos é a capacidade de uma classe filha de alterar a implementação de um método herdado da classe pai.
Por exemplo, se você tem uma classe Ave com um método voar, você pode criar uma classe Pinguim que herda de Ave e sobrescreve o método voar para exibir uma mensagem diferente.
"""
class Ave:
    def voar(self):
        print("A ave está voando.")

class Pinguim(Ave):
    def voar(self):
        print("Pinguins não voam.")

ave1 = Ave()
ave2 = Pinguim()

ave1.voar()  # Saída: A ave está voando.
ave2.voar()  # Saída: Pinguins não voam.

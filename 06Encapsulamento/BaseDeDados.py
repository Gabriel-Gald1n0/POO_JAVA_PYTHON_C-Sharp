"""
Encapsulamento é o conceito de proteger os atributos de uma classe, Restringindo o acesso direto a eles.
Em Python, por convenção, utilizamos um underline duplo __ antes do nome do atributo para torná-lo privado.
Porém, isso não impede que o atributo seja acessado, apenas indica que ele não deve ser acessado diretamente.
Para acessar um atributo privado, utilizamos métodos get e set.


public -> Pode ser acessado de qualquer lugar
_ protected -> Pode ser acessado apenas por herança
__ private -> Pode ser acessado apenas dentro da classe
"""
class BaseDeDados:
    def __init__(self):
        self.__dados = {}

    @property
    def dados(self):
        return self.__dados

    def inserir_cliente(self, id, nome):
        if 'clientes' not in self.__dados:
            self.__dados['clientes'] = {id: nome}
        else:
            self.__dados['clientes'].update({id: nome})

    def lista_clientes(self):
        for id, nome in self.__dados['clientes'].items():
            print(id, nome)

    def apaga_cliente(self, id):
        del self.__dados['clientes'][id]

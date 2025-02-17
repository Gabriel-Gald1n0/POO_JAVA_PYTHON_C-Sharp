class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    # Getters e Setters
    @property
    def preco(self):
        return self._preco
    
    @preco.setter
    def preco(self, valor):
        if isinstance(valor, str):
            valor = float(valor.replace('R$', ''))
        self._preco = valor

    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def nome(self, valor):
        self._nome = valor

    # Métodos
    def desconto(self, percentual):
        self._preco = self._preco - (self._preco * (percentual / 100))
        return self._preco
    
    def __str__(self):
        return f'{self.nome} custa R$ {self._preco}'
    

from classes import *
"""
Agregação é quando uma classe tem outra classe, mas uma não depende da outra.

Agregação é uma forma de composição, onde uma classe é composta por outra classe, mas a classe que compõe a outra classe pode ser compartilhada com outras classes.
"""
def main():
    p1 = Produto('Camiseta', 50)
    p2 = Produto('Iphone', 10000)
    p3 = Produto('Caneca', 15)

    carrinho = CarrinhoDeCompras()

    carrinho.adicionar_produto(p1)
    carrinho.adicionar_produto(p2)
    carrinho.adicionar_produto(p3)

    carrinho.listar_produtos()
    print(carrinho.soma_total())

if __name__ == '__main__':
    main()
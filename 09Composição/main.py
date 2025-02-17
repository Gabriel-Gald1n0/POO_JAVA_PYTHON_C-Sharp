from classes import *
""" 
Composição é quando uma classe é dona de objetos de outra classe.

Composição é uma forma de agregação, onde uma classe é composta por outra classe, mas a classe que compõe a outra classe não pode ser compartilhada com outras classes.

Ou seja a classe que compõe a outra classe só existe enquanto a classe que a compõe existir.
"""
def main():
    c1 = Cliente('Felipe', 22)
    c1.inserir_endereco('Curitiba', 'PR')
    c2 = Cliente('Iale', 54)
    c2.inserir_endereco('Pelotas', 'RS')
    c3 = Cliente('Gabriel', 32)
    c3.inserir_endereco('Ilheus', 'BA')

    print(c1.nome)
    c1.inserir_endereco('São Paulo', 'SP')
    c1.lista_enderecos()
    print()

    print(c2.nome)
    c2.lista_enderecos()
    print()

    print(c3.nome)
    c3.lista_enderecos()
    print()

    del c1
    print()
    del c2
    print()
    del c3




if __name__ == '__main__':
    main()
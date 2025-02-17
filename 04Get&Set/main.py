from Produto import Produto

def main():
    p1 = Produto('Camiseta', 50)
    p1.preco = 60
    print(p1)
    p1.desconto(10)
    print(p1)
    p1.preco = 'R$70'
    print(p1)

if __name__ == '__main__':
    main()
from BaseDeDados import BaseDeDados

def main():
    bd = BaseDeDados()
    bd.inserir_cliente(1, 'Otávio')
    bd.inserir_cliente(2, 'Miranda')
    bd.inserir_cliente(3, 'Rose')
    bd.lista_clientes()
    bd.apaga_cliente(2)
    bd.lista_clientes()

    # print(bd.__dados) # AttributeError: 'BaseDeDados' object has no attribute '__dados'
    
    # print(bd._BaseDeDados__dados) # {'clientes': {1: 'Otávio', 2: 'Miranda', 3: 'Rose'}} 
    print(bd._BaseDeDados__dados)

    print(bd.dados)

if __name__ == '__main__':
    main()
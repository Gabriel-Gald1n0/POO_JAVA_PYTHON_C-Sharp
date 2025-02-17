from utilitarios import *

def main():
    criar_categorias('Alimentação')
    criar_categorias('Transporte')
    criar_categorias('Lazer')
    criar_categorias('Educação')
    criar_categorias('Saúde')
    criar_categorias('Moradia')
    criar_categorias('Vestuário')
    criar_categorias('Outros')

    criar_transacoes('01/01/2021', 'Débito', 100, 'Alimentação', 'Mercado')
    criar_transacoes('02/01/2021', 'Crédito', 50, 'Transporte', 'Uber')
    criar_transacoes('03/01/2021', 'Débito', 200, 'Lazer', 'Cinema')
    criar_transacoes('04/01/2021', 'Débito', 150, 'Educação', 'Curso de Python')
    criar_transacoes('05/01/2021', 'Débito', 300, 'Saúde', 'Plano de Saúde')
    criar_transacoes('06/01/2021', 'Débito', 500, 'Moradia', 'Aluguel')
    criar_transacoes('07/01/2021', 'Débito', 50, 'Vestuário', 'Camiseta')
    
    pagar_transacao('01/01/2021')
    pagar_transacao('02/01/2021')

    print('Transações:')
    listar_transacoes()

    print('\nCategorias:')
    listar_categorias()

    print('\nTransações por categoria:')
    listar_transacoes_por_categoria('Alimentação')
    listar_transacoes_por_categoria('Transporte')
    listar_transacoes_por_categoria('Lazer')
    listar_transacoes_por_categoria('Educação')
    listar_transacoes_por_categoria('Saúde')
    listar_transacoes_por_categoria('Moradia')
    listar_transacoes_por_categoria('Vestuário')
    listar_transacoes_por_categoria('Outros')

    print(f'\nSaldo total: R$ {saldo_total()}')



if __name__ == '__main__':
    main()
from categoria  import Categoria
from transacao import Transacao

ListaCategorias = []
ListaTransacoes = []

def criar_categorias(nome):
    nova_categoria = Categoria(nome)
    ListaCategorias.append(nova_categoria)


def criar_transacoes(data, tipo, valor, categoria, descricao):
    for c in ListaCategorias:
        if c.nome == categoria:
            nova_transacao = Transacao(data, tipo, valor, c, descricao)
            ListaTransacoes.append(nova_transacao)
            return
    print('Categoria não encontrada')

def saldo_total():
    total = 0
    for t in ListaTransacoes:
        if t.pago:
            total += t.valor
    return total    

def listar_transacoes():
    for t in ListaTransacoes:
        t.exibir()

def listar_categorias():
    for c in ListaCategorias:
        print(c)

def listar_transacoes_por_categoria(categoria):
    for t in ListaTransacoes:
        if t.categoria.nome == categoria:
            t.exibir()
            print()

def pagar_transacao(data):
    new_data = data.replace('/', '-')
    for t in ListaTransacoes:
        if t.data == new_data:
            t.p_pago = True
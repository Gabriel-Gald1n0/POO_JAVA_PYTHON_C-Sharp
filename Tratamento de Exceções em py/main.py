from Banco.ContaPoupanca import ContaPoupanca
from Banco.ContaEspecial import ContaEspecial
from Banco.Exceptions import SaldoInsuficienteException, ValorInvalidoException, ContaInexistenteException

def encontrar_conta_por_numero(contas, numero_conta):
    """Encontra uma conta pelo número da conta."""
    for conta in contas:
        if conta.num_conta == numero_conta:
            return conta
    raise ContaInexistenteException(f"Conta com número {numero_conta} não encontrada.")

def main():
    contas_cliente = []

    # Criando contas
    poupanca = ContaPoupanca("Maria José", 12345, 2000.0, 0.015)
    especial = ContaEspecial("Maria José", 67890, 1000.0, 500.0)

    contas_cliente.append(poupanca)
    contas_cliente.append(especial)

    # Testando operações
    try:
        # Operações que podem lançar exceções
        poupanca.sacar(500.0)  # Sucesso
        especial.sacar(1200.0)  # Sucesso
        poupanca.depositar(-300.0)  # Falha: Valor inválido
    except (SaldoInsuficienteException, ValorInvalidoException) as e:
        print(f"Erro na operação bancária: {e}")
    except Exception as e:
        print(f"Erro inesperado: {e}")

    # Calculando rendimento
    try:
        poupanca.render_juros()
    except ValorInvalidoException as e:
        print(f"Erro ao calcular rendimento: {e}")

    # Testando se a conta existe
    try:
        conta = encontrar_conta_por_numero(contas_cliente, 12345)  # Conta existente
        print(f"Conta encontrada: {conta.cliente}")

        conta = encontrar_conta_por_numero(contas_cliente, 99999)  # Conta inexistente
        print(f"Conta encontrada: {conta.cliente}")
    except ContaInexistenteException as e:
        print(f"Erro: {e}")

    # Exibindo dados das contas
    for conta in contas_cliente:
        print("-------------------------------")
        print(f"Cliente: {conta.cliente}")
        print(f"Número da Conta: {conta.num_conta}")
        print(f"Saldo Atual: R${conta.saldo:.2f}")
        if isinstance(conta, ContaPoupanca):
            print("Tipo de conta: Conta Poupança")
        elif isinstance(conta, ContaEspecial):
            print("Tipo de conta: Conta Especial")


if __name__ == "__main__":
    main()

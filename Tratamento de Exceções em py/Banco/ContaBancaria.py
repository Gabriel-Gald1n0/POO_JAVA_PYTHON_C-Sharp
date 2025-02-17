from .Exceptions import ValorInvalidoException, SaldoInsuficienteException, ContaInexistenteException

class ContaBancaria:
    def __init__(self, cliente, num_conta, saldo=0):
        self.cliente = cliente
        self.num_conta = num_conta
        if saldo < 0:
            raise ValorInvalidoException("O saldo inicial não pode ser negativo.")
        self.saldo = saldo

    def depositar(self, valor):
        if valor <= 0:
            raise ValorInvalidoException("O valor do depósito deve ser positivo.")
        self.saldo += valor
        print(f"Depósito de R${valor} realizado com sucesso!")

    def sacar(self, valor):
        if valor <= 0:
            raise ValorInvalidoException("O valor do saque deve ser positivo.")
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para a operação.")
        self.saldo -= valor
        print(f"Saque de R${valor} realizado com sucesso!")

    def __str__(self):
        return f"Conta: {self.num_conta}, Cliente: {self.cliente}, Saldo: R${self.saldo:.2f}"

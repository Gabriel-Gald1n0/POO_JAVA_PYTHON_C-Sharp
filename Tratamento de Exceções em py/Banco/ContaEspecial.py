from .ContaBancaria import ContaBancaria
from .Exceptions import SaldoInsuficienteException, ValorInvalidoException

class ContaEspecial(ContaBancaria):
    def __init__(self, cliente, num_conta, saldo=0, limite=0):
        super().__init__(cliente, num_conta, saldo)
        self.limite = limite

    def sacar(self, valor):
        if valor <= 0:
            raise ValorInvalidoException("O valor do saque deve ser positivo.")
        if valor > (self.saldo + self.limite):
            raise SaldoInsuficienteException("Saldo e limite insuficientes para a operação.")
        self.saldo -= valor
        print(f"Saque de R${valor} realizado com sucesso (usando limite especial se necessário).")

    def __str__(self):
        return f"Conta Especial: {self.num_conta}, Cliente: {self.cliente}, Saldo: R${self.saldo:.2f}, Limite: R${self.limite:.2f}"

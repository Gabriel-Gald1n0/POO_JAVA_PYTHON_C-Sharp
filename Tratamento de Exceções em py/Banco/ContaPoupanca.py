from .ContaBancaria import ContaBancaria

class ContaPoupanca(ContaBancaria):
    def __init__(self, cliente, num_conta, saldo=0, taxa_juros=0.01):
        super().__init__(cliente, num_conta, saldo)
        self.taxa_juros = taxa_juros

    def render_juros(self):
        juros = self.saldo * self.taxa_juros
        self.saldo += juros
        print(f"Juros de R${juros:.2f} aplicados com sucesso!")

    def __str__(self):
        return f"Conta Poupança: {self.num_conta}, Cliente: {self.cliente}, Saldo: R${self.saldo:.2f}"

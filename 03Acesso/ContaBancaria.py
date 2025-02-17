class ContaBancaria:
    """
    Público (self.atributo) → acessível em qualquer lugar.
    Protegido (self._atributo) → uso interno (convencional).
    Privado (self.__atributo) → acessível apenas dentro da classe.
    """
    def __init__(self, titular, saldo):
        self.titular = titular  # Público
        self._saldo = saldo  # Protegido
        self.__senha = "1234"  # Privado

    def exibir_saldo(self):
        print(f"Saldo de {self.titular}: R$ {self._saldo}")
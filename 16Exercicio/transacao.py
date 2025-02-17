from dataclasses import dataclass
from categoria import Categoria

@dataclass
class Transacao:
    data: str
    tipo: str
    valor: float
    categoria: Categoria
    descricao: str
    pago: bool = False

    def __post_init__(self):
        self.data = self.data.replace('/', '-')

    def __str__(self):
        pago = 'pago' if self.pago else 'não pago'
        return f'{self.data} - {self.tipo} - R$ {self.valor} - {self.categoria} - {self.descricao} - {pago}'
    
    def __repr__(self):
        return str(self)
    
    def exibir(self):
        print(f"{self.data} - {self.tipo} - R$ {self.valor} - {self.categoria} - {self.descricao} - {'pago' if self.pago else 'não pago'}")

    @property
    def p_pago(self):
        return self.pago
    
    @p_pago.setter
    def p_pago(self, valor):
        self.pago = valor


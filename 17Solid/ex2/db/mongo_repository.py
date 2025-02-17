"""
MongoRepository é uma classe que implementa a interface IRepo.
"""
from .interface import IRepo

class MongoRepository(IRepo):
    
    def inserir(self, dado) -> None:
        print(f'Inserindo {dado} no MongoDB...')

    def remover(self, dado) -> None:
        print(f'Removendo {dado} do MongoDB...') 
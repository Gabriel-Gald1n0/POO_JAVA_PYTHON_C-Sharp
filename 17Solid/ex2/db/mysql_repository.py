"""
Módulo que implementa a classe MySqlRepositorio, que é uma implementação concreta da interface IRepo.

"""
from .interface import IRepo

class MySqlRepositorio(IRepo):

    def inserir(self, dado) -> None:
        print(f'Inserindo {dado} no MySQL...')

    def remover(self, dado) -> None:
        print(f'Removendo {dado} do MySQL...') 
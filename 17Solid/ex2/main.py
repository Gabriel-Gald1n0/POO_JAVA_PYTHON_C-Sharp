"""
    Exemplo de aplicação do princípio da inversão de dependência
    (DIP - Dependency Inversion Principle)
    Módulo principal

    Classes:
    User: classe que depende de uma interface IRepo para realizar operações de inserção e remoção de dados.
    IRepo: interface que define os métodos inserir e remover.
    MySqlRepositorio: classe que implementa a interface IRepo para realizar operações de inserção e remoção de dados em um banco de dados MySQL.
    MongoRepository: classe que implementa a interface IRepo para realizar operações de inserção e remoção de dados em um banco de dados MongoDB.

"""
from typing import Type
from db.interface import IRepo
from db.mysql_repository import MySqlRepositorio
from db.mongo_repository import MongoRepository

class User:
    def __init__(self, repo: Type[IRepo]) -> None:
        self.__repo = repo
    
    def inserir(self, dado: any) -> None:
        self.__repo.inserir(dado)
    
    def remover(self, dado: any) -> None:
        self.__repo.remover(dado)

u = User(MySqlRepositorio())
u.inserir('Gabriel')
u.remover('Gabriel')
u = User(MongoRepository())
u.inserir('Iale')
u.remover('Iale')

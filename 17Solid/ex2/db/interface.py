"""
Aqui definimos a interface que será implementada pelas classes de repositório. 
"""
from abc import ABC, abstractmethod

class IRepo(ABC):  # Interface
    @abstractmethod
    def inserir(self, dado) -> None:
        pass

    @abstractmethod
    def remover(self, dado) -> None:
        pass
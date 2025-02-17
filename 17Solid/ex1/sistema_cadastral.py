"""

O princípio da responsabilidade única é um dos cinco princípios do SOLID, que são um conjunto de regras para escrever código limpo e legível.
"""
class SistemaCadastral:
    def cadastrar(self, nome: str, idade: int) -> None:
        if self.__verificar_dados(nome, idade):
            self.__salvar(nome, idade)
        else:
            self.__indicar_erro()

    def __verificar_dados(self, nome: str, idade: int) -> bool:
        if not isinstance(nome, str) or not isinstance(idade, int):
            return False
        if not 0 < idade < 120:
            return False
        return True
    
    def __salvar(self, nome: str, idade: int) -> None:
        print('Acessando o banco de dados...')
        print(f"Cadastrando {nome} ({idade} anos)...")
        print('Cadastro realizado com sucesso!')
    
    def __indicar_erro(self) -> None:
        print('dados inválidos')

cadastro = SistemaCadastral()

cadastro.cadastrar('Maria', 25)
cadastro.cadastrar('João', 130)

from pessoa import Pessoa

def main():
    # usando metodo estático
    print(Pessoa.gera_id())

    # Criação de uma instância da classe Pessoa
    pessoa1 = Pessoa('Galds', 22)

    print(pessoa1.nome, pessoa1.idade)

    # Chamando os métodos    
    pessoa1.comer('maçã')
    pessoa1.parar_comer()
    pessoa1.falar('Python')
    # usa metodo estatico porem com a instancia pessoa1
    print(pessoa1.gera_id())

    print(pessoa1.get_ano_nascimento())

    # Método de classe
    pessoa2 = Pessoa.por_ano_nascimento('Maria', 1990)
    print(pessoa2)
    print(pessoa2.nome, pessoa2.idade)

    

if __name__ == '__main__':
    main()
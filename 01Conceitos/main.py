from pessoa import Pessoa

# Poderia usar sem o def main() e if __name__ == '__main__':, mas é uma boa prática.
# main() é o ponto de entrada do programa.

# Criação de uma instância da classe Pessoa
#pessoa1 = Pessoa('João', 30)
# Impressão da instância.
#print(pessoa1)

def main():
    # Criação de uma instância da classe Pessoa
    pessoa1 = Pessoa('João', 30)

    # Impressão da instância.
    print(pessoa1)

    # Verificação de maioridade
    if pessoa1.is_adulto():
        print('É maior de idade')
    else:
        print('Não é maior de idade')

    # Aniversário
    pessoa1.aniversario()
    print(pessoa1)


if __name__ == '__main__':
    main()
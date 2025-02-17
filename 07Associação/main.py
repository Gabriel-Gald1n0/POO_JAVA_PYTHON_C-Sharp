from classes import *
"""
Associação - Usa | Agregação - Tem | Composição - É dono | Herança - É

Associação é quando uma classe usa outra classe, mas sem que uma dependa da outra.
"""
def main():
    escritor = Escritor('Galds')
    caneta = Caneta('Bic')
    maquina = MaquinaDeEscrever()

    escritor.ferramenta = caneta
    escritor.ferramenta.escrever()

    escritor.ferramenta = maquina
    escritor.ferramenta.escrever()

if __name__ == '__main__':
    main()
    

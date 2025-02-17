# importa a biblioteca datetime
from datetime import datetime
from random import randint  

class Pessoa:
    # ano_atual pega o ano atual do sistema operacional
    ano_atual = int(datetime.strftime(datetime.now(), '%Y'))

    # Construtor
    def __init__(self, nome, idade, comendo = False, falando = False):
        self.nome = nome
        self.idade = idade
        self.comendo = comendo
        self.falando = falando
    
    # Métodos
    def __str__(self):
        return f'{self.nome} tem {self.idade} anos'
    
    def falar(self, assunto):
        if self.comendo:
            print(f'{self.nome} não pode falar comendo')
            return 
        if self.falando:
            print(f'{self.nome} já está falando')
            return
        print(f'{self.nome} está falando sobre {assunto}')
        return
    
    def comer(self, alimento):
        if self.comendo:
            print(f'{self.nome} já está comendo')
            return
        if self.falando:
            print(f'{self.nome} não pode comer falando')
            return
        self.comendo = True
        print(f'{self.nome} está comendo {alimento}')
        return
    # return f' serve para retornar um valor e encerrar a execução do método'
    
    # if not self.comendo -> Se não está comendo
    def parar_comer(self):
        if not self.comendo:
            print(f'{self.nome} não está comendo')
            return
        self.comendo = False
        print(f'{self.nome} parou de comer')
        return

    def get_ano_nascimento(self):
        return self.ano_atual - self.idade
    
    # Método de classe
    # serve para indicar que é um método de classe e não de instância, ou seja não precisa de self como parâmetro
    @classmethod 
    def por_ano_nascimento(cls, nome, ano_nascimento):
        idade = cls.ano_atual - ano_nascimento
        return cls(nome, idade)
    
    # Método estático
    # não precisa de self e cls como parâmetro
    """
        static é um modificador que permite que um método seja chamado sem a necessidade de instanciar um objeto
    """
    @staticmethod
    def gera_id():
        rand = randint(10000, 19999)
        return rand

    


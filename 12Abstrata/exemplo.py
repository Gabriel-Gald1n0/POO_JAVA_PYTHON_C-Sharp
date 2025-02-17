from abc import ABC, abstractmethod

class Animal(ABC):  # Classe abstrata
    def __init__(self, nome):
        self.nome = nome  # Atributo concreto
    
    @abstractmethod
    def fazer_som(self):  # Método abstrato
        pass  # Não tem implementação aqui

    def dormir(self):  # Método concreto (implementado)
        print(f"{self.nome} está dormindo...")

class Cachorro(Animal):  # Subclasse concreta
    def fazer_som(self):
        print(f"{self.nome} faz: Au au!")

class Gato(Animal):
    def fazer_som(self):
        print(f"{self.nome} faz: Miau!")

# Não podemos instanciar a classe Animal diretamente!
# animal = Animal("Genérico")  # ❌ Isso dará erro!

dog = Cachorro("Rex")
dog.fazer_som()  # ✅ Rex faz: Au au!
dog.dormir()  # ✅ Rex está dormindo...

cat = Gato("Mia")
cat.fazer_som()  # ✅ Mia faz: Miau!

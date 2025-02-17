using System;

namespace _02Metodos
{
    class Pessoa
    {
        // Atributos
        public string? Nome { get; set; }
        public int Idade { get; set; }

        // Construtor
        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        // Métodos
        public void Cumprimentar()
        {
            Console.WriteLine($"Olá, meu nome é {Nome} e tenho {Idade} anos.");
        }

        public void Andar()
        {
            Console.WriteLine($"{Nome} está andando.");
        }

        public void aniversario()
        {
            Idade++;
            Console.WriteLine($"Feliz aniversário! Agora {Nome} tem {Idade} anos.");
        }

        public void Comer(string comida)
        {
            Console.WriteLine($"{Nome} está comendo {comida}.");
        }
    }
}
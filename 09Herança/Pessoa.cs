using System;

namespace _09Herança
{
    class Pessoa
    {
        protected string Nome { get; set; }
        protected int Idade { get; set; }

        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        protected void Cumprimentar()
        {
            Console.WriteLine($"Olá, meu nome é {Nome} e tenho {Idade} anos.");
        }
    }
}
using System;

namespace _01Conceitos
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
    }
}
using System;

namespace _08This
{
    class Pessoa
    {
        /*
            this. -> é uma referência ao objeto que está sendo instanciado
        */
        public string Nome { get; set; }
        public int Idade { get; set; }

        public Pessoa(string nome, int idade)
        {
            this.Nome = nome;
            this.Idade = idade;
        }

        public Pessoa()
        {
            this.Nome = "Fulano";
            this.Idade = 0;
        }

        public void Cumprimentar()
        {
            Console.WriteLine("Olá, meu nome é " + this.Nome + " e tenho " + this.Idade + " anos.");
        }
    }
}
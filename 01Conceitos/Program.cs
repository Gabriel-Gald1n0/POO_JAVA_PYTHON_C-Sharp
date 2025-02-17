using System;

namespace _01Conceitos
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instanciando um objeto da classe Pessoa
            Pessoa pessoa = new Pessoa("Gabriel", 22);

            // Chamando o método Cumprimentar
            pessoa.Cumprimentar();
        }
    }
}


using System;

namespace _07Get_Set
{
    class Program
    {
        static void Main(string[] args)
        {
            Pessoa pessoa = new Pessoa();
            pessoa.Nome = "Gabriel";
            pessoa.Idade = 22;

            Console.WriteLine(pessoa.Nome);
        }
    }
}
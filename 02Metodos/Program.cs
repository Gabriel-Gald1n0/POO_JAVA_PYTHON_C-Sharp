using System;

namespace _02Metodos
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instanciando um objeto da classe Pessoa
            Pessoa pessoa = new Pessoa("Gabriel", 22);

            // Chamando o método Cumprimentar
            pessoa.Cumprimentar();

            // Chamando o método Andar
            pessoa.Andar();

            // Chamando o método aniversario
            pessoa.aniversario();

            // Chamando o método Comer
            pessoa.Comer("Pizza");
        }
    }
}
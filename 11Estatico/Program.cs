using System;

namespace _11Estatico
{
    class Program
    {
        static void Main(string[] args)
        {
            Exemplo.MetodoEstatico();
            Exemplo.soma(10, 30);
            Console.WriteLine(Exemplo.Nome);
            // static é um modificador que permite que um método seja chamado sem a necessidade de instanciar um objeto
            Exemplo exemplo = new Exemplo();
            exemplo.MetodoNaoEstatico();
            Exemplo.soma(10, 20);
        }
    }
}
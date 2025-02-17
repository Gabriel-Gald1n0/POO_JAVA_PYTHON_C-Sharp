using System;

namespace _10Polimorfismo
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Estagiário");
            Imposto Estagiario = new Estagiario();
            Estagiario.ValeRefeicao(1000);

            Console.WriteLine("Atendente");
            Imposto Atendente = new Atendente();
            Atendente.ValeRefeicao(1000);

            Console.WriteLine("Gerente");
            Imposto Gerente = new Gerente();
            Gerente.ValeRefeicao(1000);
        }
    }
}
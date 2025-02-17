using System;

namespace _10Polimorfismo
{
    class Estagiario : Imposto
    {
    
        public void Trabalhar(string Nome)
        {
            Console.WriteLine($"{Nome} está estagiando.");
        }

        public void ReceberSalario(string Nome, double Salario)
        {
            Console.WriteLine($"{Nome} recebeu a bolsa de estágio de R$ {Salario}.");
        }
    }
}
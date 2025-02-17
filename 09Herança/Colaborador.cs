using System;

namespace _09Herança
{
    class Colaborador : Pessoa
    {
        private string Cargo { get; set; }
        private double Salario { get; set; }

        public Colaborador(string nome, int idade, string cargo, double salario) : base(nome, idade) // base evita uso do this
        {
            Cargo = cargo;
            Salario = salario;
        }

        public void Trabalhar()
        {
            Console.WriteLine($"{Nome} está trabalhando.");
        }

        public void Apresentar()
        {
            Cumprimentar();
        }

        public void ReceberSalario()
        {
            Console.WriteLine($"{Nome} recebeu o salário de R$ {Salario}.");
        }

        public void Promover(string novoCargo, double novoSalario)
        {
            Cargo = novoCargo;
            Salario = novoSalario;
            Console.WriteLine($"{Nome} foi promovido para {Cargo} e passará a receber R$ {Salario}.");
        }
    }
}
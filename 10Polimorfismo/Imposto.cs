using System;

namespace _10Polimorfismo
{
    class Imposto
    {
        public double CalcularImposto(double salario)
        {
            return salario * 0.1;
        }

        // virtual -> permite a sobrescrita do método
        public virtual void ValeRefeicao(double salario)
        {
            Console.WriteLine($"Vale refeição de R$ {salario * 0.1}."); // 10% do salário
        }

        public void ValeTransporte(double salario)
        {
            Console.WriteLine($"Vale transporte de R$ {salario * 0.06}."); // 6% do salário
        }
    }
}
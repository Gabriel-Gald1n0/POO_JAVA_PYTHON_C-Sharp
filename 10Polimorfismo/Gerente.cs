using System;

namespace _10Polimorfismo
{
    class Gerente : Imposto // Herança
    {
       // override -> sobrescreve o método da classe pai
       public override void ValeRefeicao(double salario)
       {
            Console.WriteLine($"Vale refeição de R$ {salario * 0.15} para o Gerente."); // 15% do salário
       }
    }
}
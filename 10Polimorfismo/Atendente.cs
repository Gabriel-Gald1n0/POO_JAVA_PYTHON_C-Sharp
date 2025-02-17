using System;

namespace _10Polimorfismo
{
    class Atendente : Imposto
    {
        // override -> sobrescreve o método da classe pai
        public override void ValeRefeicao(double salario)
        {
            Console.WriteLine($"Vale refeição de R$ {salario * 0.12} para o Atendente."); // 15% do salário
        }
    }
}
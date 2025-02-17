using System;

namespace _12Abstração
{
    class PessoaJuridica : Padrao
    {
        // obrigatoriamente implementar o método da classe pai
        public override void TaxaEmprestimo(double valor)
        {
            Console.WriteLine($"Taxa de empréstimo de 15% para pessoa jurídica: R$ {valor * 0.15}");
        }
    }
}
using System;

namespace _12Abstração
{
    class Program
    {
        static void Main(string[] args)
        {
            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoaFisica.TaxaEmprestimo(1000);

            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            pessoaJuridica.TaxaEmprestimo(1000);
        }
    }
}
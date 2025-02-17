using System;

class PessoaFisica : Padrao
{
    // Obrigatório
    // Implementação do método abstrato, em que sobscrevemos o método da classe pai
    public override void TaxaEmprestimo(double valor)
    {
        Console.WriteLine($"Taxa de empréstimo de 10% para pessoa física: R$ {valor * 0.10}");
    }
}
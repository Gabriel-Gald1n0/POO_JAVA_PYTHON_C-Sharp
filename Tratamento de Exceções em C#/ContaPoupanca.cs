using System;

// Classe ContaPoupanca herdando de ContaBancaria
public class ContaPoupanca : ContaBancaria
{
    public double TaxaJuros { get; set; }

    public ContaPoupanca(string cliente, int numConta, double saldoInicial, double taxaJuros)
        : base(cliente, numConta, saldoInicial)
    {
        if (taxaJuros < 0)
        {
            throw new ValorInvalidoException("A taxa de juros não pode ser negativa.");
        }
        TaxaJuros = taxaJuros;
    }

    public void RenderJuros()
    {
        Saldo += Saldo * TaxaJuros;
    }
}
using System;
// Classe ContaEspecial herdando de ContaBancaria
public class ContaEspecial : ContaBancaria
{
    public double Limite { get; set; }

    public ContaEspecial(string cliente, int numConta, double saldoInicial, double limite)
        : base(cliente, numConta, saldoInicial)
    {
        Limite = limite;
    }

    public override void Sacar(double valor)
    {
        if (valor <= 0)
        {
            throw new ValorInvalidoException("O valor para saque deve ser maior que zero.");
        }
        if (Saldo + Limite < valor)
        {
            throw new SaldoInsuficienteException("Saldo insuficiente, mesmo considerando o limite.");
        }
        Saldo -= valor;
    }
}
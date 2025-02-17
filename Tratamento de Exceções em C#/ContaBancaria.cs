using System;

public class ContaBancaria
{
    public string Cliente { get; set; }
    public int NumConta { get; set; }
    public double Saldo { get; protected set; }

    public ContaBancaria(string cliente, int numConta, double saldoInicial)
    {
        Cliente = cliente;
        NumConta = numConta;
        if (saldoInicial < 0)
        {
            throw new ValorInvalidoException("O saldo inicial não pode ser negativo.");
        }
        Saldo = saldoInicial;
    }

    public virtual void Sacar(double valor)
    {
        if (valor <= 0)
        {
            throw new ValorInvalidoException("O valor para saque deve ser maior que zero.");
        }
        if (Saldo < valor)
        {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        Saldo -= valor;
    }

    public virtual void Depositar(double valor)
    {
        if (valor <= 0)
        {
            throw new ValorInvalidoException("O valor para depósito deve ser maior que zero.");
        }
        Saldo += valor;
    }
}
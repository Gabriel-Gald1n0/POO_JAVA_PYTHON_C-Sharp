using System;
using System.Collections.Generic;

// Programa principal
public class Program
{
    public static ContaBancaria EncontrarContaPorNumero(List<ContaBancaria> contas, int numeroConta)
    {
        foreach (var conta in contas)
        {
            if (conta.NumConta == numeroConta)
            {
                return conta;
            }
        }
        throw new ContaInexistenteException($"Conta com número {numeroConta} não encontrada.");
    }

    public static void Main(string[] args)
    {
        List<ContaBancaria> contasCliente = new List<ContaBancaria>();

        // Criando contas
        ContaPoupanca poupanca = new ContaPoupanca("Maria José", 12345, 2000.0, 0.015);
        ContaEspecial especial = new ContaEspecial("Maria José", 67890, 1000.0, 500.0);

        contasCliente.Add(poupanca);
        contasCliente.Add(especial);

        // Testando operações
        try
        {
            poupanca.Sacar(500.0); // Sucesso
            especial.Sacar(1200.0); // Sucesso
            poupanca.Depositar(-300.0); // Falha: Valor inválido
        }
        catch (SaldoInsuficienteException e)
        {
            Console.WriteLine($"Erro na operação bancária: {e.Message}");
        }
        catch (ValorInvalidoException e)
        {
            Console.WriteLine($"Erro na operação bancária: {e.Message}");
        }
        catch (Exception e)
        {
            Console.WriteLine($"Erro inesperado: {e.Message}");
        }

        // Calculando rendimento
        try
        {
            poupanca.RenderJuros();
        }
        catch (ValorInvalidoException e)
        {
            Console.WriteLine($"Erro ao calcular rendimento: {e.Message}");
        }

        // Testando se a conta existe
        try
        {
            ContaBancaria conta = EncontrarContaPorNumero(contasCliente, 12345); // Conta existente
            Console.WriteLine($"Conta encontrada: {conta.Cliente}");

            conta = EncontrarContaPorNumero(contasCliente, 99999); // Conta inexistente
            Console.WriteLine($"Conta encontrada: {conta.Cliente}");
        }
        catch (ContaInexistenteException e)
        {
            Console.WriteLine($"Erro: {e.Message}");
        }

        // Exibindo dados das contas
        foreach (var conta in contasCliente)
        {
            Console.WriteLine("-------------------------------");
            Console.WriteLine($"Cliente: {conta.Cliente}");
            Console.WriteLine($"Número da Conta: {conta.NumConta}");
            Console.WriteLine($"Saldo Atual: R${conta.Saldo:F2}");
            if (conta is ContaPoupanca)
            {
                Console.WriteLine("Tipo de conta: Conta Poupança");
            }
            else if (conta is ContaEspecial)
            {
                Console.WriteLine("Tipo de conta: Conta Especial");
            }
        }
    }
}
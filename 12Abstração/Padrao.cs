using System;

abstract class Padrao
{
    //Metodo abstrato não tem corpo, é obrigatório ser implementado na classe filha
    // abstract -> obriga a classe filha a implementar o método

    // Obrigatorio
    public abstract void TaxaEmprestimo(double valor); 

    // Opicional
    public void calculoPoupanca(double valor, double taxa)
    {
        Console.WriteLine($"Rendimento da poupança: R$ {valor * taxa}.");
    }
}
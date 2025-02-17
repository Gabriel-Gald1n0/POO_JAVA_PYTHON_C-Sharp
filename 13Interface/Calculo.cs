using System;

class Calculo : IPadrao
{
    public void somar(int n1, int n2)
    {
        Console.WriteLine("A soma dos números é: " + (n1 + n2));
    }

    public void subtrair(int n1, int n2)
    {
        Console.WriteLine("A subtração dos números é: " + (n1 - n2));
    }
}
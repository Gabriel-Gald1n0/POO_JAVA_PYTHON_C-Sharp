using System;

class Aluno
{
    /*
        Encapsulamento é o conceito de proteger os atributos de uma classe, Restringindo o acesso direto a eles.
    */

    // Atributos
    private double nota1;
    private double nota2;

    private double media()
    {
        return (Nota1 + Nota2) / 2;
    }

    // Propriedades
    public double Nota1
    {
        get { return nota1; }
        set
        {
            if (value >= 0 && value <= 10)
            {
                nota1 = value;
            }
        }
    }

    public double Nota2
    {
        get { return nota2; }
        set
        {
            if (value >= 0 && value <= 10)
            {
                nota2 = value;
            }
        }
    }

    // Métodos
    public void MostrarNotas()
    {
        Console.WriteLine($"Nota 1: {Nota1}");
        Console.WriteLine($"Nota 2: {Nota2}");
    }

    public void MostrarSituacao()
    {
        double media = (Nota1 + Nota2) / 2;

        if (media >= 7)
        {
            Console.WriteLine("Aprovado");
        }
        else if (media >= 4)
        {
            Console.WriteLine("Recuperação");
        }
        else
        {
            Console.WriteLine("Reprovado");
        }
    }

    public void mensagem()
    {
        Console.WriteLine("Informe a nota 1:");
        Nota1 = double.Parse(Console.ReadLine());
        Console.WriteLine("Informe a nota 2:");
        Nota2 = double.Parse(Console.ReadLine());

        MostrarNotas();
        MostrarSituacao();
    }
}
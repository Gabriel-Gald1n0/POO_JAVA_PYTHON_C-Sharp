using System;

class Pessoa
{
    private string nome;
    private int idade;

    // Get e Set -> Propriedades são métodos especiais que permitem a leitura e escrita de atributos privados. Eles são sempre publicos.
    public string Nome
    {
        get { return nome; }
        set { nome = value; }
    }

    public int Idade
    {
        get { return idade; }
        set { idade = value; }
    }

    public void Cumprimentar()
    {
        Console.WriteLine("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
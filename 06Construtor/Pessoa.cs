using System;

namespace _06Construtor
{
    class Pessoa
    {
        /*
            Construtor é um método especial que é chamado quando um objeto é instanciado.
            Ele é responsável por inicializar os atributos do objeto.
            O construtor é um método sem retorno e o nome dele deve ser o mesmo nome da classe.
            O construtor pode ter parâmetros ou não.
            Se não for definido um construtor, o C# cria um construtor padrão sem parâmetros.
        */
        // Atributos
        public string? Nome { get; set; }
        public int Idade { get; set; }

        // Construtor
        public Pessoa(string nome, int idade)
        {
            Nome = nome;
            Idade = idade;
        }

        public Pessoa()
        {
            Nome = "Fulano";
            Idade = 0;
        }

        public Pessoa(string nome)
        {
            Nome = nome;
            Idade = 0;
        }

        // Métodos
        public void Cumprimentar()
        {
            Console.WriteLine($"Olá, meu nome é {Nome} e tenho {Idade} anos.");
        }
    }
}
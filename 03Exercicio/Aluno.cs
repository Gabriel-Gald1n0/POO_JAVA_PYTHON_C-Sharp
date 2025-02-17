using System;

namespace _03Exercicio
{
    class Aluno
    {
        // Atributos
        public string Nome { get; set; }
        public string Curso { get; set; }

        public double Nota1 { get; set; }

        public double Nota2 { get; set; }
        
        // Construtor
        public Aluno()
        {
            Nome = "Gabriel";
            Curso = "CIC";
            Nota1 = 0;
            Nota2 = 0;
        }

        public Aluno(string nome, string curso, double nota1, double nota2)
        {
            Nome = nome;
            Curso = curso;
            Nota1 = nota1;
            Nota2 = nota2;
        }

        // Métodos
        public void MostrarNotas()
        {
            Console.WriteLine($"Notas de {Nome}: {Nota1} e {Nota2}");
        }

        public double CalcularMedia()
        {
            return (Nota1 + Nota2) / 2;
        }

        public string situacao(double media)
        {
            return media >= 7 ? "Aprovado" : "Reprovado";
        }

        public void MostrarSituacao()
        {
            double media = CalcularMedia();
            Console.WriteLine($"Situação de {Nome}: {situacao(media)} com média {CalcularMedia()}");
        }
        
    }
}
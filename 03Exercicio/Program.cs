using System;

namespace _03Exercicio
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instanciando um objeto da classe Aluno
            Aluno aluno = new Aluno();

            aluno.Nota1 = 8;
            aluno.Nota2 = 7;

            // Chamando o método MostrarNotas
            aluno.MostrarNotas();

            // Chamando o método MostrarSituacao
            aluno.MostrarSituacao();
        }
    }
}
using System;

namespace _09Herança
{
    class Program
    {
        static void Main(string[] args)
        {
            Colaborador colaborador = new Colaborador("Gabriel", 22, "Desenvolvedor", 2000);

            colaborador.Apresentar();

            colaborador.Trabalhar();

            colaborador.Promover("Analista", 3000);
        }
    }
}

using System; 

namespace _11Estatico
{
    class Exemplo
    {
        public static string Nome = "Galds";

        // static é um modificador que permite que um método seja chamado sem a necessidade de instanciar um objeto
        
        public static void MetodoEstatico()
        {
            Console.WriteLine("Método estático.");
        }

        public void MetodoNaoEstatico()
        {
            Console.WriteLine("Método não estático.");
        }

        public static void soma(int a, int b)
        {
            Console.WriteLine("Soma: " + a + " + " + b + " = "+ (a + b));
        }
    }
} 
using System;

namespace _04Acesso
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instanciando um objeto da classe Produto
            Produto produto = new Produto("TV", 500.00, 10);

            produto.Nome = "TV 4K";
            
            // Chamando o método ToString
            Console.WriteLine(produto);

            // Chamando o método AdicionarProdutos
            produto.AdicionarProdutos(5);

            // Chamando o método ToString
            Console.WriteLine(produto);

            // Chamando o método RemoverProdutos
            produto.RemoverProdutos(3);

            // Chamando o método ToString
            Console.WriteLine(produto);
        }
    }
}

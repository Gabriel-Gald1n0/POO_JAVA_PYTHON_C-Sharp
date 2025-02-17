using System;

namespace _04Acesso
{
    class Produto
    {
        /*
            public -> Atributos e métodos podem ser acessados de qualquer classe.
            private -> Atributos e métodos só podem ser acessados dentro da própria classe.
            protected -> Atributos e métodos só podem ser acessados dentro da própria classe e nas classes derivadas.
            
            internal -> Atributos e métodos só podem ser acessados dentro do mesmo assembly.
            protected internal -> Atributos e métodos podem ser acessados dentro do mesmo assembly e nas classes derivadas.

            private protected -> Atributos e métodos só podem ser acessados dentro do mesmo assembly e nas classes derivadas.

            protected internal -> Atributos e métodos só podem ser acessados dentro do mesmo assembly e nas classes derivadas.

            assembly é um arquivo .dll ou .exe.
        */

        // Atributos
        public string Nome { get; set; }
        private double Preco { get; set; }
        public int Quantidade { get; set; }

        // Construtores
        public Produto(string nome, double preco, int quantidade)
        {
            Nome = nome;
            Preco = preco;
            Quantidade = quantidade;
        }

        // Métodos
        public double ValorTotalEmEstoque()
        {
            return Preco * Quantidade;
        }

        public void AdicionarProdutos(int quantidade)
        {
            Quantidade += quantidade;
        }

        public void RemoverProdutos(int quantidade)
        {
            Quantidade -= quantidade;
        }

        public override string ToString()
        {
            return $"{Nome}, R$ {Preco:F2}, {Quantidade} unidades, Total: R$ {ValorTotalEmEstoque():F2}";
        }
    }
}
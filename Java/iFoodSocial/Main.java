import Pacote.Categoria;
import Pacote.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        @SuppressWarnings("Convert2Diamond")
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        @SuppressWarnings("Convert2Diamond")
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        int opcao;
        int CodigoCategoria = 0;
        do { 
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1. Adicionar Categoria");
            System.out.println("2. Adicionar Produto");
            System.out.println("3. Listar Cardápio");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();
            
            switch (opcao) {
                case 1 -> {
                    CodigoCategoria++;
                    System.out.print("Digite a descrição da categoria: ");
                    String descricaoCategoria = input.nextLine();
                    
                    Categoria categoria = new Categoria(CodigoCategoria, descricaoCategoria);
                    categorias.add(categoria);
                    System.err.println("Categoria adicionada com sucesso.");
                }
                case 2 -> {
                    if (categorias.isEmpty()) {
                        System.out.println("Nenhuma categoria cadastrada. Adicione uma categoria primeiro.");
                    } else {
                        System.out.println("Categorias disponíveis: ");
                        for (Categoria c : categorias) {
                            System.out.println(c.getCodigo() + " - " + c.getDescricao());
                        }

                        System.out.println("Escolha uma categoria para o produto(numeros): ");
                        int indiceCategoria = input.nextInt() - 1;
                        input.nextLine();

                        if (indiceCategoria < 0 || indiceCategoria >= categorias.size()) {
                            System.out.println("Categoria inválida.");
                            break;
                        } else {
                            Categoria categoriaProduto = categorias.get(indiceCategoria);

                            System.out.print("Digite o código do produto: ");
                            int codigoProduto = input.nextInt();
                            input.nextLine();

                            int valid = 0;
                            for(Produto i: produtos){
                                if(codigoProduto == i.getCodigo()){
                                    System.out.println("Produto Ja possui este codigo cadastrado");
                                    valid = 1;
                                    break;
                                }
                            }

                            if(valid == 1) break;

                            System.out.print("Digite a descrição do produto: ");
                            String descricaoProduto = input.nextLine();
                            System.out.print("Digite o valor do produto: ");
                            double valorProduto = input.nextDouble();
                            input.nextLine();
                            Produto produto = new Produto(codigoProduto, descricaoProduto, valorProduto, categoriaProduto);
                            produtos.add(produto);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Cardápio: ");
                    for (Produto p : produtos) {
                        System.out.println("Código: " + p.getCodigo() + " - Descrição: " + p.getDescricao() + " - Valor: " + p.getValor() + " - Categoria: " + p.getCategoria().getDescricao());
                    }
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }


        } while (opcao != 4);

        input.close();
        
    }
}

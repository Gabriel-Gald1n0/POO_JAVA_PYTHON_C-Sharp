import Entregas.Entrega;
import Entregas.EntregaCarro;
import Entregas.EntregaDrone;
import Entregas.EntregaPe;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrega entrega = null;
        
        System.out.print("Digite o nome do entregador: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha o tipo de entrega:");
        System.out.println("1. Carro");
        System.out.println("2. Drone");
        System.out.println("3. A Pé");
        int tipoEntrega = scanner.nextInt();

        switch (tipoEntrega) {
            case 1:
                System.out.print("Digite a posição inicial X: ");
                int xCarro = scanner.nextInt();
                System.out.print("Digite a posição inicial Y: ");
                int yCarro = scanner.nextInt();
                System.out.print("Digite o consumo médio (litros por quadra): ");
                double consumoMedio = scanner.nextDouble();
                entrega = new EntregaCarro(nome, xCarro, yCarro, consumoMedio);
                break;
            case 2:
                System.out.print("Digite a posição inicial X: ");
                int xDrone = scanner.nextInt();
                System.out.print("Digite a posição inicial Y: ");
                int yDrone = scanner.nextInt();
                entrega = new EntregaDrone(nome, xDrone, yDrone);
                break;
            case 3:
                System.out.print("Digite a posição inicial X: ");
                int xPe = scanner.nextInt();
                System.out.print("Digite a posição inicial Y: ");
                int yPe = scanner.nextInt();
                entrega = new EntregaPe(nome, xPe, yPe);
                break;
            default:
                System.out.println("Tipo de entrega inválido!");
                scanner.close();
                return; // Encerra o programa se o tipo for inválido
        }

        entrega.inicializarEntrega();
        System.out.print("Digite a coordenada X do destino: ");
        int destinoX = scanner.nextInt();
        System.out.print("Digite a coordenada Y do destino: ");
        int destinoY = scanner.nextInt();
        entrega.setDestino(destinoX, destinoY);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mover Norte");
            System.out.println("2. Mover Sul");
            System.out.println("3. Mover Leste");
            System.out.println("4. Mover Oeste");
            System.out.println("5. Visualizar Caminho");
            if (entrega instanceof EntregaCarro) {
                System.out.println("6. Calcular Consumo de Gasolina");
            }
            System.out.println("7. Visualizar Mapa");
            if (entrega instanceof EntregaDrone) {
                System.out.println("8. Mover Direto para o Destino"); // Nova opção
            }
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Quantas quadras para mover ao norte? ");
                    entrega.moverNorte(scanner.nextInt());
                }
                case 2 -> {
                    System.out.print("Quantas quadras para mover ao sul? ");
                    entrega.moverSul(scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Quantas quadras para mover a leste? ");
                    entrega.moverLeste(scanner.nextInt());
                }
                case 4 -> {
                    System.out.print("Quantas quadras para mover a oeste? ");
                    entrega.moverOeste(scanner.nextInt());
                }
                case 5 -> entrega.printCaminho();
                case 6 -> {
                    if (entrega instanceof EntregaCarro) {
                        double consumo = ((EntregaCarro) entrega).calcularConsumo();
                        System.out.println("Consumo total de gasolina: " + String.format("%.2f", consumo) + " litros");
                    } else {
                        System.out.println("Esta entrega não é feita de carro.");
                    }
                }
                case 7 -> entrega.printMapa(8); // Tamanho do mapa
                case 8 -> {
                    if (entrega instanceof EntregaDrone) {
                        ((EntregaDrone) entrega).mover(destinoX,destinoY);
                    } else {
                        System.out.println("Esta entrega não é feita por drone.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

            if (entrega.verificaDestino()) {
                System.out.println("Pedido entregue por " + entrega.getNome() + " em (" + destinoX + ", " + destinoY + ")!");
                entrega.printMapa(8);
                if (entrega instanceof EntregaCarro) {
                    double consumo = ((EntregaCarro) entrega).calcularConsumo();
                    System.out.println("Consumo total de gasolina: " + String.format("%.2f", consumo) + " litros");
                } 
                break; // Sai do loop se chegou ao destino
            }
        } while (opcao != 0);

        scanner.close();
    }
}

package Entregas;

import java.util.ArrayList;
import java.util.List;

public class Entrega {
    private String nome;
    private int x;
    private int y;
    private int destinoX; 
    private int destinoY;
    private List<String> caminho;

    public Entrega(){
        this.nome = "";
        this.x = 0;
        this.y = 0;
        this.destinoX = 1;
        this.destinoY = 1;
        this.caminho = new ArrayList<>();
    }

    public Entrega(String nome, int x, int y, int destinoX, int destinoY){
        this.nome = nome;
        if(x >= 0 && y >= 0 && destinoX >= 0 && destinoY >= 0){
            this.x = x;
            this.y = y;
            this.destinoX = destinoX;
            this.destinoY = destinoY;
        } else {
            throw new IllegalArgumentException("Coordenadas não podem assumir um valor negativo");
        }
        this.caminho = new ArrayList<>();
    }

    public void inicializarEntrega() {
        registrarCaminho(); 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setX(int x){
        if (x >= 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Coordenada X não pode assumir um valor negativo");
        }
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        if (y >= 0) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordenada Y não pode assumir um valor negativo");
        }
    }

    public int getY(){
        return this.y;
    }

    public void setDestino(int destinoX, int destinoY) {
        if (destinoX >= 0 && destinoY >= 0) {
            this.destinoX = destinoX;
            this.destinoY = destinoY;
        } else {
            throw new IllegalArgumentException("As coordenadas de destino não podem ser negativas.");
        }
    }

    public int getDestinoX() {
        return this.destinoX;
    }
    
    public int getDestinoY() {
        return this.destinoY;
    }


    public boolean verificaDestino() {
        return this.x == destinoX && this.y == destinoY;
    }

    public void moverNorte(int y){
        if (this.y - y > 0) {
            this.y -= y; // Move para o norte (diminuindo o valor de y)
            registrarCaminho();
        } else {
            System.out.println("Movimento inválido. Fora dos limites.");
        }
    }

    public void moverSul(int y){
        if (this.y + y <= 8) {
            this.y += y; // Move para o sul
            registrarCaminho();
        } else {
            System.out.println("Movimento inválido. O entregador não pode sair do mapa para o sul.");
        }
    }

    public void moverLeste(int x){
        if (this.x + x <= 8) {
            this.x += x; // Move para o leste
            registrarCaminho();
        } else {
            System.out.println("Movimento inválido. O entregador não pode sair do mapa para o leste.");
        }
    }

    public void moverOeste(int x){
        if (this.x - x > 0) {
            this.x -= x; // Move para o oeste (diminuindo o valor de x)
            registrarCaminho();
        } else {
            System.out.println("Movimento inválido. Fora dos limites.");
        }
    }

    public void registrarCaminho(){
        this.caminho.add("X: " + this.x + " Y: " + this.y);
    }

    public void printCaminho(){
        System.out.println("Caminho percorrido: " + caminho);
    }

    public double calcularDistancia() {
        double distanciaTotal = 0;
        int[] ultimoPonto = {this.getX(), this.getY()}; // Inicializa com as coordenadas atuais do entregador
    
        for (String movimento : caminho) {
            String[] partes = movimento.replace("X: ", "").replace("Y: ", "").split(" ");
            int xAtual = Integer.parseInt(partes[0]); // Corrigido para pegar o X
            int yAtual = Integer.parseInt(partes[1]); // Corrigido para pegar o Y
    
            // Calcula a distância entre o último ponto e o ponto atual
            distanciaTotal += Math.sqrt(Math.pow(xAtual - ultimoPonto[0], 2) + Math.pow(yAtual - ultimoPonto[1], 2));
    
            // Atualiza o último ponto para o atual
            ultimoPonto[0] = xAtual;
            ultimoPonto[1] = yAtual;
        }
    
        return distanciaTotal;
    }

    public void printMapa(int tamanho) {
        // Imprime o cabeçalho de colunas
        System.out.print("   "); 
        for (int j = 1; j <= tamanho; j++) {
            System.out.printf(" %d ", j); 
        }
        System.out.println(); 
    
        // Imprime as linhas do mapa
        for (int i = 1; i <= tamanho; i++) {
            System.out.printf(" %d ", i); 
            for (int j = 1; j <= tamanho; j++) {
                if (j == this.destinoX && i == this.destinoY) {
                    System.out.print(" D ");
                } else if (caminho.contains("X: " + j + " Y: " + i)) {
                    if (j == this.x && i == this.y) {
                        System.out.print(" E ");
                    } else {
                        System.out.print(" X "); 
                    }
                } else {
                    System.out.print(" . "); 
                }
            }
            System.out.println(); 
        }
    }
}

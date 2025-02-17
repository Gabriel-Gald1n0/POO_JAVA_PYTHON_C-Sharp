import Pacote.Ponto2D;
import Pacote.Ponto3D;
import Pacote.Vertice;
public class Main {
    public static void main(String[] args) {
        // Triângulo: três vértices no plano 2D
        Vertice triangulo = new Vertice();
        Ponto2D v1 = new Ponto2D(0, 0);
        Ponto2D v2 = new Ponto2D(3, 0);
        Ponto2D v3 = new Ponto2D(1.5, 2.6);

        triangulo.addVertice(v1);
        triangulo.addVertice(v2);
        triangulo.addVertice(v3);

        System.out.println("Triângulo original:");
        System.out.println(triangulo);

        // Alterando os pontos do triângulo
        v1.movePara(1, 1);  
        v2.movePara(4, 1);  
        v3.movePara(2.5, 3.6);  

        System.out.println("\nTriângulo após alterar os pontos:");
        System.out.println(triangulo);

        // Retângulo: quatro vértices no plano 2D
        Vertice retangulo = new Vertice();
        retangulo.addVertice(new Ponto2D(0, 0));
        retangulo.addVertice(new Ponto2D(4, 0));
        retangulo.addVertice(new Ponto2D(4, 2));
        retangulo.addVertice(new Ponto2D(0, 2));
        System.out.println("\nRetângulo:");
        System.out.println(retangulo);

        // Cubo: oito vértices no espaço 3D
        Ponto3D Cv1 = new Ponto3D(0, 0, 0);
        Ponto3D Cv2 = new Ponto3D(1, 0, 0);
        Ponto3D Cv3 = new Ponto3D(1, 1, 0);
        Ponto3D Cv4 = new Ponto3D(0, 1, 0);
        Ponto3D Cv5 = new Ponto3D(0, 0, 1);
        Ponto3D Cv6 = new Ponto3D(1, 0, 1);
        Ponto3D Cv7 = new Ponto3D(1, 1, 1);
        Ponto3D Cv8 = new Ponto3D(0, 1, 1);
        
        Vertice Cubo = new Vertice();
        Cubo.addVertice(Cv1);
        Cubo.addVertice(Cv2);
        Cubo.addVertice(Cv3);
        Cubo.addVertice(Cv4);
        Cubo.addVertice(Cv5);
        Cubo.addVertice(Cv6);
        Cubo.addVertice(Cv7);
        Cubo.addVertice(Cv8);
        System.out.println("\ncubo original:");
        System.out.println(Cubo);

        // Movendo os vértices do cubo
        Cv1.movePara(1, 1, 1); 
        Cv2.movePara(2, 1, 1);
        Cv3.movePara(2, 2, 1);
        Cv4.movePara(1, 2, 1);
        Cv5.movePara(1, 1, 2);
        System.out.println("\nCubo após mover alguns vértices: ");
        System.out.println(Cubo);
    }
}

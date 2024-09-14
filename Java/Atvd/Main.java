import PacotePoint.Circunferencia;
import PacotePoint.Ponto2D;
import PacotePoint.Retangulo;

public class Main {
    public static void main(String[] args) {
        

        // System.out.println("Ponto 1: x = " + ponto1.getX() + ", y = " + ponto1.getY());
        // System.out.println("Ponto 2: x = " + ponto2.getX() + ", y = " + ponto2.getY());
        // System.out.println("Ponto 3: x = " + ponto3.getX() + ", y = " + ponto3.getY());

        // ponto1.moveto(1.0, 2.0); 
        // System.out.println(ponto1);
        // ponto2.distanceTo(ponto3);
        // System.out.println(ponto2);
        // ponto3.toString();
        // System.out.println(ponto3);
        // ponto3.espelhar(2);
        // System.out.println(ponto3); 


        // System.out.println("Ponto 1: x = " + ponto1.getX() + ", y = " + ponto1.getY());
        // System.out.println("Ponto 2: x = " + ponto2.getX() + ", y = " + ponto2.getY());
        // System.out.println("Ponto 3: x = " + ponto3.getX() + ", y = " + ponto3.getY());

        Ponto2D p = new Ponto2D(5, 0);
        System.out.println("Ponto: " + p);  // Esperado: (8.0, 6.0)
        System.out.println("Raio: " + p.getRaio());  // Esperado: Raio recalculado
        System.out.println("Ângulo: " + p.getAngulo());

        p.moveto(8, 6);
        System.out.println("Ponto movido: " + p);  // Esperado: (8.0, 6.0)
        System.out.println("Raio: " + p.getRaio());  // Esperado: Raio recalculado
        System.out.println("Ângulo: " + p.getAngulo());

        Ponto2D pontoPolar = new Ponto2D(5, Math.toRadians(30), true);  
    
        System.out.println("Coordenadas cartesianas (x, y): (" + pontoPolar.getX() + ", " + pontoPolar.getY() + ")");

       // Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(0, 10);
        Ponto2D ponto3 = new Ponto2D(3.0, 8.0); 

        ponto3.espelhar(0);
        System.out.println("Espelhado no eixo Y: " + ponto3);

        Retangulo retangulo1 = new Retangulo(ponto2, 5, 10);
        Retangulo retangulo2 = new Retangulo(ponto3, 4,6);
        Retangulo retangulo3 = new Retangulo(retangulo1);

        System.out.println(retangulo1);
        System.out.println(retangulo2);
        System.out.println(retangulo3);

        System.out.println("Area = " + retangulo1.area());
        System.out.println("Perimetro = " + retangulo1.perimetro());
        System.out.println("Intersecao = " + retangulo1.intersecao(retangulo2));
        System.out.println("Diferenca = " + retangulo1.diferenca(retangulo2));
        System.out.println("Esta dentro = " + retangulo2.estaDentroDe(retangulo1));

        System.out.println("TESTE DA CIRCUNFERENCIA");
        Ponto2D ponto1 = new Ponto2D(1, 2);
        Ponto2D ponto5 = new Ponto2D(4, 6);

        // Criação de circunferências
        Circunferencia circ1 = new Circunferencia(ponto1, 5); 
        Circunferencia circ2 = new Circunferencia(ponto5, 3); 

        
        Circunferencia circ3 = new Circunferencia(ponto1, ponto5); 
        System.out.println(circ1);
        System.out.println(circ2);
        System.out.println(circ3);

        // Calculando e exibindo a área e o perímetro de circ1
        System.out.println("Área da circ1: " + circ1.area());
        System.out.println("Perímetro da circ1: " + circ1.perimetro());

        // Calculando e exibindo a interseção entre circ1 e circ2
        double areaIntersecao = circ1.intersecao(circ2);
        System.out.println("Área de interseção entre circ1 e circ2: " + areaIntersecao);

        // Calculando e exibindo a diferença entre circ1 e circ2
        double areaDiferenca = circ1.diferenca(circ2);
        System.out.println("Área de diferença entre circ1 e circ2: " + areaDiferenca);

        // Verificando se circ2 está dentro de circ1
        boolean estaDentro = circ2.estaDentroDe(circ1);
        System.out.println("Circunferencia circ2 está dentro de circ1? " + estaDentro);
    
    }
}
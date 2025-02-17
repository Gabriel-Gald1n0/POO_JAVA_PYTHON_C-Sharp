package PacotePoint;

public class Circunferencia {
    private double x;
    private double y;
    private double raio;
    
    public Circunferencia(Circunferencia outroCirculo){
        this.x = outroCirculo.x;
        this.y = outroCirculo.y;
        this.raio = outroCirculo.raio;
    }

    public Circunferencia(Ponto2D p1, double raio){
        this.x = p1.getX();
        this.y = p1.getY();
        this.raio = raio;
    }

    public Circunferencia(Ponto2D p1, Ponto2D p2){
        this.x = p1.getX();
        this.y = p1.getY();
        this.raio = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRaio(){
        return raio;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI * Math.pow(raio,2);
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public double intersecao(Circunferencia outroCirculo){
        double distancia = Math.sqrt(Math.pow(outroCirculo.getX() - x, 2) + Math.pow(outroCirculo.getY() - y,2));
        if (distancia < raio + outroCirculo.getRaio()) {
            //fórmula de Brahmagupta
            double d = Math.sqrt(Math.pow(outroCirculo.getX() - x, 2) + Math.pow(outroCirculo.getY() - y,2));
            double r1 = this.raio;
            double r2 = outroCirculo.getRaio();
            double part1 = r1 * r1 * Math.acos((d * d + r1 * r1 - r2 * r2) / (2 * d * r1));
            double part2 = r2 * r2 * Math.acos((d * d + r2 * r2 - r1 * r1) / (2 * d * r2));
            double part3 = 0.5 * Math.sqrt((-d + r1 + r2) * (d + r1 - r2) * (d - r1 + r2) * (d + r1 + r2));
            double area = part1 + part2 - part3;
            return area;
        }
        return 0;
    }

    public double diferenca(Circunferencia outroCirculo){
        double distancia = Math.sqrt(Math.pow(outroCirculo.getX() - x, 2) + Math.pow(outroCirculo.getY() - y,2));
        if (distancia < raio - outroCirculo.getRaio()) {
            return Math.PI * Math.pow(raio,2);
        }
        return 0;
    }

    public boolean estaDentroDe(Circunferencia outroCirculo){
        double distancia = Math.sqrt(Math.pow(outroCirculo.getX() - x, 2) + Math.pow(outroCirculo.getY() - y,2));
        return distancia < raio - outroCirculo.getRaio();
    }

    @Override
    public String toString(){
        return "Circunferencia: x = " + x + ", y = " + y + ", raio = " + raio;
    }
    
}

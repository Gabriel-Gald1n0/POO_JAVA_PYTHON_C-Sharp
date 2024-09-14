package PacotePoint;

public class Retangulo {
    private double x;
    private double y;
    private double larg;
    private double alt;
    

    public Retangulo(Retangulo outroRetangulo) {
        this.x = outroRetangulo.x;
        this.y = outroRetangulo.y;
        this.larg = outroRetangulo.larg;
        this.alt = outroRetangulo.alt;
    }

    public Retangulo(Ponto2D p1, double larg, double alt) {
        this.x = p1.getX();
        this.y = p1.getY();
        this.larg = larg;
        this.alt = alt;
    }

    public Retangulo(Ponto2D pSupEsq, Ponto2D pInfDir) {
        this.x = pSupEsq.getX();
        this.y = pSupEsq.getY();
        this.larg = Math.abs(pInfDir.getX() - pSupEsq.getX());
        this.alt = Math.abs(pSupEsq.getY() - pInfDir.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double area() {
        return larg * alt;
    }

    public double perimetro() {
        return 2 * (larg + alt);
    }
    
    public double intersecao(Retangulo outroRetangulo) {
        if(this.x < outroRetangulo.x + outroRetangulo.larg &&
        this.x + this.larg > outroRetangulo.x &&
        this.y < outroRetangulo.y + outroRetangulo.alt &&
        this.y + this.alt > outroRetangulo.y) {
                double larg1 = Math.min(this.x + this.larg, outroRetangulo.x + outroRetangulo.larg) - Math.max(this.x, outroRetangulo.x);
                double alt1 = Math.min(this.y, outroRetangulo.y) - Math.max(this.y - this.alt, outroRetangulo.y - outroRetangulo.alt);     
                return larg1 * alt1;
            }
            return 0;
    }

    public double diferenca(Retangulo outroRetangulo) {
        return this.area() - intersecao(outroRetangulo);
    }

    public boolean estaDentroDe(Retangulo outroRetangulo) {
        return (this.x >= outroRetangulo.x &&
        this.y <= outroRetangulo.y &&
        this.x + this.larg <= outroRetangulo.x + outroRetangulo.larg &&
        this.y - this.alt >= outroRetangulo.y - outroRetangulo.alt);
    }

    
    @Override
    public String toString() {
        return "Retangulo [alt=" + alt + ", larg=" + larg + ", x=" + x + ", y=" + y + "]";
    }

}
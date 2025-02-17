package Pacote;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void movePara(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void moveXPara(double x){
        this.x = x;
    }

    public void moveYPara(double y){
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}

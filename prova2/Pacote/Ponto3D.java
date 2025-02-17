package Pacote;

public class Ponto3D extends Ponto2D {
    private double z;

    public Ponto3D(){
        super();
        this.z = 0;
    }

    public Ponto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }
    
    public void movePara(double x, double y, double z){
        super.movePara(x, y);
        this.z = z;
    }

    public void moveZPara(double z){
        this.z = z;
    }

    @Override
    public String toString(){
        return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")";
    }    
}

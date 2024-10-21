package Entregas;

public class EntregaDrone extends Entrega {
   
    public EntregaDrone(){
        super();
    }

    public EntregaDrone(String nome, int x, int y){
        super(nome, x, y,0,0);
    }

    public void mover(int x, int y){
        int posIniX = this.getX();
        int posIniY = this.getY();
        this.setX(x);
        this.setY(y);
        registrarCaminho();
        System.out.println("O drone controlado por " + getNome() + " se moveu as quadras de (" + posIniX  + ", " + posIniY  + ") para (" + x + ", " + y + ").");
    }
    
}

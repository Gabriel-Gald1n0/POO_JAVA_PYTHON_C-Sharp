package Pacote;
public class Lampada {
    private boolean estado;

    public Lampada(){
        estado = false;
    }

    public Lampada(boolean estado){
        this.estado = estado;
    }

    public boolean acender(){
        if(!estaAcesa()){
            estado = true;
            return true;
        } else 
            return false;
    }
    
    public boolean apagar(){
        if(estaAcesa()){
            estado = false;
            return true;
        } else 
            return false;
    }

    private boolean estaAcesa(){
        return estado;
    }

    public void mostrarEstado(){
        if(estaAcesa()){
            System.out.println("Lâmpada Acesa");
        } else
            System.out.println("Lâmpada Apagada");
    }
}

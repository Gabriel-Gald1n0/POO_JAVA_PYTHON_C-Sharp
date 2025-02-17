package Pacote;
public class LampadaIntensidadeVariavel {
    private boolean estado;
    private int intensidade;

    public LampadaIntensidadeVariavel(){
        estado = false;
        intensidade = 0;
    }

    public LampadaIntensidadeVariavel(int intensidade){
        if(intensidade < 0 || intensidade > 100){
            throw new IllegalArgumentException("Intensidade deve ser entre 0 e 100");
        }
        if(intensidade == 0){
            this.estado = false;
        }else {
            this.estado = true;
        }
        this.intensidade = intensidade;
    }

    public boolean estaAcesa(){
        if(this.intensidade == 0){
            return estado;
        }
        this.estado = true;
        return estado;
    }

    public int qualIntensidade(){
        return intensidade;
    }

    public boolean escurecer(){
        if(this.intensidade == 0){
            return estado;
        }
        this.intensidade--;
        return estado;
    }

    public boolean escurecer(int valor){
        int result = this.intensidade - valor;
        if(result < 0){
            return false;
        }
        this.intensidade -= valor;
        if(this.intensidade == 0){
            this.estado = false;
        }
        return estado;
    }

    public boolean clarear(){
        if(this.intensidade == 100){
            return false;
        }
        this.intensidade++;
        return true;
    }

    public boolean clarear(int valor){
        int result = this.intensidade + valor;
        if(result > 100){
            return false;
        }
        this.intensidade += valor;
        return true;
    }
    
    public void mostrarEstado(){
        if(estaAcesa()){
            System.out.println("Lâmpada Acesa com intensidade de " + intensidade + "%");
        } else
            System.out.println("Lâmpada Apagada");
    }
    
}

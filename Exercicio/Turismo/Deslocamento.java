package Turismo;

public class Deslocamento extends Evento {
    private final Roteiro roteiro;

    public Deslocamento(String nome, int duracao, Roteiro roteiro){
        super(nome, duracao);
        this.roteiro = roteiro;
    }

    public Roteiro getRoteiro(){
        return roteiro;
    }
}

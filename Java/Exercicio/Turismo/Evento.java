package Turismo;

public abstract class Evento {
    private String nome;
    private int duracao;

    public Evento(String nome, int duracao){
        this.duracao = duracao;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDuracao(){
        return duracao;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return nome + ": " + duracao + "h";
    }
}

package Turismo;

public class Roteiro {
    private String descricao;

    public Roteiro(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}

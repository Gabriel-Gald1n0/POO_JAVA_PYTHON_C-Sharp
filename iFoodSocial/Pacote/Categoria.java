package Pacote;

public class Categoria {
    private int codigo;
    private String descricao;
    
    public Categoria(){
        this.codigo = 0;
        this.descricao = "";
    }

    public Categoria(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString(){
        return "Código: " + this.codigo + "\nDescrição: " + this.descricao;
    }

}
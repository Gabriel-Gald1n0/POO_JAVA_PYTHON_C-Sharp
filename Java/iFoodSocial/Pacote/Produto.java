package Pacote;

public class Produto extends Categoria {
    private int codigo;
    private String descricao;
    private double valor;
    private Categoria categoria;
    
    public Produto(){
        this.codigo = 0;
        this.descricao = "";
        this.valor = 0.0;
        this.categoria = new Categoria();
    }

    public Produto(int codigo, String descricao, double valor, Categoria categoria){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    @Override
    public int getCodigo(){
        return this.codigo;
    }

    @Override
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    @Override
    public String toString(){
        return "Código: " + this.codigo + "\nDescrição: " + this.descricao + "\nValor: " + this.valor + "\nCategoria: " + this.categoria.getDescricao();
    }
}

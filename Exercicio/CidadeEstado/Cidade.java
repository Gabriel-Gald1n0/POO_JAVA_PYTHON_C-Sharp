package CidadeEstado;

public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Cidade: " + this.nome;
    }
}

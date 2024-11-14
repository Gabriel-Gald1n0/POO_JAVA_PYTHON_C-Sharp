package Pacote;

public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(Estado estado, String nome){
       this.nome = nome;
       this.estado = estado; 
    }

    public String getNome(){
        return nome;
    }

    public Estado getEstado(){
        return estado;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    @Override
    public String toString(){
        return "Cidade: " + nome + estado.toString();
    }


}

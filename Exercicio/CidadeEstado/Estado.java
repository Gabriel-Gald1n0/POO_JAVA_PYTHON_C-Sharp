package CidadeEstado;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private String sigla;
    private final List<Cidade> cidades;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.cidades = new ArrayList<>();
    }

    public void addCidade(Cidade cidade){
        this.cidades.add(cidade);
    }

    public void removeCidade(Cidade cidade){
        this.cidades.remove(cidade);
    }

    public List<Cidade> getCidades(){
        return this.cidades;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    @Override
    public String toString(){
        return "Estado: " + this.nome + " - " + this.sigla;
    }
}

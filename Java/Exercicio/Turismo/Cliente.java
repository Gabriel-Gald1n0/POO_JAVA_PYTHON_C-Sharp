package Turismo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private final List<Dependentes> dependentes;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dependentes = new ArrayList<>();
    }

    public void addDependente(Dependentes dependente){
        this.dependentes.add(dependente);
    }

    public void removeDependente(Dependentes dependente){
        this.dependentes.remove(dependente);
    }

    public List<Dependentes> getDependentes(){
        return this.dependentes;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Cliente: " + this.nome + " - " + this.cpf;
    }
}

package Turismo;

import java.util.ArrayList;
import java.util.List;

public class Pacote {
    private String nome;
    private final List<Evento> eventos;

    public Pacote(String nome){
        this.nome = nome;
        this.eventos = new ArrayList<>();
    }

    public void addEvento(Evento evento){
        this.eventos.add(evento);
    }

    public void removeEvento(Evento evento){
        this.eventos.remove(evento);
    }

    public List<Evento> getEventos(){
        return this.eventos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Pacote: " + this.nome;
    }
}

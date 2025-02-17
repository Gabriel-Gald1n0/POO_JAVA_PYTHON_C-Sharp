package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Vertice{
    private final int QtdVertices;
    private final List<Ponto2D> vertices;

    public Vertice(){
        this.QtdVertices = 100;
        this.vertices = new ArrayList<>();
    }

    public Vertice(Ponto2D inicial) {
        this.QtdVertices = 4;
        this.vertices = new ArrayList<>();
        this.vertices.add(inicial);
    }

    public Vertice(Vertice outro) {
        this.QtdVertices = outro.QtdVertices;
        this.vertices = new ArrayList<>(outro.vertices);
    }

    public boolean addVertice(Ponto2D ponto){
        if(this.vertices.size() >= this.QtdVertices){
            return false;
        }
        this.vertices.add(ponto);
        return true;
    }

    public boolean addVertice(double x, double y){
        if(this.vertices.size() >= this.QtdVertices){
            return false;
        }
        Ponto2D ponto = new Ponto2D(x, y);
        this.vertices.add(ponto);
        return true;
    }

    public List<Ponto2D> getVertices(){
        return this.vertices;
    }

    public int getQtdVertices(){
        return this.QtdVertices;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Ponto2D ponto : vertices) {
            sb.append(ponto.toString()).append("\n");
        }
        return sb.toString();
    }
}

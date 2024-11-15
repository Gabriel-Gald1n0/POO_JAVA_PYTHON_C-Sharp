package Escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private final List<Aluno> alunos;

    public Turma(){
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public void listarAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno na turma");
        } else {
            System.out.println("Alunos da Turma: ");
            for(Aluno aluno : alunos){
                aluno.exibirDetalhes();
            }
        }
    }

}

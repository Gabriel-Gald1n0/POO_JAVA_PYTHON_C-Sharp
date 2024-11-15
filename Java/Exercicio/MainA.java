import Escola.Aluno;
import Escola.Turma;

public class MainA {
    public static void main(String[] args){
        Turma turma1 = new Turma();

        turma1.addAluno(new Aluno("Gabriel",1));
        turma1.addAluno(new Aluno("Felipe",2));
        turma1.addAluno(new Aluno("Tarsila",3));
        turma1.addAluno(new Aluno("Iale",4));

        turma1.listarAlunos();
    }
}

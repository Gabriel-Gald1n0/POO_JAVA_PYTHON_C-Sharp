import CidadeEstado.Cidade;
import CidadeEstado.Estado;
import java.util.ArrayList;
import java.util.List;

public class MainC2 {
    public static void main(String[] args) {
        List<Estado> estados = new ArrayList<>();

        // Criando exemplos de estados e cidades
        Estado sp = new Estado("São Paulo", "SP");
        sp.addCidade(new Cidade("São Paulo"));
        sp.addCidade(new Cidade("Campinas"));
        sp.addCidade(new Cidade("Santos"));

        Estado rj = new Estado("Rio de Janeiro", "RJ");
        rj.addCidade(new Cidade("Rio de Janeiro"));
        rj.addCidade(new Cidade("Niterói"));
        rj.addCidade(new Cidade("Angra dos Reis"));

        // Adicionando os estados à lista
        estados.add(sp);
        estados.add(rj);

        // Exibindo informações dos estados e suas cidades
        System.out.println("Estados e suas cidades:");
        for (Estado estado : estados) {
            System.out.println(estado);
            for (Cidade cidade : estado.getCidades()) {
                System.out.println(" - " + cidade);
            }
        }
    }
}

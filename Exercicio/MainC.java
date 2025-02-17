import Pacote.Cidade;
import Pacote.Estado;
import java.util.ArrayList;
import java.util.List;

public class MainC {
    public static void main(String[] args){

        List<Estado> estados = new ArrayList<>();
        List<Cidade> cidades = new ArrayList<>();

        String[] nomesEstados = {"São Paulo", "Rio de Janeiro", "Minas Gerais"};

        String[] siglasEstados = {"SP", "RJ", "MG"};

        String[] nomeCidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte"};


        for (String nomeEstado : nomesEstados){
            for(String siglaEstado : siglasEstados){
                Estado estado = new Estado(nomeEstado, siglaEstado);
                estados.add(estado);
            }
        }

        for (int i = 0; i < nomeCidades.length; i++){
            Cidade cidade = new Cidade(estados.get(i/2), nomeCidades[i]);
            cidades.add(cidade);
        }

        for (Cidade cidade : cidades){
            System.out.println(cidade);
        }

    }    
}

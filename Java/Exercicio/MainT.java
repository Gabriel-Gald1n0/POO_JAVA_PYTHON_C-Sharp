import Turismo.Cliente;
import Turismo.Dependentes;
import Turismo.Deslocamento;
import Turismo.Evento;
import Turismo.Pacote;
import Turismo.Pernoite;
import Turismo.Roteiro;

public class MainT {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Gabriel", "12345678910");
        cliente.addDependente(new Dependentes("Maria"));
        cliente.addDependente(new Dependentes("Antonio"));

        Roteiro roteiro = new Roteiro("Passeio de barco");

        Deslocamento deslocamento = new Deslocamento("Inda de Carro para balsa", 2, roteiro);

        Pernoite pernoite = new Pernoite("Pernoite em  Hotel", 24);
        
        Pacote pacote = new Pacote("Ferias em Porto");
        pacote.addEvento(deslocamento);
        pacote.addEvento(pernoite);

        System.out.println(cliente);
        System.out.println("Dependentes: ");
        for (Dependentes dependente : cliente.getDependentes()){
            System.out.println(" - "  + dependente);
        }

        System.out.println(pacote);
        System.out.println("Eventos: ");
        for (Evento evento : pacote.getEventos()) {
            System.out.println(evento);
            if (evento instanceof Deslocamento deslocamentoEvento) {
                System.out.println("  Roteiro Complementar: " + deslocamentoEvento.getRoteiro().getDescricao());
            }
        }
    }
}

import PacoteData.Contato;

public class Agenda {
    public static void main(String[] args){
        Contato contato1 = new Contato("Gabriel", "galdinobrosx1@gmail", "73988750872", true);

        System.out.println(contato1);

        Contato contato2 = new Contato("Galds", "galds@example", "73988750333", false);

        System.out.println("\n"+contato2);
    }
}

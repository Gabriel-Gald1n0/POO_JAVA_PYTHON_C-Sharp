import Pacote.LampadaIntensidadeVariavel;

public class Main2 {
    public static void main(String[] args) {
        LampadaIntensidadeVariavel[] lampada = new LampadaIntensidadeVariavel[10]; 
        
        for(int i = 0; i < 10; i++){
            lampada[i] = new LampadaIntensidadeVariavel(i);
        }

        for (int i = 0; i < 10; i++) {
            System.err.println("Lampdada: " + i + " Intensidade - " + lampada[i].qualIntensidade() + "%");
        }
    }
    
}

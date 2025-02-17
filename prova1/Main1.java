import Pacote.Lampada;

public class Main1{
    public static void main(String[] args) {
        Lampada[] lampada = new Lampada[10]; 

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                lampada[i] = new Lampada(true);
            } else
                lampada[i] = new Lampada();
        }

        for (int i = 0; i < 10; i++) {
            System.err.print(i + " - ");
            lampada[i].mostrarEstado();
        }
    }
}
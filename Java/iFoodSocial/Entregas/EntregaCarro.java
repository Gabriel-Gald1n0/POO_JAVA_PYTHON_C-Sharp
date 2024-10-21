package Entregas;

public class EntregaCarro extends Entrega {
    private double ConsumoMedio;

    public EntregaCarro(){
        super();
        this.ConsumoMedio = 10.0;
    }

    public EntregaCarro(String nome, int x, int y, double ConsumoMedio){
        super(nome, x, y,0,0);
        if(ConsumoMedio > 0){
            this.ConsumoMedio = ConsumoMedio;
        } else {
            throw new IllegalArgumentException("O consumo médio não pode ser negativo.");
        }
    }

    public void setConsumoMedio(double ConsumoMedio){
        this.ConsumoMedio = ConsumoMedio;
    }

    public double getConsumoMedio(){
        return this.ConsumoMedio;
    }

    public double calcularConsumo(){
        return calcularDistancia() / this.ConsumoMedio;
    }
}

public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(int pAgencia, char pTipo, Double pSaldo, String pTitular, Double limite) {
        super();
        this.agencia = pAgencia;
        this.tipo = pTipo;
        this.saldo = pSaldo;
        this.titular = pTitular;
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void sacar( Double pValor){
        if(pValor < saldo)
        {
            saldo-=pValor;
        } else if (pValor < (saldo+limite))
        {
            pValor -= getSaldo();
            this.setSaldo(0.0);

            limite -= pValor;
        } else
        {
            System.out.println("Você não tem saldo nem limite. melhore");
        }
    }

    public void imprimir() {
        System.out.println(" ------------------------------ ");
        System.out.println(" Numero  : " + this.numero);
        System.out.println(" Agencia : " + this.agencia);
        System.out.println(" Titular : " + this.titular);
        System.out.println(" Tipo    : " + this.tipo);
        System.out.println(" Saldo   : " + this.saldo);
        System.out.println("Limite    : " + this.limite);
        System.out.println(" ------------------------------ ");
    }

}

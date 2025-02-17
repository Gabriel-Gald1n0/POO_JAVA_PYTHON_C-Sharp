public class Conta {
    protected int numero;
    int agencia;
    char tipo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    protected Double saldo = 0.0;
    String titular;

    public static int QtdeContas = 0;

    Conta() {
        this.numero = Conta.ProximoNumero();
        saldo = 200.0;
    }

    Conta(int pAgencia, char pTipo,
          Double pSaldo, String pTitular) {
        numero = Conta.ProximoNumero();
        agencia = pAgencia;
        tipo = pTipo;
        saldo = pSaldo;
        titular = pTitular;
    }

    public static int ProximoNumero() {
        QtdeContas++;
        return QtdeContas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int pNumero) {
        numero = pNumero;
    }

    public void imprimir() {
        System.out.println(" ------------------------------ ");
        System.out.println(" Numero  : " + numero);
        System.out.println(" Agencia : " + agencia);
        System.out.println(" Titular : " + titular);
        System.out.println(" Tipo    : " + tipo);
        System.out.println(" Saldo   : " + saldo);
        System.out.println(" ------------------------------ ");
    }

    public void sacar(Double pvalor) {
        if (pvalor <= saldo) {
            saldo = saldo - pvalor;
        } else {
            System.out.println("Saldo insuficiente. ");
        }

    }

    public void depositar(Double pvalor) {
        saldo = saldo + pvalor;
    }
}
public class Principal {

    public static void main(String[] args) {
        Conta c1, c2, c3;

        c1 = new Conta(789, 'p', 400.9, "Alexsandro Almeida");
        System.out.println("");
        System.out.println(" Qtde contas : " + Conta.QtdeContas);
        c1.imprimir();

        /**c2 = new Conta();
        System.out.println("");
        System.out.println(" Qtde contas : " + Conta.QtdeContas);
        c2.imprimir();

        c3 = new Conta(10, 'C', 100.0, "Ota");
        System.out.println("");
        System.out.println(" Qtde contas : " + Conta.QtdeContas);
        c3.imprimir();
         */

        ContaCorrente c4 = new ContaCorrente(997, 'c',100.9,"Izabelle Garcez", 500.0);
        c4.setLimite(200.0);
        System.out.println("");
        System.out.println(" Qtde contas : " + Conta.QtdeContas);
        c4.imprimir();
        c4.sacar(150.67);
        c4.imprimir();



    }
}
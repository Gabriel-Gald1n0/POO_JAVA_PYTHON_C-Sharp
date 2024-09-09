
import PacoteData.MinhaData;


public class UsaDataV4 {
    public static void main(String[] args) {
        MinhaData dataInicial = new MinhaData((byte) 30, (byte) 8, (short) 2002);

        dataInicial.printData();
        System.out.println("Data inicial: " + dataInicial);

        int quantidade = 5;
        int paso = 2;

        MinhaData[] intervalo = dataInicial.intervaloDatas(dataInicial, quantidade, paso);

        System.out.println("Intervalo datas:");
        for(MinhaData data : intervalo){
            System.out.println(data);
        }

        MinhaData dataComp = new MinhaData((byte) 12, (byte) 3, (short) 2002);

        System.out.println("A Data " + dataInicial +" é anterior a data " + dataComp + "? " + dataInicial.anteriorA(dataComp));
        System.out.println("A Data " + dataInicial +" é igual a data " + dataComp + "? " + dataInicial.igualA(dataComp));
    }
}
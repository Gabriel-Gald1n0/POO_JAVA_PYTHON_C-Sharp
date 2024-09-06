import PacoteData.MinhaData;

public class UsaDataV4 {
    public static void main(String[] args) {
        MinhaData d1 = new MinhaData();
        d1.printData();
        boolean ok = d1.iniData((byte) 1, (byte) 1, (short) 2021);
        if (ok == true)
            d1.printData();
        else
            System.out.println("Data inválida!");

        byte d = 14;
        byte m = 7;
        if (MinhaData.dataValida(d, m, (short) 2021)) {
            System.out.println("Data válida!");
            d1.setDia(d);
            d1.setMes(m);
        } else {
            System.out.println("Data inválida!");
        }
        
        d1.printData();

        MinhaData d2 = new MinhaData(d1);
        d2.printData();
        MinhaData d3 = new MinhaData4(d1, 45);
        d3.printData();
        MinhaData d4 = new MinhaData();
        d4.printData();

        if (d1 == d2)
            System.out.println("d1 == d2");
        else
            System.out.println("d1 != d2");


    }
}
package PacoteData;

public class MinhaData {
    private byte dia;
    private byte mes;
    private short ano;

    public MinhaData(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public MinhaData(MinhaData outraData){
        dia = outraData.dia;
        mes = outraData.mes;
        ano = outraData.ano;
    }

    public MinhaData(MinhaData outraData, int interval){
        dia = outraData.dia;
        mes = outraData.mes;
        ano = outraData.ano;

    }

    public static boolean dataValida(byte d, byte m, short a){
        byte diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(a < 0)
            return false;
        
        if(m < 1 || m > 12)
            return false;

        if(d < 1 || d > diasMes[m-1])
            return false;
        
        if(m == 2 && d == 29){
            if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)){
                return true;
            }else
                return false;
        }
        return true;
    }

    public void printData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public short getAno() {
        return ano;
    }
}

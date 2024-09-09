package PacoteData;

public final class MinhaData {
    private byte dia;
    private byte mes;
    private short ano;

    public MinhaData(){
        inicializaData();
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
        for (int i = 0; i < interval; i++) {
            dia++;
            if (!dataValida(dia, mes, ano)) {
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    ano++;
                }
            }
        }
    }

    public MinhaData(byte dia, byte mes, short ano){
        if(dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            inicializaData();
        }
    }

    public void inicializaData(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970; 
    }

    public boolean inicializaData(byte dia, byte mes, short ano){
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            return true;
        }
        return false;
    }

    public void inicializaData(MinhaData outraData){
        this.dia = outraData.dia;
        this.mes = outraData.mes;
        this.ano = outraData.ano;
    }

    public void inicializaData(MinhaData outraData, int interval){
        MinhaData novData = new MinhaData(outraData, interval);
        inicializaData(novData);
    }

    public static boolean dataValida(byte d, byte m, short a){
        byte diasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(a < 1900 || a > 2050)
            return false;
        
        if(m < 1 || m > 12)
            return false;

        if(d < 1 || d > diasMes[m-1])
            return false;
        
        if(m == 2 && d == 29){
            return a % 4 == 0 && (a % 100 != 0 || a % 400 == 0);
        }
        return true;
    }

    @SuppressWarnings("unused")
    private boolean dataValida(){
        return dataValida(this.dia, this.mes, this.ano);
    }

    public void printData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia){
        if (dataValida(dia, this.mes, this.ano)){
            this.dia = dia;
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes){
        if(dataValida(this.dia, mes, this.ano)){
            this.mes = mes;
        }
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        }
    }

    @Override
    public String toString() {
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        return this.dia + " de " + meses[this.mes - 1] + " de " + this.ano;
    }

    public boolean igualA(MinhaData outraData){
        return this.dia == outraData.dia && this.mes == outraData.mes && this.ano == outraData.ano;
    }

    public boolean diferenteDe(MinhaData outraData){
        return !igualA(outraData);
    }

    public boolean anteriorA(MinhaData outraData){
        if (this.ano < outraData.ano) {
            return true;
        } else if (this.ano == outraData.ano) {
            if (this.mes < outraData.mes) {
                return true;
            } else if (this.mes == outraData.mes) {
                return this.dia < outraData.dia;
            }
        }
        return false;
    }

    public boolean posteriorA(MinhaData outraData){
        return !anteriorA(outraData) && !igualA(outraData);
    }

    public MinhaData[ ] intervaloDatas(MinhaData dataInicial, int quantidade){
        return intervaloDatas(dataInicial, quantidade, 1);
    }

    public MinhaData[ ] intervaloDatas(MinhaData dataInicial, int quantidade, int paso){
        MinhaData[] datas = new MinhaData[quantidade];
        MinhaData tempData = new MinhaData(dataInicial);
        
        for(int i = 0; i < quantidade; i++){
            datas[i] = new MinhaData(tempData);
            tempData.inicializaData(tempData,paso);
        }
        return datas;
    }

}

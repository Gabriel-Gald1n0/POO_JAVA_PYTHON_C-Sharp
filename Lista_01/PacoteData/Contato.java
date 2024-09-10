package PacoteData;

public final class Contato {
    private String nome;
    private String email;
    private String telefone;
    private boolean isZap;

    public Contato(String nome, String email, String telefone, boolean isZap){
        if(nome == null || nome.isEmpty())
            throw new IllegalArgumentException("ERRO nome vazio");

        if((email == null || !validaEmail(email)) && (telefone == null || !validaTelefone(telefone)))
            throw new IllegalArgumentException("ERRO email ou telefone vazios");

        this.nome = nome;
        setEmail(email);
        setTelefone(telefone);
        this.isZap = isZap;
    }

    public boolean validaEmail(String email){
        String regexEmail = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,}$";
        return email != null && !email.isEmpty() && email.matches(regexEmail);
    }

    public boolean validaTelefone(String telefone){
        String regexTelefone = "^\\d{2,3}\\d{8,9}$";
        return telefone != null && !telefone.isEmpty() && telefone.matches(regexTelefone);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty())
            throw new IllegalArgumentException("ERRO nome vazio");
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        if(email != null && validaEmail(email)){
            throw new IllegalArgumentException("ERRO email vazios");
        }
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        if(telefone != null && !validaTelefone(telefone))
            throw new IllegalArgumentException("ERRO telefone vazios");
        this.telefone = telefone;
    }

    public boolean getisZap(){
        return isZap;
    }

    public void setisZap(boolean isZap){
        this.isZap = isZap;
    }

    @Override
    public String toString(){
        String resultado = "Nome: " + nome;
        if (email != null && !validaEmail(email))
            resultado += "\nEmail: " + email;
        if(telefone != null && validaTelefone(telefone))
            resultado += "\nTelefone: " + telefone + (isZap ? " (WhatsApp)": "");
        return resultado;
    }
}

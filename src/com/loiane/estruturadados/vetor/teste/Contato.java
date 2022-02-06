package com.loiane.estruturadados.vetor.teste;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {}

    public Contato(String nome, String telefone, String email) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contato contato = (Contato) obj;

        if (nome != null ? !nome.equals(contato.nome) : contato.nome != null) return false;
        if (telefone != null ? !telefone.equals(contato.telefone) : contato.telefone != null) return false;
        return email != null ? email.equals(contato.email) : contato.email == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", telefone=" + telefone + ", email="
                + email + "]";
    }
}

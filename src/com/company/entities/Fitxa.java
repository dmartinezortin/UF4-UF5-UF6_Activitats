package com.company.entities;

public class Fitxa {
    private String referencia, titol;

    public Fitxa(String referencia, String titol) {
        this.setReferencia(referencia);
        this.setTitol(titol);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String visualitzar(){
        return "Referencia: " + this.getReferencia() + "\n" +
                "Titol: " + this.getTitol() + "\n";
    }
}

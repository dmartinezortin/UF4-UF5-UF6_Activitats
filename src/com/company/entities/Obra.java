package com.company.entities;

public class Obra extends Fitxa {
    private String autor;
    private int nrePags;

    public Obra(String referencia, String titol, String autor, int nrePags) {
        super(referencia, titol);
        this.setAutor(autor);
        this.setNrePags(nrePags);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrePags() {
        return nrePags;
    }

    public void setNrePags(int nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public String visualitzar(){
        return super.visualitzar() +
                "Autor: " + this.getAutor() + "\n" +
                "Numero Pàgines: " + this.getNrePags() + "\n";
    }

}

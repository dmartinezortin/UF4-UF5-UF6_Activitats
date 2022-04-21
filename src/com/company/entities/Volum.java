package com.company.entities;

public class Volum extends Obra{
    private short nro;

    public Volum(String referencia, String titol, String autor, int nrePags, int nro) {
        super(referencia, titol, autor, nrePags);
        this.setNro(nro);
    }

    public short getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = (short) nro;
    }

    @Override
    public String visualitzar(){
        return super.visualitzar() +
                "Numero de volum" + this.getNro() + "\n";
    }
}

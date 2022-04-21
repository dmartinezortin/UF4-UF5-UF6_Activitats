package com.company.entities;

public class Revista extends Fitxa{
    private short any, nro;

    public Revista(String referencia, String titol, int any, int nro) {
        super(referencia, titol);
        this.setAny(any);
        this.setNro(nro);
    }

    public short getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = (short) any;
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
                "Any: " + this.getAny() + "\n" +
                "Numero de revista: " + this.getNro() + "\n";
    }
}

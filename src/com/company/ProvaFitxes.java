package com.company;

import com.company.entities.*;

public class ProvaFitxes {
    public static void main(String[] args){

        Volum v = new Volum("ref123", "tit", "daniel martinez", 300, 3);
        System.out.println(v.visualitzar());

        Fitxa f = new Fitxa("Ref", "Tit");
        System.out.println(f.visualitzar());

        Obra o = new Obra("ref", "tit", "daniel", 234);
        System.out.println(o.visualitzar());

        Revista r = new Revista("ref", "tit", 2019, 23);
        System.out.println(r.visualitzar());
    }
}

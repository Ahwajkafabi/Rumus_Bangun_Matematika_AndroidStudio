package com.example.rumus_bangun_ajin;

public class LuasSegitiga {
    public double alas;
    public double tinggi;

    public LuasSegitiga(double a,double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi) / 2;
    }
}

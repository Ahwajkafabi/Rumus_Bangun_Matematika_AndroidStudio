package com.example.rumus_bangun_ajin;

public class LuasJajarGenjang {
    double alas;
    double tinggi;

    public LuasJajarGenjang(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi);
    }
}

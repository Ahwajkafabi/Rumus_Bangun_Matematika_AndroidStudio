package com.example.rumus_bangun_ajin;

public class Persegi {
    double sisi;

    public Persegi(double s) {
        sisi = s;
    }

    public double hitung_luas() {
        return (Math.pow(sisi, 2));
    }

    public double hitung_keliling() {
        return (4 * sisi);
    }
}

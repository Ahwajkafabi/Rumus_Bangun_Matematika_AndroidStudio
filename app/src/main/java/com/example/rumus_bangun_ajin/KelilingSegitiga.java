package com.example.rumus_bangun_ajin;

public class KelilingSegitiga {
    double sisiA;
    double sisiB;
    double sisiC;


    public KelilingSegitiga(double sA, double sB, double sC) {
        sisiA = sA;
        sisiB = sB;
        sisiC = sC;
    }

    public double hitung_keliling() {
        return sisiA + sisiB + sisiC;
    }
}

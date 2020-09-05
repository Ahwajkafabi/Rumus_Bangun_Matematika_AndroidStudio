package com.example.rumus_bangun_ajin;

public class VolumeKerucut extends Tabung{
    public VolumeKerucut(double r, double t) {
        super(r, t);
    }

    public double hitung_volume() {
        return (1.0 / 3 * super.hitung_volume());
    }
}

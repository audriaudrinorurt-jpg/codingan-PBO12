/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
  public class RuangRapatBesar extends RuangRapat {
    private boolean soundSystem;
    private boolean proyektor;

    public RuangRapatBesar(String namaRuang, int durasiSewa, int jumlahKursi,
                           boolean soundSystem, boolean proyektor) {
        super(namaRuang, durasiSewa, 200000, jumlahKursi, 25);
        this.soundSystem = soundSystem;
        this.proyektor = proyektor;
    }

    @Override
    public double hitungBiaya() {
        double total = durasiSewa * tarifPerJam;
        if (soundSystem) total += 50000;
        if (proyektor) total += 100000;
        return total;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Sound System : " + (soundSystem ? "Ya" : "Tidak"));
        System.out.println("Proyektor    : " + (proyektor ? "Ya" : "Tidak"));
    }
}

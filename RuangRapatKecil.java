/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
    public class RuangRapatKecil extends RuangRapat {

    public RuangRapatKecil(String namaRuang, int durasiSewa, int jumlahKursi) {
        super(namaRuang, durasiSewa, 100000, jumlahKursi, 10);
    }

    @Override
    public double hitungBiaya() {
        return durasiSewa * tarifPerJam;
    }
}

    


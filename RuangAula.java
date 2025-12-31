/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
    public class RuangAula extends RuangPertemuan {
    private int kapasitas;

    public RuangAula(String namaRuang, int durasiSewa, int kapasitas) {
        super(namaRuang, durasiSewa, 300000);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiaya() {
        return durasiSewa * tarifPerJam;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas   : " + kapasitas + " orang");
    }
}

    
 

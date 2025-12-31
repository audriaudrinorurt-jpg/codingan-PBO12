/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class RuangRapat extends RuangPertemuan {
    protected int jumlahKursi;
    protected int kapasitasMaks;

    public RuangRapat(String namaRuang, int durasiSewa, double tarifPerJam,
                      int jumlahKursi, int kapasitasMaks) {
        super(namaRuang, durasiSewa, tarifPerJam);
        this.kapasitasMaks = kapasitasMaks;
        this.jumlahKursi = Math.min(jumlahKursi, kapasitasMaks);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}

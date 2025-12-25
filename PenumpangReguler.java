/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class PenumpangReguler extends Penumpang {

    public PenumpangReguler(String nama, int jarak) {
        super(nama, jarak);
    }

    // OVERRIDING
    @Override
    public double hitungHargaTiket() {
        return jarak * 1000;
    }
}


 
    


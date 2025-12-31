/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
  import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SewaRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM SEWA RUANG PERTEMUAN ===");
        System.out.println("1. Ruang Rapat Kecil");
        System.out.println("2. Ruang Rapat Besar");
        System.out.println("3. Ruang Aula");
        System.out.print("Pilih jenis ruang: ");
        int pilih = input.nextInt();
        input.nextLine();

        RuangPertemuan ruang = null;

        switch (pilih) {
            case 1:
                System.out.print("Nama Ruang: ");
                String namaKecil = input.nextLine();
                System.out.print("Durasi Sewa (jam): ");
                int durasiKecil = input.nextInt();
                System.out.print("Jumlah Kursi: ");
                int kursiKecil = input.nextInt();
                ruang = new RuangRapatKecil(namaKecil, durasiKecil, kursiKecil);
                break;

            case 2:
                System.out.print("Nama Ruang: ");
                String namaBesar = input.nextLine();
                System.out.print("Durasi Sewa (jam): ");
                int durasiBesar = input.nextInt();
                System.out.print("Jumlah Kursi: ");
                int kursiBesar = input.nextInt();
                System.out.print("Tambah Sound System (true/false): ");
                boolean sound = input.nextBoolean();
                System.out.print("Tambah Proyektor (true/false): ");
                boolean proy = input.nextBoolean();
                ruang = new RuangRapatBesar(namaBesar, durasiBesar, kursiBesar, sound, proy);
                break;

            case 3:
                System.out.print("Nama Ruang: ");
                String namaAula = input.nextLine();
                System.out.print("Durasi Sewa (jam): ");
                int durasiAula = input.nextInt();
                System.out.print("Kapasitas Aula: ");
                int kapasitas = input.nextInt();
                ruang = new RuangAula(namaAula, durasiAula, kapasitas);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (ruang != null) {
            System.out.println("\n=== DETAIL PESANAN ===");
            ruang.tampilkanInfo();
            System.out.println("Total Biaya  : Rp " + ruang.hitungBiaya());
        }

        input.close();
    }      
}

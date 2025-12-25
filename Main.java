/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Jarak Tempuh (km): ");
        int jarak = input.nextInt();

        System.out.print("Jenis Penumpang (1=Reguler, 2=VIP): ");
        int pilihan = input.nextInt();

        Penumpang p;

        if (pilihan == 1) {
            p = new PenumpangReguler(nama, jarak);
            p.tampilkanData("Reguler");
        } else {
            p = new PenumpangVIP(nama, jarak); // ✅ INI YANG BENAR
            p.tampilkanData("VIP");
        }
    }
}
  




    


    
    

   
    


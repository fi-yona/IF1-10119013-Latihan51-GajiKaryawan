/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan51.gajikaryawan;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;


public class Main extends Karyawan{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Karyawan oo1 = new Karyawan();
        Manager oo2 = new Manager();
        
        System.out.println("=====PROGRAM PERHITUNGAN GAJI KARYAWAN=====");
        System.out.print("Masukkan NIK : ");
        oo1.setNik(scan.nextLine());
        System.out.print("Masukkan nama : ");
        oo1.setNama(scan.nextLine());
        System.out.print("Masukkan golongan (1/2/3) : ");
        oo1.setGolongan(scan.nextInt());
        System.out.print("Masukkan jabatan (Manager/Kabag) : ");
        oo1.setJabatan(scan.next());
        System.out.print("Masukkan jumlah kehadiran : ");
        oo2.setKehadiran(scan.nextInt());
        
        String nik = oo1.getNik();
        String nama = oo1.getNama();
        int golongan = oo1.getGolongan();
        String jabatan = oo1.getJabatan();
        float tunjanganGolongan = oo2.tunjanganGolongan(golongan);
        float tunjanganJabatan = oo2.tunjanganJabatan(jabatan);
        int hadir = oo2.getKehadiran();
        float tunjanganKehadiran = oo2.tunjanganKehadiran(hadir);
        float gajiTotal = oo2.gajiTotal();
        
        System.out.println();
        System.out.println("=====HASIL PERHITUNGAN=====");
        System.out.println("NIK\t\t: " + nik);
        System.out.println("NAMA\t\t: " + nama);
        System.out.println("GOLONGAN \t: " + golongan);
        System.out.println("JABATAN\t\t: " + jabatan);
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN\t: Rp " + tunjanganGolongan);
        System.out.println("TUNJANGAN JABATAN\t: Rp " + tunjanganJabatan);
        System.out.println("TUNJANGAN KEHADIRAN\t: Rp " + tunjanganKehadiran);
        System.out.println();
        System.out.println("GAJI TOTAL\t: Rp " + gajiTotal);
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
}

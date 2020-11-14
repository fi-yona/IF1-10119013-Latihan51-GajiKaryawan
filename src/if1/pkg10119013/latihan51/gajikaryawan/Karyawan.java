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


public class Karyawan {
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGolongan(){
        return golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
}

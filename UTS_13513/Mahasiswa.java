package UTS_13513;

import java.util.Scanner;

public class Mahasiswa {
    String nim;
    String nama;
    int semester;
    int usia;
    String krs[];
    int[] nilai;

    public Mahasiswa(String nim, String nama, int semester, int usia, String krs[], int[] nilai)// constructor
    {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.nilai = nilai;
    }

    public int[] getNilai() {
        return nilai;
    }

    public void setNilai(int[] nilai) {
        this.nilai = nilai;
    }


    public float hitungRataNilai(int[] nilai)
    {
        int total = 0;
        for(int i = 0; i < nilai.length; i++)
        {
            total += nilai[i];
        }
        return(float) total/nilai.length;
    }

    public void infoMahasiswa()
    {
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Semester : "+semester);
        System.out.println("Umur : "+usia);
    }

    public void infoKrsMahasiswa()
    {
        System.out.println("KRS : ");
        for(int i = 0; i < krs.length; i++)
        {
            System.out.println("- "+krs[i]);
        }
    }
}

    class MahasiswaBaru extends Mahasiswa{
    String asalSekolah;
    String ikutOspek;

    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah, int[] nilai, String ikutOspek)
    {
    super(nim, nama, semester, usia, krs, nilai);
    this.asalSekolah = asalSekolah;
    this.ikutOspek = ikutOspek;
    }

    public boolean ikutOspek()
    {
    return true;
    }

    public void infoMahasiswa() {
    super.infoMahasiswa();
    System.out.println("Asal Sekolah: " + asalSekolah);
    System.out.println("Ikut OSPEK: " + ikutOspek);
    }
}

    class MahasiswaLulus extends Mahasiswa{
    int tahunWisuda;
    float ipk;
    String ikutWisuda;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk, int[] nilai, String ikutWisuda) {
        super(nim, nama, semester, usia, krs, nilai);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
        this.ikutWisuda = ikutWisuda;
    }

    public String getIkutWisuda() {
        return ikutWisuda;
    }

    public boolean ikutWisuda() {
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda : "+ tahunWisuda);
        System.out.println("IPK : "+ ipk);
        System.out.println("Ikut Wisuda: " + ikutWisuda);
    }
}

    class MahasiswaTransfer extends MahasiswaBaru{
    String asalSekolah;
    String asalUniversitas;
    String ikutOspek;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah, String asalUniversitas, int[] nilai, String ikutOspek)
    {
        super(nim, nama, semester, usia, krs, asalSekolah, nilai, asalUniversitas);
        this.asalSekolah = asalSekolah;
        this.asalUniversitas = asalUniversitas;
        this. ikutOspek = ikutOspek;

    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public String getAsalUniversitas() {
        return asalUniversitas;
    }

    public boolean ikutOspek()
    {
        return true;
    }
    
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Asal Universitas: " + asalUniversitas);
        System.out.println("Ikut OSPEK? : " +ikutOspek);
        
    }
}

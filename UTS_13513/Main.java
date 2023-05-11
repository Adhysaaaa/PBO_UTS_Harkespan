package UTS_13513;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        boolean isRunning = true; // digunakan untuk menjaga agar program tetap berjalan selama nilainya adalah true
        
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print(" Mahasiswa yang mau diinput: ");
                    int jumlahMahasiswa = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.println("\n Mahasiswa ke-" + (i+1));

                        System.out.print("NIM: ");
                        String nim = scanner.nextLine();

                        System.out.print("Nama: ");
                        String nama = scanner.nextLine();

                        System.out.print("Semester ke : ");
                        int semester = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Umur: ");
                        int usia = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print(" Matkul yang diambil: ");
                        int jumlahMatkul = scanner.nextInt();
                        scanner.nextLine();

                        String[] krs = new String[jumlahMatkul];
                        int[] nilai = new int[jumlahMatkul];

                        for (int j = 0; j < jumlahMatkul; j++) {
                        System.out.print("Matkul " + (j+1) + ": ");
                        krs[j] = scanner.nextLine();

                        System.out.print("Nilai Matkul " + (j+1) + ": ");
                        nilai[j] = scanner.nextInt();
                        scanner.nextLine();
                    }

                        System.out.println("Pilih : ");
                        System.out.println("1. Mahasiswa Baru");
                        System.out.println("2. Mahasiswa Lulus");
                        System.out.println("3. Mahasiswa Transfer");
                        int tipeMahasiswa = scanner.nextInt();
                        scanner.nextLine();

                        if (tipeMahasiswa == 1) {
                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = scanner.nextLine();

                            System.out.print("Ikut OSPEK (Ya/Tidak): ");
                            String ikutOspek = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah, nilai, ikutOspek));
                        } else if (tipeMahasiswa == 2) {
                            System.out.print("Tahun Wisuda: ");
                            int tahunWisuda = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("IPK: ");
                            float ipk = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.print("Ikut Wisuda (Ya/Tidak): ");
                            String ikutWisuda = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk, nilai, ikutWisuda));
                        } else if (tipeMahasiswa == 3) {
                            System.out.print("Asal Sekolah: ");
                            String asalSekolah = scanner.nextLine();

                            System.out.print("Asal Universitas: ");
                            String asalUniversitas = scanner.nextLine();

                            System.out.print("Ikut OSPEK (Ya/Tidak): ");
                            String ikutOspek = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas, nilai, ikutOspek));
                        } else {
                            System.out.println("Tipe yang dipilih tidak ada.");
                        }
                    }
                    break;

                case 2:
                    // Output data mahasiswa
                    System.out.println("\nData Mahasiswa:");
                    System.out.println();
                    int j = 1;
                    for (Mahasiswa m : daftarMahasiswa) {
                        System.out.println("Mahasiswa ke-" + j + ":");
                        m.infoMahasiswa();
                        m.infoKrsMahasiswa();
                        j++;
                       
            
                        int[] nilai = m.getNilai();
                        double rataRataNilai = 0.0;

                        System.out.print("Nilai: ");
                        for (int i = 0; i < nilai.length; i++) {
                        System.out.print(nilai[i] + " ");
                        rataRataNilai += nilai[i];
                     }

                        if (nilai.length > 0) {
                        rataRataNilai /= nilai.length;
                    }

                        System.out.println("\nRata-rata Nilai Matkul: " + rataRataNilai);
                        System.out.println();

                    }
                        break;

                    case 3:
                        // Keluar dari program
                        isRunning = false;
                        break;
                        default:
                    System.out.println("Pilihan tidak ada.");
            }
         }
                            
                    System.out.println("Thank You.");
     }
 }
                    

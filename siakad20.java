import java.util.Scanner;
public class siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String nama, nim, kelas;
    byte absen;
    double nilaikuis, nilaitugas, nilaiuts, nilaiuas, nilaiakhir;

    System.out.println("masukan Nama");
    nama = sc.nextLine();
    System.out.println("masukan NIM");
    nim = sc.nextLine();
    System.out.println("masukan Kelas");
    kelas = sc.nextLine();
    System.out.println("masukan Absen");
    absen = sc.nextByte();
    System.out.println("masukan Nilai kuis");
    nilaikuis = sc.nextDouble();
    System.out.println("masukan Nilai Tugas");
    nilaitugas = sc.nextDouble();
    
    System.out.println("masukan Nilai Ujian");
    nilaiuas = sc.nextDouble();

    nilaiakhir = (nilaikuis + nilaitugas + nilaiuas) /3;

    System.out.println("Mahasiswa dengan Nama " + nama + ("NIM : " + nim) + " kelas " + kelas + " Absen " + absen);
    System.out.println("nilai akhir " + nilaiakhir);

    if  ( nilaiakhir >=81 && nilaiakhir <= 100){
        System.out.println("nilai huruf : A");
        System.out.println("kualifikasi : Sangat Baik");
         }

    else if  ( nilaiakhir >=74 && nilaiakhir <= 80){
        System.out.println("nilai huruf : B+");
        System.out.println("kualifikasi : Lebih Dari Baik");
         }
    else if  ( nilaiakhir >=66 && nilaiakhir <= 73){
        System.out.println("nilai huruf : B");
        System.out.println("kualifikasi : Baik");
         }
   
    else if  ( nilaiakhir >=61 && nilaiakhir <= 65){
        System.out.println("nilai huruf : C+");
        System.out.println("kualifikasi : Lebih dari Cukup");
         }
    else if  ( nilaiakhir >=51 && nilaiakhir <= 60){
        System.out.println("nilai huruf : C");
        System.out.println("kualifikasi : Cukup");
         }
    else if  ( nilaiakhir >=40 && nilaiakhir <= 50){
        System.out.println("nilai huruf : D");
        System.out.println("kualifikasi : Kurang");
         }
    else {
        System.out.println("nilai huruf : E");
        System.out.println("kualifikasi : Gagal");
    }
   

    
}

}
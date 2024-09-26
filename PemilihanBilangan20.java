import java.util.Scanner;
public class  PemilihanBilangan20 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("masukan sebuah angka");
        int angka = Input.nextInt();
        String pesan =  (  angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println( "angka " + angka + " adalah " + pesan );
        
    }
}
import java.util.Scanner;
public class  PemilihanBilangan20 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("masukan sebuah angka");
        int angka = Input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angka 4" + angka + " termasuk bilangan genap");
        }
        else {
            System.out.println("amgka " + angka + " termasuk bilangan ganjil");
        }
        
    }
}
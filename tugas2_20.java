import java . util .Scanner;
public class tugas2_20 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int umur;

        System.out.print("masukan usia anda");
        umur= Input.nextInt();

        if (umur >= 0 && umur <= 12 ) {
            System.out.println("anda adalah anak anak");
        }
        else if (umur >= 13 && umur <= 19 ) {
            System.out.println("anda adalah remaja");
        }
        else if (umur >= 20 && umur <= 64 ) {
            System.out.println("anda adalah dewasa");
        }
        else if (umur >= 65 ) {
            System.out.println("anda adalah lansia");
        }
        else {
            System.out.println("input tidak valid");
        }




    
}
}

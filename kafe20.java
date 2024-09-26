import java . util .Scanner;
public class kafe20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String menu ;
        char ukurancup;
        int jumlah;
        boolean keanggotaan;

        System.out.println("masukan menu : ");
        menu = input.nextLine();
        System.out.println("masukan ukuran cup : ");
        ukurancup = input.next().charAt(0);
        System.out.println("masukan jumlah : ");
        jumlah = input.nextInt();
        System.out.println("masukan keanggotaan (true/false) :  ");
        keanggotaan = input.nextBoolean();

        double hargamenu= 0;
        switch (menu.toLowerCase()) {
            case "kopi":
            hargamenu = 12000;
            break;
            case "teh":
            hargamenu = 7000;
            break;
            case "coklat":
            hargamenu = 20000;
            break;
        }

        double totalharga = hargamenu*jumlah;
        
        switch (ukurancup) {
            case 'S':
            break;
            case 'M':
            totalharga += 0.25 * totalharga;
            break; 
            case  'L':
            totalharga += 0.4 * totalharga;
            break;
            default:
            break;
        
        }

        double diskon = keanggotaan ? 0 : 0.1;
        double nominalbayar = totalharga - (diskon * totalharga);

        System.out.println( "item pembelian : " + jumlah + " " + menu + "dengan ukuran cup " + ukurancup);
        System.out.println("nominal bayar " + nominalbayar);

    }
}

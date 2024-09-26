import java.util.Scanner;
public class PemilihanHaridenganIf20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int dayname;
        
        System.out.println("Input Day Name :");
        dayname = input.nextInt();

        if ( dayname >=1 && dayname <= 5){
            System.out.println(dayname + " is a weekday ");
        
        }
        else if ( dayname >=6 && dayname <= 7){
            System.out.println(dayname + " is a weekend ");
        }
        else {
            System.out.println("invalid day name " );
        }
        


    }
    
}

import java.util.Scanner;
public class pPemilihanHari20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String dayname, daytype;
        
        System.out.println("Input Day Name :");
        dayname = input.nextLine();

        switch (dayname.toLowerCase() ){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
            daytype = "weekday";
            break;
            case "saturday":
            case "sunday":
            daytype = "weekend";
            break;
            default:
            daytype = "invalid day name";
        }

            System.out.println(dayname + " is a " + daytype );
        


    }
    
}

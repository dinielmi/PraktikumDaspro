import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNumber;
        String dayType;
    
        System.out.println("Type Daynumber");
        dayNumber = input.nextInt();

         if (dayNumber <= 6){
        dayType = "Weekday";
         }
        else if (dayNumber > 6 && dayNumber <= 7){
        dayType = "Weekend";
         }  
        else{
        dayType = "Invalid day number";
        }  

    System.out.println(dayType);
    }
}


import java.util.Scanner;
public class KabisatNested09 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int tahun;

    System.out.println("Masukkan Tahun");
    tahun = sc.nextInt();

    if ((tahun % 400) == 0) {
    }else if ((tahun %100) == 0){
        System.out.println("Its Leap Year");
    }else if ((tahun %4) == 0){
        System.out.println("Its Leap Year");
    }
     else 
    System.out.println("Its Not Leap Year");
    }
}      

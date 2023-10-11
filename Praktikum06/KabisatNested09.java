import java.util.Scanner;
public class KabisatNested09 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int tahun;

    System.out.println("Masukkan Tahun");
    tahun = sc.nextInt();

    if ((tahun % 4) == 0) {
        if ((tahun % 1000) != 0)
        System.out.println("Its Leap Year");
        else if ((tahun % 400) == 0)
        System.out.println("Its Leap Year");
    }else
        System.out.println("Its not Leap Year");

    }
}
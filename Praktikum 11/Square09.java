import java.util.Scanner;
public class Square09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkkan Jumlah * : ");
        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){            // outer loop
         for (int j = 1; j <= n; j++){          // inner loop
            System.out.print("*");
        }
           System.out.println();               // outer loop
       }
    }
}

import java.util.Scanner;
public class ForKelipatan09 {
   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double rataRata;

    int bilangan, total, counter;
    total = 0;
    counter = 0;

    System.out.println("Masukkan bilangan 1-9: ");
    bilangan = sc.nextInt();

    for (int i = 0; i < 50; ++i) {
        if (i % bilangan == 0) {
            total += i;
            ++counter;
        }
    }

    System.out.printf("Pada rentang 1-50 %d dengan total %d\n", counter, bilangan, total);
    rataRata = (double) total / counter;
    System.out.println("Rata-rata: " + rataRata);
    sc.close();

    }
}
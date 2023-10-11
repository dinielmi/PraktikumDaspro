import java.util.Scanner;
public class TriedtheMaxMinMiddle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int bil1, bil2, bil3;
    int max, middle, min;

    System.out.println("Masukkan Bilangan Pertama");
    bil1 = sc.nextInt();
    System.out.println("Masukkan Bilangan Kedua");
    bil2 = sc.nextInt();
    System.out.println("Masukkan Bilangan Ketiga");
    bil3 = sc.nextInt();

    max = bil1;
    if (bil2 > max){
        max = bil2;
    } else if (bil3 > max){
        max = bil3;
    }

    min = bil1;
    if (bil2 < min){
        min = bil2;
    } else if (bil3 < min){
        min = bil3;
    }
    
    if (bil1 != max && bil1 != min){
        middle = bil1;
    } else if (bil2 != max && bil2 != min){
        middle = bil2;
    }
    else {
        middle = bil3;
    }

    System.out.println("max = " + max);
    System.out.println("middle= " + middle);
    System.out.println("min = " + min);

    }
}


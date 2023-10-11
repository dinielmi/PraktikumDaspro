import java.util.Scanner;
public class Segitiga09 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int sudut1, sudut2, sudut3, totalSudut;

    System.out.println("Masukkan sudut1");
    sudut1 = sc.nextInt();
    System.out.println("Masukkan sudut2");
    sudut2 = sc.nextInt();
    System.out.println("Masukkan sudut3");
    sudut3 = sc.nextInt();

    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180){
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
        {
            System.out.println("Segitiga Tersebutr adalah Segitiga siku-siku");
        }else{
        System.out.println("Segitiga Tersebut adalah bukan Segitiga siku-siku");
        }
    } else
        System.out.println("Bukan Segitiga");
    }
}

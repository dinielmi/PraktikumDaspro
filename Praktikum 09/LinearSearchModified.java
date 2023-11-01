import java.util.Scanner;
public class LinearSearchModified {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int key = 0;
        int hasil = -1;

        System.out.print("Masukkan Jumlah Elemen Array : ");
        int elemen = sc.nextInt();

        int[] arrayInt = new int[elemen];

        for (int i =0; i < arrayInt.length; i++){
          System.out.print("Masukkan elemen array ke-" + i + ": ");
          arrayInt[i] = sc.nextInt();
        }


        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();
        
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;
                //break;
                  System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
            }
        }

        if (hasil == -1){
            System.out.println("Key tidak ditemukan");
        }
    }
}

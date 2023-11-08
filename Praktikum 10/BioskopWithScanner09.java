import java.util.Scanner;
public class BioskopWithScanner09 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
    int baris, kolom, menu, choice;
    String nama, next;

    String [][] penonton = new String[4][2];

    // while (true) {

    //     System.out.println("Menu: ");
    //     System.out.println("1. Input Data Penonton");
    //     System.out.println("2. Tampilkan Daftar Penonton");
    //     System.out.println("3. Exit ");
    //     System.out.print("Pilih Menu: ");
    //     menu = sc.nextInt();
    //     sc.nextLine();

    // }

    while (true) {
    
        System.out.println("===== Selamat Datang Di Bioskop =====");
        System.out.println("- Menu 1 : Input Data Penonton");
        System.out.println("- Menu 2 : Tampilan Daftar Penonton");
        System.out.println("- Menu 3 : Exit");
        System.out.print("Masukkan Menu yang ingin diakses: ");
        choice = sc.nextInt();
        sc.nextLine(); 


        switch (choice) {

            case 1: 

                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                 penonton[baris-1][kolom-1] = nama;
                break;
            
            case 2:
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                } 
                break;
    
                case 3:
                    System.out.println("Thank You!");
                return; // Exit the program
                
                default:
                    System.out.println("Menu yang dimasukkan invalid");
            }
    
            System.out.print("Back to main menu? (y/n) : ");
            next = sc.nextLine();
    
            if (next.equalsIgnoreCase("n")) {
                break;
            }

    }
}
    
}


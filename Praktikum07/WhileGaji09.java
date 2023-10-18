import java.util.Scanner;
public class WhileGaji09 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur, totalGajiLembur;
    String jabatan;
    gajiLembur = 0;
    totalGajiLembur = 0;

    System.out.print("Masukkan Jumlah Karyawan: ");
    jumlahKaryawan = sc.nextInt();
    jabatan = sc.nextLine();

    int i = 0;

    while(i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
        jabatan = sc.next();
        i++;

        System.out.println("Masukkan jumlah jam lembur: ");
        jumlahJamLembur = sc.nextInt();
    

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } 
        else if (jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = jumlahJamLembur * 100000;
        }
        else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = jumlahJamLembur * 75000;
        }
        else {
            System.out.println("Jabatan Invalid");
            i--;
            continue;
        }

        totalGajiLembur += gajiLembur;

        System.out.println("Total gaji lembur: " + totalGajiLembur);

    } 

    }
}

import java.util.Scanner;
public class ProyekPerpustakaan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String judulBuku;
        int kodeBuku, lamaMeminjam, lamaPengembalian, denda;

        System.out.println("Masukkkan Judul Buku: ");
        judulBuku = sc.nextLine();
        System.out.println("Masukkan Kode Buku: ");
        kodeBuku = sc.nextInt();
        System.out.println("Masukkan Lama Meminjam: ");
        lamaMeminjam = sc.nextInt();
        System.out.println("Masukkan Lama Pengembalian: ");
        lamaPengembalian = sc.nextInt();

        denda = lamaMeminjam - lamaPengembalian;
        
        System.out.println("denda sebesar: " + denda);

    }
}

public class ContohVariable09 {

    public static void main(String[] args) {

         String salahSatuHobiSayaAdalah = "Hobiku Membaca buku";
         boolean isPandai = true;
         char jenisKelamin = 'P';
         byte _umurSayaSekarang = 18;
         double $ipk = 4.00, tinggi = 1.51;

         System.out.println(salahSatuHobiSayaAdalah);
         System.out.println("Apakah pandai? " + isPandai);
         System.out.println("Jenis kelamin: " + jenisKelamin);
         System.out.println("IPK: " + $ipk);
         System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", _umurSayaSekarang, tinggi));

    }
}
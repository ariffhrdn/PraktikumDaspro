public class ContohVariabel20 {

    public static void main(String[] args) {

        String namaSaya = "Nama         : Muhammad Arif Fahrudin";
        String salahSatuHobiSayaAdalah = "Hobi         : Bermain Game";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 4, tinggi = 1.73;

        System.out.println(namaSaya);
        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK          : " + $ipk);
        System.out.println(String.format("Umur         : %s \nTinggi badan : %s", _umurSayaSekarang, tinggi));
    }
}
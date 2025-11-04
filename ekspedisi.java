import java.util.Scanner;
public class ekspedisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===volume paket===" );
        System.out.println("panjang (cm)");
        int panjang = input.nextInt();
        System.out.println("lebar (cm)");
        int lebar = input.nextInt();
        System.out.println("tinggi (cm)");
        int tinggi = input.nextInt();
        System.out.println("masukkan berat barang (kg)");
        int berat = input.nextInt();
        System.out.println("masukkan jarak pengiriman (km)");
        int jarak = input.nextInt();

        int volume = panjang * lebar * tinggi;

        int biayaPerkg;
        if (jarak <= 10) {
            biayaPerkg = 4250;
        } else { 
            biayaPerkg = 6000;
        }
        int BiayayaTotal = berat * biayaPerkg;
        if (volume > 100000) {
            BiayayaTotal += 10000;
        }
        System.out.println("===Rincian Biaya Pengiriman===");
        System.out.println("volume paket: " + volume + " cm");
        System.out.println("biaya volume paket:" + (volume > 100000? "Rp 500000 (biaya tambahan)" : "Rp 0"));
        System.out.println("berat paket: " + berat + " kg");
        System.out.println("jarak pengiriman: " + jarak + " km");
        System.out.println("biaya per kg: Rp " + biayaPerkg);
        System.out.println("Biaya total pengiriman: Rp " + BiayayaTotal);
    }
}
    
    
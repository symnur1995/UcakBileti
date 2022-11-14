import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yolculuk tipi seciniz: Tek yon icin 1 e basiniz, Gidis Donus icin 2 ye basiniz");
        int secim = scan.nextInt();
        double biletFiyati= 0;
        if(secim == 1 || secim == 2){
            System.out.println("Yolculuk mesafesini km cinsinden giriniz");
            int mesafe = scan.nextInt();
            System.out.println("Yasinizi giriniz");
            int yas = scan.nextInt();
            if(mesafe >= 0 && yas >= 0){

                biletFiyati = mesafe * 0.10 * secim;

                if(yas < 12){
                    biletFiyati = biletFiyati / 2;
                }
                if(yas > 65){
                    biletFiyati = biletFiyati * (0.7);
                }
                if(yas >= 12 && yas <= 24){
                    biletFiyati = biletFiyati *(0.9);
                }
                if(secim == 2){
                    biletFiyati = biletFiyati *(0.8);
                }
            }else{
                System.out.println("Yas ve mesafe degerleri pozitif olmalidir");
            }
        }else{
            System.out.println("Hatali secim yaptiniz, yolculuk tipini dogru secin");
        }

        System.out.println("Toplam Tutar = " + biletFiyati + " TL");
    }
}

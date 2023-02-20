import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner input= new Scanner(System.in);
        double g_sayi=input.nextDouble();
        double kdvli_fiyat;
        if (0<g_sayi && g_sayi<=1000){
            kdvli_fiyat=g_sayi*0.18;
            System.out.println(kdvli_fiyat);
        } else if (g_sayi>1000) {
            kdvli_fiyat=g_sayi*0.08;
            System.out.println(kdvli_fiyat);
        }
        else {
            System.out.println("Hata! Sıfırdan küçük sayı girdiniz.");
        }
    }
}
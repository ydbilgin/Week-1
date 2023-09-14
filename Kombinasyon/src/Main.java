import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nFac= 1 , rFac = 1,farkToplam = 1 ;
        int  n , r , kombinasyon , fark;
        System.out.println("C(n,r) formatında n değerini giriniz : ");
        n = input.nextInt();
        System.out.println("C(n,r) formatında r değerini giriniz : ");
        r = input.nextInt();
        if (n<r){
            System.out.println("Hatalı giriş yaptınız! ");
            System.exit(0);
        }
        fark = n-r;

        for (int i = 1 ; i <= n ; i++ ){
            nFac = i * nFac;
        }
        for (int i = 1 ; i <= r ; i++ ){
            rFac = i * rFac;
        }
        for (int i = 1 ; i <= fark ; i++ ){
            farkToplam = i * farkToplam;
        }
        kombinasyon = nFac/(rFac*farkToplam);
        System.out.println("C(n,r) = " + kombinasyon );



    }
}
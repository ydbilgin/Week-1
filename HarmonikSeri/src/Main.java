import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n , toplam = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        n = inp.nextDouble();
        for (double i=1; i<=n ; i++){
            toplam = toplam + (1/i);
        }
        System.out.println("Harmonik serisinin sonucu : " + toplam);
    }
}
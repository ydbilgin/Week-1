import java.util.Scanner;

public class Main {
    static int uslu(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println("Sonuç : " + sonuc);
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        a = input.nextInt();
        System.out.println("Üs değerini giriniz : ");
        b = input.nextInt();
        return uslu(a, b);

    }

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        a = input.nextInt();
        System.out.println("Üs değerini giriniz : ");
        b = input.nextInt();
        uslu(a, b);

    }
}
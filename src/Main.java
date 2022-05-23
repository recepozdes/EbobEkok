import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int enk, enb, count = 1, ebob=1, ekok=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk değeri giriniz : ");
        int a = sc.nextInt();
        System.out.print("İkinci değeri giriniz : ");
        int b = sc.nextInt();
        if (a > b) {
            enk = b;
            enb = a;
        } else {
            enk = a;
            enb = b;
        }
        while (count <= enk) {
            if (a % count == 0 && b % count == 0) {
                ebob = count;
            }
            count++;
        }
        System.out.println("Girilen değerlerin EBOB'u : " + ebob);
        ekok=(a*b)/ebob;
        System.out.println("Girilen değerlerin EKOK'u : " + ekok);

    }
}

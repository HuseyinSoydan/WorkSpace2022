import java.util.Scanner;

public class DaireAlanHacimHesaplama {
    public static void main(String[] args) {
        int r;
        double alan, hacim, pi=3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz:");
        r = scanner.nextInt();
        alan = 2 *  pi * r;
        hacim = pi * (r*r);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin hacmi " + hacim);
    }
}

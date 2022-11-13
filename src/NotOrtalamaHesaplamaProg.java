import java.util.Scanner;

public class NotOrtalamaHesaplamaProg {
    public static void main(String[] args) {

        int quiz, vize, finall;
        double ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quiz Notunuzu Giriniz");
        quiz = scanner.nextInt();
        System.out.println("Vize Notunuzu Giriniz");
        vize = scanner.nextInt();
        System.out.println("Final Notunuzu Giriniz");
        finall = scanner.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (finall * 0.45);
        System.out.println(" Not ortalamanız : " + ortalama);
        String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
    }
}
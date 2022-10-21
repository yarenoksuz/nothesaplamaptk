import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fzk,kmy,tr,trh,mzk;

        Scanner imp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = imp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fzk = imp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kmy = imp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        tr = imp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        trh = imp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        mzk = imp.nextInt();


        int toplam = (mat + fzk + kmy + tr + trh + mzk);
        double ortalama = toplam / 6.0;

        System.out.print("Not Ortalamanız: " + ortalama);

        // ödev if/else kullanmadan ortalama < 60 kaldı , >60 ise geçti yazsın


        String durum = ortalama>=60? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);

    }
}
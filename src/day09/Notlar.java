package day09;

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //5 öğrencinin Fizik notlarını klavyeden okuyunuz. Daha sonra bu 5
        //öğrencinin notlarının ortalamasını ekranda gösteriniz.
        //ortalama=toplam/adet
        Scanner input=new Scanner(System.in);
        int ogrenciSayisi=5;
        int not;
        double toplam=0;
        double ortalama;
        System.out.println("Öğrenci Notları [0-100]");
        for (int i = 1; i <=ogrenciSayisi ; i++) {
            System.out.print(i+". Öğrencinin Notu : ");
            not=input.nextInt();
            toplam +=not;//toplam=toplam+not
        }
        ortalama=toplam/ogrenciSayisi;
        System.out.println(String.format("Not Ortalaması = %5.2f",ortalama));
        //-----
    }
}
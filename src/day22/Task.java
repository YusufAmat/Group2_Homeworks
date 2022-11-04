package day22;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //String[ ] cars={"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        //dizisini oluşturup, ekranda sıra numaralarıyla listeleyiniz.
        //1. Honda
        //2. Toyota
        //...     şeklinde olacaktır.
        //Listenin en altında kullanıcıdan seçim yapması istenilecektir.
        //Kullanıcının seçtiği arabaya uygun fiyat;
        //      Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.
        //Şeklinde gösterilecektir.

        //Not 1: Arabaların fiyatı seçildikleri anda rastgele (randomly) üretilecektir.
        //Honda – Toyota – Nissan (Random price between 20000 and 40000)
        //BMW-Mercedes(Random price between 50000 and 80000)
        //Porsche - Ferrari(Random price between 100000 and 150000)

        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        int fiyat;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + 1 + ". " + cars[i]);
        }
        System.out.println();
        System.out.println("Bir araba seciniz [1,7]");
        System.out.print("Secim : ");
        int secim = new Scanner(System.in).nextInt();
        if (secim >= 1 & secim <= 3) {
            fiyat = (int) (Math.round(Math.random() * 20000)) + 20000;
        } else if (secim >= 4 & secim <= 5) {
            fiyat = (int) (Math.round(Math.random() * 30000)) + 50000;
        } else {
            fiyat = (int) (Math.round(Math.random() * 50000)) + 100000;
        }
        System.out.printf("Seçtiğiniz araba %s, fiyatı = %d", cars[secim - 1], fiyat);
    }

}

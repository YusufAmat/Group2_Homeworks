package day20;

import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {
        //Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
        //En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.

        int[] numbers = new int[10];
        int minSayi = 0;
        int maxSayi = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". Sayi : ");
            numbers[i] = new Scanner(System.in).nextInt();
            minSayi = numbers[0];
            maxSayi = numbers[0];
            if (numbers[i] > maxSayi) {
                maxSayi = numbers[i];
            }
            if (numbers[i] < minSayi) {
                minSayi = numbers[i];
            }
        }

        System.out.println("En buyuk sayi = " + maxSayi);
        System.out.println("En kucuk sayi = " + minSayi);
    }
}

package day16;

public class Tasks {
    public static void main(String[] args) {
        //TODO 1:0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)
        //TODO 2:0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.
        //TODO 3: 0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
        // Java programını yazınız. (Sıfır ve yüz dahil)
        int tekToplam = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            } else {
                tekToplam += i;
            }
        }
        System.out.println("\nToplam : " + tekToplam);
        for (int i = 0; i <= 100 ; i++) {
            if (i % 10 == 0){
                System.out.print(i + "\t");
            }
        }
    }
}
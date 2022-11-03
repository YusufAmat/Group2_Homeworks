package day21;

public class Task {
    public static void main(String[] args) {
        /*
        {"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
        "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };
        */

        /*Yukarıdaki dizi verildiğine göre;
        Adı Bölümü
        Ahmet Fizik
        biçiminde ekran çıktısı veren bir Java programı yazınız.*/

        String[] data = {"Ahmet", "Fizik", "Şengül", "Kimya", "Hakan", "Matematik", "Feraye", "Biyoloji", "Cengiz",
                "Felsefe", "Salih", "Elektronik", "Sezen", "Bilgisayar", "Hasan", "Fizik", "Sezgin", "Biyoloji"};
        System.out.println("ADI\t\t||   BÖLÜMÜ");
        System.out.println("------------------");
        for (int i = 0; i < data.length; i += 2) {
            System.out.println(data[i] + "\t-->  " + data[i + 1]);
        }

    }
}

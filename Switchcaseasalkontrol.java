package switchcaseasalkontrol;

import java.util.Scanner;

public class Switchcaseasalkontrol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("bir sayi giriniz: ");

        int sayi = scan.nextInt();

        boolean asalMi = true;

        for (int i = 2; i <= (sayi / 2); i++) {
           
            switch (sayi % i) {
                case 0:
                    asalMi = false;
                    break;
            }

        }

        if (asalMi) {
            System.out.println("Bu sayi asaldir!");
        } else {
            System.out.println("Bu sayi asal degildir!");
        }

    }
}

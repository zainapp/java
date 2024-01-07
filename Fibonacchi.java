

package fibonacchi;

import java.util.Scanner;

// Döngü kullanarak bir fibonacci fonksiyonu (Fib_Hesapla(int sira)) yazınız ve istenilen sıradaki elemanı 
//ekrana yazdırınız
//Fibonacci Dizisi: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 Fib_Hesapla(8)=21
public class Fibonacchi {

    
       
    static int Fib_hesapla(int sayi){
       
         int ilk=1;
         int ikinci=1;
         for(int i=2;i<sayi;i++){
             
             	int temp=ikinci ;
		ikinci=ikinci+ilk;
		ilk=temp;
     }
          return ikinci;
     }    
         
    public static void main(String[] args) {
      
     System.out.print("sayi gir :");
     Scanner scan=new Scanner(System.in);
     int sayi=scan.nextInt();
     
    System.out.print( Fib_hesapla(sayi ));
     
    }      
    
    
}


package girilenlerinorthesaplama;

import java.util.Scanner;

public class Girilenlerinorthesaplama {

    //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
  
    public static void main(String[] args) {
        
      System.out.print("sayi giriniz:"); 
      
      Scanner scan =new Scanner(System.in);
      
      int sayi = scan.nextInt();
    
      int toplam=0,sayac=0;
      
      for(int i=1;i<=sayi;i++){
         
          if(i%3==0 && i%4==0){
              
            toplam = toplam + i;
            sayac++;  
          }
            
     }  
      double ort= toplam / sayac;
      
       System.out.println(ort);
       
    }
    
}

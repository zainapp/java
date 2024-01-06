

import java.util.Scanner;
import java.util.Random;

public class binarysayıyaçevirme{
    
    
    
    static public void donustur(int sayi){
        
        int dizi[]=new int[40];
        int index =0;
        while(sayi>0){
            
            dizi[index]=sayi%2;
            sayi=sayi/2;
            
            System.out.println(sayi+"=>"+index);
            if(sayi>0){
                index++;
                
            }
        }
        for(int i=index;i>=0;i--){
            
            System.out.print(dizi[i]);
        }
        System.out.print("\n");
        
    }
    
    public static void main(String [] args ){
        
        Scanner scan= new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= scan.nextInt();
        donustur(sayi);
      //  System.out.println("n");
                
        
    }

}

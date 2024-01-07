
package faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    
    public static void main(String[] args) {
        
        
        int faktoriyel = 1;
        
        
        
        System.out.println("sayi gir");
       
        Scanner scan = new Scanner(System.in);
        
        int sayi = scan.nextInt();
        
        while(sayi>=1){
            
          faktoriyel=faktoriyel * sayi;
          
          sayi--;
        }
        System.out.println("faktoriyel "+ faktoriyel);
        
    }
    
}

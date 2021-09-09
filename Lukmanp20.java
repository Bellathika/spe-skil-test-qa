/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lukmanp20;
import java.util.Scanner;
/**
 *
 * @author Bela
 */
public class Lukmanp20 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        
System.out.print("masukkan nilai awal : ") ;
awal = input.nextInt() ;
System.out.print(" Masukkan nilai akhir : ") ;
akhir = input.nextInt() ;
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}// TODO code application logic here
    
    


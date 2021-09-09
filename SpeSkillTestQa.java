/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spe.skill.test.qa;
import java.util.Scanner;
/**
 *
 * @author Bela
 */
public class SpeSkillTestQa {
    static int fibo(int n){
    if(n == 0 || n == 1){
      return n;
    } else {
      return (fibo(n-1) + fibo(n-2));
    }
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i, j = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan banyaknya : ");
    int n = scan.nextInt();
    System.out.print("masukkan angka yang akan di cek : ") ;
int input = scan.nextInt() ;
    System.out.println() ;
    for (i = 0; i < n; i++){
      if (fibo(j) == input) {
 System.out.print("TRUE") ;
}
      j++;
    }
    System.out.println();
  }
}


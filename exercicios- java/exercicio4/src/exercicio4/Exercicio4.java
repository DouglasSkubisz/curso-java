/*
Escreva um pequeno software que peça a sua idade e a idade da sua mãe. 
Em seguida, imprima na tela as 3 informações a seguir:

a sua idade
a idade da sua mãe
minha mãe é &lt;anos&gt; mais velha do que eu

Nota(s):
substitua o texto &lt;anos&gt; pela diferença entre a sua idade e a de sua mãe.
*/
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Qual sua idade: ");
       int i1 = sc.nextInt();
       System.out.print("Qual idade de sua mãe? ");
       int i2 = sc.nextInt();
       int dif = i2 - i1;
       System.out.println("minha mãe é " + dif + " anos mais velha do que eu.");
       
       
    }
    
}

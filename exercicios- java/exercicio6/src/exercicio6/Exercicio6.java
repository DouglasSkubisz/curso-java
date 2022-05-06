/*Reescreva o código a seguir a fim de se utilizar o mínimo de linha possíveis:
Nota(s):
Amontoar linhas não soluciona o problema. O código a seguir não é simplificação e sim, confusão:
int x = 0; x = System.out.println(“Digite um número”);

Escreva de forma tal a utilizar somente 4 linhas


Código Fonte:
Scanner in = new Scanner(System.in);

System.out.println("Simplificando expressões para reduzir o número de linhas");
     int x = 0;
     x = in.nextInt();
     if(x &gt; 10){
      System.out.println("O número digitado é maior do que 10");
}else{
      System.out.println("O número digitado é menor do que 10");
}
*/
package exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String r = (x > 10)? "maior":"menor";
        System.out.println("o número digitado é " + r + " do que 10");
        
    }
   
    
    
}

/*
Faça um programa que peça para o usuário digitar um número, em seguida, faça a soma de todos os algarismos do número.
Exemplos:
      123 = 1+2+3 = 6
      2090 = 2 + 0 + 9 + 0 = 11
 */
package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
outraforma();
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        int soma = 0;
        
        while(num>0){
            int modulo = num % 10; // 123%10=3;2;1
            soma+=modulo; // 3 + 2 = 5;
            num = num / 10; // 123 / 10 = 12; 12 / 10 = 1
        }
        System.out.println("A soma dos algarismos é: " + soma);
    }
    
    public static void outraforma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        String num = sc.nextLine();
        int soma = 0;
        String item = " ";
        for(int a=0; a<num.length(); a++){
            item=num.substring(a, a+1);
            soma+=Integer.parseInt(item);
        }
        System.out.println("funcao: " + soma);
        
    }
}

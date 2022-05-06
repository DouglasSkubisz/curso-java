/*Escreva um programa que peça para o usuário informar qual tabuada o mesmo deseja ver e armazene o número em uma variável. 
Em seguida, imprima a tabuada na tela se utilizando da instrução FOR. Para imprimir a tabuada, siga o modelo abaixo:

Por favor, informe qual a tabuada que você deseja:
Ax x B10 = Cresultado 10
Ax x B9 = Cresultado 9
Ax x B8 = Cresultado 8

Nota(s):
Ax, B e C representam, respectivamente: 
Ax - número da tabuada desejada pelo usuário
B - número a ser incrementado
C - resultado da expressão AX X BX = CX
Exemplo:
5 x 10 = 50
5 x 9   = 45
5 x 8   = 40*/
 
package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Qual tabuada que você deseja? ");
        int a = sc.nextInt();        
        
        for(int contador=1; contador <=10; contador++){
            System.out.println(a + " X " + contador + " = " + (a*contador));
        
        }
    }
    
}

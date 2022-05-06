/*Faça um programa que mostre a soma de todos os números no intervalo determinado pelo usuário. 
Logo, peça para que o usuário defina o início da contagem e em seguida, peça ao mesmo que informe o final.*/
package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Informe o número que a soma vai iniciar: ");
//        int a = sc.nextInt();
//        System.out.print("Informe o número final da soma: ");
//        int z = sc.nextInt();
//        int soma=0;
//        for(int contador=a;contador<=z;contador++){
//        soma+=contador;
//                        
//        }
//        System.out.println(soma);
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número que a soma vai iniciar: ");
        int a = sc.nextInt();
        System.out.print("Informe o número final da soma: ");
        int z = sc.nextInt();
        int soma=0; 
        while(z>=a){
            soma+=a;
            a++;
        }
        System.out.println(soma);
    }
    
    
    
}

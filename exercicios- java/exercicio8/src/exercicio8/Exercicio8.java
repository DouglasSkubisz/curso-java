/*
Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.
*/
package exercicio8;

public class Exercicio8 {

    public static void main(String[] args) {
        int soma =0;
        System.out.println("A soma de todos os números no intervalo de 1 a 100: ");
        for(int contador=1; contador<=100;contador++){
            soma += contador;
            //System.out.println(soma);
        }
        System.out.println(soma);
        
        int soma2 =0, contador2 =1;
        while(contador2<=100){
            soma2+=contador2;
            contador2++;
           // System.out.println(soma2);
        }
        System.out.println(soma2);
    }
    
}

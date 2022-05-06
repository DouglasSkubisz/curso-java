/*Faça um programa que peça o nome, idade e cidade de nascimento do usuário. 
Em seguida, imprima a frase abaixo trocando as tag’s &lt;nome&gt;, &lt;idade&gt;, 
&lt;cidade&gt;, pelo nome, idade e cidade informado pelo usuário. 

“Ola. Meu nome é &lt;nome&gt;, sou natural de &lt;cidade&gt;, tenho &lt;idade&gt; 
anos e estou aprendendo a programar.”*/

package exercicio3;

import java.util.Scanner;

public class Exercicio3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite sua cidade de nascimento: ");
        String cdn = sc.nextLine();
        System.out.println("Ola. Meu nome é " + nome + ", sou natural de " + cdn + ", tenho " + idade + " anos e estou aprendendo a programar.");
        */
        System.out.println("Informe 3 numeros: ");
        System.out.print("Número 1: ");
        int n1 = sc.nextInt();
        System.out.println("Número 2: ");
        int n2 = sc.nextInt();
        System.out.println("Número 3: ");
        int n3 = sc.nextInt();
        System.out.println("Os números digitados são: " + n1 + ", " + n2 + ", " + n3 + ".");
    }
    
}

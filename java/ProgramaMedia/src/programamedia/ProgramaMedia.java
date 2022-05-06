
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva sua primeira nota: ");
        float n1 = scan.nextFloat();
        System.out.print("Escreva sua segunda nota: ");
        float n2 = scan.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: " + m);
        if(m>=7){
            System.out.println("Parabéns");             
        }
    }
       
}

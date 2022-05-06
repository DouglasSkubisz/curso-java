package programadowhile;

import java.util.Scanner;

public class ProgramaDoWhile {

       public static void main(String[] args) {
           int n, s=0;
           String resp;
           Scanner sc = new Scanner(System.in);
           do{
               System.out.print("Digite um número: ");
               n = sc.nextInt();
               s += n;
               System.out.println("Quer continuar? [s/n] ");
               resp = sc.next();
                             
               
           }while (resp.equals("s"));
           System.out.println("A soma do dos valores é " + s);
           
           
           
    }
    
}

package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        System.out.print("Em qual ano você nasceu? ");
        Scanner scan = new Scanner(System.in);
        int nasc = scan.nextInt();
        int i = 2022-nasc;
        System.out.println("Você tem "+ i );
        if(i>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}

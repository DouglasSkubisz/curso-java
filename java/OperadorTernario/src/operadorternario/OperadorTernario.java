
package operadorternario;

import java.util.Scanner;


public class OperadorTernario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n1, n2, r;
//        n1 = 4;
//        n2 = 8;
//        r = (n1>n2)? 0:1;
//        System.out.println(r);
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.println((idade>=18)? "maior de idade":"menor de idade");
        
        
    }
    
}

package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno(a): ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota do aluno(a): ");
        float nota = sc.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);
        
    }
    
}

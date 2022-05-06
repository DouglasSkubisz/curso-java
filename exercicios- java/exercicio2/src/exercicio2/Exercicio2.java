/*Agora, vamos resolver o exercício que pede: 
Faça um programa que imprima a frase: “Seja bem-vindo ao meu programa!”

Em seguida, imprima uma linha em branco e na sequência, imprima as frases e o resultado da expressões matemáticas. 

Cada frase e seu resultado devem estar na mesma linha.
“O produto de 8 por 90 é igual a:” 
“O quociente de 90 por 30 é igual a:”
“O quadrado de 9 é:”

Nota(s):
Em cada expressão matemática, você deve imprimir o resultado de uma expressão na qual o compilador é quem resolveu. 
Ou seja, é para concatenar a frase sugerida no enunciado com o resultado.*/

package exercicio2;

public class Exercicio2 {

   
    public static void main(String[] args) {
        int produto, quociente, quadrado;
        produto = 8 * 90;
        quociente = 90 / 30;
        quadrado = 9*9;
        System.out.println("Seja bem-vindo ao meu programa!" + "\n ");
        System.out.println("O produto de 8 por 90 é igual a: " + produto);
        System.out.println("O quociente de 90 por 30 é igual a: " + quociente);
        System.out.println("O quadrado de 9 é: " + quadrado);
        
        
    }
    
}

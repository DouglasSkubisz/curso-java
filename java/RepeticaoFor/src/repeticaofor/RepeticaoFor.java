/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author dougl
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ESTRUTURA FOR SIMPLES");
        for (int contador=1; contador<=4; contador++ ){
                    
            System.out.println("salto de cabeça");
            
            /*int contador=0
            while(cc<=5) {
              System.ou.println("salto de cabeça");
              contador++;
            }*/
        }
        System.out.println("ESTRUTURA FOR ANINHADA:");
            for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("I = " + i + "  ~~~~~~  J = " + j);
            }
        }
    }
}

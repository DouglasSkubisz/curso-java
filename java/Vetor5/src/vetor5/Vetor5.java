
package vetor5;

import java.util.Arrays;

public class Vetor5 {

    public static void main(String[] args) {
        int vet[] = new int[20];
        Arrays.fill(vet, 5); // método que preenche o vetor com o número escolhido 
        for(int valor:vet){
            System.out.print(valor + " ");
        }
    }
    
}

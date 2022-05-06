
package vetor4;

import java.util.Arrays;

public class Vetor4 {

    public static void main(String[] args) {
        int vet[] = {3, 4, 6, 8, 10, 2};
        for(int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int posicao = Arrays.binarySearch(vet, 10); // método para localizar o numero dentro da posição do vetor
        System.out.println("Encontrei o valor na posição " + posicao);
    }
    
}

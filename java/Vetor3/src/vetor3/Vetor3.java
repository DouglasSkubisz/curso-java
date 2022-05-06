
package vetor3;

import java.util.Arrays;

public class Vetor3 {

      public static void main(String[] args) {
        double v[] = {3.5, 2.75, -5.8, 8.4, 2.2};
        Arrays.sort(v); // método para colocar o vetor em ordem
        for(double valor: v){ //for each            
            System.out.print(valor + " ");
        }
    }
    
}

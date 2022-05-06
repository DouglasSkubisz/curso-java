package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2) / 2 ;
        System.out.printf("A média é igual a %.0f \n", m);
        
        int numero = 5;
        int valor = 4 + numero--;
        System.out.println(numero);
        System.out.println(valor);
        
        int x = 4;
        x *= 2; // x = x * 2
        System.out.println(x);
        
        float v = 7.8f;
        int ar = (int) Math.round(v); //Math.ceil Math.floor
        System.out.println(ar);
        
        
    }
    
}

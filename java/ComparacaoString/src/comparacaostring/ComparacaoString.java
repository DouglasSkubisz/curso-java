
package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String n1 = "douglas";
        String n2 = "douglas";
        String n3 = new String("douglas");
        String res;
        res= (n1.equals(n3))?"igual":"diferente"; // equals é o método do objeto que compara igualdade
        System.out.println(res);
    }
    
}

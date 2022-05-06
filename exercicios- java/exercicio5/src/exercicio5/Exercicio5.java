/*
Desenvolva um pequeno programa de login e senha. 
Para isso, peça ao usuário para digitar o seu login e armazene o que o usuário digitou em uma variável. 
Em seguida, peça para o usuário digitar a sua senha e armazena em uma outra variável. 
Por fim, verifique se o login e a senha são iguais àquele definido por você.

Dica(s):
1) Você pode utilizar para login o seu nome e para a senha o seu CPF

*/
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        String login1 = "douglas";
        String senha1 = "123456";
        Scanner sc = new Scanner(System.in);        
        System.out.print("Seu login: ");
        String login = sc.next();
        System.out.print("Sua senha: ");
        String senha = sc.next();
        if ((login1.equals(login)) && (senha1.equals(senha))){
            System.out.println("Dados corretos");
        }else{
            System.out.println("Login ou senha inválidos");
        }
        
    }
    
}

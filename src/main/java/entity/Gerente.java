package entity;

import java.util.Scanner;

public class Gerente extends Vendedor{
    String senha = "abc";
    boolean autorizado = false;

    public void confirmarVenda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha");
        String entradaSenha = scanner.next();
        while(!autorizado) {
            if (entradaSenha.equals(senha)){
                System.out.println("Venda autorizada");
                autorizado = true;
            }else {
                System.out.println("Digite novamente a senha");
                entradaSenha = scanner.next();
            }

        }
    }

}

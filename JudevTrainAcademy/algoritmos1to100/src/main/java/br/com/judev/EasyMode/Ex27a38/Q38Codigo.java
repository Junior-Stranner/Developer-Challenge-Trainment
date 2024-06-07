package br.com.judev.EasyMode.Ex27a38;

import java.util.Scanner;

public class Q38Codigo {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            // Código e senha armazenados internamente
            final int CODIGO_CORRETO = 1234;
            final int SENHA_CORRETA = 9999;
    
            System.out.println("Digite o código do usuário:");
            int codigoUsuario = Integer.parseInt(in.nextLine());
    
            if (codigoUsuario != CODIGO_CORRETO) {
                System.out.println("Usuário inválido!");
            } else {
                System.out.println("Digite a senha:");
                int senhaUsuario = Integer.parseInt(in.nextLine());
    
                if (senhaUsuario != SENHA_CORRETA) {
                    System.out.println("Senha incorreta!");
                } else {
                    System.out.println("Acesso permitido");
                }
            }
    
            in.close();
    }
}

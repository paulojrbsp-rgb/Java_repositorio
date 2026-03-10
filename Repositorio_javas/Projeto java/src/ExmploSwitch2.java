import java.util.Scanner;

public class ExmploSwitch2 {
    public static void main(String[] args){
        //Scanner
        Scanner vagabundo = new Scanner(System.in);
        // base Do sistema do site
        System.out.println("-----------------------\n----Escolha opções----\n----------------------");
        System.out.println("\n-- opções para o sistema: A Matricular, B Consultar, C sair");
        String opcao = vagabundo.next();

        switch (opcao){
            case "A":
                System.out.println("\n-------Vamos Cadastrar---------");
                System.out.println("\nDigite seu nome: ");
                String nome = vagabundo.next();
                System.out.println("\nDigite sua Idade: ");
                int idade = vagabundo.nextInt();
                System.out.println("\n----- Cadastro realizado -----");
                System.out.println("\n"+ nome +" Seja bem vindo! você tem "+ idade+ " Anos");
        }
    }
}

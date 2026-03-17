import java.util.Scanner;

public class Savenhago {
    public static void main (String[] args){

        //Variavel

        String usario;
        String senha;

        //Input

        Scanner input = new Scanner(System.in);

        // Apresentação login savenhago

        System.out.println("------------------------------------\n ------ Cadastro de usuário ------ \n--------------------------------");

        //Coleta de dadods

        System.out.println("\nInsira seu nome: ");
        usario = input.next();
        System.out.println("\nInsira Senha: ");
        senha = input.next();

        //regras

        while (usario.equalsIgnoreCase(senha)){

            System.out.println("\nO cabeça de jaca!, não pode ter senha igual o nome!!!\nTenta de novo Ai meu");

            //coleta novos dados

            System.out.println("\nInsira seu nome: ");
            usario = input.next();
            System.out.println("\nInsira Senha: ");
            senha = input.next();

        }

        System.out.println("\nSeja bem Vindo "+ usario);

    }
}

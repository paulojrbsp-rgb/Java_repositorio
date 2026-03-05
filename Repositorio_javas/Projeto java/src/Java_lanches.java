//Importações

import java.util.Scanner;

public class Java_lanches {
    public static <string> void main (String[] args){

        //Input

        Scanner Input = new Scanner (System.in);

        //apresentação java lanches

        System.out.println("--------------------\n --- Bem vindo! --- \n-------------------- \n -- Java Lanches! -- \n--------------------");

        //Coleta de dados

        System.out.println("\nOla! qual é seu nome?");
        String nome = Input.next();
        System.out.println("\nqual é sua idade?");
        int idade = Input.nextInt();

        //Cardapio

        System.out.println("\n Otimo Aqui está o nosso Cardapio!\n -- 101 Chachorro quente R$ 10,00\n -- 102 X-Burguer R$ 15,00\n -- 103 X-Salada R$12,00\n");
        int Pedido = Input.nextInt();
        float Conta = 0f;
        switch (Pedido){

            case 101:
                Conta = 10f;
                break;
            case 102:
                 Conta = 15f;
                break;
            case 103:
                 Conta = 12f;
                break;
        }
        if (Conta == 0){
            System.out.println("\n Desculpa esse pedido não temos!");
            System.out.println("\n\n------ Obrigado por ter Vindo!, volte sempre!! ------");
            return;
        }

        // Desconto por  menor que 12 = 50%

        if (idade < 12){
            Conta = Conta / 2 ;
            System.out.println("\n Perfeito! "+ nome + "Você ganhou um desconto de 50%!!\n Você faz parte do Menu Kids!!\n Seu pedido sera preparado!\n Ficou um total de: R$" + Conta);
            System.out.println("\n\n------ Obrigado por ter Vindo!, volte sempre!! ------");
        }
        else if ( idade >= 12 && idade < 60) {
            System.out.println("\n Perfeito! "+ nome + " Seu pedido sera preparado!\n Ficou um total de: R$" + Conta);
            System.out.println("\n\n------ Obrigado por ter Vindo!, volte sempre!! ------");
        }
        else if ( idade > 60){
            Conta = Conta - (Conta * 0.30f);
            System.out.println("\n Perfeito! "+ nome + "Você ganhou um desconto de 30%!!\n Você faz parte do Melhor idade!!\n Seu pedido sera preparado!\n Ficou um total de: R$" + Conta);
            System.out.println("\n\n------ Obrigado por ter Vindo!, volte sempre!! ------");
        }

    }
}

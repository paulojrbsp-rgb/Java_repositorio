import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        //Input

        Scanner entrada = new Scanner(System.in);

        //Apresetação

        System.out.println("------------------\n---Calcular IMC---\n------------------");

        //coleta de dados

        System.out.println("\nInforme seu nome: ");
        String nome = entrada.next();
        System.out.println("\nInforme seu peso: ");
        int peso = entrada.nextInt();
        System.out.println("\nInforme sua Altura: ");
        float altura = entrada.nextFloat();
        float IMC = peso / (altura *altura);
        String mensagem = "";

        //calculando imc

        if (IMC < 18.5f ){
            mensagem = "Magraza";
        }
        else if (IMC >= 19f && IMC < 24.9f){
           mensagem = "Normal";
        }
        else if (IMC = 25f && IMC < 29.9f){
           mensagem = "Sobrepeso";
        }
        else if (IMC = 30f && IMC < 39.9f){
           mensagem = "Obesidade";
        }
        else if (IMC > 40f ){
           mensagem = "obesida grave";
        }
        else;
    }
}
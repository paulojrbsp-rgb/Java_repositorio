import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        //input

        Scanner matue = new Scanner(System.in);

        //apresebtação calculadora

        System.out.println("----------------------\n ----Calculadora---- \n----------------------");


        // Entrada de dados

        System.out.println("\nInforme o primeiro número: ");
        float n1 = matue.nextFloat();
        System.out.println("\nInforme o segundo número: ");
        float n2 = matue.nextFloat();
        System.out.println("\nEscolha uma operação +, -, *, / ");
        String operador = matue.next();
        float resultado = 0;

        //operação calculadora

        switch (operador){
            case "+": resultado = n1 + n2; break;
            case "-": resultado = n1 - n2; break;
            case "*": resultado = n1 * n2; break;
            case "/": resultado = n1 / n2; break;
            default: System.out.println("\nOperador invalido"); return;

        }
        System.out.println("\nResultado foi = "+ resultado);
    }
}

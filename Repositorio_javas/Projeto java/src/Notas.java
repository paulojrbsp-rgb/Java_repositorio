import java.util.Scanner;

public class Notas {
    public static void main(String [] args){

        //variaveis

        float[][] notas = new float[3][4];
        float soma = 0;
        int QtN = notas.length * notas[0].length;
        float ASoma = 0;

        //input

        Scanner input = new Scanner(System.in);

        //apresentação

        System.out.println("\n--------------------\n ---Media Provas--- \n-------------------");

        //coleta de dados

        for (int i = 0; i <notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = (float) Math.random()* 10;
                System.out.printf("%.2f  ", notas [i][j]);
                soma += notas[i][j];

            }
            System.out.println(" ");
        }
        System.out.printf("\nmedia das notas é %.2f ", soma/QtN);

        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j <notas[i].length; j++){
                ASoma += notas[i][j];

            }
            System.out.printf("Media Aluno 1: %2.f", ASoma/4);
        }
    }
}

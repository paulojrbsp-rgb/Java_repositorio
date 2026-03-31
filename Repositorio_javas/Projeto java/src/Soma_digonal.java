import java.util.Scanner;

public class Soma_digonal {
    public static void main(String[] args) {

        // variaveis

        int soma =0;

        // input

        Scanner input = new Scanner(System.in);

        // apresentação

        System.out.println("\n------------------------\n ---Soma da diagonal--- \n------------------------");

        //De definindo tamanho da matriz

        System.out.println("Digite o tamnho da matirz");
        int n = input.nextInt();
        int[][] A = new int[n][n];

        //Alimentando matriz

        for (int i = 0; i <A.length; i++){
            for (int j = 0; j <A[i].length; j++){
                A[i][j] = (int) (Math.random ()*10);
                System.out.print(" "+A[i][j]);

                // soma das DP

                if (i == j){
                        soma += A[i][j];
                }
            }
            System.out.println("  ");
        }

        System.out.println("Soma do elementos DP : "+ soma);
        soma = 0;

        for (int i = 0; i <A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                if ((i +j) == A.length -1){
                    soma += A[i][j];

                }
            }
        }
        System.out.println("Soma do elementos DS : "+ soma);
    }
}

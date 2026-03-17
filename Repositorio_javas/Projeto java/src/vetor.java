import java.util.Scanner;
import java.util.SortedMap;

public class vetor {
    public static void main(String[] args) {

        // vetores variavel

        float soma = 0;
        float[] notas = new float[5];

        // Input

        Scanner input = new Scanner(System.in);

        //Vetor coleta de dados

        for (int i = 0; i < 5; i++){
            System.out.println("\n Informe a nota: ");
            notas[i] = input.nextFloat();

            //Soma do valores !

            soma += notas[i];
        }

        System.out.println("\n A media das notas foi: " + soma/ 5.0 );

    }
}

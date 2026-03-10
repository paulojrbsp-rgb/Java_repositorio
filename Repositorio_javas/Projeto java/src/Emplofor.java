import java.util.Scanner;

public class Emplofor {
    public static void main (String[] args){



        Scanner Savenhago = new Scanner(System.in);

    //Obitendo informação do usuario


        System.out.println("Quantos dados de 6 lados você quer jogar?");
        int dado = Savenhago.nextInt();
        System.out.println("Qual número você quer acertar?");
        int numero = Savenhago.nextInt();
        while (numero < 1 || numero > 6){
            System.out.println("\nSeu Beta, Jumento esse dado so tem 6 lados!");
            numero = Savenhago.nextInt();
        }
        int conta = 0;
        int D1 = 0;
        int D2 = 0;
        int D3 = 0;
        int D4 = 0;
        int D5 = 0;
        int D6 = 0;

        for (int i = 1; i<= dado; i ++){
            int a = (int)(Math.random()*6+1);
            if (a == 1){
                D1++;
            } else if ( a == 2) {
                D2++;
            } else if ( a == 3) {
                D3++;
            } else if (a == 4) {
                D4++;
            } else if (a == 5){
                D5++;
            } else if (a == 6){
                D6++;
            }
            if (numero == a){
                conta = conta +1;
            }
        }
        System.out.println("\n----------------------------------\n------- Dados lançados --------\n-----------------------------\n");
        System.out.println("Número 1: " + D1 +"\nNúmero 2: " + D2 + "\nNúmero 3: " + D3 + "\nNúmero 4: "+D4+"\nNúmero 5: "+ D5 + "\nNúmero 6: "+ D6);
        System.out.println("\nVocê acertou = " + conta);
        System.out.println("\n----------------------------------------------------------");
        System.out.println("% de acerto : "+ ((float) conta / dado)* 100+"%");

    }
}

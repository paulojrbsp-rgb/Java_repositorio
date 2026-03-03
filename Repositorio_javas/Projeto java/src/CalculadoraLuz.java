import java.util.Scanner;

public class CalculadoraLuz {
    public static void main (String[] args){

        //input

        Scanner Input = new Scanner(System.in);

        // Apresentação da calculadora

        System.out.println("-------------------------------------\n---Calculadora de energia eletrica---\n-------------------------------------");
        System.out.println("\n Vamos calcular o seu consumo mensal de energia?");

        // Coleta de dados

        System.out.println("\n Informe a leitura Atual!: ");
        float leituraA = Input.nextFloat();
        System.out.println("\n informe a leitura Anterior!: ");
        float leituraAN = Input.nextFloat();
        float VKWH = 0.60f;
        float KWH = leituraA - leituraAN;

        // calculo do valor bruto

        float VB = VKWH*KWH;

        // Calcular Com a bandeira

        float VLB = 0f;
        String Bandeira = "";

        if (KWH < 100 && KWH > 0 ){
            Bandeira = "Verde";
            VLB = 0f;
        }
        else if (KWH >= 100 && KWH <= 199) {
            Bandeira = "Amarela";
            VLB = 10f;
        }
        else if (KWH >= 200 && KWH <= 299 ) {
            Bandeira = "laranja";
            VLB = 20f;
        }
        else if (KWH >= 300){
            Bandeira = "Vermelha";
            VLB = 30f;
        }
        else if (KWH < 0 ) {
            System.out.println(" Valor invalido");
            return;
        }
        //Calculando resultado liquido!

        float VLL =  VB + VLB;

        //Apresentando resultado

        System.out.println("\n--- Resultado da sua conta de luz!---\n Valor total a ser pago: "+VLL+"\n Cor da sua bandeira: " +Bandeira+"\n Valor bruto");

        // Variaveis
        // KHW: resultado do gatos em KWH pelo usuario
        // VKHW: Valor do KHW
        // VB: Valor bruto
        // VLB: Valor da bandeira
        // VLL: valor liquido a ser pago
    }
}
import java.util.Scanner;

public class While {
    public static void Persona(){

        // variaveis

        int opcao = 0;
        int R = 0; //raça
        String raca = "";

        // input

        Scanner input = new Scanner(System.in);



        System.out.println("-------- felldof ------");
        System.out.println("\nola jogador sejá bem vindo ao nosso Rpg basico\nprimeiro vamos fazer a criação do seu personagem");

        while (opcao > 0 || opcao < 3) {
            System.out.println("\nEscolha sua raça\n 1º Humano\n 2º elfo\n 3ºanão");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    R = 1;
                    raca = "Humano";
                    break;

                case 2:
                    R = 2;
                    raca = "elfo";
                    break;

                case 3:
                    R = 3;
                    raca = "anão";
                    break;

            }
        }
    }
    public static void main(String []args) {

        // input

        Scanner input = new Scanner(System.in);

        //Uso do While pode ser usado como validação ou termino de um do com swich por exemplo


        do {

            //switch precisa da entra do dado para selção das opções
            // ess entra de dado precisa ser fita dentro do do! vamos fazer um mine rpg aqui


            System.out.println("Escolha entre as opções\n\n 1º ");
            switch (opcao){

                Case 1:




            }
        }
    }
}

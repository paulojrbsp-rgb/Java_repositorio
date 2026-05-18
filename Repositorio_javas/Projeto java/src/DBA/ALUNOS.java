import javax.xml.transform.Source;
import java.sql.*;
import java.util.Scanner;

public class ALUNOS {

    public static void insereAluno(Connection conn, Scanner sc) throws SQLException {// Matricular novo aluno

        System.out.println("---------------------------\n --- Matricular anluno --- \n-----------------------------");
        System.out.println("1. Informe o Nome do aluno");
        String nome = sc.nextLine();
        boolean V;

        do {// Verificação cpf
            System.out.println("2. Informe o CPF do aluno");
            String cpf = sc.nextLine();
            cpf = cpf.replaceAll("\\D", "");//triando caracters não numericos

            if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {// returnando false
                V = false;
            }
            try {// verficação dos digitos 1º

                int soma = 0;
                int peso = 10;
                for (int i = 0; i < 9; i +) {
                    soma +=(cpf.charAt(i)-'0')* peso--;
                }
                int resto = 11 - (soma%11);
            }

        }
        while (V = false);
    }

    public static void Criartabelaa(Connection conn) throws SQLException{// Criação da tabela do aluno
        String sql = "CREATE TABLE IF NOT EXISTS Alunos ("+
                "id SERIAL PRIMARY KEY,"+
                "nome TEXT NOT NULL,"+
                "cpf TEXT  VARCHAR(11) UNIQUE NOT NULL,"+
                "telefone TEXT,"+
                "idade INTEGER NOT NULL,"+
                "endereço TEXT NOT NULL," +
                "email TEXT NOT NULL," +
                "senha TEXT NOT NULL)";


        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela cirada");
        stmt.close();
    }

    public static void main(String[] args){// Ativação do codigo

        String url = "jdbc:postgresql://localhost:5432/Star"; //Url para conectar com banco

        try {// Tentativa de connectar funcinamento base
            Scanner sc = new Scanner(System.in);//INPUT

            Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");

            // Classes puxadas
            Criartabelaa(conn);//Tabela do aluno


        }
        catch (SQLException e){
            System.out.println("Erro de connexão tente novamente");
        }
    }
}
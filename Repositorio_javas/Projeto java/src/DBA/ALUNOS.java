package DBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ALUNOS {

    public static void insere(Connection conn, Scanner cs) throws SQLException{// Matricular novo aluno

    }

    public static void Criartabelaa(Connection conn) throws SQLException{// Criação da tabela do aluno
        String sql = "CREATE TABLE IF NOT EXISTS Aluno ("+
                "id SERIAL PRIMARY KEY,"+
                "nome TEXT NOT NULL,"+
                "cpf TEXT  UNIQUE NOT NULL,"+
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

        String url = "jdbc:postgresql://localhost:5432/Aluno"; //Url para conectar com banco

        try {// Tentativa de connectar funcinamento base
            Scanner sc = new Scanner(System.in);//INPUT

            Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");

            // Classes puxadas
            Criartabelaa(conn);//aluno


        }
        catch (SQLException e){
            System.out.println("Erro de connexão tente novamente");
        }
    }
}
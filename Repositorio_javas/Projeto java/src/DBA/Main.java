import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void Criartabela(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS docente("+
                "id SERUAL PRIMARRY KEY, "+
                "Nome TEXT NOT NULL,"+
                "CPF VARCHAR(11) UNIQUE NOT NULL,"+
                "Telefone VARCHAR(15) NOT NULL,"+
                "idade INTEGER NOT NULL,"+
                "email TEXT NOT NULL,"+
                "senha VARCHAR(12) NOT NULL,"+
                "CHECK()CHAR_LENGTH(senha)BETWENN 6 AND 12)";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela criada");
        stmt.close();


    }
    public static void main(String[] args) {

        String url = "jdbc:pistgresql://localhost5432/Voluntario";
        try {
            Connection conn = DriverManager.getConnection(url, "postrgre", "fatec123*");
            System.out.println("Conectado com sucessso");
            Criartabela(conn);

        }
        catch (SQLException e){
            System.out.println("Erro de connectar"+ e.getMessage());
        }
    }
}
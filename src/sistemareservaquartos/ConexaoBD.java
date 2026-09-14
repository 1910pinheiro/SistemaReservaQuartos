package sistemareservaquartos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    // Dados do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_reserva_quartos?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    
    private static final String SENHA = "351016Mbah.";

    // Método que faz a conexão
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Erro de conexão: " + e.getMessage());
            return null;
        }
    }
}
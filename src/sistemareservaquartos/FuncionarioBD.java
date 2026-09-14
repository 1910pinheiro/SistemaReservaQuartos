
package sistemareservaquartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioBD {
    
    // Método que valida o login no banco
    public boolean validarLogin(String usuario, String senha) {
        String sql = "SELECT * FROM funcionarios WHERE usuario = ? AND senha = ?";
        
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Substitui os ? pelos valores digitados
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            // Se encontrou → login correto
            return rs.next();
            
        } catch (SQLException e) {
            System.out.println("Erro ao verificar login: " + e.getMessage());
            return false;
        }
    }
}
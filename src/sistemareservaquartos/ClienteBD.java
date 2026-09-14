
package sistemareservaquartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteBD {

    // Salvar Cliente no Banco
    public boolean salvar(String cpf, String nome, String telefone, String endereco) {
        String sql = "INSERT INTO clientes (cpf, nome, telefone, endereco) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            stmt.setString(2, nome);
            stmt.setString(3, telefone);
            stmt.setString(4, endereco);

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
            return false;
        }
    }

    // Listar TODOS os Clientes (para carregar na tabela)
    public List<String[]> listarTodos() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT id, cpf, nome, telefone, endereco FROM clientes ORDER BY nome";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String[] linha = {
                    String.valueOf(rs.getInt("id")), // ID escondido (para editar/excluir)
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("endereco")
                };
                lista.add(linha);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }

    // Editar Cliente
    public boolean editar(int id, String cpf, String nome, String telefone, String endereco) {
        String sql = "UPDATE clientes SET cpf = ?, nome = ?, telefone = ?, endereco = ? WHERE id = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cpf);
            stmt.setString(2, nome);
            stmt.setString(3, telefone);
            stmt.setString(4, endereco);
            stmt.setInt(5, id);

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
            return false;
        }
    }

    // Excluir Cliente
    public boolean excluir(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
            return false;
        }
    }
}
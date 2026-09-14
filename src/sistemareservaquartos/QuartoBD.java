
package sistemareservaquartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuartoBD {
    
    // ✅ Salvar Quarto
    public boolean salvar(String numero, String tipo, double preco, String status) {
        String sql = "INSERT INTO quartos (numero, tipo, valor_diaria, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, numero);
            stmt.setString(2, tipo);
            stmt.setDouble(3, preco);
            stmt.setString(4, status);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
            return false;
        }
    }

    // ✅ Listar TODOS os Quartos
    public List<String[]> listarTodos() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT id, numero, tipo, valor_diaria, status FROM quartos ORDER BY numero";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String[] linha = {
                    String.valueOf(rs.getInt("id")), // ID escondido
                    rs.getString("numero"),
                    rs.getString("tipo"),
                    String.valueOf(rs.getDouble("valor_diaria")),
                    rs.getString("status")
                };
                lista.add(linha);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }

    // ✅ Editar Quarto
    public boolean editar(int id, String numero, String tipo, double preco, String status) {
        String sql = "UPDATE quartos SET numero = ?, tipo = ?, valor_diaria = ?, status = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, numero);
            stmt.setString(2, tipo);
            stmt.setDouble(3, preco);
            stmt.setString(4, status);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
            return false;
        }
    }

    // ✅ Excluir Quarto
    public boolean excluir(int id) {
        String sql = "DELETE FROM quartos WHERE id = ?";
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

    // ==============================================
    // ✅ === NOVOS MÉTODOS — CHECK-IN / CHECK-OUT === ✅
    // ==============================================

    // ✅ REALIZAR CHECK-IN — Marca quarto como OCUPADO
    public boolean realizarCheckIn(int idQuarto) {
        String sql = "UPDATE quartos SET status = 'Ocupado' WHERE id = ?";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idQuarto);
            int linhas = stmt.executeUpdate();
            return linhas > 0;
        } catch (SQLException e) {
            System.out.println("Erro no Check-in: " + e.getMessage());
            return false;
        }
    }

    // ✅ REALIZAR CHECK-OUT — Marca quarto como DISPONÍVEL
    public boolean realizarCheckOut(int idQuarto) {
        String sql = "UPDATE quartos SET status = 'Disponível' WHERE id = ?";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idQuarto);
            int linhas = stmt.executeUpdate();
            return linhas > 0;
        } catch (SQLException e) {
            System.out.println("Erro no Check-out: " + e.getMessage());
            return false;
        }
    }

    // ✅ Listar Quartos OCUPADOS
    public List<String[]> listarQuartosOcupados() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT id, numero, valor_diaria FROM quartos WHERE status = 'Ocupado' ORDER BY numero";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("numero"),
                    String.valueOf(rs.getDouble("valor_diaria"))
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar quartos ocupados: " + e.getMessage());
        }
        return lista;
    }
}
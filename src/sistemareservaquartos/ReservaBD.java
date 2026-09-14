package sistemareservaquartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaBD {

    // Salvar Reserva
    public boolean salvar(int idCliente, int idQuarto, String dataEntrada, String dataSaida, double valorTotal) {
        String sql = "INSERT INTO reservas (id_cliente, id_quarto, data_entrada, data_saida, valor_total) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCliente);
            stmt.setInt(2, idQuarto);
            stmt.setString(3, dataEntrada);
            stmt.setString(4, dataSaida);
            stmt.setDouble(5, valorTotal);

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao salvar reserva: " + e.getMessage());
            return false;
        }
    }

    // Listar TODAS as Reservas (com nome do cliente e número do quarto)
    public List<String[]> listarTodas() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT r.id, c.nome AS cliente, q.numero AS quarto, " +
                     "r.data_entrada, r.data_saida, r.valor_total " +
                     "FROM reservas r " +
                     "JOIN clientes c ON r.id_cliente = c.id " +
                     "JOIN quartos q ON r.id_quarto = q.id " +
                     "ORDER BY r.data_entrada DESC";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String[] linha = {
                    String.valueOf(rs.getInt("id")), // ID da Reserva
                    rs.getString("cliente"),         // Nome do Cliente
                    rs.getString("quarto"),          // Nº do Quarto
                    rs.getString("data_entrada"),    // Data Entrada
                    rs.getString("data_saida"),      // Data Saída
                    String.valueOf(rs.getDouble("valor_total")) // Valor
                };
                lista.add(linha);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }
        return lista;
    }

    // Excluir Reserva
    public boolean excluir(int id) {
        String sql = "DELETE FROM reservas WHERE id = ?";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao excluir reserva: " + e.getMessage());
            return false;
        }
    }

    // Buscar lista de Clientes para preencher o ComboBox
    public List<String[]> listarClientes() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT id, nome FROM clientes ORDER BY nome";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("nome")
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar clientes: " + e.getMessage());
        }
        return lista;
    }

    // Buscar lista de Quartos DISPONÍVEIS para preencher o ComboBox
    public List<String[]> listarQuartosDisponiveis() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT id, numero, valor_diaria FROM quartos WHERE status = 'Disponível' ORDER BY numero";

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
            System.out.println("Erro ao carregar quartos: " + e.getMessage());
        }
        return lista;
    }
    public boolean existeConflito(int idQuarto, java.sql.Date dataEntrada, java.sql.Date dataSaida) {
        String sql = "SELECT id FROM reservas WHERE id_quarto = ? " +
                     "AND ((data_entrada <= ? AND data_saida >= ?) " +
                     "OR (data_entrada >= ? AND data_entrada <= ?))";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idQuarto);
            stmt.setDate(2, dataSaida);
            stmt.setDate(3, dataEntrada);
            stmt.setDate(4, dataEntrada);
            stmt.setDate(5, dataSaida);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Se encontrou = tem conflito
        } catch (Exception e) {
            System.out.println("Erro ao verificar conflito: " + e.getMessage());
            return false; // Em caso de erro, permite (segurança)
        }
    }
        // ✅ Pesquisar reservas por Nome do Cliente
    public List<String[]> buscarPorNome(String nome) {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT r.id, c.nome AS cliente, q.numero AS quarto, " +
                     "r.data_entrada, r.data_saida, r.status " +
                     "FROM reservas r " +
                     "JOIN clientes c ON r.id_cliente = c.id " +
                     "JOIN quartos q ON r.id_quarto = q.id " +
                     "WHERE c.nome LIKE ? ORDER BY r.data_entrada DESC";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("cliente"),
                    rs.getString("quarto"),
                    rs.getString("data_entrada"),
                    rs.getString("data_saida"),
                    rs.getString("status")
                });
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar por nome: " + e.getMessage());
        }
        return lista;
    }

    // ✅ Pesquisar reservas por NÚMERO do Quarto
    public List<String[]> buscarPorQuarto(String numeroQuarto) {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT r.id, c.nome AS cliente, q.numero AS quarto, " +
                     "r.data_entrada, r.data_saida, r.status " +
                     "FROM reservas r " +
                     "JOIN clientes c ON r.id_cliente = c.id " +
                     "JOIN quartos q ON r.id_quarto = q.id " +
                     "WHERE q.numero LIKE ? ORDER BY r.data_entrada DESC";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + numeroQuarto + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("cliente"),
                    rs.getString("quarto"),
                    rs.getString("data_entrada"),
                    rs.getString("data_saida"),
                    rs.getString("status")
                });
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar por quarto: " + e.getMessage());
        }
        return lista;
    }
}
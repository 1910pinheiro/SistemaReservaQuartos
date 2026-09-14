package sistemareservaquartos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PagamentoBD {

    // ✅ Registrar NOVO Pagamento
    public boolean salvar(int idReserva, String dataPagamento, double valorPago, String formaPagamento, String observacoes) {
        String sql = "INSERT INTO pagamentos (id_reserva, data_pagamento, valor_pago, forma_pagamento, observacoes) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idReserva);
            stmt.setString(2, dataPagamento);
            stmt.setDouble(3, valorPago);
            stmt.setString(4, formaPagamento);
            stmt.setString(5, observacoes);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao registrar pagamento: " + e.getMessage());
            return false;
        }
    }

    // ✅ Listar TODOS os Pagamentos (com dados da reserva)
    public List<String[]> listarTodos() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT p.id, c.nome AS cliente, q.numero AS quarto, " +
                     "p.data_pagamento, p.valor_pago, p.forma_pagamento, p.observacoes " +
                     "FROM pagamentos p " +
                     "JOIN reservas r ON p.id_reserva = r.id " +
                     "JOIN clientes c ON r.id_cliente = c.id " +
                     "JOIN quartos q ON r.id_quarto = q.id " +
                     "ORDER BY p.data_pagamento DESC";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("cliente"),
                    rs.getString("quarto"),
                    rs.getString("data_pagamento"),
                    String.valueOf(rs.getDouble("valor_pago")),
                    rs.getString("forma_pagamento"),
                    rs.getString("observacoes")
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar pagamentos: " + e.getMessage());
        }
        return lista;
    }

    // ✅ Excluir Pagamento
    public boolean excluir(int id) {
        String sql = "DELETE FROM pagamentos WHERE id = ?";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao excluir pagamento: " + e.getMessage());
            return false;
        }
    }
}
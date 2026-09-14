package model;

public class Pagamento {
    
    private int id;
    private int idReserva;
    private double valor;
    private String formaPagamento;
    private String status; // Pendente, Pago, Cancelado

    
    public Pagamento() {
    }

    
    public Pagamento(int id, int idReserva, double valor,
                     String formaPagamento, String status) {
        this.id = id;
        this.idReserva = idReserva;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Para aparecer nas listas: "Reserva 5 - R$ 450,90 - PAGO"
    @Override
    public String toString() {
        return "Reserva Nº " + idReserva + " | R$ " + String.format("%.2f", valor) + " - " + status;
    }
}
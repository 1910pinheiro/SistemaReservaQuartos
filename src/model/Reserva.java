package model;

public class Reserva {
    
    private int id;
    private int idCliente;
    private int idQuarto;
    private String dataEntrada;
    private String dataSaida;
    private String status; // Confirmada, Check-In, Check-Out, Cancelada

    // Construtor vazio
    public Reserva() {
    }

    // Construtor completo
    public Reserva(int id, int idCliente, int idQuarto,
                   String dataEntrada, String dataSaida, String status) {
        this.id = id;
        this.idCliente = idCliente;
        this.idQuarto = idQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Para aparecer bonitinho na caixa de seleção: "Reserva Nº 5 - 25/12 → 27/12"
    @Override
    public String toString() {
        return "Reserva Nº " + id + " | Entrada: " + dataEntrada + " | Saída: " + dataSaida + " - " + status;
    }
}
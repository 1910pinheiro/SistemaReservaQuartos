package model;

public class Quarto {
    
    private int id;
    private String numero;
    private String tipo;
    private double valorDiaria;
    private String status;  // Disponível / Ocupado / Em Manutenção

    // Construtor vazio
    public Quarto() {
    }

    // Construtor completo
    public Quarto(int id, String numero, String tipo, double valorDiaria, String status) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Para aparecer na caixa de seleção: "Nº 101 - Suíte"
    @Override
    public String toString() {
        return "Nº " + numero + " - " + tipo;
    }
}
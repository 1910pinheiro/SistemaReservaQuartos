package sistemareservaquartos;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public class pnlCheckInOut extends javax.swing.JPanel {

    private List<String[]> listaReservas;
    private List<String[]> listaQuartos;

    
    public pnlCheckInOut() {
        initComponents();
        carregarReservas();
        carregarTabela();
    }

    // Carrega as reservas no ComboBox
    public void carregarReservas() {
        cboReserva.removeAllItems();
        cboReserva.addItem("Selecione uma Reserva...");

        ReservaBD reservaBD = new ReservaBD();
        listaReservas = reservaBD.listarTodas();

        for (String[] reserva : listaReservas) {
            // reserva[1]=Cliente, reserva[2]=Quarto, reserva[3]=Entrada, reserva[0]=ID
            cboReserva.addItem(reserva[1] + " | Quarto " + reserva[2] + " | Entrada: " + reserva[3]);
        }
    }

    // Carrega a tabela de movimentos
    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblMovimentos.getModel();
        modelo.setRowCount(0);

        ReservaBD reservaBD = new ReservaBD();
        List<String[]> lista = reservaBD.listarTodas();
        for (String[] r : lista) {
            modelo.addRow(new Object[]{
                r[1],    // Cliente
                r[2],    // Quarto
                r[3],    // Entrada
                r[4],    // Saída
                "Pendente" // Status
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblReserva = new javax.swing.JLabel();
        cboReserva = new javax.swing.JComboBox<>();
        lblDataEntrada = new javax.swing.JLabel();
        txtDataEntrada = new javax.swing.JTextField();
        lblDataSaida = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMovimentos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(560, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("Controle de Check-In / Check-Out");

        lblReserva.setForeground(new java.awt.Color(51, 51, 51));
        lblReserva.setText("Reserva:");

        cboReserva.setBackground(new java.awt.Color(255, 255, 255));
        cboReserva.setEditable(true);
        cboReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Reserva" }));

        lblDataEntrada.setForeground(new java.awt.Color(51, 51, 51));
        lblDataEntrada.setText("Data de Entrada:");

        txtDataEntrada.setBackground(new java.awt.Color(255, 255, 255));

        lblDataSaida.setForeground(new java.awt.Color(51, 51, 51));
        lblDataSaida.setText("Data de Saída:");

        txtDataSaida.setBackground(new java.awt.Color(255, 255, 255));

        lblObservacoes.setForeground(new java.awt.Color(51, 51, 51));
        lblObservacoes.setText("Observações:");

        txtObservacoes.setBackground(new java.awt.Color(255, 255, 255));
        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        btnCheckIn.setBackground(new java.awt.Color(0, 153, 0));
        btnCheckIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckIn.setText("Realizar Check-In");
        btnCheckIn.addActionListener(this::btnCheckInActionPerformed);

        btnCheckOut.setBackground(new java.awt.Color(255, 102, 0));
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("Realizar Check-Out");
        btnCheckOut.addActionListener(this::btnCheckOutActionPerformed);

        tblMovimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente ", "Quarto ", "Entrada ", "Saída ", "Status "
            }
        ));
        jScrollPane2.setViewportView(tblMovimentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckOut))
                    .addComponent(lblTitulo)
                    .addComponent(lblDataEntrada)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblObservacoes)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDataSaida)
                            .addGap(30, 30, 30)
                            .addComponent(txtDataSaida))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReserva)
                                .addGap(61, 61, 61)
                                .addComponent(cboReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReserva)
                    .addComponent(cboReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataEntrada)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataSaida)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservacoes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckIn)
                    .addComponent(btnCheckOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
                                             
     int indiceReserva = cboReserva.getSelectedIndex();
        String entrada = txtDataEntrada.getText().trim();

        // Validações
        if (indiceReserva <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Selecione uma Reserva!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (entrada.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Digite a Data de Entrada!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Pega os dados da reserva selecionada
            String[] reservaSel = listaReservas.get(indiceReserva - 1);
            String numeroQuarto = reservaSel[2]; // Número do quarto
            int idReserva = Integer.parseInt(reservaSel[0]); // ID da reserva

            // Busca o ID do quarto pelo número
            QuartoBD quartoBD = new QuartoBD();
            List<String[]> todosQuartos = quartoBD.listarTodos();
            int idQuarto = -1;
            for (String[] q : todosQuartos) {
                if (q[1].trim().equals(numeroQuarto.trim())) {
                    idQuarto = Integer.parseInt(q[0]);
                    break;
                }
            }

            if (idQuarto == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Quarto não encontrado na reserva!", 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // REALIZA O CHECK-IN — Muda status para OCUPADO
            boolean ok = quartoBD.realizarCheckIn(idQuarto);
            if (ok) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "✅ CHECK-IN REALIZADO COM SUCESSO!\n" +
                    "Quarto " + numeroQuarto + " agora está OCUPADO.", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

                // Atualiza a tabela
                carregarTabela();
                carregarReservas();
                txtDataEntrada.setText("");
                txtObservacoes.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "❌ Erro ao realizar Check-In!", 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "❌ Erro: " + e.getMessage(), 
                "Erro", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        
                                             
        }                                   
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
                                               
    int indiceReserva = cboReserva.getSelectedIndex();
        String saida = txtDataSaida.getText().trim();

        if (indiceReserva <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Selecione uma Reserva primeiro!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (saida.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Digite a Data de Saída!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Pega os dados da reserva selecionada
            String[] reservaSel = listaReservas.get(indiceReserva - 1);
            String numeroQuarto = reservaSel[2];

            // Busca o ID do quarto
            QuartoBD quartoBD = new QuartoBD();
            List<String[]> todosQuartos = quartoBD.listarTodos();
            int idQuarto = -1;
            for (String[] q : todosQuartos) {
                if (q[1].trim().equals(numeroQuarto.trim())) {
                    idQuarto = Integer.parseInt(q[0]);
                    break;
                }
            }

            if (idQuarto == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Quarto não encontrado!", 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            // REALIZA O CHECK-OUT — Muda status para DISPONÍVEL
            boolean ok = quartoBD.realizarCheckOut(idQuarto);
            if (ok) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "✅ CHECK-OUT REALIZADO COM SUCESSO!\n" +
                    "Quarto " + numeroQuarto + " agora está DISPONÍVEL.", 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

                // Atualiza tudo
                carregarTabela();
                carregarReservas();
                txtDataSaida.setText("");
                txtObservacoes.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "❌ Erro ao realizar Check-Out!", 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "❌ Erro: " + e.getMessage(), 
                "Erro", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
                                              
    }//GEN-LAST:event_btnCheckOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JComboBox<String> cboReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblDataSaida;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMovimentos;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataSaida;
    private javax.swing.JTextArea txtObservacoes;
    // End of variables declaration//GEN-END:variables
}

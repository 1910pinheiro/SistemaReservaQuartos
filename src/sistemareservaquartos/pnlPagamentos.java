package sistemareservaquartos;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class pnlPagamentos extends javax.swing.JPanel {

    private List<String[]> listaReservas;

  
    public pnlPagamentos() {
        initComponents();
        carregarReservas();
        carregarTabela();
    }

    // Carrega reservas na caixa de seleção
    private void carregarReservas() {
        cboReserva.removeAllItems();
        cboReserva.addItem("Selecione uma Reserva...");

        ReservaBD reservaBD = new ReservaBD();
        listaReservas = reservaBD.listarTodas();

        for (String[] r : listaReservas) {
            // r[1]=Cliente, r[2]=Quarto, r[4]=Valor total
            cboReserva.addItem(r[1] + " | Quarto " + r[2] + " | R$ " + r[4]);
        }
    }

    // Carrega pagamentos salvos no banco na tabela
    private void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tblPagamentos.getModel();
        modelo.setRowCount(0);

        PagamentoBD pgtoBD = new PagamentoBD();
        List<String[]> lista = pgtoBD.listarTodos();

        for (String[] p : lista) {
            modelo.addRow(new Object[]{
                p[1],    // Cliente
                p[2],    // Quarto
                p[3],    // Data Pagamento
                p[4],    // Valor Pago
                p[5]     // Forma Pagamento
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
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblFormaPagto = new javax.swing.JLabel();
        cboFormaPagto = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagamentos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(560, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Registro de Pagamentos");

        lblReserva.setForeground(new java.awt.Color(51, 51, 51));
        lblReserva.setText("Reserva:");

        cboReserva.setBackground(new java.awt.Color(255, 255, 255));
        cboReserva.setForeground(new java.awt.Color(51, 51, 51));
        cboReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lista de reservas" }));

        lblValor.setForeground(new java.awt.Color(51, 51, 51));
        lblValor.setText("Valor Total (R$):");

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.addActionListener(this::txtValorActionPerformed);

        lblFormaPagto.setForeground(new java.awt.Color(51, 51, 51));
        lblFormaPagto.setText("Forma de Pagamento:");

        cboFormaPagto.setBackground(new java.awt.Color(255, 255, 255));
        cboFormaPagto.setForeground(new java.awt.Color(51, 51, 51));
        cboFormaPagto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de Crédito", "Cartão de Débito", "PIX", "Transferência Bancária" }));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar Pagamento");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        tblPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reserva ", "Valor ", "Entrada ", "Saída ", "Status "
            }
        ));
        jScrollPane1.setViewportView(tblPagamentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValor)
                                    .addComponent(lblReserva))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValor)
                                    .addComponent(cboReserva, 0, 153, Short.MAX_VALUE)))
                            .addComponent(btnRegistrar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblFormaPagto)
                                .addGap(22, 22, 22)
                                .addComponent(cboFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReserva)
                    .addComponent(cboReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormaPagto)
                    .addComponent(cboFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
                                              
    int indiceReserva = cboReserva.getSelectedIndex();
        String valorTexto = txtValor.getText().trim();
        String forma = cboFormaPagto.getSelectedItem() != null ? cboFormaPagto.getSelectedItem().toString() : "";

        //  Validações
        if (indiceReserva <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Selecione uma Reserva!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (valorTexto.isEmpty() || forma.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Preencha o Valor e a Forma de Pagamento!", 
                "Atenção", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            //  Pega a data de hoje e converte pro formato do banco
            String dataPgto = java.time.LocalDate.now().toString(); // AAAA-MM-DD

            //  Converte valor (aceita vírgula)
            double valor = Double.parseDouble(valorTexto.replace(",", "."));

            //  Pega o ID da reserva selecionada
            int idReserva = Integer.parseInt(listaReservas.get(indiceReserva - 1)[0]);

            //  SALVA NO BANCO DE DADOS!
            PagamentoBD pgtoBD = new PagamentoBD();
            boolean ok = pgtoBD.salvar(idReserva, dataPgto, valor, forma, "");

            if (ok) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "✅ Pagamento REGISTRADO com sucesso!\nValor: R$ " + String.format("%.2f", valor), 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

                //  Atualiza tudo
                carregarTabela();
                carregarReservas();
                txtValor.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "❌ Erro ao salvar no Banco de Dados!", 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "❌ Valor inválido! Digite apenas números (ex: 401,00)", 
                "Erro", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "❌ Erro: " + e.getMessage(), 
                "Erro", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }                                   
                                         
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboFormaPagto;
    private javax.swing.JComboBox<String> cboReserva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormaPagto;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tblPagamentos;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

package sistemareservaquartos;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class pnlReservas extends javax.swing.JPanel {
       
    private List<String[]> listaClientes;
    private List<String[]> listaQuartos;
    private double precoDiaria = 0.0;
    
    public pnlReservas() {
        initComponents();
        carregarComboBoxes();
        carregarTabela();
    }
    
    // Carrega e atualiza a tabela com a lista de reservas
    public void carregarTabela() {
        ReservaBD bd = new ReservaBD();
        List<String[]> lista = bd.listarTodas();
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        modelo.setRowCount(0);
        for (String[] reserva : lista) {
            modelo.addRow(new Object[]{
                reserva[1], // Cliente
                reserva[2], // Quarto
                reserva[3], // Entrada
                reserva[4], // Saída
                "Excluir"   // Ações
            });
        }
    }
    
    //  Atualiza tabela com lista filtrada
    private void atualizarTabela(List<String[]> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tblReservas.getModel();
        modelo.setRowCount(0);
        for (String[] reserva : lista) {
            modelo.addRow(new Object[]{
                reserva[1], // Cliente
                reserva[2], // Quarto
                reserva[3], // Entrada
                reserva[4], // Saída
                "Excluir"   // Ações
            });
        }
    }
    
    //  Preenche as caixas de seleção com Clientes e Quartos
    public void carregarComboBoxes() {
        ReservaBD bd = new ReservaBD();
        // Carrega Clientes
        listaClientes = bd.listarClientes();
        cboCliente.removeAllItems();
        cboCliente.addItem("Selecione um cliente...");
        for (String[] cli : listaClientes) {
            cboCliente.addItem(cli[1]);
        }
        // Carrega Quartos Disponíveis
        listaQuartos = bd.listarQuartosDisponiveis();
        cboQuarto.removeAllItems();
        cboQuarto.addItem("Selecione um quarto...");
        for (String[] qt : listaQuartos) {
            cboQuarto.addItem(qt[1] + " — R$ " + qt[2]);
        }
    }
    
    //  Calcula o valor total automaticamente
    private void calcularValorTotal() {
        String entrada = txtDataEntrada.getText().trim();
        String saida = txtDataSaida.getText().trim();
        if (entrada.length() >= 8 && saida.length() >= 8 && precoDiaria > 0) {
            try {
                java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("dd/MM/yyyy");
                java.util.Date dtEntrada = fmt.parse(entrada);
                java.util.Date dtSaida = fmt.parse(saida);
                long dias = (dtSaida.getTime() - dtEntrada.getTime()) / (1000 * 60 * 60 * 24);
                if (dias > 0) {
                    double total = dias * precoDiaria;
                    System.out.println("Valor total: R$ " + String.format("%.2f", total));
                }
            } catch (Exception e) { }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        lblQuarto = new javax.swing.JLabel();
        cboQuarto = new javax.swing.JComboBox<>();
        lblDataEntrada = new javax.swing.JLabel();
        txtDataEntrada = new javax.swing.JTextField();
        lblDataSaida = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(560, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastro de Reservas");

        lblCliente.setForeground(new java.awt.Color(51, 51, 51));
        lblCliente.setText("Cliente:");

        cboCliente.setBackground(new java.awt.Color(255, 255, 255));
        cboCliente.setForeground(new java.awt.Color(51, 51, 51));
        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Cliente" }));

        lblQuarto.setForeground(new java.awt.Color(51, 51, 51));
        lblQuarto.setText("Quarto:");

        cboQuarto.setBackground(new java.awt.Color(255, 255, 255));
        cboQuarto.setForeground(new java.awt.Color(51, 51, 51));
        cboQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Quarto" }));
        cboQuarto.addItemListener(this::cboQuartoItemStateChanged);

        lblDataEntrada.setForeground(new java.awt.Color(51, 51, 51));
        lblDataEntrada.setText("Data de Entrada:");

        txtDataEntrada.setBackground(new java.awt.Color(255, 255, 255));

        lblDataSaida.setForeground(new java.awt.Color(51, 51, 51));
        lblDataSaida.setText("Data de Saída:");

        txtDataSaida.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar.setBackground(new java.awt.Color(51, 51, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar Reserva");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        tblReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente ", "Quarto ", "Entrada ", "Saída ", "Ações "
            }
        ));
        tblReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCliente)
                                    .addComponent(lblQuarto)
                                    .addComponent(lblDataEntrada)
                                    .addComponent(lblDataSaida))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboCliente, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cboQuarto, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtDataSaida)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuarto)
                    .addComponent(cboQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataSaida)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
          
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
                                                                                              
        txtDataEntrada.setText("");
        txtDataSaida.setText("");
        cboCliente.setSelectedIndex(0);
        cboQuarto.setSelectedIndex(0);
                                             
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                                                                                                                                                                                                                              
                                                                                                                     
        int indiceCliente = cboCliente.getSelectedIndex();
        int indiceQuarto = cboQuarto.getSelectedIndex();
        String dataEntrada = txtDataEntrada.getText().trim();
        String dataSaida = txtDataSaida.getText().trim();
        
        // Validação: não pode estar vazio
        if (indiceCliente <= 0 || indiceQuarto <= 0 || dataEntrada.isEmpty() || dataSaida.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha TODOS os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            //  Converte datas do formato BR (DD/MM/AAAA) para o formato do Banco (AAAA-MM-DD)
            java.text.SimpleDateFormat fmtEntrada = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date dtEnt = fmtEntrada.parse(dataEntrada);
            java.util.Date dtSai = fmtEntrada.parse(dataSaida);
            
            //  Formato que o MySQL ACEITA!
            java.text.SimpleDateFormat fmtBanco = new java.text.SimpleDateFormat("yyyy-MM-dd");
            String dataEntradaBanco = fmtBanco.format(dtEnt);
            String dataSaidaBanco = fmtBanco.format(dtSai);
            
            //  GARANTIR o preço do quarto ANTES de calcular!
            if (indiceQuarto > 0 && listaQuartos != null) {
                precoDiaria = Double.parseDouble(listaQuartos.get(indiceQuarto - 1)[2]);
            }
            
            //  Bloqueia se preço estiver ZERO!
            if (precoDiaria <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "❌ Preço do quarto não encontrado!\nClique na setinha e SELECIONE o quarto NOVAMENTE.", 
                    "Preço Inválido", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //  Calcula dias e valor
            long dias = (dtSai.getTime() - dtEnt.getTime()) / (1000 * 60 * 60 * 24);
            if (dias <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Data de Saída deve ser DEPOIS da Entrada!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            double valorTotal = dias * precoDiaria;
            
            //  Pega os IDs
            int idCliente = Integer.parseInt(listaClientes.get(indiceCliente - 1)[0]);
            int idQuarto = Integer.parseInt(listaQuartos.get(indiceQuarto - 1)[0]);

            // =============================================================
            //  VALIDAÇÃO DE CONFLITOS — BLOQUEIA QUARTO JÁ RESERVADO!
            // =============================================================
            ReservaBD reservaBD = new ReservaBD();
            java.sql.Date dtEntradaSql = java.sql.Date.valueOf(dataEntradaBanco);
            java.sql.Date dtSaidaSql = java.sql.Date.valueOf(dataSaidaBanco);
            
            if (reservaBD.existeConflito(idQuarto, dtEntradaSql, dtSaidaSql)) {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "⚠️ ESSE QUARTO JÁ ESTÁ RESERVADO NAS DATAS SELECIONADAS!\nEscolha outro período ou outro quarto.",
                    "CONFLITO DE RESERVA",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                return; // ⛳ PARA AQUI! NÃO SALVA!
            }
            // =============================================================
            
            //  SALVA com as datas NO FORMATO CERTO!
            ReservaBD bd = new ReservaBD();
            if (bd.salvar(idCliente, idQuarto, dataEntradaBanco, dataSaidaBanco, valorTotal)) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "✅ Reserva SALVA com sucesso!\n" +
                    "Valor total: R$ " + String.format("%.2f", valorTotal), 
                    "Sucesso", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                txtDataEntrada.setText("");
                txtDataSaida.setText("");
                cboCliente.setSelectedIndex(0);
                cboQuarto.setSelectedIndex(0);
                carregarComboBoxes();
                carregarTabela();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "❌ Erro ao salvar no banco!\n" +
                    "• Quarto já reservado?\n" +
                    "• Datas corretas?\n" +
                    "• Valor: R$ " + String.format("%.2f", valorTotal), 
                    "Erro", 
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "❌ Erro: " + e.getMessage() + "\nDigite a data assim: DD/MM/AAAA", 
                "Data Inválida", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
   
   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservasMouseClicked
                                             
    int linha = tblReservas.rowAtPoint(evt.getPoint());
    int coluna = tblReservas.columnAtPoint(evt.getPoint());

    if (linha >= 0 && coluna == 4) {
        String nomeCliente = tblReservas.getValueAt(linha, 0).toString();
        String numeroQuarto = tblReservas.getValueAt(linha, 1).toString();

        ReservaBD bd = new ReservaBD();
        int idParaExcluir = -1;

        for (String[] r : bd.listarTodas()) {
            if (r[1].equals(nomeCliente) && r[2].equals(numeroQuarto)) {
                idParaExcluir = Integer.parseInt(r[0]);
                break;
            }
        }

        if (idParaExcluir == -1) return;

        int opcao = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Tem certeza que deseja EXCLUIR esta reserva?", 
            "Confirmar Exclusão", 
            javax.swing.JOptionPane.YES_NO_OPTION);

        if (opcao == javax.swing.JOptionPane.YES_OPTION) {
            if (bd.excluir(idParaExcluir)) {
                javax.swing.JOptionPane.showMessageDialog(this, "✅ Reserva EXCLUÍDA!");
                carregarComboBoxes();
                carregarTabela();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "❌ Erro ao excluir!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                         
    }//GEN-LAST:event_tblReservasMouseClicked

    private void cboQuartoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboQuartoItemStateChanged
        int indice = cboQuarto.getSelectedIndex();
        if (indice > 0 && listaQuartos != null) {
            // Pega o preço do quarto selecionado
            precoDiaria = Double.parseDouble(listaQuartos.get(indice - 1)[2]);
        }
    }//GEN-LAST:event_cboQuartoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboQuarto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblDataSaida;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblReservas;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataSaida;
    // End of variables declaration//GEN-END:variables
}

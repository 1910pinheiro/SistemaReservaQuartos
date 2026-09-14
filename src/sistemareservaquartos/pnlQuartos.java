
package sistemareservaquartos;
import java.util.List;
public class pnlQuartos extends javax.swing.JPanel {
        private int idQuartoSelecionado = -1;

    public pnlQuartos() {
        initComponents();
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cboStatus = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuartos = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(560, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 580));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastro de Quartos");

        lblNumero.setForeground(new java.awt.Color(51, 51, 51));
        lblNumero.setText("Nº do Quarto:");

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));

        lblTipo.setForeground(new java.awt.Color(51, 51, 51));
        lblTipo.setText("Tipo:");

        cboTipo.setBackground(new java.awt.Color(255, 255, 255));
        cboTipo.setForeground(new java.awt.Color(51, 51, 51));
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Duplo", "Suíte", "Luxo" }));

        lblPreco.setForeground(new java.awt.Color(51, 51, 51));
        lblPreco.setText("Preço (R$):");

        txtPreco.setBackground(new java.awt.Color(255, 255, 255));

        lblStatus.setForeground(new java.awt.Color(51, 51, 51));
        lblStatus.setText("Status:");

        cboStatus.setBackground(new java.awt.Color(255, 255, 255));
        cboStatus.setForeground(new java.awt.Color(51, 51, 51));
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Ocupado", "Em Manutenção" }));

        btnSalvar.setBackground(new java.awt.Color(0, 51, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        tblQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nº", " Tipo", "Preço  ", "Status      "
            }
        ));
        jScrollPane1.setViewportView(tblQuartos);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTitulo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumero)
                                    .addComponent(lblTipo)
                                    .addComponent(lblPreco)
                                    .addComponent(lblStatus))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumero)
                                    .addComponent(cboTipo, 0, 116, Short.MAX_VALUE)
                                    .addComponent(txtPreco)
                                    .addComponent(cboStatus, 0, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)
                                .addGap(53, 53, 53)))
                        .addComponent(btnExcluir)
                        .addGap(54, 54, 54)
                        .addComponent(btnLimpar)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitulo)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //  Carrega quartos do banco na tabela
    public void carregarTabela() {
        QuartoBD bd = new QuartoBD();
        List<String[]> lista = bd.listarTodos();

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblQuartos.getModel();
        modelo.setRowCount(0); // Limpa

        for (String[] quarto : lista) {
            modelo.addRow(new Object[]{
                quarto[1], // Número
                quarto[2], // Tipo
                "R$ " + quarto[3], // Preço formatado
                quarto[4]  // Status
            });
        }
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                                                                                  
        String numero = txtNumero.getText().trim();
        String tipo = cboTipo.getSelectedItem().toString();
        String precoTexto = txtPreco.getText().trim();
        String status = cboStatus.getSelectedItem().toString();

        if (numero.isEmpty() || precoTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha TODOS os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        double preco;
        try {
            preco = Double.parseDouble(precoTexto.replace(",", "."));
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite um preço válido! Ex: 150.50", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        QuartoBD bd = new QuartoBD();
        boolean ok;

        if (idQuartoSelecionado > 0) {
            ok = bd.editar(idQuartoSelecionado, numero, tipo, preco, status);
            idQuartoSelecionado = -1;
        } else {
            ok = bd.salvar(numero, tipo, preco, status);
        }

        if (ok) {
            javax.swing.JOptionPane.showMessageDialog(this, "✅ Quarto SALVO com sucesso!");
            txtNumero.setText("");
            txtPreco.setText("");
            cboTipo.setSelectedIndex(0);
            cboStatus.setSelectedIndex(0);
            txtNumero.requestFocus();
            carregarTabela();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "❌ Erro! Número já cadastrado ou dados inválidos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }                                                                         
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                                               
        int linha = tblQuartos.getSelectedRow();
        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um quarto na tabela para EDITAR!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numero = tblQuartos.getValueAt(linha, 0).toString();
        QuartoBD bd = new QuartoBD();
        for (String[] q : bd.listarTodos()) {
            if (q[1].equals(numero)) {
                idQuartoSelecionado = Integer.parseInt(q[0]);
                txtNumero.setText(q[1]);
                cboTipo.setSelectedItem(q[2]);
                txtPreco.setText(q[3]);
                cboStatus.setSelectedItem(q[4]);
                break;
            }
        }

        javax.swing.JOptionPane.showMessageDialog(this, "✏️ Edite os dados e clique em SALVAR!");
                                           
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                                                   
        int linha = tblQuartos.getSelectedRow();
        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um quarto para EXCLUIR!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String numero = tblQuartos.getValueAt(linha, 0).toString();
        QuartoBD bd = new QuartoBD();
        int idParaExcluir = -1;

        for (String[] q : bd.listarTodos()) {
            if (q[1].equals(numero)) {
                idParaExcluir = Integer.parseInt(q[0]);
                break;
            }
        }

        if (idParaExcluir == -1) return;

        if (bd.excluir(idParaExcluir)) {
            javax.swing.JOptionPane.showMessageDialog(this, "✅ Quarto EXCLUÍDO com sucesso!");
            carregarTabela();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "❌ Erro ao excluir!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
                                             
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
                                                  
   txtNumero.setText("");
cboTipo.setSelectedIndex(0);
txtPreco.setText("");
cboStatus.setSelectedIndex(0);
txtNumero.requestFocus();                                       
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblQuartos;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}

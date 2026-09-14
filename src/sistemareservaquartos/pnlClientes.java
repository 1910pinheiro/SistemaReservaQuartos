
package sistemareservaquartos;


import javax.swing.*;
import javax.swing.table.*;
import java.util.List;   // ← ADICIONE ESTA LINHA AQUI!

public class pnlClientes extends javax.swing.JPanel {
private int idClienteSelecionado = -1;
    public pnlClientes() {
        initComponents();
        carregarTabela();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(720, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Cadastro de Clientes");

        lblCpf.setForeground(new java.awt.Color(51, 51, 51));
        lblCpf.setText("CPF:");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setForeground(new java.awt.Color(51, 51, 51));
        lblNome.setText("Nome Completo:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));

        lblTelefone.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefone.setText("Telefone:");

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));

        lblEndereco.setForeground(new java.awt.Color(51, 51, 51));
        lblEndereco.setText("Endereço:");

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar.setBackground(new java.awt.Color(51, 51, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(47, 47, 47)
                                .addComponent(btnEditar)
                                .addGap(49, 49, 49)
                                .addComponent(btnExcluir)
                                .addGap(46, 46, 46)
                                .addComponent(btnLimpar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblEndereco)
                                    .addComponent(lblCpf))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //  Carrega todos os clientes do banco na tabela
    public void carregarTabela() {
        ClienteBD bd = new ClienteBD();
        List<String[]> lista = bd.listarTodos();

        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0); // Limpa a tabela

        for (String[] cliente : lista) {
            modelo.addRow(new Object[]{
                cliente[1], // CPF
                cliente[2], // Nome
                cliente[3], // Telefone
                cliente[4]  // Endereço
            });
        }
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                                                 
        String cpf = txtCpf.getText().trim();
        String nome = txtNome.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();

        if (cpf.isEmpty() || nome.isEmpty() || telefone.isEmpty() || endereco.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha TODOS os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        ClienteBD bd = new ClienteBD();
        boolean ok;

        
        if (idClienteSelecionado > 0) {
            ok = bd.editar(idClienteSelecionado, cpf, nome, telefone, endereco);
            idClienteSelecionado = -1; // Reseta
        } else {
            ok = bd.salvar(cpf, nome, telefone, endereco);
        }

        if (ok) {
            javax.swing.JOptionPane.showMessageDialog(this, "✅ Cliente SALVO com sucesso!");
            // Limpa campos
            txtCpf.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtEndereco.setText("");
            txtCpf.requestFocus();
            // Atualiza tabela
            carregarTabela();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "❌ Erro ao salvar! CPF pode já estar cadastrado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }                                    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                                              
        int linhaSelecionada = tblClientes.getSelectedRow();
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente na tabela para EXCLUIR!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

       
        String cpf = tblClientes.getValueAt(linhaSelecionada, 0).toString();
        ClienteBD bd = new ClienteBD();

        
        int idParaExcluir = -1;
        for (String[] cli : bd.listarTodos()) {
            if (cli[1].equals(cpf)) {
                idParaExcluir = Integer.parseInt(cli[0]);
                break;
            }
        }

        if (idParaExcluir == -1) return;

        if (bd.excluir(idParaExcluir)) {
            javax.swing.JOptionPane.showMessageDialog(this, "✅ Cliente EXCLUÍDO com sucesso!");
            carregarTabela();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "❌ Erro ao excluir!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }                                         
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
     txtCpf.setText("");
txtNome.setText("");
txtTelefone.setText("");
txtEndereco.setText("");
txtCpf.requestFocus();

javax.swing.JOptionPane.showMessageDialog(this, "Campos LIMPOS! ✅");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                                                
        int linhaSelecionada = tblClientes.getSelectedRow();
        if (linhaSelecionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente na tabela para EDITAR!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

      
        String cpf = tblClientes.getValueAt(linhaSelecionada, 0).toString();
        String nome = tblClientes.getValueAt(linhaSelecionada, 1).toString();
        String telefone = tblClientes.getValueAt(linhaSelecionada, 2).toString();
        String endereco = tblClientes.getValueAt(linhaSelecionada, 3).toString();

        
        ClienteBD bd = new ClienteBD();
        for (String[] cli : bd.listarTodos()) {
            if (cli[1].equals(cpf)) {
                idClienteSelecionado = Integer.parseInt(cli[0]);
                break;
            }
        }

        
        txtCpf.setText(cpf);
        txtNome.setText(nome);
        txtTelefone.setText(telefone);
        txtEndereco.setText(endereco);
        txtNome.requestFocus();

        javax.swing.JOptionPane.showMessageDialog(this, "✏️ Edite os dados e clique em SALVAR!");
                                            
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

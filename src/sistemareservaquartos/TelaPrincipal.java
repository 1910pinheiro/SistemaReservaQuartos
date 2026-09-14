
package sistemareservaquartos;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

    public TelaPrincipal() {
        initComponents();
        setSize(850,800);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblNomeSistema = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnQuartos = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnCheckInOut = new javax.swing.JButton();
        btnPagamentos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnlConteudo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 700));
        setResizable(false);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(220, 650));

        lblNomeSistema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeSistema.setForeground(new java.awt.Color(51, 51, 51));
        lblNomeSistema.setText("Sistema de Reservas");

        btnClientes.setBackground(new java.awt.Color(51, 51, 255));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnQuartos.setBackground(new java.awt.Color(51, 51, 255));
        btnQuartos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuartos.setForeground(new java.awt.Color(255, 255, 255));
        btnQuartos.setText("Quartos");
        btnQuartos.addActionListener(this::btnQuartosActionPerformed);

        btnReservas.setBackground(new java.awt.Color(51, 51, 255));
        btnReservas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("Reservas");
        btnReservas.addActionListener(this::btnReservasActionPerformed);

        btnCheckInOut.setBackground(new java.awt.Color(51, 51, 255));
        btnCheckInOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckInOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckInOut.setText("Check-in / Check-out");
        btnCheckInOut.addActionListener(this::btnCheckInOutActionPerformed);

        btnPagamentos.setBackground(new java.awt.Color(51, 51, 255));
        btnPagamentos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamentos.setText("Pagamentos");
        btnPagamentos.addActionListener(this::btnPagamentosActionPerformed);

        btnSair.setBackground(new java.awt.Color(255, 51, 102));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSistema)
                    .addComponent(btnClientes)
                    .addComponent(btnQuartos)
                    .addComponent(btnPagamentos)
                    .addComponent(btnSair)
                    .addComponent(btnCheckInOut)
                    .addComponent(btnReservas))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblNomeSistema)
                .addGap(90, 90, 90)
                .addComponent(btnClientes)
                .addGap(18, 18, 18)
                .addComponent(btnQuartos)
                .addGap(18, 18, 18)
                .addComponent(btnReservas)
                .addGap(18, 18, 18)
                .addComponent(btnCheckInOut)
                .addGap(18, 18, 18)
                .addComponent(btnPagamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(48, 48, 48))
        );

        pnlConteudo.setBackground(new java.awt.Color(255, 255, 255));
        pnlConteudo.setPreferredSize(new java.awt.Dimension(1250, 900));
        pnlConteudo.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
            .addComponent(pnlConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       pnlConteudo.removeAll();
       pnlClientes painel = new pnlClientes();
       pnlConteudo.add(painel, java.awt.BorderLayout.CENTER);
       pnlConteudo.revalidate();
       pnlConteudo.repaint();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartosActionPerformed
        pnlConteudo.removeAll();
        pnlQuartos painel = new pnlQuartos();
        pnlConteudo.add(painel, java.awt.BorderLayout.CENTER);
        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }//GEN-LAST:event_btnQuartosActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        pnlConteudo.removeAll();
        pnlReservas painel = new pnlReservas();
        pnlConteudo.add(painel, java.awt.BorderLayout.CENTER);
        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnCheckInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInOutActionPerformed
        pnlConteudo.removeAll();
        pnlCheckInOut painel = new pnlCheckInOut();
        pnlConteudo.add(painel, java.awt.BorderLayout.CENTER);
        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }//GEN-LAST:event_btnCheckInOutActionPerformed

    private void btnPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentosActionPerformed
        pnlConteudo.removeAll();
        pnlPagamentos painel = new pnlPagamentos();
        pnlConteudo.add(painel, java.awt.BorderLayout.CENTER);
        pnlConteudo.revalidate();
        pnlConteudo.repaint();
    }//GEN-LAST:event_btnPagamentosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckInOut;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnPagamentos;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblNomeSistema;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}

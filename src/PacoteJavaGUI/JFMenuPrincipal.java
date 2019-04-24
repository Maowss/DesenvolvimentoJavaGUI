package PacoteJavaGUI;

import javax.swing.JOptionPane;

public class JFMenuPrincipal extends javax.swing.JFrame {

    public JFMenuPrincipal() {
        initComponents();
    }

    JFMenuPrincipal(String nome) {
        initComponents();
        lblUsuarioLogin.setText(nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrincipal = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnImpressos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblUsuarioLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ABC Menu ");

        lblPrincipal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblPrincipal.setText("Principal");

        btnFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/funcionario.png"))); // NOI18N
        btnFuncionario.setText("Funcionário");
        btnFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/fornecedor.png"))); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnCaixa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/caixa.png"))); // NOI18N
        btnCaixa.setText("Caixa");
        btnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });

        btnProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/products.png"))); // NOI18N
        btnProdutos.setText("Produtos");
        btnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/user.png"))); // NOI18N
        btnUsuario.setText("Usuário");
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnImpressos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImpressos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/printer.png"))); // NOI18N
        btnImpressos.setText("Impressos");
        btnImpressos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImpressos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImpressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressosActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteJavaGUI/imagens/flesha_1.png"))); // NOI18N
        btnVoltar.setText("Deslogar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioLogin)
                .addGap(284, 284, 284)
                .addComponent(lblPrincipal)
                .addContainerGap(368, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImpressos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrincipal)
                    .addComponent(lblUsuarioLogin))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFuncionario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFornecedor)
                        .addComponent(btnCaixa)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdutos)
                    .addComponent(btnUsuario)
                    .addComponent(btnImpressos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnVoltar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        PacoteJavaGUI.JFGerenciarProdutos frame = new PacoteJavaGUI.JFGerenciarProdutos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        PacoteJavaGUI.JFLogin frame = new PacoteJavaGUI.JFLogin();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed

        JFGerenciarFuncionarios openFunc = new JFGerenciarFuncionarios();
        openFunc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        PacoteJavaGUI.JFFornecedor frame = new PacoteJavaGUI.JFFornecedor();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        PacoteJavaGUI.JFCaixa frame = new PacoteJavaGUI.JFCaixa();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCaixaActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        PacoteJavaGUI.JFUsuario frame = new PacoteJavaGUI.JFUsuario();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnImpressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressosActionPerformed
        PacoteJavaGUI.JFImpressos frame = new PacoteJavaGUI.JFImpressos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImpressosActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnImpressos;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}

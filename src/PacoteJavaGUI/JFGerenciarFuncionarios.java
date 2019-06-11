package PacoteJavaGUI;

import javax.swing.JOptionPane;

public class JFGerenciarFuncionarios extends javax.swing.JFrame {

    Funcionarios novo = new Funcionarios();
    
    public JFGerenciarFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblTelefoe = new javax.swing.JLabel();
        txtEmailFuncionario = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelefoneFuncionario = new javax.swing.JTextField();
        txtEnderecoFuncion = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLimparFuncionario = new javax.swing.JButton();
        btnVoltarFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnInserirFuncionario = new javax.swing.JButton();
        btnNovoFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        lblRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRG.setText("RG");

        txtNomeFuncionario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncionarioActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCPF.setText("CPF");

        lblTelefoe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelefoe.setText("Telefone");

        txtEmailFuncionario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEndereco.setText("Endereco");

        txtRg.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email");

        txtTelefoneFuncionario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTelefoneFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneFuncionarioActionPerformed(evt);
            }
        });

        txtEnderecoFuncion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEnderecoFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoFuncionActionPerformed(evt);
            }
        });

        txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###-###-###-##"))));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblEndereco)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTelefoe)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblRG)
                            .addComponent(lblEmail)
                            .addComponent(lblNome))
                        .addGap(57, 57, 57)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(txtRg)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEnderecoFuncion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeFuncionario)
                    .addComponent(txtCpf))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCpf))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoe)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEnderecoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gerenciar Funcionarios");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnLimparFuncionario.setText("Limpar");
        btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncionarioActionPerformed(evt);
            }
        });

        btnVoltarFuncionario.setText("Voltar");
        btnVoltarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setText("Alterar");
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnInserirFuncionario.setText("Inserir");
        btnInserirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirFuncionarioActionPerformed(evt);
            }
        });

        btnNovoFuncionario.setText("Novo");
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInserirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparFuncionario)
                    .addComponent(btnVoltarFuncionario)
                    .addComponent(btnAlterarFuncionario)
                    .addComponent(btnInserirFuncionario)
                    .addComponent(btnNovoFuncionario))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoFuncionActionPerformed

    private void txtTelefoneFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFuncionarioActionPerformed

    private void txtNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
//        String nomeFuncionario = txtNomeFuncionario.getText();
//        String emailFuncionario = txtEmailFuncionario.getText();
//        String rgFuncionario = txtRGFuncionario.getText();
//        String cpfFuncionario = txtCPFFuncionario.getText();
//        String telefoneFuncionario = txtTelefoneFuncionario.getText();
//        String enderecoFuncionario = txtEnderecoFuncionario.getText();

        //Funcionarios novo = new Funcionarios();

        if (novo.getNomeFuncionario().equals("") || novo.getEmailFuncionario().equals("") 
                || novo.getRgFuncionario().equals("") || novo.getCpfFuncionario().equals("") 
                || novo.getTelefoneFuncionario().equals("") || novo.getEnderecoFuncionario().equals("")) {
            JOptionPane.showMessageDialog(null, "Um dos campos ainda esta em branco");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            txtNomeFuncionario.setText("");
            txtEmailFuncionario.setText("");
            txtRg.setText("");
            txtCpf.setText("");
            txtTelefoneFuncionario.setText("");
            txtEnderecoFuncion.setText("");
        }
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnVoltarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarFuncionarioActionPerformed
        JFMenuPrincipal voltarFMenu = new JFMenuPrincipal();
        voltarFMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarFuncionarioActionPerformed

    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed

        JOptionPane.showMessageDialog(null, "Limpo com sucesso");
        txtNomeFuncionario.setText("");
        txtEmailFuncionario.setText("");
        txtRg.setText("");
        txtCpf.setText("");
        txtTelefoneFuncionario.setText("");
        txtEnderecoFuncion.setText("");
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void btnInserirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirFuncionarioActionPerformed

        if (novo.getNomeFuncionario().equals("") || novo.getEmailFuncionario().equals("") || novo.getRgFuncionario().equals("")
                || novo.getCpfFuncionario().equals("") || novo.getTelefoneFuncionario().equals("")
                || novo.getEnderecoFuncionario().equals("")) {
            JOptionPane.showMessageDialog(null, "Um dos campos ainda esta em branco");
        } else {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            txtNomeFuncionario.setText("");
            txtEmailFuncionario.setText("");
            txtRg.setText("");
            txtCpf.setText("");
            txtTelefoneFuncionario.setText("");
            txtEnderecoFuncion.setText("");
        }

//        JOptionPane.showMessageDialog(null, "Inserido com sucesso");
//        txtNomeFuncionario.setText("");
//        txtEmailFuncionario.setText("");
//        txtRGFuncionario.setText("");
//        txtCPFFuncionario.setText("");
//        txtTelefoneFuncionario.setText("");
//        txtEnderecoFuncionario.setText("");
    }//GEN-LAST:event_btnInserirFuncionarioActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed

        JOptionPane.showMessageDialog(null, "Alterado com sucesso");

    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnInserirFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnVoltarFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblTelefoe;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEnderecoFuncion;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}

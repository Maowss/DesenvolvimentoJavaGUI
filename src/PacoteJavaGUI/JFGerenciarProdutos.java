package PacoteJavaGUI;
public class JFGerenciarProdutos extends javax.swing.JFrame {

    public JFGerenciarProdutos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSolicitaçãoCompra = new javax.swing.ButtonGroup();
        bgAtualizaEstoque = new javax.swing.ButtonGroup();
        panelProdutos = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblCodInterno = new javax.swing.JLabel();
        lblTipoProduto = new javax.swing.JLabel();
        lblCodigoBarras = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtCodInterno = new javax.swing.JTextField();
        txtTipoProduto = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        lblReferencia = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        cbCompraSim = new javax.swing.JRadioButton();
        cbCompraNao = new javax.swing.JRadioButton();
        lblSolicitacaoCompra = new javax.swing.JLabel();
        lblAtualizaEstoque = new javax.swing.JLabel();
        btnEstoqueSim = new javax.swing.JRadioButton();
        btnEstoqueNao = new javax.swing.JRadioButton();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelBotoes = new javax.swing.JPanel();
        btnVoltarMenu = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescricao.setText("Descrição Principal");

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCategoria.setText("Categoria");

        lblCodInterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodInterno.setText("Código Interno");

        lblTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTipoProduto.setText("Tipo de Produto");

        lblCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigoBarras.setText("Código de Barras");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCodInterno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCodBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblReferencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblReferencia.setText("Referência");

        txtReferencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bgSolicitaçãoCompra.add(cbCompraSim);
        cbCompraSim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCompraSim.setForeground(new java.awt.Color(0, 153, 0));
        cbCompraSim.setText("Sim");
        cbCompraSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompraSimActionPerformed(evt);
            }
        });

        bgSolicitaçãoCompra.add(cbCompraNao);
        cbCompraNao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCompraNao.setForeground(new java.awt.Color(255, 0, 0));
        cbCompraNao.setText("Não");
        cbCompraNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCompraNaoActionPerformed(evt);
            }
        });

        lblSolicitacaoCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSolicitacaoCompra.setText("Solicitação Compra");

        lblAtualizaEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAtualizaEstoque.setText("Atualiza Estoque");

        bgAtualizaEstoque.add(btnEstoqueSim);
        btnEstoqueSim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstoqueSim.setForeground(new java.awt.Color(51, 153, 0));
        btnEstoqueSim.setText("Sim");
        btnEstoqueSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueSimActionPerformed(evt);
            }
        });

        bgAtualizaEstoque.add(btnEstoqueNao);
        btnEstoqueNao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstoqueNao.setForeground(new java.awt.Color(255, 0, 51));
        btnEstoqueNao.setText("Não");
        btnEstoqueNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoBarras)
                            .addComponent(lblReferencia)
                            .addComponent(lblTipoProduto)
                            .addComponent(lblCodInterno))
                        .addGap(44, 44, 44)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblCategoria))
                        .addGap(34, 34, 34)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtDescricao))))
                .addGap(63, 63, 63)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSolicitacaoCompra)
                    .addComponent(lblAtualizaEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addComponent(btnEstoqueSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstoqueNao))
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addComponent(cbCompraSim)
                        .addGap(10, 10, 10)
                        .addComponent(cbCompraNao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoria)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCompraSim)
                            .addComponent(cbCompraNao)
                            .addComponent(lblSolicitacaoCompra))
                        .addGap(18, 18, 18)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtualizaEstoque)
                            .addComponent(btnEstoqueSim)
                            .addComponent(btnEstoqueNao))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodInterno)
                    .addComponent(txtCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoProduto))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoBarras)
                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReferencia))
                .addGap(28, 28, 28))
        );

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        panelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTitulo.setToolTipText("");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gerenciar Produtos");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(589, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap())
        );

        panelBotoes.setBackground(new java.awt.Color(0, 0, 0));

        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotoesLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(682, Short.MAX_VALUE)))
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotoesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
    JFMenuPrincipal frame = new JFMenuPrincipal();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void cbCompraSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompraSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCompraSimActionPerformed

    private void cbCompraNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCompraNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCompraNaoActionPerformed

    private void btnEstoqueSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoqueSimActionPerformed

    private void btnEstoqueNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstoqueNaoActionPerformed

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
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAtualizaEstoque;
    private javax.swing.ButtonGroup bgSolicitaçãoCompra;
    private javax.swing.JRadioButton btnEstoqueNao;
    private javax.swing.JRadioButton btnEstoqueSim;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JRadioButton cbCompraNao;
    private javax.swing.JRadioButton cbCompraSim;
    private javax.swing.JLabel lblAtualizaEstoque;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodInterno;
    private javax.swing.JLabel lblCodigoBarras;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JLabel lblSolicitacaoCompra;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelProdutos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtCodInterno;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
}

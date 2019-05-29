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
        lblPreco = new javax.swing.JLabel();
        lblTipoProduto = new javax.swing.JLabel();
        lblCodigoBarras = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtTipoProduto = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        cbCompraSim = new javax.swing.JRadioButton();
        cbCompraNao = new javax.swing.JRadioButton();
        lblSolicitacaoCompra = new javax.swing.JLabel();
        lblAtualizaEstoque = new javax.swing.JLabel();
        btnEstoqueSim = new javax.swing.JRadioButton();
        btnEstoqueNao = new javax.swing.JRadioButton();
        lblDescricao1 = new javax.swing.JLabel();
        txtDescricao1 = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        panelBotoes = new javax.swing.JPanel();
        btnVoltarMenu = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPreco.setText("Preço");

        lblTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTipoProduto.setText("Tipo de Produto");

        lblCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigoBarras.setText("Código de Barras");

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTipoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCodBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bgSolicitaçãoCompra.add(cbCompraSim);
        cbCompraSim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCompraSim.setForeground(new java.awt.Color(0, 153, 0));
        cbCompraSim.setText("Sim");

        bgSolicitaçãoCompra.add(cbCompraNao);
        cbCompraNao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCompraNao.setForeground(new java.awt.Color(255, 0, 0));
        cbCompraNao.setText("Não");

        lblSolicitacaoCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSolicitacaoCompra.setText("Solicitação Compra");

        lblAtualizaEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAtualizaEstoque.setText("Atualiza Estoque");

        bgAtualizaEstoque.add(btnEstoqueSim);
        btnEstoqueSim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstoqueSim.setForeground(new java.awt.Color(51, 153, 0));
        btnEstoqueSim.setText("Sim");

        bgAtualizaEstoque.add(btnEstoqueNao);
        btnEstoqueNao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstoqueNao.setForeground(new java.awt.Color(255, 0, 51));
        btnEstoqueNao.setText("Não");

        lblDescricao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescricao1.setText("Nome");

        txtDescricao1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantidade.setText("Quantidade");

        panelBotoes.setBackground(new java.awt.Color(0, 0, 0));

        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMenuMouseClicked(evt);
            }
        });

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarProdutoMouseClicked(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarProduto)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addGap(120, 120, 120)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelProdutosLayout.createSequentialGroup()
                                .addComponent(txtDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(cbCompraNao))))))
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelProdutosLayout.createSequentialGroup()
                                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoProduto)
                                    .addComponent(lblCodigoBarras))
                                .addGap(28, 28, 28)
                                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelProdutosLayout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(338, 338, 338)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelProdutosLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(lblDescricao1)
                    .addContainerGap(708, Short.MAX_VALUE)))
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProdutosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCompraSim)
                            .addComponent(cbCompraNao)
                            .addComponent(lblSolicitacaoCompra)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtualizaEstoque)
                    .addComponent(btnEstoqueSim)
                    .addComponent(btnEstoqueNao)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoProduto)
                    .addComponent(txtTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoBarras))
                .addGap(26, 26, 26)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addGap(18, 18, 18)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelProdutosLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(lblDescricao1)
                    .addContainerGap(294, Short.MAX_VALUE)))
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Quantidade", "Código de Barras", "Tipo de Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(panelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarProdutoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarProdutoMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnVoltarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarMenuMouseClicked

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
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGerenciarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGerenciarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgAtualizaEstoque;
    private javax.swing.ButtonGroup bgSolicitaçãoCompra;
    private javax.swing.JButton btnEditar;
    private javax.swing.JRadioButton btnEstoqueNao;
    private javax.swing.JRadioButton btnEstoqueSim;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JRadioButton cbCompraNao;
    private javax.swing.JRadioButton cbCompraSim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAtualizaEstoque;
    private javax.swing.JLabel lblCodigoBarras;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSolicitacaoCompra;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelProdutos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtDescricao1;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
}

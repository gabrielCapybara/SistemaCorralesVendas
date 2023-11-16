/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import query.JDlgConsultaCliente;
import query.JDlgConsultaProdutos;
import query.JDlgConsultaUsuarios;
import query.JDlgConsultaVendedor;

/**
 *
 * @author TSUIIKUII
 */
public class JFrmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmTelaPrincipal
     */
    public JFrmTelaPrincipal() {
         initComponents();
        setTitle("Sistema de Venda de Materiais de Artesanato");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        Tool1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        Tool2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        Tool3 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        Tool4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jMnuVendedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuConsultas = new javax.swing.JMenu();
        jConsult1 = new javax.swing.JMenuItem();
        jConsult2 = new javax.swing.JMenuItem();
        jConsult3 = new javax.swing.JMenuItem();
        jConsult4 = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        Tool1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor.png"))); // NOI18N
        Tool1.setFocusable(false);
        Tool1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tool1.setMaximumSize(new java.awt.Dimension(60, 45));
        Tool1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tool1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tool1ActionPerformed(evt);
            }
        });
        jToolBar1.add(Tool1);
        jToolBar1.add(jSeparator4);

        Tool2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/order_product_online_ecommerce_market_buy_icon_176857.png"))); // NOI18N
        Tool2.setFocusable(false);
        Tool2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tool2.setMaximumSize(new java.awt.Dimension(60, 45));
        Tool2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tool2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tool2ActionPerformed(evt);
            }
        });
        jToolBar1.add(Tool2);
        jToolBar1.add(jSeparator5);

        Tool3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        Tool3.setFocusable(false);
        Tool3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tool3.setMaximumSize(new java.awt.Dimension(60, 45));
        Tool3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tool3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tool3ActionPerformed(evt);
            }
        });
        jToolBar1.add(Tool3);
        jToolBar1.add(jSeparator6);

        Tool4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit_1.png"))); // NOI18N
        Tool4.setFocusable(false);
        Tool4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tool4.setMaximumSize(new java.awt.Dimension(60, 45));
        Tool4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Tool4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tool4ActionPerformed(evt);
            }
        });
        jToolBar1.add(Tool4);

        jMnuCadastros.setMnemonic('C');
        jMnuCadastros.setText("Principal");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/male-user-add_25347.png"))); // NOI18N
        jMnuClientes.setText("Cliente");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuClientes);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Female-user-add_25430.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/order_product_online_ecommerce_market_buy_icon_176857.png"))); // NOI18N
        jMnuProdutos.setText("Produtos");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProdutos);

        jMnuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor.png"))); // NOI18N
        jMnuVendedor.setText("Vendedor");
        jMnuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendedorActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuVendedor);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit_1.png"))); // NOI18N
        jMnuSair.setMnemonic('S');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMnuConsultas.setText("Consultas");

        jConsult1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/male-user-add_25347.png"))); // NOI18N
        jConsult1.setText("Cliente");
        jConsult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsult1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jConsult1);

        jConsult2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Female-user-add_25430.png"))); // NOI18N
        jConsult2.setText("Usuários");
        jConsult2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsult2ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jConsult2);

        jConsult3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/order_product_online_ecommerce_market_buy_icon_176857.png"))); // NOI18N
        jConsult3.setText("Produtos");
        jConsult3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsult3ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jConsult3);

        jConsult4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor.png"))); // NOI18N
        jConsult4.setText("Vendedor");
        jConsult4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsult4ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jConsult4);

        jMenuBar1.add(jMnuConsultas);

        jMnuMovimento.setMnemonic('M');
        jMnuMovimento.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/etiqueta-de-venda.png"))); // NOI18N
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimento.add(jMnuVendas);

        jMenuBar1.add(jMnuMovimento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed
        // TODO add your handling code here:
        JDlgProdutosNovo jDlgProdutos = new JDlgProdutosNovo(null, true);
        jDlgProdutos.setVisible(true);
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        // TODO add your handling code here:
        JDlgCliente jDlgCliente = new JDlgCliente(null, true);
        jDlgCliente.setVisible(true);
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendedorActionPerformed
        // TODO add your handling code here:
        JDlgVendedorNovo jDlgVendedor = new JDlgVendedorNovo(null, true);
        jDlgVendedor.setVisible(true);
    }//GEN-LAST:event_jMnuVendedorActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        // TODO add your handling code here:
        JDlgVendas jDlgVendas = new JDlgVendas(null, true);
        jDlgVendas.setVisible(true); 
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jConsult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsult1ActionPerformed
        // TODO add your handling code here:
        JDlgConsultaCliente jDlgConsultaCliente = new JDlgConsultaCliente(null,true);
        jDlgConsultaCliente.setVisible(true);
    }//GEN-LAST:event_jConsult1ActionPerformed

    private void jConsult3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsult3ActionPerformed
        // TODO add your handling code here:
        JDlgConsultaProdutos jDlgConsultaProdutos = new JDlgConsultaProdutos(null,true);
        jDlgConsultaProdutos.setVisible(true);
    }//GEN-LAST:event_jConsult3ActionPerformed

    private void jConsult2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsult2ActionPerformed
        // TODO add your handling code here:
        JDlgConsultaUsuarios jDlgConsultaUsuarios = new JDlgConsultaUsuarios(null,true);
        jDlgConsultaUsuarios.setVisible(true);
    }//GEN-LAST:event_jConsult2ActionPerformed

    private void jConsult4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsult4ActionPerformed
        // TODO add your handling code here:
        JDlgConsultaVendedor jDlgConsultaVendedor = new JDlgConsultaVendedor(null,true);
        jDlgConsultaVendedor.setVisible(true);
    }//GEN-LAST:event_jConsult4ActionPerformed

    private void Tool1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tool1ActionPerformed
        // TODO add your handling code here:
         JDlgVendedorNovo jDlgVendedor = new JDlgVendedorNovo(null, true);
        jDlgVendedor.setVisible(true);
    }//GEN-LAST:event_Tool1ActionPerformed

    private void Tool2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tool2ActionPerformed
        // TODO add your handling code here:
        JDlgProdutosNovo jDlgProdutos = new JDlgProdutosNovo(null, true);
        jDlgProdutos.setVisible(true);
    }//GEN-LAST:event_Tool2ActionPerformed

    private void Tool3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tool3ActionPerformed
        // TODO add your handling code here:
         JDlgVendas jDlgVendas = new JDlgVendas(null, true);
        jDlgVendas.setVisible(true); 
    }//GEN-LAST:event_Tool3ActionPerformed

    private void Tool4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tool4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Tool4ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tool1;
    private javax.swing.JButton Tool2;
    private javax.swing.JButton Tool3;
    private javax.swing.JButton Tool4;
    private javax.swing.JMenuItem jConsult1;
    private javax.swing.JMenuItem jConsult2;
    private javax.swing.JMenuItem jConsult3;
    private javax.swing.JMenuItem jConsult4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenu jMnuConsultas;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JMenuItem jMnuVendedor;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsUsuarios;
import dao.GhsUsuarios_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author TSUIIKUII
 */
public class JDlgUsuarios extends javax.swing.JDialog {

     private boolean incluindo;
    //variavel global declarada entre o construtor e a classe private boolean incluindo;
    //pode colocar em qualquer local menos no metodo
    //variável global é definida quando declaramos uma variável fora de qualquer função
    
    MaskFormatter mascaraCPF, mascaraDataNascimento;

    public GhsUsuarios ghsUsuarios;
    public GhsUsuarios_DAO ghsUsuarios_DAO;
    
    /**
     * Creates new form JDlgUsuarios
     */
    public JDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Util.habilitar(false, idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtbExcluir, jBtnPesquisar);
        
        setTitle("Cadastro de usuários");
        setLocationRelativeTo(null);
       
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraDataNascimento = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        gbs_cpf.setFormatterFactory( new DefaultFormatterFactory(mascaraCPF));
        gbs_dataNascimento.setFormatterFactory( new DefaultFormatterFactory(mascaraDataNascimento));
        
    }

    public GhsUsuarios viewBean(){
        GhsUsuarios ghsUsuarios = new GhsUsuarios();
        
        ghsUsuarios.setIdgbsUsuarios( Util.strInt(idgbs_usuarios.getText()));
        ghsUsuarios.setGbsDataNascimento( Util.strDate(gbs_dataNascimento.getText()));
        ghsUsuarios.setGbsNome(gbs_nome.getText());
        ghsUsuarios.setGbsCpf(gbs_cpf.getText());
        ghsUsuarios.setGbsApelido(gbs_apelido.getText());
       ghsUsuarios.setGbsSenha(gbs_senha.getText());
       ghsUsuarios.setGbsAtivo(gbs_ativo.getText());
       ghsUsuarios.setGbsNivel(gbs_nivel.getSelectedIndex());
       if (gbs_ativo.isSelected()== true) {
            ghsUsuarios.setGbsAtivo("S");
        } else {
            ghsUsuarios.setGbsAtivo("N");
        }
       
      
        
        return ghsUsuarios;
     }
     
     public void beanView(GhsUsuarios ghsUsuarios) {
        idgbs_usuarios.setText( Util.intStr(ghsUsuarios.getIdgbsUsuarios()));
        gbs_nome.setText(ghsUsuarios.getGbsNome());
        gbs_cpf.setText(ghsUsuarios.getGbsCpf());
        gbs_apelido.setText(ghsUsuarios.getGbsApelido());
        gbs_senha.setText(ghsUsuarios.getGbsSenha());
        gbs_cpf.setText(ghsUsuarios.getGbsCpf());
        gbs_dataNascimento.setText( Util.Datestr(ghsUsuarios.getGbsDataNascimento()));
        gbs_nivel.setSelectedIndex(ghsUsuarios.getGbsNivel());
        if ( ghsUsuarios.getGbsAtivo().equals("S") == true){
          gbs_ativo.setSelected(true);
        } else {
        gbs_ativo.setSelected(false);    
        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnConfirmar = new javax.swing.JButton();
        gbs_dataNascimento = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        gbs_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idgbs_usuarios = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gbs_nivel = new javax.swing.JComboBox<>();
        gbs_nome = new javax.swing.JTextField();
        gbs_ativo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtbExcluir = new javax.swing.JButton();
        gbs_apelido = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        gbs_cpf = new javax.swing.JFormattedTextField();
        jBtnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        gbs_dataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_dataNascimentoActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        gbs_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_senhaActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel6.setText("Senha");

        jLabel7.setText("Nível");

        jLabel2.setText("Nome");

        gbs_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gbs_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_nivelActionPerformed(evt);
            }
        });

        gbs_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_nomeActionPerformed(evt);
            }
        });

        gbs_ativo.setText("Ativo");
        gbs_ativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_ativoActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Apelido");

        jBtbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtbExcluir.setText("Excluir");
        jBtbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        gbs_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_cpfActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de Nascimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(idgbs_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(gbs_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                    .addComponent(jLabel6)
                                    .addComponent(gbs_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(gbs_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gbs_ativo))
                                    .addComponent(gbs_dataNascimento)))
                            .addComponent(gbs_apelido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gbs_nome))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idgbs_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbs_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbs_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gbs_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gbs_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gbs_ativo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gbs_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtbExcluir)
                        .addComponent(jBtnAlterar)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        ghsUsuarios = viewBean();
        if (incluindo ==true ){
        ghsUsuarios_DAO.insert(ghsUsuarios);}
        else{
               ghsUsuarios_DAO.update(ghsUsuarios);
                }
           Util.habilitar(false);
        Util.limparCampos(idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void gbs_dataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_dataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_dataNascimentoActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
       JDlgUsuarioPesquisa jDlgUsuarioPesquisa = new JDlgUsuarioPesquisa(null, true);
        jDlgUsuarioPesquisa.setTelaAnterior(this);
        jDlgUsuarioPesquisa.setVisible(true);
        
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void gbs_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_senhaActionPerformed

    private void gbs_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_nivelActionPerformed

    private void gbs_ativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_ativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_ativoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtbExcluir, jBtnPesquisar);
        incluindo = true;

        Util.limparCampos(idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbExcluirActionPerformed
        // TODO add your handling code here:
        if (Util.perguntar("Deseja excluir o registro?") == true) {
                GhsUsuarios ghsUsuarios = viewBean();
                ghsUsuarios_DAO.delete(ghsUsuarios);
          
            } else {
                Util.mensagem("Exclusão cancelada");
            }
            
        Util.limparCampos(idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);

    }//GEN-LAST:event_jBtbExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void gbs_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_cpfActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false);
        Util.mensagem("Cancelamento concluido");
        Util.limparCampos(idgbs_usuarios, gbs_nome, gbs_apelido, gbs_cpf, gbs_dataNascimento, gbs_nivel, gbs_ativo, jBtnConfirmar, jBtnCancelar, gbs_senha);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void gbs_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgUsuarios dialog = new JDlgUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gbs_apelido;
    private javax.swing.JCheckBox gbs_ativo;
    private javax.swing.JFormattedTextField gbs_cpf;
    private javax.swing.JFormattedTextField gbs_dataNascimento;
    private javax.swing.JComboBox<String> gbs_nivel;
    private javax.swing.JTextField gbs_nome;
    private javax.swing.JPasswordField gbs_senha;
    private javax.swing.JTextField idgbs_usuarios;
    private javax.swing.JButton jBtbExcluir;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

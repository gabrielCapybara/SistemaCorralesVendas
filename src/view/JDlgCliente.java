/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsCliente;
import dao.GhsCliente_DAO;
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


public class JDlgCliente extends javax.swing.JDialog {

      private boolean incluindo;
    public GhsCliente_DAO ghsCliente_DAO;
    public GhsCliente ghsCliente;
      
    MaskFormatter mascaraCPF, mascaraDataNascimento, mascaraTel, mascaraIdade, mascaraRg, mascaraCep, mascaraCel;
    
    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Cadastro de Cliente");
        initComponents();
        setLocationRelativeTo(null);
        
        ghsCliente_DAO = new GhsCliente_DAO();
        
        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(true, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);
     
        setLocationRelativeTo(null);
         try {
             mascaraCPF = new MaskFormatter("###.###.###-##");
             mascaraDataNascimento = new MaskFormatter("##/##/####");
             mascaraTel = new MaskFormatter("##-####-####");
             mascaraRg = new MaskFormatter("##.###.###-#");
             mascaraIdade = new MaskFormatter("##");
             mascaraCel = new MaskFormatter("#####-####");
             mascaraCep = new MaskFormatter("#####-###");
         } catch (ParseException ex) {
             Logger.getLogger(JDlgCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        ghs_cpf.setFormatterFactory( new DefaultFormatterFactory(mascaraCPF));
        gbs_dataNascimento.setFormatterFactory( new DefaultFormatterFactory(mascaraDataNascimento));
        gbs_celular.setFormatterFactory( new DefaultFormatterFactory(mascaraCel));
        gbs_rg.setFormatterFactory( new DefaultFormatterFactory(mascaraRg));
        gbs_idade.setFormatterFactory( new DefaultFormatterFactory(mascaraIdade));
        gbs_telefoneResidencial.setFormatterFactory( new DefaultFormatterFactory(mascaraTel));
        ghs_cep.setFormatterFactory( new DefaultFormatterFactory(mascaraCep));
         
    }
        public GhsCliente viewBean(){
         GhsCliente ghsCliente = new GhsCliente();   
            
        ghsCliente.setIdgbsCliente( Util.strInt(idgbs_cliente.getText()));
         ghsCliente.setGhsNome(ghs_nome.getText());
         ghsCliente.setGhsCpf(ghs_cpf.getText());
        ghsCliente.setGbsRg(gbs_rg.getText());
        ghsCliente.setGbsSexo(ghs_sexo.getSelectedIndex());
         
         ghsCliente.setGbsDataNascimento( Util.strDate(gbs_dataNascimento.getText()));
         ghsCliente.setGbsEmail(gbs_email.getText());
         ghsCliente.setGbsEndereco(gbs_endereco.getText());
         ghsCliente.setGbsBairro(gbs_bairro.getText());
         ghsCliente.setGbsCidade(gbs_cidade.getText());
         ghsCliente.setGbsTelefoneResidencial(gbs_telefoneResidencial.getText());
         ghsCliente.setGbsCelular(gbs_celular.getText());
         ghsCliente.setGbsEstado(gbs_estado.getText());
         
         ghsCliente.setGbsIdade( Util.strInt(gbs_idade.getText()));
         
         ghsCliente.setGbsRegiao(gbs_regiao.getText());
         
         ghsCliente.setGhsCep(ghs_cep.getText());
         
                 
      
        
        return ghsCliente;
     }
     
     public void beanView(GhsCliente ghsCliente) {
        idgbs_cliente.setText( Util.intStr(ghsCliente.getIdgbsCliente()));
        ghs_nome.setText(ghsCliente.getGhsNome());
        ghs_cpf.setText(ghsCliente.getGhsCpf());
        gbs_rg.setText(ghsCliente.getGbsRg());
        ghs_sexo.setSelectedIndex(ghsCliente.getGbsSexo());
       gbs_dataNascimento.setText( Util.Datestr(ghsCliente.getGbsDataNascimento()));
        gbs_email.setText(ghsCliente.getGbsEmail());
        gbs_endereco.setText(ghsCliente.getGbsEndereco());
        gbs_bairro.setText(ghsCliente.getGbsBairro());
        gbs_cidade.setText(ghsCliente.getGbsCidade());
        gbs_telefoneResidencial.setText(ghsCliente.getGbsTelefoneResidencial());
        gbs_celular.setText(ghsCliente.getGbsCelular());
        gbs_estado.setText(ghsCliente.getGbsEstado());
        gbs_idade.setText(Util.intStr(ghsCliente.getGbsIdade()));
        gbs_regiao.setText(ghsCliente.getGbsRegiao());
        ghs_cep.setText(ghsCliente.getGhsCep());
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ghs_cep = new javax.swing.JFormattedTextField();
        gbs_endereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gbs_rg = new javax.swing.JFormattedTextField();
        gbs_telefoneResidencial = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        gbs_email = new javax.swing.JTextField();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        gbs_celular = new javax.swing.JFormattedTextField();
        gbs_dataNascimento = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        gbs_idade = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idgbs_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        gbs_regiao = new javax.swing.JTextField();
        gbs_estado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        gbs_cidade = new javax.swing.JTextField();
        ghs_nome = new javax.swing.JTextField();
        gbs_bairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ghs_cpf = new javax.swing.JFormattedTextField();
        ghs_sexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("RG");

        jLabel15.setText("Telefone Residencial");

        gbs_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbs_rgActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de Nascimento");

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel6.setText("E-mail");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel7.setText("Celular");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Idade");

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel9.setText("Região");

        jLabel16.setText("Código");

        jLabel10.setText("Estado");

        jLabel11.setText("Cidade");

        jLabel12.setText("Bairro");

        jLabel13.setText("Endereço");

        jLabel14.setText("CEP");

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        ghs_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "feminino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gbs_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ghs_nome)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(179, 179, 179)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel4)
                                                        .addComponent(gbs_telefoneResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                        .addComponent(ghs_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ghs_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8)
                                                .addComponent(gbs_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                            .addGap(261, 261, 261)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(gbs_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(gbs_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gbs_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))))
                            .addGap(11, 11, 11)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(gbs_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gbs_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(ghs_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(gbs_regiao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(gbs_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(gbs_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(383, 383, 383)))
                    .addComponent(jLabel16)
                    .addComponent(idgbs_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idgbs_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghs_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ghs_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_telefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbs_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbs_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbs_regiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbs_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gbs_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gbs_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = true;

        Util.limparCampos(idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, jBtnConfirmar, jBtnCancelar, ghs_cep);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        ghsCliente = viewBean();
       if (Util.perguntar("Deseja excluir o registro?") == true) {
                GhsCliente ghsCliente = viewBean();
                ghsCliente_DAO.delete(ghsCliente);
          
            } else {
                Util.mensagem("Exclusão cancelada");
            }
            
        Util.limparCampos(idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(false, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        ghsCliente = viewBean();
        if (incluindo ==true ){
        ghsCliente_DAO.insert(ghsCliente);}
        else{
               ghsCliente_DAO.update(ghsCliente);
                }
           Util.habilitar(false);
        Util.limparCampos(idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(false,  jBtnCancelar, jBtnConfirmar, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.mensagem("Cancelamento concluido");
       Util.habilitar(false, idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
       Util.limparCampos(idgbs_cliente, ghs_nome, gbs_rg, ghs_cpf, ghs_sexo, gbs_dataNascimento, gbs_email, gbs_endereco, gbs_bairro, gbs_cidade, gbs_telefoneResidencial, gbs_celular, gbs_estado, gbs_idade, gbs_regiao, ghs_cep);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgClientePesquisa jDlgClientePesquisa = new JDlgClientePesquisa(null, true);
        jDlgClientePesquisa.setTelaAnterior(this);
        jDlgClientePesquisa.setVisible(true);
         Util.habilitar(true, jBtnAlterar, jBtnCancelar, jBtnExcluir, jBtnIncluir);
        
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void gbs_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbs_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gbs_rgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField gbs_bairro;
    private javax.swing.JFormattedTextField gbs_celular;
    private javax.swing.JTextField gbs_cidade;
    private javax.swing.JFormattedTextField gbs_dataNascimento;
    private javax.swing.JTextField gbs_email;
    private javax.swing.JTextField gbs_endereco;
    private javax.swing.JTextField gbs_estado;
    private javax.swing.JFormattedTextField gbs_idade;
    private javax.swing.JTextField gbs_regiao;
    private javax.swing.JFormattedTextField gbs_rg;
    private javax.swing.JFormattedTextField gbs_telefoneResidencial;
    private javax.swing.JFormattedTextField ghs_cep;
    private javax.swing.JFormattedTextField ghs_cpf;
    private javax.swing.JTextField ghs_nome;
    private javax.swing.JComboBox<String> ghs_sexo;
    private javax.swing.JTextField idgbs_cliente;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

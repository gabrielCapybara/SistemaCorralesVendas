/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsCliente;
import bean.GhsVendas;
import bean.GhsVendasProdutos;
import bean.GhsVendedor;
import dao.GhsCliente_DAO;
import dao.GhsVendasProdutos_DAO;
import dao.GhsVendas_DAO;
import dao.GhsVendedor_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author TSUIIKUII
 */
public class JDlgVendas extends javax.swing.JDialog {
    
    private boolean incluindo;
    GhsVendas ghsVendas;
    GhsVendas_DAO ghsVendas_DAO;
    GhsCliente_DAO ghsCliente_DAO;
    GhsVendedor_DAO ghsVendedor_DAO;
    GhsVendasProdutos ghsVendasProdutos;
    GhsVendasProdutos_DAO ghsVendasProdutos_DAO;
    VendasProdutosControle vendasProdutosControle;
    MaskFormatter mascaraData;
    
    /**
     * Creates new form JDlgVendas
     */
    public JDlgVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vendas");
        setLocationRelativeTo(null);
        
        ghsCliente_DAO = new GhsCliente_DAO();
        ghsVendedor_DAO = new GhsVendedor_DAO();
        ghsVendas_DAO = new GhsVendas_DAO();
        ghsVendasProdutos = new GhsVendasProdutos();
        ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
        vendasProdutosControle = new VendasProdutosControle();
        List lista = ghsCliente_DAO.listAll();
        List lista2 = ghsVendedor_DAO.listAll();
        List lista3 = new ArrayList();
         vendasProdutosControle.setList(lista3);
        jTable2.setModel( vendasProdutosControle);
        
        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, idghs_vendas, idgbs_cliente, ghs_formaPagamento, ghs_statusVenda, ghs_dataVenda, idghs_vendas, idghs_vendedor, ghs_valorTotal, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
        Util.habilitar(true, jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jTable2);
        
        for (int i = 0; i < lista.size(); i++) {
            GhsCliente ghsCliente = (GhsCliente) lista.get(i);
            idgbs_cliente.addItem(ghsCliente);
        }
        for (int j = 0; j < lista2.size(); j++) {
            GhsVendedor ghsVendedor = (GhsVendedor) lista2.get(j);
            idghs_vendedor.addItem(ghsVendedor);    
        
        
         
        try {
            mascaraData = new MaskFormatter("##/##/####");
       } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ghs_dataVenda.setFormatterFactory( new DefaultFormatterFactory(mascaraData));
        
    }
    }  
        

     public GhsVendas viewBean(){
        GhsVendas ghsVendas = new GhsVendas();   
     
        ghsVendas.setIdghsVendas(Util.strInt(idghs_vendas.getText()));
        ghsVendas.setGhsDataVenda(Util.strDate(ghs_dataVenda.getText()));   
        ghsVendas.setGhsCliente((GhsCliente) idgbs_cliente.getSelectedItem() );
        ghsVendas.setGhsVendedor((GhsVendedor) idghs_vendedor.getSelectedItem() );
        ghsVendas.setGhsValorTotal(Util.strDouble(ghs_valorTotal.getText()));
        ghsVendas.setGhsFormaPagamento(ghs_formaPagamento.getSelectedIndex());
        ghsVendas.setGhsStatusVenda(ghs_statusVenda.getSelectedIndex());
        
        
         return ghsVendas;
      
       }
         
      public void beanView(GhsVendas ghsVendas) {
      idghs_vendas.setText( Util.intStr(ghsVendas.getIdghsVendas()));
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      ghs_dataVenda.setText( Util.Datestr(ghsVendas.getGhsDataVenda()));  
      idgbs_cliente.setSelectedItem(ghsVendas.getGhsCliente());
      idghs_vendedor.setSelectedItem(ghsVendas.getGhsVendedor());
      ghs_valorTotal.setText(Util.doubleStr(ghsVendas.getGhsValorTotal()));
      ghs_formaPagamento.setSelectedIndex(ghsVendas.getGhsFormaPagamento());
      ghs_statusVenda.setSelectedIndex(ghsVendas.getGhsStatusVenda());
      
      GhsVendasProdutos_DAO ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
      List listaProd = (List) ghsVendasProdutos_DAO.listProdutos(ghsVendas);

      vendasProdutosControle.setList(listaProd);
    }

    public int getSelectedRowProd() {
        return jTable2.getSelectedRow();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        ghs_valorTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idghs_vendas = new javax.swing.JTextField();
        jBtnIncluir1 = new javax.swing.JButton();
        ghs_dataVenda = new javax.swing.JFormattedTextField();
        jBtnAlterar1 = new javax.swing.JButton();
        jBtbExcluir1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        idgbs_cliente = new javax.swing.JComboBox<GhsCliente>();
        idghs_vendedor = new javax.swing.JComboBox<GhsVendedor>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ghs_formaPagamento = new javax.swing.JComboBox<>();
        ghs_statusVenda = new javax.swing.JComboBox<>();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num Venda");

        ghs_valorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghs_valorTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jLabel3.setText("Cliente");

        jLabel4.setText("Vendedor");

        jLabel5.setText("Total");

        jBtnIncluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir1ActionPerformed(evt);
            }
        });

        jBtnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar1ActionPerformed(evt);
            }
        });

        jBtbExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtbExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtbExcluir1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnIncluir)
                .addGap(18, 18, 18)
                .addComponent(jBtnAlterar)
                .addGap(31, 31, 31)
                .addComponent(jBtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addGap(16, 16, 16)
                .addComponent(jBtnPesquisar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnIncluir)
                        .addComponent(jBtnAlterar)
                        .addComponent(jBtnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnPesquisar)
                        .addComponent(jBtnCancelar)
                        .addComponent(jBtnConfirmar)))
                .addContainerGap())
        );

        idgbs_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idgbs_clienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Forma de pagamento");

        jLabel7.setText("Status da Venda");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable2);

        ghs_formaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Debito", "Pix", "Boleto" }));

        ghs_statusVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprovada", "Cancelada", "Completa", "Abandonada" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(idghs_vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ghs_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idgbs_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(idghs_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ghs_formaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ghs_statusVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ghs_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnIncluir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtbExcluir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idghs_vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idgbs_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idghs_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_formaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ghs_statusVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtbExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        ghsVendas = new GhsVendas();
        JDlgVendasPesquisa jDlgVendasPesquisa = new JDlgVendasPesquisa(null, true);
        jDlgVendasPesquisa.setTelaAnterior(this);
        jDlgVendasPesquisa.setVisible(true);
        
        Util.habilitar(true, jBtnAlterar, jBtnExcluir);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.limparCampos(idghs_vendas, ghs_dataVenda, idgbs_cliente, ghs_formaPagamento, ghs_statusVenda, idghs_vendas, idghs_vendedor, ghs_valorTotal, jTable2); 
        vendasProdutosControle.setList(new ArrayList());
        idghs_vendas.grabFocus();
        incluindo = true;
        ghsVendas = new GhsVendas();
        
        Util.habilitar(true, idghs_vendas, ghs_dataVenda, idghs_vendas, ghs_formaPagamento, jTable2, ghs_statusVenda, idgbs_cliente, idghs_vendedor, ghs_valorTotal, jBtnConfirmar, jBtnCancelar, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
        Util.habilitar(false,jBtnExcluir, jBtnIncluir, jBtnAlterar, jBtnPesquisar);
        
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (ghsVendas != null) {
            if (Util.perguntar("Deseja excluir a venda ?") == true) {
                GhsVendasProdutos_DAO ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
            GhsVendasProdutos ghsVendasProdutos;
                for (int linha = 0; linha < jTable2.getRowCount(); linha++) {
                    ghsVendasProdutos = vendasProdutosControle.getBean(linha);
                    ghsVendasProdutos_DAO.delete(ghsVendasProdutos);
                }
               ghsVendas_DAO.delete(ghsVendas);
            }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
        }
        vendasProdutosControle.setList(new ArrayList());
        
        incluindo = false;
        Util.limparCampos(idghs_vendas, ghs_dataVenda, idgbs_cliente, ghs_formaPagamento, ghs_statusVenda, idghs_vendas, idghs_vendedor, ghs_valorTotal);
        Util.habilitar(false, idghs_vendas, ghs_dataVenda, idghs_vendas, ghs_formaPagamento, ghs_statusVenda, idgbs_cliente, idghs_vendedor, ghs_valorTotal, jBtnConfirmar, jBtnCancelar, jBtnAlterar, jBtnExcluir, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
         if (ghsVendas != null) {
             GhsVendasProdutos_DAO ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
                GhsVendasProdutos ghsVendasProdutos;
                for (int linha = 0; linha < jTable2.getRowCount(); linha++) {
                    ghsVendasProdutos = vendasProdutosControle.getBean(linha);
                    ghsVendasProdutos_DAO.delete(ghsVendasProdutos);
            
                }
        } else {
            Util.mensagem("Deve ser realizada uma pesquisa antes");
                }
         incluindo = false;
         Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
         Util.habilitar(true, idghs_vendas, ghs_dataVenda, ghs_formaPagamento, ghs_statusVenda, idgbs_cliente, jBtnCancelar, idghs_vendedor, ghs_valorTotal, jBtnConfirmar, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        vendasProdutosControle.setList(new ArrayList());
        Util.mensagem("Cancelamento concluído");
        Util.habilitar(false, idghs_vendas, ghs_dataVenda, idghs_vendas, ghs_formaPagamento, ghs_statusVenda, idgbs_cliente, idghs_vendedor, ghs_valorTotal, jBtnConfirmar, jBtnAlterar, jBtnExcluir, jBtnCancelar, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
        Util.habilitar(true,  jBtnIncluir, jBtnPesquisar);
        Util.limparCampos(idghs_vendas, ghs_dataVenda, idgbs_cliente, ghs_formaPagamento, ghs_statusVenda, idghs_vendas, idghs_vendedor, ghs_valorTotal);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        ghsVendas = viewBean();
        
        
        if (incluindo == true){
            ghsVendas_DAO.insert(ghsVendas);
            GhsVendasProdutos_DAO ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
            GhsVendasProdutos ghsVendasProdutos;
             for (int linha = 0; linha < jTable2.getRowCount(); linha++) {
                ghsVendasProdutos = vendasProdutosControle.getBean(linha);
                ghsVendasProdutos.setGhsVendas(ghsVendas);
                ghsVendasProdutos_DAO.insert(ghsVendasProdutos);
             }
        } else {
           ghsVendas_DAO.update(ghsVendas);
            GhsVendasProdutos_DAO ghsVendasProdutos_DAO = new GhsVendasProdutos_DAO();
             GhsVendasProdutos ghsVendasProdutos;
            for (int linha = 0; linha < jTable2.getRowCount(); linha++) {
                ghsVendasProdutos = vendasProdutosControle.getBean(linha);
                ghsVendasProdutos.setGhsVendas(ghsVendas);
                ghsVendasProdutos_DAO.insert(ghsVendasProdutos);
            }
        }
        
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.habilitar(false, idghs_vendas, ghs_dataVenda, idghs_vendas, ghs_formaPagamento, ghs_statusVenda, idgbs_cliente, idghs_vendedor, ghs_valorTotal, jBtnConfirmar, jBtnCancelar, jBtnAlterar, jBtnExcluir, jBtnAlterar1, jBtnIncluir1, jBtbExcluir1);
        Util.limparCampos(idghs_vendas, ghs_dataVenda, ghs_formaPagamento, ghs_statusVenda, idgbs_cliente, idghs_vendas, idghs_vendedor, ghs_valorTotal, jTable2);
        vendasProdutosControle.setList(new ArrayList());

       // ghsVendas = null;
        
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnIncluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir1ActionPerformed
        // TODO add your handling code here:
        JDlgVendasProdutos jDlgVendasProdutos = new JDlgVendasProdutos(null, true);
        jDlgVendasProdutos.setTitle("Incluisão de Produtos");
        jDlgVendasProdutos.setTelaAnterior(this);
        jDlgVendasProdutos.setVisible(true);
    }//GEN-LAST:event_jBtnIncluir1ActionPerformed

    private void jBtnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar1ActionPerformed
        // TODO add your handling code here:
        JDlgVendasProdutos jDlgVendasProdutos = new JDlgVendasProdutos(null, true);
        jDlgVendasProdutos.setTitle("Alteração de Produtos");
        jDlgVendasProdutos.setTelaAnterior(this);
        int linSel = jTable2.getSelectedRow();
        GhsVendasProdutos ghsVendasProdutos = (GhsVendasProdutos)vendasProdutosControle.getBean(linSel) ;
        jDlgVendasProdutos.beanView(ghsVendasProdutos);
        jDlgVendasProdutos.setVisible(true);
    }//GEN-LAST:event_jBtnAlterar1ActionPerformed

    private void jBtbExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtbExcluir1ActionPerformed
        // TODO add your handling code here:
        
        if (getSelectedRowProd() == -1){
            Util.mensagem("Nenhuma linha selecionada");
            
        } else {
            if(Util.perguntar("Confirmar exclusão do produto") == true){
                vendasProdutosControle.removeBean(getSelectedRowProd());
            }
        
        }
        
    }//GEN-LAST:event_jBtbExcluir1ActionPerformed

    private void ghs_valorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ghs_valorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ghs_valorTotalActionPerformed

    private void idgbs_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idgbs_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idgbs_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendas dialog = new JDlgVendas(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField ghs_dataVenda;
    private javax.swing.JComboBox<String> ghs_formaPagamento;
    private javax.swing.JComboBox<String> ghs_statusVenda;
    private javax.swing.JTextField ghs_valorTotal;
    private javax.swing.JComboBox<GhsCliente> idgbs_cliente;
    private javax.swing.JTextField idghs_vendas;
    private javax.swing.JComboBox<GhsVendedor> idghs_vendedor;
    private javax.swing.JButton jBtbExcluir1;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar1;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluir1;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

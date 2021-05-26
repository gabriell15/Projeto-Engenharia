/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.ConexaoBD;

import controle.ControleJogo;
import modelo.ModeloJogo;
import modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Gabriel Ferreira
 */
public class FormJogo extends javax.swing.JFrame {
    
    ModeloJogo mod= new ModeloJogo();
    
    ControleJogo contro= new ControleJogo();
    ConexaoBD conex= new ConexaoBD();
    
     int flag= 0;
    

    public FormJogo() {
        initComponents();
        
        //Vai exibir em ordem alfabetica de acordo com os nomes 
        preencherTabela("select *from jogo order by id_jogo");
        
     
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldCNPJ = new javax.swing.JFormattedTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJogos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CNPJ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Título do jogo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Valor:");

        jFormattedTextFieldCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCNPJActionPerformed(evt);
            }
        });

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJogosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableJogos);

        jButtonPesquisa.setText("PESQUISAR");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Gênero:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ação", "Estratégia", "Esporte" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTextFieldTitulo))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonCancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CADASTRO DE JOGOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(816, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        // vai insetar dentro de pesquisa o que a empresa digitou , no caso, o numero do cpf
        //mod.setPesquisa(jFormattedTextFieldCpf.getText());
      
        

        jTextFieldId.setEnabled(false);
        jTextFieldTitulo.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jFormattedTextFieldCNPJ.setEnabled(false);
        jComboBoxGenero.setEnabled(false);

        mod.setPesquisa(jTextFieldPesquisa.getText());

        ModeloJogo model= contro.buscaJogo(mod);

        jFormattedTextFieldCNPJ.setText(model.getCnpj());
        jTextFieldId.setText(model.getId_Jogo());
        jTextFieldValor.setText(String.valueOf(model.getValor()));
        jTextFieldTitulo.setText(model.getTitulo_jogo());
        jComboBoxGenero.setSelectedItem(model.getGenero());

        //liberando os botoes
  
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTableJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJogosMouseClicked
        // TODO add your handling code here:

        //Preencher os campos em cima

        String IDJogo= ""+jTableJogos.getValueAt(jTableJogos.getSelectedRow(), 1);

        conex.conexao();

        conex.executaSql("select *from jogo where id_jogo = '"+IDJogo+"' ");

        try {
            conex.rs.first();

            jTextFieldId.setText(conex.rs.getString("id_jogo"));
            jTextFieldTitulo.setText(conex.rs.getString("titulo_jogo"));
            jTextFieldValor.setText(String.valueOf(conex.rs.getDouble("valor")));
            jFormattedTextFieldCNPJ.setText(conex.rs.getString("cnpj"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados"+ex);
        }
        
        

        conex.desconecta();
    
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableJogosMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta=0;
        //Vai ser perguntado pra a empresa se ele quer excluir
        resposta=  JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir ?");
        //Se ele disser sim vai excluir
        if(resposta== JOptionPane.YES_OPTION){
            //mod.setCod_endereco(Integer.parseInt(jTextFieldCodEndereco.getText()));
            mod.setId_Jogo(jTextFieldId.getText());

            //mod.setMentor(Integer.parseInt(jFormattedTextFieldMentor.getText()));
            contro.Excluir(mod);
        }

        //DEpois de excluir os campos vão ficar em branco :
        jTextFieldId.setText(" ");
        jTextFieldValor.setText(" ");
        jTextFieldTitulo.setText(" ");
        jFormattedTextFieldCNPJ.setText(" ");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        TelaPrincipalEmpresa tela = new TelaPrincipalEmpresa(); //Chama a tela principal empresa
        tela.setVisible(true);//
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:

        mod.setCnpj(jFormattedTextFieldCNPJ.getText());
        mod.setId_Jogo(jTextFieldId.getText());
        mod.setTitulo_jogo(jTextFieldTitulo.getText());
        mod.setValor(Double.parseDouble(jTextFieldValor.getText()));
        mod.setGenero((String) jComboBoxGenero.getSelectedItem());

        contro.Salvar(mod);

        //DEpois de salvar os campos vão ficar em branco :
        jTextFieldId.setText("");
        jTextFieldValor.setText("");
        jTextFieldTitulo.setText("");
        jFormattedTextFieldCNPJ.setText("");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    
     
    
    
    private void jFormattedTextFieldCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCNPJActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados= new ArrayList();
        String [] colunas= new String []{"CNPJ", "ID" ,  "Título", "Valor"};
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try {
            conex.rs.first();
            
            do{
                dados.add(new Object[]{conex.rs.getString("cnpj"),conex.rs.getString("id_jogo"), conex.rs.getString("titulo_jogo"),conex.rs.getDouble("valor")});
                
            }while(conex.rs.next());
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList"+ex);
        }
        
        ModeloTabela modelo= new ModeloTabela(dados, colunas);
        
        jTableJogos.setModel(modelo);
        jTableJogos.getColumnModel().getColumn(0).setPreferredWidth(150);
        
        //Empresa nao vai poder mecher com o tamanho da tabela com o mause:
        jTableJogos.getColumnModel().getColumn(0).setResizable(false);
        
        jTableJogos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableJogos.getColumnModel().getColumn(1).setResizable(false);
        jTableJogos.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableJogos.getColumnModel().getColumn(2).setResizable(false);
        jTableJogos.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableJogos.getColumnModel().getColumn(3).setResizable(false);
     
      

        
        //Aqui o empresa nao vai poder reordenar o cabeçalho:
        jTableJogos.getTableHeader().setReorderingAllowed(false);
        
        //Empresa nao vai poder redimensionar a tabela:
        jTableJogos.setAutoResizeMode(jTableJogos.AUTO_RESIZE_OFF);
        
        //Empresa so vai poder selecionar um campo por vez ao clicar na tabela:
        jTableJogos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
        
        
        
        conex.desconecta();
        
    }
    
    
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
            java.util.logging.Logger.getLogger(FormJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJogos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
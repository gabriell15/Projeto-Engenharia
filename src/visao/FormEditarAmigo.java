/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.ConexaoBD;

import controle.ControleUsuario;
import modelo.ModeloUsuario;
import modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloEmpresa;

/**
 *
 * @author Gabriel Ferreira
 */
public class FormEditarAmigo extends javax.swing.JFrame {
    
    ModeloUsuario mod= new ModeloUsuario();
    
    ControleUsuario control= new ControleUsuario();
    ConexaoBD conex= new ConexaoBD();
     int flag= 0;
    

    public FormEditarAmigo() {
        initComponents();
        
        
        //String cpfUsuario= ""+jTableAmigos.getValueAt(jTableAmigos.getSelectedRow(), 1);

        conex.conexao();

        //conex.executaSql("select *from amigo where cpf = '"+cpfUsuario+"' ");
        //Vai exibir em ordem alfabetica de acordo com os nomes 
        //preencherTabela("select *from amigo order by cpf");
     
        
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
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldCpfAmigo = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigos = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("CPF do amigo:");

        jLabel3.setText("CPF:");

        jFormattedTextFieldCpf.setEnabled(false);
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });

        jTextFieldCpfAmigo.setEnabled(false);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
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

        jTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmigos);

        jButtonPesquisa.setText("VALIDAÇÃO");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite o seu CPF para permissão de adição de amigo(a):");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCpfAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCpfAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonCancelar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButtonExcluir)))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("EDITAR AMIGO(a)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)))
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

        setSize(new java.awt.Dimension(695, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        // vai insetar dentro de pesquisa o que a empresa digitou , no caso, o numero do cpf
        //mod.setPesquisa(jFormattedTextFieldCpf.getText());

    

       /* jTextFieldNome.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jFormattedTextFieldCNPJ.setEnabled(false);*/
      
      

        mod.setPesquisa(jTextFieldPesquisa.getText());
       // preencherTabela("select *from amigo order by cpf");
        preencherTabela( "select *from amigo where cpf = '"+jTextFieldPesquisa.getText()+"' ");

        ModeloUsuario model= control.buscaUsuario(mod);

        jFormattedTextFieldCpf.setText(model.getCpf());
        jTextFieldCpfAmigo.setText(model.getCpf_amigo());
      
     
         if (jFormattedTextFieldCpf.getText().equals("")) {
             
         jTextFieldCpfAmigo.setEnabled(!true);
         jFormattedTextFieldCpf.setEnabled(false);
         
         jButtonCancelar.setEnabled(true);

          

        jButtonSalvar.setEnabled(!true);
      
        
        }
        else{
            //Comando para mandar uma msg pra tela dizendo que o que o usuario digitou nao condiz com o que tem que digitar para entrar
          
            //liberando os botoes
        
         jTextFieldCpfAmigo.setEnabled(true);
         jFormattedTextFieldCpf.setEnabled(false);
        

         jButtonCancelar.setEnabled(true);

          

        jButtonSalvar.setEnabled(true);
       
      
       
        }


        

    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmigosMouseClicked
        // TODO add your handling code here:

        //Preencher os campos em cima

        String cpfUsuario= ""+jTableAmigos.getValueAt(jTableAmigos.getSelectedRow(), 1);

        conex.conexao();

        conex.executaSql("select *from amigo where cpf = '"+cpfUsuario+"' ");

        try {
            conex.rs.first();
          
            jFormattedTextFieldCpf.setText(conex.rs.getString("cpf"));
            
            
            jTextFieldCpfAmigo.setText(conex.rs.getString("cpf_amigo"));
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados"+ex);
        }

        conex.desconecta();
     
     

    }//GEN-LAST:event_jTableAmigosMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
       TelaPrincipalUsuario tela = new TelaPrincipalUsuario(); //Chama a tela de login empresa
        tela.setVisible(true);//
        dispose();

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:

            mod.setCpf(jFormattedTextFieldCpf.getText());
            mod.setCpf_amigo(jTextFieldCpfAmigo.getText());
           
          

            control.EditarAmigo(mod);

            jTextFieldCpfAmigo.setEnabled(false);
            jFormattedTextFieldCpf.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            
            
        TelaPrincipalUsuario tela = new TelaPrincipalUsuario(); //Chama a tela principal do usuário
        tela.setVisible(true);//
        dispose();
            
          
          


        

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta=0;
        //Vai ser perguntado pra a empresa se ele quer excluir
        resposta=  JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir ?");
        //Se ele disser sim vai excluir
        if(resposta== JOptionPane.YES_OPTION){
            //mod.setCod_endereco(Integer.parseInt(jTextFieldCodEndereco.getText()));
            mod.setCpf_amigo(jTextFieldCpfAmigo.getText());

            //mod.setMentor(Integer.parseInt(jFormattedTextFieldMentor.getText()));
            control.Excluir(mod);
        }

        //DEpois de excluir os campos vão ficar em branco :
        jTextFieldCpfAmigo.setText(" ");
        jFormattedTextFieldCpf.setText(" ");
      

        TelaPrincipalUsuario tela= new TelaPrincipalUsuario();//Vai pra tela principal de usuario
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    
    
    
    public void preencherTabela(String Sql){
        ArrayList dados= new ArrayList();
        String [] colunas= new String []{"CPF amigo", "CPF" };
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try {
            conex.rs.first();
            
            do{
                dados.add(new Object[]{conex.rs.getString("cpf_amigo"),conex.rs.getString("cpf")});
                
            }while(conex.rs.next());
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList"+ex);
        }
        
        ModeloTabela modelo= new ModeloTabela(dados, colunas);
        
        jTableAmigos.setModel(modelo);
        jTableAmigos.getColumnModel().getColumn(0).setPreferredWidth(150);
        
        //Empresa nao vai poder mecher com o tamanho da tabela com o mause:
        jTableAmigos.getColumnModel().getColumn(0).setResizable(false);
        
        jTableAmigos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableAmigos.getColumnModel().getColumn(1).setResizable(false);
     
     
      

        
        //Aqui o empresa nao vai poder reordenar o cabeçalho:
        jTableAmigos.getTableHeader().setReorderingAllowed(false);
        
        //Empresa nao vai poder redimensionar a tabela:
        jTableAmigos.setAutoResizeMode(jTableAmigos.AUTO_RESIZE_OFF);
        
        //Empresa so vai poder selecionar um campo por vez ao clicar na tabela:
        jTableAmigos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
        
        
        
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
            java.util.logging.Logger.getLogger(FormEditarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigos;
    private javax.swing.JTextField jTextFieldCpfAmigo;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}

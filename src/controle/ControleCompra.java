/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;


import controle.ConexaoBD;
import modelo.ModeloCompra;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Ferreira
 */
public class ControleCompra {
    
    ConexaoBD conex= new ConexaoBD();
    ModeloCompra mod= new ModeloCompra();
    
public void Salvar( ModeloCompra mod){
    conex.conexao();
        try {
            
     
            
             PreparedStatement pst= conex.con.prepareStatement("insert into compra( cvv, cpf,numero,  titulo_jogo, valor, id_jogo) values(?,?,?,?,?,?)");
             
         
            pst.setInt(1, mod.getCvv());
            pst.setString(2, mod.getCpf());
            pst.setInt(3, mod.getNumero());
            pst.setString(4, mod.getTitulo());
            pst.setDouble(5, mod.getValor());
             pst.setString(6, mod.getId_jogo());
         
             
            pst.execute();
            

             
             JOptionPane.showMessageDialog(null, "Compra efetuada coom sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\n"+ex);
            
        }
    conex.desconecta();
    
}




    
  



public ModeloCompra buscaHistorico(ModeloCompra mod){
    //conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from  compra where cpf ='"+mod.getPesquisa()+"'");
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
           
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setCvv(conex.rs.getInt("cvv"));
            mod.setNumero(conex.rs.getInt("numero"));
          
            
            mod.setTitulo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
            mod.setId_jogo(conex.rs.getString("id_jogo"));
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!!\n"+ex);
        }
        
        
    
    conex.desconecta();
    return mod;
}






    
    
}

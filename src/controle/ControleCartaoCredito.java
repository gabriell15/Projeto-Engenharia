/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;


import controle.ConexaoBD;
import modelo.ModeloCartaoCredito;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Ferreira
 */
public class ControleCartaoCredito {
    
    ConexaoBD conex= new ConexaoBD();
    ModeloCartaoCredito mod= new ModeloCartaoCredito();
    

    
  
    
public void Salvar( ModeloCartaoCredito mod){
    //Metodo de conexao com o bd e o de desconecxao
    conex.conexao();
        try {
            
     
            
             PreparedStatement pst= conex.con.prepareStatement("insert into cartao_credito( cvv, numero, data_validade, nome_p, titulo_jogo, valor) values(?,?,?,?,?,?)");
             
            pst.setInt(1, mod.getCvv());
            pst.setInt(2, mod.getNumero());
            pst.setString(3, mod.getData_Validade());
            pst.setString(4, mod.getPessoa());
            pst.setString(5, mod.getTitulo());
            pst.setDouble(6, mod.getValor());
         
             
            pst.execute();
            

             
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\n"+ex);
            
        }
    conex.desconecta();
    
}




    
  



public ModeloCartaoCredito buscaCartao( ModeloCartaoCredito mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from  cartao_credito where numero ='"+mod.getPesq()+"'");
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCvv(conex.rs.getInt("cvv"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setData_Validade(conex.rs.getString("data_validade"));
            mod.setPessoa(conex.rs.getString("nome_p"));
            
            mod.setTitulo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!!\n"+ex);
        }
        
        
    
    conex.desconecta();
    return mod;
}






    
    
}

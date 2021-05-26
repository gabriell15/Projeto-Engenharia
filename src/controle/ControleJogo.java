/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;


import controle.ConexaoBD;
import modelo.ModeloJogo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Ferreira
 */
public class ControleJogo {
    
    ConexaoBD conex= new ConexaoBD();
    ModeloJogo mod= new ModeloJogo();
    

    

    
    
    
public void Salvar( ModeloJogo mod){
    //Metodo de conexao com o bd e o de desconecxao
    conex.conexao();
        try {
            
           
          
            
             PreparedStatement pst= conex.con.prepareStatement("insert into jogo( cnpj, id_jogo, titulo_jogo, valor) values(?,?,?,?)");
             
            pst.setString(1, mod.getCnpj());
            pst.setString(2, mod.getId_Jogo());
            pst.setString(3, mod.getTitulo_jogo());
            pst.setDouble(4, mod.getValor());
         
             
            pst.execute();
             
              PreparedStatement pstGenero= conex.con.prepareStatement("insert into genero( id_jogo, genero ) values(?,?)"); 
             
             pstGenero.setString(2, mod.getGenero());
             pstGenero.setString(1, mod.getId_Jogo());
             
             pstGenero.execute();
           
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!/n"+ex);
        }
    conex.desconecta();
    
    
}


  public void Editar(ModeloJogo mod){
        conex.conexao();
        try {
  
            
            PreparedStatement pst= conex.con.prepareStatement("update jogo set cnpj=?,  titulo_jogo=?, valor=? where id_jogo=? ");
                      
             pst.setString(4, mod.getId_Jogo()); 
             pst.setString(2, mod.getTitulo_jogo());
             pst.setDouble(3, mod.getValor()); 
             pst.setString(1, mod.getCnpj());
           
             
              pst.execute();
              
              
              PreparedStatement pstGenero= conex.con.prepareStatement("update genero set genero=? where id_jogo=? ");
                      
             pstGenero.setString(2, mod.getId_Jogo()); 
             pstGenero.setString(1, mod.getGenero());
           
           
             
              pstGenero.execute();
      
             
              JOptionPane.showMessageDialog(null, "Dados do jogo alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados do jogo!!/n"+ex);
        }
        
        conex.desconecta();
    }
    
  
  
  
  
    



public ModeloJogo buscaJogo( ModeloJogo mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from jogo where cnpj ='"+mod.getPesquisa()+"'");
    
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCnpj(conex.rs.getString("cnpj"));
            mod.setId_Jogo(conex.rs.getString("id_jogo"));
            mod.setTitulo_jogo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
           
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar jogo!!/n"+ex);
        }
    
    
        
    conex.desconecta();
    return mod;
}





public ModeloJogo buscaJogoEscolha( ModeloJogo mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from jogo where titulo_jogo like'%"+mod.getPesquisa()+"%'");
    
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCnpj(conex.rs.getString("cnpj"));
            mod.setId_Jogo(conex.rs.getString("id_jogo"));
            mod.setTitulo_jogo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
           
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar jogo!!/n"+ex);
        }
    
    
        
    conex.desconecta();
    return mod;
}



public ModeloJogo buscaJogoAutomatico(){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from jogo where titulo_jogo ='Resident Evil'");
    
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCnpj(conex.rs.getString("cnpj"));
            mod.setId_Jogo(conex.rs.getString("id_jogo"));
            mod.setTitulo_jogo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
            
            JOptionPane.showMessageDialog(null, "Chegou aqui!!\n");
           
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao automatizar infos!!/n"+ex);
        }
    
        
      /*  conex.executaSql("select *from genero where id_jogo ='"+mod.getPesquisa()+"'");
         try {
             
            conex.rs.first();
           
            mod.setGenero(conex.rs.getString("genero"));
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar genero!!/n"+ex);
        }
        */
        
    conex.desconecta();
    return mod;
}



public ModeloJogo buscaJogosEsporte(ModeloJogo mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("SELECT * FROM jogo INNER JOIN genero ON jogo.id_jogo = genero.id_jogo and genero.genero= 'Esporte' and jogo.titulo_jogo like'%"+mod.getPesquisa()+"%'");
    
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCnpj(conex.rs.getString("cnpj"));
            mod.setId_Jogo(conex.rs.getString("id_jogo"));
            mod.setTitulo_jogo(conex.rs.getString("titulo_jogo"));
            mod.setValor(conex.rs.getDouble("valor"));
            
            JOptionPane.showMessageDialog(null, "Chegou aqui!!\n");
           
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao automatizar infos!!/n"+ex);
        }
    
     
        
    conex.desconecta();
    return mod;
}





//Exclusão de informações do jogo:

public void Excluir(ModeloJogo mod){
    conex.conexao();
        try {
            
            PreparedStatement pstGenero= conex.con.prepareStatement("delete from genero where id_jogo=?");
            
            pstGenero.setString(1, mod.getId_Jogo());
            pstGenero.execute();
            
            
        
            PreparedStatement pst= conex.con.prepareStatement("delete from jogo where id_jogo=?");
          
        
            pst.setString(1, mod.getId_Jogo());
            
            
            
           
            //pstContato.execute();
            pst.execute();
           // pstEndereco.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do jogo!/n"+ex);
        }
    
    
    
    conex.desconecta();
}


    
    
}

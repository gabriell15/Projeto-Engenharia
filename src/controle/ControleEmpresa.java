/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;


import controle.ConexaoBD;
import modelo.ModeloEmpresa;
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
public class ControleEmpresa {
    
    ConexaoBD conex= new ConexaoBD();
    ModeloEmpresa mod= new ModeloEmpresa();
     ModeloJogo model= new ModeloJogo();
    
    

    

    
    
    
public void Salvar( ModeloEmpresa mod){
    //Metodo de conexao com o bd e o de desconecxao
    conex.conexao();
        try {
            
           
            //Quase que não consigo, agora ele vai executar primeiramente os dados do endereço salvo, depois vai executar os dados do médico 
         
           
           /* PreparedStatement pstEndereco= conex.con.prepareStatement("insert into endereco( codendereco, rua, numero, bairro, estado, cidade, complemento, cep) values(?,?,?,?,?,?,?,?)");
            
           
           
            
        
             pstEndereco.setInt(1, mod.getCod_endereco());
             pstEndereco.setString(2, mod.getRua());
             pstEndereco.setInt(3, mod.getNumero() );
             pstEndereco.setString(4, mod.getBairro() );
             pstEndereco.setString(5, mod.getEstado() );
             pstEndereco.setString(6, mod.getCidade() );
             pstEndereco.setString(7, mod.getComplemento() );
             pstEndereco.setInt(8, mod.getCep());
             
             pstEndereco.execute();*/
            
             PreparedStatement pst= conex.con.prepareStatement("insert into empresa( cnpj, email_empresa, senha_empresa, nome_empresa) values(?,?,?,?)");
             
            pst.setString(1, mod.getCnpj());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getNome());
         
             
            pst.execute();
             
             /* PreparedStatement pstContato= conex.con.prepareStatement("insert into contato_medico( medico_cpf, telefone ) values(?,?)"); 
             
             pstContato.setInt(1, mod.getCpf());
             pstContato.setInt(2, mod.getTelefone());
             
             pstContato.execute();*/
           
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!/n"+ex);
        }
    conex.desconecta();
    
    
}


  public void Editar(ModeloEmpresa mod){
        conex.conexao();
        try {
  
            
            PreparedStatement pst= conex.con.prepareStatement("update empresa set cnpj=?, email_empresa=?, senha_empresa=?, nome_empresa=? ");
                      
             pst.setString(2, mod.getEmail()); 
             pst.setString(3, mod.getSenha());
             pst.setString(4, mod.getNome()); 
             pst.setString(1, mod.getCnpj());
           
             
              pst.execute();
              
              JOptionPane.showMessageDialog(null, "Dados da empresa alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados da empresa!!/n"+ex);
        }
        
        conex.desconecta();
    }
    
  
  
  
  /* public void EditarEnderecoMedico(BeansMedico mod){
        conex.conexao();
        try {
            
            
            PreparedStatement pstEndereco= conex.con.prepareStatement("update endereco set rua=?, numero=?, bairro=?, estado=?, cidade=?, complemento=?, cep=? where codendereco=?");
            
           
                  
        
             
             pstEndereco.setString(1, mod.getRua());
             pstEndereco.setInt(2, mod.getNumero() );
             pstEndereco.setString(3, mod.getBairro() );
             pstEndereco.setString(4, mod.getEstado() );
             pstEndereco.setString(5, mod.getCidade() );
             pstEndereco.setString(6, mod.getComplemento() );
             pstEndereco.setInt(7, mod.getCep());
             pstEndereco.setInt(8, mod.getCod_endereco());
             
             pstEndereco.execute();
            
            
            
    
              
              JOptionPane.showMessageDialog(null, "Dados do endereço alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados !!/n"+ex);
        }
        
        conex.desconecta();
    }
    */
   /*
    public void EditarContatoMedico(BeansMedico mod){
        conex.conexao();
        try {
            
            
            PreparedStatement pstContato= conex.con.prepareStatement("update contato_medico set telefone=? where medico_cpf=?");
            
           
                  
        
             
             pstContato.setInt(1, mod.getTelefone());
             pstContato.setInt(2, mod.getCpf() );
            
             
             pstContato.execute();
            
            
            
    
              
              JOptionPane.showMessageDialog(null, "Dados do contato alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados !!/n"+ex);
        }
        
        conex.desconecta();
    }
    
    */

    



public ModeloEmpresa buscaEmpresa( ModeloEmpresa mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from empresa where cnpj ='"+mod.getPesquisa()+"'");

    
        try {
             
            conex.rs.first();
            mod.setCnpj(conex.rs.getString("cnpj"));
            mod.setEmail(conex.rs.getString("email_empresa"));
            mod.setSenha(conex.rs.getString("senha_empresa"));
            mod.setNome(conex.rs.getString("nome_empresa"));
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar empresa!!/n"+ex);
        }
    
       
        
    conex.desconecta();
    return mod;
}





/*
public BeansMedico buscaEnderecoMedico( BeansMedico mod){
    conex.conexao();
   //conex.executaSql("select *from  medico where cpf '"+mod.getPesquisabd()+"'");
   conex.executaSql("select *from  endereco where estado like '%"+mod.getPesquisaEndereco()+"%'");
    
   
    
        try {
             
            conex.rs.first();
            mod.setEstado(conex.rs.getString("estado"));
            mod.setCidade(conex.rs.getString("cidade"));
            mod.setComplemento(conex.rs.getString("complemento"));
            mod.setCep(conex.rs.getInt("cep"));
            mod.setRua(conex.rs.getString("rua"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setCod_endereco(conex.rs.getInt("codendereco"));
            
            

            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar endereço do recepcionista!!/n"+ex);
        }
    
        
        
        
        
    conex.desconecta();
    return mod;
    
}
*/

//Exclusão de informações do Medico:

public void Excluir(ModeloEmpresa mod){
    conex.conexao();
        try {
            
           // PreparedStatement pstEndereco= conex.con.prepareStatement("delete from endereco where codendereco=?");
            PreparedStatement pst= conex.con.prepareStatement("delete from empresa where cnpj=?");
       
            //PreparedStatement pstContato= conex.con.prepareStatement("delete from contato_medico where medico_cpf=?");
            
            //pstEndereco.setInt(1, mod.getCod_endereco());
           
            //pstContato.setInt(1, mod.getCpf());
            pst.setString(1, mod.getCnpj());
            
           
            //pstContato.execute();
            pst.execute();
           // pstEndereco.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados da empresa!/n"+ex);
        }
    
    
    
    conex.desconecta();
}


    
    
}

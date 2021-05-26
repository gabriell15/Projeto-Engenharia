/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;


import controle.ConexaoBD;
import modelo.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Ferreira
 */
public class ControleUsuario {
    
    ConexaoBD conex= new ConexaoBD();
    ModeloUsuario mod= new ModeloUsuario();
    

    

    
    
    
public void Salvar( ModeloUsuario mod){
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
            
             PreparedStatement pst= conex.con.prepareStatement("insert into pessoa_f( cpf, nome_user, senha, email) values(?,?,?,?)");
             
            pst.setString(1, mod.getCpf());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getEmail());
         
             
            pst.execute();
            
            
            /* PreparedStatement pstAmigo= conex.con.prepareStatement("insert into amigo( cpf_amigo, cpf) values(?,?)");
             
            pstAmigo.setString(1, mod.getCpf_amigo());
            pstAmigo.setString(2, mod.getCpf());
            
         
             
            pstAmigo.execute();
             */
             /* PreparedStatement pstContato= conex.con.prepareStatement("insert into contato_medico( medico_cpf, telefone ) values(?,?)"); 
             
             pstContato.setInt(1, mod.getCpf());
             pstContato.setInt(2, mod.getTelefone());
             
             pstContato.execute();*/
           
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\nCPF já é utilizado!!\n"+ex);
            
        }
    conex.desconecta();
    
    
}

public void SalvarAmigo( ModeloUsuario mod){
    //Metodo de conexao com o bd e o de desconecxao
    conex.conexao();
        try {
            
           
           
            
            
             PreparedStatement pstAmigo= conex.con.prepareStatement("insert into amigo( cpf_amigo, cpf) values(?,?)");
             
            pstAmigo.setString(1, mod.getCpf_amigo());
            pstAmigo.setString(2, mod.getCpf());
            
         
             
            pstAmigo.execute();
             
             
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso !!");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!!\n"+ex);
            
        }
    conex.desconecta();
    
    
}







   public void Editar(ModeloUsuario mod){
        conex.conexao();
        try {
  
            
            PreparedStatement pst= conex.con.prepareStatement("update pessoa_f set nome_user=?, senha=?, email=? where cpf=? ");
                      
            
            
             pst.setString(1, mod.getNome());
             pst.setString(2, mod.getSenha());
             pst.setString(3, mod.getEmail()); 
             pst.setString(4, mod.getCpf());
             
             
           
           
             
              pst.execute();
              
              JOptionPane.showMessageDialog(null, "Dados do susuario alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados do usuario!!/n"+ex);
        }
        
        conex.desconecta();
    }
    
  
  
 
 public void EditarAmigo(ModeloUsuario mod){
        conex.conexao();
        try {
  
            
            PreparedStatement pst= conex.con.prepareStatement("update amigo set cpf_amigo=? where cpf=? ");
                      
            
            
             pst.setString(2, mod.getCpf());
             pst.setString(1, mod.getCpf_amigo());
        
 
             
              pst.execute();
              
              JOptionPane.showMessageDialog(null, "Dados do susuario alterados com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados do usuario!!/n"+ex);
        }
        
        conex.desconecta();
    }

    



public ModeloUsuario buscaUsuario( ModeloUsuario mod){
    conex.conexao();
//    conex.executaSql("select *from  medico where nome like'%"+mod.getPesquisa()+"%'");
    conex.executaSql("select *from  pessoa_f where cpf ='"+mod.getPesquisa()+"'");
    
   // conex.executaSql("select *from  medico where nome '"+mod.getPesq()+"'");
    
        try {
             
            conex.rs.first();
            mod.setCpf(conex.rs.getString("cpf"));
            mod.setNome(conex.rs.getString("nome_user"));
            mod.setSenha(conex.rs.getString("senha"));
            mod.setEmail(conex.rs.getString("email"));
 
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CPF ÍNVALIDO!!\n");
        }
        
        
        
         conex.executaSql("select *from amigo where cpf ='"+mod.getPesquisa()+"'");
    

        try {
             
            conex.rs.first();
            
            mod.setCpf_amigo(conex.rs.getString("cpf_amigo"));
           
 
            
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "CPF ÍNVALIDO!!\n");
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

public void Excluir(ModeloUsuario mod){
    conex.conexao();
        try {
            
           // PreparedStatement pstEndereco= conex.con.prepareStatement("delete from endereco where codendereco=?");
            PreparedStatement pst= conex.con.prepareStatement("delete from pessoa_f where cpf=?");
          
            //PreparedStatement pstContato= conex.con.prepareStatement("delete from contato_medico where medico_cpf=?");
            
            //pstEndereco.setInt(1, mod.getCod_endereco());
           
            //pstContato.setInt(1, mod.getCpf());
            pst.setString(1, mod.getCpf());
            
           
            //pstContato.execute();
            pst.execute();
           // pstEndereco.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do susuário!!/n"+ex);
        }
    
    
    
    conex.desconecta();
}


public void ExcluirAmigo(ModeloUsuario mod){
    conex.conexao();
        try {
            
           // PreparedStatement pstEndereco= conex.con.prepareStatement("delete from endereco where codendereco=?");
            PreparedStatement pst= conex.con.prepareStatement("delete from amigo where cpf_amigo=?");
          
            //PreparedStatement pstContato= conex.con.prepareStatement("delete from contato_medico where medico_cpf=?");
            
            //pstEndereco.setInt(1, mod.getCod_endereco());
           
            //pstContato.setInt(1, mod.getCpf());
            pst.setString(1, mod.getCpf_amigo());
            
           
            //pstContato.execute();
            pst.execute();
           // pstEndereco.execute();
            JOptionPane.showMessageDialog(null, "Dados do amigo excluidos com sucesso!!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do amigo!!/n"+ex);
        }
    
    
    
    conex.desconecta();
}

    
    
}

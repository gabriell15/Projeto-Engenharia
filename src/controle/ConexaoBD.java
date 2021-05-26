/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Ferreira
 */
public class ConexaoBD {
    

    public Statement stn;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/Engenharia";
    private String usuario = "postgres";
    private String senha = "saopaulo15";
    
    Connection con;
    
 public void conexao(){
     
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha );
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!!");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro de Conexão :\n"+ex.getMessage());
            
        }
        
 }
 
 public void executaSql(String sql){
        try {
            stn = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stn.executeQuery(sql);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao executa sql Conexão :\n"+ex.getMessage());
            
        }
     
     
 }
 
 public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados: \n"+ex.getMessage());
        }
}
 
 
 

}

/*public class ConexaoBD {
    private String caminho = "127.0.0.1";
    private String porta= "3306";
    private String nome= "Teste";
    private String usuario = "root";
    private String senha = "";
    
    private String URL= "jdbc:mysql://"+caminho+":"+porta+"/"+nome+"?useTimezone=true&serverTimezone=GMT";
    
    public static ConexaoBD getConnection(){
        ConexaoBD conexaoBD= null; 
        if(ConexaoBD == null){
            conexaoBD= new ConexaoBD();
            return new ConexaoBD();
        }else {
            return null;
        }
        
    }
    
    public void Conn() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection(URL, usuario, senha);
        }
        catch(Exception ex){
            System.err.println("Erro ao conectar"+ex);
        }
    }
}
 */

    


    


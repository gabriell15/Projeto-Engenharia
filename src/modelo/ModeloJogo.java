/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Gabriel Ferreira
 */
public class ModeloJogo {
    
    private String cnpj;
    private String id_Jogo;
    private String Titulo_jogo;
    private double valor;
    private String genero;
    
    private String pesquisa;

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the id_Jogo
     */
    public String getId_Jogo() {
        return id_Jogo;
    }

    /**
     * @param id_Jogo the id_Jogo to set
     */
    public void setId_Jogo(String id_Jogo) {
        this.id_Jogo = id_Jogo;
    }

    /**
     * @return the Titulo_jogo
     */
    public String getTitulo_jogo() {
        return Titulo_jogo;
    }

    /**
     * @param Titulo_jogo the Titulo_jogo to set
     */
    public void setTitulo_jogo(String Titulo_jogo) {
        this.Titulo_jogo = Titulo_jogo;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    

    
}

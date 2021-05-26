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
public class ModeloCartaoCredito {
    
    private int cvv;
    private int numero;
    private String pessoa;
    private String data_Validade;
    private int pesq;
    
    private String titulo;
    private Double valor;
    
    private String pesquisa;

    /**
     * @return the cvv
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the pessoa
     */
    public String getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the data_Validade
     */
    public String getData_Validade() {
        return data_Validade;
    }

    /**
     * @param data_Validade the data_Validade to set
     */
    public void setData_Validade(String data_Validade) {
        this.data_Validade = data_Validade;
    }

    /**
     * @return the pesq
     */
    public int getPesq() {
        return pesq;
    }

    /**
     * @param pesq the pesq to set
     */
    public void setPesq(int pesq) {
        this.pesq = pesq;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}

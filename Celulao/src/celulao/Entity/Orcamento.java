/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celulao.Entity;

import java.util.Date;

/**
 *
 * @author Naomi
 */
public class Orcamento {
    private int orcamentoID;
    private Double valorServico;
    private Date dtOrc;
    private int statusOrc;
    private Date dataAprov;
    private Double valorPecas;
    
    //Construtor
    public Orcamento(){}
    
    //métodos de acesso

    public int getOrcamentoID() {
        return orcamentoID;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public Date getDtOrc() {
        return dtOrc;
    }

    public int getStatusOrc() {
        return statusOrc;
    }

    public Date getDataAprov() {
        return dataAprov;
    }

    public Double getValorPecas() {
        return valorPecas;
    }

    public void setOrcamentoID(int orcamentoID) {
        this.orcamentoID = orcamentoID;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public void setDtOrc(Date dtOrc) {
        this.dtOrc = dtOrc;
    }

    public void setStatusOrc(int statusOrc) {
        this.statusOrc = statusOrc;
    }

    public void setDataAprov(Date dataAprov) {
        this.dataAprov = dataAprov;
    }

    public void setValorPecas(Double valorPecas) {
        this.valorPecas = valorPecas;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public Orcamento Consultar(){
        return new Orcamento();  
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
}

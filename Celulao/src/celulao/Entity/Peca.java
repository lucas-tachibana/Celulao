/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celulao.Entity;

/**
 *
 * @author Naomi
 */
public class Peca {
    private int pecaID;
    private String descricaoPeca;
    private Double custoPeca;
    
    //Construtor
    public Peca(){
    }
    
    //métodos de acesso
    public int getPecaID() {
        return pecaID;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public Double getCustoPeca() {
        return custoPeca;
    }

    public void setPecaID(int pecaID) {
        this.pecaID = pecaID;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public void setCustoPeca(Double custoPeca) {
        this.custoPeca = custoPeca;
    }

    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public Peca Consultar(){
        return new Peca();  
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
    
}

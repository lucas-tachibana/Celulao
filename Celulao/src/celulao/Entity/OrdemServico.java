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
public class OrdemServico {
    private int osID;
    private int clienteID;
    private int celularID;
    private String problema1;
    private String problema2;
    private int statusOS;
    private Date dataOS;
    private int userID;

    //Construtor
    public OrdemServico() {
    }

    //métodos de acesso
    public int getOsID() {
        return osID;
    }

    public int getClienteID() {
        return clienteID;
    }

    public int getCelularID() {
        return celularID;
    }

    public String getProblema1() {
        return problema1;
    }

    public String getProblema2() {
        return problema2;
    }

    public int getStatusOS() {
        return statusOS;
    }

    public Date getDataOS() {
        return dataOS;
    }

    public int getUserID() {
        return userID;
    }

    public void setOsID(int osID) {
        this.osID = osID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public void setCelularID(int celularID) {
        this.celularID = celularID;
    }

    public void setProblema1(String problema1) {
        this.problema1 = problema1;
    }

    public void setProblema2(String problema2) {
        this.problema2 = problema2;
    }

    public void setStatusOS(int statusOS) {
        this.statusOS = statusOS;
    }

    public void setDataOS(Date dataOS) {
        this.dataOS = dataOS;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public OrdemServico Consultar(){
        return new OrdemServico();  
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
}

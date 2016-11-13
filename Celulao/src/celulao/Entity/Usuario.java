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
public class Usuario {
    private int userID;
    private String nomeUser;
    private int nivelUser;
    private Date dataCadastro;
    
    //Construtor
    public Usuario(){
    }
    
    //métodos de acesso

    public int getUserID() {
        return userID;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public int getNivelUser() {
        return nivelUser;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setNivelUser(int nivelUser) {
        this.nivelUser = nivelUser;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public Usuario Consultar(){
        return new Usuario();  
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
}

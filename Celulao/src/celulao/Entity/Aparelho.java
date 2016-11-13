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
public class Aparelho {
    private int celularID;
    private String celularModelo;
    
    //Construtor
    public Aparelho(){
    }

    //métodos de acesso
    public int getCelularID() {
        return celularID;
    }

    public String getCelularModelo() {
        return celularModelo;
    }

    public void setCelularID(int celularID) {
        this.celularID = celularID;
    }

    public void setCelularModelo(String celularModelo) {
        this.celularModelo = celularModelo;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public Aparelho Consultar(){
        return new Aparelho();  
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
    
}

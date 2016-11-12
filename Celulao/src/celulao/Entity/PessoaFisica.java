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
public class PessoaFisica extends Cliente{
    private String CPF;
    private Date dataNasc;

    //Construtor
    public PessoaFisica() { }

    //métodos de acesso
    public String getCPF() {
        return CPF;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public PessoaFisica Consultar(){
        return new PessoaFisica();
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
}

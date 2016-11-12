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
public class PessoaJuridica extends Cliente{
    private String CNPJ;

    //construtor
    public PessoaJuridica() {
    }

    //métodos de acesso
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    //métodos CRUD
    public void Cadastrar(){
        
    }
    
    public PessoaJuridica Consultar(){
        return new PessoaJuridica();
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }
}

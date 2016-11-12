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
public class Cliente {
    private int clienteID;
    private String nomeCliente;
    private String endereco;
    private String telefone1;
    private String telefone2;

    //Construtor
    public Cliente() {
    }

    //métodos de acesso
    public int getClienteID() {
        return clienteID;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
}

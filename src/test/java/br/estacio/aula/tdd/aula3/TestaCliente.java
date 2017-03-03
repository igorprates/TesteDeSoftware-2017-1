/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.aula.tdd.aula3;

import br.estacio.aula.tdd.dao.ClienteDAO;
import br.estacio.aula.tdd.model.Cliente;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class TestaCliente {
    
    @Test
    public void cadastraCliente(){
        Cliente clienteAserCadastrado = new Cliente();
        
        clienteAserCadastrado.setNome("João");
        clienteAserCadastrado.setLogin("joazinho");
        clienteAserCadastrado.setSenha("j123");
        
        ClienteDAO clienteDAO = new ClienteDAO();
        
        Cliente clienteCadastrado = clienteDAO.salvarCliente(clienteAserCadastrado);
    
        Assert.assertNotNull(clienteCadastrado);
    }
    
    
}

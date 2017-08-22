package com.algaworks.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.algaworks.model.Cliente;
import com.algaworks.model.Endereco;
import com.algaworks.model.Estados;

@ManagedBean
@SessionScoped
public class ClientesManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientes = new ArrayList<>();
	private Cliente clienteEdicao = new Cliente();
	private Endereco enderecoEdicao = new Endereco();
	
	
	
	public ClientesManager() {
		super();
	}


	public void novoEndereco() {
		enderecoEdicao = new Endereco();
	}
	
	public String novoCliente() {
		clienteEdicao = new Cliente();
		return "CadastroCliente?faces-redirect=true";
	}
	
	public void salvar() {
		if (!clientes.contains(clienteEdicao)) {
			clientes.add(clienteEdicao);
		}
		clienteEdicao = new Cliente();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salvo com sucesso!"));
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getClienteEdicao() {
		return clienteEdicao;
	}

	public void setClienteEdicao(Cliente clienteEdicao) {
		this.clienteEdicao = clienteEdicao;
	}

	public Endereco getEnderecoEdicao() {
		return enderecoEdicao;
	}

	public void setEnderecoEdicao(Endereco enderecoEdicao) {
		this.enderecoEdicao = enderecoEdicao;
	}
	
	public Estados[] getEstados() {
		return enderecoEdicao.getEstados().values();
	}

	
	
}
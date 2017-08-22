package com.algaworks.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.model.Estados;
import com.algaworks.model.Membro;

@Named
@ViewScoped
public class CadastroMembroBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private Membro membro;
	@Inject
	private Estados estados;
	
	
	
	
	public Membro getMembro() {
		return membro;
	}
	public void setMembro(Membro membro) {
		this.membro = membro;
	}
	
	public Estados[] getEstados() {
		return Estados.values();
	}
	public void setEstados(Estados estados) {
		this.estados = estados;
	}
	
	
	
	

}

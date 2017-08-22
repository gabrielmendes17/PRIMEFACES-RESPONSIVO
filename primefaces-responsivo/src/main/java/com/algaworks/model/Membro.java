package com.algaworks.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Membro implements Serializable{

	private static final long serialVersionUID = 1L;
		
		private Long id;
		private String nome;
		private char sexo;
		private String estadoCivil;
		private String rg;
		private String cpf;
		private String profissao;
		private String telefone;
		private String celular;
		private Date dataNascimento;
		private String observacoes;
		private Endereco endereco;
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCelular() {
			return celular;
		}
		public void setCelular(String celular) {
			this.celular = celular;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public String getObservacoes() {
			return observacoes;
		}
		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((celular == null) ? 0 : celular.hashCode());
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
			result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
			result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
			result = prime * result + ((profissao == null) ? 0 : profissao.hashCode());
			result = prime * result + ((rg == null) ? 0 : rg.hashCode());
			result = prime * result + sexo;
			result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Membro other = (Membro) obj;
			if (celular == null) {
				if (other.celular != null)
					return false;
			} else if (!celular.equals(other.celular))
				return false;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			if (dataNascimento == null) {
				if (other.dataNascimento != null)
					return false;
			} else if (!dataNascimento.equals(other.dataNascimento))
				return false;
			if (endereco == null) {
				if (other.endereco != null)
					return false;
			} else if (!endereco.equals(other.endereco))
				return false;
			if (estadoCivil == null) {
				if (other.estadoCivil != null)
					return false;
			} else if (!estadoCivil.equals(other.estadoCivil))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (observacoes == null) {
				if (other.observacoes != null)
					return false;
			} else if (!observacoes.equals(other.observacoes))
				return false;
			if (profissao == null) {
				if (other.profissao != null)
					return false;
			} else if (!profissao.equals(other.profissao))
				return false;
			if (rg == null) {
				if (other.rg != null)
					return false;
			} else if (!rg.equals(other.rg))
				return false;
			if (sexo != other.sexo)
				return false;
			if (telefone == null) {
				if (other.telefone != null)
					return false;
			} else if (!telefone.equals(other.telefone))
				return false;
			return true;
		}
		
		
		
	
	

}

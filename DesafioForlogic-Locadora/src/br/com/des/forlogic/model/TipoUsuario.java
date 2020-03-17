/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.model;

/**
 *
 * @author Stefanie
 */
public enum TipoUsuario {
    
	ADMIN(1, "Usuário Administrador"),
	CUSTOMER(2, "Usuário Cliente"); 
	
	private int codigo;
	private String descricao;
	
	private TipoUsuario(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	//Retorna o objeto tipoUsuario
	public static TipoUsuario TipoUsuarioToEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(TipoUsuario tipoUsuario : TipoUsuario.values()) {
			if(codigo.equals(tipoUsuario.getCodigo())) {
				return tipoUsuario;
			}
		}
		
		throw new IllegalArgumentException("Não existe esse tipo de usuario: " + codigo.toString());
	}
    
}

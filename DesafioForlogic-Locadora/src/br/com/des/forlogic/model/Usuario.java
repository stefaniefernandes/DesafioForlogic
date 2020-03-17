/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.model;


import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Stefanie
 */
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String nome;
    private String cpf;
    private String endereco;
    private Date datanasc;
    private int tipoUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public TipoUsuario getTipoUsuario() {
        return TipoUsuario.TipoUsuarioToEnum(tipoUsuario) ; 
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario.getCodigo();
    }
    
        public Date getdataNasc() {
        return datanasc;
    }

    public void setdataNasc(Date dataNasc) {
        this.datanasc = dataNasc;
    }
    
}

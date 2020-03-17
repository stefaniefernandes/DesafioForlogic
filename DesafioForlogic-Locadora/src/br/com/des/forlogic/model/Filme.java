/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Stefanie
 */
@Entity
@Table(name = "filme")
public class Filme implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private Integer id;
    @Column
    private String nome;
    private String sinopse;
    private Integer duracao;
<<<<<<< HEAD
    private String genero;
=======
    
    private Genero genero;
>>>>>>> master

    public Filme(){

    }
    
<<<<<<< HEAD
    public Filme(Integer id, String nome, String sinopse, Integer duracao, String genero) {
=======
    public Filme(Integer id, String nome, String sinopse, Integer duracao) {
>>>>>>> master
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.duracao = duracao;
<<<<<<< HEAD
        this.genero = genero;
=======
>>>>>>> master
    }

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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    
<<<<<<< HEAD
     public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
=======
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
>>>>>>> master
        this.genero = genero;
    }
}

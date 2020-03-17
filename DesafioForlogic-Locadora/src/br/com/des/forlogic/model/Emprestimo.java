/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Stefanie
 */
public class Emprestimo implements Serializable {
   
     private static final long serialVersionUID = 1L;
     
     private Integer id;
     private Usuario usuario;
     private LocalDateTime dataEmprestimo;
     private LocalDateTime dataDevolucao;
     
}

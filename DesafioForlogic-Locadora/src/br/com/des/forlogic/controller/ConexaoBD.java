///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */

package br.com.des.forlogic.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//
///**
// *
// * @author Stefanie
// */
//
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/locadora";
    private String usuario = "postgres";
    private String senha = "1234";
    public Connection conexao;
    
public void conexao() {
    try{
        System.setProperty("jdbc.Drivers", driver);
        conexao=DriverManager.getConnection(caminho, usuario, senha);
        JOptionPane.showMessageDialog(null, "Conexão feita com sucesso!");
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: \n"+ex);
    }
}

public void desconecta(){
    try{
        conexao.close();
        JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
    } catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao desconectar com o banco de dados: \n"+ex);
    }        
    }
}
     

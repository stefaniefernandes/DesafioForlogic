/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.des.forlogic.view;

import br.com.des.forlogic.controller.ConexaoBD;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefanie
 */
public class PainelAdm extends javax.swing.JFrame {

    /**
     * Creates new form PainelAdm
     */
    
    ConexaoBD conecta = new ConexaoBD();
    
    public PainelAdm() {
        initComponents();
        setTitle("Painel do Administrador");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         setResizable(false);
        conecta.conexao();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadUsuarios = new javax.swing.JButton();
        jButtonCadFilmes = new javax.swing.JButton();
        jButtonListarEmprestimos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabelFundoPainelAdm = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFilme = new javax.swing.JMenu();
        jMenuItemFilmeListar = new javax.swing.JMenuItem();
        jMenuItemFilmeCad = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemUsuarioCad = new javax.swing.JMenuItem();
        jMenuGenero = new javax.swing.JMenu();
        jMenuItemGeneroCad = new javax.swing.JMenuItem();
        jMenuItemGeneroAlter = new javax.swing.JMenuItem();
        jMenuEmprestimo = new javax.swing.JMenu();
        jMenuItemEmprestimo = new javax.swing.JMenuItem();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem Vindo!");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabel2.setText("Cadastros:");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(20, 0, 80, 20);

        jButtonCadUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadUsuarios.png"))); // NOI18N
        jButtonCadUsuarios.setToolTipText("Usuários");
        jButtonCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadUsuariosActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadUsuarios);
        jButtonCadUsuarios.setBounds(130, 20, 100, 70);

        jButtonCadFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadFilmes1_1.png"))); // NOI18N
        jButtonCadFilmes.setToolTipText("Filmes");
        jButtonCadFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadFilmesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadFilmes);
        jButtonCadFilmes.setBounds(20, 20, 100, 70);

        jButtonListarEmprestimos.setText("Empréstimos");
        jButtonListarEmprestimos.setToolTipText("Empréstimos de filmes");
        jButtonListarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEmprestimosActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonListarEmprestimos);
        jButtonListarEmprestimos.setBounds(20, 160, 110, 60);

        jLabel3.setText("Visualizar:");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(30, 140, 70, 16);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(-200, -10, 730, 250);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(-10, 40, 530, 240);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE LOCAÇÃO DE FILMES");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 430, 30);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar tela bem vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(460, 0, 50, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(240, 120, 530, 310);

        jLabelFundoPainelAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoPainelAdm.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPainelAdm);
        jLabelFundoPainelAdm.setBounds(-50, 0, 1030, 960);

        jMenuFilme.setText("Filmes");

        jMenuItemFilmeListar.setText("Listar");
        jMenuItemFilmeListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmeListarActionPerformed(evt);
            }
        });
        jMenuFilme.add(jMenuItemFilmeListar);

        jMenuItemFilmeCad.setText("Cadastrar");
        jMenuItemFilmeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmeCadActionPerformed(evt);
            }
        });
        jMenuFilme.add(jMenuItemFilmeCad);

        jMenuBar1.add(jMenuFilme);

        jMenuUsuario.setText("Usuários");

        jMenuItemUsuarioCad.setText("Cadastrar");
        jMenuItemUsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioCadActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemUsuarioCad);

        jMenuBar1.add(jMenuUsuario);

        jMenuGenero.setText("Gênero");

        jMenuItemGeneroCad.setText("Cadastrar");
        jMenuItemGeneroCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGeneroCadActionPerformed(evt);
            }
        });
        jMenuGenero.add(jMenuItemGeneroCad);

        jMenuItemGeneroAlter.setText("Alterar/Excluir");
        jMenuGenero.add(jMenuItemGeneroAlter);

        jMenuBar1.add(jMenuGenero);

        jMenuEmprestimo.setText("Empéstimos");

        jMenuItemEmprestimo.setText("Empréstimos");
        jMenuItemEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmprestimoActionPerformed(evt);
            }
        });
        jMenuEmprestimo.add(jMenuItemEmprestimo);

        jMenuBar1.add(jMenuEmprestimo);

        jMenuConfiguracoes.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuConfiguracoes);

        jMenu6.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemSobre);

        jMenuBar1.add(jMenu6);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(987, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFilmeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmeCadActionPerformed
        FormsFilmes tela = new FormsFilmes();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemFilmeCadActionPerformed

    private void jMenuItemFilmeListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmeListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFilmeListarActionPerformed

    private void jMenuItemUsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioCadActionPerformed
       FormsUsuarios tela = new FormsUsuarios();
       tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioCadActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
       jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        PainelAdm tela = new PainelAdm();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jButtonCadFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFilmesActionPerformed
        FormsFilmes tela = new FormsFilmes();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadFilmesActionPerformed

    private void jButtonCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadUsuariosActionPerformed
       FormsUsuarios tela = new FormsUsuarios();
       tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadUsuariosActionPerformed

    private void jButtonListarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEmprestimosActionPerformed
        FormsEmprestimo tela = new FormsEmprestimo();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonListarEmprestimosActionPerformed

    private void jMenuItemEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmprestimoActionPerformed
        FormsEmprestimo tela = new FormsEmprestimo();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemEmprestimoActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Sistema para locadora - Desafio Forlogic \n"
                + "Made by: Stefanie Fernandes");
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemGeneroCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGeneroCadActionPerformed
        FormsGenero tela = new FormsGenero();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemGeneroCadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadFilmes;
    private javax.swing.JButton jButtonCadUsuarios;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonListarEmprestimos;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoPainelAdm;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenu jMenuEmprestimo;
    private javax.swing.JMenu jMenuFilme;
    private javax.swing.JMenu jMenuGenero;
    private javax.swing.JMenuItem jMenuItemEmprestimo;
    private javax.swing.JMenuItem jMenuItemFilmeCad;
    private javax.swing.JMenuItem jMenuItemFilmeListar;
    private javax.swing.JMenuItem jMenuItemGeneroAlter;
    private javax.swing.JMenuItem jMenuItemGeneroCad;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemUsuarioCad;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}

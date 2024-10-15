/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Views;

import DTO.Usuario;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author aluno.saolucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        
        
        
        initComponents();
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        SubMenuUsuario = new javax.swing.JMenuItem();
        SubMenuCliente = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        SubMenuSair = new javax.swing.JMenuItem();
        MenuAgenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaPrincipal");
        setResizable(false);

        MenuCadastro.setText("Cadastro");
        MenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroActionPerformed(evt);
            }
        });

        SubMenuUsuario.setText("Usuarios");
        SubMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(SubMenuUsuario);

        SubMenuCliente.setText("Clientes");
        SubMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(SubMenuCliente);

        jMenuBar1.add(MenuCadastro);

        MenuOpcoes.setText("Opções");
        MenuOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcoesActionPerformed(evt);
            }
        });

        SubMenuSair.setText("Sair");
        SubMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSairActionPerformed(evt);
            }
        });
        MenuOpcoes.add(SubMenuSair);

        jMenuBar1.add(MenuOpcoes);

        MenuAgenda.setText("Agenda");
        MenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuAgenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastroActionPerformed

    private void SubMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuUsuarioActionPerformed
        TeladeCadastrodeUsuários tUsuarios = new TeladeCadastrodeUsuários();
        tUsuarios.setVisible(true);
        
    }//GEN-LAST:event_SubMenuUsuarioActionPerformed

    private void SubMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSairActionPerformed
             this.setVisible(false);
             
    }//GEN-LAST:event_SubMenuSairActionPerformed

    private void MenuOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuOpcoesActionPerformed

    private void SubMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuClienteActionPerformed
          // Fechar a tela atual
    this.dispose();
    
    // Criar e mostrar a nova tela
    TeladeCadastrodeClientes tCliente = new TeladeCadastrodeClientes();
    tCliente.setVisible(true);
        
    }//GEN-LAST:event_SubMenuClienteActionPerformed

    private void MenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaActionPerformed
       TelaAgenda telaAgenda = new TelaAgenda();
       
       
       telaAgenda.setVisible(true);
       
       this.dispose();
       
    }//GEN-LAST:event_MenuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAgenda;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JMenuItem SubMenuCliente;
    private javax.swing.JMenuItem SubMenuSair;
    private javax.swing.JMenuItem SubMenuUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

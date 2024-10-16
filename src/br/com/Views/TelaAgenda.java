
package br.com.Views;

import DTO.CompromissoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class TelaAgenda extends javax.swing.JFrame {
    private List<CompromissoDTO> listaCompromissos = new ArrayList<>();
    

    /**
     * Creates new form TelaAgenda
     */
    public TelaAgenda() {
        initComponents();
    }
    
    private List<CompromissoDTO> compromissosFiltrados = new ArrayList<>();

private void filtrarCompromissosPorIntervalo(String intervalo) {
    compromissosFiltrados.clear(); // Limpa a lista de compromissos filtrados

    for (CompromissoDTO compromisso : listaCompromissos) {
        // Supondo que tenha métodos para obter a data do compromisso e realizar a filtragem
        if (intervalo.equals("dia")) {
            // Lógica para filtrar por dia
            compromissosFiltrados.add(compromisso); // Adiciona à lista filtrada se a lógica for satisfeita
        } else if (intervalo.equals("semana")) {
            // Lógica para filtrar por semana
            compromissosFiltrados.add(compromisso);
        } else if (intervalo.equals("mes")) {
            // Lógica para filtrar por mês
            compromissosFiltrados.add(compromisso);
        }
    }

    // Atualiza a tabela com os compromissos filtrados
    atualizarTabela(compromissosFiltrados);
}

private void atualizarTabela(List<CompromissoDTO> compromissos) {
    DefaultTableModel model = (DefaultTableModel) jTableDHDC.getModel();
    model.setRowCount(0); // Limpa a tabela

    for (CompromissoDTO compromisso : compromissos) {
        Object[] row = {compromisso.getData(), compromisso.getHorario(), compromisso.getDescricao(), compromisso.getClienteAssociado()};
        model.addRow(row); // Adiciona nova linha à tabela
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelData = new javax.swing.JLabel();
        LabelHorario = new javax.swing.JLabel();
        LabelDescricao = new javax.swing.JLabel();
        LabelClienteAssociado = new javax.swing.JLabel();
        TextFieldDescricao = new javax.swing.JTextField();
        jFormattedTextFieldHorario = new javax.swing.JFormattedTextField();
        jComboBoxClienteAssociado = new javax.swing.JComboBox<>();
        btnAdicionarCompromisso = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDHDC = new javax.swing.JTable();
        jRadioButtonDia = new javax.swing.JRadioButton();
        jRadioButtonSemana = new javax.swing.JRadioButton();
        jRadioButtonMes = new javax.swing.JRadioButton();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);

        LabelData.setText("Data");

        LabelHorario.setText("Horário");

        LabelDescricao.setText("Descrição");

        LabelClienteAssociado.setText("Cliente Associado");

        TextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDescricaoActionPerformed(evt);
            }
        });

        jFormattedTextFieldHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHorarioActionPerformed(evt);
            }
        });

        jComboBoxClienteAssociado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxClienteAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteAssociadoActionPerformed(evt);
            }
        });

        btnAdicionarCompromisso.setText("Adicionar Compromisso");
        btnAdicionarCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCompromissoActionPerformed(evt);
            }
        });

        btnEditar.setText(" Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTableDHDC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Horário", "Descrição", "Cliente"
            }
        ));
        jTableDHDC.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableDHDCAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTableDHDC);

        jRadioButtonDia.setText("Dia");
        jRadioButtonDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDiaActionPerformed(evt);
            }
        });

        jRadioButtonSemana.setText("Semana");
        jRadioButtonSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSemanaActionPerformed(evt);
            }
        });

        jRadioButtonMes.setText("Mês");
        jRadioButtonMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMesActionPerformed(evt);
            }
        });

        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxClienteAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionarCompromisso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelData)
                            .addComponent(LabelDescricao)
                            .addComponent(LabelClienteAssociado)
                            .addComponent(LabelHorario)
                            .addComponent(TextFieldDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldHorario)
                            .addComponent(jFormattedTextFieldData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonDia)
                            .addComponent(jRadioButtonSemana)
                            .addComponent(jRadioButtonMes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelData)
                                    .addComponent(jRadioButtonDia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(LabelHorario))
                            .addComponent(jRadioButtonSemana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(LabelClienteAssociado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxClienteAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarCompromisso)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    private void jFormattedTextFieldHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldHorarioActionPerformed

    private void TextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDescricaoActionPerformed

    private void jComboBoxClienteAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteAssociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteAssociadoActionPerformed

    private void btnAdicionarCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCompromissoActionPerformed
          // Captura os valores dos campos de texto
    String data = jFormattedTextFieldData.getText();
    String horario = jFormattedTextFieldHorario.getText();
    String descricao = TextFieldDescricao.getText();
    String clienteAssociado = jComboBoxClienteAssociado.getSelectedItem().toString();

    // Validação básica para evitar campos vazios
    if (data.isEmpty() || horario.isEmpty() || descricao.isEmpty() || clienteAssociado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!");
        return;
    }

    // Criação de um novo compromisso
    CompromissoDTO novoCompromisso = new CompromissoDTO(data, horario, descricao, clienteAssociado);
    listaCompromissos.add(novoCompromisso);  // Supondo uma lista chamada listaCompromissos

    JOptionPane.showMessageDialog(this, "Compromisso adicionado com sucesso!");
    limparCampos();
    }//GEN-LAST:event_btnAdicionarCompromissoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         // Supondo que o usuário tenha selecionado um compromisso na tabela para edição
    int selectedIndex = jTableDHDC.getSelectedRow();
    
    if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um compromisso para editar.");
        return;
    }

    // Atualiza os valores do compromisso
    CompromissoDTO compromisso = listaCompromissos.get(selectedIndex);
    compromisso.setData(jFormattedTextFieldData.getText());
    compromisso.setHorario(jFormattedTextFieldHorario.getText());
    compromisso.setDescricao(TextFieldDescricao.getText());
    compromisso.setClienteAssociado(jComboBoxClienteAssociado.getSelectedItem().toString());

    JOptionPane.showMessageDialog(this, "Compromisso editado com sucesso!");
    atualizarTabela(compromissosFiltrados);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         int selectedIndex = jTableDHDC.getSelectedRow();

    if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um compromisso para excluir.");
        return;
    }

    listaCompromissos.remove(selectedIndex);  // Remove o compromisso da lista

    JOptionPane.showMessageDialog(this, "Compromisso excluído com sucesso!");
    atualizarTabela(compromissosFiltrados);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         limparCampos();
    JOptionPane.showMessageDialog(this, "Operação cancelada.");
}

private void limparCampos() {
    jFormattedTextFieldData.setText("");
    jFormattedTextFieldHorario.setText("");
    TextFieldDescricao.setText("");
    jComboBoxClienteAssociado.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jRadioButtonDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDiaActionPerformed
         // Lógica para filtrar compromissos por dia
    filtrarCompromissosPorIntervalo("dia");
    }//GEN-LAST:event_jRadioButtonDiaActionPerformed

    private void jRadioButtonSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSemanaActionPerformed
        // Lógica para filtrar compromissos por semana
    filtrarCompromissosPorIntervalo("semana");
    }//GEN-LAST:event_jRadioButtonSemanaActionPerformed

    private void jRadioButtonMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMesActionPerformed
         // Lógica para filtrar compromissos por mês
    filtrarCompromissosPorIntervalo("mes");
    }//GEN-LAST:event_jRadioButtonMesActionPerformed

    private void jTableDHDCAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableDHDCAncestorAdded
        List<CompromissoDTO> listaCompromissos = null;
         atualizarTabela(listaCompromissos);  // Carrega todos os compromissos na tabela
    }//GEN-LAST:event_jTableDHDCAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelClienteAssociado;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelHorario;
    private javax.swing.JTextField TextFieldDescricao;
    private javax.swing.JButton btnAdicionarCompromisso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> jComboBoxClienteAssociado;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorario;
    private javax.swing.JRadioButton jRadioButtonDia;
    private javax.swing.JRadioButton jRadioButtonMes;
    private javax.swing.JRadioButton jRadioButtonSemana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDHDC;
    // End of variables declaration//GEN-END:variables

    }


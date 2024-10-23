
package br.com.View;

import br.com.DAO.ClienteDAO;
import br.com.DTO.ClienteDTO;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas Vieira
 */
public class CadCli extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadCli
     */
    public CadCli() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreate1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/sky.jpg"));
        Image img= icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(), this);
            }
        };
        btnRead = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(null);
        setClosable(true);
        setTitle("Clientes");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(909, 509));
        setMinimumSize(new java.awt.Dimension(909, 509));
        setPreferredSize(new java.awt.Dimension(909, 509));

        txtEndereco.setBackground(new java.awt.Color(204, 204, 255));
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel7.setText("cpf/cnpj");

        jLabel6.setText("ID");

        txtCpfCnpj.setBackground(new java.awt.Color(204, 204, 255));

        txtId.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes ");

        jLabel2.setText("Nome");

        jLabel3.setText("e-mail");

        jLabel4.setText("endereço");

        txtTelefone.setBackground(new java.awt.Color(204, 204, 255));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel5.setText("telefone");

        btnCreate1.setBackground(new java.awt.Color(153, 0, 255));
        btnCreate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/create.png"))); // NOI18N
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(204, 204, 255));

        txtMail.setBackground(new java.awt.Color(204, 204, 255));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 0));

        btnRead.setBackground(new java.awt.Color(255, 255, 0));
        btnRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnRead.setPreferredSize(new java.awt.Dimension(51, 51));
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(255, 255, 0));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        btnDel.setPreferredSize(new java.awt.Dimension(51, 51));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpd.setBackground(new java.awt.Color(255, 255, 0));
        btnUpd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btnUpd.setPreferredSize(new java.awt.Dimension(51, 51));
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Funções por ID");

        jDesktopPane1.setLayer(btnRead, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnUpd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(txtMail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addComponent(jDesktopPane1)
        );

        setBounds(0, 0, 909, 509);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome");
        } else if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de endereço");
        } else if (txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone");
        } else if (txtMail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de email");
        } else if (txtCpfCnpj.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de cpf/cnpj");
        } else if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtMail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.criar(dto);
        }
    }//GEN-LAST:event_btnCreate1ActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtMail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.pesquisar(dto);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtMail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.deletar(dto);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome");
        } else if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de endereço");
        } else if (txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone");
        } else if (txtMail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de email");
        } else if (txtCpfCnpj.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de cpf/cnpj");
        } else if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtMail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.atualizar(dto);

        }
    }//GEN-LAST:event_btnUpdActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpd;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField txtCpfCnpj;
    public static javax.swing.JTextField txtEndereco;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtMail;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

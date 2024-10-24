
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
        lblCpf = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEndereço = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/sky.jpg"));
        Image img= icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(), this);
            }
        };
        btnPesquisarID = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblTituloID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 102));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        setClosable(true);
        setTitle("Clientes");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(909, 509));
        setMinimumSize(new java.awt.Dimension(909, 509));
        setPreferredSize(new java.awt.Dimension(909, 509));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCpf.setText("cpf/cnpj");

        lblID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblID.setText("ID");

        lblTitulo.setBackground(new java.awt.Color(102, 0, 102));
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joel\\Desktop\\POO2\\projetofinal\\src\\img\\parafuso.png")); // NOI18N
        lblTitulo.setText("Clientes ");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("e-mail");

        lblEndereço.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereço.setText("endereço");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("telefone");

        btnCriar.setBackground(new java.awt.Color(153, 0, 255));
        btnCriar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joel\\Desktop\\POO2\\projetofinal\\src\\img\\adicionar-cliente.png")); // NOI18N
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(102, 0, 102));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 0));

        btnPesquisarID.setBackground(new java.awt.Color(255, 255, 0));
        btnPesquisarID.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joel\\Desktop\\POO2\\projetofinal\\src\\img\\pesquisa.png")); // NOI18N
        btnPesquisarID.setPreferredSize(new java.awt.Dimension(51, 51));
        btnPesquisarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIDActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(255, 255, 0));
        btnDeletar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joel\\Desktop\\POO2\\projetofinal\\src\\img\\excluir.png")); // NOI18N
        btnDeletar.setPreferredSize(new java.awt.Dimension(51, 51));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joel\\Desktop\\POO2\\projetofinal\\src\\img\\editar.png")); // NOI18N
        btnEditar.setPreferredSize(new java.awt.Dimension(51, 51));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblTituloID.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTituloID.setForeground(new java.awt.Color(255, 255, 0));
        lblTituloID.setText("Funções por ID");

        jDesktopPane1.setLayer(btnPesquisarID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblTituloID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblTituloID)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTituloID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEndereço, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCriar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTelefone))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblEmail))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpf))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(4, 4, 4)
                        .addComponent(lblID)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCriar))
                        .addGap(18, 18, 18)
                        .addComponent(lblEndereço)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        setBounds(0, 0, 793, 509);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome");
        } else if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de endereço");
        } else if (txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone");
        } else if (txtEmail.getText().isEmpty()) {
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
            String emailCli = txtEmail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.criar(dto);
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnPesquisarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIDActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtEmail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.pesquisar(dto);
        }
    }//GEN-LAST:event_btnPesquisarIDActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de ID");
        } else {

            ClienteDTO dto = new ClienteDTO();
            ClienteDAO dao = new ClienteDAO();

            int idCli = Integer.parseInt(txtId.getText());
            String nomeCli = txtNome.getText();
            String enderecoCli = txtEndereco.getText();
            String telefoneCli = txtTelefone.getText();
            String emailCli = txtEmail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.deletar(dto);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de nome");
        } else if (txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de endereço");
        } else if (txtTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo de telefone");
        } else if (txtEmail.getText().isEmpty()) {
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
            String emailCli = txtEmail.getText();
            String cpf_cnpjCli = txtCpfCnpj.getText();

            dto.setIdCli(idCli);
            dto.setNome(nomeCli);
            dto.setEndereco(enderecoCli);
            dto.setTelefone(telefoneCli);
            dto.setEmail(emailCli);
            dto.setCpf_cnpj(cpf_cnpjCli);

            dao.atualizar(dto);

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfCnpjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisarID;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloID;
    public static javax.swing.JTextField txtCpfCnpj;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtEndereco;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

package br.univali.gerenciador.visao;

import br.univali.gerenciador.modelo.Consulta;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        field_Usuario.setText("abc");
        field_Senha.setText("123");
    }

    private void tentarLogin() {
        Consulta consulta = new Consulta();
        String login = field_Usuario.getText();
        String senha = field_Senha.getText();

        if (!login.equals("") && !senha.equals("")) {
            try {
                String retorno = consulta.consultaLogin(login, senha);
                if (retorno != null) {
                    this.setVisible(false);

                    Principal principal = new Principal();
                    principal.IDUser = Integer.parseInt(retorno);
                    principal.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "'Usuário' ou 'Senha' Inválidos", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Os campos 'Usuário' e 'Senha' não podem estar em branco", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        button_Cancelar = new javax.swing.JButton();
        button_Entrar = new javax.swing.JButton();
        field_Senha = new javax.swing.JPasswordField();
        label_Senha = new javax.swing.JLabel();
        field_Usuario = new javax.swing.JTextField();
        label_Login = new javax.swing.JLabel();
        label_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Syscall - Autenticação");
        setResizable(false);

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/gerenciador/visao/imagens/login.png"))); // NOI18N

        button_Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/gerenciador/visao/imagens/No.png"))); // NOI18N
        button_Cancelar.setText("Cancelar");
        button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CancelarActionPerformed(evt);
            }
        });

        button_Entrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/gerenciador/visao/imagens/OK.png"))); // NOI18N
        button_Entrar.setText("Entrar");
        button_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EntrarActionPerformed(evt);
            }
        });

        field_Senha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        label_Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Senha.setText("Senha");

        field_Usuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                field_UsuarioKeyPressed(evt);
            }
        });

        label_Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Login.setText("Login");

        label_Titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        label_Titulo.setText("Syscall");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(button_Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(field_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Senha)
                            .addComponent(label_Login))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addComponent(label_Titulo)
                        .addGap(65, 65, 65))))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_logo)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(label_Titulo)
                        .addGap(46, 46, 46)
                        .addComponent(label_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(label_Senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_Entrar)
                            .addComponent(button_Cancelar))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_CancelarActionPerformed

    private void button_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EntrarActionPerformed
        tentarLogin();
    }//GEN-LAST:event_button_EntrarActionPerformed

    private void field_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_UsuarioKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            field_Usuario.transferFocus();
        }
    }//GEN-LAST:event_field_UsuarioKeyPressed

    private void field_SenhaKeyPressed(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            tentarLogin();
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancelar;
    private javax.swing.JButton button_Entrar;
    private javax.swing.JPasswordField field_Senha;
    private javax.swing.JTextField field_Usuario;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Senha;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_logo;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}

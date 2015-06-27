package br.univali.gerenciador.visao;

import br.univali.gerenciador.modelo.Conexao;
import br.univali.gerenciador.modelo.Consulta;
import static java.io.File.separator;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JDialog {

    /**
     * Creates new form NovoCliente
     */
    DefaultTableModel modelo;
    Consulta consulta;
    Conexao con;
    int idSelecionado;
    String clienteSelecionada;

    String operacao;

    public Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        consulta = new Consulta();
        con = new Conexao();
        modelo = consulta.geraTabelaClientes();
        table_Clientes.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        panel_Principal = new javax.swing.JPanel();
        button_Novo = new javax.swing.JButton();
        button_Editar = new javax.swing.JButton();
        button_Confirmar = new javax.swing.JButton();
        button_Excluir = new javax.swing.JButton();
        scrollPane_Clientes = new javax.swing.JScrollPane();
        table_Clientes = new javax.swing.JTable();
        field_Email = new javax.swing.JTextField();
        label_Password = new javax.swing.JLabel();
        label_Login = new javax.swing.JLabel();
        field_Nome = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        label_Separador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Chamados - Clientes");
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);

        panel_Principal.setToolTipText("");
        panel_Principal.setMaximumSize(new java.awt.Dimension(480, 420));
        panel_Principal.setMinimumSize(new java.awt.Dimension(480, 420));
        panel_Principal.setName("dfd"); // NOI18N
        panel_Principal.setPreferredSize(new java.awt.Dimension(480, 420));

        button_Novo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Novo.setText("Novo");
        button_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NovoActionPerformed(evt);
            }
        });

        button_Editar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Editar.setText("Editar");
        button_Editar.setEnabled(false);
        button_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_EditarActionPerformed(evt);
            }
        });

        button_Confirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Confirmar.setText("Confirmar");
        button_Confirmar.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, field_Nome, org.jdesktop.beansbinding.ObjectProperty.create(), button_Confirmar, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        button_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ConfirmarActionPerformed(evt);
            }
        });

        button_Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Excluir.setText("Excluir");
        button_Excluir.setEnabled(false);
        button_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExcluirActionPerformed(evt);
            }
        });

        table_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "E-Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Clientes.getTableHeader().setReorderingAllowed(false);
        table_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ClientesMouseClicked(evt);
            }
        });
        scrollPane_Clientes.setViewportView(table_Clientes);

        field_Email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Email.setEnabled(false);
        field_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_EmailActionPerformed(evt);
            }
        });

        label_Password.setText("E-Mail");

        label_Login.setText("Nome");

        field_Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Nome.setEnabled(false);

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Clientes Cadastrados");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Login)
                            .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Password)
                            .addComponent(field_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button_Confirmar))
                            .addComponent(scrollPane_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_Separador)
                        .addGap(4, 4, 4)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Login)
                .addGap(6, 6, 6)
                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(label_Password)
                .addGap(6, 6, 6)
                .addComponent(field_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Novo)
                    .addComponent(button_Editar)
                    .addComponent(button_Excluir)
                    .addComponent(button_Confirmar))
                .addGap(18, 18, 18)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Separador)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(scrollPane_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//confirmar e clique na tabela
    private void botoes1() {
        button_Novo.setEnabled(true);
        button_Editar.setEnabled(true);
        button_Excluir.setEnabled(true);
        button_Confirmar.setEnabled(false);
        field_Nome.setEnabled(false);
        field_Email.setEnabled(false);
    }

    private void botoes2() {
        button_Novo.setEnabled(false);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(true);
        field_Nome.setEnabled(true);
        field_Email.setEnabled(true);
    }

    private void button_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExcluirActionPerformed
        con.removerCliente(idSelecionado, clienteSelecionada);
        modelo = consulta.geraTabelaCategorias();
        table_Clientes.setModel(modelo);
    }//GEN-LAST:event_button_ExcluirActionPerformed

    private void button_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConfirmarActionPerformed
        if (operacao.equalsIgnoreCase("novo")) {
            con.inserirCliente(field_Nome.getText(), field_Email.getText());
        } else if (operacao.equalsIgnoreCase("editar")) {
            con.atualizarCliente(idSelecionado, field_Nome.getText(), field_Email.getText());
        }
        modelo = consulta.geraTabelaClientes();
        table_Clientes.setModel(modelo);
        table_Clientes.setRowSelectionInterval(table_Clientes.getRowCount() - 1, table_Clientes.getRowCount() - 1);
        botoes1();
    }//GEN-LAST:event_button_ConfirmarActionPerformed

    private void button_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditarActionPerformed
        operacao = "editar";
        botoes2();
        
    }//GEN-LAST:event_button_EditarActionPerformed

    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed
        botoes2();
        field_Nome.setText("");
        field_Email.setText("");
        button_Confirmar.transferFocus();
        operacao = "novo";
    }//GEN-LAST:event_button_NovoActionPerformed

    private void table_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ClientesMouseClicked
        if (evt.getClickCount() == 1) {
            idSelecionado = Integer.parseInt((String) table_Clientes.getValueAt(table_Clientes.getSelectedRow(), 0));
            String[] vetor = consulta.geraVisaoCliente(idSelecionado);
            field_Nome.setText(vetor[0]);
            field_Email.setText(vetor[1]);
        }
        botoes1();

    }//GEN-LAST:event_table_ClientesMouseClicked

    private void field_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_EmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cliente dialog = new Cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Confirmar;
    private javax.swing.JButton button_Editar;
    private javax.swing.JButton button_Excluir;
    private javax.swing.JButton button_Novo;
    private javax.swing.JTextField field_Email;
    private javax.swing.JTextField field_Nome;
    private javax.swing.JLabel label_Login;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Clientes;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable table_Clientes;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

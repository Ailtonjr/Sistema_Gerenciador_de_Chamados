package br.univali.gerenciador.visao;

import br.univali.gerenciador.modelo.Conexao;
import br.univali.gerenciador.modelo.Consulta;
import javax.swing.table.DefaultTableModel;

public class Categoria extends javax.swing.JDialog {

    DefaultTableModel modelo;
    Consulta consulta;
    Conexao con;
    int idSelecionado;
    String categoriaSelecionada;
    
    String operacao;

    public Categoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        consulta = new Consulta();
        con = new Conexao();
        modelo = consulta.geraTabelaCategorias();
        tabela_Categorias.setModel(modelo);
    }
    
    public Categoria(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        consulta = new Consulta();
        con = new Conexao();
        modelo = consulta.geraTabelaCategorias();
        tabela_Categorias.setModel(modelo);
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
        scrollPane_Categorias = new javax.swing.JScrollPane();
        tabela_Categorias = new javax.swing.JTable();
        label_Nome = new javax.swing.JLabel();
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

        tabela_Categorias.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela_Categorias.getTableHeader().setReorderingAllowed(false);
        tabela_Categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_CategoriasMouseClicked(evt);
            }
        });
        scrollPane_Categorias.setViewportView(tabela_Categorias);
        if (tabela_Categorias.getColumnModel().getColumnCount() > 0) {
            tabela_Categorias.getColumnModel().getColumn(0).setPreferredWidth(1);
            tabela_Categorias.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        label_Nome.setText("Nome");

        field_Nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        field_Nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_Nome.setEnabled(false);
        field_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_NomeActionPerformed(evt);
            }
        });

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Categorias Cadastradas");

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Nome)
                    .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(button_Confirmar))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(label_Separador)
                        .addGap(14, 14, 14)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label_Nome)
                .addGap(6, 6, 6)
                .addComponent(field_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
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
                .addComponent(scrollPane_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void field_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_NomeActionPerformed

//confirmar e clique na tabela
    private void setaBotoesConfirmar() {
        button_Novo.setEnabled(true);
        button_Editar.setEnabled(true);
        button_Excluir.setEnabled(true);
        button_Confirmar.setEnabled(false);
        field_Nome.setEnabled(false);
    }
    
     private void setaBotoesEditar(){
        button_Novo.setEnabled(false);
        button_Editar.setEnabled(false);
        button_Excluir.setEnabled(false);
        button_Confirmar.setEnabled(true);
        field_Nome.setEnabled(true);
    }
     
    private void button_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExcluirActionPerformed
        con.removerCategoria(idSelecionado, categoriaSelecionada);
        modelo = consulta.geraTabelaCategorias();
        tabela_Categorias.setModel(modelo);
        button_Novo.doClick();
    }//GEN-LAST:event_button_ExcluirActionPerformed

    private void button_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ConfirmarActionPerformed
        if (operacao.equalsIgnoreCase("novo")) {
            con.inserirCategoria(field_Nome.getText());
        } else if (operacao.equalsIgnoreCase("editar")) {
            con.atualizarCategoria(idSelecionado, field_Nome.getText());
        }
        modelo = consulta.geraTabelaCategorias();
        tabela_Categorias.setModel(modelo);
        tabela_Categorias.setRowSelectionInterval(tabela_Categorias.getRowCount() - 1, tabela_Categorias.getRowCount() - 1);
        setaBotoesConfirmar();
    }//GEN-LAST:event_button_ConfirmarActionPerformed

    private void button_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_EditarActionPerformed
        setaBotoesEditar();
        operacao = "editar";
    }//GEN-LAST:event_button_EditarActionPerformed

    private void tabela_CategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_CategoriasMouseClicked
        if (evt.getClickCount() == 1) {
            idSelecionado= Integer.parseInt((String) tabela_Categorias.getValueAt(tabela_Categorias.getSelectedRow(), 0));
            categoriaSelecionada =  (String) tabela_Categorias.getValueAt(tabela_Categorias.getSelectedRow(), 1);
            String[] vetor = consulta.geraVisaoCategoria(idSelecionado);
            field_Nome.setText(vetor[1]);
            setaBotoesConfirmar();
        }
    }//GEN-LAST:event_tabela_CategoriasMouseClicked

    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed
        setaBotoesEditar();
        field_Nome.setText("");
        button_Confirmar.transferFocus();
        operacao = "novo";
    }//GEN-LAST:event_button_NovoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Categoria dialog = new Categoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField field_Nome;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Categorias;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable tabela_Categorias;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

package br.univali.gerenciador.visao;

import br.univali.gerenciador.modelo.Conexao;
import br.univali.gerenciador.modelo.Consulta;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iPotter
 */
public class Chamado extends javax.swing.JDialog {

    /**
     * Creates new form Chamado
     */
    private DefaultTableModel modelo;
    private int numChamado;
    String operacao = "editar";
    int IDUser;
    private Conexao con;
    

    public Chamado(java.awt.Frame parent, boolean modal, int numChamado) {
        super(parent, modal);
        initComponents();
        this.numChamado = numChamado;
        Consulta consulta = new Consulta();
        modelo = consulta.geraTabelaTopicos(numChamado);
        exibeListaClientes(consulta.geraListaClientes());
        exibeListaCategorias(consulta.geraListaCategorias());
        exibeChamado(consulta.geraVisaoChamado(numChamado));
        table_Topicos.setModel(modelo);
        comboBox_Cliente.setEnabled(false);
        comboBox_Categoria.setEnabled(false);
        formatted_Data.setEnabled(false);
        formatted_Hora.setEnabled(false);
        textArea_Descricao.setEnabled(false);

    }
    
    public Chamado(JFrame parent, boolean modal,String operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        con = new Conexao();
        Consulta consulta = new Consulta();
        exibeListaClientes(consulta.geraListaClientes());
        exibeListaCategorias(consulta.geraListaCategorias());
    }

    public Chamado(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void exibeChamado(String[] vetor) {
        comboBox_Cliente.setSelectedItem(vetor[0]);
        comboBox_Categoria.setSelectedItem(vetor[1]);
        formatted_Data.setText(vetor[2]);
        formatted_Hora.setText(vetor[3]);
        if (vetor[4].equalsIgnoreCase("aberto")) {
            label_Status.setForeground(new Color(0, 153, 0));
        } else {
            label_Status.setForeground(new Color(204, 0, 0));
        }
        label_Status.setText(vetor[4]);

        textArea_Descricao.setText(vetor[5]);
    }

    private void exibeListaClientes(List<String> lista) {
        for (String item : lista) {
            comboBox_Cliente.addItem(item);
        }
    }

    private void exibeListaCategorias(List<String> lista) {
        for (String item : lista) {
            comboBox_Categoria.addItem(item);
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

        jPanel3 = new javax.swing.JPanel();
        formatted_Data1 = new javax.swing.JFormattedTextField();
        panel_Principal = new javax.swing.JPanel();
        label_Cliente = new javax.swing.JLabel();
        label_Categoria = new javax.swing.JLabel();
        label_Data = new javax.swing.JLabel();
        formatted_Data = new javax.swing.JFormattedTextField();
        formatted_Hora = new javax.swing.JFormattedTextField();
        label_Hora = new javax.swing.JLabel();
        label_Descricao = new javax.swing.JLabel();
        scrollPane_Topicos = new javax.swing.JScrollPane();
        table_Topicos = new javax.swing.JTable();
        separator = new javax.swing.JSeparator();
        label_Separador = new javax.swing.JLabel();
        scrollPane_Descricao = new javax.swing.JScrollPane();
        textArea_Descricao = new javax.swing.JTextArea();
        comboBox_Categoria = new javax.swing.JComboBox();
        comboBox_Cliente = new javax.swing.JComboBox();
        button_Novo = new javax.swing.JButton();
        button_Editar = new javax.swing.JButton();
        button_Excluir = new javax.swing.JButton();
        label_Separador1 = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        label_Status = new javax.swing.JLabel();
        button_Salvar = new javax.swing.JButton();

        formatted_Data1.setFocusCycleRoot(true);
        formatted_Data1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formatted_Data1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formatted_Data1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Chamados - Chamados");
        setAlwaysOnTop(true);
        setResizable(false);

        label_Cliente.setText("Cliente");

        label_Categoria.setText("Categoria");

        label_Data.setText("Data");

        try {
            formatted_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatted_Data.setName(""); // NOI18N

        try {
            formatted_Hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatted_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatted_HoraActionPerformed(evt);
            }
        });

        label_Hora.setText("Hora");

        label_Descricao.setText("Descrição");

        table_Topicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane_Topicos.setViewportView(table_Topicos);

        separator.setForeground(new java.awt.Color(153, 153, 153));
        separator.setToolTipText("");
        separator.setName(""); // NOI18N

        label_Separador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador.setText("Tópicos Cadastrados");

        textArea_Descricao.setColumns(20);
        textArea_Descricao.setRows(5);
        scrollPane_Descricao.setViewportView(textArea_Descricao);

        comboBox_Categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        comboBox_Cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

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

        button_Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Excluir.setText("Excluir");
        button_Excluir.setEnabled(false);

        label_Separador1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Separador1.setForeground(new java.awt.Color(102, 102, 102));
        label_Separador1.setText("Informaçoes do chamado");

        separator1.setForeground(new java.awt.Color(153, 153, 153));
        separator1.setToolTipText("");
        separator1.setName(""); // NOI18N

        button_Salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_Salvar.setText("Salvar Chamado");
        button_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_PrincipalLayout = new javax.swing.GroupLayout(panel_Principal);
        panel_Principal.setLayout(panel_PrincipalLayout);
        panel_PrincipalLayout.setHorizontalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane_Topicos, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(label_Separador1)
                                        .addGap(13, 13, 13)
                                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                            .addGap(588, 588, 588)
                                            .addComponent(label_Status))
                                        .addComponent(scrollPane_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(label_Separador)
                                        .addGap(13, 13, 13)
                                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(button_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(button_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(button_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_Descricao)
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addComponent(label_Data)
                                        .addGap(104, 104, 104)
                                        .addComponent(label_Hora))
                                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                                        .addComponent(formatted_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(formatted_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Categoria)
                            .addComponent(comboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_Salvar)))
                .addContainerGap())
        );
        panel_PrincipalLayout.setVerticalGroup(
            panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Separador1)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Status)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Cliente)
                    .addComponent(label_Categoria))
                .addGap(6, 6, 6)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Data)
                    .addComponent(label_Hora))
                .addGap(5, 5, 5)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatted_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatted_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_Separador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_Novo)
                    .addComponent(button_Editar)
                    .addComponent(button_Excluir))
                .addGap(18, 18, 18)
                .addComponent(scrollPane_Topicos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Salvar)
                .addGap(23, 23, 23))
        );

        formatted_Data.getAccessibleContext().setAccessibleName("");
        formatted_Data.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NovoActionPerformed
        Topico topico = new Topico(this, true, numChamado);
        topico.setVisible(true);
    }//GEN-LAST:event_button_NovoActionPerformed

    private void formatted_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatted_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatted_HoraActionPerformed

    private void button_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SalvarActionPerformed
        int idCliente  = (con.consultaIdCliente((String) comboBox_Cliente.getSelectedItem()));
        int idCategoria  = (con.consultaIdCategoria((String) comboBox_Categoria.getSelectedItem()));
        String data = formatted_Data.getText();
        String hora = formatted_Hora.getText();
        con.inserirChamado(textArea_Descricao.getText(), idCategoria, idCliente, IDUser, data, hora);
    }//GEN-LAST:event_button_SalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Chamado dialog = new Chamado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton button_Editar;
    private javax.swing.JButton button_Excluir;
    private javax.swing.JButton button_Novo;
    private javax.swing.JButton button_Salvar;
    private javax.swing.JComboBox comboBox_Categoria;
    private javax.swing.JComboBox comboBox_Cliente;
    private javax.swing.JFormattedTextField formatted_Data;
    private javax.swing.JFormattedTextField formatted_Data1;
    private javax.swing.JFormattedTextField formatted_Hora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_Categoria;
    private javax.swing.JLabel label_Cliente;
    private javax.swing.JLabel label_Data;
    private javax.swing.JLabel label_Descricao;
    private javax.swing.JLabel label_Hora;
    private javax.swing.JLabel label_Separador;
    private javax.swing.JLabel label_Separador1;
    private javax.swing.JLabel label_Status;
    private javax.swing.JPanel panel_Principal;
    private javax.swing.JScrollPane scrollPane_Descricao;
    private javax.swing.JScrollPane scrollPane_Topicos;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTable table_Topicos;
    private javax.swing.JTextArea textArea_Descricao;
    // End of variables declaration//GEN-END:variables
}

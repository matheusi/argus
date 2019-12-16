package br.com.pbd.view;

import br.com.pbd.app.App;
import br.com.pbd.models.beans.AtendimentoPedagogico;
import java.awt.Color;
import br.com.pbd.models.beans.Endereco;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.business.ModeloTabela;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import br.com.pbd.models.fachada.CoreFachada;
import br.com.pbd.util.Criptografar;
import java.awt.Point;
import static java.lang.Thread.sleep;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

public class SelecionarAluno extends javax.swing.JFrame {
    private Point point = new Point();
    
    private int linha;
    private CoreFachada fachada;
    private Usuario usuarioCorrente;
    
    public SelecionarAluno(CoreFachada fachada, Usuario usuarioCorrente) {
        initComponents();
        this.fachada = fachada;
        preencherTabela();
        this.usuarioCorrente = usuarioCorrente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNotificacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFiliais = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System32");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Argus Acadêmico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 95, 99));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecionar Aluno");

        jButtonSelecionar.setBackground(new java.awt.Color(58, 65, 84));
        jButtonSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.setBorderPainted(false);
        jButtonSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSelecionar.setFocusPainted(false);
        jButtonSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSelecionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSelecionarMouseExited(evt);
            }
        });
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(217, 81, 51));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Voltar");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.setFocusPainted(false);
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelNotificacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNotificacao.setForeground(new java.awt.Color(217, 81, 51));
        jLabelNotificacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBackground(new java.awt.Color(194, 215, 230));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        JTableFiliais.setBackground(new java.awt.Color(194, 215, 230));
        JTableFiliais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFiliaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFiliais);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyReleased(evt);
            }
        });

        jLabel16.setText("Pesquisar:");

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome do Aluno" }));
        jComboBoxTipoPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTipoPesquisaMouseClicked(evt);
            }
        });
        jComboBoxTipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPesquisaActionPerformed(evt);
            }
        });

        jLabel17.setText("Pesquisar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 611, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxTipoPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        CadastrarAtenPedag cadastrarAtenPedag = new CadastrarAtenPedag(fachada, usuarioCorrente);
        cadastrarAtenPedag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSelecionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelecionarMouseEntered
        jButtonSelecionar.setBackground(new Color(235,235,235));
        jButtonSelecionar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonSelecionarMouseEntered

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonSelecionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelecionarMouseExited
        jButtonSelecionar.setBackground(new Color(58,65,84));
        jButtonSelecionar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSelecionarMouseExited

    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
        jButtonSair.setBackground(new Color(217,81,51));
        jButtonSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSairMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        if(linha != 0){
            CadastrarAtenPedag cadastrarAtenPedag = new CadastrarAtenPedag(fachada, usuarioCorrente, fachada.getUsuarioPorId((Integer) JTableFiliais.getValueAt(linha, 0)));
            cadastrarAtenPedag.setVisible(true);
            this.dispose();
        }else
            jLabelNotificacao.setText("Selecione um Aluno para o atendimento!");
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void JTableFiliaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFiliaisMouseClicked
        linha = JTableFiliais.getSelectedRow();
        JTableFiliais.setSelectionBackground(Color.cyan);
    }//GEN-LAST:event_JTableFiliaisMouseClicked

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jComboBoxTipoPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoPesquisaMouseClicked

    private void jComboBoxTipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoPesquisaActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        if(jComboBoxTipoPesquisa.getSelectedItem().equals("Nome"))
            preencherTabela(jTextFieldPesquisa.getText());

    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased
  
    public void preencherTabela(){
        List<Usuario> usuarios = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","TIPO","NOME","NOME DO PAI","NOME DA MÃE","LOGRADOURO"};
        
        usuarios = fachada.getTodosAlunos();

        for (Usuario usua : usuarios){
            dados.add(new Object[]{usua.getId(), usua.getTipo(), usua.getNome(), usua.getNomePai(), usua.getNomeMae(), usua.getEndereco().getLogradouro()});
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        JTableFiliais.setModel(modelo);
        JTableFiliais.getColumnModel().getColumn(0).setPreferredWidth(45);
        JTableFiliais.getColumnModel().getColumn(0).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(1).setPreferredWidth(225);
        JTableFiliais.getColumnModel().getColumn(1).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(2).setPreferredWidth(225);
        JTableFiliais.getColumnModel().getColumn(2).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(3).setPreferredWidth(210);
        JTableFiliais.getColumnModel().getColumn(3).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(4).setPreferredWidth(162);
        JTableFiliais.getColumnModel().getColumn(4).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(5).setPreferredWidth(210);
        JTableFiliais.getColumnModel().getColumn(5).setResizable(false);
        JTableFiliais.getTableHeader().setReorderingAllowed(false);
        JTableFiliais.setAutoResizeMode(JTableFiliais.AUTO_RESIZE_OFF);
        JTableFiliais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
        public void preencherTabela(String nome){
        List<Usuario> usuarios = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","TIPO","NOME","NOME DO PAI","NOME DA MÃE","LOGRADOURO"};
        
        usuarios = fachada.getUsuarioPorNome(nome);

        for (Usuario usua : usuarios){
            dados.add(new Object[]{usua.getId(), usua.getTipo(), usua.getNome(), usua.getNomePai(), usua.getNomeMae(), usua.getEndereco().getLogradouro()});
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        JTableFiliais.setModel(modelo);
        JTableFiliais.getColumnModel().getColumn(0).setPreferredWidth(45);
        JTableFiliais.getColumnModel().getColumn(0).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(1).setPreferredWidth(225);
        JTableFiliais.getColumnModel().getColumn(1).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(2).setPreferredWidth(225);
        JTableFiliais.getColumnModel().getColumn(2).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(3).setPreferredWidth(220);
        JTableFiliais.getColumnModel().getColumn(3).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(4).setPreferredWidth(162);
        JTableFiliais.getColumnModel().getColumn(4).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(5).setPreferredWidth(232);
        JTableFiliais.getColumnModel().getColumn(5).setResizable(false);
        JTableFiliais.getTableHeader().setReorderingAllowed(false);
        JTableFiliais.setAutoResizeMode(JTableFiliais.AUTO_RESIZE_OFF);
        JTableFiliais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableFiliais;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox jComboBoxTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNotificacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}

package br.com.pbd.view;

import br.com.pbd.app.App;
import br.com.pbd.models.beans.AtendimentoPedagogico;
import java.awt.Color;
import br.com.pbd.models.beans.Usuario;
import br.com.pbd.models.business.ModeloTabela;
import br.com.pbd.models.dao.exceptions.NonexistentEntityException;
import br.com.pbd.models.fachada.CoreFachada;
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

public class CadastrarAtenPedag extends javax.swing.JFrame {
    private Point point = new Point();
    
    private int linha;
    private CoreFachada fachada;
    private int confirmacaoRemocao = 0;
    private int confirmacaoEdicao = 0;
    private Usuario usuarioCorrente;
    private Usuario aluno;
    
    public CadastrarAtenPedag(CoreFachada fachada, Usuario usuarioCorrente) {
        initComponents();
        this.fachada = fachada;
        preencherTabela();
        this.usuarioCorrente = usuarioCorrente;
    }
    
    public CadastrarAtenPedag(CoreFachada fachada, Usuario usuarioCorrente, Usuario aluno) {
        initComponents();
        this.fachada = fachada;
        preencherTabela();
        this.usuarioCorrente = usuarioCorrente;
        jTextFieldPedagogo.setText(usuarioCorrente.getNome());
        this.aluno = aluno;
        jTextFieldNomeAluno.setText(aluno.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNotificacao = new javax.swing.JLabel();
        jTextFieldPedagogo = new javax.swing.JTextField();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFiliais = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonSelecionarAluno = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDescricao = new javax.swing.JTextPane();

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
        jLabel2.setText("Cadastro do Atendimento Pedagogico");

        jButtonSalvar.setBackground(new java.awt.Color(58, 65, 84));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.setFocusPainted(false);
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseExited(evt);
            }
        });
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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

        jTextFieldPedagogo.setEnabled(false);
        jTextFieldPedagogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPedagogoActionPerformed(evt);
            }
        });

        jTextFieldNomeAluno.setEnabled(false);
        jTextFieldNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAlunoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome do Aluno");

        jLabel12.setText("Nome do Pedagogo");

        jLabel13.setText("Data do Atendimento");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Em Andamento", "Finalizado" }));
        jComboBoxStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxStatusMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxStatusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxStatusMouseReleased(evt);
            }
        });
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

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

        jLabel16.setText("Pesquisar");

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

        jButtonEditar.setBackground(new java.awt.Color(58, 65, 84));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorderPainted(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditar.setFocusPainted(false);
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseExited(evt);
            }
        });
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(58, 65, 84));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBorderPainted(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.setFocusPainted(false);
        jButtonExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExcluirMouseExited(evt);
            }
        });
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonSelecionarAluno.setBackground(new java.awt.Color(58, 65, 84));
        jButtonSelecionarAluno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSelecionarAluno.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSelecionarAluno.setText("Selecionar Aluno");
        jButtonSelecionarAluno.setBorderPainted(false);
        jButtonSelecionarAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSelecionarAluno.setFocusPainted(false);
        jButtonSelecionarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSelecionarAlunoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSelecionarAlunoMouseExited(evt);
            }
        });
        jButtonSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarAlunoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPaneDescricao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxTipoPesquisa, 0, 109, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldPedagogo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jButtonSelecionarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNotificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPedagogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSelecionarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        TelaPrincipal telaPrincipal = new TelaPrincipal(fachada, usuarioCorrente);
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseEntered
        jButtonSalvar.setBackground(new Color(235,235,235));
        jButtonSalvar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonSalvarMouseEntered

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseExited
        jButtonSalvar.setBackground(new Color(58,65,84));
        jButtonSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSalvarMouseExited

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

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (!(jTextFieldPedagogo.getText().equals("") || jFormattedTextFieldData.getText().equals("") || jTextFieldNomeAluno.getText().equals(""))) {
            AtendimentoPedagogico atenPedag = new AtendimentoPedagogico();
            atenPedag.setStatus((String)jComboBoxStatus.getSelectedItem());
            List<Usuario> pessoas = new LinkedList<Usuario>();
            pessoas.add(usuarioCorrente);
            pessoas.add(fachada.getUsuarioPorId(1));
            atenPedag.setPessoas(pessoas);
            atenPedag.setDescricao(jTextPaneDescricao.getText());
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date data = formato.parse(jFormattedTextFieldData.getText());
                atenPedag.setData(data);
            } catch (ParseException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            fachada.Salvar(atenPedag);
            jLabelNotificacao.setText("Atendimento Salvo com Sucesso!");
            preencherTabela();
            limparCampos();
            
        } else {
            jLabelNotificacao.setText("Preencha todos os campos *.");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldPedagogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPedagogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPedagogoActionPerformed

    private void jTextFieldNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAlunoActionPerformed

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

    private void jButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseEntered
        jButtonEditar.setBackground(new Color(235,235,235));
        jButtonEditar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonEditarMouseEntered

    private void jButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseExited
        jButtonEditar.setBackground(new Color(58,65,84));
        jButtonEditar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonEditarMouseExited

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        confirmacaoEdicao += 1;
        if (linha != 0) {
            AtendimentoPedagogico atenPedag = fachada.getAtendPedagPorId((Integer) JTableFiliais.getValueAt(linha, 0));
            if (confirmacaoEdicao == 1) {
                jLabelNotificacao.setText("Deseja editar " + JTableFiliais.getValueAt(linha, 2) + "?");
                SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
                String result = out.format(atenPedag.getData());
                jFormattedTextFieldData.setText(result);
                jTextPaneDescricao.setText(atenPedag.getDescricao());
                jTextFieldPedagogo.setText(atenPedag.getPessoas().get(0).getNome());
                jTextFieldNomeAluno.setText(atenPedag.getPessoas().get(1).getNome());
            }
            if (confirmacaoEdicao == 2) {
                atenPedag.setDescricao(jTextPaneDescricao.getText());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    Date data = formato.parse(jFormattedTextFieldData.getText());
                    atenPedag.setData(data);
                } catch (ParseException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    fachada.Editar(atenPedag);
                    jLabelNotificacao.setText("Atendimento Salvo com Sucesso!");
                    confirmacaoEdicao = 0;
                    linha = 0;
                    preencherTabela();
                    limparCampos();
                } catch (Exception ex) {
                    jLabelNotificacao.setText("Erro ao modificar atendimento");
                    confirmacaoEdicao = 0;
                }
            }
        } else {
            jLabelNotificacao.setText("Selecione um atendimento na tabela!");
            confirmacaoEdicao = 0;
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMouseEntered
        jButtonExcluir.setBackground(new Color(235,235,235));
        jButtonExcluir.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonExcluirMouseEntered

    private void jButtonExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMouseExited
        jButtonExcluir.setBackground(new Color(58,65,84));
        jButtonExcluir.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonExcluirMouseExited

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        confirmacaoRemocao +=1;
        if(linha != 0){
            jLabelNotificacao.setText("Deseja excluir " + JTableFiliais.getValueAt(linha, 2) + "?");
            if(confirmacaoRemocao == 2){
                try {
                    fachada.Remover((Integer) JTableFiliais.getValueAt(linha, 0));
                    jLabelNotificacao.setText("Atendimento removido com sucesso!");
                    confirmacaoRemocao = 0;
                    linha = 0;
                    preencherTabela();
                } catch (NonexistentEntityException ex) {
                    jLabelNotificacao.setText("Erro ao remover atendimento!");
                    confirmacaoRemocao = 0;
                }
            }
        }else{
            jLabelNotificacao.setText("Selecione um atendimento na tabela!");
            confirmacaoRemocao = 0;
        }
            
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jComboBoxStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxStatusMouseReleased

    }//GEN-LAST:event_jComboBoxStatusMouseReleased

    private void jComboBoxStatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxStatusMousePressed

    }//GEN-LAST:event_jComboBoxStatusMousePressed

    private void jComboBoxStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxStatusMouseClicked

    }//GEN-LAST:event_jComboBoxStatusMouseClicked

    private void jButtonSelecionarAlunoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelecionarAlunoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSelecionarAlunoMouseEntered

    private void jButtonSelecionarAlunoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSelecionarAlunoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSelecionarAlunoMouseExited

    private void jButtonSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarAlunoActionPerformed
        SelecionarAluno selecionarAluno = new SelecionarAluno(fachada, usuarioCorrente);
        selecionarAluno.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSelecionarAlunoActionPerformed
    

    public void loginInvalido(){
        Point p = this.getLocation();
        CadastrarAtenPedag telaLogin = this;
        jLabelNotificacao.setText("Usuário ou senha inválidos!");
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        telaLogin.setLocation(p.x - 10, p.y);
                        sleep(20);
                        telaLogin.setLocation(p.x + 10, p.y);
                        sleep(20);
                    }
                    telaLogin.setLocation(p.x, p.y);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CadastrarAtenPedag.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    
    public void preencherTabela(){
        List<AtendimentoPedagogico> atendPedag = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","STATUS","DATA","NOME DO PEDAGOGO","NOME DO ALUNO"};
        
        atendPedag = fachada.getTodosAtendPedag();

        for (AtendimentoPedagogico atnPed : atendPedag){
            dados.add(new Object[]{atnPed.getId(), atnPed.getStatus(), atnPed.getData(), atnPed.getPessoas().get(0).getNome(), atnPed.getPessoas().get(1).getNome()});
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, coluna);
        JTableFiliais.setModel(modelo);
        JTableFiliais.getColumnModel().getColumn(0).setPreferredWidth(45);
        JTableFiliais.getColumnModel().getColumn(0).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(1).setPreferredWidth(210);
        JTableFiliais.getColumnModel().getColumn(1).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(2).setPreferredWidth(275);
        JTableFiliais.getColumnModel().getColumn(2).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(3).setPreferredWidth(275);
        JTableFiliais.getColumnModel().getColumn(3).setResizable(false);
        JTableFiliais.getColumnModel().getColumn(4).setPreferredWidth(275);
        JTableFiliais.getColumnModel().getColumn(4).setResizable(false);
        JTableFiliais.getTableHeader().setReorderingAllowed(false);
        JTableFiliais.setAutoResizeMode(JTableFiliais.AUTO_RESIZE_OFF);
        JTableFiliais.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
        public void preencherTabela(String nome){
        List<Usuario> usuarios = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","TIPO","NOME","CPF","LOGIN","LOGRADOURO"};
        
        usuarios = fachada.getUsuarioPorNome(nome);

        for (Usuario usua : usuarios){
            dados.add(new Object[]{usua.getId(), usua.getTipo(), usua.getNome(), usua.getCpf(), usua.getLogin(), usua.getEndereco().getLogradouro()});
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
        
    public void limparCampos(){
        jTextFieldPedagogo.setText("");
        jTextFieldNomeAluno.setText("");
        jFormattedTextFieldData.setText("");
        jTextPaneDescricao.setText("");      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableFiliais;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarAluno;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JComboBox jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNotificacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldPedagogo;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextPane jTextPaneDescricao;
    // End of variables declaration//GEN-END:variables
}

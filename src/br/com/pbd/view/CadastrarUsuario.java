package br.com.pbd.view;

import br.com.pbd.app.App;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

public class CadastrarUsuario extends javax.swing.JFrame {
    private Point point = new Point();
    
    private int linha;
    private CoreFachada fachada;
    private int confirmacaoRemocao = 0;
    private int confirmacaoEdicao = 0;
    private Usuario usuarioCorrente;
    
    public CadastrarUsuario(CoreFachada fachada, Usuario usuarioCorrente) {
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
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNotificacao = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        JTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNaturalidade = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFiliais = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxTipoPesquisa = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldNomePai = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldNomeMae = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

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
        jLabel2.setText("Cadastro de Pessoas");

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

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jTextFieldLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLogradouroActionPerformed(evt);
            }
        });

        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });

        JTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldComplementoActionPerformed(evt);
            }
        });

        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Logradouro*");

        jLabel4.setText("Número*");

        jLabel5.setText("Complemento");

        jLabel6.setText("Cidade*");

        jLabel7.setText("Bairro*");

        jLabel8.setText("CEP*");

        jLabel9.setText("Estado*");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldNaturalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNaturalidadeActionPerformed(evt);
            }
        });

        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jLabel10.setText("Login*");

        jLabel11.setText("Senha*");

        jLabel12.setText("Nome*");

        jLabel13.setText("Data Nascimento*");

        jLabel14.setText("Naturalidade*");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aluno", "Administrador", "Secretário", "Diretor", "Pedagogo" }));
        jComboBoxTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTipoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxTipoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxTipoMouseReleased(evt);
            }
        });
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabel15.setText("CPF do Responsável Financeiro");

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

        jComboBoxTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome" }));
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
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextFieldNomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePaiActionPerformed(evt);
            }
        });

        jLabel18.setText("Nome do Pai");

        jTextFieldNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeMaeActionPerformed(evt);
            }
        });

        jLabel19.setText("Nome da Mãe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextFieldCPF)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(22, 22, 22)
                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
     if(jComboBoxTipo.getSelectedItem().equals("Aluno")){
        if (!(jTextFieldNome.getText().equals("") || jFormattedTextFieldDataNascimento.getText().equals("") || jTextFieldNaturalidade.getText().equals("")
                || jFormattedTextFieldCEP.getText().equals("") || jTextFieldLogradouro.getText().equals("") || jTextFieldNumero.getText().equals("")
                || jTextFieldBairro.getText().equals("") || jTextFieldCidade.getText().equals("") || jFormattedTextFieldCEP.getText().equals("")
                || jTextFieldEstado.getText().equals(""))) {

    
                        Usuario novoUsuario = new Usuario();
                        novoUsuario.setNome(jTextFieldNome.getText());
                        novoUsuario.setNomePai(jTextFieldNomePai.getText());
                        novoUsuario.setNomeMae(jTextFieldNomeMae.getText());
                        novoUsuario.setNaturalidade(jTextFieldNaturalidade.getText());
                        novoUsuario.setTipo((String) jComboBoxTipo.getSelectedItem());
                        novoUsuario.setCpf(jFormattedTextFieldCPF.getText());
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            Date data = formato.parse(jFormattedTextFieldDataNascimento.getText());
                            novoUsuario.setData_nascimento(data);
                        } catch (ParseException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        Endereco endereco = new Endereco();
                        endereco.setLogradouro(jTextFieldLogradouro.getText());
                        endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                        endereco.setBairro(jTextFieldBairro.getText());
                        endereco.setCidade(jTextFieldCidade.getText());
                        endereco.setEstado(jTextFieldEstado.getText());
                        endereco.setCep(jFormattedTextFieldCEP.getText());
                        endereco.setComplemento(JTextFieldComplemento.getText());

                        fachada.SalvarEndereco(endereco);
                        novoUsuario.setEndereco(endereco);

                        fachada.SalvarUsuario(novoUsuario);
                        jLabelNotificacao.setText("Usuário Salvo com Sucesso!");
                        preencherTabela();
                        limparCampos();
            
        } else {
            jLabelNotificacao.setText("Preencha todos os campos *.");
        }
     }else{
        if (!(jTextFieldNome.getText().equals("") || jFormattedTextFieldDataNascimento.getText().equals("") || jTextFieldNaturalidade.getText().equals("")
                || jFormattedTextFieldCEP.getText().equals("") || jTextFieldLogin.getText().equals("") || jTextFieldSenha.getText().equals("")
                || jTextFieldLogradouro.getText().equals("") || jTextFieldNumero.getText().equals("") || jTextFieldBairro.getText().equals("")
                || jTextFieldCidade.getText().equals("") || jFormattedTextFieldCEP.getText().equals("") || jTextFieldEstado.getText().equals(""))) {
            List<Usuario> usuarios = fachada.ValidarLogin(jTextFieldLogin.getText(), Criptografar.encriptografar(jTextFieldSenha.getText()));
            if (!usuarios.isEmpty()) {
                usuarios.stream().forEach((u) -> {
                    if (!(u.getLogin().equals(jTextFieldLogin.getText()))) {
                        Usuario novoUsuario = new Usuario();
                        novoUsuario.setNome(jTextFieldNome.getText());
//                        novoUsuario.setNomePai(jTextFieldNomePai.getText());
//                        novoUsuario.setNomeMae(jTextFieldNomeMae.getText());
                        novoUsuario.setLogin(jTextFieldLogin.getText());
                        novoUsuario.setSenha(Criptografar.encriptografar(jTextFieldSenha.getText()));
                        novoUsuario.setNaturalidade(jTextFieldNaturalidade.getText());
                        novoUsuario.setTipo((String) jComboBoxTipo.getSelectedItem());
                        novoUsuario.setCpf(jFormattedTextFieldCPF.getText());
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            Date data = formato.parse(jFormattedTextFieldDataNascimento.getText());
                            novoUsuario.setData_nascimento(data);
                        } catch (ParseException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        Endereco endereco = new Endereco();
                        endereco.setLogradouro(jTextFieldLogradouro.getText());
                        endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                        endereco.setBairro(jTextFieldBairro.getText());
                        endereco.setCidade(jTextFieldCidade.getText());
                        endereco.setEstado(jTextFieldEstado.getText());
                        endereco.setCep(jFormattedTextFieldCEP.getText());
                        endereco.setComplemento(JTextFieldComplemento.getText());

                        fachada.SalvarEndereco(endereco);
                        novoUsuario.setEndereco(endereco);

                        fachada.SalvarUsuario(novoUsuario);
                        jLabelNotificacao.setText("Usuário Salvo com Sucesso!");
                        preencherTabela();
                        limparCampos();
                    } else {
                        jLabelNotificacao.setText("Usuário já existe!");
                    }
                });
            } else {
                        Usuario novoUsuario = new Usuario();
                        novoUsuario.setNome(jTextFieldNome.getText());
                        novoUsuario.setLogin(jTextFieldLogin.getText());
                        novoUsuario.setSenha(Criptografar.encriptografar(jTextFieldSenha.getText()));
                        novoUsuario.setNaturalidade(jTextFieldNaturalidade.getText());
                        novoUsuario.setTipo((String) jComboBoxTipo.getSelectedItem());
                        novoUsuario.setCpf(jFormattedTextFieldCPF.getText());
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            Date data = formato.parse(jFormattedTextFieldDataNascimento.getText());
                            novoUsuario.setData_nascimento(data);
                        } catch (ParseException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        Endereco endereco = new Endereco();
                        endereco.setLogradouro(jTextFieldLogradouro.getText());
                        endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                        endereco.setBairro(jTextFieldBairro.getText());
                        endereco.setCidade(jTextFieldCidade.getText());
                        endereco.setEstado(jTextFieldEstado.getText());
                        endereco.setCep(jFormattedTextFieldCEP.getText());
                        endereco.setComplemento(JTextFieldComplemento.getText());

                        fachada.SalvarEndereco(endereco);
                        novoUsuario.setEndereco(endereco);

                        fachada.SalvarUsuario(novoUsuario);
                        jLabelNotificacao.setText("Usuário Salvo com Sucesso!");
                        preencherTabela();
                        limparCampos();
            }
        } else {
            jLabelNotificacao.setText("Preencha todos os campos *.");
        }
     }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogradouroActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void JTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldComplementoActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNaturalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNaturalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNaturalidadeActionPerformed

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

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

    private void jComboBoxTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoMouseClicked

                
                
    }//GEN-LAST:event_jComboBoxTipoMouseClicked

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
            Usuario usuario = fachada.getUsuarioPorId((Integer) JTableFiliais.getValueAt(linha, 0));
            if (confirmacaoEdicao == 1) {
                jLabelNotificacao.setText("Deseja editar " + JTableFiliais.getValueAt(linha, 2) + "?");
                jTextFieldNome.setText(usuario.getNome());
                SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
                String result = out.format(usuario.getData_nascimento());
                jFormattedTextFieldDataNascimento.setText(result);
                jTextFieldNaturalidade.setText(usuario.getNaturalidade());
                jFormattedTextFieldCEP.setText(usuario.getEndereco().getCep());
                jTextFieldLogin.setText(usuario.getLogin());
                jTextFieldLogin.setEnabled(false);
                jTextFieldSenha.setText(Criptografar.encriptografar(usuario.getSenha()));
                jTextFieldLogradouro.setText(usuario.getEndereco().getLogradouro());
                jTextFieldNumero.setText(Integer.toString(usuario.getEndereco().getNumero()));
                jTextFieldBairro.setText(usuario.getEndereco().getBairro());
                jTextFieldCidade.setText(usuario.getEndereco().getCidade());
                jFormattedTextFieldCPF.setText(usuario.getCpf());
                jTextFieldEstado.setText(usuario.getEndereco().getEstado());
                JTextFieldComplemento.setText(usuario.getEndereco().getComplemento());
            }
            if (confirmacaoEdicao == 2) {
                if (!(jTextFieldNome.getText().equals("") || jFormattedTextFieldDataNascimento.getText().equals("") || jTextFieldNaturalidade.getText().equals("")
                        || jFormattedTextFieldCEP.getText().equals("") || jTextFieldLogin.getText().equals("") || jTextFieldSenha.getText().equals("")
                        || jTextFieldLogradouro.getText().equals("") || jTextFieldNumero.getText().equals("") || jTextFieldBairro.getText().equals("")
                        || jTextFieldCidade.getText().equals("") || jFormattedTextFieldCEP.getText().equals("") || jTextFieldEstado.getText().equals(""))) {

                    usuario.setNome(jTextFieldNome.getText());
                    usuario.setLogin(jTextFieldLogin.getText());
                    usuario.setSenha(Criptografar.encriptografar(jTextFieldSenha.getText()));
                    usuario.setNaturalidade(jTextFieldNaturalidade.getText());
                    usuario.setTipo((String) jComboBoxTipo.getSelectedItem());
                    usuario.setCpf(jFormattedTextFieldCPF.getText());
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date data = formato.parse(jFormattedTextFieldDataNascimento.getText());
                        usuario.setData_nascimento(data);
                    } catch (ParseException ex) {
                        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Endereco endereco = new Endereco();
                    endereco = usuario.getEndereco();
                    endereco.setLogradouro(jTextFieldLogradouro.getText());
                    endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                    endereco.setBairro(jTextFieldBairro.getText());
                    endereco.setCidade(jTextFieldCidade.getText());
                    endereco.setEstado(jTextFieldEstado.getText());
                    endereco.setCep(jFormattedTextFieldCEP.getText());
                    endereco.setComplemento(JTextFieldComplemento.getText());
                    usuario.setEndereco(endereco);

                    try {
                        fachada.EditarEndereco(endereco);
                        fachada.EditarUsuario(usuario);
                        jLabelNotificacao.setText("Usuário Salvo com Sucesso!");
                        confirmacaoEdicao = 0;
                        linha = 0;
                        preencherTabela();
                        limparCampos();
                        jTextFieldLogin.setEnabled(true);
                    } catch (Exception ex) {
                        jLabelNotificacao.setText("Erro ao modificar usuario");
                        confirmacaoEdicao = 0;
                    }
                } else {
                    jLabelNotificacao.setText("Preencha todos os campos *.");
                    confirmacaoEdicao = 0;
                }
            }
        } else {
            jLabelNotificacao.setText("Selecione um Usuario na tabela!");
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
                    fachada.RemoverUsuario((Integer) JTableFiliais.getValueAt(linha, 0));
                    jLabelNotificacao.setText("Usuario removido com sucesso!");
                    confirmacaoRemocao = 0;
                    linha = 0;
                    preencherTabela();
                } catch (NonexistentEntityException ex) {
                    jLabelNotificacao.setText("Erro ao remover usuário!");
                    confirmacaoRemocao = 0;
                }
            }
        }else{
            jLabelNotificacao.setText("Selecione um Usuario na tabela!");
            confirmacaoRemocao = 0;
        }
            
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldNomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePaiActionPerformed

    private void jTextFieldNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeMaeActionPerformed

    private void jComboBoxTipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoMouseReleased

    }//GEN-LAST:event_jComboBoxTipoMouseReleased

    private void jComboBoxTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoMousePressed

    }//GEN-LAST:event_jComboBoxTipoMousePressed
    

    public void loginInvalido(){
        Point p = this.getLocation();
        CadastrarUsuario telaLogin = this;
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
                    Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
    
    public void preencherTabela(){
        List<Usuario> usuarios = new ArrayList<>();
        ArrayList dados = new ArrayList();
        String[] coluna = new String[]{"ID","TIPO","NOME","CPF","LOGIN","LOGRADOURO"};
        
        usuarios = fachada.getTodosUsuarios();

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
        jTextFieldNome.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jTextFieldNaturalidade.setText("");
        jFormattedTextFieldCEP.setText("");
        jTextFieldLogin.setText("");
        jTextFieldSenha.setText("");
        jTextFieldLogradouro.setText("");
        jTextFieldNumero.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldEstado.setText("");
        JTextFieldComplemento.setText("");
        jTextFieldNomePai.setText("");
        jTextFieldNomeMae.setText("");
    }
    
    public void camposLiberados(){
        if(jComboBoxTipo.getSelectedItem().equals("ALUNO")){
            jTextFieldNomeMae.setEnabled(true);
            jTextFieldNomePai.setEnabled(true);
            jTextFieldLogin.setEnabled(false);
            jTextFieldSenha.setEnabled(false);
        }else{
            jTextFieldNomePai.setEnabled(false);
            jTextFieldNomeMae.setEnabled(false);
            jTextFieldLogin.setEnabled(true);
            jTextFieldSenha.setEnabled(true);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableFiliais;
    private javax.swing.JTextField JTextFieldComplemento;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JComboBox jComboBoxTipoPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNotificacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNaturalidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeMae;
    private javax.swing.JTextField jTextFieldNomePai;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}

package br.com.pbd.view;

import br.com.pbd.models.beans.Usuario;
import java.awt.Color;
import br.com.pbd.models.fachada.CoreFachada;
import java.awt.Point;

public class TelaPrincipal extends javax.swing.JFrame {
    private Point point = new Point();
    private CoreFachada fachada;
    private Usuario usuarioCorrente;
    
    public TelaPrincipal(CoreFachada fachada, Usuario usuarioCorrente) {
        initComponents();
        this.fachada = fachada;
        this.usuarioCorrente = usuarioCorrente;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonUsuários = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonAtendPedag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System32");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1116, 719));
        setSize(new java.awt.Dimension(1116, 719));
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        jButtonUsuários.setBackground(new java.awt.Color(58, 65, 84));
        jButtonUsuários.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUsuários.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuários.setText("Cadastrar Pessoas");
        jButtonUsuários.setBorderPainted(false);
        jButtonUsuários.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUsuários.setFocusPainted(false);
        jButtonUsuários.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonUsuáriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonUsuáriosMouseExited(evt);
            }
        });
        jButtonUsuários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuáriosActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(217, 81, 51));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Sair");
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

        jButtonAtendPedag.setBackground(new java.awt.Color(58, 65, 84));
        jButtonAtendPedag.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAtendPedag.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtendPedag.setText("Atendimento Pedagogico");
        jButtonAtendPedag.setBorderPainted(false);
        jButtonAtendPedag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtendPedag.setFocusPainted(false);
        jButtonAtendPedag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAtendPedagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAtendPedagMouseExited(evt);
            }
        });
        jButtonAtendPedag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendPedagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUsuários, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAtendPedag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUsuários, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtendPedag, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonUsuáriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUsuáriosMouseEntered
        jButtonUsuários.setBackground(new Color(235,235,235));
        jButtonUsuários.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonUsuáriosMouseEntered

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setBackground(new Color(235,235,235));
        jButtonSair.setForeground(new Color(217,81,51));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonUsuáriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUsuáriosMouseExited
        jButtonUsuários.setBackground(new Color(58,65,84));
        jButtonUsuários.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonUsuáriosMouseExited

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

    private void jButtonUsuáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuáriosActionPerformed
        CadastrarUsuario cadastroUsuario = new CadastrarUsuario(fachada, usuarioCorrente);
        cadastroUsuario.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonUsuáriosActionPerformed

    private void jButtonAtendPedagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtendPedagMouseEntered
        jButtonAtendPedag.setBackground(new Color(235,235,235));
        jButtonAtendPedag.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jButtonAtendPedagMouseEntered

    private void jButtonAtendPedagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtendPedagMouseExited
       jButtonAtendPedag.setBackground(new Color(58,65,84));
        jButtonAtendPedag.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonAtendPedagMouseExited

    private void jButtonAtendPedagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendPedagActionPerformed
        CadastrarAtenPedag cadastrarAtenPedag = new CadastrarAtenPedag(fachada, usuarioCorrente);
        cadastrarAtenPedag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtendPedagActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtendPedag;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUsuários;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

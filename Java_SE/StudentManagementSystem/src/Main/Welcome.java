package Main;

import Main.Admin.adminlogin;
import Main.Student.stlogin;
import Main.Teacher.TeacherLogin;
import java.awt.Color;
import librarydemo.Login;
public class Welcome extends javax.swing.JFrame {

    
    public Welcome() {
        
        initComponents();
        close.setOpaque(false);
        minimize.setOpaque(false);
        menu.setVisible(true);
        menu2.setVisible(false);
        stlg.setOpaque(false);
        tclg.setOpaque(false);
        adlg.setOpaque(false);
        rslt.setOpaque(false);
        lbr.setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        stlg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tclg = new javax.swing.JButton();
        adlg = new javax.swing.JButton();
        rslt = new javax.swing.JButton();
        lbr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stlg.setBackground(new java.awt.Color(78, 102, 102));
        stlg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        stlg.setForeground(new java.awt.Color(240, 240, 240));
        stlg.setText("Student Login");
        stlg.setBorderPainted(false);
        stlg.setContentAreaFilled(false);
        stlg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stlg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stlg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stlgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stlgMouseExited(evt);
            }
        });
        stlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stlgActionPerformed(evt);
            }
        });
        menu2.add(stlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px_1.png"))); // NOI18N
        jButton1.setToolTipText("Close");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Options");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        menu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        tclg.setBackground(new java.awt.Color(78, 102, 102));
        tclg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        tclg.setForeground(new java.awt.Color(240, 240, 240));
        tclg.setText("Teacher Login");
        tclg.setBorderPainted(false);
        tclg.setContentAreaFilled(false);
        tclg.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        tclg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        tclg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tclgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tclgMouseExited(evt);
            }
        });
        tclg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclgActionPerformed(evt);
            }
        });
        menu2.add(tclg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 40));

        adlg.setBackground(new java.awt.Color(78, 102, 102));
        adlg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        adlg.setForeground(new java.awt.Color(240, 240, 240));
        adlg.setText("Admin Login");
        adlg.setBorderPainted(false);
        adlg.setContentAreaFilled(false);
        adlg.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        adlg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        adlg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adlgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adlgMouseExited(evt);
            }
        });
        adlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adlgActionPerformed(evt);
            }
        });
        menu2.add(adlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 40));

        rslt.setBackground(new java.awt.Color(78, 102, 102));
        rslt.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        rslt.setForeground(new java.awt.Color(240, 240, 240));
        rslt.setText("Result");
        rslt.setBorderPainted(false);
        rslt.setContentAreaFilled(false);
        rslt.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rslt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rslt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rsltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rsltMouseExited(evt);
            }
        });
        rslt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsltActionPerformed(evt);
            }
        });
        menu2.add(rslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        lbr.setBackground(new java.awt.Color(78, 102, 102));
        lbr.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        lbr.setForeground(new java.awt.Color(240, 240, 240));
        lbr.setText("Library");
        lbr.setBorderPainted(false);
        lbr.setContentAreaFilled(false);
        lbr.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        lbr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbrMouseExited(evt);
            }
        });
        lbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbrActionPerformed(evt);
            }
        });
        menu2.add(lbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        menu2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 715));

        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 715));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 38, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 60));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 675, 1246, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel7.setText("Welcome to Student Management System");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 500, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SMS.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 200, 150));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 300));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 870, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 1246, 715));

        close.setBackground(new java.awt.Color(232, 17, 35));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px.png"))); // NOI18N
        close.setToolTipText("Close");
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 2, 30, 30));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Minimize_Window_30px.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 2, 30, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_School_30px.png"))); // NOI18N
        jLabel1.setText("Student Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setOpaque(true);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
       minimize.setOpaque(false);
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
       close.setOpaque(true);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setOpaque(false);
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(Welcome.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        
        menu2.setVisible(true);
        menu.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            menu2.setVisible(false);
            menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(menu2.isShowing())
        {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
       if(menu2.isShowing())
        {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_label1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(menu2.isShowing())
        {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_jLabel2MouseClicked
   
    
    
    private void stlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseEntered

        stlg.setOpaque(true);
        stlg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_stlgMouseEntered

    private void stlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseExited
        stlg.setForeground(new Color(240,240,240,255));
        stlg.setOpaque(false);
    }//GEN-LAST:event_stlgMouseExited

    private void tclgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclgActionPerformed
        TeacherLogin t = new TeacherLogin();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tclgActionPerformed

    private void tclgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tclgMouseEntered
       tclg.setOpaque(true);
       tclg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_tclgMouseEntered

    private void tclgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tclgMouseExited
        tclg.setForeground(new Color(240,240,240,255));
        tclg.setOpaque(false);
    }//GEN-LAST:event_tclgMouseExited

    private void adlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseEntered
      adlg.setOpaque(true);
      adlg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_adlgMouseEntered

    private void adlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseExited
        adlg.setForeground(new Color(240,240,240,255));
        adlg.setOpaque(false);
    }//GEN-LAST:event_adlgMouseExited

    private void rsltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseEntered
        rslt.setOpaque(true);
        rslt.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_rsltMouseEntered

    private void rsltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseExited
        rslt.setForeground(new Color(240,240,240,255));
        rslt.setOpaque(false);
    }//GEN-LAST:event_rsltMouseExited

    private void lbrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbrMouseEntered
       lbr.setOpaque(true);
        lbr.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_lbrMouseEntered

    private void lbrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbrMouseExited
        lbr.setForeground(new Color(240,240,240,255));
        lbr.setOpaque(false);
    }//GEN-LAST:event_lbrMouseExited

    private void stlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stlgActionPerformed
        stlogin l = new stlogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_stlgActionPerformed

    private void adlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adlgActionPerformed
        adminlogin l = new adminlogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adlgActionPerformed

    private void lbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbrActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbrActionPerformed

    private void rsltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltActionPerformed
        StResult l = new StResult();
        l.setVisible(true);
    }//GEN-LAST:event_rsltActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adlg;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    private javax.swing.JButton lbr;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton minimize;
    private javax.swing.JButton rslt;
    private javax.swing.JButton stlg;
    private javax.swing.JButton tclg;
    // End of variables declaration//GEN-END:variables
}

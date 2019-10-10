
package librarydemo;

import java.awt.Color;
import librarydemo.Admin.AdminLogin;


public class Login extends javax.swing.JFrame {
    int lastX ,
        lastY ;
    
    public Login() {
        initComponents();
     
        close.setOpaque(false);
        minimize.setOpaque(false);
        menu.setVisible(true);
        menu2.setVisible(false);
        stlg.setOpaque(false);
        
        adlg.setOpaque(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        adlg = new javax.swing.JButton();
        stlg = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1248, 718));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 720));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adlg.setBackground(new java.awt.Color(78, 102, 102));
        adlg.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adlg.setForeground(new java.awt.Color(240, 240, 240));
        adlg.setText("Admin Login");
        adlg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
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
        menu2.add(adlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        stlg.setBackground(new java.awt.Color(78, 102, 102));
        stlg.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        stlg.setForeground(new java.awt.Color(240, 240, 240));
        stlg.setText("Student Login");
        stlg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
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
        menu2.add(stlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px_1.png"))); // NOI18N
        jButton4.setToolTipText("Close");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 8, 30, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Options");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        menu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        menu2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 715));

        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 684));

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        menu.setToolTipText("Menu");
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 49, 50));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 60));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 870, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/SMS.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 200, 150));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel7.setText("Welcome to Student Management System");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 500, 50));

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
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1246, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 1246, 715));

        close.setBackground(new java.awt.Color(232, 17, 35));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px.png"))); // NOI18N
        close.setBorder(null);
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
        minimize.setBorder(null);
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
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1183, 2, 30, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Library");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 8, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_School_30px.png"))); // NOI18N
        jLabel43.setText("Student Management System-");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
         menu2.setVisible(true);
        menu.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
          System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
         setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setOpaque(true);
       
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       close.setOpaque(false);
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
      minimize.setOpaque(true);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setOpaque(false);
    }//GEN-LAST:event_minimizeMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        lastX= evt.getXOnScreen();
      lastY= evt.getYOnScreen();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y; 
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
   lastX= evt.getXOnScreen();
      lastY= evt.getYOnScreen();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
          int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y; 
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      lastX= evt.getXOnScreen();
      lastY= evt.getYOnScreen();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX,getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y; 
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       if(menu2.isShowing())
        {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       if(menu2.isShowing())
        {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void stlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseExited
        stlg.setForeground(new Color(240,240,240,255));
        stlg.setOpaque(false);
    }//GEN-LAST:event_stlgMouseExited

    private void stlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseEntered

        stlg.setOpaque(true);
        stlg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_stlgMouseEntered

    private void adlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseExited
        adlg.setForeground(new Color(240,240,240,255));
        adlg.setOpaque(false);
    }//GEN-LAST:event_adlgMouseExited

    private void adlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseEntered
        adlg.setOpaque(true);
        adlg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_adlgMouseEntered

    private void stlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stlgActionPerformed
        StudentLogin s = new StudentLogin();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stlgActionPerformed

    private void adlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adlgActionPerformed
        AdminLogin a = new AdminLogin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adlgActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adlg;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton minimize;
    private javax.swing.JButton stlg;
    // End of variables declaration//GEN-END:variables
}
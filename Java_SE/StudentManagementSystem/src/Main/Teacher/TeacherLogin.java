
package Main.Teacher;

import Main.Admin.adminlogin;
import Main.Connect;
import Main.StResult;
import Main.Student.stlogin;
import Main.Welcome;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class TeacherLogin extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst, pst2 = null;
    
    public TeacherLogin() {
        initComponents();
        men2.setVisible(false);
        conn = Connect.Studentdb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        men2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        stlg = new javax.swing.JButton();
        tclg = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        adlg = new javax.swing.JButton();
        rslt = new javax.swing.JButton();
        lbr = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        men = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lg = new javax.swing.JButton();
        fgt = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        show = new javax.swing.JButton();
        label1 = new java.awt.Label();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        men2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px_1.png"))); // NOI18N
        jButton4.setToolTipText("Close");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        men2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Options");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        men2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

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
        men2.add(stlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        tclg.setBackground(new java.awt.Color(78, 102, 102));
        tclg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        tclg.setForeground(new java.awt.Color(51, 204, 255));
        tclg.setText("Teacher Login");
        tclg.setBorderPainted(false);
        tclg.setContentAreaFilled(false);
        tclg.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        tclg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        tclg.setOpaque(true);
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
        men2.add(tclg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 40));

        Home.setBackground(new java.awt.Color(78, 102, 102));
        Home.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        Home.setForeground(new java.awt.Color(240, 240, 240));
        Home.setText("Home");
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        men2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 40));

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
        men2.add(adlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, 40));

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
        men2.add(rslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

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
        men2.add(lbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 40));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG2.png"))); // NOI18N
        label.setText("jLabel2");
        men2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 715));

        jPanel1.add(men2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 715));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        men.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        men.setBorderPainted(false);
        men.setContentAreaFilled(false);
        men.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menActionPerformed(evt);
            }
        });
        jPanel2.add(men, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 35, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SMS2.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Student");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Management System");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 10));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Teacher Login");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Teacher ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setText("Enter Your Teacher ID");
        user.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Password");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 20));

        lg.setBackground(new java.awt.Color(0, 153, 153));
        lg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lg.setForeground(new java.awt.Color(255, 255, 255));
        lg.setText("Login");
        lg.setBorderPainted(false);
        lg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgMouseClicked(evt);
            }
        });
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });
        jPanel3.add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, 40));

        fgt.setBackground(new java.awt.Color(0, 0, 0));
        fgt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fgt.setForeground(new java.awt.Color(102, 102, 102));
        fgt.setText("Fogotten Password?");
        fgt.setBorder(null);
        fgt.setBorderPainted(false);
        fgt.setContentAreaFilled(false);
        fgt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fgt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fgtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fgtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fgtMouseExited(evt);
            }
        });
        fgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fgtActionPerformed(evt);
            }
        });
        jPanel3.add(fgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 189, 30));

        pass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("Enter Your Password");
        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 30));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Eye_22px.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showMouseReleased(evt);
            }
        });
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 380, 470));

        label1.setAlignment(1);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1246, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 1246, 715));

        close.setBackground(new java.awt.Color(232, 17, 35));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px.png"))); // NOI18N
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
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 1, 30, 30));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Minimize_Window_30px.png"))); // NOI18N
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
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 1, 30, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_School_30px.png"))); // NOI18N
        jLabel3.setText("Student Management System-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 8, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setOpaque(true);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setOpaque(false);
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setOpaque(true);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setOpaque(false);
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(TeacherLogin.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void menActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menActionPerformed
        men2.setVisible(true);
        men.setVisible(false);
        user.setEnabled(false);
        pass.setEnabled(false);
        lg.setEnabled(false);
        fgt.setEnabled(false);
        if("".equals(user.getText()))
        {
            user.setText("Enter Your Student ID");
        }
        else if("".equals(pass.getText()))
        {
            pass.setText("Enter Your Password");
        }
        else if(!"".equals(user.getText()))
        {
            user.setText(user.getText());
        }
        else if(!"".equals(pass.getText()))
        {
            pass.setText(pass.getText());
        }
    }//GEN-LAST:event_menActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        men2.setVisible(false);
        men.setVisible(true);
        user.setEnabled(true);
        pass.setEnabled(true);
        lg.setEnabled(true);
        fgt.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void stlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseEntered
        stlg.setOpaque(true);
        stlg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_stlgMouseEntered

    private void stlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseExited
        stlg.setForeground(new Color(240,240,240,255));
        stlg.setOpaque(false);
    }//GEN-LAST:event_stlgMouseExited

    private void tclgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tclgMouseEntered
        tclg.setOpaque(true);
        tclg.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_tclgMouseEntered

    private void tclgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tclgMouseExited
        tclg.setForeground(new Color(51,204,255,255));
        tclg.setOpaque(true);
    }//GEN-LAST:event_tclgMouseExited

    private void tclgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tclgActionPerformed

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Home.setOpaque(true);
        Home.setForeground(new Color(51,204,255,255));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setForeground(new Color(240,240,240,255));
        Home.setOpaque(false);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Welcome w = new Welcome();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

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
        stlogin s = new stlogin();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stlgActionPerformed

    private void adlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adlgActionPerformed
       adminlogin l = new adminlogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adlgActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }

        else if(!men2.isShowing()&&"".equals(pass.getText()))
        {
            pass.setText("Enter Your Password");

        }
        else if(!men2.isShowing()&&!"".equals(pass.getText()))
        {
            pass.setText(pass.getText());

        }
        user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void lgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }
    }//GEN-LAST:event_lgMouseClicked

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
        conn=Connect.Studentdb();
        String sql = "select * from telogin,teinfo,tegurdian where teinfo.ID=telogin.ID and telogin.ID=tegurdian.ID and "
                + "telogin.ID=? and telogin.password = ?";

        try {
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, user.getText());
            pst.setString(2, pass.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                tpro ad = new tpro();
                ad.setVisible(true);
                String a = rs.getString("ID");
                tpro.usern.setText(a);
                String b = rs.getString("Name");
                tpro.nam.setText(b);
                tpro.nm.setText(b);
                tpro.name.setText(b);
                String c = rs.getString("Mobile");
                tpro.phn.setText(c);
                tpro.mob.setText(c);
                String d = rs.getString("Nickname");
                tpro.nck.setText(d);
                String e = rs.getString("Gender");
                tpro.gen.setText(e);
                String f = rs.getString("Bloodgroup");
                tpro.bldd.setText(f);
                tpro.bld.setText(f);
                String g = rs.getString("MaritalStatus");
                tpro.mar.setText(g);
                String h = rs.getString("Religion");
                tpro.rlgn.setText(h);
                String i = rs.getString("Nationality");
                tpro.national.setText(i);
                String j = rs.getString("nationalID");
                tpro.nid.setText(j);
                String k = rs.getString("SocialnetID");
                tpro.fb.setText(k);
                String l = rs.getString("Email");
                tpro.eml.setText(l);
                String m = rs.getString("Alternativeemail");
                tpro.alem.setText(m);
                String n = rs.getString("Dob");
                tpro.dobb.setText(n);
                tpro.dob.setText(n);
                String p = rs.getString("f_name");
                tpro.fname2.setText(p);
                String q = rs.getString("m_name");
                tpro.mname2.setText(q);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
                user.setText("Enter Your Student ID");
                pass.setText("Enter Your Password");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_lgActionPerformed

    private void fgtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }
    }//GEN-LAST:event_fgtMouseClicked

    private void fgtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseEntered
        fgt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_fgtMouseEntered

    private void fgtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseExited
        fgt.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_fgtMouseExited

    private void fgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fgtActionPerformed
        Forgotpasss f = new Forgotpasss();
        f.setVisible(true);
        user.setEnabled(false);
        pass.setEnabled(false);
        lg.setEnabled(false);
        fgt.setEnabled(false);
    }//GEN-LAST:event_fgtActionPerformed

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }
        else if(!men2.isShowing()&&"".equals(user.getText()))
        {
            user.setText("Enter Your Password");

        }
        else if(!men2.isShowing()&&!"".equals(user.getText()))
        {
            user.setText(user.getText());

        }
        pass.setText("");
    }//GEN-LAST:event_passMouseClicked

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        pass.setEchoChar((char) 0);
    }//GEN-LAST:event_showMousePressed

    private void showMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseReleased
        pass.setEchoChar('*');
    }//GEN-LAST:event_showMouseReleased

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        
    }//GEN-LAST:event_showActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
        }
    }//GEN-LAST:event_label1MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(men2.isShowing())
        {
            men2.setVisible(false);
            men.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }
       else if(!men2.isShowing()&&"".equals(pass.getText())&&"".equals(user.getText()))
        {
            pass.setText("Enter Your Password");
            user.setText("Enter Your Student ID");
        }
       else if(!men2.isShowing()&&!"".equals(pass.getText())&&!"".equals(user.getText()))
       {
           pass.setText(pass.getText());
           user.setText(user.getText());
       }
       else if(!men2.isShowing()&&!"".equals(pass.getText())&&"".equals(user.getText()))
        {
            pass.setText(pass.getText());
            user.setText("Enter Your Student ID");
        }
        else if(!men2.isShowing()&&"".equals(pass.getText())&&!"".equals(user.getText()))
        {
            pass.setText("Enter Your Password");
            user.setText(user.getText());
        }
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void rsltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltActionPerformed
        StResult l = new StResult();
        l.setVisible(true);
    }//GEN-LAST:event_rsltActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton adlg;
    private javax.swing.JButton close;
    public static javax.swing.JButton fgt;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label;
    private java.awt.Label label1;
    private javax.swing.JButton lbr;
    public static javax.swing.JButton lg;
    private javax.swing.JButton men;
    private javax.swing.JPanel men2;
    private javax.swing.JButton minimize;
    public static javax.swing.JPasswordField pass;
    private javax.swing.JButton rslt;
    private javax.swing.JButton show;
    private javax.swing.JButton stlg;
    private javax.swing.JButton tclg;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

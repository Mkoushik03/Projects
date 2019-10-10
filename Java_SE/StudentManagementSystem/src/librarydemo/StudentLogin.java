package librarydemo;

import Main.Connect;
import Main.Welcome;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import librarydemo.Admin.AdminLogin;

public class StudentLogin extends javax.swing.JFrame {

    int lastX,
            lastY;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public StudentLogin() {
        initComponents();
        menu2.setVisible(false);
        conn=Connect.Studentdb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        adlg = new javax.swing.JButton();
        stlg = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
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
        minimize = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
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

        home.setBackground(new java.awt.Color(78, 102, 102));
        home.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        home.setForeground(new java.awt.Color(240, 240, 240));
        home.setText("Home");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 40));

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
        menu2.add(adlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 40));

        stlg.setBackground(new java.awt.Color(78, 102, 102));
        stlg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        stlg.setForeground(new java.awt.Color(51, 204, 255));
        stlg.setText("Student Login");
        stlg.setBorderPainted(false);
        stlg.setContentAreaFilled(false);
        stlg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stlg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stlg.setOpaque(true);
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
        menu2.add(stlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

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

        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 715));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 38, 32));

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SMS2.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Library");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Management System");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 10));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student Login");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Username");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setText("Enter Your Username");
        user.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 380, 470));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 1246, 715));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setOpaque(true);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setOpaque(false);
    }//GEN-LAST:event_minimizeMouseExited

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setOpaque(true);

    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setOpaque(false);
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jLabel1MousePressed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed

        menu2.setVisible(true);
        menu.setVisible(false);
        user.setEnabled(false);
        pass.setEnabled(false);
        lg.setEnabled(false);
        if ("".equals(user.getText())) {
            user.setText("Student Id");
        } else if ("".equals(pass.getText())) {
            pass.setText("Enter your password");
        } else if (!"".equals(user.getText())) {
            user.setText(user.getText());
        } else if (!"".equals(pass.getText())) {
            pass.setText(pass.getText());
        }

    }//GEN-LAST:event_menuActionPerformed

    private void adlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseEntered
        adlg.setOpaque(true);
        adlg.setForeground(new Color(51, 204, 255, 255));
    }//GEN-LAST:event_adlgMouseEntered

    private void adlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adlgMouseExited
        adlg.setForeground(new Color(240, 240, 240, 255));
        adlg.setOpaque(false);
    }//GEN-LAST:event_adlgMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered

        home.setOpaque(true);
        home.setForeground(new Color(51, 204, 255, 255));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(new Color(240, 240, 240, 255));
        home.setOpaque(false);
    }//GEN-LAST:event_homeMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEditable(true);
            lg.setEnabled(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void stlgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseEntered

        home.setOpaque(true);
        home.setForeground(new Color(51, 204, 255, 255));
    }//GEN-LAST:event_stlgMouseEntered

    private void stlgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stlgMouseExited
        home.setForeground(new Color(240, 240, 240, 255));
        home.setOpaque(false);
    }//GEN-LAST:event_stlgMouseExited

    private void stlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stlgActionPerformed

    }//GEN-LAST:event_stlgActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        } else if (!menu2.isShowing() && "".equals(pass.getText())) {
            pass.setText("Enter Your Password");

        } else if (!menu2.isShowing() && !"".equals(pass.getText())) {
            pass.setText(pass.getText());

        }
        user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void lgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }


    }//GEN-LAST:event_lgMouseClicked

    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
     String query = "select * from lstudentlogin,lstudentsetting where lstudentlogin.id=lstudentsetting.id and"
             + " lstudentlogin.username=? and lstudentlogin.password=?";
     try{
         pst=conn.prepareStatement(query);
         pst.setString(1, user.getText());
         pst.setString(2,pass.getText());
         rs=pst.executeQuery();
         if(rs.next())
         {
             StudentPanel st=new StudentPanel();
             st.setVisible(true);
             StudentLogin.this.setVisible(false);
             
             String a=rs.getString("username");
             StudentPanel.usern1.setText(a);
             String b=rs.getString("name");
             StudentPanel.snam.setText(b);
             StudentPanel.ssname.setText(b);
             String c=rs.getString("dob");
             StudentPanel.sdob.setText(c);
             String d=rs.getString("phone");
             StudentPanel.sphone.setText(d);
             StudentPanel.ssphn.setText(d);
             String e=rs.getString("batch");
             StudentPanel.sblood.setText(e);
             String f=rs.getString("dep");
             StudentPanel.sfathername.setText(f);
             
             String h=rs.getString("password");
             StudentPanel.sscnpass1.setText(h);
             String i=rs.getString("email");
             StudentPanel.ssemail.setText(i);
             String j=rs.getString("id");
             StudentPanel.ssid.setText(j);
             
         }
         
     }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_lgActionPerformed

    private void fgtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        }
    }//GEN-LAST:event_fgtMouseClicked

    private void fgtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseEntered
        fgt.setForeground(new Color(0, 153, 153));
    }//GEN-LAST:event_fgtMouseEntered

    private void fgtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fgtMouseExited
        fgt.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_fgtMouseExited

    private void fgtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fgtActionPerformed
        ForgetPassword f = new ForgetPassword();
        f.setVisible(true);
        user.setEnabled(false);
        pass.setEnabled(false);
        lg.setEnabled(false);
        fgt.setEnabled(false);
    }//GEN-LAST:event_fgtActionPerformed

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
            user.setEnabled(true);
            pass.setEnabled(true);
            lg.setEnabled(true);
            fgt.setEnabled(true);
        } else if (!menu2.isShowing() && "".equals(user.getText())) {
            user.setText("Enter Your Password");

        } else if (!menu2.isShowing() && !"".equals(user.getText())) {
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

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Login w = new Login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_label1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        user.setEnabled(true);
        pass.setEnabled(true);
        lg.setEnabled(true);
        fgt.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void adlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adlgActionPerformed
        AdminLogin a = new AdminLogin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adlgActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adlg;
    private javax.swing.JButton close;
    public static javax.swing.JButton fgt;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    public static javax.swing.JButton lg;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton minimize;
    public static javax.swing.JPasswordField pass;
    private javax.swing.JButton show;
    private javax.swing.JButton stlg;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}

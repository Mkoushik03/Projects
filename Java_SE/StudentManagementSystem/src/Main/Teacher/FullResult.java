/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Teacher;

import java.sql.*;
import Main.Connect;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class FullResult extends javax.swing.JFrame {

    Connection conn  = null;
    
    
    public FullResult() {
        initComponents();
        conn = Connect.Studentdb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tech = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        jLabel126 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        semi = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        regggg = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        course_cd = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        sec2 = new javax.swing.JComboBox<>();
        reset2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tech.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(0, 0, 0));
        label5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label5MouseClicked(evt);
            }
        });
        tech.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 610, 1216, 40));

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 102, 102));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Full Sec Result");
        tech.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1220, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel12.setText("Tech");
        tech.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1216, 50));

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel127.setText("Select Semister");
        tech.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        semi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        semi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semiMouseClicked(evt);
            }
        });
        semi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semiActionPerformed(evt);
            }
        });
        tech.add(semi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, 40));

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regggg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Code", "Course Title"
            }
        ));
        regggg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reggggMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(regggg);

        jPanel19.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 410));

        tech.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1190, 410));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Load");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        tech.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 115, 90, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Course Code");
        tech.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, 20));

        course_cd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                course_cdMouseClicked(evt);
            }
        });
        course_cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_cdActionPerformed(evt);
            }
        });
        tech.add(course_cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 120, 40));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Sec");
        tech.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 30, 20));

        sec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec2ActionPerformed(evt);
            }
        });
        tech.add(sec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 90, 40));

        reset2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        tech.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close-icon (1).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tech.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tech, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tech, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(70, 100, 1220, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label5MouseClicked

    private void semiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semiMouseClicked

    }//GEN-LAST:event_semiMouseClicked

    private void semiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiActionPerformed
        conn = Connect.Studentdb();
        
        String sem2 = semi.getSelectedItem().toString();

        String sql12 = "select DISTINCT Course_code from registered_courses where Semister='" + sem2 + "'and Teacher='" + tpro.nm.getText() + "' ";
        try {
            PreparedStatement pst12 = conn.prepareStatement(sql12);
            ResultSet rs12 = pst12.executeQuery();
            sec2.removeAllItems();
            course_cd.removeAllItems();

            while (rs12.next()) {
                String a = rs12.getString("Course_code");
                course_cd.addItem(a);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_semiActionPerformed

    private void reggggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reggggMouseClicked
        
    }//GEN-LAST:event_reggggMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sc = sec2.getSelectedItem().toString();
        String semi2 = semi.getSelectedItem().toString();
        String tech1 = tpro.nm.getText();

        String ld = "select * from liveresult where Semister='" + semi2 + "' and Sec='" + sc + "' and Teacher='" + tech1 + "' and Course_code='" + course_cd.getSelectedItem().toString() + "'  order by ID";
        try {
            PreparedStatement pst11 = conn.prepareStatement(ld);
            ResultSet rs5 = pst11.executeQuery();
            regggg.setModel(DbUtils.resultSetToTableModel(rs5));

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void course_cdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_cdMouseClicked

    }//GEN-LAST:event_course_cdMouseClicked

    private void course_cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_cdActionPerformed
        conn = Connect.Studentdb();
        String sem2 = semi.getSelectedItem().toString();

        if (0 == course_cd.getItemCount()) {
            sec2.removeAllItems();
            course_cd.addItem("-----Select-----");
            sec2.addItem("-----Select-----");
        } else {
            String sql13 = "select DISTINCT Sec from registered_courses where Semister='" + sem2 + "'and Teacher='" + tpro.nm.getText() + "' and Course_code='" + course_cd.getSelectedItem().toString() + "' ";
            try {
                PreparedStatement pst13 = conn.prepareStatement(sql13);
                ResultSet rs13 = pst13.executeQuery();
                sec2.removeAllItems();
                while (rs13.next()) {

                    sec2.removeAllItems();
                    String b = rs13.getString("Sec");
                    sec2.addItem(b);

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_course_cdActionPerformed

    private void sec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec2ActionPerformed

    }//GEN-LAST:event_sec2ActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        
    }//GEN-LAST:event_reset2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FullResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FullResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FullResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FullResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> course_cd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label label5;
    private javax.swing.JTable regggg;
    private javax.swing.JButton reset2;
    private javax.swing.JComboBox<String> sec2;
    private javax.swing.JComboBox<String> semi;
    private javax.swing.JPanel tech;
    // End of variables declaration//GEN-END:variables
}

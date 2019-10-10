
package Main.Admin;

import Main.Connect;
import java.sql.*;

public class Payment extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
   
    public Payment() {
        initComponents();
        conn = Connect.Studentdb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        live = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        jLabel126 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ttl = new javax.swing.JTextField();
        paid = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pay = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        live.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true));
        live.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        live.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 608, 1216, 40));

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 102, 102));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Payment");
        live.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1216, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel12.setText("Tech");
        live.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1216, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close-icon (1).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        live.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 5, 35, 35));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sudent ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        sid.setText("jLabel7");
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 140, 30));

        sname.setText("jLabel8");
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 140, 30));

        live.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 290, 170));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel4.setText("Total Payable");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 22));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel5.setText("Total Paid");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 22));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel6.setText("Total Due");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 22));

        ttl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 180, 30));

        paid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 75, 180, 30));

        due.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jPanel2.add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 135, 180, 30));

        live.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 330, 210));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 390, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setText("Add Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 40));

        live.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 460, 190));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");
        live.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        stid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        live.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 200, 30));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        live.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        getContentPane().add(live, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 650));

        setBounds(70, 100, 1220, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String in = "select ID,name from stinfo where stinfo.ID='"+stid.getText()+"'";
        String py ="select * from payment where payment.ID='"+stid.getText()+"' ";
        try {
            pst = conn.prepareStatement(in);
            pst1 = conn.prepareStatement(py);
            rs = pst.executeQuery();
            rs1 = pst1.executeQuery();
            if(rs.next() && rs1.next())
            {
                String a = rs.getString("ID");
                sid.setText(a);
                String b = rs.getString("Name");
                sname.setText(b);
                String c = rs1.getString("Totalpayble");
                ttl.setText(c);
                String d = rs1.getString("Totalpaid");
                paid.setText(d);
                String e = rs1.getString("Totatdue");
                due.setText(e);
            }
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = Integer.parseInt(paid.getText());
        int b = Integer.parseInt(due.getText());
        int c = Integer.parseInt(pay.getText());
        
        int sum = a+c;
        int sub = b-c;
        
        String d = String.valueOf(sum);
        String e = String.valueOf(sub);
        
        paid.setText(d);
        due.setText(e);
        pay.setText("");
        
        String in = "update payment set Totalpaid='"+paid.getText()+"',Totatdue='"+due.getText()+"' where ID='"+stid.getText()+"' ";
        try {
          PreparedStatement pst12 = conn.prepareStatement(in);
          pst12.executeUpdate();
        } catch (SQLException h) {
            System.err.println(h);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label5;
    private javax.swing.JPanel live;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField pay;
    private javax.swing.JLabel sid;
    private javax.swing.JLabel sname;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}

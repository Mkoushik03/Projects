package Main.Student;

import Main.Connect;
import Main.StResult;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class stprofile extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst, pst2 = null;
    String gend;

    public stprofile() {
        initComponents();
        menu2.setVisible(false);
        conn = Connect.Studentdb();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        dash = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pro = new javax.swing.JButton();
        editpro = new javax.swing.JButton();
        chngpass = new javax.swing.JButton();
        smrt = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        drp = new javax.swing.JButton();
        lvrlt = new javax.swing.JButton();
        rslt = new javax.swing.JButton();
        lgout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        dashb = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jLabel14 = new javax.swing.JLabel();
        bg4 = new javax.swing.JLabel();
        jpanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        more = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        bldd = new javax.swing.JLabel();
        fname2 = new javax.swing.JLabel();
        mname2 = new javax.swing.JLabel();
        dropsem = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        payble = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        due = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        paid = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        us = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        edt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        nam = new javax.swing.JLabel();
        nck = new javax.swing.JLabel();
        dobb = new javax.swing.JLabel();
        gen = new javax.swing.JLabel();
        bld = new javax.swing.JLabel();
        mar = new javax.swing.JLabel();
        national = new javax.swing.JLabel();
        nid = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        fb = new javax.swing.JLabel();
        phn = new javax.swing.JLabel();
        eml = new javax.swing.JLabel();
        alem = new javax.swing.JLabel();
        gur = new javax.swing.JButton();
        add = new javax.swing.JButton();
        loc = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        rlgn = new javax.swing.JLabel();
        editprofile = new javax.swing.JPanel();
        editp = new javax.swing.JPanel();
        personal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        upper = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jPanel7 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        edtnat = new javax.swing.JTextField();
        etdrlg = new javax.swing.JComboBox<>();
        etdnid = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        etdbldg = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        etdname = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        etdnick = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        etddob = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        etdgenm = new javax.swing.JRadioButton();
        etdgenf = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        etdsnid = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        etdphn = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        etdemail = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        etdmari = new javax.swing.JComboBox<>();
        Gurdian = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        upgur = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jPanel10 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        mnam = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        mcont = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel86 = new javax.swing.JLabel();
        moccup = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        madeg = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        mainc = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        father = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        fnam = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        fcont = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        foccup = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        fadeg = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        fain = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        adress = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        upadd = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        peadd = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        pepo = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        pepost = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        pedis = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        pedi = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        pecon = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        pradd = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        prpo = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        prpost = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        prdis = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel103 = new javax.swing.JLabel();
        prdi = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel104 = new javax.swing.JLabel();
        prco = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        label14 = new java.awt.Label();
        localg = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        uplocg = new javax.swing.JButton();
        label6 = new java.awt.Label();
        jPanel11 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        locname = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        loccon = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        locadd = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        locrl = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        perr = new javax.swing.JToggleButton();
        gurd = new javax.swing.JToggleButton();
        loca = new javax.swing.JToggleButton();
        addr = new javax.swing.JToggleButton();
        jLabel63 = new javax.swing.JLabel();
        chngp = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label7 = new java.awt.Label();
        jPanel14 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        cp = new javax.swing.JPasswordField();
        jSeparator43 = new javax.swing.JSeparator();
        np = new javax.swing.JPasswordField();
        jSeparator44 = new javax.swing.JSeparator();
        cnp = new javax.swing.JPasswordField();
        jSeparator45 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        uppass = new javax.swing.JButton();
        smart = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        sts = new javax.swing.JLabel();
        blance = new javax.swing.JLabel();
        dec = new javax.swing.JLabel();
        dea = new javax.swing.JButton();
        act = new javax.swing.JLabel();
        act1 = new javax.swing.JButton();
        label8 = new java.awt.Label();
        drop = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        sel1 = new javax.swing.JComboBox<>();
        sel2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        wr = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        label10 = new java.awt.Label();
        regg = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        semist = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        regtb = new javax.swing.JTable();
        jLabel117 = new javax.swing.JLabel();
        label9 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();
        tech = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        semi = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        liv = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        q21 = new javax.swing.JLabel();
        q31 = new javax.swing.JLabel();
        qavg1 = new javax.swing.JLabel();
        mid1 = new javax.swing.JLabel();
        midim = new javax.swing.JLabel();
        label11 = new java.awt.Label();
        jButton6 = new javax.swing.JButton();
        result = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        semisr = new javax.swing.JComboBox<>();
        jSeparator46 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gpa = new javax.swing.JTable();
        label13 = new java.awt.Label();
        jButton7 = new javax.swing.JButton();
        id5 = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        usern = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px_1.png"))); // NOI18N
        jButton4.setToolTipText("Close");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menu2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 30, 30));

        dash.setBackground(new java.awt.Color(78, 102, 102));
        dash.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        dash.setForeground(new java.awt.Color(51, 204, 255));
        dash.setText("Dashboard");
        dash.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        dash.setBorderPainted(false);
        dash.setContentAreaFilled(false);
        dash.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dash.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashMouseExited(evt);
            }
        });
        dash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashActionPerformed(evt);
            }
        });
        menu2.add(dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Options");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        menu2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        pro.setBackground(new java.awt.Color(78, 102, 102));
        pro.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        pro.setForeground(new java.awt.Color(240, 240, 240));
        pro.setText("Profile");
        pro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        pro.setBorderPainted(false);
        pro.setContentAreaFilled(false);
        pro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proMouseExited(evt);
            }
        });
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });
        menu2.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 40));

        editpro.setBackground(new java.awt.Color(78, 102, 102));
        editpro.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        editpro.setForeground(new java.awt.Color(240, 240, 240));
        editpro.setText("Edit Profile");
        editpro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        editpro.setBorderPainted(false);
        editpro.setContentAreaFilled(false);
        editpro.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        editpro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        editpro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editproMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editproMouseExited(evt);
            }
        });
        editpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editproActionPerformed(evt);
            }
        });
        menu2.add(editpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 40));

        chngpass.setBackground(new java.awt.Color(78, 102, 102));
        chngpass.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        chngpass.setForeground(new java.awt.Color(240, 240, 240));
        chngpass.setText("Change Password");
        chngpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        chngpass.setBorderPainted(false);
        chngpass.setContentAreaFilled(false);
        chngpass.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        chngpass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        chngpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chngpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chngpassMouseExited(evt);
            }
        });
        chngpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chngpassActionPerformed(evt);
            }
        });
        menu2.add(chngpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, 40));

        smrt.setBackground(new java.awt.Color(78, 102, 102));
        smrt.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        smrt.setForeground(new java.awt.Color(240, 240, 240));
        smrt.setText("Smart Card");
        smrt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        smrt.setBorderPainted(false);
        smrt.setContentAreaFilled(false);
        smrt.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        smrt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        smrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                smrtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                smrtMouseExited(evt);
            }
        });
        smrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smrtActionPerformed(evt);
            }
        });
        menu2.add(smrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

        reg.setBackground(new java.awt.Color(78, 102, 102));
        reg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        reg.setForeground(new java.awt.Color(240, 240, 240));
        reg.setText("Registered Courses");
        reg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        reg.setBorderPainted(false);
        reg.setContentAreaFilled(false);
        reg.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        reg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regMouseExited(evt);
            }
        });
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        menu2.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 40));

        drp.setBackground(new java.awt.Color(78, 102, 102));
        drp.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        drp.setForeground(new java.awt.Color(240, 240, 240));
        drp.setText("Drop Semister");
        drp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        drp.setBorderPainted(false);
        drp.setContentAreaFilled(false);
        drp.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        drp.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        drp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drpMouseExited(evt);
            }
        });
        drp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpActionPerformed(evt);
            }
        });
        menu2.add(drp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, 40));

        lvrlt.setBackground(new java.awt.Color(78, 102, 102));
        lvrlt.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        lvrlt.setForeground(new java.awt.Color(240, 240, 240));
        lvrlt.setText("Live Result");
        lvrlt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        lvrlt.setBorderPainted(false);
        lvrlt.setContentAreaFilled(false);
        lvrlt.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        lvrlt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lvrlt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvrltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvrltMouseExited(evt);
            }
        });
        lvrlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvrltActionPerformed(evt);
            }
        });
        menu2.add(lvrlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, 40));

        rslt.setBackground(new java.awt.Color(78, 102, 102));
        rslt.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        rslt.setForeground(new java.awt.Color(240, 240, 240));
        rslt.setText("Result");
        rslt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
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
        menu2.add(rslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 250, 40));

        lgout.setBackground(new java.awt.Color(78, 102, 102));
        lgout.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        lgout.setForeground(new java.awt.Color(240, 240, 240));
        lgout.setText("Logout");
        lgout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        lgout.setBorderPainted(false);
        lgout.setContentAreaFilled(false);
        lgout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        lgout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgoutMouseExited(evt);
            }
        });
        lgout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgoutActionPerformed(evt);
            }
        });
        menu2.add(lgout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG2.png"))); // NOI18N
        menu2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 715));

        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 715));

        parent.setLayout(new java.awt.CardLayout());

        dashb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashbMouseClicked(evt);
            }
        });
        dashb.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(0, 0, 0));
        label2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label2MouseClicked(evt);
            }
        });
        dashb.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Student Dashboard");
        dashb.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 200, 30));

        bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        bg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bg4MouseClicked(evt);
            }
        });
        dashb.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jpanel.setBackground(new java.awt.Color(204, 204, 204));
        jpanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpanelMouseClicked(evt);
            }
        });
        jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 5));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Student Basic Info");
        jpanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Name");
        jpanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 22));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Birth Date");
        jpanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 22));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Phone");
        jpanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 22));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Blood Group");
        jpanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 22));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Father's Name");
        jpanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 22));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Mother's Name");
        jpanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 22));

        more.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        more.setText("More Details");
        more.setBorder(null);
        more.setBorderPainted(false);
        more.setContentAreaFilled(false);
        more.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreActionPerformed(evt);
            }
        });
        jpanel.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 153, 153));
        name.setText("jlabel24");
        jpanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 22));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dob.setForeground(new java.awt.Color(0, 153, 153));
        dob.setText("jLabel23");
        jpanel.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 22));

        mob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mob.setForeground(new java.awt.Color(0, 153, 153));
        mob.setText("jLabel25");
        jpanel.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 22));

        bldd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bldd.setForeground(new java.awt.Color(0, 153, 153));
        bldd.setText("jLabel26");
        jpanel.add(bldd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 22));

        fname2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fname2.setForeground(new java.awt.Color(0, 153, 153));
        fname2.setText("jLabel27");
        jpanel.add(fname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, 22));

        mname2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mname2.setForeground(new java.awt.Color(0, 153, 153));
        mname2.setText("jLabel28");
        jpanel.add(mname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 22));

        dashb.add(jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 400, 320));

        dropsem.setBackground(new java.awt.Color(204, 204, 204));
        dropsem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        dropsem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropsemMouseClicked(evt);
            }
        });
        dropsem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        dropsem.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 5));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setText("Dropped Semister list");
        dropsem.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));
        dropsem.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 10));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setText("Semister");
        dropsem.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 22));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Cause");
        dropsem.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 60, 22));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setText("Date");
        dropsem.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 70, 22));

        dashb.add(dropsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 255, 400, 320));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        dashb.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 255, 380, 320));

        jPanel2.setBackground(new java.awt.Color(66, 165, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payble.setFont(new java.awt.Font("Sitka Subheading", 1, 30)); // NOI18N
        payble.setForeground(new java.awt.Color(255, 255, 255));
        payble.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(payble, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 110, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\Dollar-icon (2).png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 65, 100, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\coin-us-dollar-icon.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Total Payable");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 90, 20));

        dashb.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 310, 130));

        jPanel3.setBackground(new java.awt.Color(126, 87, 194));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        due.setFont(new java.awt.Font("Sitka Subheading", 1, 30)); // NOI18N
        jPanel3.add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 110, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\coin-us-dollar-icon.png")); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\Dollar-icon (2).png")); // NOI18N
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 65, 100, 60));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 204, 255));
        jLabel26.setText("Total Due");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 90, 20));

        dashb.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 310, 130));

        jPanel9.setBackground(new java.awt.Color(239, 83, 80));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paid.setFont(new java.awt.Font("Sitka Subheading", 1, 30)); // NOI18N
        jPanel9.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 110, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\coin-us-dollar-icon.png")); // NOI18N
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dark\\Desktop\\Dollar-icon (2).png")); // NOI18N
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 65, 100, 60));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 255, 204));
        jLabel27.setText("Total Paid");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 90, 20));

        dashb.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 310, 130));

        parent.add(dashb, "card11");

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 102));
        jLabel33.setText("Profile of ");
        profile.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        us.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        us.setForeground(new java.awt.Color(0, 102, 102));
        profile.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 10, 220, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel10.setText("profile");
        profile.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

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
        profile.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        edt.setBackground(new java.awt.Color(102, 102, 0));
        edt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        edt.setText("Edit Profile");
        edt.setBorder(null);
        edt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtActionPerformed(evt);
            }
        });
        profile.add(edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 150, 40));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, 5));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 204, 255));
        jLabel34.setText("Personal Info");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 8, -1, 40));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setText("Name");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Nickname");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Date of Birth");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setText("Gender");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("Blood Group");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setText("Marital Status");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("National ID");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setText("Nationality");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        nam.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nam.setForeground(new java.awt.Color(102, 0, 102));
        nam.setText("jlabel43");
        jPanel5.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 230, 22));

        nck.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nck.setForeground(new java.awt.Color(102, 0, 102));
        nck.setText("jLabel44");
        jPanel5.add(nck, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 230, 22));

        dobb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        dobb.setForeground(new java.awt.Color(102, 0, 102));
        dobb.setText("jLabel45");
        jPanel5.add(dobb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 230, 22));

        gen.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        gen.setForeground(new java.awt.Color(102, 0, 102));
        gen.setText("jLabel46");
        jPanel5.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, 22));

        bld.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bld.setForeground(new java.awt.Color(102, 0, 102));
        bld.setText("jLabel47");
        jPanel5.add(bld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 230, 22));

        mar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        mar.setForeground(new java.awt.Color(102, 0, 102));
        mar.setText("jLabel48");
        jPanel5.add(mar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 230, 22));

        national.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        national.setForeground(new java.awt.Color(102, 0, 102));
        national.setText("jLabel49");
        jPanel5.add(national, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 230, 22));

        nid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        nid.setForeground(new java.awt.Color(102, 0, 102));
        nid.setText("jLabel50");
        jPanel5.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 230, 22));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setText("Social Network ID");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel53.setText("Mobile");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel54.setText("Email");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel55.setText("Alternative Email");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        fb.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fb.setForeground(new java.awt.Color(102, 0, 102));
        fb.setText("jLabel57");
        jPanel5.add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 250, 22));

        phn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        phn.setForeground(new java.awt.Color(102, 0, 102));
        phn.setText("jLabel58");
        jPanel5.add(phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 230, 22));

        eml.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        eml.setForeground(new java.awt.Color(102, 0, 102));
        eml.setText("jLabel59");
        jPanel5.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 230, 22));

        alem.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        alem.setForeground(new java.awt.Color(102, 0, 102));
        alem.setText("jLabel60");
        jPanel5.add(alem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 230, 22));

        gur.setBackground(new java.awt.Color(0, 153, 153));
        gur.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gur.setText("Gurdian Info");
        gur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gurMouseClicked(evt);
            }
        });
        gur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gurActionPerformed(evt);
            }
        });
        jPanel5.add(gur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 40));

        add.setBackground(new java.awt.Color(0, 153, 204));
        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("Address");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 190, 40));

        loc.setBackground(new java.awt.Color(0, 153, 102));
        loc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loc.setText("Local Gurdian Info");
        loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locMouseClicked(evt);
            }
        });
        jPanel5.add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 190, 40));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel71.setText("Religion");
        jPanel5.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        rlgn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rlgn.setForeground(new java.awt.Color(102, 0, 102));
        rlgn.setText("jLabel72");
        jPanel5.add(rlgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 230, 22));

        profile.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 940, 430));

        parent.add(profile, "card8");

        editprofile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editp.setLayout(new java.awt.CardLayout());

        personal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Personal Inormation");
        personal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 40));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setPreferredSize(new java.awt.Dimension(0, 10));
        personal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1246, 10));

        upper.setBackground(new java.awt.Color(0, 153, 153));
        upper.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        upper.setText("Update Personal Info");
        upper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperActionPerformed(evt);
            }
        });
        personal.add(upper, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 310, 40));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label3MouseClicked(evt);
            }
        });
        personal.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setText("Religion");
        jPanel7.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel74.setText("Nationality");
        jPanel7.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel75.setText("National ID");
        jPanel7.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 250, 5));

        edtnat.setBackground(new java.awt.Color(204, 204, 204));
        edtnat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edtnat.setForeground(new java.awt.Color(0, 153, 153));
        edtnat.setText("kjkhjkhjk");
        edtnat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel7.add(edtnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 250, 30));

        etdrlg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select----", "Hindu", "Muslim", "Buddha", "Christian" }));
        jPanel7.add(etdrlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 30));

        etdnid.setBackground(new java.awt.Color(204, 204, 204));
        etdnid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdnid.setForeground(new java.awt.Color(0, 153, 153));
        etdnid.setText("kjkhjkhjk");
        etdnid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel7.add(etdnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 250, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 250, 5));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel70.setText("Blood Group");
        jPanel7.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        etdbldg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select----", "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));
        jPanel7.add(etdbldg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, 210, 30));

        personal.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 60, 290, 290));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel65.setText("Name");
        jPanel6.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, 20));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel66.setText("Nickname");
        jPanel6.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, -1, 20));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel67.setText("Date Of Birth");
        jPanel6.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, -1, 20));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel68.setText("Gender");
        jPanel6.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        etdname.setEditable(false);
        etdname.setBackground(new java.awt.Color(204, 204, 204));
        etdname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdname.setForeground(new java.awt.Color(0, 153, 153));
        etdname.setText("kjkhjkhjk");
        etdname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        etdname.setEnabled(false);
        jPanel6.add(etdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 30));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 5));

        etdnick.setBackground(new java.awt.Color(204, 204, 204));
        etdnick.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdnick.setForeground(new java.awt.Color(0, 153, 153));
        etdnick.setText("jTextField2");
        etdnick.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel6.add(etdnick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 250, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 5));

        etddob.setEditable(false);
        etddob.setBackground(new java.awt.Color(204, 204, 204));
        etddob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etddob.setForeground(new java.awt.Color(0, 153, 153));
        etddob.setText("jTextField3");
        etddob.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        etddob.setEnabled(false);
        jPanel6.add(etddob, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, 5));

        etdgenm.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup3.add(etdgenm);
        etdgenm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdgenm.setForeground(new java.awt.Color(0, 153, 153));
        etdgenm.setText("Male");
        etdgenm.setEnabled(false);
        etdgenm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etdgenmActionPerformed(evt);
            }
        });
        jPanel6.add(etdgenm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, -1, -1));

        etdgenf.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup3.add(etdgenf);
        etdgenf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdgenf.setForeground(new java.awt.Color(0, 153, 153));
        etdgenf.setText("Female");
        etdgenf.setEnabled(false);
        etdgenf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etdgenfActionPerformed(evt);
            }
        });
        jPanel6.add(etdgenf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 235, -1, -1));

        personal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 60, 290, 290));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel76.setText("Social Network ID");
        jPanel8.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 5));

        etdsnid.setBackground(new java.awt.Color(204, 204, 204));
        etdsnid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdsnid.setForeground(new java.awt.Color(0, 153, 153));
        etdsnid.setText("kjkhjkhjk");
        etdsnid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        etdsnid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etdsnidActionPerformed(evt);
            }
        });
        jPanel8.add(etdsnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 30));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel77.setText("Mobile");
        jPanel8.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, 20));

        etdphn.setBackground(new java.awt.Color(204, 204, 204));
        etdphn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdphn.setForeground(new java.awt.Color(0, 153, 153));
        etdphn.setText("kjkhjkhjk");
        etdphn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel8.add(etdphn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, 30));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 5));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel78.setText("Email");
        jPanel8.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, -1, -1));

        etdemail.setBackground(new java.awt.Color(204, 204, 204));
        etdemail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdemail.setForeground(new java.awt.Color(0, 153, 153));
        etdemail.setText("kjkhjkhjk");
        etdemail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel8.add(etdemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 250, 30));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 250, 5));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel69.setText("Marital Status");
        jPanel8.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, 20));

        etdmari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select----", "Married", "Divorced", "Single", "Widow", "Widower" }));
        etdmari.setBorder(null);
        etdmari.setEditor(null);
        jPanel8.add(etdmari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 30));

        personal.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 60, 290, 290));

        editp.add(personal, "card2");

        Gurdian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Gurdian Information");
        Gurdian.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 40));

        jSeparator6.setBackground(new java.awt.Color(0, 204, 51));
        jSeparator6.setForeground(new java.awt.Color(0, 204, 51));
        Gurdian.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1246, 10));

        upgur.setBackground(new java.awt.Color(102, 102, 255));
        upgur.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        upgur.setText("Update Gurdian Info");
        upgur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgurActionPerformed(evt);
            }
        });
        Gurdian.add(upgur, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 220, 40));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 0, 0));
        label4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label4MouseClicked(evt);
            }
        });
        Gurdian.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel84.setText("Mother's Name");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 5));

        mnam.setEditable(false);
        mnam.setBackground(new java.awt.Color(204, 204, 204));
        mnam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mnam.setForeground(new java.awt.Color(0, 153, 153));
        mnam.setText("fdsfdsf");
        mnam.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        mnam.setEnabled(false);
        jPanel10.add(mnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel85.setText("Mother Contact No:");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        mcont.setEditable(false);
        mcont.setBackground(new java.awt.Color(204, 204, 204));
        mcont.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mcont.setForeground(new java.awt.Color(0, 153, 153));
        mcont.setText("jTextField10");
        mcont.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        mcont.setEnabled(false);
        jPanel10.add(mcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 240, 30));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 240, 5));

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel86.setText("Mother's Occupation");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, 20));

        moccup.setBackground(new java.awt.Color(204, 204, 204));
        moccup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        moccup.setForeground(new java.awt.Color(0, 153, 153));
        moccup.setText("jTextField10");
        moccup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel10.add(moccup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 30));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 5));

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel87.setText("Mother's Designation");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 240, 5));

        madeg.setBackground(new java.awt.Color(204, 204, 204));
        madeg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        madeg.setForeground(new java.awt.Color(0, 153, 153));
        madeg.setText("jTextField10");
        madeg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel10.add(madeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 240, 30));

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel88.setText("Mother's Annual Income");
        jPanel10.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        mainc.setBackground(new java.awt.Color(204, 204, 204));
        mainc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mainc.setForeground(new java.awt.Color(0, 153, 153));
        mainc.setText("jTextField10");
        mainc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel10.add(mainc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 30));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, 5));

        Gurdian.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 270, 340));

        father.setBackground(new java.awt.Color(204, 204, 204));
        father.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel79.setText("Father's Name");
        father.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel80.setText("Father Contact No:");
        father.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel81.setText("Father's Occupation");
        father.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, 20));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel82.setText("Father's Designation");
        father.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel83.setText("Father's Annual Income");
        father.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        fnam.setEditable(false);
        fnam.setBackground(new java.awt.Color(204, 204, 204));
        fnam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fnam.setForeground(new java.awt.Color(0, 153, 153));
        fnam.setText("fdsfdsf");
        fnam.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        fnam.setEnabled(false);
        father.add(fnam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        father.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 5));

        fcont.setEditable(false);
        fcont.setBackground(new java.awt.Color(204, 204, 204));
        fcont.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fcont.setForeground(new java.awt.Color(0, 153, 153));
        fcont.setText("jTextField10");
        fcont.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        fcont.setEnabled(false);
        father.add(fcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 240, 30));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        father.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 240, 5));

        foccup.setBackground(new java.awt.Color(204, 204, 204));
        foccup.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        foccup.setForeground(new java.awt.Color(0, 153, 153));
        foccup.setText("jTextField10");
        foccup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        father.add(foccup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 30));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        father.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 5));

        fadeg.setBackground(new java.awt.Color(204, 204, 204));
        fadeg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fadeg.setForeground(new java.awt.Color(0, 153, 153));
        fadeg.setText("jTextField10");
        fadeg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        father.add(fadeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 240, 30));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        father.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 240, 5));

        fain.setBackground(new java.awt.Color(204, 204, 204));
        fain.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fain.setForeground(new java.awt.Color(0, 153, 153));
        fain.setText("jTextField10");
        fain.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        father.add(fain, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 30));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        father.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, 5));

        Gurdian.add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 260, 340));

        editp.add(Gurdian, "card3");

        adress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Address Information");
        adress.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 40));

        jSeparator8.setBackground(new java.awt.Color(0, 204, 51));
        jSeparator8.setForeground(new java.awt.Color(0, 204, 51));
        adress.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1246, 10));

        upadd.setBackground(new java.awt.Color(0, 153, 204));
        upadd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        upadd.setText("Update address Info");
        upadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upaddActionPerformed(evt);
            }
        });
        adress.add(upadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 230, 40));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel93.setText("Permanent Address");
        jPanel12.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel94.setText("Police Station");
        jPanel12.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel95.setText("Post Office");
        jPanel12.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel96.setText("District/City");
        jPanel12.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel97.setText("Division/State");
        jPanel12.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel98.setText("Country");
        jPanel12.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        peadd.setBackground(new java.awt.Color(204, 204, 204));
        peadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        peadd.setForeground(new java.awt.Color(0, 153, 153));
        peadd.setText("jTextField23");
        peadd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(peadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 30));
        jPanel12.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 5));

        pepo.setBackground(new java.awt.Color(204, 204, 204));
        pepo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pepo.setForeground(new java.awt.Color(0, 153, 153));
        pepo.setText("jTextField23");
        pepo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(pepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 220, 30));
        jPanel12.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 220, 5));

        pepost.setBackground(new java.awt.Color(204, 204, 204));
        pepost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pepost.setForeground(new java.awt.Color(0, 153, 153));
        pepost.setText("jTextField23");
        pepost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(pepost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 30));
        jPanel12.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 5));

        pedis.setBackground(new java.awt.Color(204, 204, 204));
        pedis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pedis.setForeground(new java.awt.Color(0, 153, 153));
        pedis.setText("jTextField23");
        pedis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(pedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 220, 30));
        jPanel12.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 220, 5));

        pedi.setBackground(new java.awt.Color(204, 204, 204));
        pedi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pedi.setForeground(new java.awt.Color(0, 153, 153));
        pedi.setText("jTextField23");
        pedi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(pedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 30));
        jPanel12.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 5));

        pecon.setBackground(new java.awt.Color(204, 204, 204));
        pecon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pecon.setForeground(new java.awt.Color(0, 153, 153));
        pecon.setText("jTextField23");
        pecon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel12.add(pecon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 220, 30));
        jPanel12.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 220, 5));

        adress.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 240, 400));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel99.setText("Present Address");
        jPanel13.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        pradd.setBackground(new java.awt.Color(204, 204, 204));
        pradd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pradd.setForeground(new java.awt.Color(0, 153, 153));
        pradd.setText("jTextField23");
        pradd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(pradd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 30));

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel100.setText("Police Station");
        jPanel13.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        prpo.setBackground(new java.awt.Color(204, 204, 204));
        prpo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prpo.setForeground(new java.awt.Color(0, 153, 153));
        prpo.setText("jTextField23");
        prpo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(prpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 220, 30));
        jPanel13.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 220, 5));
        jPanel13.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 5));

        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel101.setText("Post Office");
        jPanel13.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        prpost.setBackground(new java.awt.Color(204, 204, 204));
        prpost.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prpost.setForeground(new java.awt.Color(0, 153, 153));
        prpost.setText("jTextField23");
        prpost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(prpost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 220, 30));
        jPanel13.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 5));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel102.setText("District/City");
        jPanel13.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        prdis.setBackground(new java.awt.Color(204, 204, 204));
        prdis.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prdis.setForeground(new java.awt.Color(0, 153, 153));
        prdis.setText("jTextField23");
        prdis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(prdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 220, 30));
        jPanel13.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 220, 5));

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel103.setText("Division/State");
        jPanel13.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        prdi.setBackground(new java.awt.Color(204, 204, 204));
        prdi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prdi.setForeground(new java.awt.Color(0, 153, 153));
        prdi.setText("jTextField23");
        prdi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(prdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 30));
        jPanel13.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, 5));

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel104.setText("Country");
        jPanel13.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        prco.setBackground(new java.awt.Color(204, 204, 204));
        prco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prco.setForeground(new java.awt.Color(0, 153, 153));
        prco.setText("jTextField23");
        prco.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel13.add(prco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 220, 30));
        jPanel13.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 220, 5));

        adress.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 250, 400));

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(new java.awt.Color(0, 0, 0));
        label14.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label14MouseClicked(evt);
            }
        });
        adress.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1246, 20));

        editp.add(adress, "card4");

        localg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator7.setBackground(new java.awt.Color(0, 204, 51));
        jSeparator7.setForeground(new java.awt.Color(0, 204, 51));
        localg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1246, 10));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 102, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Local Gurdian Information");
        localg.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 40));

        uplocg.setBackground(new java.awt.Color(0, 153, 153));
        uplocg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uplocg.setText("Update Local Gurdian Info");
        uplocg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uplocgActionPerformed(evt);
            }
        });
        localg.add(uplocg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 200, 40));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(0, 0, 0));
        label6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label6MouseClicked(evt);
            }
        });
        localg.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel89.setText("Name");
        jPanel11.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel90.setText("Contact No");
        jPanel11.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel91.setText("Relationship");
        jPanel11.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, 20));

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel92.setText("Address");
        jPanel11.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        locname.setBackground(new java.awt.Color(204, 204, 204));
        locname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locname.setForeground(new java.awt.Color(0, 153, 153));
        locname.setText("jTextField19");
        locname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel11.add(locname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 30));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 5));

        loccon.setBackground(new java.awt.Color(204, 204, 204));
        loccon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loccon.setForeground(new java.awt.Color(0, 153, 153));
        loccon.setText("jTextField19");
        loccon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel11.add(loccon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 230, 30));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 230, 5));

        locadd.setBackground(new java.awt.Color(204, 204, 204));
        locadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locadd.setForeground(new java.awt.Color(0, 153, 153));
        locadd.setText("jTextField19");
        locadd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel11.add(locadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 230, 30));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 230, 5));

        locrl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locrl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select----", "Aunty", "Mother", "Sister", "Brother", "Uncle", "Father" }));
        jPanel11.add(locrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 230, 30));

        localg.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 260, 280));

        editp.add(localg, "card5");

        editprofile.add(editp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 102, 102));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Profile Information");
        editprofile.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel61.setText("jLabel61");
        editprofile.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        perr.setBackground(new java.awt.Color(31, 125, 152));
        buttonGroup1.add(perr);
        perr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        perr.setForeground(new java.awt.Color(0, 204, 255));
        perr.setText("Personal");
        perr.setBorder(null);
        perr.setBorderPainted(false);
        perr.setFocusable(false);
        perr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perrActionPerformed(evt);
            }
        });
        editprofile.add(perr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 110, 50));

        gurd.setBackground(new java.awt.Color(31, 125, 152));
        buttonGroup1.add(gurd);
        gurd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gurd.setText("Gurdian");
        gurd.setBorder(null);
        gurd.setBorderPainted(false);
        gurd.setFocusable(false);
        gurd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gurdActionPerformed(evt);
            }
        });
        editprofile.add(gurd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 100, 50));

        loca.setBackground(new java.awt.Color(31, 125, 152));
        buttonGroup1.add(loca);
        loca.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loca.setText("Local Gurdian");
        loca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaActionPerformed(evt);
            }
        });
        editprofile.add(loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, 50));

        addr.setBackground(new java.awt.Color(31, 125, 152));
        buttonGroup1.add(addr);
        addr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addr.setText("Address");
        addr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrActionPerformed(evt);
            }
        });
        editprofile.add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 110, 50));

        jLabel63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        editprofile.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 470, 50));

        parent.add(editprofile, "card2");

        chngp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 102, 102));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("Change Password");
        chngp.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        chngp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(0, 0, 0));
        label7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label7MouseClicked(evt);
            }
        });
        chngp.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel106.setText("Current Password");
        jPanel14.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel107.setText("New Password");
        jPanel14.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel108.setText("Confirm Password");
        jPanel14.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cp.setBackground(new java.awt.Color(102, 102, 102));
        cp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cp.setForeground(new java.awt.Color(0, 204, 204));
        cp.setText("jPasswordField1");
        cp.setBorder(null);
        cp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpMouseClicked(evt);
            }
        });
        jPanel14.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 30));
        jPanel14.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 10));

        np.setBackground(new java.awt.Color(102, 102, 102));
        np.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        np.setForeground(new java.awt.Color(0, 204, 204));
        np.setText("jPasswordField2");
        np.setBorder(null);
        np.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                npMouseClicked(evt);
            }
        });
        jPanel14.add(np, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 30));
        jPanel14.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 5));

        cnp.setBackground(new java.awt.Color(102, 102, 102));
        cnp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cnp.setForeground(new java.awt.Color(0, 204, 204));
        cnp.setText("jPasswordField3");
        cnp.setBorder(null);
        cnp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnpMouseClicked(evt);
            }
        });
        jPanel14.add(cnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 30));
        jPanel14.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 5));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Eye_22px.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Eye_22px.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 40, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Eye_22px.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel14.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 40, 30));

        chngp.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 380, 230));

        uppass.setBackground(new java.awt.Color(0, 153, 153));
        uppass.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        uppass.setForeground(new java.awt.Color(255, 255, 255));
        uppass.setText("Update Password");
        uppass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uppassMouseClicked(evt);
            }
        });
        uppass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppassActionPerformed(evt);
            }
        });
        chngp.add(uppass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 150, 40));

        parent.add(chngp, "card9");

        smart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 102, 102));
        jLabel110.setText("Smart Card");
        smart.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 13, -1, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        smart.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel111.setText("Your Smart Card is now:");
        jPanel15.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel112.setText("You Smart Card balance is:");
        jPanel15.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        sts.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        sts.setForeground(new java.awt.Color(0, 153, 153));
        sts.setText("jLabel113");
        jPanel15.add(sts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 26, -1, -1));

        blance.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        blance.setForeground(new java.awt.Color(0, 153, 153));
        jPanel15.add(blance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 66, 90, 30));

        dec.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dec.setText("Deactivate your Card");
        jPanel15.add(dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 190, 22));

        dea.setBackground(new java.awt.Color(0, 153, 153));
        dea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dea.setText("Deactivate");
        dea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deaActionPerformed(evt);
            }
        });
        jPanel15.add(dea, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 40));

        act.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        act.setText("Activate your Card");
        jPanel15.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 190, 22));

        act1.setBackground(new java.awt.Color(0, 153, 153));
        act1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        act1.setText("Activate");
        act1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                act1ActionPerformed(evt);
            }
        });
        jPanel15.add(act1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, 40));

        smart.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 80, 930, 130));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(0, 0, 0));
        label8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label8MouseClicked(evt);
            }
        });
        smart.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        parent.add(smart, "card7");

        drop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 102, 102));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Drop Semister");
        drop.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel8.setText("drop");
        drop.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel119.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel119.setText("Select Semister");
        jPanel16.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel120.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel120.setText("Select Cause of Semester drop ");
        jPanel16.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 20));

        jLabel121.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel121.setText("Why you want to drop this semister? Write your cause");
        jPanel16.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 370, -1));

        sel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 40));

        sel2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel16.add(sel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 40));

        wr.setColumns(20);
        wr.setRows(5);
        jScrollPane3.setViewportView(wr);

        jPanel16.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 365, -1));

        jButton9.setText("Submit");
        jPanel16.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, 30));

        drop.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 380, 410));

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel124.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("Dropped Semester List");
        jPanel18.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/bg3.jpg"))); // NOI18N
        jLabel122.setText("jLabel122");
        jPanel18.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Semister ", "Cause"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel18.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 440, 320));

        drop.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 450, 370));

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(0, 0, 0));
        label10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label10MouseClicked(evt);
            }
        });
        drop.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        parent.add(drop, "card5");

        regg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 102, 102));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Registerd Courses");
        regg.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        regg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        semist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        semist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        semist.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        regg.add(semist, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 360, 40));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel125.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Registered Course List");
        jPanel17.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/bg2.jpg"))); // NOI18N
        jPanel17.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        regtb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        regtb.setRowHeight(35);
        jScrollPane6.setViewportView(regtb);

        jPanel17.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1050, 310));

        regg.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 1050, 350));

        jLabel117.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel117.setText("Select Semister");
        regg.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(0, 0, 0));
        label9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label9MouseClicked(evt);
            }
        });
        regg.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Show");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        regg.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 80, 40));

        parent.add(regg, "card6");

        tech.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 102, 102));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Live Result");
        tech.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel12.setText("Tech");
        tech.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel127.setText("Select Semister");
        tech.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        semi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        tech.add(semi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 300, 40));

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        liv.setModel(new javax.swing.table.DefaultTableModel(
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
        liv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                livMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(liv);

        jPanel19.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 360));

        tech.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 380, 360));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel130.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel130.setText("Quiz 1");
        jPanel20.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel131.setText("Quiz 2");
        jPanel20.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel132.setText("Quiz 3");
        jPanel20.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel133.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel133.setText("Quiz Average");
        jPanel20.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel134.setText("Midterm ");
        jPanel20.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel135.setText("Midterm Improvement");
        jPanel20.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        q11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        q11.setText("jLabel136");
        jPanel20.add(q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 20));

        q21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        q21.setText("jLabel137");
        jPanel20.add(q21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 20));

        q31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        q31.setText("jLabel138");
        jPanel20.add(q31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 20));

        qavg1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qavg1.setText("jLabel139");
        jPanel20.add(qavg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 20));

        mid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mid1.setText("jLabel140");
        jPanel20.add(mid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, 20));

        midim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        midim.setText("jLabel141");
        jPanel20.add(midim, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, 20));

        tech.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 360, 360));

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(new java.awt.Color(0, 0, 0));
        label11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label11MouseClicked(evt);
            }
        });
        tech.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jButton6.setText("Load");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        tech.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        parent.add(tech, "card10");

        result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel128.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 102, 102));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Result");
        result.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel5.setText("result");
        result.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel129.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel129.setText("Student ID");
        result.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel142.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel142.setText("Select Semister");
        result.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        semisr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        result.add(semisr, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 220, 30));

        jSeparator46.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator46.setForeground(new java.awt.Color(0, 0, 0));
        result.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 220, -1));

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel144.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Name");
        jPanel21.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel145.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("ID");
        jPanel21.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        name4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name4.setText("jLabel149");
        jPanel21.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 20));

        id4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id4.setText("jLabel150");
        jPanel21.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 20));

        result.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 360, 110));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(gpa);

        jPanel22.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 270));

        result.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 780, 270));

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(new java.awt.Color(0, 0, 0));
        label13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label13MouseClicked(evt);
            }
        });
        result.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jButton7.setText("Show");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        result.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));

        id5.setText("jTextField1");
        result.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 220, 30));

        parent.add(result, "card3");

        jPanel1.add(parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, 1246, 655));

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

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, 38, 38));

        lg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lg.setText("Log Out");
        lg.setBorder(null);
        lg.setBorderPainted(false);
        lg.setContentAreaFilled(false);
        jPanel1.add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, -1, 30));

        usern.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_User_Male_30px_1.png"))); // NOI18N
        jPanel1.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 220, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Student");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 8, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_School_30px.png"))); // NOI18N
        jLabel43.setText("Student Management System-");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu.setVisible(true);
        menu2.setVisible(false);

        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        } else if (profile.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else if (editprofile.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            perr.setEnabled(true);
            gurd.setEnabled(true);
            loca.setEnabled(true);
            addr.setEnabled(true);

            etdnick.setEnabled(true);
            edtnat.setEnabled(true);
            etdrlg.setEnabled(true);
            etdnid.setEnabled(true);
            etdemail.setEnabled(true);
            etdbldg.setEnabled(true);
            etdsnid.setEnabled(true);
            etdphn.setEnabled(true);
            etdmari.setEnabled(true);
            etdgenm.setEnabled(true);
            etdgenf.setEnabled(true);
            upper.setEnabled(true);

            locname.setEnabled(true);
            loccon.setEnabled(true);
            locrl.setEnabled(true);
            locadd.setEnabled(true);
            uplocg.setEnabled(true);

            peadd.setEnabled(true);
            pradd.setEnabled(true);
            pepo.setEnabled(true);
            prpo.setEnabled(true);
            pepost.setEnabled(true);
            prpost.setEnabled(true);
            prdis.setEnabled(true);
            pedis.setEnabled(true);
            pedi.setEnabled(true);
            prdi.setEnabled(true);
            pecon.setEnabled(true);
            prco.setEnabled(true);
            upadd.setEnabled(true);

            foccup.setEnabled(true);
            moccup.setEnabled(true);
            madeg.setEnabled(true);
            fadeg.setEnabled(true);
            fain.setEnabled(true);
            mainc.setEnabled(true);
            upgur.setEnabled(true);
        } else if (chngp.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            cp.setEnabled(true);
            np.setEnabled(true);
            cnp.setEnabled(true);
            uppass.setEnabled(true);
        } else if (drop.isShowing()) {
            sel1.setEnabled(true);
            sel2.setEnabled(true);
            wr.setEnabled(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        menu2.setVisible(true);
        menu.setVisible(false);
        if (profile.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(true);
            pro.setForeground(new Color(51, 204, 255));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            edt.setEnabled(false);
            loc.setEnabled(false);
            add.setEnabled(false);
            gur.setEnabled(false);
        } else if (editprofile.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(true);
            editpro.setForeground(new Color(51, 204, 255));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
            perr.setEnabled(false);
            gurd.setEnabled(false);
            loca.setEnabled(false);
            addr.setEnabled(false);

            etdnick.setEnabled(false);
            edtnat.setEnabled(false);
            etdrlg.setEnabled(false);
            etdnid.setEnabled(false);
            etdemail.setEnabled(false);
            etdbldg.setEnabled(false);
            etdsnid.setEnabled(false);
            etdphn.setEnabled(false);
            etdmari.setEnabled(false);
            etdgenm.setEnabled(false);
            etdgenf.setEnabled(false);
            upper.setEnabled(false);

            locname.setEnabled(false);
            loccon.setEnabled(false);
            locrl.setEnabled(false);
            locadd.setEnabled(false);
            uplocg.setEnabled(false);

            peadd.setEnabled(false);
            pradd.setEnabled(false);
            pepo.setEnabled(false);
            prpo.setEnabled(false);
            pepost.setEnabled(false);
            prpost.setEnabled(false);
            prdis.setEnabled(false);
            pedis.setEnabled(false);
            pedi.setEnabled(false);
            prdi.setEnabled(false);
            pecon.setEnabled(false);
            prco.setEnabled(false);
            upadd.setEnabled(false);

            foccup.setEnabled(false);
            moccup.setEnabled(false);
            madeg.setEnabled(false);
            fadeg.setEnabled(false);
            fain.setEnabled(false);
            mainc.setEnabled(false);
            upgur.setEnabled(false);
        } else if (chngp.isShowing()) {

            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(true);
            chngpass.setForeground(new Color(51, 204, 255));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
            cp.setEnabled(false);
            np.setEnabled(false);
            cnp.setEnabled(false);
            uppass.setEnabled(false);
        } else if (smart.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(true);
            smrt.setForeground(new Color(51, 204, 255));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
        } else if (regg.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(true);
            reg.setForeground(new Color(51, 204, 255));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
        } else if (drop.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(true);
            drp.setForeground(new Color(51, 204, 255));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            sel1.setEnabled(false);
            sel2.setEnabled(false);
            wr.setEnabled(false);
        } else if (tech.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
        } else if (result.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));

        } else if (dash.isShowing()) {
            dash.setOpaque(true);
            dash.setForeground(new Color(51, 204, 255));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            more.setEnabled(false);
        }


    }//GEN-LAST:event_menuActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(stprofile.ICONIFIED);
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

    private void dashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseEntered
        if (dashb.isShowing()) {
            dash.setOpaque(true);
            dash.setForeground(new Color(51, 204, 255));
        } else {
            dash.setOpaque(true);
            dash.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_dashMouseEntered

    private void dashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseExited
        if (dashb.isShowing()) {
            dash.setOpaque(true);
            dash.setForeground(new Color(51, 204, 255));
        } else {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_dashMouseExited

    private void proMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseEntered
        if (profile.isShowing()) {
            pro.setOpaque(true);
            pro.setForeground(new Color(51, 204, 255));
        } else {
            pro.setOpaque(true);
            pro.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_proMouseEntered

    private void proMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseExited
        if (profile.isShowing()) {
            pro.setOpaque(true);
            pro.setForeground(new Color(51, 204, 255));
        } else {
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_proMouseExited

    private void editproMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editproMouseEntered
        if (editprofile.isShowing()) {
            editpro.setOpaque(true);
            editpro.setForeground(new Color(51, 204, 255));
        } else {
            editpro.setOpaque(true);
            editpro.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_editproMouseEntered

    private void editproMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editproMouseExited
        if (editprofile.isShowing()) {
            editpro.setOpaque(true);
            editpro.setForeground(new Color(51, 204, 255));
        } else {
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_editproMouseExited

    private void chngpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chngpassMouseEntered
        if (chngp.isShowing()) {
            chngpass.setOpaque(true);
            chngpass.setForeground(new Color(51, 204, 255));
        } else {
            chngpass.setOpaque(true);
            chngpass.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_chngpassMouseEntered

    private void chngpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chngpassMouseExited
        if (chngp.isShowing()) {
            chngpass.setOpaque(true);
            chngpass.setForeground(new Color(51, 204, 255));
        } else {
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_chngpassMouseExited

    private void dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        more.setEnabled(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(dashb);
        parent.repaint();
        parent.revalidate();

    }//GEN-LAST:event_dashActionPerformed

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        menu.setVisible(true);
        menu2.setVisible(false);
        edt.setEnabled(true);
        loc.setEnabled(true);
        add.setEnabled(true);
        gur.setEnabled(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(profile);
        parent.repaint();
        parent.revalidate();
        
        String sql45 = "Select * from stinfo where stinfo.ID='"+usern.getText()+"'";
        try {
            conn.close();
            conn = Connect.Studentdb();
          PreparedStatement pst45 = conn.prepareStatement(sql45);
            
          ResultSet  rs45 = pst45.executeQuery();
          if(rs45.next())
          {
              String b = rs45.getString("Name");
              nam.setText(b);
              String c = rs45.getString("Mobile");
              phn.setText(c);
              String d = rs45.getString("Nickname");
              nck.setText(d);
              String e = rs45.getString("Gender");
              gen.setText(e);
              String f = rs45.getString("Bloodgroup");
              bld.setText(f);
              String g = rs45.getString("MaritalStatus");
              mar.setText(g);
              String h = rs45.getString("Religion");
              rlgn.setText(h);
              String i = rs45.getString("Nationality");
              national.setText(i);
              String j = rs45.getString("nationalID");
              nid.setText(j);
              String k = rs45.getString("SocialnetID");
              fb.setText(k);
              String l = rs45.getString("Email");
              eml.setText(l);
              String m = rs45.getString("Alternativeemail");
              alem.setText(m);
              String n = rs45.getString("Dob");
              dobb.setText(n);
          }
        } catch (SQLException z) {
            System.out.println(z);
        }
    }//GEN-LAST:event_proActionPerformed

    private void editproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editproActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        menu.setVisible(true);
        menu2.setVisible(false);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        etdnick.setEnabled(true);
        edtnat.setEnabled(true);
        etdrlg.setEnabled(true);
        etdnid.setEnabled(true);
        etdemail.setEnabled(true);
        etdbldg.setEnabled(true);
        etdsnid.setEnabled(true);
        etdphn.setEnabled(true);
        etdmari.setEnabled(true);
        etdgenm.setEnabled(true);
        etdgenf.setEnabled(true);
        upper.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        foccup.setEnabled(true);
        moccup.setEnabled(true);
        madeg.setEnabled(true);
        fadeg.setEnabled(true);
        fain.setEnabled(true);
        mainc.setEnabled(true);
        upgur.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        locname.setEnabled(true);
        loccon.setEnabled(true);
        locrl.setEnabled(true);
        locadd.setEnabled(true);
        uplocg.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        peadd.setEnabled(true);
        pradd.setEnabled(true);
        pepo.setEnabled(true);
        prpo.setEnabled(true);
        pepost.setEnabled(true);
        prpost.setEnabled(true);
        prdis.setEnabled(true);
        pedis.setEnabled(true);
        pedi.setEnabled(true);
        prdi.setEnabled(true);
        pecon.setEnabled(true);
        prco.setEnabled(true);
        upadd.setEnabled(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(editprofile);
        parent.repaint();
        parent.revalidate();
        perr.setSelected(true);
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(personal);
        editp.repaint();
        editp.revalidate();

        String sql = "select * from stinfo,stlogin where stinfo.ID=stlogin.ID and stlogin.ID=?  ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String b = rs.getString("Name");
                etdname.setText(b);

                String d = rs.getString("Nickname");
                etdnick.setText(d);
                String n = rs.getString("Dob");
                etddob.setText(n);
                String e = rs.getString("Gender");
                if (e.equals("Male")) {
                    etdgenm.setSelected(true);
                    gend = "Male";
                } else if (e.equals("Female")) {
                    etdgenf.setSelected(true);
                    gend = "Female";
                }
                String h = rs.getString("Religion");

                if (h.equals("Hindu")) {
                    etdrlg.setSelectedIndex(1);
                } else if (h.equals("Muslim")) {
                    etdrlg.setSelectedIndex(2);
                } else if (h.equals("Buddha")) {
                    etdrlg.setSelectedIndex(3);
                } else if (h.equals("Chistian")) {
                    etdrlg.setSelectedIndex(4);
                } else if (h.equals(" ")) {
                    etdrlg.setSelectedIndex(0);
                }

                String i = rs.getString("Nationality");
                edtnat.setText(i);
                String j = rs.getString("NationalID");
                etdnid.setText(j);

                String f = rs.getString("Bloodgroup");
                switch (f) {
                    case "A+":
                        etdbldg.setSelectedIndex(1);
                        break;
                    case "A-":
                        etdbldg.setSelectedIndex(2);
                        break;
                    case "AB+":
                        etdbldg.setSelectedIndex(3);
                        break;
                    case "AB-":
                        etdbldg.setSelectedIndex(4);
                        break;
                    case "B+":
                        etdbldg.setSelectedIndex(5);
                        break;
                    case "B-":
                        etdbldg.setSelectedIndex(6);
                        break;
                    case "O+":
                        etdbldg.setSelectedIndex(7);
                        break;
                    case "O-":
                        etdbldg.setSelectedIndex(8);
                        break;
                    case "":
                        etdbldg.setSelectedIndex(0);
                        break;
                    default:
                        break;
                }
                String k = rs.getString("SocialnetID");
                etdsnid.setText(k);
                String c = rs.getString("Mobile");
                etdphn.setText(c);
                String m = rs.getString("Alternativeemail");
                etdemail.setText(m);

                String g = rs.getString("MaritalStatus");
                switch (g) {
                    case "Married":
                        etdmari.setSelectedIndex(1);
                        break;
                    case "Divorced":
                        etdmari.setSelectedIndex(2);
                        break;
                    case "Single":
                        etdmari.setSelectedIndex(3);
                        break;
                    case "Widow":
                        etdmari.setSelectedIndex(4);
                        break;
                    case "Widower":
                        etdmari.setSelectedIndex(5);
                        break;
                    case "":
                        etdmari.setSelectedIndex(0);
                        break;
                    default:
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_editproActionPerformed

    private void chngpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chngpassActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(chngp);
        parent.repaint();
        parent.revalidate();
        cp.setEnabled(true);
        np.setEnabled(true);
        cnp.setEnabled(true);
        uppass.setEnabled(true);
    }//GEN-LAST:event_chngpassActionPerformed

    private void smrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smrtActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(smart);
        parent.repaint();
        parent.revalidate();

        String smrt1 = "select * from smartcard where ID='" + usern.getText() + "'";

        try {
            PreparedStatement pst10 = conn.prepareStatement(smrt1);
            ResultSet rs10 = pst10.executeQuery();
            if (rs10.next()) {
                String a = rs10.getString("Status");
                sts.setText(a);
                String b = rs10.getString("balance");
                blance.setText(b);

                if ("Active".equals(sts.getText())) {
                    dec.setVisible(true);
                    dea.setVisible(true);
                    act.setVisible(false);
                    act1.setVisible(false);
                } else if ("Deactive".equals(sts.getText())) {
                    dec.setVisible(false);
                    dea.setVisible(false);
                    act.setVisible(true);
                    act1.setVisible(true);
                }
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_smrtActionPerformed

    private void smrtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smrtMouseEntered
        if (smart.isShowing()) {
            smrt.setOpaque(true);
            smrt.setForeground(new Color(51, 204, 255));
        } else {
            smrt.setOpaque(true);
            smrt.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_smrtMouseEntered

    private void smrtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smrtMouseExited
        if (smart.isShowing()) {
            smrt.setOpaque(true);
            smrt.setForeground(new Color(51, 204, 255));
        } else {
            smrt.setOpaque(false);
            smrt.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_smrtMouseExited

    private void regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseEntered
        if (regg.isShowing()) {
            reg.setOpaque(true);
            reg.setForeground(new Color(51, 204, 255));
        } else {
            reg.setOpaque(true);
            reg.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_regMouseEntered

    private void regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseExited
        if (regg.isShowing()) {
            reg.setOpaque(true);
            reg.setForeground(new Color(51, 204, 255));
        } else {
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_regMouseExited

    private void drpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drpMouseEntered
        if (drop.isShowing()) {
            drp.setOpaque(true);
            drp.setForeground(new Color(51, 204, 255));
        } else {
            drp.setOpaque(true);
            drp.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_drpMouseEntered

    private void drpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drpMouseExited
        if (drop.isShowing()) {
            drp.setOpaque(true);
            drp.setForeground(new Color(51, 204, 255));
        } else {
            drp.setOpaque(false);
            drp.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_drpMouseExited

    private void drpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(drop);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_drpActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(regg);
        parent.repaint();
        parent.revalidate();

    }//GEN-LAST:event_regActionPerformed

    private void lvrltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvrltMouseEntered
        if (tech.isShowing()) {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        } else {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_lvrltMouseEntered

    private void lvrltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvrltMouseExited
        if (tech.isShowing()) {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        } else {
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_lvrltMouseExited

    private void rsltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseEntered
        if (result.isShowing()) {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        } else {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_rsltMouseEntered

    private void rsltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseExited
        if (result.isShowing()) {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        } else {
            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_rsltMouseExited

    private void lvrltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvrltActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(tech);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_lvrltActionPerformed

    private void rsltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltActionPerformed
        StResult l = new StResult();
        l.setVisible(true);
    }//GEN-LAST:event_rsltActionPerformed

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(profile);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_moreActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_label1MouseClicked

    private void edtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        menu.setVisible(true);
        menu2.setVisible(false);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        etdnick.setEnabled(true);
        edtnat.setEnabled(true);
        etdrlg.setEnabled(true);
        etdnid.setEnabled(true);
        etdemail.setEnabled(true);
        etdbldg.setEnabled(true);
        etdsnid.setEnabled(true);
        etdphn.setEnabled(true);
        etdmari.setEnabled(true);
        etdgenm.setEnabled(true);
        etdgenf.setEnabled(true);
        upper.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        foccup.setEnabled(true);
        moccup.setEnabled(true);
        madeg.setEnabled(true);
        fadeg.setEnabled(true);
        fain.setEnabled(true);
        mainc.setEnabled(true);
        upgur.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        locname.setEnabled(true);
        loccon.setEnabled(true);
        locrl.setEnabled(true);
        locadd.setEnabled(true);
        uplocg.setEnabled(true);

        perr.setEnabled(true);
        gurd.setEnabled(true);
        loca.setEnabled(true);
        addr.setEnabled(true);
        peadd.setEnabled(true);
        pradd.setEnabled(true);
        pepo.setEnabled(true);
        prpo.setEnabled(true);
        pepost.setEnabled(true);
        prpost.setEnabled(true);
        prdis.setEnabled(true);
        pedis.setEnabled(true);
        pedi.setEnabled(true);
        prdi.setEnabled(true);
        pecon.setEnabled(true);
        prco.setEnabled(true);
        upadd.setEnabled(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(editprofile);
        parent.repaint();
        parent.revalidate();
        perr.setSelected(true);
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(personal);
        editp.repaint();
        editp.revalidate();

        String sql = "select * from stinfo,stlogin where stinfo.ID=stlogin.ID and stlogin.ID=?  ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String b = rs.getString("Name");
                etdname.setText(b);

                String d = rs.getString("Nickname");
                etdnick.setText(d);
                String n = rs.getString("Dob");
                etddob.setText(n);
                String e = rs.getString("Gender");
                if (e.equals("Male")) {
                    etdgenm.setSelected(true);
                    gend = "Male";
                } else if (e.equals("Female")) {
                    etdgenf.setSelected(true);
                    gend = "Female";
                }
                String h = rs.getString("Religion");

                if (h.equals("Hindu")) {
                    etdrlg.setSelectedIndex(1);
                } else if (h.equals("Muslim")) {
                    etdrlg.setSelectedIndex(2);
                } else if (h.equals("Buddha")) {
                    etdrlg.setSelectedIndex(3);
                } else if (h.equals("Chistian")) {
                    etdrlg.setSelectedIndex(4);
                } else if (h.equals(" ")) {
                    etdrlg.setSelectedIndex(0);
                }

                String i = rs.getString("Nationality");
                edtnat.setText(i);
                String j = rs.getString("NationalID");
                etdnid.setText(j);

                String f = rs.getString("Bloodgroup");
                switch (f) {
                    case "A+":
                        etdbldg.setSelectedIndex(1);
                        break;
                    case "A-":
                        etdbldg.setSelectedIndex(2);
                        break;
                    case "AB+":
                        etdbldg.setSelectedIndex(3);
                        break;
                    case "AB-":
                        etdbldg.setSelectedIndex(4);
                        break;
                    case "B+":
                        etdbldg.setSelectedIndex(5);
                        break;
                    case "B-":
                        etdbldg.setSelectedIndex(6);
                        break;
                    case "O+":
                        etdbldg.setSelectedIndex(7);
                        break;
                    case "O-":
                        etdbldg.setSelectedIndex(8);
                        break;
                    case "":
                        etdbldg.setSelectedIndex(0);
                        break;
                    default:
                        break;
                }
                String k = rs.getString("SocialnetID");
                etdsnid.setText(k);
                String c = rs.getString("Mobile");
                etdphn.setText(c);
                String m = rs.getString("Alternativeemail");
                etdemail.setText(m);

                String g = rs.getString("MaritalStatus");
                switch (g) {
                    case "Married":
                        etdmari.setSelectedIndex(1);
                        break;
                    case "Divorced":
                        etdmari.setSelectedIndex(2);
                        break;
                    case "Single":
                        etdmari.setSelectedIndex(3);
                        break;
                    case "Widow":
                        etdmari.setSelectedIndex(4);
                        break;
                    case "Widower":
                        etdmari.setSelectedIndex(5);
                        break;
                    case "":
                        etdmari.setSelectedIndex(0);
                        break;
                    default:
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_edtActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        menu.setVisible(true);
        menu2.setVisible(false);
        edt.setEnabled(true);
        loc.setEnabled(true);
        add.setEnabled(true);
        gur.setEnabled(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void perrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perrActionPerformed
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(personal);
        editp.repaint();
        editp.revalidate();
        perr.setSelected(true);
    }//GEN-LAST:event_perrActionPerformed

    private void gurdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gurdActionPerformed
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(Gurdian);
        editp.repaint();
        editp.revalidate();
        gurd.setSelected(true);
        perr.setSelected(false);

        String sql = "select * from stlogin,stgurdian where stlogin.ID=stgurdian.ID and stlogin.ID=?  ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String k = rs.getString("f_name");
                fnam.setText(k);
                String b = rs.getString("m_name");
                mnam.setText(b);
                String c = rs.getString("f_phone");
                fcont.setText(c);
                String d = rs.getString("m_phone");
                mcont.setText(d);
                String e = rs.getString("f_occupation");
                foccup.setText(e);
                String f = rs.getString("m_occupation");
                moccup.setText(f);
                String l = rs.getString("f_designation");
                fadeg.setText(l);
                String h = rs.getString("m_designation");
                madeg.setText(h);
                String i = rs.getString("f_income");
                fain.setText(i);
                String n = rs.getString("m_income");
                mainc.setText(n);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_gurdActionPerformed

    private void locaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaActionPerformed
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(localg);
        editp.repaint();
        editp.revalidate();

        String sql = "select * from stlogin,stlocal where stlocal.ID=stlogin.ID and stlogin.ID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String k = rs.getString("L_name");
                locname.setText(k);
                String b = rs.getString("L_relation");
                if (b.equals("Father")) {
                    locrl.setSelectedIndex(6);
                } else if (b.equals("Mother")) {
                    locrl.setSelectedIndex(2);
                } else if (b.equals("Sister")) {
                    locrl.setSelectedIndex(3);
                } else if (b.equals("Brother")) {
                    locrl.setSelectedIndex(4);
                } else if (b.equals("Uncle")) {
                    locrl.setSelectedIndex(5);
                } else if (b.equals("Aunty")) {
                    locrl.setSelectedIndex(1);
                }

                String c = rs.getString("L_Phone");
                loccon.setText(c);
                String d = rs.getString("L_add");
                locadd.setText(d);

            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_locaActionPerformed

    private void addrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrActionPerformed
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(adress);
        editp.repaint();
        editp.revalidate();

        String sql = "select * from stlogin,staddress where staddress.ID=stlogin.ID and stlogin.ID=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String a = rs.getString("pr_add");
                pradd.setText(a);
                String b = rs.getString("pe_add");
                peadd.setText(b);
                String c = rs.getString("pr_post");
                prpost.setText(c);
                String d = rs.getString("pe_post");
                pepost.setText(d);
                String e = rs.getString("pr_police");
                prpo.setText(e);
                String f = rs.getString("pe_police");
                pepo.setText(f);
                String z = rs.getString("pr_city");
                prdis.setText(z);
                String h = rs.getString("pe_city");
                pedis.setText(h);
                String i = rs.getString("pr_div");
                prdi.setText(i);
                String j = rs.getString("pe_div");
                pedi.setText(j);
                String k = rs.getString("pr_country");
                prco.setText(k);
                String l = rs.getString("pe_country");
                pecon.setText(l);
                String m = rs.getString("Zip");

            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_addrActionPerformed

    private void lgoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgoutMouseEntered
        lgout.setOpaque(true);
        lgout.setForeground(new Color(51, 204, 255));
    }//GEN-LAST:event_lgoutMouseEntered

    private void lgoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgoutMouseExited
        lgout.setOpaque(false);
        lgout.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_lgoutMouseExited

    private void lgoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgoutActionPerformed
        this.dispose();
        stlogin s = new stlogin();
        s.setVisible(true);
    }//GEN-LAST:event_lgoutActionPerformed

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label3MouseClicked

    private void label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label4MouseClicked

    private void label6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label6MouseClicked

    private void label7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label7MouseClicked

    private void label8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label8MouseClicked

    private void label9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label9MouseClicked

    private void label10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label10MouseClicked

    private void label11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label11MouseClicked

    private void label13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label13MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        menu.setVisible(true);
        menu2.setVisible(false);

        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        } else if (editprofile.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            perr.setEnabled(true);
            gurd.setEnabled(true);
            loca.setEnabled(true);
            addr.setEnabled(true);

            etdnick.setEnabled(true);
            edtnat.setEnabled(true);
            etdrlg.setEnabled(true);
            etdnid.setEnabled(true);
            etdemail.setEnabled(true);
            etdbldg.setEnabled(true);
            etdsnid.setEnabled(true);
            etdphn.setEnabled(true);
            etdmari.setEnabled(true);
            etdgenm.setEnabled(true);
            etdgenf.setEnabled(true);
            upper.setEnabled(true);

            locname.setEnabled(true);
            loccon.setEnabled(true);
            locrl.setEnabled(true);
            locadd.setEnabled(true);
            uplocg.setEnabled(true);

            peadd.setEnabled(true);
            pradd.setEnabled(true);
            pepo.setEnabled(true);
            prpo.setEnabled(true);
            pepost.setEnabled(true);
            prpost.setEnabled(true);
            prdis.setEnabled(true);
            pedis.setEnabled(true);
            pedi.setEnabled(true);
            prdi.setEnabled(true);
            pecon.setEnabled(true);
            prco.setEnabled(true);
            upadd.setEnabled(true);

            foccup.setEnabled(true);
            moccup.setEnabled(true);
            madeg.setEnabled(true);
            fadeg.setEnabled(true);
            fain.setEnabled(true);
            mainc.setEnabled(true);
            upgur.setEnabled(true);
        } else if (chngp.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            cp.setEnabled(true);
            np.setEnabled(true);
            cnp.setEnabled(true);
            uppass.setEnabled(true);
        } else if (drop.isShowing()) {
            sel1.setEnabled(true);
            sel2.setEnabled(true);
            wr.setEnabled(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        } else if (profile.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void bg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg4MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_bg4MouseClicked

    private void dashbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_dashbMouseClicked

    private void jpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_jpanelMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void dropsemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropsemMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_dropsemMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        menu.setVisible(true);
        menu2.setVisible(false);
        edt.setEnabled(true);
        loc.setEnabled(true);
        add.setEnabled(true);
        gur.setEnabled(true);
    }//GEN-LAST:event_profileMouseClicked

    private void gurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gurMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            Gurdianinfo g = new Gurdianinfo();
            g.setVisible(true);
            edt.setEnabled(false);
            loc.setEnabled(false);
            add.setEnabled(false);
            gur.setEnabled(false);

            String sql = "select * from stlogin,stgurdian where stgurdian.ID=stlogin.ID and stlogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String k = rs.getString("f_name");
                    Gurdianinfo.fname.setText(k);
                    String b = rs.getString("m_name");
                    Gurdianinfo.mname.setText(b);
                    String c = rs.getString("f_phone");
                    Gurdianinfo.fcon.setText(c);
                    String d = rs.getString("m_phone");
                    Gurdianinfo.mcon.setText(d);
                    String e = rs.getString("f_occupation");
                    Gurdianinfo.foccu.setText(e);
                    String f = rs.getString("m_occupation");
                    Gurdianinfo.moccu.setText(f);
                    String l = rs.getString("f_designation");
                    Gurdianinfo.fdes.setText(l);
                    String h = rs.getString("m_designation");
                    Gurdianinfo.mdes.setText(h);
                    String i = rs.getString("f_income");
                    Gurdianinfo.fin.setText(i);
                    String n = rs.getString("m_income");
                    Gurdianinfo.min.setText(n);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_gurMouseClicked

    private void locMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            Local g = new Local();
            g.setVisible(true);
            edt.setEnabled(false);
            gur.setEnabled(false);
            add.setEnabled(false);
            loc.setEnabled(false);

            String sql = "select * from stlogin,stlocal where stlocal.ID=stlogin.ID and stlogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String k = rs.getString("L_name");
                    Local.lname.setText(k);
                    String b = rs.getString("L_relation");
                    Local.lrel.setText(b);
                    String c = rs.getString("L_Phone");
                    Local.lcon.setText(c);
                    String d = rs.getString("L_add");
                    Local.ladd.setText(d);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_locMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            Address g = new Address();
            g.setVisible(true);
            edt.setEnabled(false);
            loc.setEnabled(false);
            gur.setEnabled(false);
            add.setEnabled(false);

            String sql = "select * from stlogin,staddress where staddress.ID=stlogin.ID and stlogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String a = rs.getString("pr_add");
                    Address.pradd.setText(a);
                    String b = rs.getString("pe_add");
                    Address.peadd.setText(b);
                    String c = rs.getString("pr_post");
                    Address.prpost.setText(c);
                    String d = rs.getString("pe_post");
                    Address.pepost.setText(d);
                    String e = rs.getString("pr_police");
                    Address.prpo.setText(e);
                    String f = rs.getString("pe_police");
                    Address.pepo.setText(f);
                    String z = rs.getString("pr_city");
                    Address.prcity.setText(z);
                    String h = rs.getString("pe_city");
                    Address.pecity.setText(h);
                    String i = rs.getString("pr_div");
                    Address.prdiv.setText(i);
                    String j = rs.getString("pe_div");
                    Address.pediv.setText(j);
                    String k = rs.getString("pr_country");
                    Address.prcou.setText(k);
                    String l = rs.getString("pe_country");
                    Address.pecou.setText(l);
                    String m = rs.getString("Zip");
                    Address.przip.setText(m);
                    String n = rs.getString("Zip");
                    Address.pezip.setText(n);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_addMouseClicked

    private void etdsnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdsnidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etdsnidActionPerformed

    private void label14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label14MouseClicked

    private void cpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpMouseClicked
        cp.setText("");
    }//GEN-LAST:event_cpMouseClicked

    private void npMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npMouseClicked
        np.setText("");
    }//GEN-LAST:event_npMouseClicked

    private void cnpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnpMouseClicked
        cnp.setText("");
    }//GEN-LAST:event_cnpMouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        cp.setEchoChar((char) 0);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        cp.setEchoChar('*');
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        np.setEchoChar((char) 0);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        np.setEchoChar('*');
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        cnp.setEchoChar((char) 0);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        cnp.setEchoChar('*');
    }//GEN-LAST:event_jButton3MouseReleased

    private void uppassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uppassMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            cp.setEnabled(true);
            np.setEnabled(true);
            cnp.setEnabled(true);
            uppass.setEnabled(true);
        } else {
            if ("".equals(cp.getText())) {
                JOptionPane.showMessageDialog(null, "Enter current password");
            } else {
                if ("".equals(np.getText())) {
                    JOptionPane.showMessageDialog(null, "Enter New Password");
                } else {
                    if ("".equals(cnp.getText())) {
                        JOptionPane.showMessageDialog(null, "Enter confirm password");
                    } else {
                        if (np.getText() == null ? cnp.getText() == null : np.getText().equals(cnp.getText())) {
                            String sql = "select * from stlogin where ID='" + usern.getText() + "' and password='" + cp.getText() + "' ";

                            try {
                                pst = conn.prepareStatement(sql);
                                rs = pst.executeQuery();
                                if (rs.next()) {
                                    String sql2 = "update stlogin set password='" + np.getText() + "' where ID='" + usern.getText() + "' ";

                                    pst2 = conn.prepareStatement(sql2);
                                    pst2.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "Successfully Updated");
                                    cp.setText("");
                                    np.setText("");
                                    cnp.setText("");

                                } else {
                                    JOptionPane.showMessageDialog(null, "Update Failed");
                                }
                            } catch (HeadlessException | SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password doesn't match");
                            np.setText("");
                            cnp.setText("");
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_uppassMouseClicked

    private void upperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperActionPerformed
        String nckn = etdnick.getText();
        String adgender = gend;
        String bldgr = etdbldg.getSelectedItem().toString();
        String marit = etdmari.getSelectedItem().toString();
        String re = etdrlg.getSelectedItem().toString();
        String natio = edtnat.getText();
        String natioid = etdnid.getText();
        String socioid = etdsnid.getText();
        String adphn = etdphn.getText();
        String ademail = etdemail.getText();

        String pero = "update stinfo set Nickname='" + nckn + "',Gender='" + adgender + "',Bloodgroup='" + bldgr + "', "
                + " MaritalStatus='" + marit + "',Religion='" + re + "', "
                + " Nationality='" + natio + "',nationalID='" + natioid + "',SocialnetID='" + socioid + "',Mobile='" + adphn + "', "
                + "Alternativeemail='" + ademail + "' where stinfo.ID='" + usern.getText() + "' ";

        try {
            PreparedStatement pst1 = conn.prepareStatement(pero);
            pst1.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_upperActionPerformed

    private void etdgenfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdgenfActionPerformed
        gend = "Female";
    }//GEN-LAST:event_etdgenfActionPerformed

    private void etdgenmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdgenmActionPerformed
        gend = "Male";
    }//GEN-LAST:event_etdgenmActionPerformed

    private void upgurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgurActionPerformed
        String focc = foccup.getText();
        String moccu = moccup.getText();
        String fdeg = fadeg.getText();
        String mdeg = madeg.getText();
        String fin = fain.getText();
        String min = mainc.getText();

        String guro = "update stgurdian set f_occupation='" + focc + "',m_occupation='" + moccu + "',f_designation='" + fdeg + "',m_designation='" + mdeg + "',"
                + "f_income='" + fin + "',m_income='" + min + "' where stgurdian.ID ='" + usern.getText() + "' ";

        try {
            PreparedStatement pst1 = conn.prepareStatement(guro);
            pst1.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_upgurActionPerformed

    private void upaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upaddActionPerformed
        String presadd = pradd.getText();
        String peradd = peadd.getText();
        String prespol = prpo.getText();
        String prespost = prpost.getText();
        String presdis = prdis.getText();
        String presdiv = prdi.getText();
        String prescon = prco.getText();
        String perrpol = pepo.getText();
        String perpost = pepost.getText();
        String perdist = pedis.getText();
        String perdiv = pedi.getText();
        String percont = pecon.getText();

        String add1 = "update staddress set pr_add='" + presadd + "',pe_add='" + peradd + "',pr_post='" + prespost + "', pe_post='" + perpost + "',"
                + " pr_police='" + prespol + "',  pe_police='" + perrpol + "', pr_city='" + presdis + "', pe_city='" + perdist + "',pr_div='" + presdiv + "', pe_div='" + perdiv + "',"
                + "pr_country='" + prescon + "', pe_country='" + percont + "' where staddress.ID = '" + usern.getText() + "'";

        try {
            PreparedStatement pst1 = conn.prepareStatement(add1);
            pst1.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_upaddActionPerformed

    private void uplocgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uplocgActionPerformed
        String lname = locname.getText();
        String lcon = loccon.getText();
        String lrel = locrl.getSelectedItem().toString();
        String ladd = locadd.getText();

        String l = "update stlocal set L_name='" + lname + "', L_relation='" + lrel + "', L_Phone='" + lcon + "', L_add='" + ladd + "' where stlocal.ID='" + usern.getText() + "'";
        try {
            PreparedStatement pst1 = conn.prepareStatement(l);
            pst1.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_uplocgActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String semis = semist.getSelectedItem().toString();
        String sql2 = "select Course_code,Course_name,Course_credit,Sec,Course_Type,Grade_Point from registered_courses where ID ='" + usern.getText() + "' and Semister='" + semis + "'";
        try {
            PreparedStatement pst10 = conn.prepareStatement(sql2);
            ResultSet rs1 = pst10.executeQuery();
            regtb.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gurActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String semis = semi.getSelectedItem().toString();
        try {
            String sql50 = "select Course_code,Course_Name,Semister,Teacher from liveresult where ID='" + usern.getText() + "' and Semister='" + semis + "' ";
            PreparedStatement pst50 = conn.prepareStatement(sql50);
            ResultSet rs50 = pst50.executeQuery();
            liv.setModel(DbUtils.resultSetToTableModel(rs50));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void livMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livMouseClicked
        String semis1 = semi.getSelectedItem().toString();
        try {
            int row1 = liv.getSelectedRow();
            String regg3 = (liv.getModel().getValueAt(row1, 0).toString());

            String sql50 = "select Q1,Q2,Q3,Qavg,Mid,Midimp from liveresult where ID='" + usern.getText() + "' and Semister='" + semis1 + "' and "
                    + "Course_code='" + regg3 + "' ";
            PreparedStatement pst50 = conn.prepareStatement(sql50);
            ResultSet rs50 = pst50.executeQuery();
            if (rs50.next()) {
                String f = rs50.getString("Q1");
                q11.setText(f);
                String g = rs50.getString("Q2");
                q21.setText(g);
                String h = rs50.getString("Q3");
                q31.setText(h);
                String i = rs50.getString("Qavg");
                qavg1.setText(i);
                String j = rs50.getString("Mid");
                mid1.setText(j);
                String k = rs50.getString("Midimp");
                midim.setText(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_livMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String semis2 = semisr.getSelectedItem().toString();

        try {
            String sql51 = "select Course_code,Course_name,Course_credit,Grade_Point from registered_courses where ID ='" + id5.getText() + "' and Semister='" + semis2 + "'";
            String sql52 = "select ID,Name from stinfo where ID ='" + id5.getText() + "' ";
            PreparedStatement pst51 = conn.prepareStatement(sql51);
            PreparedStatement pst52 = conn.prepareStatement(sql52);

            ResultSet rs51 = pst51.executeQuery();
            ResultSet rs52 = pst52.executeQuery();
            gpa.setModel(DbUtils.resultSetToTableModel(rs51));
            if (rs52.next()) {
                String a = rs52.getString("ID");
                id4.setText(a);
                String b = rs52.getString("Name");
                name4.setText(b);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void uppassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uppassActionPerformed

    private void deaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deaActionPerformed
        String dect = "Deactive";

        String o = "update smartcard set Status='" + dect + "' where smartcard.ID='" + usern.getText() + "'";
        try {
            PreparedStatement pst144 = conn.prepareStatement(o);
            pst144.executeUpdate();
            conn.close();
            conn = Connect.Studentdb();
            String smrt1 = "select * from smartcard where ID='" + usern.getText() + "'";

        try {
            PreparedStatement pst10 = conn.prepareStatement(smrt1);
            ResultSet rs10 = pst10.executeQuery();
            if (rs10.next()) {
                String a = rs10.getString("Status");
                sts.setText(a);
                String b = rs10.getString("balance");
                blance.setText(b);

                if ("Active".equals(sts.getText())) {
                    dec.setVisible(true);
                    dea.setVisible(true);
                    act.setVisible(false);
                    act1.setVisible(false);
                } else if ("Deactive".equals(sts.getText())) {
                    dec.setVisible(false);
                    dea.setVisible(false);
                    act.setVisible(true);
                    act1.setVisible(true);
                }
            }
        } catch (SQLException e) {
        }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_deaActionPerformed

    private void act1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_act1ActionPerformed
        String dect1 = "Active";

        String o = "update smartcard set Status='" + dect1 + "' where smartcard.ID='" + usern.getText() + "'";
        try {
            PreparedStatement pst145 = conn.prepareStatement(o);
            pst145.executeUpdate();
            conn.close();
            conn = Connect.Studentdb();
            String smrt1 = "select * from smartcard where ID='" + usern.getText() + "'";

        try {
            PreparedStatement pst10 = conn.prepareStatement(smrt1);
            ResultSet rs10 = pst10.executeQuery();
            if (rs10.next()) {
                String a = rs10.getString("Status");
                sts.setText(a);
                String b = rs10.getString("balance");
                blance.setText(b);

                if ("Active".equals(sts.getText())) {
                    dec.setVisible(true);
                    dea.setVisible(true);
                    act.setVisible(false);
                    act1.setVisible(false);
                } else if ("Deactive".equals(sts.getText())) {
                    dec.setVisible(false);
                    dea.setVisible(false);
                    act.setVisible(true);
                    act1.setVisible(true);
                }
            }
        } catch (SQLException e) {
        }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_act1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gurdian;
    private javax.swing.JLabel act;
    private javax.swing.JButton act1;
    public static javax.swing.JButton add;
    private javax.swing.JToggleButton addr;
    private javax.swing.JPanel adress;
    public static javax.swing.JLabel alem;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel blance;
    public static javax.swing.JLabel bld;
    public static javax.swing.JLabel bldd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel chngp;
    private javax.swing.JButton chngpass;
    private javax.swing.JButton close;
    private javax.swing.JPasswordField cnp;
    private javax.swing.JPasswordField cp;
    private javax.swing.JButton dash;
    private javax.swing.JPanel dashb;
    private javax.swing.JButton dea;
    private javax.swing.JLabel dec;
    public static javax.swing.JLabel dob;
    public static javax.swing.JLabel dobb;
    private javax.swing.JPanel drop;
    private javax.swing.JPanel dropsem;
    private javax.swing.JButton drp;
    public static javax.swing.JLabel due;
    private javax.swing.JPanel editp;
    private javax.swing.JButton editpro;
    private javax.swing.JPanel editprofile;
    public static javax.swing.JButton edt;
    private javax.swing.JTextField edtnat;
    public static javax.swing.JLabel eml;
    private javax.swing.JComboBox<String> etdbldg;
    private javax.swing.JTextField etddob;
    private javax.swing.JTextField etdemail;
    private javax.swing.JRadioButton etdgenf;
    private javax.swing.JRadioButton etdgenm;
    public static javax.swing.JComboBox<String> etdmari;
    private javax.swing.JTextField etdname;
    private javax.swing.JTextField etdnick;
    private javax.swing.JTextField etdnid;
    private javax.swing.JTextField etdphn;
    private javax.swing.JComboBox<String> etdrlg;
    private javax.swing.JTextField etdsnid;
    public static javax.swing.JTextField fadeg;
    public static javax.swing.JTextField fain;
    private javax.swing.JPanel father;
    public static javax.swing.JLabel fb;
    public static javax.swing.JTextField fcont;
    public static javax.swing.JTextField fnam;
    public static javax.swing.JLabel fname2;
    public static javax.swing.JTextField foccup;
    public static javax.swing.JLabel gen;
    private javax.swing.JTable gpa;
    public static javax.swing.JButton gur;
    private javax.swing.JToggleButton gurd;
    private javax.swing.JLabel id4;
    private javax.swing.JTextField id5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpanel;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JButton lg;
    private javax.swing.JButton lgout;
    private javax.swing.JTable liv;
    public static javax.swing.JButton loc;
    private javax.swing.JToggleButton loca;
    private javax.swing.JTextField locadd;
    private javax.swing.JPanel localg;
    private javax.swing.JTextField loccon;
    private javax.swing.JTextField locname;
    private javax.swing.JComboBox<String> locrl;
    private javax.swing.JButton lvrlt;
    public static javax.swing.JTextField madeg;
    public static javax.swing.JTextField mainc;
    public static javax.swing.JLabel mar;
    public static javax.swing.JTextField mcont;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JLabel mid1;
    private javax.swing.JLabel midim;
    private javax.swing.JButton minimize;
    public static javax.swing.JTextField mnam;
    public static javax.swing.JLabel mname2;
    public static javax.swing.JLabel mob;
    public static javax.swing.JTextField moccup;
    private javax.swing.JButton more;
    public static javax.swing.JLabel nam;
    public static javax.swing.JLabel name;
    private javax.swing.JLabel name4;
    public static javax.swing.JLabel national;
    public static javax.swing.JLabel nck;
    public static javax.swing.JLabel nid;
    private javax.swing.JPasswordField np;
    public static javax.swing.JLabel paid;
    private javax.swing.JPanel parent;
    public static javax.swing.JLabel payble;
    private javax.swing.JTextField peadd;
    private javax.swing.JTextField pecon;
    private javax.swing.JTextField pedi;
    private javax.swing.JTextField pedis;
    private javax.swing.JTextField pepo;
    private javax.swing.JTextField pepost;
    private javax.swing.JToggleButton perr;
    private javax.swing.JPanel personal;
    public static javax.swing.JLabel phn;
    private javax.swing.JTextField pradd;
    private javax.swing.JTextField prco;
    private javax.swing.JTextField prdi;
    private javax.swing.JTextField prdis;
    private javax.swing.JButton pro;
    private javax.swing.JPanel profile;
    private javax.swing.JTextField prpo;
    private javax.swing.JTextField prpost;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q21;
    private javax.swing.JLabel q31;
    private javax.swing.JLabel qavg1;
    private javax.swing.JButton reg;
    private javax.swing.JPanel regg;
    private javax.swing.JTable regtb;
    private javax.swing.JPanel result;
    public static javax.swing.JLabel rlgn;
    private javax.swing.JButton rslt;
    private javax.swing.JComboBox<String> sel1;
    private javax.swing.JComboBox<String> sel2;
    private javax.swing.JComboBox<String> semi;
    private javax.swing.JComboBox<String> semisr;
    private javax.swing.JComboBox<String> semist;
    private javax.swing.JPanel smart;
    private javax.swing.JButton smrt;
    private javax.swing.JLabel sts;
    private javax.swing.JPanel tech;
    private javax.swing.JButton upadd;
    private javax.swing.JButton upgur;
    private javax.swing.JButton uplocg;
    private javax.swing.JButton uppass;
    private javax.swing.JButton upper;
    public static javax.swing.JLabel us;
    public static javax.swing.JLabel usern;
    private javax.swing.JTextArea wr;
    // End of variables declaration//GEN-END:variables
}

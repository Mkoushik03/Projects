package Main.Teacher;

import Main.Connect;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class tpro extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst, pst2 = null;
    String gend;

    public tpro() {
        initComponents();
        menu2.setVisible(false);
        conn = Connect.Studentdb();
    }

    public void update_table() {
        try {
            String sql = "Select *from Course";
            PreparedStatement pst10 = conn.prepareStatement(sql);
            rs = pst10.executeQuery();
            cours.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        menu2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        dash = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pro = new javax.swing.JButton();
        editpro = new javax.swing.JButton();
        chngpass = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        lvrlt = new javax.swing.JButton();
        rslt = new javax.swing.JButton();
        rslt1 = new javax.swing.JButton();
        lgout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        dashb = new javax.swing.JPanel();
        label7 = new java.awt.Label();
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
        label2 = new java.awt.Label();
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
        label8 = new java.awt.Label();
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
        label9 = new java.awt.Label();
        localg = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        uplocg = new javax.swing.JButton();
        label10 = new java.awt.Label();
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
        label3 = new java.awt.Label();
        jLabel105 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        regg = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        jLabel116 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Studid = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Studname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        cde = new javax.swing.JToggleButton();
        crt = new javax.swing.JToggleButton();
        crdt = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cours = new javax.swing.JTable();
        load = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        sec = new javax.swing.JComboBox<>();
        crstype = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        regcrs = new javax.swing.JButton();
        crscode = new javax.swing.JTextField();
        crsname = new javax.swing.JTextField();
        crscredit = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        regtb = new javax.swing.JTable();
        selsemis = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        del = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        live = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        jLabel126 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        semi = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        regggg = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        qavg = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        mimp = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        fina = new javax.swing.JTextField();
        fimp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Sec = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        studi = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        sc1 = new javax.swing.JTextField();
        cd = new javax.swing.JTextField();
        cdt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        course_cd = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        sec2 = new javax.swing.JComboBox<>();
        reset2 = new javax.swing.JButton();
        addresult = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        jLabel128 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        semi5 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        code5 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        sec5 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        regggg1 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        Sec1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        studi1 = new javax.swing.JTextField();
        sem1 = new javax.swing.JTextField();
        sc2 = new javax.swing.JTextField();
        cd1 = new javax.swing.JTextField();
        cdt1 = new javax.swing.JTextField();
        mark = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        qavg1 = new javax.swing.JTextField();
        mid1 = new javax.swing.JTextField();
        mimp1 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        fina1 = new javax.swing.JTextField();
        fimp1 = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        atten = new javax.swing.JTextField();
        assign = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        load2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        usern = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        reg.setBackground(new java.awt.Color(78, 102, 102));
        reg.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        reg.setForeground(new java.awt.Color(240, 240, 240));
        reg.setText("Register Courses");
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
        menu2.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 250, 40));

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
        menu2.add(lvrlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 40));

        rslt.setBackground(new java.awt.Color(78, 102, 102));
        rslt.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        rslt.setForeground(new java.awt.Color(240, 240, 240));
        rslt.setText("Add Result");
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
        menu2.add(rslt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, 40));

        rslt1.setBackground(new java.awt.Color(78, 102, 102));
        rslt1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        rslt1.setForeground(new java.awt.Color(240, 240, 240));
        rslt1.setText("Full Sec Result");
        rslt1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 1));
        rslt1.setBorderPainted(false);
        rslt1.setContentAreaFilled(false);
        rslt1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rslt1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rslt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rslt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rslt1MouseExited(evt);
            }
        });
        rslt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rslt1ActionPerformed(evt);
            }
        });
        menu2.add(rslt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, 40));

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
        menu2.add(lgout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 250, 40));

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
        dashb.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Teacher Dashboard");
        dashb.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 210, 30));

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
        jLabel16.setText("Teacher Basic Info");
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
        jpanel.add(fname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 22));

        mname2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mname2.setForeground(new java.awt.Color(0, 153, 153));
        mname2.setText("jLabel28");
        jpanel.add(mname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 22));

        dashb.add(jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 400, 320));

        parent.add(dashb, "card7");

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
        personal.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

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
        jLabel68.setText("jLabel68");
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
        buttonGroup2.add(etdgenm);
        etdgenm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdgenm.setForeground(new java.awt.Color(0, 153, 153));
        etdgenm.setText("Male");
        etdgenm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etdgenmActionPerformed(evt);
            }
        });
        jPanel6.add(etdgenm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, -1, -1));

        etdgenf.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup2.add(etdgenf);
        etdgenf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etdgenf.setForeground(new java.awt.Color(0, 153, 153));
        etdgenf.setText("Female");
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
        Gurdian.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1246, 40));

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

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(0, 0, 0));
        label9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label9MouseClicked(evt);
            }
        });
        adress.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1246, 20));

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
        localg.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1246, 40));

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
        chngp.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 102, 102));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("Change Password");
        chngp.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        chngp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

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

        regg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        regg.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 102, 102));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Registerd Courses");
        regg.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        regg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Student ID");
        regg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        stid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        regg.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 170, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Student ID");
        regg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        Studid.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Studid.setForeground(new java.awt.Color(0, 153, 153));
        Studid.setText("jLabel8");
        regg.add(Studid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("Name");
        regg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Studname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Studname.setForeground(new java.awt.Color(0, 153, 153));
        Studname.setText("jLabel15");
        regg.add(Studname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 160, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Offered Course list");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        search.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        search.setText("Search By Code");
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 40));

        cde.setText("Code");
        cde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdeActionPerformed(evt);
            }
        });
        jPanel2.add(cde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 30));

        crt.setText("Course Title");
        jPanel2.add(crt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 30));

        crdt.setText("Credit");
        jPanel2.add(crdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 30));

        cours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        cours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cours);
        if (cours.getColumnModel().getColumnCount() > 0) {
            cours.getColumnModel().getColumn(0).setPreferredWidth(20);
            cours.getColumnModel().getColumn(1).setPreferredWidth(80);
            cours.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 410, 190));

        regg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 410, 300));

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        regg.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("Course Code");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Course Title");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 102));
        jLabel27.setText("Credit");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        jPanel4.add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 120, 30));

        crstype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Regular", "Irregular", " " }));
        jPanel4.add(crstype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, 30));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 102));
        jLabel31.setText("Course Type");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 102));
        jLabel30.setText("Select Section");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 30));

        regcrs.setText("Register Course");
        regcrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcrsActionPerformed(evt);
            }
        });
        jPanel4.add(regcrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, 40));

        crscode.setBackground(new java.awt.Color(153, 153, 153));
        crscode.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        crscode.setForeground(new java.awt.Color(204, 204, 255));
        crscode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crscode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(crscode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 190, 40));

        crsname.setBackground(new java.awt.Color(153, 153, 153));
        crsname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        crsname.setForeground(new java.awt.Color(204, 204, 255));
        crsname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crsname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(crsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 40));

        crscredit.setBackground(new java.awt.Color(153, 153, 153));
        crscredit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        crscredit.setForeground(new java.awt.Color(204, 204, 255));
        crscredit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crscredit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.add(crscredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, 40));

        regg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 320, 370));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Registered Course List");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

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
        jScrollPane2.setViewportView(regtb);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 270));

        regg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 420, 320));

        selsemis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        regg.add(selsemis, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 160, 30));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 102));
        jLabel32.setText("Select Sesmister");
        regg.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 120, 30));

        del.setBackground(new java.awt.Color(204, 0, 51));
        del.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        del.setText("Delete");
        regg.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 90, 30));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        regg.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, -1, -1));

        parent.add(regg, "card6");

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
        live.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel126.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 102, 102));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Live Result");
        live.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel12.setText("Tech");
        live.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel127.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel127.setText("Select Semister");
        live.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

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
        live.add(semi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 150, 40));

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

        jPanel19.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        live.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 360));

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel130.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel130.setText("Quiz 1");
        jPanel20.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel131.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel131.setText("Quiz 2");
        jPanel20.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel132.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel132.setText("Quiz 3");
        jPanel20.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel133.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel133.setText("Quiz Average");
        jPanel20.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel134.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel134.setText("Midterm ");
        jPanel20.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel135.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel135.setText("Midterm Improvement");
        jPanel20.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        q1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        q1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                q1KeyReleased(evt);
            }
        });
        jPanel20.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 15, 160, 30));

        q2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 65, 160, 30));

        q3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 115, 160, 30));

        qavg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        qavg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(qavg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 165, 160, 30));

        mid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 215, 160, 30));

        mimp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mimp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(mimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 265, 160, 30));

        jLabel136.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel136.setText("Final");
        jPanel20.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel137.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel137.setText("Final Improvement");
        jPanel20.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        fina.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(fina, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 315, 160, 30));

        fimp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fimp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel20.add(fimp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 365, 160, 30));

        live.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 370, 410));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Load");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        live.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 65, 90, 25));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Student ID");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Sec.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Sec.setText("Sec");
        jPanel9.add(Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel29.setText("Semister");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel43.setText("Course Code");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel44.setText("Course Title");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        studi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        studi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studiActionPerformed(evt);
            }
        });
        jPanel9.add(studi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 180, 31));

        sem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        jPanel9.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 30));

        sc1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc1ActionPerformed(evt);
            }
        });
        jPanel9.add(sc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 30));

        cd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        jPanel9.add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 30));

        cdt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cdt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(cdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 30));

        live.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 320, 330));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Course Code");
        live.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, 20));

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
        live.add(course_cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 120, 40));

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Update Marks");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        live.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 150, 40));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Sec");
        live.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 30, 20));

        sec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec2ActionPerformed(evt);
            }
        });
        live.add(sec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 90, 40));

        reset2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        live.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 543, -1, 40));

        parent.add(live, "card10");

        addresult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        addresult.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel128.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 102, 102));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("ADD Result");
        addresult.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1246, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel5.setText("result");
        addresult.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel45.setText("Select Semister");
        addresult.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 110, 22));

        semi5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        semi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semi5ActionPerformed(evt);
            }
        });
        addresult.add(semi5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 75, 120, 30));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel46.setText("Course Code");
        addresult.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, 22));

        code5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        code5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code5ActionPerformed(evt);
            }
        });
        addresult.add(code5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 75, 90, 30));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel47.setText("Sec");
        addresult.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, 22));

        sec5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sec5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec5ActionPerformed(evt);
            }
        });
        addresult.add(sec5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 75, 80, 30));

        regggg1.setModel(new javax.swing.table.DefaultTableModel(
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
        regggg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regggg1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(regggg1);

        addresult.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 470, 400));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel48.setText("Student ID");
        jPanel15.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Sec1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Sec1.setText("Sec");
        jPanel15.add(Sec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel49.setText("Semister");
        jPanel15.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setText("Course Code");
        jPanel15.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel57.setText("Course Title");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        studi1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel15.add(studi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 180, 31));

        sem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel15.add(sem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 30));

        sc2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel15.add(sc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 30));

        cd1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel15.add(cd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 30));

        cdt1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cdt1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel15.add(cdt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 30));

        mark.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        mark.setText("ADD Grade Point");
        mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markActionPerformed(evt);
            }
        });
        jPanel15.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 170, 50));

        addresult.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 320, 390));

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel141.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel141.setText("Quiz Average");
        jPanel21.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel142.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel142.setText("Midterm ");
        jPanel21.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel143.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel143.setText("Midterm Improvement");
        jPanel21.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        qavg1.setEditable(false);
        qavg1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        qavg1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qavg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qavg1MouseClicked(evt);
            }
        });
        jPanel21.add(qavg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 25, 160, 30));

        mid1.setEditable(false);
        mid1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mid1MouseClicked(evt);
            }
        });
        jPanel21.add(mid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 75, 160, 30));

        mimp1.setEditable(false);
        mimp1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mimp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mimp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mimp1MouseClicked(evt);
            }
        });
        jPanel21.add(mimp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 125, 160, 30));

        jLabel144.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel144.setText("Final");
        jPanel21.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel145.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel145.setText("Final Improvement");
        jPanel21.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        fina1.setEditable(false);
        fina1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fina1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fina1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fina1MouseClicked(evt);
            }
        });
        jPanel21.add(fina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, 160, 30));

        fimp1.setEditable(false);
        fimp1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fimp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fimp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fimp1MouseClicked(evt);
            }
        });
        jPanel21.add(fimp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 225, 160, 30));

        jLabel146.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel146.setText("Presentation");
        jPanel21.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel147.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel147.setText("Assignment");
        jPanel21.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel148.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel148.setText("Attendence");
        jPanel21.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        atten.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        atten.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel21.add(atten, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 275, 160, 30));

        assign.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        assign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel21.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 325, 160, 30));

        pre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel21.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 375, 160, 30));

        addresult.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 370, 430));

        load2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        load2.setText("Load");
        load2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load2ActionPerformed(evt);
            }
        });
        addresult.add(load2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 73, -1, 30));

        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        addresult.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        parent.add(addresult, "card3");

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
        usern.setText("1001");
        jPanel1.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 90, 32));

        nm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 170, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, -1, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Teacher");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 8, -1, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 255));
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_School_30px.png"))); // NOI18N
        jLabel59.setText("Student Management System-");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
        } else if (regg.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            stid.setEnabled(true);
            load.setEnabled(true);
            search.setEnabled(true);
            selsemis.setEnabled(true);
            crscode.setEnabled(true);
            crsname.setEnabled(true);
            crscredit.setEnabled(true);
            sec.setEnabled(true);
            crstype.setEnabled(true);
            del.setEnabled(true);
            cde.setEnabled(true);
            crt.setEnabled(true);
            crdt.setEnabled(true);
            regcrs.setEnabled(true);
        } else if (addresult.isShowing()) {
            studi1.setEnabled(true);
            sem1.setEnabled(true);
            sc2.setEnabled(true);
            cd1.setEnabled(true);
            cdt1.setEnabled(true);
            atten.setEnabled(true);
            assign.setEnabled(true);
            pre.setEnabled(true);
            qavg1.setEnabled(true);
            mid1.setEnabled(true);
            mimp1.setEnabled(true);
            fina1.setEnabled(true);
            fimp1.setEnabled(true);
            semi5.setEnabled(true);
            code5.setEnabled(true);
            sec5.setEnabled(true);
            mark.setEnabled(true);
            load2.setEnabled(true);
            regggg1.setCellSelectionEnabled(true);
            regggg1.setCellSelectionEnabled(true);
            regggg1.setFocusable(true);
        } else if (live.isShowing()) {
            studi.setEnabled(true);
            sem.setEnabled(true);
            sc1.setEnabled(true);
            cd.setEnabled(true);
            cdt.setEnabled(true);
            q1.setEnabled(true);
            q2.setEnabled(true);
            q3.setEnabled(true);
            qavg.setEnabled(true);
            mid.setEnabled(true);
            mimp.setEnabled(true);
            fina.setEnabled(true);
            fimp.setEnabled(true);
            semi.setEnabled(true);
            course_cd.setEnabled(true);
            sec2.setEnabled(true);
            regggg.setCellSelectionEnabled(true);
            regggg.setCellSelectionEnabled(true);
            regggg.setFocusable(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

    }//GEN-LAST:event_dashActionPerformed

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

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

         String sql45 = "Select * from teinfo where teinfo.ID='"+usern.getText()+"'";
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

    private void editproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editproActionPerformed

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

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

        String sql = "select * from teinfo,telogin where teinfo.ID=telogin.ID and telogin.ID=?  ";

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
        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

    }//GEN-LAST:event_chngpassActionPerformed

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

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(regg);
        parent.repaint();
        parent.revalidate();

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

        dm3.setRowCount(0);

        String reqcr = "if not exists(Select * from sysobjects where name = 'registered_courses' and xtype = 'U')create table registered_courses"
                + "(ID varchar(255) not null foreign key references stinfo(ID),Semister varchar(255),Course_code varchar(255), Course_name varchar(255), "
                + " Course_credit varchar(255), Sec varchar(255), Teacher varchar(255),Course_Type varchar(255),Grade_Point varchar(255),)";
        String reqcr2 = "if not exists(Select * from sysobjects where name = 'liveresult' and xtype = 'U')create table liveresult(ID varchar(255) "
                + " foreign key references stlogin(ID),Semister varchar(255),Course_code varchar(255), Course_name varchar(255), "
                + "Sec varchar(255), Teacher varchar(255),Q1 float,Q2 float,Q3 float,Qavg float,Mid float,"
                + "Midimp float,Final float,Fimp float,Attendence float,Assignment float,Presentation float)";

        try {
            PreparedStatement pst10 = conn.prepareStatement(reqcr);
            PreparedStatement pst11 = conn.prepareStatement(reqcr2);
            pst10.execute();
            pst11.execute();
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_regActionPerformed

    private void lvrltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvrltMouseEntered
        if (live.isShowing()) {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        } else {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_lvrltMouseEntered

    private void lvrltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvrltMouseExited
        if (live.isShowing()) {
            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
        } else {
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_lvrltMouseExited

    private void lvrltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvrltActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(live);
        parent.repaint();
        parent.revalidate();

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);
    }//GEN-LAST:event_lvrltActionPerformed

    private void rsltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseEntered
        if (addresult.isShowing()) {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        } else {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_rsltMouseEntered

    private void rsltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsltMouseExited
        if (addresult.isShowing()) {
            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));
        } else {
            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_rsltMouseExited

    private void rsltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsltActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(addresult);
        parent.repaint();
        parent.revalidate();

        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");

        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm3 = (DefaultTableModel) regggg.getModel();
        dm3.setRowCount(0);

        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);


    }//GEN-LAST:event_rsltActionPerformed

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
        TeacherLogin s = new TeacherLogin();
        s.setVisible(true);
    }//GEN-LAST:event_lgoutActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        if (menu2.isShowing()) {
            menu2.setVisible(false);
            menu.setVisible(true);
        }
    }//GEN-LAST:event_label1MouseClicked

    private void edtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtActionPerformed

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

        String sql = "select * from teinfo,telogin where teinfo.ID=telogin.ID and telogin.ID=?  ";

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

    private void perrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perrActionPerformed
        editp.removeAll();
        editp.repaint();
        editp.revalidate();

        editp.add(personal);
        editp.repaint();
        editp.revalidate();
        perr.setSelected(true);

        String sql = "select * from teinfo,telogin where teinfo.ID=telogin.ID and telogin.ID=?  ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usern.getText());
            rs = pst.executeQuery();
            if (rs.next()) {

                String b = rs.getString("Name");
                etdname.setText(b);

                String c = rs.getString("Mobile");
                etdphn.setText(c);

                String d = rs.getString("Nickname");
                etdnick.setText(d);
                String e = rs.getString("Gender");
                if (e.equals("Male")) {
                    etdgenm.setSelected(true);
                } else if (e.equals("Female")) {
                    etdgenf.setSelected(true);
                }
                String f = rs.getString("Bloodgroup");
                if (f.equals("A+")) {
                    etdbldg.setSelectedIndex(1);
                } else if (f.equals("A-")) {
                    etdbldg.setSelectedIndex(2);
                } else if (f.equals("AB+")) {
                    etdbldg.setSelectedIndex(3);
                } else if (f.equals("AB-")) {
                    etdbldg.setSelectedIndex(4);
                } else if (f.equals("B+")) {
                    etdbldg.setSelectedIndex(5);
                } else if (f.equals("B-")) {
                    etdbldg.setSelectedIndex(6);
                } else if (f.equals("O+")) {
                    etdbldg.setSelectedIndex(7);
                } else if (f.equals("O-")) {
                    etdbldg.setSelectedIndex(8);
                } else if (f.equals("")) {
                    etdbldg.setSelectedIndex(0);
                }

                String g = rs.getString("Maritalstatus");
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
                String h = rs.getString("Religion");

                if (h.equals("Hindu")) {
                    etdrlg.setSelectedIndex(1);
                } else if (h.equals("Muslim")) {
                    etdrlg.setSelectedIndex(2);
                } else if (h.equals("Buddha")) {
                    etdrlg.setSelectedIndex(3);
                } else if (h.equals("Chistian")) {
                    etdrlg.setSelectedIndex(4);
                } else if (h.equals("")) {
                    etdrlg.setSelectedIndex(0);
                }

                String i = rs.getString("Nationality");
                edtnat.setText(i);
                String j = rs.getString("NationalID");
                etdnid.setText(j);
                String k = rs.getString("Socialnet");
                etdsnid.setText(k);
                String m = rs.getString("Alternativeemmail");
                etdemail.setText(m);
                String n = rs.getString("DateOfBirth");
                etddob.setText(n);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid");
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

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

        String sql = "select * from telogin,tegurdian where telogin.ID=tegurdian.ID and telogin.ID=?  ";

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

        String sql = "select * from telogin,telocal where telocal.ID=telogin.ID and telogin.ID=?";
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

        String sql = "select * from telogin,teaddress where teaddress.ID=telogin.ID and telogin.ID=?";
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
        setState(tpro.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

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

            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));

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

            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));

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

            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));

            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
            cp.setEnabled(false);
            np.setEnabled(false);
            cnp.setEnabled(false);
            uppass.setEnabled(false);
        } else if (regg.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));

            reg.setOpaque(true);
            reg.setForeground(new Color(51, 204, 255));

            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            stid.setEnabled(false);
            load.setEnabled(false);
            search.setEnabled(false);
            selsemis.setEnabled(false);
            crscode.setEnabled(false);
            crsname.setEnabled(false);
            crscredit.setEnabled(false);
            sec.setEnabled(false);
            crstype.setEnabled(false);
            del.setEnabled(false);
            cde.setEnabled(false);
            crt.setEnabled(false);
            crdt.setEnabled(false);
            regcrs.setEnabled(false);

        } else if (live.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));

            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));

            lvrlt.setOpaque(true);
            lvrlt.setForeground(new Color(51, 204, 255));
            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));

            studi.setEnabled(false);
            sem.setEnabled(false);
            sc1.setEnabled(false);
            cd.setEnabled(false);
            cdt.setEnabled(false);
            q1.setEnabled(false);
            q2.setEnabled(false);
            q3.setEnabled(false);
            qavg.setEnabled(false);
            mid.setEnabled(false);
            mimp.setEnabled(false);
            fina.setEnabled(false);
            fimp.setEnabled(false);
            semi.setEnabled(false);
            course_cd.setEnabled(false);
            sec2.setEnabled(false);
            regggg.setCellSelectionEnabled(false);
            regggg.setCellSelectionEnabled(false);
            regggg.setFocusable(false);
        } else if (addresult.isShowing()) {
            dash.setOpaque(false);
            dash.setForeground(new Color(240, 240, 240));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));

            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));

            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));

            rslt.setOpaque(true);
            rslt.setForeground(new Color(51, 204, 255));

            studi1.setEnabled(false);
            sem1.setEnabled(false);
            sc2.setEnabled(false);
            cd1.setEnabled(false);
            cdt1.setEnabled(false);
            atten.setEnabled(false);
            assign.setEnabled(false);
            pre.setEnabled(false);
            qavg1.setEnabled(false);
            mid1.setEnabled(false);
            mimp1.setEnabled(false);
            fina1.setEnabled(false);
            fimp1.setEnabled(false);
            semi5.setEnabled(false);
            code5.setEnabled(false);
            sec5.setEnabled(false);
            mark.setEnabled(false);
            load2.setEnabled(false);
            regggg1.setCellSelectionEnabled(false);
            regggg1.setCellSelectionEnabled(false);
            regggg1.setFocusable(false);
        } else if (dash.isShowing()) {
            dash.setOpaque(true);
            dash.setForeground(new Color(51, 204, 255));
            pro.setOpaque(false);
            pro.setForeground(new Color(240, 240, 240));
            editpro.setOpaque(false);
            editpro.setForeground(new Color(240, 240, 240));
            chngpass.setOpaque(false);
            chngpass.setForeground(new Color(240, 240, 240));
            reg.setOpaque(false);
            reg.setForeground(new Color(240, 240, 240));
            lvrlt.setOpaque(false);
            lvrlt.setForeground(new Color(240, 240, 240));
            rslt.setOpaque(false);
            rslt.setForeground(new Color(240, 240, 240));
            more.setEnabled(false);
        }

    }//GEN-LAST:event_menuActionPerformed

    private void label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label2MouseClicked

    private void label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label3MouseClicked

    private void label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label4MouseClicked

    private void label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label5MouseClicked

    private void label6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label6MouseClicked

    private void label7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label7MouseClicked

    private void label8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label8MouseClicked

    private void label10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label10MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
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
        } else if (regg.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            stid.setEnabled(true);
            load.setEnabled(true);
            search.setEnabled(true);
            selsemis.setEnabled(true);
            crscode.setEnabled(true);
            crsname.setEnabled(true);
            crscredit.setEnabled(true);
            sec.setEnabled(true);
            crstype.setEnabled(true);
            del.setEnabled(true);
            cde.setEnabled(true);
            crt.setEnabled(true);
            crdt.setEnabled(true);
            regcrs.setEnabled(true);
        } else if (addresult.isShowing()) {
            studi1.setEnabled(true);
            sem1.setEnabled(true);
            sc2.setEnabled(true);
            cd1.setEnabled(true);
            cdt1.setEnabled(true);
            atten.setEnabled(true);
            assign.setEnabled(true);
            pre.setEnabled(true);
            qavg1.setEnabled(true);
            mid1.setEnabled(true);
            mimp1.setEnabled(true);
            fina1.setEnabled(true);
            fimp1.setEnabled(true);
            semi5.setEnabled(true);
            code5.setEnabled(true);
            sec5.setEnabled(true);
            mark.setEnabled(true);
            load2.setEnabled(true);
            regggg1.setCellSelectionEnabled(true);
            regggg1.setCellSelectionEnabled(true);
            regggg1.setFocusable(true);
        } else if (live.isShowing()) {
            studi.setEnabled(true);
            sem.setEnabled(true);
            sc1.setEnabled(true);
            cd.setEnabled(true);
            cdt.setEnabled(true);
            q1.setEnabled(true);
            q2.setEnabled(true);
            q3.setEnabled(true);
            qavg.setEnabled(true);
            mid.setEnabled(true);
            mimp.setEnabled(true);
            fina.setEnabled(true);
            fimp.setEnabled(true);
            semi.setEnabled(true);
            course_cd.setEnabled(true);
            sec2.setEnabled(true);
            regggg.setCellSelectionEnabled(true);
            regggg.setCellSelectionEnabled(true);
            regggg.setFocusable(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void dashbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }

    }//GEN-LAST:event_dashbMouseClicked

    private void bg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg4MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }

    }//GEN-LAST:event_bg4MouseClicked

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
        } else if (regg.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            stid.setEnabled(true);
            load.setEnabled(true);
            search.setEnabled(true);
            selsemis.setEnabled(true);
            crscode.setEnabled(true);
            crsname.setEnabled(true);
            crscredit.setEnabled(true);
            sec.setEnabled(true);
            crstype.setEnabled(true);
            del.setEnabled(true);
            cde.setEnabled(true);
            crt.setEnabled(true);
            crdt.setEnabled(true);
            regcrs.setEnabled(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        menu.setVisible(true);
        menu2.setVisible(false);
        edt.setEnabled(true);
        loc.setEnabled(true);
        add.setEnabled(true);
        gur.setEnabled(true);
    }//GEN-LAST:event_profileMouseClicked

    private void etdsnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdsnidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etdsnidActionPerformed

    private void label9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label9MouseClicked

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
                            String sql = "select * from telogin where ID='" + usern.getText() + "' and password='" + cp.getText() + "' ";

                            try {
                                pst = conn.prepareStatement(sql);
                                rs = pst.executeQuery();
                                if (rs.next()) {
                                    String sql2 = "update telogin set password='" + np.getText() + "' where ID='" + usern.getText() + "' ";

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

    private void jpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }
    }//GEN-LAST:event_jpanelMouseClicked

    private void gurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gurMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            TGurdianinfo g = new TGurdianinfo();
            g.setVisible(true);
            edt.setEnabled(false);
            loc.setEnabled(false);
            add.setEnabled(false);
            gur.setEnabled(false);

            String sql = "select * from telogin,tegurdian where tegurdian.ID=telogin.ID and telogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String k = rs.getString("f_name");
                    TGurdianinfo.fname.setText(k);
                    String b = rs.getString("m_name");
                    TGurdianinfo.mname.setText(b);
                    String c = rs.getString("f_phone");
                    TGurdianinfo.fcon.setText(c);
                    String d = rs.getString("m_phone");
                    TGurdianinfo.mcon.setText(d);
                    String e = rs.getString("f_occupation");
                    TGurdianinfo.foccu.setText(e);
                    String f = rs.getString("m_occupation");
                    TGurdianinfo.moccu.setText(f);
                    String l = rs.getString("f_designation");
                    TGurdianinfo.fdes.setText(l);
                    String h = rs.getString("m_designation");
                    TGurdianinfo.mdes.setText(h);
                    String i = rs.getString("f_income");
                    TGurdianinfo.fin.setText(i);
                    String n = rs.getString("m_income");
                    TGurdianinfo.min.setText(n);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_gurMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            TAddress g = new TAddress();
            g.setVisible(true);
            edt.setEnabled(false);
            loc.setEnabled(false);
            gur.setEnabled(false);
            add.setEnabled(false);

            String sql = "select * from telogin,teaddress where teaddress.ID=telogin.ID and telogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String a = rs.getString("pr_add");
                    TAddress.pradd.setText(a);
                    String b = rs.getString("pe_add");
                    TAddress.peadd.setText(b);
                    String c = rs.getString("pr_post");
                    TAddress.prpost.setText(c);
                    String d = rs.getString("pe_post");
                    TAddress.pepost.setText(d);
                    String e = rs.getString("pr_police");
                    TAddress.prpo.setText(e);
                    String f = rs.getString("pe_police");
                    TAddress.pepo.setText(f);
                    String z = rs.getString("pr_city");
                    TAddress.prcity.setText(z);
                    String h = rs.getString("pe_city");
                    TAddress.pecity.setText(h);
                    String i = rs.getString("pr_div");
                    TAddress.prdiv.setText(i);
                    String j = rs.getString("pe_div");
                    TAddress.pediv.setText(j);
                    String k = rs.getString("pr_country");
                    TAddress.prcou.setText(k);
                    String l = rs.getString("pe_country");
                    TAddress.pecou.setText(l);
                    String m = rs.getString("Zip");
                    TAddress.przip.setText(m);
                    String n = rs.getString("Zip");
                    TAddress.pezip.setText(n);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_addMouseClicked

    private void locMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locMouseClicked
        if (menu2.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);
            edt.setEnabled(true);
            loc.setEnabled(true);
            add.setEnabled(true);
            gur.setEnabled(true);
        } else {
            TLocal g = new TLocal();
            g.setVisible(true);
            edt.setEnabled(false);
            gur.setEnabled(false);
            add.setEnabled(false);
            loc.setEnabled(false);

            String sql = "select * from telogin,telocal where telocal.ID=telogin.ID and telogin.ID=?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, usern.getText());
                rs = pst.executeQuery();
                if (rs.next()) {

                    String k = rs.getString("L_name");
                    TLocal.lname.setText(k);
                    String b = rs.getString("L_relation");
                    TLocal.lrel.setText(b);
                    String c = rs.getString("L_Phone");
                    TLocal.lcon.setText(c);
                    String d = rs.getString("L_add");
                    TLocal.ladd.setText(d);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_locMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        menu.setVisible(true);
        menu2.setVisible(false);
        edt.setEnabled(true);
        loc.setEnabled(true);
        add.setEnabled(true);
        gur.setEnabled(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void gurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gurActionPerformed

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

        String pero = "update teinfo set Nickname='" + nckn + "',Gender='" + adgender + "',Bloodgroup='" + bldgr + "', "
                + " MaritalStatus='" + marit + "',Religion='" + re + "', "
                + " Nationality='" + natio + "',nationalID='" + natioid + "',SocialnetID='" + socioid + "',Mobile='" + adphn + "', "
                + "Alternativeemail='" + ademail + "' where teinfo.ID='" + usern.getText() + "' ";

        try {
            PreparedStatement pst1 = conn.prepareStatement(pero);
            pst1.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_upperActionPerformed

    private void upgurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgurActionPerformed
        String focc = foccup.getText();
        String moccu = moccup.getText();
        String fdeg = fadeg.getText();
        String mdeg = madeg.getText();
        String fin = fain.getText();
        String min = mainc.getText();

        String guro = "update tegurdian set f_occupation='" + focc + "',m_occupation='" + moccu + "',f_designation='" + fdeg + "',m_designation='" + mdeg + "',"
                + "f_income='" + fin + "',m_income='" + min + "' where tegurdian.ID ='" + usern.getText() + "' ";

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

        String add = "update teaddress set pr_add='" + presadd + "',pe_add='" + peradd + "',pr_post='" + prespost + "', pe_post='" + perpost + "',"
                + " pr_police='" + prespol + "',  pe_police='" + perrpol + "', pr_city='" + presdis + "', pe_city='" + perdist + "',pr_div='" + presdiv + "', pe_div='" + perdiv + "',"
                + "pr_country='" + prescon + "', pe_country='" + percont + "' where teaddress.ID = '" + usern.getText() + "'";

        try {
            PreparedStatement pst1 = conn.prepareStatement(add);
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

        String l = "update telocal set L_name='" + lname + "', L_relation='" + lrel + "', L_Phone='" + lcon + "', L_add='" + ladd + "' where telocal.ID='" + usern.getText() + "'";

        try {
            PreparedStatement pst1 = conn.prepareStatement(l);
            pst1.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_uplocgActionPerformed

    private void etdgenfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdgenfActionPerformed
        gend = "Female";
    }//GEN-LAST:event_etdgenfActionPerformed

    private void etdgenmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etdgenmActionPerformed
        gend = "Male";
    }//GEN-LAST:event_etdgenmActionPerformed

    private void cdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdeActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        String id = stid.getText();
        String in = "select ID,Name from stinfo where stinfo.ID='" + id + "'";
        try {
            PreparedStatement pst10 = conn.prepareStatement(in);
            rs = pst10.executeQuery();
            if (rs.next()) {
                String a = rs.getString("ID");
                Studid.setText(a);
                String b = rs.getString("Name");
                Studname.setText(b);
                update_table();
                DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
                dm.setRowCount(0);
            }
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_loadActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String sql = "Select * from Course where Course_code='" + search.getText() + "' or Course_name='" + search.getText() + "'";
            PreparedStatement pst10 = conn.prepareStatement(sql);
            rs = pst10.executeQuery();
            cours.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_searchKeyReleased

    private void regcrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcrsActionPerformed
        String code = crscode.getText();
        String crname = crsname.getText();
        String credit = crscredit.getText();
        String crsec = sec.getSelectedItem().toString();
        String type = crstype.getSelectedItem().toString();
        String studnid = Studid.getText();
        String semis = selsemis.getSelectedItem().toString();

        String sql = "insert into registered_courses(ID,Semister,Course_code,Course_name,Course_credit,Sec,Course_Type) values(?,?,?,?,?,?,?) ";
        String sql3 = "insert into liveresult(ID,Semister,Course_code,Course_name,Sec) values(?,?,?,?,?)";
        String sql2 = "select Course_code,Course_name,Course_credit,Sec,Course_Type from registered_courses where ID ='" + studnid + "' and Semister='" + semis + "'";

        try {
            PreparedStatement pst10 = conn.prepareStatement(sql);
            PreparedStatement pst12 = conn.prepareStatement(sql3);
            pst10.setString(1, studnid);
            pst10.setString(2, semis);
            pst10.setString(3, code);
            pst10.setString(4, crname);
            pst10.setString(5, credit);
            pst10.setString(6, crsec);
            pst10.setString(7, type);
            pst10.execute();
            pst12.setString(1, studnid);
            pst12.setString(2, semis);
            pst12.setString(3, code);
            pst12.setString(4, crname);
            pst12.setString(5, crsec);
            pst12.execute();
            conn.close();
            conn = Connect.Studentdb();
            PreparedStatement pst11 = conn.prepareStatement(sql2);
            ResultSet rs1 = pst11.executeQuery();
            regtb.setModel(DbUtils.resultSetToTableModel(rs1));
            update_table();
            crscode.setText(" ");
            crsname.setText(" ");
            crscredit.setText(" ");
            sec.setSelectedIndex(0);
            crstype.setSelectedIndex(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_regcrsActionPerformed

    private void coursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursMouseClicked
        try {
            int row = cours.getSelectedRow();
            String tbclk = (cours.getModel().getValueAt(row, 0).toString());
            String sql = "select * from Course where Course_code='" + tbclk + "'";
            PreparedStatement pst11 = conn.prepareStatement(sql);
            rs = pst11.executeQuery();
            if (rs.next()) {
                String a = rs.getString("Course_code");
                crscode.setText(a);
                String b = rs.getString("Course_name");
                crsname.setText(b);
                String c = rs.getString("Course_credit");
                crscredit.setText(c);
            }
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_coursMouseClicked

    private void uppassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppassActionPerformed
        
    }//GEN-LAST:event_uppassActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sc = sec2.getSelectedItem().toString();
        String semi2 = semi.getSelectedItem().toString();
        String tech1 = nm.getText();

        String ld = "select ID,Sec,Semister,Teacher,Course_code,Course_Name from liveresult where Semister='" + semi2 + "' and Sec='" + sc + "' and Teacher='" + tech1 + "' and Course_code='" + course_cd.getSelectedItem().toString() + "'  order by ID";
        try {
            PreparedStatement pst11 = conn.prepareStatement(ld);
            ResultSet rs5 = pst11.executeQuery();
            regggg.setModel(DbUtils.resultSetToTableModel(rs5));

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        stid.setText("");
        selsemis.setSelectedIndex(0);
        sec.setSelectedIndex(0);
        crstype.setSelectedIndex(0);
        DefaultTableModel dm = (DefaultTableModel) regtb.getModel();
        dm.setRowCount(0);
        DefaultTableModel dm1 = (DefaultTableModel) cours.getModel();
        dm1.setRowCount(0);
        search.setText("Search By Code");
        Studid.setText("");
        Studname.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void reggggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reggggMouseClicked
        try {
            int row1 = regggg.getSelectedRow();
            String regg3 = (regggg.getModel().getValueAt(row1, 0).toString());
            String regg4 = (regggg.getModel().getValueAt(row1, 4).toString());
            String sql20 = "select Course_code,Course_name,Sec,ID,Semister,Q1,Q2,Q3,(Select AVG(Qavg) From (Values (Q1), (Q2), (Q3)) as Qavg(Qavg)) as Qavg,"
                    + "Mid,Midimp,Final,Fimp from liveresult where ID='" + regg3 + "' and Sec='" + sec2.getSelectedItem().toString() + "' and "
                    + "Course_code='" + regg4 + "'";

            PreparedStatement pst17 = conn.prepareStatement(sql20);
            ResultSet rs8 = pst17.executeQuery();
            if (rs8.next()) {
                String a = rs8.getString("Course_code");
                cd.setText(a);
                String b = rs8.getString("Course_name");
                cdt.setText(b);
                String c = rs8.getString("Sec");
                sc1.setText(c);
                String d = rs8.getString("ID");
                studi.setText(d);
                String e = rs8.getString("Semister");
                sem.setText(e);
                String f = rs8.getString("Q1");
                q1.setText(f);
                String g = rs8.getString("Q2");
                q2.setText(g);
                String h = rs8.getString("Q3");
                q3.setText(h);
                String i = rs8.getString("Qavg");
                qavg.setText(i);
                String j = rs8.getString("Mid");
                mid.setText(j);
                String k = rs8.getString("Midimp");
                mimp.setText(k);
                String l = rs8.getString("Final");
                fina.setText(l);
                String m = rs8.getString("Fimp");
                fimp.setText(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_reggggMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String studid1 = studi.getText();
        String sc3 = sc1.getText();
        String sem3 = sem.getText();
        String crc = cd.getText();
        String qu1 = q1.getText();
        String qu2 = q2.getText();
        String qu3 = q3.getText();

        String miimp = mimp.getText();
        String md = mid.getText();
        String fn = fina.getText();
        String fini = fimp.getText();

        String sql15 = "update liveresult set Q1='" + qu1 + "',Q2='" + qu2 + "',Q3='" + qu3 + "',Mid='" + md + "',Midimp='" + miimp + "',Final='" + fn + "',"
                + "Fimp='" + fini + "' where ID='" + studid1 + "' and Sec='" + sc3 + "' and Semister='" + sem3 + "' and Course_code='" + crc + "'";

        try {
            PreparedStatement pst15 = conn.prepareStatement(sql15);
            pst15.executeUpdate();
            System.out.println("Updated");
            conn.close();
            conn = Connect.Studentdb();
            String sql14 = "select Course_code,Course_name,Sec,ID,Semister,Q1,Q2,Q3,(Select AVG(Qavg) From (Values (Q1), (Q2), (Q3)) as Qavg(Qavg)) as Qavg,"
                    + "Mid,Midimp,Final,Fimp from liveresult where ID='" + studid1 + "' and Sec='" + sc3 + "' and Semister='" + sem3 + "' and Course_code='" + crc + "' ";
            PreparedStatement pst17 = conn.prepareStatement(sql14);
            ResultSet rs8 = pst17.executeQuery();
            if (rs8.next()) {

                String a = rs8.getString("Course_code");
                cd.setText(a);
                String b = rs8.getString("Course_name");
                cdt.setText(b);
                String c = rs8.getString("Sec");
                sc1.setText(c);
                String d = rs8.getString("ID");
                studi.setText(d);
                String e = rs8.getString("Semister");
                sem.setText(e);
                String f = rs8.getString("Q1");
                q1.setText(f);
                String g = rs8.getString("Q2");
                q2.setText(g);
                String h = rs8.getString("Q3");
                q3.setText(h);
                String i = rs8.getString("Qavg");
                qavg.setText(i);
                String j = rs8.getString("Mid");
                mid.setText(j);
                String k = rs8.getString("Midimp");
                mimp.setText(k);
                String l = rs8.getString("Final");
                fina.setText(l);
                String m = rs8.getString("Fimp");
                fimp.setText(m);
                String quavg = qavg.getText();
                String sql19 = "update liveresult set Qavg='" + quavg + "' where ID='" + studid1 + "' and Sec='" + sc3 + "' and Semister='" + sem3 + "' and Course_code='" + crc + "'";
                PreparedStatement pst19 = conn.prepareStatement(sql19);
                pst19.executeUpdate();
                System.out.println("v");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void semiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semiActionPerformed
        conn = Connect.Studentdb();

        String sem2 = semi.getSelectedItem().toString();

        String sql12 = "select DISTINCT Course_code from registered_courses where Semister='" + sem2 + "'and Teacher='" + nm.getText() + "' ";
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

    private void sec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec2ActionPerformed

    }//GEN-LAST:event_sec2ActionPerformed

    private void course_cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_cdActionPerformed
        conn = Connect.Studentdb();
        String sem2 = semi.getSelectedItem().toString();

        if (0 == course_cd.getItemCount()) {
            sec2.removeAllItems();
            course_cd.addItem("-----Select-----");
            sec2.addItem("-----Select-----");
        } else {
            String sql13 = "select DISTINCT Sec from registered_courses where Semister='" + sem2 + "'and Teacher='" + nm.getText() + "' and Course_code='" + course_cd.getSelectedItem().toString() + "' ";
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

    private void course_cdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_course_cdMouseClicked

    }//GEN-LAST:event_course_cdMouseClicked

    private void semiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semiMouseClicked

    }//GEN-LAST:event_semiMouseClicked

    private void sec5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sec5ActionPerformed

    private void q1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_q1KeyReleased

    }//GEN-LAST:event_q1KeyReleased

    private void semi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semi5ActionPerformed
        conn = Connect.Studentdb();

        String sem5 = semi5.getSelectedItem().toString();

        String sql12 = "select DISTINCT Course_code from registered_courses where Semister='" + sem5 + "'and Teacher='" + nm.getText() + "' ";
        try {
            PreparedStatement pst5 = conn.prepareStatement(sql12);
            ResultSet rs5 = pst5.executeQuery();
            sec5.removeAllItems();
            code5.removeAllItems();

            while (rs5.next()) {
                String a = rs5.getString("Course_code");
                code5.addItem(a);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_semi5ActionPerformed

    private void code5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code5ActionPerformed
        conn = Connect.Studentdb();
        String sem4 = semi5.getSelectedItem().toString();

        if (0 == code5.getItemCount()) {
            sec5.removeAllItems();
            code5.addItem("-----Select-----");
            sec5.addItem("-----Select-----");
        } else {
            String sql13 = "select DISTINCT Sec from registered_courses where Semister='" + sem4 + "'and Teacher='" + nm.getText() + "' and Course_code='" + code5.getSelectedItem().toString() + "' ";
            try {
                PreparedStatement pst18 = conn.prepareStatement(sql13);
                ResultSet rs18 = pst18.executeQuery();
                sec5.removeAllItems();
                while (rs18.next()) {

                    sec5.removeAllItems();
                    String b = rs18.getString("Sec");
                    sec5.addItem(b);

                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_code5ActionPerformed

    private void regggg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regggg1MouseClicked

        try {
            int row1 = regggg1.getSelectedRow();
            String regg3 = (regggg1.getModel().getValueAt(row1, 0).toString());
            String regg4 = (regggg1.getModel().getValueAt(row1, 4).toString());
            String sql20 = "select Course_code,Course_name,Sec,ID,Semister, Qavg,"
                    + "Mid,Midimp,Final,Fimp,Assignment,Presentation,Attendence from liveresult where ID='" + regg3 + "' and Sec='" + sec5.getSelectedItem().toString() + "' and "
                    + "Course_code='" + regg4 + "'";

            PreparedStatement pst17 = conn.prepareStatement(sql20);
            ResultSet rs8 = pst17.executeQuery();
            if (rs8.next()) {
                String a = rs8.getString("Course_code");
                cd1.setText(a);
                String b = rs8.getString("Course_name");
                cdt1.setText(b);
                String c = rs8.getString("Sec");
                sc2.setText(c);
                String d = rs8.getString("ID");
                studi1.setText(d);
                String e = rs8.getString("Semister");
                sem1.setText(e);
                String i = rs8.getString("Qavg");
                qavg1.setText(i);
                String j = rs8.getString("Mid");
                mid1.setText(j);
                String k = rs8.getString("Midimp");
                mimp1.setText(k);
                String l = rs8.getString("Final");
                fina1.setText(l);
                String m = rs8.getString("Fimp");
                fimp1.setText(m);
                String n = rs8.getString("Attendence");
                atten.setText(n);
                String o = rs8.getString("Presentation");
                assign.setText(o);
                String p = rs8.getString("Assignment");
                pre.setText(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_regggg1MouseClicked

    private void load2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load2ActionPerformed
        String sc5 = sec5.getSelectedItem().toString();
        String semi2 = semi5.getSelectedItem().toString();
        String tech1 = nm.getText();

        String ld = "select ID,Sec,Semister,Teacher,Course_code,Course_Name from liveresult where Semister='" + semi2 + "' and Sec='" + sc5 + "' and Teacher='" + tech1 + "' and Course_code='" + code5.getSelectedItem().toString() + "'  order by ID";
        try {
            PreparedStatement pst11 = conn.prepareStatement(ld);
            ResultSet rs25 = pst11.executeQuery();
            regggg1.setModel(DbUtils.resultSetToTableModel(rs25));

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_load2ActionPerformed

    private void markActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markActionPerformed
        String a = atten.getText();
        String b = assign.getText();
        String c = pre.getText();
        String d = qavg1.getText();
        String e = mid1.getText();
        String f = mimp1.getText();
        String g = fina1.getText();
        String h = fimp1.getText();

        float value1 = Float.parseFloat(a);
        float value2 = Float.parseFloat(b);
        float value3 = Float.parseFloat(c);
        float value4 = Float.parseFloat(d);
        float value5 = Float.parseFloat(e);
        float value6 = Float.parseFloat(f);
        float value7 = Float.parseFloat(g);
        float value8 = Float.parseFloat(h);

        float sum = value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8;
        String sum1 = "0";
        if (sum < 40) {
            sum1 = "F";
        } else if (sum > 39 && sum < 45) {
            sum1 = "2.00";
        } else if (sum > 44 && sum < 50) {
            sum1 = "2.25";
        } else if (sum > 49 && sum < 55) {
            sum1 = "2.50";
        } else if (sum > 54 && sum < 60) {
            sum1 = "2.75";
        } else if (sum > 59 && sum < 65) {
            sum1 = "3.00";
        } else if (sum > 64 && sum < 70) {
            sum1 = "3.25";
        } else if (sum > 69 && sum < 75) {
            sum1 = "3.50";
        } else if (sum > 74 && sum < 80) {
            sum1 = "3.75";
        } else if (sum > 79 && sum < 100) {
            sum1 = "4.00";
        }

        String sql = "update liveresult set Attendence='" + a + "',Assignment='" + b + "',Presentation='" + c + "' where ID='" + studi1.getText() + "' and Semister='" + sem1.getText() + "' and "
                + "Course_code='" + cd1.getText() + "' ";
        String sql2 = "update registered_courses set Grade_Point='" + sum1 + "' where ID='" + studi1.getText() + "' and Semister='" + sem1.getText() + "' and "
                + "Course_code='" + cd1.getText() + "' ";
        try {
            PreparedStatement pst22 = conn.prepareStatement(sql);
            pst22.executeUpdate();
            PreparedStatement pst24 = conn.prepareStatement(sql2);
            pst24.executeUpdate();
            System.out.println("k");
        } catch (SQLException ee) {
            System.out.println(ee);
        }
    }//GEN-LAST:event_markActionPerformed

    private void fina1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fina1MouseClicked
        JOptionPane.showMessageDialog(null, "Change Final marks in live Result");
    }//GEN-LAST:event_fina1MouseClicked

    private void fimp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fimp1MouseClicked
        JOptionPane.showMessageDialog(null, "Change Final Improvement marks in live Result");
    }//GEN-LAST:event_fimp1MouseClicked

    private void mimp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mimp1MouseClicked
        JOptionPane.showMessageDialog(null, "Change Mid Improvement marks in live Result");
    }//GEN-LAST:event_mimp1MouseClicked

    private void mid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mid1MouseClicked
        JOptionPane.showMessageDialog(null, "Change Midterm marks in live Result");
    }//GEN-LAST:event_mid1MouseClicked

    private void qavg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qavg1MouseClicked
        JOptionPane.showMessageDialog(null, "Change Quiz Average marks in live Result");
    }//GEN-LAST:event_qavg1MouseClicked

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        studi.setText("");
        sem.setText("");
        sc1.setText("");
        cd.setText("");
        cdt.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        qavg.setText("");
        mid.setText("");
        mimp.setText("");
        fina.setText("");
        fimp.setText("");
        semi.setSelectedIndex(0);
        course_cd.removeAllItems();
        course_cd.addItem("-----Seleset-----");
        sec2.removeAllItems();
        sec2.addItem("-----Seleset-----");
        DefaultTableModel dm = (DefaultTableModel) regggg.getModel();
        dm.setRowCount(0);
    }//GEN-LAST:event_reset2ActionPerformed

    private void studiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studiActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed

    }//GEN-LAST:event_semActionPerformed

    private void sc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc1ActionPerformed

    }//GEN-LAST:event_sc1ActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed

    }//GEN-LAST:event_cdActionPerformed

    private void rslt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rslt1ActionPerformed
        FullResult f = new FullResult();
        f.setVisible(true);
    }//GEN-LAST:event_rslt1ActionPerformed

    private void rslt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rslt1MouseEntered
        rslt1.setOpaque(true);
        rslt1.setForeground(new Color(51, 204, 255));
    }//GEN-LAST:event_rslt1MouseEntered

    private void rslt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rslt1MouseExited
        rslt1.setOpaque(false);
        rslt1.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_rslt1MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        studi1.setText("");
        sem1.setText("");
        sc2.setText("");
        cd1.setText("");
        cdt1.setText("");
        atten.setText("");
        assign.setText("");
        pre.setText("");
        qavg1.setText("");
        mid1.setText("");
        mimp1.setText("");
        fina1.setText("");
        fimp1.setText("");
        semi5.setSelectedIndex(0);
        code5.removeAllItems();
        code5.addItem("-----Seleset-----");
        sec5.removeAllItems();
        sec5.addItem("-----Seleset-----");
        DefaultTableModel dm4 = (DefaultTableModel) regggg1.getModel();
        dm4.setRowCount(0);

    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(tpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gurdian;
    private javax.swing.JLabel Sec;
    private javax.swing.JLabel Sec1;
    private javax.swing.JLabel Studid;
    private javax.swing.JLabel Studname;
    public static javax.swing.JButton add;
    private javax.swing.JToggleButton addr;
    private javax.swing.JPanel addresult;
    private javax.swing.JPanel adress;
    public static javax.swing.JLabel alem;
    private javax.swing.JTextField assign;
    private javax.swing.JTextField atten;
    private javax.swing.JLabel bg4;
    public static javax.swing.JLabel bld;
    public static javax.swing.JLabel bldd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cd;
    private javax.swing.JTextField cd1;
    private javax.swing.JToggleButton cde;
    private javax.swing.JTextField cdt;
    private javax.swing.JTextField cdt1;
    private javax.swing.JPanel chngp;
    private javax.swing.JButton chngpass;
    private javax.swing.JButton close;
    private javax.swing.JPasswordField cnp;
    private javax.swing.JComboBox<String> code5;
    private javax.swing.JTable cours;
    private javax.swing.JComboBox<String> course_cd;
    private javax.swing.JPasswordField cp;
    private javax.swing.JToggleButton crdt;
    private javax.swing.JTextField crscode;
    private javax.swing.JTextField crscredit;
    private javax.swing.JTextField crsname;
    private javax.swing.JComboBox<String> crstype;
    private javax.swing.JToggleButton crt;
    private javax.swing.JButton dash;
    private javax.swing.JPanel dashb;
    private javax.swing.JButton del;
    public static javax.swing.JLabel dob;
    public static javax.swing.JLabel dobb;
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
    private javax.swing.JComboBox<String> etdmari;
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
    private javax.swing.JTextField fimp;
    private javax.swing.JTextField fimp1;
    private javax.swing.JTextField fina;
    private javax.swing.JTextField fina1;
    public static javax.swing.JTextField fnam;
    public static javax.swing.JLabel fname2;
    public static javax.swing.JTextField foccup;
    public static javax.swing.JLabel gen;
    public static javax.swing.JButton gur;
    private javax.swing.JToggleButton gurd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
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
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
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
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel jpanel;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JButton lg;
    private javax.swing.JButton lgout;
    private javax.swing.JPanel live;
    private javax.swing.JButton load;
    private javax.swing.JButton load2;
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
    private javax.swing.JButton mark;
    public static javax.swing.JTextField mcont;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mid1;
    private javax.swing.JTextField mimp;
    private javax.swing.JTextField mimp1;
    private javax.swing.JButton minimize;
    public static javax.swing.JTextField mnam;
    public static javax.swing.JLabel mname2;
    public static javax.swing.JLabel mob;
    public static javax.swing.JTextField moccup;
    private javax.swing.JButton more;
    public static javax.swing.JLabel nam;
    public static javax.swing.JLabel name;
    public static javax.swing.JLabel national;
    public static javax.swing.JLabel nck;
    public static javax.swing.JLabel nid;
    public static javax.swing.JLabel nm;
    private javax.swing.JPasswordField np;
    private javax.swing.JPanel parent;
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
    private javax.swing.JTextField pre;
    private javax.swing.JButton pro;
    private javax.swing.JPanel profile;
    private javax.swing.JTextField prpo;
    private javax.swing.JTextField prpost;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField qavg;
    private javax.swing.JTextField qavg1;
    private javax.swing.JButton reg;
    private javax.swing.JButton regcrs;
    private javax.swing.JPanel regg;
    private javax.swing.JTable regggg;
    private javax.swing.JTable regggg1;
    private javax.swing.JTable regtb;
    private javax.swing.JButton reset2;
    public static javax.swing.JLabel rlgn;
    private javax.swing.JButton rslt;
    private javax.swing.JButton rslt1;
    private javax.swing.JTextField sc1;
    private javax.swing.JTextField sc2;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> sec;
    private javax.swing.JComboBox<String> sec2;
    private javax.swing.JComboBox<String> sec5;
    private javax.swing.JComboBox<String> selsemis;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField sem1;
    private javax.swing.JComboBox<String> semi;
    private javax.swing.JComboBox<String> semi5;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField studi;
    private javax.swing.JTextField studi1;
    private javax.swing.JButton upadd;
    private javax.swing.JButton upgur;
    private javax.swing.JButton uplocg;
    private javax.swing.JButton uppass;
    private javax.swing.JButton upper;
    public static javax.swing.JLabel us;
    public static javax.swing.JLabel usern;
    // End of variables declaration//GEN-END:variables
}

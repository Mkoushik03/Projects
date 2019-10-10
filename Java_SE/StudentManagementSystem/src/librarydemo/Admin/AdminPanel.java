package librarydemo.Admin;

import Main.Connect;
import Main.Welcome;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.*;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JTextField;
import librarydemo.Login;

public class AdminPanel extends javax.swing.JFrame {

    int lastX;
    int lastY;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;

    public AdminPanel() {
        initComponents();

        menu2.setVisible(false);
        Home.setVisible(false);
        conn = Connect.Studentdb();
        jDateChooser1.setVisible(false);
        jDateChooser2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        usern1 = new javax.swing.JLabel();
        lg1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        asetting = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        studentm = new javax.swing.JButton();
        greport = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        sbook = new javax.swing.JButton();
        bshelf = new javax.swing.JButton();
        mborrower = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        Greport = new javax.swing.JPanel();
        gsinfo = new javax.swing.JToggleButton();
        gbinfo = new javax.swing.JToggleButton();
        gthistory = new javax.swing.JToggleButton();
        GR = new javax.swing.JPanel();
        st = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sdep = new javax.swing.JTextField();
        sdep1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sbatch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        sbatch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tstinfo = new javax.swing.JTable();
        sall = new javax.swing.JButton();
        label12 = new java.awt.Label();
        BI = new javax.swing.JPanel();
        bisbn2 = new javax.swing.JLabel();
        bisbn = new javax.swing.JTextField();
        bisbn1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        bshelf3 = new javax.swing.JLabel();
        bshelf1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        bshelf2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        abookinfo = new javax.swing.JTable();
        ball = new javax.swing.JButton();
        label13 = new java.awt.Label();
        TH = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfrom = new com.toedter.calendar.JDateChooser();
        tsearch = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tto = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        atransaction = new javax.swing.JTable();
        tall = new javax.swing.JButton();
        label14 = new java.awt.Label();
        jLabel96 = new javax.swing.JLabel();
        bg6 = new javax.swing.JLabel();
        Bshelf = new javax.swing.JPanel();
        add = new javax.swing.JToggleButton();
        list = new javax.swing.JToggleButton();
        edit = new javax.swing.JToggleButton();
        request = new javax.swing.JToggleButton();
        bsel = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        label8 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        nbook = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel93 = new javax.swing.JLabel();
        pub = new javax.swing.JTextField();
        jSeparator62 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        edition = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        shelf = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        row = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        column = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        List = new javax.swing.JPanel();
        listT = new javax.swing.JScrollPane();
        listofbook = new javax.swing.JTable();
        label11 = new java.awt.Label();
        Edit = new javax.swing.JPanel();
        eisbn1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        esearch = new javax.swing.JButton();
        jSeparator32 = new javax.swing.JSeparator();
        eupdate = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        eisbn = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        enbook = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pub1 = new javax.swing.JTextField();
        jSeparator63 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        etitle = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        eauthor = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        eedition = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        eshelf = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        erow = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        ecolum = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        label9 = new java.awt.Label();
        Request = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbrequest = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        rtitle = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        rauthor = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        redition = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        rinsert = new javax.swing.JButton();
        rdelete = new javax.swing.JButton();
        jSeparator61 = new javax.swing.JSeparator();
        rpublicaton = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        label10 = new java.awt.Label();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Lsetting = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        cpass = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();
        npass = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        cnpass = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        lupdate = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        lfathername = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jSeparator51 = new javax.swing.JSeparator();
        lmothername = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel77 = new javax.swing.JLabel();
        phn = new javax.swing.JTextField();
        jSeparator53 = new javax.swing.JSeparator();
        lupdate2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jSeparator56 = new javax.swing.JSeparator();
        lemail1 = new javax.swing.JTextField();
        jSeparator57 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        lusername1 = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        lcpass1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jSeparator59 = new javax.swing.JSeparator();
        jLabel99 = new javax.swing.JLabel();
        bg7 = new javax.swing.JLabel();
        label15 = new java.awt.Label();
        Mborrower = new javax.swing.JPanel();
        bb = new javax.swing.JToggleButton();
        bl = new javax.swing.JToggleButton();
        rb = new javax.swing.JToggleButton();
        boro = new javax.swing.JPanel();
        BB = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        bstid = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        bdate = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        rdate = new com.toedter.calendar.JDateChooser();
        benter = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        bdep = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        bbatch = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        bbtitle = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        bok = new javax.swing.JButton();
        jSeparator54 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        bisbnno = new javax.swing.JTextField();
        label19 = new java.awt.Label();
        BL = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tborrower = new javax.swing.JTable();
        label20 = new java.awt.Label();
        RB = new javax.swing.JPanel();
        rstid = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        renter = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        treturnbook = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        label21 = new java.awt.Label();
        Sbook = new javax.swing.JPanel();
        sname = new javax.swing.JToggleButton();
        sisbn = new javax.swing.JToggleButton();
        sear = new javax.swing.JPanel();
        SN = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        sbookname = new javax.swing.JTextField();
        ssearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Sboookname = new javax.swing.JTable();
        label17 = new java.awt.Label();
        SIN = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        isbnno = new javax.swing.JTextField();
        isbnsearch = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        isbn1 = new javax.swing.JTextField();
        isbntitle = new javax.swing.JTextField();
        isbnauthour = new javax.swing.JTextField();
        isbnedition = new javax.swing.JTextField();
        isbntotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        label18 = new java.awt.Label();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        student = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        batch = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        addstudent = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        stdob = new com.toedter.calendar.JDateChooser();
        jLabel103 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        bg5 = new javax.swing.JLabel();
        label16 = new java.awt.Label();
        Dashboard = new javax.swing.JPanel();
        dashb = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        jLabel79 = new javax.swing.JLabel();
        bg4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        more = new javax.swing.JButton();
        nam = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        fathername = new javax.swing.JLabel();
        mothername = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
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

        usern1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usern1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_User_Male_30px_1.png"))); // NOI18N
        jPanel1.add(usern1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 120, 32));

        lg1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lg1.setText("Log Out");
        lg1.setBorder(null);
        lg1.setBorderPainted(false);
        lg1.setContentAreaFilled(false);
        lg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lg1MouseClicked(evt);
            }
        });
        lg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lg1ActionPerformed(evt);
            }
        });
        jPanel1.add(lg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, -1, 30));

        close.setBackground(new java.awt.Color(232, 17, 35));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_30px.png"))); // NOI18N
        close.setBorder(null);
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

        menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(78, 102, 102));
        home.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        home.setForeground(new java.awt.Color(240, 240, 240));
        home.setText("Dashboard");
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
        menu2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 40));

        asetting.setBackground(new java.awt.Color(78, 102, 102));
        asetting.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        asetting.setForeground(new java.awt.Color(240, 240, 240));
        asetting.setText("Librarian Setting");
        asetting.setBorderPainted(false);
        asetting.setContentAreaFilled(false);
        asetting.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        asetting.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        asetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                asettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                asettingMouseExited(evt);
            }
        });
        asetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asettingActionPerformed(evt);
            }
        });
        menu2.add(asetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 40));

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

        studentm.setBackground(new java.awt.Color(78, 102, 102));
        studentm.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        studentm.setForeground(new java.awt.Color(240, 240, 240));
        studentm.setText("Student Management");
        studentm.setBorderPainted(false);
        studentm.setContentAreaFilled(false);
        studentm.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        studentm.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        studentm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentmMouseExited(evt);
            }
        });
        studentm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentmActionPerformed(evt);
            }
        });
        menu2.add(studentm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 40));

        greport.setBackground(new java.awt.Color(78, 102, 102));
        greport.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        greport.setForeground(new java.awt.Color(240, 240, 240));
        greport.setText("Generate Report");
        greport.setBorderPainted(false);
        greport.setContentAreaFilled(false);
        greport.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        greport.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        greport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                greportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                greportMouseExited(evt);
            }
        });
        greport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greportActionPerformed(evt);
            }
        });
        menu2.add(greport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 40));

        logout.setBackground(new java.awt.Color(78, 102, 102));
        logout.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        logout.setForeground(new java.awt.Color(240, 240, 240));
        logout.setText("Logout");
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menu2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 40));

        sbook.setBackground(new java.awt.Color(78, 102, 102));
        sbook.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        sbook.setForeground(new java.awt.Color(240, 240, 240));
        sbook.setText("Search Book");
        sbook.setBorderPainted(false);
        sbook.setContentAreaFilled(false);
        sbook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sbook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sbookMouseExited(evt);
            }
        });
        sbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbookActionPerformed(evt);
            }
        });
        menu2.add(sbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 40));

        bshelf.setBackground(new java.awt.Color(78, 102, 102));
        bshelf.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        bshelf.setForeground(new java.awt.Color(240, 240, 240));
        bshelf.setText("Book Shelf");
        bshelf.setBorderPainted(false);
        bshelf.setContentAreaFilled(false);
        bshelf.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bshelf.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bshelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bshelfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bshelfMouseExited(evt);
            }
        });
        bshelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bshelfActionPerformed(evt);
            }
        });
        menu2.add(bshelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 40));

        mborrower.setBackground(new java.awt.Color(78, 102, 102));
        mborrower.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        mborrower.setForeground(new java.awt.Color(240, 240, 240));
        mborrower.setText("Manage Borrower");
        mborrower.setBorderPainted(false);
        mborrower.setContentAreaFilled(false);
        mborrower.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        mborrower.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mborrower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mborrowerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mborrowerMouseExited(evt);
            }
        });
        mborrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mborrowerActionPerformed(evt);
            }
        });
        menu2.add(mborrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        menu2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 715));

        jLabel14.setText("From");
        menu2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, 30));

        jPanel1.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 250, 715));

        Home.setBackground(new java.awt.Color(189, 212, 237));
        Home.setMinimumSize(new java.awt.Dimension(1246, 655));
        Home.setPreferredSize(new java.awt.Dimension(1246, 655));
        Home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HomeMouseDragged(evt);
            }
        });
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });
        Home.setLayout(new java.awt.CardLayout());

        Greport.setMinimumSize(new java.awt.Dimension(1246, 655));
        Greport.setPreferredSize(new java.awt.Dimension(1246, 655));
        Greport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(gsinfo);
        gsinfo.setText("Student Information");
        gsinfo.setBorder(null);
        gsinfo.setBorderPainted(false);
        gsinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gsinfoMouseClicked(evt);
            }
        });
        gsinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsinfoActionPerformed(evt);
            }
        });
        Greport.add(gsinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 160, 40));

        buttonGroup1.add(gbinfo);
        gbinfo.setText("Book Information");
        gbinfo.setBorder(null);
        gbinfo.setBorderPainted(false);
        gbinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gbinfoMouseClicked(evt);
            }
        });
        gbinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbinfoActionPerformed(evt);
            }
        });
        Greport.add(gbinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 160, 40));

        buttonGroup1.add(gthistory);
        gthistory.setText("Transaction History");
        gthistory.setBorder(null);
        gthistory.setBorderPainted(false);
        gthistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gthistoryMouseClicked(evt);
            }
        });
        gthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gthistoryActionPerformed(evt);
            }
        });
        Greport.add(gthistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 160, 40));

        GR.setPreferredSize(new java.awt.Dimension(1246, 535));
        GR.setLayout(new java.awt.CardLayout());

        st.setPreferredSize(new java.awt.Dimension(1244, 535));
        st.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Department");
        st.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        st.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, 5));

        sdep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sdep.setBorder(null);
        sdep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdepMouseClicked(evt);
            }
        });
        sdep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sdepKeyReleased(evt);
            }
        });
        st.add(sdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 30));

        sdep1.setBackground(new java.awt.Color(255, 204, 204));
        sdep1.setText("Generate Dep");
        sdep1.setBorder(null);
        sdep1.setBorderPainted(false);
        sdep1.setRequestFocusEnabled(false);
        sdep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdep1ActionPerformed(evt);
            }
        });
        st.add(sdep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Batch");
        st.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 30));

        sbatch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sbatch.setBorder(null);
        sbatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbatchMouseClicked(evt);
            }
        });
        sbatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbatchKeyReleased(evt);
            }
        });
        st.add(sbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        st.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 5));

        sbatch1.setBackground(new java.awt.Color(255, 204, 204));
        sbatch1.setText("Generate Info");
        sbatch1.setBorder(null);
        sbatch1.setBorderPainted(false);
        sbatch1.setRequestFocusEnabled(false);
        sbatch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbatch1ActionPerformed(evt);
            }
        });
        st.add(sbatch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 30));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tstinfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tstinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Email", "Batch", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tstinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tstinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tstinfo);
        if (tstinfo.getColumnModel().getColumnCount() > 0) {
            tstinfo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tstinfo.getColumnModel().getColumn(1).setPreferredWidth(10);
            tstinfo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tstinfo.getColumnModel().getColumn(3).setPreferredWidth(10);
            tstinfo.getColumnModel().getColumn(4).setPreferredWidth(10);
            tstinfo.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        st.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 910, 340));

        sall.setBackground(new java.awt.Color(255, 204, 204));
        sall.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        sall.setText("Generate All Student Info");
        sall.setBorder(null);
        sall.setBorderPainted(false);
        sall.setRequestFocusEnabled(false);
        sall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sallMouseClicked(evt);
            }
        });
        sall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sallActionPerformed(evt);
            }
        });
        st.add(sall, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 620, 40));

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(new java.awt.Color(0, 0, 0));
        label12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label12MouseClicked(evt);
            }
        });
        st.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 1246, 40));

        GR.add(st, "card2");

        BI.setPreferredSize(new java.awt.Dimension(1244, 530));
        BI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bisbn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bisbn2.setText("ISBN");
        BI.add(bisbn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 20));

        bisbn.setBorder(null);
        bisbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bisbnMouseClicked(evt);
            }
        });
        bisbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bisbnKeyReleased(evt);
            }
        });
        BI.add(bisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 30));

        bisbn1.setBackground(new java.awt.Color(255, 204, 204));
        bisbn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bisbn1.setText("Generate By ISBN");
        bisbn1.setBorder(null);
        bisbn1.setBorderPainted(false);
        bisbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bisbn1MouseClicked(evt);
            }
        });
        BI.add(bisbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        BI.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 5));

        bshelf3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bshelf3.setText("Book Shelf");
        BI.add(bshelf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 20));

        bshelf1.setBorder(null);
        bshelf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bshelf1MouseClicked(evt);
            }
        });
        bshelf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bshelf1KeyReleased(evt);
            }
        });
        BI.add(bshelf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        BI.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 5));

        bshelf2.setBackground(new java.awt.Color(255, 204, 204));
        bshelf2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bshelf2.setText("Generate by Bookshelf");
        bshelf2.setBorder(null);
        bshelf2.setBorderPainted(false);
        bshelf2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bshelf2MouseClicked(evt);
            }
        });
        BI.add(bshelf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 30));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        abookinfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        abookinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Book Title", "Author", "Edition", "Shelf", "Row", "Colum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        abookinfo.setIntercellSpacing(new java.awt.Dimension(5, 5));
        abookinfo.setRowHeight(20);
        abookinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abookinfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(abookinfo);
        if (abookinfo.getColumnModel().getColumnCount() > 0) {
            abookinfo.getColumnModel().getColumn(0).setResizable(false);
            abookinfo.getColumnModel().getColumn(0).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(1).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(2).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(3).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(4).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(5).setResizable(false);
            abookinfo.getColumnModel().getColumn(5).setPreferredWidth(10);
            abookinfo.getColumnModel().getColumn(6).setResizable(false);
            abookinfo.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        BI.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 930, 380));

        ball.setBackground(new java.awt.Color(255, 204, 204));
        ball.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        ball.setText("Generate All Book Info");
        ball.setBorder(null);
        ball.setBorderPainted(false);
        ball.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ballMouseClicked(evt);
            }
        });
        BI.add(ball, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 600, 40));

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
        BI.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        GR.add(BI, "card3");

        TH.setPreferredSize(new java.awt.Dimension(1244, 530));
        TH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("From");
        TH.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 70, 30));
        TH.add(tfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 220, 30));

        tsearch.setBackground(new java.awt.Color(255, 204, 204));
        tsearch.setText("Search");
        tsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tsearchMouseClicked(evt);
            }
        });
        TH.add(tsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("To");
        TH.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 40, 30));
        TH.add(tto, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 240, 30));

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        atransaction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        atransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "isbn", "Name", "Department", "Batch", "Borrow Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        atransaction.setIntercellSpacing(new java.awt.Dimension(5, 5));
        atransaction.setRowHeight(20);
        atransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atransactionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(atransaction);
        if (atransaction.getColumnModel().getColumnCount() > 0) {
            atransaction.getColumnModel().getColumn(0).setResizable(false);
            atransaction.getColumnModel().getColumn(1).setResizable(false);
            atransaction.getColumnModel().getColumn(1).setPreferredWidth(10);
            atransaction.getColumnModel().getColumn(2).setPreferredWidth(10);
            atransaction.getColumnModel().getColumn(3).setResizable(false);
            atransaction.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        TH.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 1070, 270));

        tall.setBackground(new java.awt.Color(255, 204, 204));
        tall.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tall.setText("Generate Report By Transaction History");
        tall.setBorder(null);
        tall.setBorderPainted(false);
        tall.setRequestFocusEnabled(false);
        tall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tallMouseClicked(evt);
            }
        });
        TH.add(tall, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 550, 40));

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(new java.awt.Color(0, 0, 0));
        label14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label14MouseClicked(evt);
            }
        });
        TH.add(label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 1246, 40));

        GR.add(TH, "card4");

        Greport.add(GR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 102, 102));
        jLabel96.setText("Generate Report");
        Greport.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 180, 30));

        bg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        Greport.add(bg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(Greport, "card2");

        Bshelf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup4.add(add);
        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("Add New Book");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Bshelf.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 180, 35));

        buttonGroup4.add(list);
        list.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        list.setText("List Of Books");
        list.setBorder(null);
        list.setBorderPainted(false);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        Bshelf.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 180, 35));

        buttonGroup4.add(edit);
        edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        edit.setText("Edit book Info");
        edit.setBorder(null);
        edit.setBorderPainted(false);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        Bshelf.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 180, 35));

        buttonGroup4.add(request);
        request.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        request.setText("Book Request");
        request.setBorder(null);
        request.setBorderPainted(false);
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
        });
        request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestActionPerformed(evt);
            }
        });
        Bshelf.add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 180, 35));

        bsel.setLayout(new java.awt.CardLayout());

        Add.setMinimumSize(new java.awt.Dimension(1246, 535));
        Add.setPreferredSize(new java.awt.Dimension(1246, 535));
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(null);
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        Add.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 80, 40));

        insert.setBackground(new java.awt.Color(255, 204, 204));
        insert.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        insert.setText("Insert");
        insert.setBorder(null);
        insert.setBorderPainted(false);
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        Add.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 180, 40));

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
        Add.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel48.setText("ISBN NO:");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 22));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel49.setText("Number Of Book:");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 22));

        isbn.setBorder(null);
        isbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbnMouseClicked(evt);
            }
        });
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });
        jPanel4.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 30));

        nbook.setBorder(null);
        nbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nbookMouseClicked(evt);
            }
        });
        jPanel4.add(nbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 30));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 5));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 240, 5));

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel93.setText("Publication:");
        jPanel4.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        pub.setBorder(null);
        pub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pubMouseClicked(evt);
            }
        });
        jPanel4.add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        jSeparator62.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator62.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        Add.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 310, 320));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setText("Book Title:");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 22));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel51.setText("Author Name:");
        jPanel10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 22));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel52.setText("Edition:");
        jPanel10.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 22));

        title.setBorder(null);
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
        });
        jPanel10.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        author.setBorder(null);
        author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorMouseClicked(evt);
            }
        });
        jPanel10.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        edition.setBorder(null);
        edition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editionMouseClicked(evt);
            }
        });
        jPanel10.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 5));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 5));

        Add.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 310, 320));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel53.setText("Book Shelf No:");
        jPanel14.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 125, 22));

        shelf.setBorder(null);
        shelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shelfMouseClicked(evt);
            }
        });
        jPanel14.add(shelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel54.setText("Row No:");
        jPanel14.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 125, 22));

        row.setBorder(null);
        row.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rowMouseClicked(evt);
            }
        });
        jPanel14.add(row, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 5));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel55.setText("Colum No:");
        jPanel14.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 125, 22));

        column.setBorder(null);
        column.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                columnMouseClicked(evt);
            }
        });
        jPanel14.add(column, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        jSeparator31.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator31.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 5));

        Add.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 310, 320));

        bsel.add(Add, "card5");

        List.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTMouseClicked(evt);
            }
        });

        listofbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "N.O.Book", "Book Title", "Author Name", "Edition", "Book Shelf", "Row", "Colum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listofbook.setIntercellSpacing(new java.awt.Dimension(10, 5));
        listofbook.setRowHeight(20);
        listofbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listofbookMouseClicked(evt);
            }
        });
        listT.setViewportView(listofbook);
        if (listofbook.getColumnModel().getColumnCount() > 0) {
            listofbook.getColumnModel().getColumn(0).setResizable(false);
            listofbook.getColumnModel().getColumn(0).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(1).setResizable(false);
            listofbook.getColumnModel().getColumn(1).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(2).setResizable(false);
            listofbook.getColumnModel().getColumn(2).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(3).setResizable(false);
            listofbook.getColumnModel().getColumn(3).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(4).setResizable(false);
            listofbook.getColumnModel().getColumn(4).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(5).setResizable(false);
            listofbook.getColumnModel().getColumn(5).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(6).setResizable(false);
            listofbook.getColumnModel().getColumn(6).setPreferredWidth(10);
            listofbook.getColumnModel().getColumn(7).setResizable(false);
            listofbook.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        List.add(listT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1160, 440));

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
        List.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 1246, 40));

        bsel.add(List, "card4");

        Edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eisbn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eisbn1.setBorder(null);
        eisbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eisbn1MouseClicked(evt);
            }
        });
        Edit.add(eisbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 240, 30));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("ISBN NO:");
        Edit.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 22));

        esearch.setBackground(new java.awt.Color(255, 204, 204));
        esearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        esearch.setText("Search");
        esearch.setBorder(null);
        esearch.setBorderPainted(false);
        esearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esearchMouseClicked(evt);
            }
        });
        Edit.add(esearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 70, 30));

        jSeparator32.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator32.setForeground(new java.awt.Color(0, 0, 0));
        Edit.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 240, 5));

        eupdate.setBackground(new java.awt.Color(255, 204, 204));
        eupdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        eupdate.setText("Update");
        eupdate.setBorder(null);
        eupdate.setBorderPainted(false);
        eupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eupdateMouseClicked(evt);
            }
        });
        eupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eupdateActionPerformed(evt);
            }
        });
        Edit.add(eupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 350, 40));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel57.setText("ISBN No:");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 22));

        eisbn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eisbn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eisbn.setBorder(null);
        eisbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eisbnMouseClicked(evt);
            }
        });
        jPanel15.add(eisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        jSeparator33.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator33.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel58.setText("Number of Book:");
        jPanel15.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 22));

        enbook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        enbook.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enbook.setBorder(null);
        enbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enbookMouseClicked(evt);
            }
        });
        jPanel15.add(enbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        jSeparator40.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator40.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 5));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Publication:");
        jPanel15.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 22));

        pub1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel15.add(pub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        jSeparator63.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 5));

        Edit.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 310, 320));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel59.setText("Book Title:");
        jPanel16.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 22));

        etitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etitle.setBorder(null);
        etitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etitleMouseClicked(evt);
            }
        });
        jPanel16.add(etitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        jSeparator34.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator34.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel60.setText("Author Name:");
        jPanel16.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 22));

        eauthor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eauthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eauthor.setBorder(null);
        eauthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eauthorMouseClicked(evt);
            }
        });
        jPanel16.add(eauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        jSeparator35.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator35.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 5));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel61.setText("Edition:");
        jPanel16.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 22));

        eedition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eedition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eedition.setBorder(null);
        eedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eeditionMouseClicked(evt);
            }
        });
        jPanel16.add(eedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        jSeparator36.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator36.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 5));

        Edit.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 310, 320));

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel62.setText("Book Shelf No:");
        jPanel17.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 22));

        eshelf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eshelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eshelf.setBorder(null);
        eshelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eshelfMouseClicked(evt);
            }
        });
        jPanel17.add(eshelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        jSeparator37.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator37.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 5));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel63.setText("Row No:");
        jPanel17.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 22));

        erow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        erow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        erow.setBorder(null);
        erow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                erowMouseClicked(evt);
            }
        });
        jPanel17.add(erow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 30));

        jSeparator38.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator38.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 5));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel64.setText("Colum No:");
        jPanel17.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 22));

        ecolum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ecolum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ecolum.setBorder(null);
        ecolum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ecolumMouseClicked(evt);
            }
        });
        jPanel17.add(ecolum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));

        jSeparator39.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator39.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 5));

        Edit.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 310, 320));

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
        Edit.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        bsel.add(Edit, "card3");

        Request.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane8MouseClicked(evt);
            }
        });

        tbrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Author", "Edition", "Publication"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbrequest.setIntercellSpacing(new java.awt.Dimension(1, 5));
        tbrequest.setRowHeight(20);
        tbrequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbrequestMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbrequest);
        if (tbrequest.getColumnModel().getColumnCount() > 0) {
            tbrequest.getColumnModel().getColumn(0).setResizable(false);
            tbrequest.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbrequest.getColumnModel().getColumn(1).setResizable(false);
            tbrequest.getColumnModel().getColumn(1).setPreferredWidth(10);
            tbrequest.getColumnModel().getColumn(2).setResizable(false);
            tbrequest.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        Request.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 510, 360));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel66.setText("Title:");
        Request.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 65, 50, 22));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel67.setText("Author:");
        Request.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 115, 70, 22));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel68.setText("Edition:");
        Request.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 165, 70, 22));

        rtitle.setEditable(false);
        rtitle.setBackground(new java.awt.Color(255, 255, 255));
        rtitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rtitle.setBorder(null);
        rtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rtitleMouseClicked(evt);
            }
        });
        Request.add(rtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 290, 30));

        jSeparator42.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator42.setForeground(new java.awt.Color(0, 0, 0));
        Request.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 290, 5));

        rauthor.setEditable(false);
        rauthor.setBackground(new java.awt.Color(255, 255, 255));
        rauthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rauthor.setBorder(null);
        rauthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rauthorMouseClicked(evt);
            }
        });
        Request.add(rauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 290, 30));

        jSeparator43.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator43.setForeground(new java.awt.Color(0, 0, 0));
        Request.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 290, 5));

        redition.setEditable(false);
        redition.setBackground(new java.awt.Color(255, 255, 255));
        redition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        redition.setBorder(null);
        redition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reditionMouseClicked(evt);
            }
        });
        redition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reditionActionPerformed(evt);
            }
        });
        Request.add(redition, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 290, 30));

        jSeparator44.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator44.setForeground(new java.awt.Color(0, 0, 0));
        Request.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 290, 5));

        rinsert.setBackground(new java.awt.Color(255, 204, 204));
        rinsert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rinsert.setText("Insert");
        rinsert.setBorder(null);
        rinsert.setBorderPainted(false);
        rinsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rinsertMouseClicked(evt);
            }
        });
        Request.add(rinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 35));

        rdelete.setBackground(new java.awt.Color(255, 204, 204));
        rdelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdelete.setText("Delete");
        rdelete.setBorder(null);
        rdelete.setBorderPainted(false);
        rdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdeleteMouseClicked(evt);
            }
        });
        Request.add(rdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 160, 35));

        jSeparator61.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator61.setForeground(new java.awt.Color(0, 0, 0));
        Request.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 290, 5));

        rpublicaton.setEditable(false);
        rpublicaton.setBackground(new java.awt.Color(255, 255, 255));
        rpublicaton.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rpublicaton.setBorder(null);
        rpublicaton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rpublicatonMouseClicked(evt);
            }
        });
        Request.add(rpublicaton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 290, 30));

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel92.setText("Publication:");
        Request.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 215, 100, 22));

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
        Request.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 1246, 40));

        bsel.add(Request, "card2");

        Bshelf.add(bsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 102, 102));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Book Shelf");
        Bshelf.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel98.setText("jLabel61");
        Bshelf.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(Bshelf, "card6");

        Lsetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Current Password:");
        jPanel11.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 240, 30));

        cpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpass.setBorder(null);
        cpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpassMouseClicked(evt);
            }
        });
        jPanel11.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, 30));

        jSeparator48.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator48.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 240, 5));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("New Password:");
        jPanel11.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 30));

        npass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        npass.setBorder(null);
        npass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                npassMouseClicked(evt);
            }
        });
        jPanel11.add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));

        jSeparator49.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator49.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 5));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Confirm New Password:");
        jPanel11.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 30));

        cnpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cnpass.setBorder(null);
        cnpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnpassMouseClicked(evt);
            }
        });
        jPanel11.add(cnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, 30));

        jSeparator50.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator50.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, 5));

        lupdate.setBackground(new java.awt.Color(255, 204, 204));
        lupdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lupdate.setText("Update");
        lupdate.setBorder(null);
        lupdate.setBorderPainted(false);
        lupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupdateMouseClicked(evt);
            }
        });
        jPanel11.add(lupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 250, 50));

        Lsetting.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 330, 390));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Father's Name");
        jPanel12.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 20));

        lfathername.setEditable(false);
        lfathername.setBackground(new java.awt.Color(255, 255, 255));
        lfathername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lfathername.setBorder(null);
        lfathername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lfathernameMouseClicked(evt);
            }
        });
        jPanel12.add(lfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 240, 30));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Mother's Name");
        jPanel12.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 20));

        jSeparator51.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator51.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, 5));

        lmothername.setEditable(false);
        lmothername.setBackground(new java.awt.Color(255, 255, 255));
        lmothername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lmothername.setBorder(null);
        lmothername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lmothernameMouseClicked(evt);
            }
        });
        jPanel12.add(lmothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 240, 30));

        jSeparator52.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator52.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 5));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Phone");
        jPanel12.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 30));

        phn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phn.setBorder(null);
        phn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phnMouseClicked(evt);
            }
        });
        jPanel12.add(phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 30));

        jSeparator53.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator53.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, 5));

        lupdate2.setBackground(new java.awt.Color(255, 204, 204));
        lupdate2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lupdate2.setText("Update");
        lupdate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lupdate2MouseClicked(evt);
            }
        });
        jPanel12.add(lupdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 240, 50));

        Lsetting.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 330, 390));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Name:");
        jPanel13.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 20));

        lname1.setEditable(false);
        lname1.setBackground(new java.awt.Color(255, 255, 255));
        lname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname1.setBorder(null);
        lname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lname1MouseClicked(evt);
            }
        });
        jPanel13.add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 240, 30));

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Email:");
        jPanel13.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, 20));

        jSeparator56.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, 5));

        lemail1.setEditable(false);
        lemail1.setBackground(new java.awt.Color(255, 255, 255));
        lemail1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lemail1.setBorder(null);
        lemail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lemail1MouseClicked(evt);
            }
        });
        jPanel13.add(lemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 30));

        jSeparator57.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator57.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, 5));

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Username:");
        jPanel13.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));

        lusername1.setEditable(false);
        lusername1.setBackground(new java.awt.Color(255, 255, 255));
        lusername1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lusername1.setBorder(null);
        lusername1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lusername1MouseClicked(evt);
            }
        });
        jPanel13.add(lusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 30));

        jSeparator58.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator58.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 240, 5));

        lcpass1.setEditable(false);
        lcpass1.setBackground(new java.awt.Color(255, 255, 255));
        lcpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcpass1.setBorder(null);
        lcpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lcpass1MouseClicked(evt);
            }
        });
        jPanel13.add(lcpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 30));

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Current Password:");
        jPanel13.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, 30));

        jSeparator59.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator59.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 5));

        Lsetting.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 330, 390));

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 102, 102));
        jLabel99.setText("Librarian Setting");
        Lsetting.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 180, 30));

        bg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        Lsetting.add(bg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(new java.awt.Color(0, 0, 0));
        label15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label15MouseClicked(evt);
            }
        });
        Lsetting.add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        Home.add(Lsetting, "card3");

        Mborrower.setMinimumSize(new java.awt.Dimension(1246, 655));
        Mborrower.setPreferredSize(new java.awt.Dimension(1246, 655));
        Mborrower.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup3.add(bb);
        bb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bb.setText("Borrow Book ");
        bb.setBorder(null);
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        Mborrower.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 200, 40));

        buttonGroup3.add(bl);
        bl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bl.setText("Borrower's  List");
        bl.setBorder(null);
        bl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blActionPerformed(evt);
            }
        });
        Mborrower.add(bl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 200, 40));

        buttonGroup3.add(rb);
        rb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb.setText("Return Book");
        rb.setBorder(null);
        rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActionPerformed(evt);
            }
        });
        Mborrower.add(rb, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 200, 40));

        boro.setMinimumSize(new java.awt.Dimension(1246, 535));
        boro.setPreferredSize(new java.awt.Dimension(1246, 535));
        boro.setLayout(new java.awt.CardLayout());

        BB.setMinimumSize(new java.awt.Dimension(1246, 535));
        BB.setPreferredSize(new java.awt.Dimension(1246, 535));
        BB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Borrower's Info", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Student ID:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, 280, 22));

        bstid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bstid.setBorder(null);
        bstid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bstidMouseClicked(evt);
            }
        });
        jPanel5.add(bstid, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 67, 280, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 98, 279, 5));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Borrow Date:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 22));

        bdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdateMouseClicked(evt);
            }
        });
        jPanel5.add(bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Return Date:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 22));

        rdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdateMouseClicked(evt);
            }
        });
        jPanel5.add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 30));

        benter.setBackground(new java.awt.Color(255, 204, 204));
        benter.setText("Enter");
        benter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                benterMouseClicked(evt);
            }
        });
        jPanel5.add(benter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 35));

        BB.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 340));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Auto Form Fill", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Name:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, 22));

        bname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bname.setBorder(null);
        bname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnameMouseClicked(evt);
            }
        });
        jPanel6.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 280, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 280, 5));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Department:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 22));

        bdep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bdep.setBorder(null);
        bdep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdepMouseClicked(evt);
            }
        });
        jPanel6.add(bdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 30));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 5));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Batch:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, 22));

        bbatch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bbatch.setBorder(null);
        bbatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbatchMouseClicked(evt);
            }
        });
        jPanel6.add(bbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 30));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 280, 5));

        BB.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 340, 340));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Book ID", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Book Title");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 22));

        bbtitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bbtitle.setBorder(null);
        bbtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbtitleMouseClicked(evt);
            }
        });
        jPanel7.add(bbtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 30));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 290, 5));

        bok.setBackground(new java.awt.Color(255, 204, 204));
        bok.setText("OK");
        bok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bokMouseClicked(evt);
            }
        });
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });
        jPanel7.add(bok, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 50));

        jSeparator54.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator54.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 5));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("ISBN NO:");
        jPanel7.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 22));

        bisbnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bisbnno.setBorder(null);
        bisbnno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bisbnnoMouseClicked(evt);
            }
        });
        jPanel7.add(bisbnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, 30));

        BB.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 370, 340));

        label19.setAlignment(java.awt.Label.CENTER);
        label19.setBackground(new java.awt.Color(0, 0, 0));
        label19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label19.setForeground(new java.awt.Color(255, 255, 255));
        label19.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label19MouseClicked(evt);
            }
        });
        BB.add(label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        boro.add(BB, "card4");

        BL.setMinimumSize(new java.awt.Dimension(1246, 535));
        BL.setPreferredSize(new java.awt.Dimension(1246, 535));
        BL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseClicked(evt);
            }
        });

        tborrower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tborrower.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Batch", "Department", "ISBN No", "Borrow Data", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tborrower.setIntercellSpacing(new java.awt.Dimension(1, 5));
        tborrower.setRowHeight(20);
        tborrower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tborrowerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tborrower);
        if (tborrower.getColumnModel().getColumnCount() > 0) {
            tborrower.getColumnModel().getColumn(0).setResizable(false);
            tborrower.getColumnModel().getColumn(0).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(1).setResizable(false);
            tborrower.getColumnModel().getColumn(1).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(2).setResizable(false);
            tborrower.getColumnModel().getColumn(2).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(3).setResizable(false);
            tborrower.getColumnModel().getColumn(3).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(4).setResizable(false);
            tborrower.getColumnModel().getColumn(4).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(5).setResizable(false);
            tborrower.getColumnModel().getColumn(5).setPreferredWidth(10);
            tborrower.getColumnModel().getColumn(6).setResizable(false);
            tborrower.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        BL.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 1120, 420));

        label20.setAlignment(java.awt.Label.CENTER);
        label20.setBackground(new java.awt.Color(0, 0, 0));
        label20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label20.setForeground(new java.awt.Color(255, 255, 255));
        label20.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label20MouseClicked(evt);
            }
        });
        BL.add(label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        boro.add(BL, "card3");

        RB.setMinimumSize(new java.awt.Dimension(1246, 535));
        RB.setPreferredSize(new java.awt.Dimension(1246, 535));
        RB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rstid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rstid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rstid.setText("Enter Student ID");
        rstid.setBorder(null);
        rstid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rstidMouseClicked(evt);
            }
        });
        rstid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rstidKeyReleased(evt);
            }
        });
        RB.add(rstid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, 40));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Student ID:");
        RB.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 40));
        RB.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 10));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Return Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel36.setText("ISBN NO:");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, -1, 20));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel37.setText("Borrow Date:");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, 20));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel38.setText("Return Date:");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, 20));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel39.setText("Today Date:");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, 20));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel40.setText("Late Days:");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 235, -1, 20));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel41.setText("Late Fee:");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, 20));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 30));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 30));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 30));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 30));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 190, 30));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, 5));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, 5));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 190, 5));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 190, 5));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 5));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, 5));

        renter.setBackground(new java.awt.Color(255, 204, 204));
        renter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        renter.setText("Enter");
        renter.setBorder(null);
        renter.setBorderPainted(false);
        renter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renterMouseClicked(evt);
            }
        });
        renter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renterActionPerformed(evt);
            }
        });
        jPanel8.add(renter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 280, 40));

        RB.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 350, 400));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Borrow Books", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane6MouseClicked(evt);
            }
        });

        treturnbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Borrow Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        treturnbook.setIntercellSpacing(new java.awt.Dimension(1, 5));
        treturnbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treturnbookMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(treturnbook);
        if (treturnbook.getColumnModel().getColumnCount() > 0) {
            treturnbook.getColumnModel().getColumn(0).setResizable(false);
            treturnbook.getColumnModel().getColumn(0).setPreferredWidth(10);
            treturnbook.getColumnModel().getColumn(1).setResizable(false);
            treturnbook.getColumnModel().getColumn(1).setPreferredWidth(10);
            treturnbook.getColumnModel().getColumn(2).setResizable(false);
            treturnbook.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 460, 370));

        RB.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 480, 400));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        RB.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 30));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        RB.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 270, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        RB.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 250, 120, -1));

        label21.setAlignment(java.awt.Label.CENTER);
        label21.setBackground(new java.awt.Color(0, 0, 0));
        label21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label21.setForeground(new java.awt.Color(255, 255, 255));
        label21.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label21MouseClicked(evt);
            }
        });
        RB.add(label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        boro.add(RB, "card2");

        Mborrower.add(boro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        Home.add(Mborrower, "card4");

        Sbook.setMinimumSize(new java.awt.Dimension(1246, 655));
        Sbook.setPreferredSize(new java.awt.Dimension(1246, 655));
        Sbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(sname);
        sname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sname.setText("Search By Name");
        sname.setBorder(null);
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });
        Sbook.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 220, 40));

        buttonGroup2.add(sisbn);
        sisbn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sisbn.setText("Search By ISBN Number");
        sisbn.setBorder(null);
        sisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisbnActionPerformed(evt);
            }
        });
        Sbook.add(sisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 220, 40));

        sear.setMinimumSize(new java.awt.Dimension(1246, 535));
        sear.setPreferredSize(new java.awt.Dimension(1246, 535));
        sear.setLayout(new java.awt.CardLayout());

        SN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Book Name");
        SN.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 197, 25));

        sbookname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sbookname.setBorder(null);
        sbookname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbooknameMouseClicked(evt);
            }
        });
        SN.add(sbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 40));

        ssearch.setBackground(new java.awt.Color(255, 204, 204));
        ssearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ssearch.setText("Search");
        ssearch.setBorder(null);
        ssearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssearchMouseClicked(evt);
            }
        });
        SN.add(ssearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 170, 40));

        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        Sboookname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Sboookname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Authour", "Shelf", "Row", "Colum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Sboookname.setIntercellSpacing(new java.awt.Dimension(1, 5));
        Sboookname.setRowHeight(20);
        Sboookname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SboooknameMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Sboookname);
        if (Sboookname.getColumnModel().getColumnCount() > 0) {
            Sboookname.getColumnModel().getColumn(0).setResizable(false);
            Sboookname.getColumnModel().getColumn(0).setPreferredWidth(10);
            Sboookname.getColumnModel().getColumn(1).setResizable(false);
            Sboookname.getColumnModel().getColumn(1).setPreferredWidth(10);
            Sboookname.getColumnModel().getColumn(2).setResizable(false);
            Sboookname.getColumnModel().getColumn(2).setPreferredWidth(10);
            Sboookname.getColumnModel().getColumn(3).setResizable(false);
            Sboookname.getColumnModel().getColumn(3).setPreferredWidth(10);
            Sboookname.getColumnModel().getColumn(4).setResizable(false);
            Sboookname.getColumnModel().getColumn(4).setPreferredWidth(10);
            Sboookname.getColumnModel().getColumn(5).setResizable(false);
            Sboookname.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        SN.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 1000, 380));

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(new java.awt.Color(0, 0, 0));
        label17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label17MouseClicked(evt);
            }
        });
        SN.add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        sear.add(SN, "card2");

        SIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ISBN No");
        SIN.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 11, 241, 28));

        isbnno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbnno.setBorder(null);
        isbnno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbnnoMouseClicked(evt);
            }
        });
        SIN.add(isbnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 290, 40));

        isbnsearch.setBackground(new java.awt.Color(255, 204, 204));
        isbnsearch.setText("Search");
        isbnsearch.setBorder(null);
        isbnsearch.setBorderPainted(false);
        isbnsearch.setRequestFocusEnabled(false);
        isbnsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbnsearchMouseClicked(evt);
            }
        });
        SIN.add(isbnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 180, 40));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("ISBN No");
        SIN.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 135, 210, 22));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Book Title");
        SIN.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 210, 22));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Authour Name");
        SIN.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 255, 210, 22));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("Edition");
        SIN.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 315, 210, 22));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("Total Number Of Copies ");
        SIN.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 365, 210, 22));

        isbn1.setEditable(false);
        isbn1.setBackground(new java.awt.Color(255, 255, 255));
        isbn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbn1.setBorder(null);
        isbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbn1MouseClicked(evt);
            }
        });
        SIN.add(isbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 360, 35));

        isbntitle.setEditable(false);
        isbntitle.setBackground(new java.awt.Color(255, 255, 255));
        isbntitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbntitle.setBorder(null);
        isbntitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbntitleMouseClicked(evt);
            }
        });
        SIN.add(isbntitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 360, 35));

        isbnauthour.setEditable(false);
        isbnauthour.setBackground(new java.awt.Color(255, 255, 255));
        isbnauthour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbnauthour.setBorder(null);
        isbnauthour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbnauthourMouseClicked(evt);
            }
        });
        SIN.add(isbnauthour, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 360, 35));

        isbnedition.setEditable(false);
        isbnedition.setBackground(new java.awt.Color(255, 255, 255));
        isbnedition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbnedition.setBorder(null);
        isbnedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbneditionMouseClicked(evt);
            }
        });
        SIN.add(isbnedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 360, 35));

        isbntotal.setEditable(false);
        isbntotal.setBackground(new java.awt.Color(255, 255, 255));
        isbntotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbntotal.setBorder(null);
        isbntotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbntotalMouseClicked(evt);
            }
        });
        SIN.add(isbntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 360, 35));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(":");
        SIN.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 30, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(":");
        SIN.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 30, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(":");
        SIN.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 30, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText(":");
        SIN.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 30, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(":");
        SIN.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 30, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        SIN.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 165, 360, 5));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        SIN.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 225, 360, 5));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        SIN.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 285, 360, 5));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        SIN.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 345, 360, 5));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        SIN.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 395, 360, 5));

        label18.setAlignment(java.awt.Label.CENTER);
        label18.setBackground(new java.awt.Color(0, 0, 0));
        label18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label18.setForeground(new java.awt.Color(255, 255, 255));
        label18.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label18MouseClicked(evt);
            }
        });
        SIN.add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        sear.add(SIN, "card3");

        Sbook.add(sear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 102, 102));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Search Book");
        Sbook.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        jLabel101.setText("jLabel61");
        Sbook.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(Sbook, "card5");

        student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Student ID:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 100, 22));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Student Name:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 125, 100, 22));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Batch:");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 175, 100, 22));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Department:");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 225, 100, 22));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 325, 100, 22));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Phone");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 375, 100, 22));

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Password:");
        jLabel94.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 275, 100, 22));

        id.setBackground(new java.awt.Color(153, 153, 153));
        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 191, 30));

        name.setBackground(new java.awt.Color(153, 153, 153));
        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 191, 30));

        batch.setBackground(new java.awt.Color(153, 153, 153));
        batch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        batch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 191, 30));

        department.setBackground(new java.awt.Color(153, 153, 153));
        department.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        department.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 191, 30));

        email.setBackground(new java.awt.Color(153, 153, 153));
        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 191, 30));

        contact.setBackground(new java.awt.Color(153, 153, 153));
        contact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactKeyReleased(evt);
            }
        });
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 191, 30));

        password.setBackground(new java.awt.Color(153, 153, 153));
        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 191, 30));

        addstudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addstudent.setText("Add Student");
        addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentActionPerformed(evt);
            }
        });
        jPanel3.add(addstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 170, 30));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel102.setText("Date of Birth");
        jPanel3.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 425, -1, -1));

        stdob.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.add(stdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 190, 30));

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel103.setText("Username");
        jLabel103.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 22));

        username.setBackground(new java.awt.Color(153, 153, 153));
        username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 191, 30));

        student.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 830, 540));

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 102, 102));
        jLabel95.setText("Student Management");
        student.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 230, 30));

        bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        student.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(new java.awt.Color(0, 0, 0));
        label16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setText("All Rights Reserved @ Koushik,Khalid & Rakib");
        label16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label16MouseClicked(evt);
            }
        });
        student.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        Home.add(student, "card7");

        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, 1246, 655));

        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 102, 102));
        jLabel79.setText("Admin Dashboard");
        dashb.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 210, 30));

        bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        bg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bg4MouseClicked(evt);
            }
        });
        dashb.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator55.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator55.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 5));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel80.setText("Admin Basic Info");
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel81.setText("Name");
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 22));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel82.setText("Birth Date");
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 22));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel83.setText("Phone");
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 22));

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel84.setText("Blood Group");
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 22));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel85.setText("Father's Name");
        jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 22));

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel86.setText("Mother's Name");
        jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 22));

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
        jPanel2.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        nam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nam.setForeground(new java.awt.Color(0, 153, 153));
        nam.setText("jlabel24");
        jPanel2.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 22));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dob.setForeground(new java.awt.Color(0, 153, 153));
        dob.setText("jLabel23");
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 22));

        phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 153, 153));
        phone.setText("jLabel25");
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 22));

        blood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        blood.setForeground(new java.awt.Color(0, 153, 153));
        blood.setText("jLabel26");
        jPanel2.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 22));

        fathername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fathername.setForeground(new java.awt.Color(0, 153, 153));
        fathername.setText("jLabel27");
        jPanel2.add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 22));

        mothername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mothername.setForeground(new java.awt.Color(0, 153, 153));
        mothername.setText("jLabel28");
        jPanel2.add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 22));

        dashb.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 400, 320));

        Dashboard.add(dashb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, 1246, 655));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Menu_40px_1.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 38, 32));

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 1246, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        setState(AdminPanel.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

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
            add.setEnabled(true);
            list.setEnabled(true);
            edit.setEnabled(true);
            request.setEnabled(true);
            isbn.setEnabled(true);
            nbook.setEnabled(true);
            title.setEnabled(true);
            author.setEnabled(true);
            edition.setEnabled(true);
            shelf.setEnabled(true);
            row.setEnabled(true);
            column.setEnabled(true);
            insert.setEnabled(true);
            clear.setEnabled(true);

            jLabel48.setEnabled(true);
            jLabel49.setEnabled(true);
            jLabel50.setEnabled(true);
            jLabel51.setEnabled(true);
            jLabel52.setEnabled(true);
            jLabel53.setEnabled(true);
            jLabel54.setEnabled(true);
            jLabel55.setEnabled(true);

            listT.setEnabled(true);
            eisbn.setEnabled(true);
            eisbn1.setEnabled(true);
            enbook.setEnabled(true);
            etitle.setEnabled(true);
            eauthor.setEnabled(true);
            eedition.setEnabled(true);
            eshelf.setEnabled(true);
            erow.setEnabled(true);
            ecolum.setEnabled(true);
            esearch.setEnabled(true);
            eupdate.setEnabled(true);
            jLabel56.setEnabled(true);
            jLabel57.setEnabled(true);
            jLabel58.setEnabled(true);
            jLabel59.setEnabled(true);
            jLabel60.setEnabled(true);
            jLabel61.setEnabled(true);
            jLabel62.setEnabled(true);
            jLabel63.setEnabled(true);
            jLabel64.setEnabled(true);

            //for book request
            jScrollPane8.setEnabled(true);
          
            rtitle.setEnabled(true);
            rauthor.setEnabled(true);
            redition.setEnabled(true);
            
            rpublicaton.setEnabled(true);
            
            rinsert.setEnabled(true);
            rdelete.setEnabled(true);
           
            jLabel66.setEnabled(true);
            jLabel67.setEnabled(true);
            jLabel68.setEnabled(true);
         

            //Search book panel
            sname.setEnabled(true);
            sisbn.setEnabled(true);
            jLabel16.setEnabled(true);
            ssearch.setEnabled(true);
            sbookname.setEnabled(true);
            Sboookname.setEnabled(true);

            //search by ISBN number
            isbnno.setEnabled(true);
            isbnsearch.setEnabled(true);
            isbn1.setEnabled(true);
            isbntitle.setEnabled(true);
            isbnauthour.setEnabled(true);
            isbnedition.setEnabled(true);
            isbntotal.setEnabled(true);
            jLabel17.setEnabled(true);
            jLabel18.setEnabled(true);
            jLabel19.setEnabled(true);
            jLabel20.setEnabled(true);
            jLabel21.setEnabled(true);
            jLabel22.setEnabled(true);
            jLabel23.setEnabled(true);
            jLabel24.setEnabled(true);
            jLabel25.setEnabled(true);
            jLabel26.setEnabled(true);
            jLabel27.setEnabled(true);

            //Manage borrower 
            bb.setEnabled(true);
            bl.setEnabled(true);
            rb.setEnabled(true);

            //for borrower book
            jPanel5.setEnabled(true);
            jPanel6.setEnabled(true);
            jPanel7.setEnabled(true);
            bstid.setEnabled(true);
            bdate.setEnabled(true);
            rdate.setEnabled(true);
            benter.setEnabled(true);
            bname.setEnabled(true);
            bdep.setEnabled(true);
            bbatch.setEnabled(true);
            bbtitle.setEnabled(true);
            bisbnno.setEnabled(true);
            bok.setEnabled(true);
            jLabel28.setEnabled(true);
            jLabel29.setEnabled(true);
            jLabel30.setEnabled(true);
            jLabel31.setEnabled(true);
            jLabel32.setEnabled(true);
            jLabel33.setEnabled(true);
            jLabel34.setEnabled(true);

            //for borrower list
            jScrollPane5.setEnabled(true);

            //for Return Book
            rstid.setEnabled(true);
            renter.setEnabled(true);
            jLabel35.setEnabled(true);
            jLabel36.setEnabled(true);
            jLabel37.setEnabled(true);
            jLabel38.setEnabled(true);
            jLabel39.setEnabled(true);
            jLabel40.setEnabled(true);
            jLabel41.setEnabled(true);
            jLabel42.setEnabled(true);
            jLabel43.setEnabled(true);
            jLabel44.setEnabled(true);
            jLabel45.setEnabled(true);
            jLabel46.setEnabled(true);
            jLabel47.setEnabled(true);
            jPanel8.setEnabled(true);
            jPanel9.setEnabled(true);
            jScrollPane6.setEnabled(true);

            //for librarian setting
            cpass.setEnabled(true);
            npass.setEnabled(true);
            cnpass.setEnabled(true);
            lupdate.setEnabled(true);
            lfathername.setEnabled(true);
            lmothername.setEnabled(true);
            phn.setEnabled(true);
            lcpass1.setEnabled(true);
            lupdate2.setEnabled(true);
            jPanel11.setEnabled(true);
            jPanel12.setEnabled(true);
            jLabel72.setEnabled(true);
            jLabel73.setEnabled(true);
            jLabel74.setEnabled(true);
            jLabel75.setEnabled(true);
            jLabel76.setEnabled(true);
            jLabel77.setEnabled(true);

            //for generate report
            gsinfo.setEnabled(true);
            gbinfo.setEnabled(true);
            gthistory.setEnabled(true);

            //for student information
            sdep.setEnabled(true);
            sdep1.setEnabled(true);
            sbatch.setEnabled(true);
            sbatch1.setEnabled(true);
            jScrollPane1.setEnabled(true);
            sall.setEnabled(true);
            bisbn2.setEnabled(true);
            bshelf3.setEnabled(true);
            jLabel11.setEnabled(true);
            jLabel12.setEnabled(true);

            //for book information
            bisbn2.setEnabled(true);
            bshelf3.setEnabled(true);
            bisbn.setEnabled(true);
            bisbn1.setEnabled(true);
            bshelf1.setEnabled(true);
            bshelf2.setEnabled(true);
            ball.setEnabled(true);
            jScrollPane2.setEnabled(true);

            //for transaction History
            tfrom.setEnabled(true);
            tto.setEnabled(true);
            tsearch.setEnabled(true);
            // tall.setEnabled(true);
            jLabel9.setEnabled(true);
            jLabel15.setEnabled(true);
        }
        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        listT.setEnabled(true);
        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        rpublicaton.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
       
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
     
        
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
      
        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        //   tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jLabel1MousePressed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        menu2.setVisible(true);
        menu.setVisible(false);
        if (Bshelf.isShowing()) {

            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));

            add.setEnabled(false);
            list.setEnabled(false);
            edit.setEnabled(false);
            request.setEnabled(false);
            isbn.setEnabled(false);
            nbook.setEnabled(false);
            title.setEnabled(false);
            author.setEnabled(false);
            edition.setEnabled(false);
            shelf.setEnabled(false);

            row.setEnabled(false);
            column.setEnabled(false);
            insert.setEnabled(false);
            clear.setEnabled(false);

            jLabel48.setEnabled(false);
            jLabel49.setEnabled(false);
            jLabel50.setEnabled(false);
            jLabel51.setEnabled(false);
            jLabel52.setEnabled(false);
            jLabel53.setEnabled(false);
            jLabel54.setEnabled(false);
            jLabel55.setEnabled(false);
            listT.setEnabled(false);

            //for edit
            eisbn.setEnabled(false);
            eisbn1.setEnabled(false);
            enbook.setEnabled(false);
            etitle.setEnabled(false);
            eauthor.setEnabled(false);
            eedition.setEnabled(false);
            eshelf.setEnabled(false);
            erow.setEnabled(false);
            ecolum.setEnabled(false);
            esearch.setEnabled(false);
            eupdate.setEnabled(false);
            jLabel57.setEnabled(false);
            jLabel58.setEnabled(false);
            jLabel59.setEnabled(false);
            jLabel60.setEnabled(false);
            jLabel61.setEnabled(false);
            jLabel62.setEnabled(false);
            jLabel63.setEnabled(false);
            jLabel64.setEnabled(false);
            jLabel56.setEnabled(false);
            //for book request
            jScrollPane8.setEnabled(false);
           
            rtitle.setEnabled(false);
            rauthor.setEnabled(false);
            redition.setEnabled(false);
         
            rpublicaton.setEnabled(false);
            
            rinsert.setEnabled(false);
            rdelete.setEnabled(false);
          
            jLabel66.setEnabled(false);
            jLabel67.setEnabled(false);
            jLabel68.setEnabled(false);
          
        } else if (Sbook.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));

            sname.setEnabled(false);
            sisbn.setEnabled(false);
            jLabel16.setEnabled(false);
            Sboookname.setEnabled(false);
            ssearch.setEnabled(false);
            sbookname.setEnabled(false);

            //search by ISBN number
            isbnno.setEnabled(false);
            isbnsearch.setEnabled(false);
            isbn1.setEnabled(false);
            isbntitle.setEnabled(false);
            isbnauthour.setEnabled(false);
            isbnedition.setEnabled(false);
            isbntotal.setEnabled(false);
            jLabel17.setEnabled(false);
            jLabel18.setEnabled(false);
            jLabel19.setEnabled(false);
            jLabel20.setEnabled(false);
            jLabel21.setEnabled(false);
            jLabel22.setEnabled(false);
            jLabel23.setEnabled(false);
            jLabel24.setEnabled(false);
            jLabel25.setEnabled(false);
            jLabel26.setEnabled(false);
            jLabel27.setEnabled(false);
        } else if (Mborrower.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(true);
            mborrower.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));

            bb.setEnabled(false);
            bl.setEnabled(false);
            rb.setEnabled(false);

            //for borrower book
            jPanel5.setEnabled(false);
            jPanel6.setEnabled(false);
            jPanel7.setEnabled(false);
            bstid.setEnabled(false);
            bdate.setEnabled(false);
            rdate.setEnabled(false);
            benter.setEnabled(false);
            bname.setEnabled(false);
            bdep.setEnabled(false);
            bbatch.setEnabled(false);
            bbtitle.setEnabled(false);
            bisbnno.setEnabled(false);
            bok.setEnabled(false);
            pub.setEnabled(false);
            jLabel28.setEnabled(false);
            jLabel29.setEnabled(false);
            jLabel30.setEnabled(false);
            jLabel31.setEnabled(false);
            jLabel32.setEnabled(false);
            jLabel33.setEnabled(false);
            jLabel34.setEnabled(false);

            //for borrower list
            jScrollPane5.setEnabled(false);

            //for Return Book
            rstid.setEnabled(false);
            renter.setEnabled(false);
            jLabel35.setEnabled(false);
            jLabel36.setEnabled(false);
            jLabel37.setEnabled(false);
            jLabel38.setEnabled(false);
            jLabel39.setEnabled(false);
            jLabel40.setEnabled(false);
            jLabel41.setEnabled(false);
            jLabel42.setEnabled(false);
            jLabel43.setEnabled(false);
            jLabel44.setEnabled(false);
            jLabel45.setEnabled(false);
            jLabel46.setEnabled(false);
            jLabel47.setEnabled(false);
            jPanel8.setEnabled(false);
            jPanel9.setEnabled(false);
            jScrollPane6.setEnabled(false);
        } else if (Lsetting.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(true);
            asetting.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));

            cpass.setEnabled(false);
            npass.setEnabled(false);
            cnpass.setEnabled(false);
            lupdate.setEnabled(false);
            lfathername.setEnabled(false);
            lmothername.setEnabled(false);
            phn.setEnabled(false);
            lcpass1.setEnabled(false);
            lupdate2.setEnabled(false);
            jPanel11.setEnabled(false);
            jPanel12.setEnabled(false);
            jLabel72.setEnabled(false);
            jLabel73.setEnabled(false);
            jLabel74.setEnabled(false);
            jLabel75.setEnabled(false);
            jLabel76.setEnabled(false);
            jLabel77.setEnabled(false);

        }

        if (Greport.isShowing()) {
            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));

            gsinfo.setEnabled(false);
            gbinfo.setEnabled(false);
            gthistory.setEnabled(false);

            //for student information
            sdep.setEnabled(false);
            sdep1.setEnabled(false);
            sbatch.setEnabled(false);
            sbatch1.setEnabled(false);
            jScrollPane1.setEnabled(false);
            sall.setEnabled(false);
            jLabel11.setEnabled(false);
            jLabel12.setEnabled(false);

            //for book information
            bisbn2.setEnabled(false);
            bshelf3.setEnabled(false);
            bisbn.setEnabled(false);
            bisbn1.setEnabled(false);
            bshelf1.setEnabled(false);
            bshelf2.setEnabled(false);
            ball.setEnabled(false);
            jScrollPane2.setEnabled(false);

            //for transaction History
            tfrom.setEnabled(false);
            tto.setEnabled(false);
            tsearch.setEnabled(false);
            tall.setEnabled(false);
            jLabel9.setEnabled(false);
            jLabel15.setEnabled(false);
        } else if (student.isShowing()) {
            studentm.setOpaque(true);
            studentm.setForeground(new Color(51, 204, 255));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));

            id.setEnabled(false);
            username.setEnabled(false);
            stdob.setEnabled(false);
            name.setEnabled(false);
            batch.setEnabled(false);
            department.setEnabled(false);
            email.setEnabled(false);
            password.setEnabled(false);
            contact.setEnabled(false);
            addstudent.setEnabled(false);
        } else if (Dashboard.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(true);
            home.setForeground(new Color(51, 204, 255));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            asetting.setOpaque(false);
            asetting.setForeground(new Color(240, 240, 240));
            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            mborrower.setOpaque(false);
            mborrower.setForeground(new Color(240, 240, 240));
        }

    }//GEN-LAST:event_menuActionPerformed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        if (Dashboard.isShowing()) {
            home.setOpaque(true);
            home.setForeground(new Color(51, 204, 255, 255));
        } else {
            home.setOpaque(true);
            home.setForeground(new Color(51, 204, 255, 255));
        }


    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        if (Dashboard.isShowing()) {
            home.setOpaque(true);
            home.setForeground(new Color(51, 204, 255, 255));
        } else {
            home.setForeground(new Color(240, 240, 240, 255));
            home.setOpaque(false);
        }
    }//GEN-LAST:event_homeMouseExited

    private void asettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asettingMouseEntered
        if (Lsetting.isShowing()) {

            asetting.setOpaque(true);
            asetting.setForeground(new Color(51, 204, 255, 255));
        } else {

            asetting.setOpaque(true);
            asetting.setForeground(new Color(51, 204, 255, 255));
        }


    }//GEN-LAST:event_asettingMouseEntered

    private void asettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asettingMouseExited
        if (Lsetting.isShowing()) {

            asetting.setOpaque(true);
            asetting.setForeground(new Color(51, 204, 255, 255));
        } else {

            asetting.setForeground(new Color(240, 240, 240, 255));
            asetting.setOpaque(false);
        }


    }//GEN-LAST:event_asettingMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        listT.setEnabled(true);

        //for edit 
        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
        
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
     
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
      

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bok.setEnabled(true);
        pub.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

        id.setEnabled(true);
        username.setEnabled(true);
        stdob.setEnabled(true);
        name.setEnabled(true);
        batch.setEnabled(true);
        department.setEnabled(true);
        email.setEnabled(true);
        password.setEnabled(true);
        contact.setEnabled(true);
        addstudent.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void greportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greportMouseEntered
        if (Greport.isShowing()) {

            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255, 255));
        } else {

            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255, 255));
        }
    }//GEN-LAST:event_greportMouseEntered

    private void greportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greportMouseExited
        if (Greport.isShowing()) {

            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255, 255));
        } else {

            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240, 255));
        }
    }//GEN-LAST:event_greportMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setOpaque(true);
        logout.setForeground(new Color(51, 204, 255, 255));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new Color(240, 240, 240, 255));
        logout.setOpaque(false);
    }//GEN-LAST:event_logoutMouseExited

    private void bshelfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelfMouseEntered
        if (Bshelf.isShowing()) {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        } else {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_bshelfMouseEntered

    private void bshelfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelfMouseExited
        if (Bshelf.isShowing()) {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        } else {
            bshelf.setForeground(new Color(240, 240, 240, 255));
            bshelf.setOpaque(false);
        }
    }//GEN-LAST:event_bshelfMouseExited

    private void sbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbookMouseEntered
        if (Sbook.isShowing()) {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        } else {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        }
    }//GEN-LAST:event_sbookMouseEntered

    private void sbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbookMouseExited
        if (Sbook.isShowing()) {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        } else {
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240, 255));
        }
    }//GEN-LAST:event_sbookMouseExited

    private void mborrowerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mborrowerMouseEntered
        if (Mborrower.isShowing()) {

            mborrower.setOpaque(true);
            mborrower.setForeground(new Color(51, 204, 255, 255));
        } else {

            mborrower.setOpaque(true);
            mborrower.setForeground(new Color(51, 204, 255, 255));
        }

    }//GEN-LAST:event_mborrowerMouseEntered

    private void mborrowerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mborrowerMouseExited
        if (Mborrower.isShowing()) {

            mborrower.setOpaque(true);
            mborrower.setForeground(new Color(51, 204, 255, 255));
        } else {

            mborrower.setForeground(new Color(240, 240, 240, 255));
            mborrower.setOpaque(false);
        }

    }//GEN-LAST:event_mborrowerMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        listT.setEnabled(true);
        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
       
        rpublicaton.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
        
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
       

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        pub.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        //    tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

        id.setEnabled(true);
        username.setEnabled(true);
        stdob.setEnabled(true);
        name.setEnabled(true);
        batch.setEnabled(true);
        department.setEnabled(true);
        email.setEnabled(true);
        password.setEnabled(true);
        contact.setEnabled(true);
        addstudent.setEnabled(true);


    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jPanel1MousePressed

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_HomeMousePressed

    private void HomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_HomeMouseDragged

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        listT.setEnabled(true);
        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
      
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
       

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        //  tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

    }//GEN-LAST:event_HomeMouseClicked

    private void gbinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbinfoActionPerformed
        GR.removeAll();
        GR.repaint();
        GR.revalidate();

        GR.add(BI);
        GR.repaint();
        GR.revalidate();

        String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where shelf=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bshelf1.getText());
            rs = pst.executeQuery();
            abookinfo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_gbinfoActionPerformed

    private void gthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gthistoryActionPerformed
        GR.removeAll();
        GR.repaint();
        GR.revalidate();

        GR.add(TH);
        GR.repaint();
        GR.revalidate();
    }//GEN-LAST:event_gthistoryActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        List.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        listT.setEnabled(true);
        eisbn1.setText("");
        eisbn.setText("");
        enbook.setText("");
        etitle.setText("");
        eauthor.setText("");
        eedition.setText("");
         eshelf.setText("");
         erow.setText("");
          ecolum.setText("");
        pub1.setText("");  
        try {
            String table = "select * from adminbook";
            pst = conn.prepareStatement(table);
            rs = pst.executeQuery();
            listofbook.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_listMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
        eisbn1.setText("");
        eisbn.setText("");
        enbook.setText("");
        etitle.setText("");
        eauthor.setText("");
        eedition.setText("");
         eshelf.setText("");
         erow.setText("");
          ecolum.setText("");
        pub1.setText("");  
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(false);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_editMouseClicked

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
        
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
    
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
        
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
     
        eisbn1.setText("");
        eisbn.setText("");
        enbook.setText("");
        etitle.setText("");
        eauthor.setText("");
        eedition.setText("");
         eshelf.setText("");
         erow.setText("");
          ecolum.setText("");
        pub1.setText("");  
    }//GEN-LAST:event_requestMouseClicked

    private void isbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbnMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_isbnMouseClicked

    private void nbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbookMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_nbookMouseClicked

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_titleMouseClicked

    private void authorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_authorMouseClicked

    private void editionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_editionMouseClicked

    private void shelfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shelfMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_shelfMouseClicked

    private void rowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rowMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_rowMouseClicked

    private void columnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_columnMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);
    }//GEN-LAST:event_columnMouseClicked

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Add.setVisible(true);
        List.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        String inser = "insert into adminbook (isbn,nobook,title,aname,edition,shelf,row,colum,Publication) values(?,?,?,?,?,?,?,?,?)";

        if ("".equals(isbn.getText())) {
            JOptionPane.showMessageDialog(null, "Enter ISBN No");
        } else {
            if ("".equals(nbook.getText())) {
                JOptionPane.showMessageDialog(null, "Enter Number of Book");
            } else {
                if ("".equals(title.getText())) {
                    JOptionPane.showMessageDialog(null, "Enter Book Title");
                } else {
                    if ("".equals(author.getText())) {
                        JOptionPane.showMessageDialog(null, "Enter Author Name");
                    } else {
                        if ("".equals(edition.getText())) {
                            JOptionPane.showMessageDialog(null, "Enter Edition");
                        } else {
                            if ("".equals(shelf.getText())) {
                                JOptionPane.showMessageDialog(null, "Enter shelf No");
                            } else {
                                if ("".equals(row.getText())) {
                                    JOptionPane.showMessageDialog(null, "Enter Row Number");
                                } else {
                                    if ("".equals(column.getText())) {
                                        JOptionPane.showMessageDialog(null, "Enter Column No");
                                    } else {
                                        if ("".equals(pub.getText())) {
                                            JOptionPane.showMessageDialog(null, "Enter Publication Name");
                                        } else {
                                            try {

                                                pst1 = conn.prepareStatement(inser);

                                                pst1.setString(1, isbn.getText());
                                                pst1.setString(2, nbook.getText());
                                                pst1.setString(3, title.getText());
                                                pst1.setString(4, author.getText());
                                                pst1.setString(5, edition.getText());
                                                pst1.setString(6, shelf.getText());
                                                pst1.setString(7, row.getText());
                                                pst1.setString(8, column.getText());
                                                pst1.setString(9, pub.getText());
                                                pst1.execute();
                                                isbn.setText("");
                                                nbook.setText("");
                                                title.setText("");
                                                author.setText("");
                                                edition.setText("");
                                                shelf.setText("");
                                                row.setText("");
                                                column.setText("");
                                                pub.setText(" ");
                                                JOptionPane.showMessageDialog(null, "inserted");
                                            } catch (HeadlessException | SQLException e) {
                                                JOptionPane.showMessageDialog(null, e);
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_insertMouseClicked

    private void listofbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listofbookMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        List.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        listT.setEnabled(true);
    }//GEN-LAST:event_listofbookMouseClicked

    private void listTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        List.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        Request.setVisible(false);

        listT.setEnabled(true);
    }//GEN-LAST:event_listTMouseClicked

    private void eisbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eisbn1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_eisbn1MouseClicked

    private void eisbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eisbnMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_eisbnMouseClicked

    private void enbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enbookMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_enbookMouseClicked

    private void etitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etitleMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_etitleMouseClicked

    private void eauthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eauthorMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);


    }//GEN-LAST:event_eauthorMouseClicked

    private void eeditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eeditionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_eeditionMouseClicked

    private void eshelfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eshelfMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_eshelfMouseClicked

    private void erowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erowMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_erowMouseClicked

    private void ecolumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecolumMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

    }//GEN-LAST:event_ecolumMouseClicked

    private void esearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esearchMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        String sql = "select * from adminbook where ISBN=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, eisbn1.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                eupdate.setEnabled(true);
                String a = rs.getString("isbn");
                eisbn.setText(a);
                String b = rs.getString("nobook");
                enbook.setText(b);
                String c = rs.getString("title");
                etitle.setText(c);
                String d = rs.getString("aname");
                eauthor.setText(d);
                String e = rs.getString("edition");
                eedition.setText(e);
                String f = rs.getString("shelf");
                eshelf.setText(f);
                String g = rs.getString("row");
                erow.setText(g);
                String h = rs.getString("colum");
                ecolum.setText(h);
                String i=rs.getString("Publication");
                pub1.setText(i);
            } else {
                JOptionPane.showMessageDialog(null, "invalid Isbn Number");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        
       
    }//GEN-LAST:event_esearchMouseClicked

    private void eupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eupdateMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Edit.setVisible(true);
        Add.setVisible(false);
        List.setVisible(false);
        Request.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        try {
            String a = eisbn.getText();
            String b = enbook.getText();
            String c = etitle.getText();
            String d = eauthor.getText();
            String e = eedition.getText();
            String f = eshelf.getText();
            String g = erow.getText();
            String h = ecolum.getText();
            String i = pub1.getText();
            String j=eisbn1.getText();
            String sql = "update adminbook set isbn='" + a + "' , nobook='" + b + "' , title='" + c + "' , aname='" + d + "', edition='" + e + "',"
                    + " shelf='" + f + "', row='" + g + "', colum='" + h + "', Publication='" + i + "' where isbn='"+j+"'  ";
           PreparedStatement pst59= conn.prepareStatement(sql);
            pst59.executeUpdate();
            JOptionPane.showMessageDialog(null, "book info sucessfully updated");
            eisbn1.setText("");
            eisbn.setText("");
            enbook.setText("");
            etitle.setText("");
            eauthor.setText("");
            eedition.setText("");
            eshelf.setText("");
            erow.setText("");
            ecolum.setText("");
            pub1.setText("");  ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_eupdateMouseClicked

    private void rtitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rtitleMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
       
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
        
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
     
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
      

    }//GEN-LAST:event_rtitleMouseClicked

    private void rauthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rauthorMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
      
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
        

    }//GEN-LAST:event_rauthorMouseClicked

    private void reditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reditionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
      
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rpublicaton.setEnabled(true);
      
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
        
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
        

    }//GEN-LAST:event_reditionMouseClicked

    private void tbrequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbrequestMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
        
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
     
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
        

        try {
            int row = tbrequest.getSelectedRow();
            String tblclick = (tbrequest.getModel().getValueAt(row, 0).toString());
            String sql = "select * from brequest where Book_Title='" + tblclick + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String a = rs.getString("Book_Title");
                rtitle.setText(a);
                String b = rs.getString("Authour_Name");
                rauthor.setText(b);
                String c = rs.getString("Edition");
                redition.setText(c);
                String d = rs.getString("Publication");
                rpublicaton.setText(d);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_tbrequestMouseClicked

    private void jScrollPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane8MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
       
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
        
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
        
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
   

    }//GEN-LAST:event_jScrollPane8MouseClicked

    private void rinsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rinsertMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
       
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rpublicaton.setEnabled(true);
      
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
      

     if ("".equals(rtitle.getText())) {
            JOptionPane.showMessageDialog(null, "Enter Book Title");
        } else {
            if ("".equals(rauthor.getText())) {
                JOptionPane.showMessageDialog(null, "Enter Author Name");
            } else {
                if ("".equals(redition.getText())) {
                    JOptionPane.showMessageDialog(null, "Enter Edition");
                } else {

                    String insert = "update brequest set  status='"+"accepted"+"' where Book_Title='"+ rtitle.getText() + "'";
                    try {
                        pst = conn.prepareStatement(insert);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Inserted");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

            }
        }


    }//GEN-LAST:event_rinsertMouseClicked

    private void rdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdeleteMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
       
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
     
        rpublicaton.setEnabled(true);
       
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
       
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);

        
          if ("".equals(rtitle.getText())) {
         JOptionPane.showMessageDialog(null, "Enter Book Title");
        } else {
            if ("".equals(rauthor.getText())) {
                JOptionPane.showMessageDialog(null, "Enter Author Name");
            } else {
                if ("".equals(redition.getText())) {
                    JOptionPane.showMessageDialog(null, "Enter Edition");
                } else {

                    String insert = "update brequest set  status='"+"Rejected"+"' where Book_Title='"+ rtitle.getText() + "'";
                    try {
                        pst = conn.prepareStatement(insert);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Delete");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

            }
        }

    }//GEN-LAST:event_rdeleteMouseClicked

    private void sbooknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbooknameMouseClicked
        SN.setVisible(true);
        SIN.setVisible(false);

        Sbook.setVisible(true);
        menu2.setVisible(false);
        menu.setVisible(true);
        Bshelf.setVisible(false);
        Mborrower.setVisible(false);
        Lsetting.setVisible(false);
        Greport.setVisible(false);

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        sbookname.setText("");
    }//GEN-LAST:event_sbooknameMouseClicked

    private void ssearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssearchMouseClicked
        SN.setVisible(true);
        SIN.setVisible(false);

        Sbook.setVisible(true);
        menu2.setVisible(false);
        menu.setVisible(true);
        Bshelf.setVisible(false);
        Mborrower.setVisible(false);
        Lsetting.setVisible(false);
        Greport.setVisible(false);

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        if (Sboookname.isEditing()) {
            Sboookname.getCellEditor().stopCellEditing();
        }

        try {
            String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where title='" + sbookname.getText() + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Sboookname.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_ssearchMouseClicked

    private void SboooknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SboooknameMouseClicked
        SN.setVisible(true);
        SIN.setVisible(false);

        Sbook.setVisible(true);
        menu2.setVisible(false);
        menu.setVisible(true);
        Bshelf.setVisible(false);
        Mborrower.setVisible(false);
        Lsetting.setVisible(false);
        Greport.setVisible(false);

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

    }//GEN-LAST:event_SboooknameMouseClicked

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
        SN.setVisible(true);
        SIN.setVisible(false);

        menu2.setVisible(false);
        menu.setVisible(true);

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void isbnnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbnnoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        isbnno.setText("");
        isbn1.setText("");
        isbntitle.setText("");
        isbnauthour.setText("");
        isbnedition.setText("");
        isbntotal.setText("");
    }//GEN-LAST:event_isbnnoMouseClicked

    private void isbnsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbnsearchMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        String sql = "select isbn,title,aname,edition,nobook from adminbook where isbn='" + isbnno.getText() + "'";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String a = rs.getString("isbn");
                String b = rs.getString("title");
                String c = rs.getString("aname");
                String d = rs.getString("edition");
                String e = rs.getString("nobook");

                isbn1.setText(a);
                isbntitle.setText(b);
                isbnauthour.setText(c);
                isbnedition.setText(d);
                isbntotal.setText(e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_isbnsearchMouseClicked

    private void isbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbn1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
    }//GEN-LAST:event_isbn1MouseClicked

    private void isbntitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbntitleMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
    }//GEN-LAST:event_isbntitleMouseClicked

    private void isbnauthourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbnauthourMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
    }//GEN-LAST:event_isbnauthourMouseClicked

    private void isbneditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbneditionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
    }//GEN-LAST:event_isbneditionMouseClicked

    private void isbntotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbntotalMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        sname.setEnabled(true);
        sisbn.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
    }//GEN-LAST:event_isbntotalMouseClicked

    private void bstidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bstidMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bstidMouseClicked

    private void rdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdateMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_rdateMouseClicked

    private void benterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_benterMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        String sql = "select * from lstudentsetting where id='" + bstid.getText() + "'";
        String sql1 = "select * from borrower where id='" + bstid.getText() + "'";
        try {
            PreparedStatement pst45 = conn.prepareStatement(sql1);
            rs = pst45.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Already Borrowed A Book");
                bstid.setText("");
                bdate.setDate(null);
                rdate.setDate(null);
            } else {
                PreparedStatement pst10 = conn.prepareStatement(sql);
                rs = pst10.executeQuery();
                if (rs.next()) {
                    String a = rs.getString("name");
                    bname.setText(a);
                    String b = rs.getString("dep");
                    bdep.setText(b);
                    String c = rs.getString("batch");
                    bbatch.setText(c);
                } else {
                    JOptionPane.showMessageDialog(null, "Ivalid Student Id");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_benterMouseClicked

    private void bnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bnameMouseClicked

    private void bdepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdepMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bdepMouseClicked

    private void bbatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbatchMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bbatchMouseClicked

    private void bbtitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbtitleMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bbtitleMouseClicked

    private void bokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bokMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        /*  bstid.setText("");
        bdate.setDate(null);
        rdate.setDate(null);
        bname.setText("");
        bdep.setText("");
        bbatch.setText("");
        bisbnno.setText("");*/
        if ("".equals(bstid.getText())) {
            JOptionPane.showMessageDialog(null, "Studen Id is empty");
        } else {
            if ("".equals(bdate.getDate())) {
                JOptionPane.showMessageDialog(null, "Borrow date Is Empty");
            } else {
                if ("".equals(rdate.getDate())) {
                    JOptionPane.showMessageDialog(null, "Return Date Is Empty");
                } else {
                    if ("".equals(bbtitle.getText())) {
                        JOptionPane.showMessageDialog(null, "Isbn Number Is Empty");
                    } else {
                        String sql1 = "select * from  borrower where isbn='" + bisbnno.getText() + "'";
                        String sql2 = "select * from  adminbook where isbn='" + bisbnno.getText() + "' and title='" + bbtitle.getText() + "' ";
                        String sql3 = "insert into borrower (id,isbn,name,department,batch,title,Borrow_date,Return_date) values(?,?,?,?,?,?,?,?)";
                        String sql4 = "insert into borrowered (id,isbn,name,department,batch,title,Borrow_date,Return_date) values(?,?,?,?,?,?,?,?)";
                        try {
                            pst = conn.prepareStatement(sql1);
                            rs = pst.executeQuery();
                            if (rs.next()) {
                                JOptionPane.showMessageDialog(null, "Not Available");
                                bbtitle.setText("");
                                bisbnno.setText("");

                            } else {
                                pst1 = conn.prepareStatement(sql2);
                                rs = pst1.executeQuery();

                                if (rs.next()) {
                                    pst2 = conn.prepareStatement(sql3);
                                    PreparedStatement pst56 = conn.prepareStatement(sql4);
                                    pst2.setString(1, bstid.getText());
                                    pst2.setString(2, bisbnno.getText());
                                    pst2.setString(3, bname.getText());
                                    pst2.setString(4, bdep.getText());
                                    pst2.setString(5, bbatch.getText());
                                    pst2.setString(6, bbtitle.getText());
                                    pst2.setString(7, ((JTextField) bdate.getDateEditor().getUiComponent()).getText());
                                    pst2.setString(8, ((JTextField) rdate.getDateEditor().getUiComponent()).getText());
                                    pst2.execute();
                                    pst56.setString(1, bstid.getText());
                                    pst56.setString(2, bisbnno.getText());
                                    pst56.setString(3, bname.getText());
                                    pst56.setString(4, bdep.getText());
                                    pst56.setString(5, bbatch.getText());
                                    pst56.setString(6, bbtitle.getText());
                                    pst56.setString(7, ((JTextField) bdate.getDateEditor().getUiComponent()).getText());
                                    pst56.setString(8, ((JTextField) rdate.getDateEditor().getUiComponent()).getText());
                                    pst56.execute();

                                    bstid.setText("");
                                    bdate.setDate(null);
                                    rdate.setDate(null);
                                    bname.setText("");
                                    bdep.setText("");
                                    bbatch.setText("");
                                    bbtitle.setText("");
                                    bisbnno.setText("");
                                } else if (!rs.next()) {
                                    JOptionPane.showMessageDialog(null, "No book found");
                                    bbtitle.setText("");
                                }

                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_bokMouseClicked

    private void bdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdateMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bdateMouseClicked

    private void tborrowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tborrowerMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);
    }//GEN-LAST:event_tborrowerMouseClicked

    private void jScrollPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);
    }//GEN-LAST:event_jScrollPane5MouseClicked

    private void rstidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rstidMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);
        
        rstid.setText("");
        
    }//GEN-LAST:event_rstidMouseClicked

    private void renterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renterMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);
        
        
        String sql = "DELETE FROM borrower WHERE id='" + rstid.getText() + "' ";
        try {
            PreparedStatement pst30 = conn.prepareStatement(sql);
            pst30.executeUpdate();
            conn.close();
            conn = Connect.Studentdb();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_renterMouseClicked

    private void treturnbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treturnbookMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);
    }//GEN-LAST:event_treturnbookMouseClicked

    private void jScrollPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane6MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);
    }//GEN-LAST:event_jScrollPane6MouseClicked

    private void cpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_cpassMouseClicked

    private void npassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_npassMouseClicked

    private void cnpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnpassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_cnpassMouseClicked

    private void lupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupdateMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        if ("".equals(cpass.getText())) {
            JOptionPane.showMessageDialog(null, " current password is empty!");
        } else {
            if ("".equals(npass.getText())) {
                JOptionPane.showMessageDialog(null, " New password is empty!");
            } else {
                if ("".equals(cnpass.getText())) {
                    JOptionPane.showMessageDialog(null, " confrim password is empty!");
                } else {
                    if (npass.getText() == null ? cnpass.getText() == null : npass.getText().equals(cnpass.getText())) {

                        try {

                            String sql = "update adminsetting set  password='" + cnpass.getText() + "'  where password='" + cpass.getText() + "' ";
                            String sql1 = "update ladminlogin set password='" + cnpass.getText() + "'  where password='" + cpass.getText() + "' ";
                            pst1 = conn.prepareStatement(sql);
                            pst = conn.prepareStatement(sql1);
                            pst1.executeUpdate();
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Password Update");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password doesn't match");
                        npass.setText("");
                        cnpass.setText("");
                    }
                }

            }
        }

    }//GEN-LAST:event_lupdateMouseClicked

    private void lmothernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lmothernameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_lmothernameMouseClicked

    private void phnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phnMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_phnMouseClicked

    private void gsinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gsinfoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);

    }//GEN-LAST:event_gsinfoMouseClicked

    private void tstinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tstinfoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
    }//GEN-LAST:event_tstinfoMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void sallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sallMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
    }//GEN-LAST:event_sallMouseClicked

    private void gbinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gbinfoMouseClicked
        st.setVisible(false);
        BI.setVisible(true);
        TH.setVisible(false);

        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        try {

            String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            abookinfo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_gbinfoMouseClicked

    private void abookinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abookinfoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);
    }//GEN-LAST:event_abookinfoMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void ballMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ballMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        MessageFormat header = new MessageFormat("Generate Report By All");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            abookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ballMouseClicked

    private void gthistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gthistoryMouseClicked
        TH.setVisible(true);
        st.setVisible(false);
        BI.setVisible(false);

        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(false);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);
    }//GEN-LAST:event_gthistoryMouseClicked

    private void tsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsearchMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

        String a = ((JTextField) tfrom.getDateEditor().getUiComponent()).getText();
        String b = ((JTextField) tto.getDateEditor().getUiComponent()).getText();
        String sql = "select id,isbn,name,department,batch,Borrow_date,Return_date from borrower where Borrow_date  between '" + a + "' and '" + b + "' ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            atransaction.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tsearchMouseClicked

    private void atransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atransactionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);
    }//GEN-LAST:event_atransactionMouseClicked

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void tallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tallMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

        MessageFormat header = new MessageFormat("Generate Report By ISBN Number");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            atransaction.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tallMouseClicked

    private void bshelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bshelfActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);
        isbn.setEnabled(true);
        nbook.setEnabled(true);
        title.setEnabled(true);
        author.setEnabled(true);
        edition.setEnabled(true);
        shelf.setEnabled(true);
        row.setEnabled(true);
        column.setEnabled(true);
        insert.setEnabled(true);
        clear.setEnabled(true);

        jLabel48.setEnabled(true);
        jLabel49.setEnabled(true);
        jLabel50.setEnabled(true);
        jLabel51.setEnabled(true);
        jLabel52.setEnabled(true);
        jLabel53.setEnabled(true);
        jLabel54.setEnabled(true);
        jLabel55.setEnabled(true);

        listT.setEnabled(true);
        eisbn.setEnabled(true);
        eisbn1.setEnabled(true);
        enbook.setEnabled(true);
        etitle.setEnabled(true);
        eauthor.setEnabled(true);
        eedition.setEnabled(true);
        eshelf.setEnabled(true);
        erow.setEnabled(true);
        ecolum.setEnabled(true);
        esearch.setEnabled(true);
        eupdate.setEnabled(true);
        jLabel56.setEnabled(true);
        jLabel57.setEnabled(true);
        jLabel58.setEnabled(true);
        jLabel59.setEnabled(true);
        jLabel60.setEnabled(true);
        jLabel61.setEnabled(true);
        jLabel62.setEnabled(true);
        jLabel63.setEnabled(true);
        jLabel64.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
      
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
      
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
    
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
      

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Bshelf);
        Home.repaint();
        Home.revalidate();
        add.setSelected(true);

        String sql = " if not exists(select * from sysobjects where name='adminbook' and xtype='U') create table adminbook(isbn varchar(255) not null "
                + "primary key, nobook varchar(255) , title varchar(255),aname varchar(255), edition varchar(255), shelf varchar(255),"
                + "row varchar(255),colum varchar(255),Publication varchar(255))";

        try {
            PreparedStatement pst12 = conn.prepareStatement(sql);
            pst12.execute();
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_bshelfActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Dashboard.setVisible(true);
        Home.setVisible(false);
        menu.setVisible(true);
        menu2.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void greportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greportActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);
        eupdate.setEnabled(false);

        //for generate report
        gsinfo.setEnabled(true);
        gbinfo.setEnabled(true);
        gthistory.setEnabled(true);

        //for student information
        sdep.setEnabled(true);
        sdep1.setEnabled(true);
        sbatch.setEnabled(true);
        sbatch1.setEnabled(true);
        jScrollPane1.setEnabled(true);
        sall.setEnabled(true);
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);

        //for book information
        bisbn2.setEnabled(true);
        bshelf3.setEnabled(true);
        bisbn.setEnabled(true);
        bisbn1.setEnabled(true);
        bshelf1.setEnabled(true);
        bshelf2.setEnabled(true);
        ball.setEnabled(true);
        jScrollPane2.setEnabled(true);

        //for transaction History
        tfrom.setEnabled(true);
        tto.setEnabled(true);
        tsearch.setEnabled(true);
        // tall.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel15.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Greport);
        Home.repaint();
        Home.revalidate();
        gsinfo.setSelected(true);
    }//GEN-LAST:event_greportActionPerformed

    private void sbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbookActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);

        //Search book panel
        sname.setEnabled(true);
        sisbn.setEnabled(true);
        jLabel16.setEnabled(true);
        ssearch.setEnabled(true);
        sbookname.setEnabled(true);
        Sboookname.setEnabled(true);

        //search by ISBN number
        isbnno.setEnabled(true);
        isbnsearch.setEnabled(true);
        isbn1.setEnabled(true);
        isbntitle.setEnabled(true);
        isbnauthour.setEnabled(true);
        isbnedition.setEnabled(true);
        isbntotal.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Sbook);
        Home.repaint();
        Home.revalidate();
        sname.setSelected(true);
    }//GEN-LAST:event_sbookActionPerformed

    private void mborrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mborrowerActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);

        //for borrower list
        jScrollPane5.setEnabled(true);

        //for Return Book
        rstid.setEnabled(true);
        renter.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
        jLabel43.setEnabled(true);
        jLabel44.setEnabled(true);
        jLabel45.setEnabled(true);
        jLabel46.setEnabled(true);
        jLabel47.setEnabled(true);
        jPanel8.setEnabled(true);
        jPanel9.setEnabled(true);
        jScrollPane6.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Mborrower);
        Home.repaint();
        Home.revalidate();
        bb.setSelected(true);

        String sql = "if not exists (select * from sysobjects where name='borrower' and xtype='U') create table borrower(id varchar(255) "
                + "foreign key references lstudentlogin(id), isbn varchar(255) unique,name varchar(255), department varchar(255),"
                + "batch varchar(255),title varchar(255),Borrow_date date, Return_date date)";

        String sql2 = " if not exists (select * from sysobjects where name='borrowered' and xtype='U')create table borrowered(id varchar(255) "
                + "foreign key references lstudentlogin(id), isbn varchar(255) ,name varchar(255),department varchar(255),batch varchar(255),"
                + "title varchar(255),Borrow_date date, Return_date date)";

        try {
            PreparedStatement pst55 = conn.prepareStatement(sql);
            PreparedStatement pst54 = conn.prepareStatement(sql2);
            pst55.execute();
            pst54.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_mborrowerActionPerformed

    private void asettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asettingActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Lsetting);
        Home.repaint();
        Home.revalidate();
    }//GEN-LAST:event_asettingActionPerformed

    private void gsinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsinfoActionPerformed
        GR.removeAll();
        GR.repaint();
        GR.revalidate();

        GR.add(st);
        GR.repaint();
        GR.revalidate();

        String sql = "select id,name,password,email,batch,dep from lstudentsetting ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tstinfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_gsinfoActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        boro.removeAll();
        boro.repaint();
        boro.revalidate();

        boro.add(BB);
        boro.repaint();
        boro.revalidate();
    }//GEN-LAST:event_bbActionPerformed

    private void blActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blActionPerformed
        boro.removeAll();
        boro.repaint();
        boro.revalidate();

        boro.add(BL);
        boro.repaint();
        boro.revalidate();

        bstid.setText("");
        bdate.setDate(null);
        rdate.setDate(null);
        bname.setText("");
        bdep.setText("");
        bbatch.setText("");
        bbtitle.setText("");

        String sql = "select id,isbn,name,department,batch,Borrow_date,Return_date from borrower ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tborrower.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_blActionPerformed

    private void rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActionPerformed
        boro.removeAll();
        boro.repaint();
        boro.revalidate();

        boro.add(RB);
        boro.repaint();
        boro.revalidate();

        try {
            String sql = "select  id,Borrow_date,Return_date from borrower";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            treturnbook.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rbActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        sear.removeAll();
        sear.repaint();
        sear.revalidate();

        sear.add(SN);
        sear.repaint();
        sear.revalidate();
        isbnno.setText("");
        isbn1.setText("");
        isbntitle.setText("");
        isbnauthour.setText("");
        isbnedition.setText("");
        isbntotal.setText("");
    }//GEN-LAST:event_snameActionPerformed

    private void sisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisbnActionPerformed
        sear.removeAll();
        sear.repaint();
        sear.revalidate();

        sear.add(SIN);
        sear.repaint();
        sear.revalidate();

        sbookname.setText("");
        DefaultTableModel dm = (DefaultTableModel) Sboookname.getModel();
        dm.setRowCount(0);
        Sboookname.revalidate();
    }//GEN-LAST:event_sisbnActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        bsel.removeAll();
        bsel.repaint();
        bsel.revalidate();

        bsel.add(Add);
        bsel.repaint();
        bsel.revalidate();
       
    }//GEN-LAST:event_addActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        bsel.removeAll();
        bsel.repaint();
        bsel.revalidate();

        bsel.add(List);
        bsel.repaint();
        bsel.revalidate();
    }//GEN-LAST:event_listActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        bsel.removeAll();
        bsel.repaint();
        bsel.revalidate();

        bsel.add(Edit);
        bsel.repaint();
        bsel.revalidate();
    }//GEN-LAST:event_editActionPerformed

    private void requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestActionPerformed
        bsel.removeAll();
        bsel.repaint();
        bsel.revalidate();

        bsel.add(Request);
        bsel.repaint();
        bsel.revalidate();
       
        String sql = "select Book_Title,Authour_Name,Edition,Publication from brequest ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbrequest.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_requestActionPerformed

    private void lg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lg1MouseClicked

    private void lg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lg1ActionPerformed
        Welcome w = new Welcome();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lg1ActionPerformed

    private void label7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label7MouseClicked

    private void bg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg4MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }

    }//GEN-LAST:event_bg4MouseClicked

    private void moreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);


    }//GEN-LAST:event_moreActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void dashbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbMouseClicked
        if (dashb.isShowing()) {
            menu.setVisible(true);
            menu2.setVisible(false);

            more.setEnabled(true);
        }

    }//GEN-LAST:event_dashbMouseClicked

    private void lname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1MouseClicked

    private void lemail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lemail1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lemail1MouseClicked

    private void lusername1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lusername1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lusername1MouseClicked

    private void lupdate2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lupdate2MouseClicked
        try {

            String sql = "update adminsetting set  phone='" + phn.getText() + "' where name='" + lname1.getText() + "'   ";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Phone number is updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_lupdate2MouseClicked

    private void lcpass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcpass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lcpass1MouseClicked

    private void lfathernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lfathernameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for librarian setting
        cpass.setEnabled(true);
        npass.setEnabled(true);
        cnpass.setEnabled(true);
        lupdate.setEnabled(true);
        lfathername.setEnabled(true);
        lmothername.setEnabled(true);
        phn.setEnabled(true);
        lcpass1.setEnabled(true);
        lupdate2.setEnabled(true);
        jPanel11.setEnabled(true);
        jPanel12.setEnabled(true);
        jLabel72.setEnabled(true);
        jLabel73.setEnabled(true);
        jLabel74.setEnabled(true);
        jLabel75.setEnabled(true);
        jLabel76.setEnabled(true);
        jLabel77.setEnabled(true);

    }//GEN-LAST:event_lfathernameMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        isbn.setText("");
        nbook.setText("");
        title.setText("");
        author.setText("");
        edition.setText("");
        shelf.setText("");
        row.setText("");
        column.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void eupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eupdateActionPerformed

    private void bisbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bisbnMouseClicked
        bisbn.setText("");
        DefaultTableModel dm = (DefaultTableModel) abookinfo.getModel();
        dm.setRowCount(0);
        abookinfo.revalidate();
    }//GEN-LAST:event_bisbnMouseClicked

    private void bisbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bisbnKeyReleased
        String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where isbn=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bisbn.getText());
            rs = pst.executeQuery();
            abookinfo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bisbnKeyReleased

    private void bisbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bisbn1MouseClicked
        MessageFormat header = new MessageFormat("Generate Report By ISBN Number");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            abookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bisbn1MouseClicked

    private void bshelf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelf1MouseClicked
        bisbn.setText("");
        bshelf1.setText("");
        DefaultTableModel dm = (DefaultTableModel) abookinfo.getModel();
        dm.setRowCount(0);
        abookinfo.revalidate();
    }//GEN-LAST:event_bshelf1MouseClicked

    private void bshelf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bshelf1KeyReleased
        String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where shelf=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bshelf1.getText());
            rs = pst.executeQuery();
            abookinfo.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bshelf1KeyReleased

    private void bshelf2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelf2MouseClicked
        MessageFormat header = new MessageFormat("Generate Report By Book Shelf");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            abookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bshelf2MouseClicked

    private void sdepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdepMouseClicked
        sdep.setText("");
        sbatch.setText("");
        DefaultTableModel dm = (DefaultTableModel) tstinfo.getModel();
        dm.setRowCount(0);
        tstinfo.revalidate();

    }//GEN-LAST:event_sdepMouseClicked

    private void sdepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdepKeyReleased
        String sql = "select id,name,password,email,batch,dep from lstudentsetting where dep=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, sdep.getText());
            rs = pst.executeQuery();
            tstinfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sdepKeyReleased

    private void sdep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdep1ActionPerformed
        MessageFormat header = new MessageFormat("Generate Report By All student Info");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tstinfo.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sdep1ActionPerformed

    private void sbatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbatchMouseClicked
        sdep.setText("");
        sbatch.setText("");

        DefaultTableModel dm = (DefaultTableModel) tstinfo.getModel();
        dm.setRowCount(0);
        tstinfo.revalidate();
    }//GEN-LAST:event_sbatchMouseClicked

    private void sbatchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbatchKeyReleased
        String sql = "select id,name,password,email,batch,dep from lstudentsetting where batch=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, sbatch.getText());
            rs = pst.executeQuery();
            tstinfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sbatchKeyReleased

    private void sbatch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbatch1ActionPerformed
        MessageFormat header = new MessageFormat("Generate Report By All student Info");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tstinfo.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sbatch1ActionPerformed

    private void sallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sallActionPerformed
        MessageFormat header = new MessageFormat("Generate Report By All student Info");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tstinfo.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_sallActionPerformed

    private void bisbnnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bisbnnoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //Manage borrower 
        bb.setEnabled(true);
        bl.setEnabled(true);
        rb.setEnabled(true);

        //for borrower book
        jPanel5.setEnabled(true);
        jPanel6.setEnabled(true);
        jPanel7.setEnabled(true);
        bstid.setEnabled(true);
        bdate.setEnabled(true);
        rdate.setEnabled(true);
        benter.setEnabled(true);
        bname.setEnabled(true);
        bdep.setEnabled(true);
        bbatch.setEnabled(true);
        bbtitle.setEnabled(true);
        bisbnno.setEnabled(true);
        bok.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        jLabel33.setEnabled(true);
        jLabel34.setEnabled(true);
    }//GEN-LAST:event_bisbnnoMouseClicked

    private void rpublicatonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpublicatonMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);
        Request.setVisible(true);
        Add.setVisible(false);
        Edit.setVisible(false);
        List.setVisible(false);

        add.setEnabled(true);
        list.setEnabled(true);
        edit.setEnabled(true);
        request.setEnabled(true);

        //for book request
        jScrollPane8.setEnabled(true);
        
        rtitle.setEnabled(true);
        rauthor.setEnabled(true);
        redition.setEnabled(true);
       
        rpublicaton.setEnabled(true);
        
        rinsert.setEnabled(true);
        rdelete.setEnabled(true);
     
        jLabel66.setEnabled(true);
        jLabel67.setEnabled(true);
        jLabel68.setEnabled(true);
        
    }//GEN-LAST:event_rpublicatonMouseClicked

    private void rstidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rstidKeyReleased
        try {
            String sql = "Select * from borrower where id='" + rstid.getText() + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String a = rs.getString("isbn");
                String b = rs.getString("Borrow_date");
                String c = rs.getString("Return_date");
                jLabel42.setText(a);
                jLabel43.setText(b);
                jLabel44.setText(c);
                ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(c);
                Date d = new Date();
                SimpleDateFormat e = new SimpleDateFormat("yyy-MM-dd");
                jLabel45.setText(e.format(d));
                jDateChooser2.setDate(d);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_rstidKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      SimpleDateFormat a1 = new SimpleDateFormat("yyyy-M-dd");
        Date a = null;
        Date b = null;

        String bal = jDateChooser2.getDateFormatString();
        String bal1 = jDateChooser1.getDateFormatString();

        System.out.println(bal);
        System.out.println(bal1);
        try {
            a = a1.parse(a1.format(jDateChooser1.getDate()));
            b = a1.parse(a1.format(jDateChooser2.getDate()));

        } catch (ParseException e) {
            System.out.println(e);
        }

        long diff1 = b.getTime() - a.getTime();
        long hour = diff1 / (60 * 60 * 1000);
        long days = hour / 24;
        if (days > 0) {
            System.out.println(days);
            jLabel46.setText(Long.toString(days));

            long sum = days * 10;
            jLabel47.setText(Long.toString(sum));
            //  System.out.println(sum);
        } else {
            jLabel46.setText("0");
            jLabel47.setText("0");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

    }//GEN-LAST:event_insertActionPerformed

    private void pubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pubMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pubMouseClicked

    private void studentmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmMouseEntered
        if (student.isShowing()) {

            studentm.setOpaque(true);
            studentm.setForeground(new Color(51, 204, 255, 255));
        } else {

            studentm.setOpaque(true);
            studentm.setForeground(new Color(51, 204, 255, 255));
        }
    }//GEN-LAST:event_studentmMouseEntered

    private void studentmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentmMouseExited
        if (student.isShowing()) {

            studentm.setOpaque(true);
            studentm.setForeground(new Color(51, 204, 255, 255));
        } else {

            studentm.setOpaque(false);
            studentm.setForeground(new Color(240, 240, 240, 255));
        }
    }//GEN-LAST:event_studentmMouseExited

    private void studentmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentmActionPerformed
        Dashboard.setVisible(false);
        menu2.setVisible(false);
        menu.setVisible(true);
        Home.setVisible(true);

        id.setEnabled(true);
        name.setEnabled(true);
        batch.setEnabled(true);
        department.setEnabled(true);
        email.setEnabled(true);
        password.setEnabled(true);
        contact.setEnabled(true);
        addstudent.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(student);
        Home.repaint();
        Home.revalidate();

        String sql = "if not exists(select * from sysobjects where name='lstudentlogin' and xtype='U')"
                + "create table lstudentlogin(id varchar(255) not null primary key, username varchar(255) unique, password varchar(255))";
        
        String sql1 ="if not exists (select * from sysobjects where name='lstudentsetting' and xtype='U')"
                + "create table lstudentsetting(id varchar(255) foreign key references lstudentlogin(id),name varchar(255), dob date,"
                + "phone varchar(255), password varchar(255),email varchar(255),dep varchar(255), batch varchar(255))";
        
        try {
            PreparedStatement pst55 = conn.prepareStatement(sql);
            PreparedStatement pst54 = conn.prepareStatement(sql1);
            pst55.execute();
            pst54.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_studentmActionPerformed

    private void contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyReleased
//        String e = "^[A-Za-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
//        Pattern p = Pattern.compile(e);
//        Matcher mat = p.matcher(contact.getText());
//        if (mat.matches()) {
//            Toolkit toolkit = Toolkit.getDefaultToolkit();
//            Image i = toolkit.getImage(getClass().getResource("Light On.png"));
//            ImageIcon ic = new ImageIcon(i);
//
//        } else {
//            Toolkit toolkit = Toolkit.getDefaultToolkit();
//            Image i = toolkit.getImage(getClass().getResource("Light Off.png"));
//            ImageIcon ic = new ImageIcon(i);
//
//        }

    }//GEN-LAST:event_contactKeyReleased

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    private void label8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label8MouseClicked

    private void label9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label9MouseClicked

    private void reditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reditionActionPerformed

    private void label10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label10MouseClicked

    private void label11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label11MouseClicked

    private void label12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label12MouseClicked

    private void label13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label13MouseClicked

    private void label14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label14MouseClicked

    private void label15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label15MouseClicked

    private void label16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label16MouseClicked

    private void label17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label17MouseClicked

    private void label18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label18MouseClicked

    private void label19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label19MouseClicked

    private void label20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label20MouseClicked

    private void label21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label21MouseClicked

    private void renterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renterActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bokActionPerformed

    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentActionPerformed
        String a = id.getText();
        String b= username.getText();
        String c = name.getText();
        String d = batch.getText();
        String e = department.getText();
        String f= email.getText();
        String g = contact.getText();
        String h = ((JTextField)stdob.getDateEditor().getUiComponent()).getText();
        String i = password.getText();
        
        String sql = "insert into lstudentlogin(id,username,password) values(?,?,?)";
        String sql2= "insert into lstudentsetting(id,name,dob,phone,password,email,dep,batch) values (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst40 = conn.prepareStatement(sql);
            PreparedStatement pst41 = conn.prepareStatement(sql2);
            pst40.setString(1, a);
            pst40.setString(2, b);
            pst40.setString(3, i);
            pst40.execute();
            pst41.setString(1, a);
            pst41.setString(2, c);
            pst41.setString(3, h);
            pst41.setString(4, g);
            pst41.setString(5, i);
            pst41.setString(6, f);
            pst41.setString(7, e);
            pst41.setString(8, d);
            pst41.execute();
        } catch (SQLException e1) {
            System.out.println(e1);
        }
        
    }//GEN-LAST:event_addstudentActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel BB;
    private javax.swing.JPanel BI;
    private javax.swing.JPanel BL;
    private javax.swing.JPanel Bshelf;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Edit;
    private javax.swing.JPanel GR;
    private javax.swing.JPanel Greport;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel List;
    private javax.swing.JPanel Lsetting;
    private javax.swing.JPanel Mborrower;
    private javax.swing.JPanel RB;
    private javax.swing.JPanel Request;
    private javax.swing.JPanel SIN;
    private javax.swing.JPanel SN;
    private javax.swing.JPanel Sbook;
    private javax.swing.JTable Sboookname;
    private javax.swing.JPanel TH;
    private javax.swing.JTable abookinfo;
    private javax.swing.JToggleButton add;
    private javax.swing.JButton addstudent;
    private javax.swing.JButton asetting;
    private javax.swing.JTable atransaction;
    private javax.swing.JTextField author;
    private javax.swing.JButton ball;
    private javax.swing.JTextField batch;
    private javax.swing.JToggleButton bb;
    private javax.swing.JTextField bbatch;
    private javax.swing.JTextField bbtitle;
    private com.toedter.calendar.JDateChooser bdate;
    private javax.swing.JTextField bdep;
    private javax.swing.JButton benter;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel bg5;
    private javax.swing.JLabel bg6;
    private javax.swing.JLabel bg7;
    private javax.swing.JTextField bisbn;
    private javax.swing.JButton bisbn1;
    private javax.swing.JLabel bisbn2;
    private javax.swing.JTextField bisbnno;
    private javax.swing.JToggleButton bl;
    public static javax.swing.JLabel blood;
    private javax.swing.JTextField bname;
    private javax.swing.JButton bok;
    private javax.swing.JPanel boro;
    private javax.swing.JPanel bsel;
    private javax.swing.JButton bshelf;
    private javax.swing.JTextField bshelf1;
    private javax.swing.JButton bshelf2;
    private javax.swing.JLabel bshelf3;
    private javax.swing.JTextField bstid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    public static javax.swing.JTextField cnpass;
    private javax.swing.JTextField column;
    private javax.swing.JTextField contact;
    public static javax.swing.JTextField cpass;
    private javax.swing.JPanel dashb;
    private javax.swing.JTextField department;
    public static javax.swing.JLabel dob;
    private javax.swing.JTextField eauthor;
    private javax.swing.JTextField ecolum;
    private javax.swing.JToggleButton edit;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField eedition;
    private javax.swing.JTextField eisbn;
    private javax.swing.JTextField eisbn1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField enbook;
    private javax.swing.JTextField erow;
    private javax.swing.JButton esearch;
    private javax.swing.JTextField eshelf;
    private javax.swing.JTextField etitle;
    private javax.swing.JButton eupdate;
    public static javax.swing.JLabel fathername;
    private javax.swing.JToggleButton gbinfo;
    private javax.swing.JButton greport;
    private javax.swing.JToggleButton gsinfo;
    private javax.swing.JToggleButton gthistory;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JTextField isbn;
    private javax.swing.JTextField isbn1;
    private javax.swing.JTextField isbnauthour;
    private javax.swing.JTextField isbnedition;
    private javax.swing.JTextField isbnno;
    private javax.swing.JButton isbnsearch;
    private javax.swing.JTextField isbntitle;
    private javax.swing.JTextField isbntotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
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
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
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
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
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
    private javax.swing.JSeparator jSeparator29;
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
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    public static javax.swing.JTextField lcpass1;
    public static javax.swing.JTextField lemail1;
    public static javax.swing.JTextField lfathername;
    private javax.swing.JButton lg1;
    private javax.swing.JToggleButton list;
    private javax.swing.JScrollPane listT;
    private javax.swing.JTable listofbook;
    public static javax.swing.JTextField lmothername;
    public static javax.swing.JTextField lname1;
    private javax.swing.JButton logout;
    private javax.swing.JButton lupdate;
    private javax.swing.JButton lupdate2;
    public static javax.swing.JTextField lusername1;
    private javax.swing.JButton mborrower;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton minimize;
    private javax.swing.JButton more;
    public static javax.swing.JLabel mothername;
    public static javax.swing.JLabel nam;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nbook;
    public static javax.swing.JTextField npass;
    private javax.swing.JTextField password;
    public static javax.swing.JTextField phn;
    public static javax.swing.JLabel phone;
    private javax.swing.JTextField pub;
    private javax.swing.JTextField pub1;
    private javax.swing.JTextField rauthor;
    private javax.swing.JToggleButton rb;
    private com.toedter.calendar.JDateChooser rdate;
    private javax.swing.JButton rdelete;
    private javax.swing.JTextField redition;
    private javax.swing.JButton renter;
    private javax.swing.JToggleButton request;
    private javax.swing.JButton rinsert;
    private javax.swing.JTextField row;
    private javax.swing.JTextField rpublicaton;
    private javax.swing.JTextField rstid;
    private javax.swing.JTextField rtitle;
    private javax.swing.JButton sall;
    private javax.swing.JTextField sbatch;
    private javax.swing.JButton sbatch1;
    private javax.swing.JButton sbook;
    private javax.swing.JTextField sbookname;
    private javax.swing.JTextField sdep;
    private javax.swing.JButton sdep1;
    private javax.swing.JPanel sear;
    private javax.swing.JTextField shelf;
    private javax.swing.JToggleButton sisbn;
    private javax.swing.JToggleButton sname;
    private javax.swing.JButton ssearch;
    private javax.swing.JPanel st;
    private com.toedter.calendar.JDateChooser stdob;
    private javax.swing.JPanel student;
    private javax.swing.JButton studentm;
    private javax.swing.JButton tall;
    private javax.swing.JTable tborrower;
    private javax.swing.JTable tbrequest;
    private com.toedter.calendar.JDateChooser tfrom;
    private javax.swing.JTextField title;
    private javax.swing.JTable treturnbook;
    private javax.swing.JButton tsearch;
    private javax.swing.JTable tstinfo;
    private com.toedter.calendar.JDateChooser tto;
    public static javax.swing.JLabel usern1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

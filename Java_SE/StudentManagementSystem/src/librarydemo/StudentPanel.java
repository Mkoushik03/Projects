package librarydemo;

import Main.Connect;
import Main.Welcome;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class StudentPanel extends javax.swing.JFrame {

    int lastX;
    int lastY;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public StudentPanel() {
        initComponents();
        menu2.setVisible(false);
        Home.setVisible(false);
        conn = Connect.Studentdb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu2 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        borow = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        greport = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        sbook = new javax.swing.JButton();
        bshelf = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        breq = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        Borrow = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowbook = new javax.swing.JTable();
        label17 = new java.awt.Label();
        SearchBook = new javax.swing.JPanel();
        sboo = new javax.swing.JToggleButton();
        sisb = new javax.swing.JToggleButton();
        search = new javax.swing.JPanel();
        Sbook = new javax.swing.JPanel();
        bookname1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbookname = new javax.swing.JTable();
        label12 = new java.awt.Label();
        Sisbn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sisbn1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sisbn2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        sbname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        sauthor = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        sedition = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        scopy = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        label13 = new java.awt.Label();
        jLabel46 = new javax.swing.JLabel();
        bg7 = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sspass = new javax.swing.JTextField();
        ssnpass = new javax.swing.JTextField();
        sscnpass = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ssid = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        ssname = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        ssemail = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        ssphn = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        sscnpass1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        label11 = new java.awt.Label();
        jLabel45 = new javax.swing.JLabel();
        bg5 = new javax.swing.JLabel();
        Generatereport = new javax.swing.JPanel();
        parent = new javax.swing.JPanel();
        Bookinfo = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        bisbn = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        bbshelf = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbookinfo = new javax.swing.JTable();
        label8 = new java.awt.Label();
        THistory = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        tfr = new com.toedter.calendar.JDateChooser();
        jButton9 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        tto = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        trans = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        label9 = new java.awt.Label();
        Mostborrowed = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        label10 = new java.awt.Label();
        bookin = new javax.swing.JToggleButton();
        thist = new javax.swing.JToggleButton();
        most = new javax.swing.JToggleButton();
        jLabel96 = new javax.swing.JLabel();
        bg6 = new javax.swing.JLabel();
        BookReqest = new javax.swing.JPanel();
        bookreq = new javax.swing.JPanel();
        Add = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rbtitle = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        rbauthor = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        rbedition = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rbadd = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        rbpublication = new javax.swing.JTextField();
        label18 = new java.awt.Label();
        Request = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        label19 = new java.awt.Label();
        add = new javax.swing.JToggleButton();
        req = new javax.swing.JToggleButton();
        BookShelf = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookshelf1 = new javax.swing.JTable();
        label16 = new java.awt.Label();
        dashboard = new javax.swing.JPanel();
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
        snam = new javax.swing.JLabel();
        sdob = new javax.swing.JLabel();
        sphone = new javax.swing.JLabel();
        sblood = new javax.swing.JLabel();
        sfathername = new javax.swing.JLabel();
        smothername = new javax.swing.JLabel();
        usern1 = new javax.swing.JLabel();
        lg1 = new javax.swing.JButton();
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

        borow.setBackground(new java.awt.Color(78, 102, 102));
        borow.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        borow.setForeground(new java.awt.Color(240, 240, 240));
        borow.setText("Borrow Book");
        borow.setBorderPainted(false);
        borow.setContentAreaFilled(false);
        borow.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        borow.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        borow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borowMouseExited(evt);
            }
        });
        borow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borowActionPerformed(evt);
            }
        });
        menu2.add(borow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 40));

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
        menu2.add(greport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 40));

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

        settings.setBackground(new java.awt.Color(78, 102, 102));
        settings.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        settings.setForeground(new java.awt.Color(240, 240, 240));
        settings.setText("Setting ");
        settings.setBorderPainted(false);
        settings.setContentAreaFilled(false);
        settings.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        menu2.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 40));

        breq.setBackground(new java.awt.Color(78, 102, 102));
        breq.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        breq.setForeground(new java.awt.Color(240, 240, 240));
        breq.setText("Book Request");
        breq.setBorderPainted(false);
        breq.setContentAreaFilled(false);
        breq.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        breq.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        breq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                breqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                breqMouseExited(evt);
            }
        });
        breq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breqActionPerformed(evt);
            }
        });
        menu2.add(breq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 40));

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

        Home.setMinimumSize(new java.awt.Dimension(1246, 655));
        Home.setPreferredSize(new java.awt.Dimension(1246, 655));
        Home.setLayout(new java.awt.CardLayout());

        Borrow.setMinimumSize(new java.awt.Dimension(1220, 655));
        Borrow.setPreferredSize(new java.awt.Dimension(1220, 655));
        Borrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowMouseClicked(evt);
            }
        });
        Borrow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        borrowbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "isbn", "name", "department", "batch", "Borrow_date", "Return_date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        borrowbook.setIntercellSpacing(new java.awt.Dimension(5, 5));
        borrowbook.setRowHeight(20);
        borrowbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowbookMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(borrowbook);
        if (borrowbook.getColumnModel().getColumnCount() > 0) {
            borrowbook.getColumnModel().getColumn(0).setPreferredWidth(10);
            borrowbook.getColumnModel().getColumn(1).setResizable(false);
            borrowbook.getColumnModel().getColumn(2).setResizable(false);
            borrowbook.getColumnModel().getColumn(2).setPreferredWidth(10);
            borrowbook.getColumnModel().getColumn(3).setResizable(false);
            borrowbook.getColumnModel().getColumn(3).setPreferredWidth(10);
            borrowbook.getColumnModel().getColumn(4).setResizable(false);
            borrowbook.getColumnModel().getColumn(5).setResizable(false);
            borrowbook.getColumnModel().getColumn(6).setResizable(false);
        }

        Borrow.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1200, 500));

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
        Borrow.add(label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        Home.add(Borrow, "card6");

        SearchBook.setMinimumSize(new java.awt.Dimension(1246, 655));
        SearchBook.setPreferredSize(new java.awt.Dimension(1246, 655));
        SearchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBookMouseClicked(evt);
            }
        });
        SearchBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(sboo);
        sboo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sboo.setText("Search Book By Name");
        sboo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbooActionPerformed(evt);
            }
        });
        SearchBook.add(sboo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, 35));

        buttonGroup1.add(sisb);
        sisb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sisb.setText("Search By ISBN Number");
        sisb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisbActionPerformed(evt);
            }
        });
        SearchBook.add(sisb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, 35));

        search.setMinimumSize(new java.awt.Dimension(1246, 535));
        search.setPreferredSize(new java.awt.Dimension(1246, 535));
        search.setLayout(new java.awt.CardLayout());

        Sbook.setMinimumSize(new java.awt.Dimension(1246, 535));
        Sbook.setPreferredSize(new java.awt.Dimension(1246, 535));
        Sbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookname1.setBorder(null);
        bookname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookname1MouseClicked(evt);
            }
        });
        Sbook.add(bookname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 280, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Book Name");
        Sbook.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Sbook.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 100, 40));

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tbookname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Authour", "Edition", "Book Shelf", "Row", "Colum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbookname.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tbookname.setRowHeight(20);
        tbookname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbooknameMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbookname);
        if (tbookname.getColumnModel().getColumnCount() > 0) {
            tbookname.getColumnModel().getColumn(0).setResizable(false);
            tbookname.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbookname.getColumnModel().getColumn(1).setResizable(false);
            tbookname.getColumnModel().getColumn(1).setPreferredWidth(10);
            tbookname.getColumnModel().getColumn(2).setResizable(false);
            tbookname.getColumnModel().getColumn(2).setPreferredWidth(10);
            tbookname.getColumnModel().getColumn(3).setResizable(false);
            tbookname.getColumnModel().getColumn(4).setResizable(false);
            tbookname.getColumnModel().getColumn(4).setPreferredWidth(10);
            tbookname.getColumnModel().getColumn(5).setResizable(false);
            tbookname.getColumnModel().getColumn(5).setPreferredWidth(10);
            tbookname.getColumnModel().getColumn(6).setResizable(false);
            tbookname.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        Sbook.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 940, 360));

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
        Sbook.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        search.add(Sbook, "card3");

        Sisbn.setMinimumSize(new java.awt.Dimension(1246, 535));
        Sisbn.setPreferredSize(new java.awt.Dimension(1246, 535));
        Sisbn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ISBN No");
        jLabel11.setToolTipText("");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        Sisbn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 110, 20));

        sisbn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sisbn1.setBorder(null);
        sisbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sisbn1MouseClicked(evt);
            }
        });
        Sisbn.add(sisbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 290, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        Sisbn.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 110, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("ISBN NO");
        Sisbn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 155, 70, 22));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("Book Name");
        Sisbn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 215, 80, 22));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Author Name");
        Sisbn.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 275, 90, 22));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("Edition");
        Sisbn.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 345, 50, 22));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Total Number Of Copies");
        Sisbn.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 415, 170, 22));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(":");
        Sisbn.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 155, 30, 20));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(":");
        Sisbn.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 30, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText(":");
        Sisbn.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 275, 30, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(":");
        Sisbn.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 345, 30, 20));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(":");
        Sisbn.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 415, 30, 20));

        sisbn2.setEditable(false);
        sisbn2.setBackground(new java.awt.Color(255, 255, 255));
        sisbn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sisbn2.setBorder(null);
        sisbn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sisbn2MouseClicked(evt);
            }
        });
        Sisbn.add(sisbn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 300, 30));
        Sisbn.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 300, 10));

        sbname.setEditable(false);
        sbname.setBackground(new java.awt.Color(255, 255, 255));
        sbname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sbname.setBorder(null);
        sbname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbnameMouseClicked(evt);
            }
        });
        Sisbn.add(sbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 300, 30));
        Sisbn.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 300, 10));

        sauthor.setEditable(false);
        sauthor.setBackground(new java.awt.Color(255, 255, 255));
        sauthor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sauthor.setBorder(null);
        sauthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sauthorMouseClicked(evt);
            }
        });
        Sisbn.add(sauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 300, 30));
        Sisbn.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 300, 10));

        sedition.setEditable(false);
        sedition.setBackground(new java.awt.Color(255, 255, 255));
        sedition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sedition.setBorder(null);
        sedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seditionMouseClicked(evt);
            }
        });
        Sisbn.add(sedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 300, 30));
        Sisbn.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 300, 10));

        scopy.setEditable(false);
        scopy.setBackground(new java.awt.Color(255, 255, 255));
        scopy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scopy.setBorder(null);
        scopy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scopyMouseClicked(evt);
            }
        });
        Sisbn.add(scopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 300, 30));
        Sisbn.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 300, 10));

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
        Sisbn.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        search.add(Sisbn, "card2");

        SearchBook.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 102, 102));
        jLabel46.setText("Search Book");
        SearchBook.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 130, 30));

        bg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        SearchBook.add(bg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(SearchBook, "card8");

        Setting.setMinimumSize(new java.awt.Dimension(1246, 655));
        Setting.setPreferredSize(new java.awt.Dimension(1246, 655));
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingMouseClicked(evt);
            }
        });
        Setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Info", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Current password:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("New Password:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("Confirm Password:");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        sspass.setEditable(false);
        sspass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sspass.setBorder(null);
        sspass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sspassMouseClicked(evt);
            }
        });
        jPanel4.add(sspass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, 30));

        ssnpass.setBackground(new java.awt.Color(240, 240, 240));
        ssnpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssnpass.setBorder(null);
        ssnpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssnpassMouseClicked(evt);
            }
        });
        jPanel4.add(ssnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 280, 30));

        sscnpass.setBackground(new java.awt.Color(240, 240, 240));
        sscnpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sscnpass.setBorder(null);
        sscnpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sscnpassMouseClicked(evt);
            }
        });
        jPanel4.add(sscnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 280, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 5));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 280, 5));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 280, 5));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 110, 40));

        Setting.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 370, 320));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Info", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Student Id:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Student name:");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Email:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Phone:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 14));

        ssid.setEditable(false);
        ssid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssid.setBorder(null);
        ssid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssidMouseClicked(evt);
            }
        });
        jPanel5.add(ssid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, 5));

        ssname.setEditable(false);
        ssname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssname.setBorder(null);
        ssname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssnameMouseClicked(evt);
            }
        });
        jPanel5.add(ssname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 30));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 5));

        ssemail.setBackground(new java.awt.Color(240, 240, 240));
        ssemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssemail.setBorder(null);
        ssemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssemailMouseClicked(evt);
            }
        });
        jPanel5.add(ssemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, 5));

        ssphn.setBackground(new java.awt.Color(240, 240, 240));
        ssphn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssphn.setBorder(null);
        ssphn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssphnMouseClicked(evt);
            }
        });
        jPanel5.add(ssphn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 5));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Update");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 160, 40));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 270, 5));

        sscnpass1.setBackground(new java.awt.Color(240, 240, 240));
        sscnpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sscnpass1.setBorder(null);
        sscnpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sscnpass1MouseClicked(evt);
            }
        });
        jPanel5.add(sscnpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 30));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Enter current password:");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 14));

        Setting.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 320, 490));

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
        Setting.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 102, 102));
        jLabel45.setText("Student Settings");
        Setting.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 170, 30));

        bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        Setting.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(Setting, "card7");

        Generatereport.setMinimumSize(new java.awt.Dimension(1246, 655));
        Generatereport.setPreferredSize(new java.awt.Dimension(1246, 655));
        Generatereport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneratereportMouseClicked(evt);
            }
        });
        Generatereport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parent.setMinimumSize(new java.awt.Dimension(1246, 535));
        parent.setPreferredSize(new java.awt.Dimension(1246, 535));
        parent.setLayout(new java.awt.CardLayout());

        Bookinfo.setMinimumSize(new java.awt.Dimension(1246, 535));
        Bookinfo.setPreferredSize(new java.awt.Dimension(1246, 535));
        Bookinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ISBN NO");
        Bookinfo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 210, 30));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Book Shelf");
        Bookinfo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 260, 220, 30));

        bisbn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        Bookinfo.add(bisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 220, 30));
        Bookinfo.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 220, 10));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Generate By ISBN No");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        Bookinfo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 220, 35));

        bbshelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bbshelf.setBorder(null);
        bbshelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbshelfMouseClicked(evt);
            }
        });
        bbshelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bbshelfKeyReleased(evt);
            }
        });
        Bookinfo.add(bbshelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, 220, 30));
        Bookinfo.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 220, 10));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Generate By Book Shelf");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Bookinfo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 340, 220, 35));

        jScrollPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseClicked(evt);
            }
        });

        tbookinfo.setModel(new javax.swing.table.DefaultTableModel(
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
        tbookinfo.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tbookinfo.setRowHeight(20);
        tbookinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbookinfoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbookinfo);
        if (tbookinfo.getColumnModel().getColumnCount() > 0) {
            tbookinfo.getColumnModel().getColumn(0).setResizable(false);
            tbookinfo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(1).setResizable(false);
            tbookinfo.getColumnModel().getColumn(1).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(2).setResizable(false);
            tbookinfo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(3).setResizable(false);
            tbookinfo.getColumnModel().getColumn(3).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(4).setResizable(false);
            tbookinfo.getColumnModel().getColumn(4).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(5).setResizable(false);
            tbookinfo.getColumnModel().getColumn(5).setPreferredWidth(10);
            tbookinfo.getColumnModel().getColumn(6).setResizable(false);
            tbookinfo.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        Bookinfo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 960, 480));

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
        Bookinfo.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        parent.add(Bookinfo, "card4");

        THistory.setMinimumSize(new java.awt.Dimension(1246, 535));
        THistory.setPreferredSize(new java.awt.Dimension(1246, 535));
        THistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("From");
        THistory.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 60, 30));
        THistory.add(tfr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 230, 30));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("Search");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        THistory.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 140, 35));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("To");
        THistory.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 60, 30));
        THistory.add(tto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 230, 30));

        jScrollPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane6MouseClicked(evt);
            }
        });

        trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "isbn", "name", "department", "batch", "borrow date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        trans.setIntercellSpacing(new java.awt.Dimension(5, 5));
        trans.setRowHeight(20);
        trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(trans);
        if (trans.getColumnModel().getColumnCount() > 0) {
            trans.getColumnModel().getColumn(0).setResizable(false);
            trans.getColumnModel().getColumn(0).setPreferredWidth(10);
            trans.getColumnModel().getColumn(1).setResizable(false);
            trans.getColumnModel().getColumn(1).setPreferredWidth(10);
            trans.getColumnModel().getColumn(2).setResizable(false);
            trans.getColumnModel().getColumn(2).setPreferredWidth(10);
            trans.getColumnModel().getColumn(3).setResizable(false);
            trans.getColumnModel().getColumn(3).setPreferredWidth(10);
            trans.getColumnModel().getColumn(5).setResizable(false);
        }

        THistory.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 1120, 300));

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton10.setText("Generate By All Transaction");
        jButton10.setBorder(null);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        THistory.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 530, 40));

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
        THistory.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        parent.add(THistory, "card3");

        Mostborrowed.setMinimumSize(new java.awt.Dimension(1246, 535));
        Mostborrowed.setPreferredSize(new java.awt.Dimension(1246, 535));
        Mostborrowed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("jLabel37");
        Mostborrowed.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 290, 80));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setText("jLabel38");
        Mostborrowed.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 290, 80));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("jLabel39");
        Mostborrowed.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 290, 80));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setText("Third Most Time Borrowed Book");
        Mostborrowed.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, -1, 50));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("Most Time Borrowed Book");
        Mostborrowed.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 50));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setText("Second Most Time Borrowed Book");
        Mostborrowed.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, 50));
        Mostborrowed.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, 10));
        Mostborrowed.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 290, 5));
        Mostborrowed.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 290, 5));

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
        Mostborrowed.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        parent.add(Mostborrowed, "card2");

        Generatereport.add(parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        buttonGroup3.add(bookin);
        bookin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bookin.setText("Book Information");
        bookin.setBorder(null);
        bookin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookinMouseClicked(evt);
            }
        });
        bookin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookinActionPerformed(evt);
            }
        });
        Generatereport.add(bookin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 180, 35));

        buttonGroup3.add(thist);
        thist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        thist.setText("Transaction History");
        thist.setBorder(null);
        thist.setBorderPainted(false);
        thist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thistMouseClicked(evt);
            }
        });
        thist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thistActionPerformed(evt);
            }
        });
        Generatereport.add(thist, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 200, 35));

        buttonGroup3.add(most);
        most.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        most.setText("Most Borrowed Books");
        most.setBorder(null);
        most.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostActionPerformed(evt);
            }
        });
        Generatereport.add(most, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 200, 35));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 102, 102));
        jLabel96.setText("Generate Report");
        Generatereport.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 180, 30));

        bg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        Generatereport.add(bg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1246, 50));

        Home.add(Generatereport, "card4");

        BookReqest.setMinimumSize(new java.awt.Dimension(1246, 655));
        BookReqest.setPreferredSize(new java.awt.Dimension(1246, 655));
        BookReqest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookReqestMouseClicked(evt);
            }
        });
        BookReqest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookreq.setMinimumSize(new java.awt.Dimension(1246, 535));
        bookreq.setPreferredSize(new java.awt.Dimension(1246, 535));
        bookreq.setLayout(new java.awt.CardLayout());

        Add.setMinimumSize(new java.awt.Dimension(1246, 535));
        Add.setPreferredSize(new java.awt.Dimension(1246, 535));
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtitle.setBorder(null);
        rbtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtitleMouseClicked(evt);
            }
        });
        jPanel6.add(rbtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 260, 30));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 260, 10));

        rbauthor.setBorder(null);
        rbauthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbauthorMouseClicked(evt);
            }
        });
        jPanel6.add(rbauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 260, 30));
        jPanel6.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 260, 10));

        rbedition.setBorder(null);
        rbedition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbeditionMouseClicked(evt);
            }
        });
        jPanel6.add(rbedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 260, 30));
        jPanel6.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 260, 10));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel31.setText("Authour Name:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 22));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setText("Book Title:");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, 100, 22));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel32.setText("Edition:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 22));

        rbadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbadd.setText("Add");
        rbadd.setBorder(null);
        rbadd.setBorderPainted(false);
        rbadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbaddMouseClicked(evt);
            }
        });
        jPanel6.add(rbadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 350, 40));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel44.setText("Publication:");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 80, 22));
        jPanel6.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 260, 10));

        rbpublication.setBorder(null);
        rbpublication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbpublicationMouseClicked(evt);
            }
        });
        jPanel6.add(rbpublication, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 260, 30));

        Add.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 530, 340));

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
        Add.add(label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        bookreq.add(Add, "card2");

        Request.setMinimumSize(new java.awt.Dimension(1246, 535));
        Request.setPreferredSize(new java.awt.Dimension(1246, 535));
        Request.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book Lisit", "Author Name", "Request", "Last Update", "Status", "Never"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable4.getColumnModel().getColumn(5).setResizable(false);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        Request.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 11, 1020, 450));

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
        Request.add(label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1246, 40));

        bookreq.add(Request, "card3");

        BookReqest.add(bookreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 1246, 535));

        buttonGroup2.add(add);
        add.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        add.setText("Add Request");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        BookReqest.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 150, 30));

        buttonGroup2.add(req);
        req.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        req.setText("Your Request");
        req.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reqMouseClicked(evt);
            }
        });
        req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqActionPerformed(evt);
            }
        });
        BookReqest.add(req, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, 30));

        Home.add(BookReqest, "card5");

        BookShelf.setMinimumSize(new java.awt.Dimension(1246, 655));
        BookShelf.setPreferredSize(new java.awt.Dimension(1246, 655));
        BookShelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookShelfMouseClicked(evt);
            }
        });
        BookShelf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        bookshelf1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Book List", "Authour", "Edition", "Book Shelf", "Row", "Colum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookshelf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookshelf1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookshelf1);
        if (bookshelf1.getColumnModel().getColumnCount() > 0) {
            bookshelf1.getColumnModel().getColumn(0).setResizable(false);
            bookshelf1.getColumnModel().getColumn(0).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(1).setResizable(false);
            bookshelf1.getColumnModel().getColumn(1).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(2).setResizable(false);
            bookshelf1.getColumnModel().getColumn(2).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(3).setResizable(false);
            bookshelf1.getColumnModel().getColumn(3).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(4).setResizable(false);
            bookshelf1.getColumnModel().getColumn(4).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(5).setResizable(false);
            bookshelf1.getColumnModel().getColumn(5).setPreferredWidth(10);
            bookshelf1.getColumnModel().getColumn(6).setResizable(false);
            bookshelf1.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        BookShelf.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 950, 440));

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
        BookShelf.add(label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 615, 1246, 40));

        Home.add(BookShelf, "card9");

        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, 1246, 655));
        Home.getAccessibleContext().setAccessibleDescription("");
        Home.getAccessibleContext().setAccessibleParent(jPanel1);

        dashboard.setPreferredSize(new java.awt.Dimension(1246, 655));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel79.setText("Student Dashboard");
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
        jLabel80.setText("Student Basic Info");
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

        snam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        snam.setForeground(new java.awt.Color(0, 153, 153));
        snam.setText("jlabel24");
        jPanel2.add(snam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 22));

        sdob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sdob.setForeground(new java.awt.Color(0, 153, 153));
        sdob.setText("jLabel23");
        jPanel2.add(sdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 22));

        sphone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sphone.setForeground(new java.awt.Color(0, 153, 153));
        sphone.setText("jLabel25");
        jPanel2.add(sphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 22));

        sblood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sblood.setForeground(new java.awt.Color(0, 153, 153));
        sblood.setText("jLabel26");
        jPanel2.add(sblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 22));

        sfathername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sfathername.setForeground(new java.awt.Color(0, 153, 153));
        sfathername.setText("jLabel27");
        jPanel2.add(sfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 22));

        smothername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        smothername.setForeground(new java.awt.Color(0, 153, 153));
        smothername.setText("jLabel28");
        jPanel2.add(smothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 22));

        dashb.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 400, 320));

        dashboard.add(dashb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 93, -1, -1));

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
        setState(StudentPanel.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setOpaque(true);
        home.setForeground(new Color(51, 204, 255, 255));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(new Color(240, 240, 240, 255));
        home.setOpaque(false);
    }//GEN-LAST:event_homeMouseExited

    private void borowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borowMouseEntered
        if (Borrow.isShowing()) {

            borow.setOpaque(true);
            borow.setForeground(new Color(51, 204, 255, 255));
        } else {

            borow.setOpaque(true);
            borow.setForeground(new Color(51, 204, 255, 255));
        }
    }//GEN-LAST:event_borowMouseEntered

    private void borowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borowMouseExited
        if (Borrow.isShowing()) {

            borow.setOpaque(true);
            borow.setForeground(new Color(51, 204, 255, 255));
        } else {

            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240, 255));
        }
    }//GEN-LAST:event_borowMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void greportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greportMouseEntered
        if (Generatereport.isShowing()) {

            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255, 255));
        } else {

            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255, 255));
        }


    }//GEN-LAST:event_greportMouseEntered

    private void greportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greportMouseExited
        if (Generatereport.isShowing()) {

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

    private void sbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbookMouseEntered
        if (SearchBook.isShowing()) {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        } else {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        }

    }//GEN-LAST:event_sbookMouseEntered

    private void sbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbookMouseExited
        if (SearchBook.isShowing()) {
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255, 255));
        } else {
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240, 255));
        }
    }//GEN-LAST:event_sbookMouseExited

    private void bshelfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelfMouseEntered
        if (BookShelf.isShowing()) {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        } else {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        }
    }//GEN-LAST:event_bshelfMouseEntered

    private void bshelfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bshelfMouseExited
        if (BookShelf.isShowing()) {
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
        } else {
            bshelf.setForeground(new Color(240, 240, 240, 255));
            bshelf.setOpaque(false);
        }
    }//GEN-LAST:event_bshelfMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        if (Setting.isShowing()) {

            settings.setOpaque(true);
            settings.setForeground(new Color(51, 204, 255, 255));
        } else {

            settings.setOpaque(true);
            settings.setForeground(new Color(51, 204, 255, 255));
        }
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        if (Setting.isShowing()) {

            settings.setOpaque(true);
            settings.setForeground(new Color(51, 204, 255, 255));
        } else {

            settings.setForeground(new Color(240, 240, 240, 255));
            settings.setOpaque(false);
        }

    }//GEN-LAST:event_settingsMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        menu2.setVisible(true);
        menu.setVisible(false);

        if (BookShelf.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(true);
            bshelf.setForeground(new Color(51, 204, 255));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));

            bookshelf1.setEnabled(false);
            jScrollPane1.setEnabled(false);
        } else if (SearchBook.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(true);
            sbook.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));

            sboo.setEnabled(false);
            sisb.setEnabled(false);

            jLabel10.setEnabled(false);
            bookname1.setEnabled(false);
            jButton1.setEnabled(false);
            tbookname.setEnabled(false);
            jScrollPane2.setEnabled(false);

            jLabel11.setEnabled(false);
            sisbn1.setEnabled(false);
            jButton2.setEnabled(false);
            jLabel12.setEnabled(false);
            jLabel13.setEnabled(false);
            jLabel15.setEnabled(false);
            jLabel16.setEnabled(false);
            jLabel17.setEnabled(false);
            jLabel18.setEnabled(false);
            jLabel19.setEnabled(false);
            jLabel20.setEnabled(false);
            jLabel21.setEnabled(false);
            jLabel22.setEnabled(false);
            sisbn2.setEnabled(false);
            sbname.setEnabled(false);
            sauthor.setEnabled(false);
            sedition.setEnabled(false);
            scopy.setEnabled(false);
        } else if (Setting.isShowing()) {

            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));
            settings.setOpaque(true);
            settings.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));

            jPanel4.setEnabled(false);
            jPanel5.setEnabled(false);

            jLabel23.setEnabled(false);
            jLabel24.setEnabled(false);
            jLabel25.setEnabled(false);
            jLabel26.setEnabled(false);
            jLabel27.setEnabled(false);
            jLabel28.setEnabled(false);
            jLabel29.setEnabled(false);
            sspass.setEnabled(false);
            ssnpass.setEnabled(false);
            sscnpass.setEnabled(false);
            ssid.setEnabled(false);
            ssname.setEnabled(false);
            ssemail.setEnabled(false);
            ssphn.setEnabled(false);
            jButton3.setEnabled(false);
            jButton5.setEnabled(false);
        } else if (Borrow.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            borow.setOpaque(true);
            borow.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));

            borrowbook.setEnabled(false);
            jScrollPane3.setEnabled(false);
        } else if (BookReqest.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            breq.setOpaque(true);
            breq.setForeground(new Color(51, 204, 255));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));

            add.setEnabled(false);
            req.setEnabled(false);
            jLabel30.setEnabled(false);
            jLabel31.setEnabled(false);
            jLabel32.setEnabled(false);
            rbtitle.setEnabled(false);
            rbauthor.setEnabled(false);
            rbedition.setEnabled(false);
            rbadd.setEnabled(false);
            jTable4.setEnabled(false);
            jScrollPane4.setEnabled(false);
        } else if (Generatereport.isShowing()) {
            greport.setOpaque(true);
            greport.setForeground(new Color(51, 204, 255));
            home.setOpaque(false);
            home.setForeground(new Color(240, 240, 240));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));

            bookin.setEnabled(false);
            thist.setEnabled(false);
            most.setEnabled(false);
            tbookinfo.setEnabled(false);
            jScrollPane5.setEnabled(false);
            jLabel35.setEnabled(false);
            jLabel36.setEnabled(false);
            jButton9.setEnabled(false);
            tfr.setEnabled(false);
            tto.setEnabled(false);
            trans.setEnabled(false);
            jScrollPane6.setEnabled(false);
            jButton10.setEnabled(false);
            jLabel37.setEnabled(false);
            jLabel38.setEnabled(false);
            jLabel39.setEnabled(false);
            jLabel40.setEnabled(false);
            jLabel41.setEnabled(false);
            jLabel42.setEnabled(false);
        } else if (dashboard.isShowing()) {
            greport.setOpaque(false);
            greport.setForeground(new Color(240, 240, 240));
            home.setOpaque(true);
            home.setForeground(new Color(51, 204, 255));
            sbook.setOpaque(false);
            sbook.setForeground(new Color(240, 240, 240));
            settings.setOpaque(false);
            settings.setForeground(new Color(240, 240, 240));
            breq.setOpaque(false);
            breq.setForeground(new Color(240, 240, 240));
            bshelf.setOpaque(false);
            bshelf.setForeground(new Color(240, 240, 240));
            borow.setOpaque(false);
            borow.setForeground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_menuActionPerformed

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

            //for search Book
            sboo.setEnabled(true);
            sisb.setEnabled(true);

            jLabel10.setEnabled(true);
            bookname1.setEnabled(true);
            jButton1.setEnabled(true);
            tbookname.setEnabled(true);
            jScrollPane2.setEnabled(true);

            jLabel11.setEnabled(true);
            sisbn1.setEnabled(true);
            jButton2.setEnabled(true);
            jLabel12.setEnabled(true);
            jLabel13.setEnabled(true);
            jLabel15.setEnabled(true);
            jLabel16.setEnabled(true);
            jLabel17.setEnabled(true);
            jLabel18.setEnabled(true);
            jLabel19.setEnabled(true);
            jLabel20.setEnabled(true);
            jLabel21.setEnabled(true);
            jLabel22.setEnabled(true);
            sisbn2.setEnabled(true);
            sbname.setEnabled(true);
            sauthor.setEnabled(true);
            sedition.setEnabled(true);
            scopy.setEnabled(true);
        }

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(getLocationOnScreen().x + x - lastX, getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_jPanel1MousePressed

    private void breqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breqMouseEntered
        if (BookReqest.isShowing()) {

            breq.setOpaque(true);
            breq.setForeground(new Color(51, 204, 255, 255));
        } else {

            breq.setOpaque(true);
            breq.setForeground(new Color(51, 204, 255, 255));
        }


    }//GEN-LAST:event_breqMouseEntered

    private void breqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breqMouseExited
        if (BookReqest.isShowing()) {

            breq.setOpaque(true);
            breq.setForeground(new Color(51, 204, 255, 255));
        } else {

            breq.setForeground(new Color(240, 240, 240, 255));
            breq.setOpaque(false);
        }


    }//GEN-LAST:event_breqMouseExited

    private void reqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqMouseClicked


    }//GEN-LAST:event_reqMouseClicked

    private void bookinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookinMouseClicked


    }//GEN-LAST:event_bookinMouseClicked

    private void thistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thistMouseClicked


    }//GEN-LAST:event_thistMouseClicked

    private void bookshelf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookshelf1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);
    }//GEN-LAST:event_bookshelf1MouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void BookShelfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookShelfMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);
    }//GEN-LAST:event_BookShelfMouseClicked

    private void SearchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBookMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_SearchBookMouseClicked

    private void bookname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookname1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        bookname1.setText("");
        DefaultTableModel dm = (DefaultTableModel) tbookname.getModel();
        dm.setRowCount(0);
        tbookname.revalidate();
    }//GEN-LAST:event_bookname1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        try {
            String sql = "select  isbn,title,aname,edition,shelf,row,colum from adminbook where title='" + bookname1.getText() + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbookname.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void tbooknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbooknameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_tbooknameMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void sisbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sisbn1MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        sisbn1.setText("");
        sisbn2.setText("");
        sbname.setText("");
        sauthor.setText("");
        sedition.setText("");
        scopy.setText("");
    }//GEN-LAST:event_sisbn1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        String sql = "select isbn,title,aname,edition,nobook from adminbook where isbn='" + sisbn1.getText() + "'";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String a = rs.getString("isbn");
                String b = rs.getString("title");
                String c = rs.getString("aname");
                String d = rs.getString("edition");
                String e = rs.getString("nobook");

                sisbn2.setText(a);
                sbname.setText(b);
                sauthor.setText(c);
                sedition.setText(d);
                scopy.setText(e);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void sisbn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sisbn2MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_sisbn2MouseClicked

    private void sbnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbnameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_sbnameMouseClicked

    private void sauthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauthorMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_sauthorMouseClicked

    private void seditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seditionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_seditionMouseClicked

    private void scopyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scopyMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_scopyMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_SettingMouseClicked

    private void sspassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sspassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_sspassMouseClicked

    private void ssnpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssnpassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_ssnpassMouseClicked

    private void sscnpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sscnpassMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_sscnpassMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        if ("".equals(ssnpass.getText())) {
            JOptionPane.showMessageDialog(null, "New password Is Empty");
        } else {
            if ("".equals(sscnpass.getText())) {

                JOptionPane.showMessageDialog(null, "Confirm New password Is Empty");
            } else {
                if (ssnpass.getText() == null ? sscnpass.getText() == null : ssnpass.getText().equals(sscnpass.getText())) {

                    String sql = "update lstudentlogin set  password='" + sscnpass.getText() + "'  where password='" + sspass.getText() + "'";
                    String sql1 = "update lstudentsetting set  password='" + sscnpass.getText() + "'  where password='" + sspass.getText() + "'";
                    try {
                        pst = conn.prepareStatement(sql);

                        PreparedStatement pst10 = conn.prepareStatement(sql1);
                        pst.executeUpdate();
                        pst10.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Password Update");
                        ssnpass.setText("");
                        sscnpass.setText("");

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Password doesn't match");
                    ssnpass.setText("");
                    sscnpass.setText("");
                }
            }

        }


    }//GEN-LAST:event_jButton3MouseClicked

    private void ssidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssidMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_ssidMouseClicked

    private void ssnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssnameMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_ssnameMouseClicked

    private void ssemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssemailMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_ssemailMouseClicked

    private void ssphnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssphnMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_ssphnMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        if (sscnpass1.getText() == null ? sspass.getText() == null : sscnpass1.getText().equals(sspass.getText())) {
            try {
                String sql = "update lstudentsetting set phone='" + ssphn.getText() + "' ,email='" + ssemail.getText() + "' where name='" + ssname.getText() + "' ";
                pst = conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "updated");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "your password is not correct");
        }


    }//GEN-LAST:event_jButton5MouseClicked

    private void BorrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

    }//GEN-LAST:event_BorrowMouseClicked

    private void borrowbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowbookMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

    }//GEN-LAST:event_borrowbookMouseClicked

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void BookReqestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookReqestMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);
    }//GEN-LAST:event_BookReqestMouseClicked

    private void rbtitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtitleMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
    }//GEN-LAST:event_rbtitleMouseClicked

    private void rbauthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbauthorMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
    }//GEN-LAST:event_rbauthorMouseClicked

    private void rbeditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbeditionMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
    }//GEN-LAST:event_rbeditionMouseClicked

    private void rbaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbaddMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbpublication.setEnabled(true);
        rbadd.setEnabled(true);
        
        String sql="if not exists (select * from sysobjects where name='brequest' and xtype='U')\n" +
"create table brequest(Book_Title varchar(255), Authour_Name varchar(255),Edition Varchar(255), Publication Varchar(255))";
        if("".equals(rbtitle.getText()))
        {
            JOptionPane.showMessageDialog(null, "Enter Book Title");
        }else{
            if("".equals(rbauthor.getText()))
            {
                JOptionPane.showMessageDialog(null, "Enter Author Name");
            }else{
                if("".equals(rbedition.getText()))
                {
                    JOptionPane.showMessageDialog(null,"Enter Edition");
                }else{
                    if("".equals(rbpublication.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Enter Publication Name");
                    }
                    else{
                        String sql1="insert into brequest(Book_Title,Authour_Name,Edition,Publication) values(?,?,?,?)";
                        try{
                            pst=conn.prepareStatement(sql);
                            pst.execute();
                            PreparedStatement pst52=conn.prepareStatement(sql1);
                            pst52.setString(1,rbtitle.getText());
                            pst52.setString(2,rbauthor.getText());
                            pst52.setString(3,rbedition.getText());
                            pst52.setString(4, rbpublication.getText());
                            pst52.execute();
                            JOptionPane.showMessageDialog(null,"Inserted");
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        
                    }
                }
            }
        }   
            
    }//GEN-LAST:event_rbaddMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);
    }//GEN-LAST:event_jTable4MouseClicked

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);
    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void GeneratereportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneratereportMouseClicked

        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);
    }//GEN-LAST:event_GeneratereportMouseClicked

    private void tbookinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbookinfoMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
    }//GEN-LAST:event_tbookinfoMouseClicked

    private void jScrollPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
    }//GEN-LAST:event_jScrollPane5MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);

        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);

        String a = ((JTextField) tfr.getDateEditor().getUiComponent()).getText();
        String b = ((JTextField) tto.getDateEditor().getUiComponent()).getText();
        String sql = "select id,isbn,name,department,batch,Borrow_date from borrower where Borrow_date between '" + a + "' and '" + b + "'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            trans.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton9MouseClicked

    private void transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transMouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);

        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
    }//GEN-LAST:event_transMouseClicked

    private void jScrollPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane6MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);

        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
    }//GEN-LAST:event_jScrollPane6MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        menu2.setVisible(false);
        menu.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);

        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);

        MessageFormat header = new MessageFormat("Generate Report By ISBN Number");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tbookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void lg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lg1MouseClicked

    private void lg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lg1ActionPerformed
        Welcome w = new Welcome();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lg1ActionPerformed

    private void sbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbookActionPerformed
        dashboard.setVisible(false);
        Home.setVisible(true);
        menu2.setVisible(false);
        menu.setVisible(true);

        //for search Book
        sboo.setEnabled(true);
        sisb.setEnabled(true);

        jLabel10.setEnabled(true);
        bookname1.setEnabled(true);
        jButton1.setEnabled(true);
        tbookname.setEnabled(true);
        jScrollPane2.setEnabled(true);

        jLabel11.setEnabled(true);
        sisbn1.setEnabled(true);
        jButton2.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel15.setEnabled(true);
        jLabel16.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel22.setEnabled(true);
        sisbn2.setEnabled(true);
        sbname.setEnabled(true);
        sauthor.setEnabled(true);
        sedition.setEnabled(true);
        scopy.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(SearchBook);
        Home.repaint();
        Home.revalidate();
        sboo.setSelected(true);
    }//GEN-LAST:event_sbookActionPerformed

    private void reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        bookreq.removeAll();
        bookreq.repaint();
        bookreq.revalidate();

        bookreq.add(Request);
        bookreq.repaint();
        bookreq.revalidate();
    }//GEN-LAST:event_reqActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        bookreq.removeAll();
        bookreq.repaint();
        bookreq.revalidate();

        bookreq.add(Add);
        bookreq.repaint();
        bookreq.revalidate();
    }//GEN-LAST:event_addActionPerformed

    private void sbooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbooActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        search.removeAll();
        search.repaint();
        search.revalidate();

        search.add(Sbook);
        search.repaint();
        search.revalidate();
    }//GEN-LAST:event_sbooActionPerformed

    private void sisbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisbActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        search.removeAll();
        search.repaint();
        search.revalidate();

        search.add(Sisbn);
        search.repaint();
        search.revalidate();

        bookname1.setText("");
        DefaultTableModel dm = (DefaultTableModel) tbookname.getModel();
        dm.setRowCount(0);
        tbookname.revalidate();
    }//GEN-LAST:event_sisbActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dashboard.setVisible(true);
        Home.setVisible(false);
        menu.setVisible(true);
        menu2.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void bshelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bshelfActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        dashboard.setVisible(false);
        Home.setVisible(true);

        //for book shelf
        bookshelf1.setEnabled(true);
        jScrollPane1.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(BookShelf);
        Home.repaint();
        Home.revalidate();

        try {
            String sql = "select  isbn,title,aname,edition,shelf,row,colum from adminbook";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            bookshelf1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bshelfActionPerformed

    private void bookinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookinActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(Bookinfo);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_bookinActionPerformed

    private void thistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thistActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(THistory);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_thistActionPerformed

    private void mostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);

        parent.removeAll();
        parent.repaint();
        parent.revalidate();

        parent.add(Mostborrowed);
        parent.repaint();
        parent.revalidate();
        DefaultTableModel dm = (DefaultTableModel) trans.getModel();
        dm.setRowCount(0);
        trans.revalidate();
        
       String sql="SELECT distinct  TOP 1  title FROM borrowered order by title desc";
       String sql1="select top 1 title from (select distinct top 2 title from borrowered order by title desc) a order by title ";
       String sql2="select top 1 title from (select distinct top 3 title from borrowered order by title desc) a order by title ";
   //    String sql4="SELECT TOP 1 title FROM (SELECT distinct TOP 3 title FROM borrower ORDER BY title DESC) a ORDER BY title";
       try{
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               String a=rs.getString("title");
               jLabel37.setText(a);
           }
           PreparedStatement pst50=conn.prepareStatement(sql1);
           ResultSet rs50=pst50.executeQuery();
           if(rs50.next())
           {
               String b=rs50.getString("title");
               jLabel38.setText(b);
           }
           PreparedStatement pst51=conn.prepareStatement(sql2);
           ResultSet rs51=pst51.executeQuery();
           if(rs51.next())
           {
               String c=rs51.getString("title");
               jLabel39.setText(c);
           }
           
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_mostActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        dashboard.setVisible(false);
        Home.setVisible(true);

        //for setting
        jPanel4.setEnabled(true);
        jPanel5.setEnabled(true);

        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel29.setEnabled(true);
        sspass.setEnabled(true);
        ssnpass.setEnabled(true);
        sscnpass.setEnabled(true);
        ssid.setEnabled(true);
        ssname.setEnabled(true);
        ssemail.setEnabled(true);
        ssphn.setEnabled(true);
        jButton3.setEnabled(true);
        jButton5.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Setting);
        Home.repaint();
        Home.revalidate();
    }//GEN-LAST:event_settingsActionPerformed

    private void borowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borowActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        dashboard.setVisible(false);
        Home.setVisible(true);

        //for borrow book
        borrowbook.setEnabled(true);
        jScrollPane3.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Borrow);
        Home.repaint();
        Home.revalidate();

        try {
            String sql = "select id,isbn,name,department,batch,Borrow_date,Return_date from borrower";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            borrowbook.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_borowActionPerformed

    private void breqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breqActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        dashboard.setVisible(false);
        Home.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbadd.setEnabled(true);
        jTable4.setEnabled(true);
        jScrollPane4.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(BookReqest);
        Home.repaint();
        Home.revalidate();
        add.setSelected(true);
        
        String sql = "if not exists (select * from sysobjects where name='brequest' and xtype='U')create table brequest(Book_Title varchar(255),"
                + "Authour_Name varchar(255),Edition Varchar(255), Publication Varchar(255),status Varchar(255) )";
        
        try {
            PreparedStatement pst53 = conn.prepareStatement(sql);
            pst53.execute();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_breqActionPerformed

    private void greportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greportActionPerformed
        menu2.setVisible(false);
        menu.setVisible(true);
        dashboard.setVisible(false);
        Home.setVisible(true);

        //for generate report
        bookin.setEnabled(true);
        thist.setEnabled(true);
        most.setEnabled(true);
        tbookinfo.setEnabled(true);
        jScrollPane5.setEnabled(true);
        jLabel35.setEnabled(true);
        jLabel36.setEnabled(true);
        jButton9.setEnabled(true);
        tfr.setEnabled(true);
        tto.setEnabled(true);
        trans.setEnabled(true);
        jScrollPane6.setEnabled(true);
        jButton10.setEnabled(true);
        jLabel37.setEnabled(true);
        jLabel38.setEnabled(true);
        jLabel39.setEnabled(true);
        jLabel40.setEnabled(true);
        jLabel41.setEnabled(true);
        jLabel42.setEnabled(true);

        Home.removeAll();
        Home.repaint();
        Home.revalidate();

        Home.add(Generatereport);
        Home.repaint();
        Home.revalidate();
        bookin.setSelected(true);
    }//GEN-LAST:event_greportActionPerformed

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

    private void sscnpass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sscnpass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sscnpass1MouseClicked

    private void bisbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bisbnMouseClicked
        bisbn.setText("");
        DefaultTableModel dm = (DefaultTableModel) tbookinfo.getModel();
        dm.setRowCount(0);
        tbookinfo.revalidate();
    }//GEN-LAST:event_bisbnMouseClicked

    private void bisbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bisbnKeyReleased
        String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where isbn=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bisbn.getText());
            rs = pst.executeQuery();
            tbookinfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bisbnKeyReleased

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        MessageFormat header = new MessageFormat("Generate Report By ISBN Number");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tbookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void bbshelfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbshelfMouseClicked
        bisbn.setText("");
        DefaultTableModel dm = (DefaultTableModel) tbookinfo.getModel();
        dm.setRowCount(0);
        tbookinfo.revalidate();
    }//GEN-LAST:event_bbshelfMouseClicked

    private void bbshelfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bbshelfKeyReleased
        String sql = "select isbn,title,aname,edition,shelf,row,colum from adminbook where shelf=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bbshelf.getText());
            rs = pst.executeQuery();
            tbookinfo.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bbshelfKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MessageFormat header = new MessageFormat("Generate Report By ISBN Number");
        MessageFormat footer = new MessageFormat("Page{0,number,integer} ");
        try {
            tbookinfo.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void rbpublicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbpublicationMouseClicked
       menu2.setVisible(false);
        menu.setVisible(true);

        //for book request
        add.setEnabled(true);
        req.setEnabled(true);
        jLabel30.setEnabled(true);
        jLabel31.setEnabled(true);
        jLabel32.setEnabled(true);
        rbtitle.setEnabled(true);
        rbauthor.setEnabled(true);
        rbedition.setEnabled(true);
        rbpublication.setEnabled(true);
        rbadd.setEnabled(true);
        
    }//GEN-LAST:event_rbpublicationMouseClicked

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

    private void label12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label12MouseClicked

    private void label13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label13MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel BookReqest;
    private javax.swing.JPanel BookShelf;
    private javax.swing.JPanel Bookinfo;
    private javax.swing.JPanel Borrow;
    private javax.swing.JPanel Generatereport;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Mostborrowed;
    private javax.swing.JPanel Request;
    private javax.swing.JPanel Sbook;
    private javax.swing.JPanel SearchBook;
    private javax.swing.JPanel Setting;
    private javax.swing.JPanel Sisbn;
    private javax.swing.JPanel THistory;
    private javax.swing.JToggleButton add;
    private javax.swing.JTextField bbshelf;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel bg5;
    private javax.swing.JLabel bg6;
    private javax.swing.JLabel bg7;
    private javax.swing.JTextField bisbn;
    private javax.swing.JToggleButton bookin;
    private javax.swing.JTextField bookname1;
    private javax.swing.JPanel bookreq;
    private javax.swing.JTable bookshelf1;
    private javax.swing.JButton borow;
    private javax.swing.JTable borrowbook;
    private javax.swing.JButton breq;
    private javax.swing.JButton bshelf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton close;
    private javax.swing.JPanel dashb;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton greport;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable4;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JButton lg1;
    private javax.swing.JButton logout;
    private javax.swing.JButton menu;
    private javax.swing.JPanel menu2;
    private javax.swing.JButton minimize;
    private javax.swing.JButton more;
    private javax.swing.JToggleButton most;
    private javax.swing.JPanel parent;
    private javax.swing.JButton rbadd;
    private javax.swing.JTextField rbauthor;
    private javax.swing.JTextField rbedition;
    private javax.swing.JTextField rbpublication;
    private javax.swing.JTextField rbtitle;
    private javax.swing.JToggleButton req;
    private javax.swing.JTextField sauthor;
    public static javax.swing.JLabel sblood;
    private javax.swing.JTextField sbname;
    private javax.swing.JToggleButton sboo;
    private javax.swing.JButton sbook;
    private javax.swing.JTextField scopy;
    public static javax.swing.JLabel sdob;
    private javax.swing.JPanel search;
    private javax.swing.JTextField sedition;
    private javax.swing.JButton settings;
    public static javax.swing.JLabel sfathername;
    private javax.swing.JToggleButton sisb;
    private javax.swing.JTextField sisbn1;
    private javax.swing.JTextField sisbn2;
    public static javax.swing.JLabel smothername;
    public static javax.swing.JLabel snam;
    public static javax.swing.JLabel sphone;
    public static javax.swing.JTextField sscnpass;
    public static javax.swing.JTextField sscnpass1;
    public static javax.swing.JTextField ssemail;
    public static javax.swing.JTextField ssid;
    public static javax.swing.JTextField ssname;
    public static javax.swing.JTextField ssnpass;
    public static javax.swing.JTextField sspass;
    public static javax.swing.JTextField ssphn;
    private javax.swing.JTable tbookinfo;
    private javax.swing.JTable tbookname;
    private com.toedter.calendar.JDateChooser tfr;
    private javax.swing.JToggleButton thist;
    private javax.swing.JTable trans;
    private com.toedter.calendar.JDateChooser tto;
    public static javax.swing.JLabel usern1;
    // End of variables declaration//GEN-END:variables
}

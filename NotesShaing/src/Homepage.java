
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Homepage extends javax.swing.JFrame {

    ServerSocket sersock;

    public Homepage() {
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        setVisible(true);
        setSize(800, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        try {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        sersock = new ServerSocket(8000);
                        System.out.println("Server Started");
                        while (true) {
                            Socket sock = sersock.accept();

                            Clienthandler ch = new Clienthandler(sock);
                            Thread t = new Thread(ch);
                            t.start();
//      
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }).start();

        } catch (Exception e) {
        }

        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        screenSize.width -= 42;
//        screenSize.height -= 42;
        setSize(screenSize);
        setLocation(0, 0);

        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu fm = new JMenu("Add");
        JMenu fm1 = new JMenu("View");
        JMenu fm2 = new JMenu("Exit");
        mb.add(fm);
        mb.add(fm1);
        mb.add(fm2);
        JMenuItem mi, mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9, mi10;

        JInternalFrame f1;
        final JDesktopPane dtp = new JDesktopPane();
        //dtp.setBackground(Color.GREEN);
        setContentPane(dtp);

        fm.add(mi1 = new JMenuItem("Add Department"));
        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // dtp.getAllFramesInLayer(0)[0].dispose();
                    dtp.removeAll();
                    JInternalFrame f1 = new AddDepartment();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);

                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1);

                    f1.toFront();
                    //System.out.println(dtp.getComponentZOrder(f1));
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm.add(mi2 = new JMenuItem("Add Course"));
        mi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
//                dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new AddCourse();
                    //    f1.setLocation(20, 20);
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    f1.setSize(screenSize);
                    dtp.add(f1, JLayeredPane.DEFAULT_LAYER);
                    //System.out.println(dtp.getComponentZOrder(f1));
                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm.add(mi3 = new JMenuItem("Add Faculty"));
        mi3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    //  dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new Faculty();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1, JLayeredPane.DEFAULT_LAYER);
                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        fm.add(mi4 = new JMenuItem("Add student"));
        mi4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    // dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new AddStudent();
                    //f1.setLocation(20, 20);
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    f1.setSize(screenSize);
                    dtp.add(f1);
                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm1.add(mi5 = new JMenuItem(" View Faculty"));
        mi5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    //  dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new ViewFaculty();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1);

                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm1.add(mi6 = new JMenuItem(" View Student"));
        mi6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    //  dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new ViewStudent();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1);

                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm1.add(mi7 = new JMenuItem(" View Department"));
        mi7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    //  dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new ViewDepartment();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1);

                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm1.add(mi8 = new JMenuItem(" View Course"));
        mi8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dtp.removeAll();
                    //  dtp.getAllFramesInLayer(0)[0].dispose();
                    JInternalFrame f1 = new ViewCourse();
                    f1.setClosable(true);
                    f1.setIconifiable(true);
                    f1.setMaximizable(true);
                    f1.setResizable(true);
                    f1.setSelected(true);
                    //f1.setLocation(20, 20);
                    f1.setSize(screenSize);
                    dtp.add(f1);

                    f1.toFront();
                } catch (Exception ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        fm2.add(mi9 = new JMenuItem("Logout"));
        mi9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

    }

    class Clienthandler implements Runnable {

        Socket sock;
        DataInputStream dis;
        DataOutputStream dos;

        Clienthandler(Socket sock) {
            this.sock = sock;
        }

        public void run() {
            try {
                System.out.println("Connection accepted");
                dis = new DataInputStream(sock.getInputStream());
                dos = new DataOutputStream(sock.getOutputStream());
                dos.writeBytes("Hello\r\n");
                String ClientMessage = dis.readLine();
                System.out.println("ClientMessage :" + ClientMessage);

                while (true) {
                    String s = dis.readLine();
                    if (s.equals("faculty login")) {

                        try {
                            int id = Integer.parseInt(dis.readLine());
                            String password = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from faculty where faculty_id='" + id + "' and password='" + password + "'");
                            if (rs.next()) {
                                System.out.println("successfull");
                                dos.writeBytes("Login Successful\r\n");
                                dos.writeBytes("Main data\r\n");
                                dos.writeBytes(rs.getInt("faculty_id") + "\r\n");
                                dos.writeBytes(rs.getString("username") + "\r\n");
                                dos.writeBytes(rs.getString("department_name") + "\r\n");
                                dos.writeBytes(rs.getString("course_name") + "\r\n");
                                dos.writeBytes(rs.getString("email") + "\r\n");
                                dos.writeBytes(rs.getString("phone") + "\r\n");
                                dos.writeBytes(rs.getString("address") + "\r\n");
                                dos.writeBytes(rs.getString("qualification") + "\r\n");
                                dos.writeBytes(rs.getString("experience") + "\r\n");

                            } else {
                                System.out.println("failed");
                                dos.writeBytes("Login Failed\r\n");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("check pic")) {
                        try {
                            int id = Integer.parseInt(dis.readLine());
                            File f = new File("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\faculty\\" + id + ".jpg");
                            if (f.exists()) {
                                dos.writeBytes("pic exist\r\n");
                                FileInputStream fis = new FileInputStream(f);
                                long size = f.length();
                                dos.writeLong(size);
                                long count = 0;
                                byte b[] = new byte[10000];
                                while (true) {
                                    int r = fis.read(b, 0, 10000);
                                    dos.write(b, 0, r);
                                    count += r;
                                    if (count == size) {
                                        break;
                                    }
                                }
                            } else {
                                dos.writeBytes("pic doesnt exist\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("Faculty Change Password")) {
                        try {
                            int id = Integer.parseInt(dis.readLine());
                            String oldpass = dis.readLine();
                            String newpass = dis.readLine();
                            String confirmpass = dis.readLine();
                            System.out.println(id + " " + oldpass + " " + newpass + " " + confirmpass);
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from faculty where faculty_id='" + id + "' and password='" + oldpass + "'");
                            if (rs.next()) {
                                rs.updateString("password", newpass);
                                rs.updateRow();
                                dos.writeBytes("Updation is successful\r\n");
                            } else {
                                dos.writeBytes("Username and password don't match\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("Faculty Edit Profile")) {
                        try {
                            int id = Integer.parseInt(dis.readLine());
                            String username = dis.readLine();
                            String mail = dis.readLine();
                            String phone = dis.readLine();
                            String add = dis.readLine();
                            String experience = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from faculty where faculty_id='" + id + "'");
                            if (rs.next()) {
                                rs.updateString("email", mail);
                                rs.updateString("phone", phone);
                                rs.updateString("address", add);
                                rs.updateString("experience", experience);
                                rs.updateRow();
                                System.out.println("before command");
                                dos.writeBytes("data is edit\r\n");
                            } else {
                                dos.writeBytes("Data not found\r\n");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("Send profile pic")) {
                        int id = Integer.parseInt(dis.readLine());
                        long size = dis.readLong();
                        FileOutputStream fos = new FileOutputStream("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\faculty\\" + id + ".jpg");
                        long count = 0;
                        byte b[] = new byte[10000];
                        while (true) {
                            int r = dis.read(b, 0, 10000);
                            fos.write(b, 0, r);
                            count += r;
                            if (count == size) {
                                break;
                            }

                        }
                        fos.close();

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from faculty where faculty_id='" + id + "'");
                            if (rs.next()) {
                                rs.updateString("photo", "E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\faculty\\" + id + ".jpg");
                                rs.updateRow();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("student login")) {
                        int id = Integer.parseInt(dis.readLine());
                        String stupass = dis.readLine();
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from student where university_rollno='" + id + "' and password='" + stupass + "'");
                            if (rs.next()) {
                                System.out.println("successfull");
                                dos.writeBytes("Login Successfull\r\n");
                                dos.writeBytes("Student data\r\n");
                                dos.writeBytes(rs.getString("university_rollno") + "\r\n");
                                dos.writeBytes(rs.getString("department_name") + "\r\n");
                                dos.writeBytes(rs.getString("course_name") + "\r\n");
                                dos.writeBytes(rs.getString("email") + "\r\n");
                                dos.writeBytes(rs.getString("contact") + "\r\n");
                                dos.writeBytes(rs.getString("address") + "\r\n");

                            } else {
                                System.out.println("failed");
                                dos.writeBytes("Login failed\r\n");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Student Change Password")) {
                        try {
                            int stuid = Integer.parseInt(dis.readLine());
                            String oldpass = dis.readLine();
                            String newpass = dis.readLine();
                            String confirmpass = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from student where university_rollno='" + stuid + "' and password='" + oldpass + "'");
                            if (rs.next()) {
                                rs.updateString("password", newpass);
                                rs.updateRow();
                                dos.writeBytes("password change\r\n");
                            } else {
                                dos.writeBytes("password not change\r\n");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Edit student")) {
                        try {
                            int stuid = Integer.parseInt(dis.readLine());
                            String email = dis.readLine();
                            String contact = dis.readLine();
                            String address = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from student where university_rollno='" + stuid + "'");
                            if (rs.next()) {
                                rs.updateString("email", email);
                                rs.updateString("contact", contact);
                                rs.updateString("address", address);
                                rs.updateRow();
                                dos.writeBytes("Data is edit\r\n");
                            } else {
                                dos.writeBytes("Data not edit\r\n");
                            }

                        } catch (Exception e) {
                        }
                    } else if (s.equals("send student list")) {
                        try {
                            String dpname = dis.readLine();
                            String coursename = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select count(university_rollno)as count1 from student where department_name='" + dpname + "'and course_name='" + coursename + "'");
                            if (rs.next()) {
                                int countrow = rs.getInt("count1");
                                dos.writeBytes("Send no of rows\r\n");
                                dos.writeBytes(countrow + "\r\n");
                                System.out.println("row count" + countrow);
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                                System.out.println("Connection built..");
                                Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                System.out.println("Statement created..");
                                ResultSet rs1 = stm.executeQuery("select * from student where department_name='" + dpname + "' and course_name='" + coursename + "'");
                                while (rs1.next()) {
                                    dos.writeBytes(rs1.getString("university_rollno") + "\r\n");
                                    dos.writeBytes(rs1.getString("department_name") + "\r\n");
                                    dos.writeBytes(rs1.getString("course_name") + "\r\n");
                                    dos.writeBytes(rs1.getString("email") + "\r\n");
                                    dos.writeBytes(rs1.getString("contact") + "\r\n");

                                }
                            } else {
                                System.out.println("in else");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (s.equals("Add Note")) {
                        try {
                            int id = Integer.parseInt(dis.readLine());
                            String title = dis.readLine();
                            String description = dis.readLine();
                            String type = dis.readLine();
                            String sno = dis.readLine();
                            long size = dis.readLong();
                            String fname = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select max(note_id)as n1 from notes");
                            int note_id = 0;
                            if (rs.next()) {
                                note_id = rs.getInt("n1");
                            }

                            note_id = note_id + 1;
                            System.out.println("note id is: " + note_id);

                            FileOutputStream fos = new FileOutputStream("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\notes\\" + note_id + fname);
                            long count = 0;
                            byte b[] = new byte[100000];
                            while (true) {
                                int r = dis.read(b, 0, 100000);
                                fos.write(b, 0, r);
                                count += r;
                                if (count == size) {
                                    break;
                                }
                            }
                            fos.close();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs2 = stm.executeQuery("select * from notes");
                            rs2.moveToInsertRow();
                            rs2.updateInt("note_id", note_id);
                            rs2.updateInt("faculty_id", id);
                            rs2.updateString("title", title);
                            rs2.updateString("description", description);
                            rs2.updateString("type", type);
                            rs2.updateString("path", "E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\notes\\" + note_id + fname);
                            rs2.insertRow();
                            StringTokenizer st = new StringTokenizer(sno, ",");
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt1 = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs3 = stmt1.executeQuery("select * from note_detail");
                            while (st.hasMoreTokens()) {
                                rs3.moveToInsertRow();
                                rs3.updateInt("note_id", note_id);
                                int roll_no = Integer.parseInt(st.nextToken());
                                System.out.println("roll : " + roll_no);
                                rs3.updateInt("university_rollno", roll_no);
                                rs3.insertRow();
                            }
                            dos.writeBytes("Notes Added\r\n");

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("get note")) {
                        try {
                            int rollno = Integer.parseInt(dis.readLine());
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select count(note_detail_id)as n1 from note_detail,notes where note_detail.university_rollno='" + rollno + "'and note_detail.note_id=notes.note_id");
                            if (rs.next()) {
                                int count = rs.getInt("n1");
                                System.out.println("count is: " + count);
                                dos.writeBytes("Recieve notes list\r\n");
                                dos.writeBytes(count + "\r\n");
                            }
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs1 = stm.executeQuery("select * from note_detail,notes where note_detail.university_rollno='" + rollno + "'and note_detail.note_id=notes.note_id");
                            while (rs1.next()) {
                                dos.writeBytes(rs1.getString("note_id") + "\r\n");
                                dos.writeBytes(rs1.getString("title") + "\r\n");
                                dos.writeBytes(rs1.getString("description") + "\r\n");
                                dos.writeBytes(rs1.getTime("time") + "\r\n");
                                dos.writeBytes(rs1.getString("type") + "\r\n");
                                int id = Integer.parseInt(rs1.getString("faculty_id"));

                                Statement stm1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                System.out.println("Statement created..");
                                ResultSet rs2 = stm1.executeQuery("select * from faculty where faculty_id='" + id + "'");
                                if (rs2.next()) {
                                    dos.writeBytes(rs2.getString("username") + "\r\n");
                                }
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (s.equals("download notes")) {
                        try {
                            int note_id = Integer.parseInt(dis.readLine());
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from notes where note_id='" + note_id + "'");
                            String path = "";
                            if (rs.next()) {
                                path = rs.getString("path");
                                System.out.println("path: " + path);
                            }

                            File f = new File(path);
                            FileInputStream fis = new FileInputStream(f);
                            dos.writeBytes("send file\r\n");
                            String name = f.getName();
                            long size = f.length();
                            dos.writeLong(size);
                            dos.writeBytes(name + "\r\n");
                            long count = 0;
                            byte b[] = new byte[100000];
                            while (true) {
                                int r = fis.read(b, 0, 100000);
                                dos.write(b, 0, r);
                                count += r;
                                if (count == size) {
                                    break;
                                }
                            }
                            String msg = dis.readLine();
                            System.out.println(msg);

                        } catch (Exception e) {
                        }

                    } else if (s.equals("View notes")) {
                        int id = Integer.parseInt(dis.readLine());
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select count(faculty_id)as count2 from notes where faculty_id='" + id + "'");
                            if (rs.next()) {
                                int countrow = rs.getInt("count2");
                                dos.writeBytes("Send no of rowscount\r\n");
                                dos.writeBytes(countrow + "\r\n");
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                                System.out.println("Connection built..");
                                Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                System.out.println("Statement created..");
                                ResultSet rs1 = stm.executeQuery("select * from notes where faculty_id='" + id + "' ");
                                while (rs1.next()) {
                                    dos.writeBytes(rs1.getString("note_id") + "\r\n");
                                    dos.writeBytes(rs1.getString("title") + "\r\n");
                                    dos.writeBytes(rs1.getString("description") + "\r\n");
                                    dos.writeBytes(rs1.getString("time") + "\r\n");
                                    dos.writeBytes(rs1.getString("type") + "\r\n");

                                }
                            }
                        } catch (Exception e) {
                        }
                    } else if (s.equals("Delete Note")) {
                        try {
                            int id = Integer.parseInt(dis.readLine());
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                            System.out.println("Connection built..");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs = stmt.executeQuery("select * from notes where note_id='" + id + "'");
                            if (rs.next()) {
                                rs.deleteRow();
                            }

                            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            System.out.println("Statement created..");
                            ResultSet rs1 = stm.executeQuery("select * from note_detail where note_id='" + id + "'");
                            while (rs1.next()) {
                                rs1.deleteRow();

                            }
                            dos.writeBytes("rownote delete\r\n");

                        } catch (Exception e) {
                        }

                    } else if (s.equals("Student delete note")) {
                        int id = Integer.parseInt(dis.readLine());
                        int stuid = Integer.parseInt(dis.readLine());
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                        System.out.println("Connection built..");
                        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        System.out.println("Statement created..");
                        ResultSet rs = stmt.executeQuery("select * from note_detail where note_id='" + id + "' and university_rollno='" + stuid + "'");
                        if (rs.next()) {
                            rs.deleteRow();
                            dos.writeBytes("Row Deleted\r\n");
                        }

                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbwelcomelogin = new javax.swing.JLabel();
        btadddepartment = new javax.swing.JButton();
        btviewdepartment = new javax.swing.JButton();
        btaddcourse = new javax.swing.JButton();
        btviewcourse = new javax.swing.JButton();
        btaddfaculty = new javax.swing.JButton();
        btviewfaculty = new javax.swing.JButton();
        btaddstudent = new javax.swing.JButton();
        btviewstudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbwelcomelogin.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbwelcomelogin.setText("Welcome Admin");
        getContentPane().add(lbwelcomelogin);
        lbwelcomelogin.setBounds(150, 40, 250, 50);

        btadddepartment.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btadddepartment.setText("Add Department");
        btadddepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadddepartmentActionPerformed(evt);
            }
        });
        getContentPane().add(btadddepartment);
        btadddepartment.setBounds(180, 110, 180, 50);

        btviewdepartment.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btviewdepartment.setText("View Department");
        btviewdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewdepartmentActionPerformed(evt);
            }
        });
        getContentPane().add(btviewdepartment);
        btviewdepartment.setBounds(180, 170, 180, 40);

        btaddcourse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btaddcourse.setText("Add Course");
        btaddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddcourseActionPerformed(evt);
            }
        });
        getContentPane().add(btaddcourse);
        btaddcourse.setBounds(180, 220, 180, 40);

        btviewcourse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btviewcourse.setText("View Course");
        btviewcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewcourseActionPerformed(evt);
            }
        });
        getContentPane().add(btviewcourse);
        btviewcourse.setBounds(180, 270, 180, 40);

        btaddfaculty.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btaddfaculty.setText("Add Faculty");
        btaddfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddfacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btaddfaculty);
        btaddfaculty.setBounds(180, 320, 180, 40);

        btviewfaculty.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btviewfaculty.setText("View Faculty");
        btviewfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewfacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btviewfaculty);
        btviewfaculty.setBounds(180, 370, 180, 40);

        btaddstudent.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btaddstudent.setText("Add Student");
        btaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddstudentActionPerformed(evt);
            }
        });
        getContentPane().add(btaddstudent);
        btaddstudent.setBounds(180, 420, 180, 40);

        btviewstudent.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btviewstudent.setText("View Student");
        btviewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewstudentActionPerformed(evt);
            }
        });
        getContentPane().add(btviewstudent);
        btviewstudent.setBounds(180, 470, 180, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btadddepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadddepartmentActionPerformed
        AddDepartment o1 = new AddDepartment();
    }//GEN-LAST:event_btadddepartmentActionPerformed

    private void btviewdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewdepartmentActionPerformed
        ViewDepartment obj = new ViewDepartment();
    }//GEN-LAST:event_btviewdepartmentActionPerformed

    private void btaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddcourseActionPerformed
        AddCourse obj = new AddCourse();
    }//GEN-LAST:event_btaddcourseActionPerformed

    private void btviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewcourseActionPerformed
        ViewCourse obj = new ViewCourse();
    }//GEN-LAST:event_btviewcourseActionPerformed

    private void btaddfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddfacultyActionPerformed
        Faculty obj = new Faculty();
    }//GEN-LAST:event_btaddfacultyActionPerformed

    private void btviewfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewfacultyActionPerformed
        ViewFaculty obj = new ViewFaculty();
    }//GEN-LAST:event_btviewfacultyActionPerformed

    private void btaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddstudentActionPerformed
        AddStudent obj = new AddStudent();
    }//GEN-LAST:event_btaddstudentActionPerformed

    private void btviewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewstudentActionPerformed
        ViewStudent obj = new ViewStudent();
    }//GEN-LAST:event_btviewstudentActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaddcourse;
    private javax.swing.JButton btadddepartment;
    private javax.swing.JButton btaddfaculty;
    private javax.swing.JButton btaddstudent;
    private javax.swing.JButton btviewcourse;
    private javax.swing.JButton btviewdepartment;
    private javax.swing.JButton btviewfaculty;
    private javax.swing.JButton btviewstudent;
    private javax.swing.JLabel lbwelcomelogin;
    // End of variables declaration//GEN-END:variables
}

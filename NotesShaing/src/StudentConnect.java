
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class StudentConnect extends javax.swing.JFrame {

    ArrayList<notes> al = new ArrayList<>();
    tabelmodel tm2;

    Socket sock;
    DataInputStream dis;
    DataOutputStream dos;
    int flag = 0;
    Studenthomepage obj;
    Studenthomepage.StudentChangePassword obj1;
    Studenthomepage.StudentEditProfile obj2;
    Studenthomepage.StudentDownloadNotes obj3;
    int index;
    int stuid;
    String dpname;
    String coursename;
    String email;
    String contact;
    String address;
    String stupass;
    private javax.swing.JProgressBar jpb;
    JFileChooser chooser;
    String path = "";

    public StudentConnect() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        setVisible(true);
        setSize(800, 650);
        getContentPane().setBackground(Color.white);
       studentloginpanel2.setVisible(false);
        StudentPanel.setVisible(false);
        tm2 = new tabelmodel();
        chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btstudentconnect = new javax.swing.JButton();
        studentloginpanel2 = new javax.swing.JPanel();
        StudentPanel = new javax.swing.JPanel();
        lbstulogin = new javax.swing.JLabel();
        lbunirollno = new javax.swing.JLabel();
        lbstupass = new javax.swing.JLabel();
        tfuniroll = new javax.swing.JTextField();
        tfstupass = new javax.swing.JPasswordField();
        btstulogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btstudentconnect.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btstudentconnect.setForeground(new java.awt.Color(102, 0, 102));
        btstudentconnect.setText("Connect");
        btstudentconnect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        btstudentconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstudentconnectActionPerformed(evt);
            }
        });
        getContentPane().add(btstudentconnect);
        btstudentconnect.setBounds(260, 20, 180, 60);

        studentloginpanel2.setBackground(new java.awt.Color(204, 153, 253));
        studentloginpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studentloginpanel2.setForeground(new java.awt.Color(240, 240, 240));
        studentloginpanel2.setLayout(null);

        StudentPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudentPanel.setLayout(null);

        lbstulogin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbstulogin.setForeground(new java.awt.Color(102, 0, 102));
        lbstulogin.setText("Student Login");
        StudentPanel.add(lbstulogin);
        lbstulogin.setBounds(110, 10, 200, 40);

        lbunirollno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbunirollno.setForeground(new java.awt.Color(102, 0, 102));
        lbunirollno.setText("University_Rollno");
        StudentPanel.add(lbunirollno);
        lbunirollno.setBounds(20, 120, 160, 30);

        lbstupass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstupass.setForeground(new java.awt.Color(102, 0, 102));
        lbstupass.setText("Password");
        StudentPanel.add(lbstupass);
        lbstupass.setBounds(20, 180, 140, 30);

        tfuniroll.setForeground(new java.awt.Color(102, 0, 102));
        StudentPanel.add(tfuniroll);
        tfuniroll.setBounds(190, 120, 220, 30);

        tfstupass.setForeground(new java.awt.Color(102, 0, 102));
        StudentPanel.add(tfstupass);
        tfstupass.setBounds(190, 180, 220, 30);

        btstulogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstulogin.setForeground(new java.awt.Color(102, 0, 102));
        btstulogin.setText("Login");
        btstulogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuloginActionPerformed(evt);
            }
        });
        StudentPanel.add(btstulogin);
        btstulogin.setBounds(110, 280, 130, 40);

        studentloginpanel2.add(StudentPanel);
        StudentPanel.setBounds(40, 40, 430, 390);

        getContentPane().add(studentloginpanel2);
        studentloginpanel2.setBounds(100, 130, 510, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btstudentconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstudentconnectActionPerformed
        try {
            btstudentconnect.setVisible(false);
                   studentloginpanel2.setVisible(true);

            StudentPanel.setVisible(true);
            sock = new Socket("127.0.0.1", 8000);
            System.out.println("Connection build");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            dos.writeBytes("Testing Server  \r\n");
            String ServerMessage = dis.readLine();
            System.out.println("ServerMessage :" + ServerMessage);
            Studentreciever obj = new Studentreciever();
            Thread t1 = new Thread(obj);
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btstudentconnectActionPerformed

    private void btstuloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuloginActionPerformed
        try {
            if (tfuniroll.getText().equals("") || tfstupass.getText().equals("")) {

                JOptionPane.showMessageDialog(StudentConnect.this, "Fill all field first");
            } else {
                stuid = Integer.parseInt(tfuniroll.getText());
                stupass = tfstupass.getText();

                dos.writeBytes("student login\r\n");
                dos.writeBytes(stuid + "\r\n");
                dos.writeBytes(stupass + "\r\n");
                //obj2.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btstuloginActionPerformed

    /**
     * @param args the command line arguments
     */
    public class Studentreciever implements Runnable {

        public void run() {
            while (true) {
                try {
                    String s = dis.readLine();
                    if (s.equals("Login Successfull")) {
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(StudentConnect.this, "Login Successfull");
                            dispose();
                            obj = new Studenthomepage();
                            obj.setVisible(true);
                            flag = 1;

                        }

                    } else if (s.equals("Login failed")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Login failed");
                        tfuniroll.setText("");
                        tfstupass.setText("");
                    } else if (s.equals("Student data")) {
                        stuid = Integer.parseInt(dis.readLine());
                        dpname = dis.readLine();
                        coursename = dis.readLine();
                        email = dis.readLine();
                        contact = dis.readLine();
                        address = dis.readLine();
                        obj.lbsturollno.setText(stuid + "");
                        obj.lbstudpname.setText(dpname);
                        obj.lbstucoursename.setText(coursename);
                        obj.lbstumail.setText(email);
                        obj.jLabel1.setText(contact);
                        obj.lbstuaddress.setText(address);
                    } else if (s.equals("password change")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Password Change Successfully");
                        obj1.dispose();
                    } else if (s.equals("password not change")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Username and password donot match");
                        obj1.tfstuoldpass.setText("");
                        obj1.tfstuconfirmpass.setText("");
                        obj1.tfstunewpass.setText("");
                    } else if (s.equals("Data is edit")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Student data is edit successfully");
                        dos.writeBytes("student login\r\n");
                        dos.writeBytes(stuid + "\r\n");
                        dos.writeBytes(stupass + "\r\n");
                        obj2.dispose();
                    } else if (s.equals("Recieve notes list")) {
                        int count = Integer.parseInt(dis.readLine());
                        System.out.println("count is: " + count);
                        for (int i = 0; i < count; i++) {
                            int note_id = Integer.parseInt(dis.readLine());
                            String title = dis.readLine();
                            String description = dis.readLine();
                            String time = dis.readLine();
                            String type = dis.readLine();
                            String username = dis.readLine();
                            System.out.println("note id is: " + note_id);
                            al.add(new notes(note_id, title, description, time, type, username));
                        }
                    } else if (s.equals("send file")) {
                        System.out.println("inside send file");
                        long size = dis.readLong();
                        String name = dis.readLine();
                        System.out.println("size: " + size);
                        System.out.println("name: " + name);

                        System.out.println("path: " + path);
                        FileOutputStream fos = new FileOutputStream(path + "\\" + name);
                        long count = 0;
                        byte b[] = new byte[100000];
                        obj3.jpb.setStringPainted(true);
                        while (true) {
                            int r = dis.read(b, 0, 100000);
                            fos.write(b, 0, r);
                            count += r;
                            int per = (int) ((count * 100) / size);
                            obj3.jpb.setValue(per);
                            obj3.jpb.setString(per + "%");
                            if (count == size) {
                                break;
                            }
                        }
                        fos.close();
                        JOptionPane.showMessageDialog(StudentConnect.this, "File download successfully");
                        dos.writeBytes("file recieved\r\n");
                        obj3.jPanel1.setVisible(false);
                        obj3.jpb.setValue(0);
                        obj3.jpb.setString("0%");
                        Desktop.getDesktop().open(new File(path + "\\" + name));

                    } else if (s.equalsIgnoreCase("Row Deleted")) {

                        JOptionPane.showMessageDialog(obj3, "Row Deleted");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentConnect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JButton btstudentconnect;
    private javax.swing.JButton btstulogin;
    private javax.swing.JLabel lbstulogin;
    private javax.swing.JLabel lbstupass;
    private javax.swing.JLabel lbunirollno;
    private javax.swing.JPanel studentloginpanel2;
    private javax.swing.JPasswordField tfstupass;
    private javax.swing.JTextField tfuniroll;
    // End of variables declaration//GEN-END:variables

    public class Studenthomepage extends javax.swing.JFrame {

        public Studenthomepage() {
            initComponents();
            setVisible(true);
            setSize(1000, 650);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            lbstuwelcome = new javax.swing.JLabel();
            Studenthomepagebuttonpanel = new javax.swing.JPanel();
            btstuchangepass = new javax.swing.JButton();
            btstuexit = new javax.swing.JButton();
            btstuviewnotes = new javax.swing.JButton();
            lbstueditprofile = new javax.swing.JButton();
            studenthomeinfopanel = new javax.swing.JPanel();
            jPanel1 = new javax.swing.JPanel();
            lbstucourse = new javax.swing.JLabel();
            lbstudp = new javax.swing.JLabel();
            lbstuemail = new javax.swing.JLabel();
            lbstucon = new javax.swing.JLabel();
            lbstuadd = new javax.swing.JLabel();
            lbstucoursename = new javax.swing.JLabel();
            lbstudpname = new javax.swing.JLabel();
            lbstumail = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            lbstuaddress = new javax.swing.JLabel();
            lbuniroll = new javax.swing.JLabel();
            lbsturollno = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            lbstuwelcome.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
            lbstuwelcome.setForeground(new java.awt.Color(102, 0, 102));
            lbstuwelcome.setText("Welcome");
            getContentPane().add(lbstuwelcome);
            lbstuwelcome.setBounds(350, 10, 170, 50);

            Studenthomepagebuttonpanel.setBackground(new java.awt.Color(204, 153, 253));
            Studenthomepagebuttonpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
            Studenthomepagebuttonpanel.setLayout(null);

            btstuchangepass.setBackground(new java.awt.Color(255, 255, 255));
            btstuchangepass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            btstuchangepass.setForeground(new java.awt.Color(102, 0, 102));
            btstuchangepass.setText("Change Password");
            btstuchangepass.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btstuchangepassActionPerformed(evt);
                }
            });
            Studenthomepagebuttonpanel.add(btstuchangepass);
            btstuchangepass.setBounds(40, 50, 220, 70);

            btstuexit.setBackground(new java.awt.Color(255, 255, 255));
            btstuexit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            btstuexit.setForeground(new java.awt.Color(102, 0, 102));
            btstuexit.setText("Exit");
            btstuexit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btstuexitActionPerformed(evt);
                }
            });
            Studenthomepagebuttonpanel.add(btstuexit);
            btstuexit.setBounds(40, 260, 220, 70);

            btstuviewnotes.setBackground(new java.awt.Color(255, 255, 255));
            btstuviewnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            btstuviewnotes.setForeground(new java.awt.Color(102, 0, 102));
            btstuviewnotes.setText("View Notes");
            btstuviewnotes.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btstuviewnotesActionPerformed(evt);
                }
            });
            Studenthomepagebuttonpanel.add(btstuviewnotes);
            btstuviewnotes.setBounds(40, 190, 220, 70);

            lbstueditprofile.setBackground(new java.awt.Color(255, 255, 255));
            lbstueditprofile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstueditprofile.setForeground(new java.awt.Color(102, 0, 102));
            lbstueditprofile.setText("Edit Profile");
            lbstueditprofile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    lbstueditprofileActionPerformed(evt);
                }
            });
            Studenthomepagebuttonpanel.add(lbstueditprofile);
            lbstueditprofile.setBounds(40, 120, 220, 70);

            getContentPane().add(Studenthomepagebuttonpanel);
            Studenthomepagebuttonpanel.setBounds(600, 140, 310, 420);

            studenthomeinfopanel.setBackground(new java.awt.Color(204, 153, 253));
            studenthomeinfopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
            studenthomeinfopanel.setLayout(null);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            lbstucourse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstucourse.setForeground(new java.awt.Color(102, 0, 102));
            lbstucourse.setText("Course Name");
            jPanel1.add(lbstucourse);
            lbstucourse.setBounds(40, 90, 160, 30);

            lbstudp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstudp.setForeground(new java.awt.Color(102, 0, 102));
            lbstudp.setText("Department Name");
            jPanel1.add(lbstudp);
            lbstudp.setBounds(40, 140, 150, 30);

            lbstuemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstuemail.setForeground(new java.awt.Color(102, 0, 102));
            lbstuemail.setText("Email");
            jPanel1.add(lbstuemail);
            lbstuemail.setBounds(40, 190, 110, 30);

            lbstucon.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstucon.setForeground(new java.awt.Color(102, 0, 102));
            lbstucon.setText("Contact");
            jPanel1.add(lbstucon);
            lbstucon.setBounds(40, 240, 100, 30);

            lbstuadd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstuadd.setForeground(new java.awt.Color(102, 0, 102));
            lbstuadd.setText("Address");
            jPanel1.add(lbstuadd);
            lbstuadd.setBounds(40, 300, 80, 30);

            lbstucoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstucoursename.setForeground(new java.awt.Color(102, 0, 102));
            lbstucoursename.setText("Coursename");
            jPanel1.add(lbstucoursename);
            lbstucoursename.setBounds(230, 90, 200, 30);

            lbstudpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstudpname.setForeground(new java.awt.Color(102, 0, 102));
            lbstudpname.setText("dpname");
            jPanel1.add(lbstudpname);
            lbstudpname.setBounds(230, 140, 200, 30);

            lbstumail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstumail.setForeground(new java.awt.Color(102, 0, 102));
            lbstumail.setText("email");
            jPanel1.add(lbstumail);
            lbstumail.setBounds(230, 190, 220, 30);

            jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(102, 0, 102));
            jLabel1.setText("contact");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(230, 240, 190, 30);

            lbstuaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbstuaddress.setForeground(new java.awt.Color(102, 0, 102));
            lbstuaddress.setText("address");
            jPanel1.add(lbstuaddress);
            lbstuaddress.setBounds(230, 290, 220, 50);

            lbuniroll.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbuniroll.setForeground(new java.awt.Color(102, 0, 102));
            lbuniroll.setText("University_Rollno");
            jPanel1.add(lbuniroll);
            lbuniroll.setBounds(40, 30, 150, 30);

            lbsturollno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
            lbsturollno.setForeground(new java.awt.Color(102, 0, 102));
            lbsturollno.setText("Rollno");
            jPanel1.add(lbsturollno);
            lbsturollno.setBounds(230, 30, 170, 30);

            studenthomeinfopanel.add(jPanel1);
            jPanel1.setBounds(30, 30, 460, 360);

            getContentPane().add(studenthomeinfopanel);
            studenthomeinfopanel.setBounds(60, 140, 520, 420);

            pack();
        }// </editor-fold>                        

        private void btstuchangepassActionPerformed(java.awt.event.ActionEvent evt) {
            obj1 = new Studenthomepage.StudentChangePassword();
            obj1.setVisible(true);
        }

        private void lbstueditprofileActionPerformed(java.awt.event.ActionEvent evt) {
            obj2 = new Studenthomepage.StudentEditProfile();
            obj2.setVisible(true);
        }

        private void btstuviewnotesActionPerformed(java.awt.event.ActionEvent evt) {
            try {
                dos.writeBytes("get note\r\n");
                dos.writeBytes(stuid + "\r\n");
            } catch (Exception e) {
            }

            obj3 = new Studenthomepage.StudentDownloadNotes();
            obj3.setVisible(true);
            obj3.jPanel1.setVisible(false);
            obj3.studownloadpanel3.setVisible(false);
        }

        private void btstuexitActionPerformed(java.awt.event.ActionEvent evt) {
            this.dispose();
            StudentConnect sc = new StudentConnect();
        }

        /**
         * @param args the command line arguments
         */
        // Variables declaration - do not modify                     
        private javax.swing.JPanel Studenthomepagebuttonpanel;
        private javax.swing.JButton btstuchangepass;
        private javax.swing.JButton btstuexit;
        private javax.swing.JButton btstuviewnotes;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lbstuadd;
        private javax.swing.JLabel lbstuaddress;
        private javax.swing.JLabel lbstucon;
        private javax.swing.JLabel lbstucourse;
        private javax.swing.JLabel lbstucoursename;
        private javax.swing.JLabel lbstudp;
        private javax.swing.JLabel lbstudpname;
        private javax.swing.JButton lbstueditprofile;
        private javax.swing.JLabel lbstuemail;
        private javax.swing.JLabel lbstumail;
        private javax.swing.JLabel lbsturollno;
        private javax.swing.JLabel lbstuwelcome;
        private javax.swing.JLabel lbuniroll;
        private javax.swing.JPanel studenthomeinfopanel;
        // End of variables declaration                   

        public class StudentChangePassword extends javax.swing.JFrame {

            public StudentChangePassword() {
                initComponents();
                setVisible(true);
                setSize(750, 750);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                tfstuunirollno.setText(stuid + "");
                tfstuunirollno.setEditable(false);
            }

            private void btstuchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    if (tfstuoldpass.getText().equals("") || tfstunewpass.getText().equals("") || tfstuconfirmpass.equals("")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Fill all Field first");
                    } else {
                        String stuoldpass = tfstuoldpass.getText();
                        String stunewpass = tfstunewpass.getText();
                        String stuconfirmpass = tfstuconfirmpass.getText();
                        if (!tfstunewpass.getText().equals(tfstuconfirmpass.getText())) {
                            JOptionPane.showMessageDialog(StudentConnect.this, "New password and confirm password don't match");
                        } else {
                            dos.writeBytes("Student Change Password\r\n");
                            dos.writeBytes(stuid + "\r\n");
                            dos.writeBytes(stuoldpass + "\r\n");
                            dos.writeBytes(stunewpass + "\r\n");
                            dos.writeBytes(stuconfirmpass + "\r\n");

                        }
                    }
                } catch (Exception e) {
                }
            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                jTextField1 = new javax.swing.JTextField();
                lbstuchange = new javax.swing.JLabel();
                studentpasspanel2 = new javax.swing.JPanel();
                stuchangepasspanel = new javax.swing.JPanel();
                btstuchangepassword = new javax.swing.JButton();
                tfstuconfirmpass = new javax.swing.JPasswordField();
                tfstunewpass = new javax.swing.JPasswordField();
                tfstuoldpass = new javax.swing.JPasswordField();
                tfstuunirollno = new javax.swing.JTextField();
                lbstuconfirmpass = new javax.swing.JLabel();
                lbstunewpass = new javax.swing.JLabel();
                lbstuoldpass = new javax.swing.JLabel();
                lbsturol = new javax.swing.JLabel();

                jTextField1.setText("jTextField1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(null);

                lbstuchange.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
                lbstuchange.setForeground(new java.awt.Color(102, 0, 102));
                lbstuchange.setText("Student Change Password");
                getContentPane().add(lbstuchange);
                lbstuchange.setBounds(180, 20, 380, 40);

                studentpasspanel2.setBackground(new java.awt.Color(204, 153, 253));
                studentpasspanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                studentpasspanel2.setLayout(null);

                stuchangepasspanel.setBackground(new java.awt.Color(255, 255, 255));
                stuchangepasspanel.setLayout(null);

                btstuchangepassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                btstuchangepassword.setForeground(new java.awt.Color(102, 0, 102));
                btstuchangepassword.setText("Change");
                btstuchangepassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                btstuchangepassword.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btstuchangepasswordActionPerformed(evt);
                    }
                });
                stuchangepasspanel.add(btstuchangepassword);
                btstuchangepassword.setBounds(160, 310, 140, 50);

                tfstuconfirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stuchangepasspanel.add(tfstuconfirmpass);
                tfstuconfirmpass.setBounds(230, 230, 250, 40);

                tfstunewpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stuchangepasspanel.add(tfstunewpass);
                tfstunewpass.setBounds(230, 180, 250, 40);

                tfstuoldpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stuchangepasspanel.add(tfstuoldpass);
                tfstuoldpass.setBounds(230, 130, 250, 40);

                tfstuunirollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stuchangepasspanel.add(tfstuunirollno);
                tfstuunirollno.setBounds(230, 80, 250, 40);

                lbstuconfirmpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbstuconfirmpass.setForeground(new java.awt.Color(102, 0, 102));
                lbstuconfirmpass.setText("Confirm Password");
                stuchangepasspanel.add(lbstuconfirmpass);
                lbstuconfirmpass.setBounds(30, 230, 170, 30);

                lbstunewpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbstunewpass.setForeground(new java.awt.Color(102, 0, 102));
                lbstunewpass.setText("New Password");
                stuchangepasspanel.add(lbstunewpass);
                lbstunewpass.setBounds(30, 180, 150, 30);

                lbstuoldpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbstuoldpass.setForeground(new java.awt.Color(102, 0, 102));
                lbstuoldpass.setText("Old Password");
                stuchangepasspanel.add(lbstuoldpass);
                lbstuoldpass.setBounds(30, 130, 170, 30);

                lbsturol.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbsturol.setForeground(new java.awt.Color(102, 0, 102));
                lbsturol.setText("University_Rollno");
                stuchangepasspanel.add(lbsturol);
                lbsturol.setBounds(30, 80, 180, 30);

                studentpasspanel2.add(stuchangepasspanel);
                stuchangepasspanel.setBounds(40, 40, 510, 400);

                getContentPane().add(studentpasspanel2);
                studentpasspanel2.setBounds(90, 150, 590, 480);

                pack();
            }// </editor-fold>                        

            private javax.swing.JButton btstuchangepassword;
            private javax.swing.JTextField jTextField1;
            private javax.swing.JLabel lbstuchange;
            private javax.swing.JLabel lbstuconfirmpass;
            private javax.swing.JLabel lbstunewpass;
            private javax.swing.JLabel lbstuoldpass;
            private javax.swing.JLabel lbsturol;
            private javax.swing.JPanel stuchangepasspanel;
            private javax.swing.JPanel studentpasspanel2;
            private javax.swing.JPasswordField tfstuconfirmpass;
            private javax.swing.JPasswordField tfstunewpass;
            private javax.swing.JPasswordField tfstuoldpass;
            private javax.swing.JTextField tfstuunirollno;
        }// </editor-fold>                        

        /**
         * @param args the command line arguments
         */
        // Variables declaration - do not modify                     
        // End of variables declaration  
        public class StudentEditProfile extends javax.swing.JFrame {

            public StudentEditProfile() {
                initComponents();
                setVisible(true);
                setSize(750, 700);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                tfeditrollno.setText(stuid + "");
                tfeditrollno.setEditable(false);
                tfeditemail.setText(email);
                tfeditcontact.setText(contact);
                tfeditaddress.setText(address);
            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                lbstuedit = new javax.swing.JLabel();
                stueditpanel2 = new javax.swing.JPanel();
                stueditpanel1 = new javax.swing.JPanel();
                btstuedit = new javax.swing.JButton();
                tfeditrollno = new javax.swing.JTextField();
                lbeditmail = new javax.swing.JLabel();
                lbeditcontact = new javax.swing.JLabel();
                lbeditadd = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tfeditaddress = new javax.swing.JTextArea();
                tfeditcontact = new javax.swing.JTextField();
                tfeditemail = new javax.swing.JTextField();
                lbeditroll = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(null);

                lbstuedit.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
                lbstuedit.setForeground(new java.awt.Color(102, 0, 102));
                lbstuedit.setText("Edit Profile");
                getContentPane().add(lbstuedit);
                lbstuedit.setBounds(300, 10, 290, 40);

                stueditpanel2.setBackground(new java.awt.Color(204, 153, 253));
                stueditpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                stueditpanel2.setLayout(null);

                stueditpanel1.setBackground(new java.awt.Color(255, 255, 255));
                stueditpanel1.setLayout(null);

                btstuedit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                btstuedit.setText("Edit");
                btstuedit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                btstuedit.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btstueditActionPerformed(evt);
                    }
                });
                stueditpanel1.add(btstuedit);
                btstuedit.setBounds(140, 340, 170, 50);

                tfeditrollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stueditpanel1.add(tfeditrollno);
                tfeditrollno.setBounds(210, 30, 250, 40);

                lbeditmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditmail.setForeground(new java.awt.Color(102, 0, 102));
                lbeditmail.setText("Email");
                stueditpanel1.add(lbeditmail);
                lbeditmail.setBounds(20, 100, 140, 30);

                lbeditcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditcontact.setForeground(new java.awt.Color(102, 0, 102));
                lbeditcontact.setText("Contact");
                stueditpanel1.add(lbeditcontact);
                lbeditcontact.setBounds(20, 160, 100, 30);

                lbeditadd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditadd.setForeground(new java.awt.Color(102, 0, 102));
                lbeditadd.setText("Address");
                stueditpanel1.add(lbeditadd);
                lbeditadd.setBounds(20, 210, 90, 30);

                tfeditaddress.setColumns(20);
                tfeditaddress.setForeground(new java.awt.Color(102, 0, 102));
                tfeditaddress.setLineWrap(true);
                tfeditaddress.setRows(5);
                tfeditaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                jScrollPane1.setViewportView(tfeditaddress);

                stueditpanel1.add(jScrollPane1);
                jScrollPane1.setBounds(210, 220, 250, 90);

                tfeditcontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stueditpanel1.add(tfeditcontact);
                tfeditcontact.setBounds(210, 160, 250, 40);

                tfeditemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                stueditpanel1.add(tfeditemail);
                tfeditemail.setBounds(210, 100, 250, 40);

                lbeditroll.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditroll.setForeground(new java.awt.Color(102, 0, 102));
                lbeditroll.setText("University_rollno");
                stueditpanel1.add(lbeditroll);
                lbeditroll.setBounds(20, 30, 160, 40);

                stueditpanel2.add(stueditpanel1);
                stueditpanel1.setBounds(30, 30, 490, 410);

                getContentPane().add(stueditpanel2);
                stueditpanel2.setBounds(100, 120, 550, 470);

                pack();
            }// </editor-fold>                        

            private void btstueditActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    String email = tfeditemail.getText();
                    String contact = tfeditcontact.getText();
                    String add = tfeditaddress.getText();
                    if (tfeditemail.getText().equals("") || tfeditcontact.getText().equals("") || tfeditaddress.getText().equals("")) {
                        JOptionPane.showMessageDialog(StudentConnect.this, "Fill all field first");
                    } else {
                        dos.writeBytes("Edit student\r\n");
                        dos.writeBytes(stuid + "\r\n");
                        dos.writeBytes(email + "\r\n");
                        dos.writeBytes(contact + "\r\n");
                        dos.writeBytes(add + "\r\n");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JButton btstuedit;
            private javax.swing.JScrollPane jScrollPane1;
            private javax.swing.JLabel lbeditadd;
            private javax.swing.JLabel lbeditcontact;
            private javax.swing.JLabel lbeditmail;
            private javax.swing.JLabel lbeditroll;
            private javax.swing.JLabel lbstuedit;
            private javax.swing.JPanel stueditpanel1;
            private javax.swing.JPanel stueditpanel2;
            private javax.swing.JTextArea tfeditaddress;
            private javax.swing.JTextField tfeditcontact;
            private javax.swing.JTextField tfeditemail;
            private javax.swing.JTextField tfeditrollno;
            // End of variables declaration                   
        }

        public class StudentDownloadNotes extends javax.swing.JFrame {

            public StudentDownloadNotes() {
                initComponents();
                setVisible(true);
                setSize(1200, 700);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

        lbstudownloadnotes = new javax.swing.JLabel();
        studownloadpanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbnotetitle = new javax.swing.JLabel();
        lbnotedescription = new javax.swing.JLabel();
        lbnotetype = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        tfnotetitle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tfnotetime = new javax.swing.JTextField();
        lbimageicon = new javax.swing.JLabel();
        btdownloadnotes = new javax.swing.JButton();
        jpb = new javax.swing.JProgressBar();
        studownloadpanel2 = new javax.swing.JPanel();
        studownloadpanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelstunotes = new javax.swing.JTable();
        btstudentviewnotes = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbstudownloadnotes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbstudownloadnotes.setForeground(new java.awt.Color(102, 0, 102));
        lbstudownloadnotes.setText("Download Notes");
        getContentPane().add(lbstudownloadnotes);
        lbstudownloadnotes.setBounds(350, 10, 300, 40);

        studownloadpanel3.setBackground(new java.awt.Color(204, 153, 253));
        studownloadpanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studownloadpanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbnotetitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotetitle.setText("Title");
        jPanel1.add(lbnotetitle);
        lbnotetitle.setBounds(10, 30, 90, 30);

        lbnotedescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotedescription.setText("Description");
        jPanel1.add(lbnotedescription);
        lbnotedescription.setBounds(10, 90, 100, 30);

        lbnotetype.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotetype.setText("Type");
        jPanel1.add(lbnotetype);
        lbnotetype.setBounds(10, 270, 80, 30);

        lbtime.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbtime.setText("Time");
        jPanel1.add(lbtime);
        lbtime.setBounds(10, 160, 80, 30);
        jPanel1.add(tfnotetitle);
        tfnotetitle.setBounds(140, 20, 210, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(140, 70, 210, 80);
        jPanel1.add(tfnotetime);
        tfnotetime.setBounds(140, 160, 210, 40);

        lbimageicon.setText("photo");
        jPanel1.add(lbimageicon);
        lbimageicon.setBounds(150, 230, 110, 110);

        btdownloadnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdownloadnotes.setText("Download");
        btdownloadnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdownloadnotesActionPerformed(evt);
            }
        });
        jPanel1.add(btdownloadnotes);
        btdownloadnotes.setBounds(100, 410, 160, 50);
        jPanel1.add(jpb);
        jpb.setBounds(10, 370, 340, 30);

        studownloadpanel3.add(jPanel1);
        jPanel1.setBounds(30, 30, 360, 470);

        getContentPane().add(studownloadpanel3);
        studownloadpanel3.setBounds(690, 80, 420, 530);

        studownloadpanel2.setBackground(new java.awt.Color(204, 153, 253));
        studownloadpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studownloadpanel2.setLayout(null);

        studownloadpanel1.setBackground(new java.awt.Color(255, 255, 255));
        studownloadpanel1.setLayout(null);

        jtabelstunotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jtabelstunotes.setModel(tm2);
        jScrollPane1.setViewportView(jtabelstunotes);

        studownloadpanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 610, 300);

        btstudentviewnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstudentviewnotes.setForeground(new java.awt.Color(102, 0, 102));
        btstudentviewnotes.setText("View Notes");
        btstudentviewnotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstudentviewnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstudentviewnotesActionPerformed(evt);
            }
        });
        studownloadpanel1.add(btstudentviewnotes);
        btstudentviewnotes.setBounds(60, 330, 170, 50);

        btdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdelete.setForeground(new java.awt.Color(102, 0, 102));
        btdelete.setText("Delete");
        btdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        studownloadpanel1.add(btdelete);
        btdelete.setBounds(340, 330, 180, 50);

        studownloadpanel2.add(studownloadpanel1);
        studownloadpanel1.setBounds(20, 30, 630, 390);

        getContentPane().add(studownloadpanel2);
        studownloadpanel2.setBounds(10, 90, 670, 450);

        pack();
    }// </editor-fold>                        

            private void btdownloadnotesActionPerformed(java.awt.event.ActionEvent evt) {
                try {

                    int ans = chooser.showOpenDialog(StudentConnect.this);
                    if (ans == JFileChooser.APPROVE_OPTION) {
                        System.out.println("inside approve");
                        path = chooser.getSelectedFile().getAbsolutePath();
                        dos.writeBytes("download notes\r\n");
                        int note_id = al.get(index).note_id;
                        dos.writeBytes(note_id + "\r\n");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {
                int r = jtabelstunotes.getSelectedRow();
                if (r == -1) {
                    JOptionPane.showMessageDialog(this, "Please select a row first");
                } else {
                    try {

                        int note_id = al.get(r).note_id;
                        al.remove(r);
                        tm2.fireTableDataChanged();
                        dos.writeBytes("Student delete note\r\n");
                        dos.writeBytes(note_id + "\r\n");
                        dos.writeBytes(stuid + "\r\n");

                    } catch (IOException ex) {
                        Logger.getLogger(StudentConnect.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            private void btstudentviewnotesActionPerformed(java.awt.event.ActionEvent evt) {
                index = jtabelstunotes.getSelectedRow();
                if (index == -1) {
                    JOptionPane.showMessageDialog(StudentConnect.this, "Select row first");
                } else {
                    String title = al.get(index).title;
                    String description = al.get(index).description;
                    String time = al.get(index).time;
                    String type = al.get(index).type;
                    if (type.equals("pdf")) {
                        try {
                            String path = ("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\label pic\\pdf image.jpg");
                            BufferedImage orgimage = ImageIO.read(new File(path));
                            BufferedImage resizedImage = StudentConnect.this.resize(orgimage, 110, 110);
                            lbimageicon.setIcon(new ImageIcon(resizedImage));
                        } catch (IOException ex) {
                            Logger.getLogger(StudentConnect.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (type.equals("Audio")) {
                        try {
                            String path = ("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\label pic\\mp3 image.jpg");
                            BufferedImage orgimage = ImageIO.read(new File(path));
                            BufferedImage resizedImage = StudentConnect.this.resize(orgimage, 110, 110);
                            lbimageicon.setIcon(new ImageIcon(resizedImage));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (type.equals("Video")) {
                        try {
                            String path = ("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\label pic\\mp42.jpg");
                            BufferedImage orgimage = ImageIO.read(new File(path));
                            BufferedImage resizedImage = StudentConnect.this.resize(orgimage, 110, 110);
                            lbimageicon.setIcon(new ImageIcon(resizedImage));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    } else if (type.equals("Image")) {
                        try {
                            String path = "C:\\\\Users\\\\vaishali\\\\Documents\\\\NetBeansProjects\\\\NotesShaing\\\\Project pic\\\\label pic\\\\jpg2.jpg";
                            //    lbimageicon.setIcon(new ImageIcon("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\label pic\\jpg2.jpg"));
                            BufferedImage orgimage = ImageIO.read(new File(path));
                            BufferedImage resizedImage = StudentConnect.this.resize(orgimage, 110, 110);
                            lbimageicon.setIcon(new ImageIcon(resizedImage));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                    tfnotetitle.setText(title);
                    tfnotetime.setText(time);
                    jTextArea1.setText(description);
                    obj3.jPanel1.setVisible(true);
            obj3.studownloadpanel3.setVisible(true);

                }
            }
            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JButton btdelete;
    private javax.swing.JButton btdownloadnotes;
    private javax.swing.JButton btstudentviewnotes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JProgressBar jpb;
    private javax.swing.JTable jtabelstunotes;
    private javax.swing.JLabel lbimageicon;
    private javax.swing.JLabel lbnotedescription;
    private javax.swing.JLabel lbnotetitle;
    private javax.swing.JLabel lbnotetype;
    private javax.swing.JLabel lbstudownloadnotes;
    private javax.swing.JLabel lbtime;
    private javax.swing.JPanel studownloadpanel1;
    private javax.swing.JPanel studownloadpanel2;
    private javax.swing.JPanel studownloadpanel3;
    private javax.swing.JTextField tfnotetime;
    private javax.swing.JTextField tfnotetitle;
    // End of variables declaration                   
        }

    }

    public class notes {

        int note_id;
        String title;
        String description;
        String time;
        String type;
        String username;

        notes(int note_id, String title, String description, String time, String type, String username) {
            this.note_id = note_id;
            this.title = title;
            this.description = description;
            this.time = time;
            this.type = type;
            this.username = username;
        }
    }

    public class tabelmodel extends AbstractTableModel {

        String title[] = {"Note_id", "Title", "Description", "Time", "Type", "Username"};

        public String getColumnName(int a) {
            return title[a];
        }

        public int getRowCount() {
            return al.size();

        }

        public int getColumnCount() {
            return title.length;

        }

        public Object getValueAt(int row, int col) {
            if (col == 0) {
                return al.get(row).note_id;
            }

            if (col == 1) {
                return al.get(row).title;
            }

            if (col == 2) {
                return al.get(row).description;
            }

            if (col == 3) {
                return al.get(row).time;
            }

            if (col == 4) {
                return al.get(row).type;
            } else {
                return al.get(row).username;
            }

        }

    }

    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
}

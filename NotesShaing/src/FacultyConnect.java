
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacultyConnect extends javax.swing.JFrame {

    Socket sock;
    DataInputStream dis;
    DataOutputStream dos;
    Facultyhomepage obj;

    int id;
    String name;
    String email;
    String phone;
    String address;
    String experience;
    String qualification;
    String pass;
    String dpname;
    String coursename;
    int flag = 0;
    File f;
    Facultyhomepage.FacultyEditProfile obj1;
    Facultyhomepage.FacultyChangePassword objpass;
    Facultyhomepage.EditFacultyPic obj2;
    Facultyhomepage.AddNotes obj3;
    Facultyhomepage.ViewNoteHistory obj4;
    ArrayList<Student> al = new ArrayList<>();
    ArrayList<Viewhistory> pl = new ArrayList<>();
    mytable tm;
    TableNotesView tm3;

    public FacultyConnect() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();

        setVisible(true);
        tm = new mytable();
        setSize(750, 700);
         getContentPane().setBackground(Color.white);
         facultyconnectpanel.setVisible(false);
        panellogin.setVisible(false);
        tm3 = new TableNotesView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btconnect = new javax.swing.JButton();
        facultyconnectpanel = new javax.swing.JPanel();
        panellogin = new javax.swing.JPanel();
        lblogin = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        tfloginid = new javax.swing.JTextField();
        lbpassword = new javax.swing.JLabel();
        tfpassword = new javax.swing.JPasswordField();
        btlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btconnect.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btconnect.setText("Connect");
        btconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconnectActionPerformed(evt);
            }
        });
        getContentPane().add(btconnect);
        btconnect.setBounds(250, 30, 170, 40);

        facultyconnectpanel.setBackground(new java.awt.Color(204, 153, 253));
        facultyconnectpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        facultyconnectpanel.setLayout(null);

        panellogin.setBackground(new java.awt.Color(255, 255, 255));
        panellogin.setLayout(null);

        lblogin.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblogin.setForeground(new java.awt.Color(102, 0, 102));
        lblogin.setText("Faculty Login");
        panellogin.add(lblogin);
        lblogin.setBounds(90, 50, 260, 40);

        lbusername.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbusername.setForeground(new java.awt.Color(102, 0, 102));
        lbusername.setText("Enter Id");
        panellogin.add(lbusername);
        lbusername.setBounds(50, 160, 150, 30);

        tfloginid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        panellogin.add(tfloginid);
        tfloginid.setBounds(210, 160, 180, 30);

        lbpassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(102, 0, 102));
        lbpassword.setText("Password");
        panellogin.add(lbpassword);
        lbpassword.setBounds(50, 230, 100, 30);

        tfpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        panellogin.add(tfpassword);
        tfpassword.setBounds(210, 230, 180, 30);

        btlogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btlogin.setForeground(new java.awt.Color(102, 0, 102));
        btlogin.setText("Login");
        btlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        panellogin.add(btlogin);
        btlogin.setBounds(170, 320, 90, 27);

        facultyconnectpanel.add(panellogin);
        panellogin.setBounds(40, 40, 450, 400);

        getContentPane().add(facultyconnectpanel);
        facultyconnectpanel.setBounds(80, 110, 530, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconnectActionPerformed
        try {
            btconnect.setVisible(false);
            panellogin.setVisible(true);
         facultyconnectpanel.setVisible(true);

            sock = new Socket("127.0.0.1", 8000);
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());
            dos.writeBytes("Testing Server  \r\n");
            String ServerMessage = dis.readLine();
            System.out.println("ServerMessage :" + ServerMessage);
            reciever obj = new reciever();
            Thread t1 = new Thread(obj);
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btconnectActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        try {
            if (tfloginid.getText().equals("") || tfpassword.getText().equals("")) {
                JOptionPane.showMessageDialog(FacultyConnect.this, "Fill all field first");
            } else {
                id = Integer.parseInt(tfloginid.getText());
                pass = tfpassword.getText();
                dos.writeBytes("faculty login\r\n");
                dos.writeBytes(id + "\r\n");
                dos.writeBytes(pass + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btloginActionPerformed

    /**
     */
    public class reciever implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    String s = dis.readLine();
                    if (s.equals("Login Successful")) {
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(FacultyConnect.this, "Login Successful");
                            dispose();
                            obj = new Facultyhomepage();
                            obj.setVisible(true);
                            flag = 1;
                        }

                    } else if (s.equals("Login Failed")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Login failed");
                        tfloginid.setText("");
                        tfpassword.setText("");
                    } else if (s.equals("Main data")) {
                        id = Integer.parseInt(dis.readLine());
                        name = dis.readLine();
                        dpname = dis.readLine();
                        coursename = dis.readLine();
                        email = dis.readLine();
                        phone = dis.readLine();
                        address = dis.readLine();
                        qualification = dis.readLine();
                        experience = dis.readLine();
                        obj.lbusername.setText(name);
                        obj.lbdpname.setText(dpname);
                        obj.lbcoursename.setText(coursename);
                        obj.lbemail.setText(email);
                        obj.lbphone.setText(phone);
                        obj.lbaddress.setText(address);
                        obj.lbqualification.setText(qualification);
                        obj.lbexperience.setText(experience);
                        dos.writeBytes("check pic\r\n");
                        dos.writeBytes(id + "\r\n");
                    } else if (s.equals("pic exist")) {
                        long size = dis.readLong();
                        FileOutputStream fos = new FileOutputStream("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\client\\" + id + ".jpg");
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
                        BufferedImage org = ImageIO.read(new File("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\client\\" + id + ".jpg"));
                        BufferedImage resized = resize(org, 210, 270);
                        obj.lbprofile.setIcon(new ImageIcon(resized));
                    } else if (s.equalsIgnoreCase("pic doesnt exist")) {
                        BufferedImage org = ImageIO.read(new File("E:\\Cloud Note Sharing Complete Project\\NotesShaing\\Project pic\\client\\empty_pic.jpg"));
                        BufferedImage resized = resize(org, 210, 270);
                        obj.lbprofile.setIcon(new ImageIcon(resized));
                    } else if (s.equals("data is edit")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Updation is Successfull");
                        dos.writeBytes("faculty login\r\n");
                        dos.writeBytes(id + "\r\n");
                        dos.writeBytes(pass + "\r\n");
                        obj1.dispose();

                    } else if (s.equals("Data not found")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Data not found");

                    } else if (s.equals("Updation is successful")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Password change Successfully");
                        objpass.dispose();

                    } else if (s.equals("Username and password don't match")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Username and password donot match");
                        objpass.tffacultyid.setText("");
                        objpass.tfoldpass.setText("");
                        objpass.tfnewpass.setText("");
                        objpass.tfconfirmpass.setText("");
                    } else if (s.equals("Send no of rows")) {
                        int count = Integer.parseInt(dis.readLine());
                        al.clear();
                        for (int i = 0; i < count; i++) {
                            int rollno = Integer.parseInt(dis.readLine());
                            String department_name = dis.readLine();
                            String course_name = dis.readLine();
                            String email = dis.readLine();
                            String contact = dis.readLine();
                            al.add(new Student(rollno, department_name, course_name, email, contact, new Boolean(false)));

                        }
                        tm.fireTableDataChanged();
                        System.out.println("after getting data");
                        obj3.setVisible(true);
                    } else if (s.equals("Notes Added")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Notes added successfully");
                        obj3.dispose();
                    } else if (s.equals("Send no of rowscount")) {
                        int count = Integer.parseInt(dis.readLine());
                        pl.clear();
                        for (int i = 0; i < count; i++) {
                            int id = Integer.parseInt(dis.readLine());
                            String title = dis.readLine();
                            String description = dis.readLine();
                            String time = dis.readLine();
                            String type = dis.readLine();
                            pl.add(new Viewhistory(id, title, description, time, type));
                        }
                        tm3.fireTableDataChanged();
                    } else if (s.equals("rownote delete")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Row delete Successfully");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(FacultyConnect.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyConnect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyConnect().setVisible(true);
            }
        });
    }

    public class Facultyhomepage extends javax.swing.JFrame {

        public Facultyhomepage() {
            initComponents();
            setVisible(true);
            setSize(900, 700);
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
            lbwelcome = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            lbprofile = new javax.swing.JLabel();
            jPanel3 = new javax.swing.JPanel();
            lbdpname = new javax.swing.JLabel();
            lbcoursename = new javax.swing.JLabel();
            lbemail = new javax.swing.JLabel();
            lbphone = new javax.swing.JLabel();
            lbaddress = new javax.swing.JLabel();
            lbqualification = new javax.swing.JLabel();
            lbexperience = new javax.swing.JLabel();
            lbusername = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            btchangepass = new javax.swing.JButton();
            bteditprofile = new javax.swing.JButton();
            bteditprofilepic = new javax.swing.JButton();
            btaddnotes = new javax.swing.JButton();
            bthistory = new javax.swing.JButton();
            btexit = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            lbwelcome.setFont(new java.awt.Font("Times New Roman", 2, 44)); // NOI18N
            lbwelcome.setForeground(new java.awt.Color(102, 0, 102));
            lbwelcome.setText("Welcome");
            getContentPane().add(lbwelcome);
            lbwelcome.setBounds(310, 20, 200, 30);

            jPanel1.setBackground(new java.awt.Color(204, 153, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
            jPanel1.setLayout(null);

            lbprofile.setText("Profile pic");
            lbprofile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
            jPanel1.add(lbprofile);
            lbprofile.setBounds(20, 40, 210, 270);

            jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            jPanel3.setLayout(null);

            lbdpname.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbdpname.setForeground(new java.awt.Color(102, 0, 102));
            lbdpname.setText("departmentname");
            jPanel3.add(lbdpname);
            lbdpname.setBounds(10, 20, 190, 30);

            lbcoursename.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbcoursename.setForeground(new java.awt.Color(102, 0, 102));
            lbcoursename.setText("coursename");
            jPanel3.add(lbcoursename);
            lbcoursename.setBounds(10, 70, 190, 30);

            lbemail.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbemail.setForeground(new java.awt.Color(102, 0, 102));
            lbemail.setText("email");
            jPanel3.add(lbemail);
            lbemail.setBounds(10, 110, 200, 30);

            lbphone.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbphone.setForeground(new java.awt.Color(102, 0, 102));
            lbphone.setText("phone");
            jPanel3.add(lbphone);
            lbphone.setBounds(10, 150, 190, 30);

            lbaddress.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbaddress.setForeground(new java.awt.Color(102, 0, 102));
            lbaddress.setText("address");
            jPanel3.add(lbaddress);
            lbaddress.setBounds(10, 190, 200, 30);

            lbqualification.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbqualification.setForeground(new java.awt.Color(102, 0, 102));
            lbqualification.setText("qualification");
            jPanel3.add(lbqualification);
            lbqualification.setBounds(10, 240, 190, 30);

            lbexperience.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            lbexperience.setForeground(new java.awt.Color(102, 0, 102));
            lbexperience.setText("experience");
            jPanel3.add(lbexperience);
            lbexperience.setBounds(10, 290, 190, 30);

            jPanel1.add(jPanel3);
            jPanel3.setBounds(270, 20, 230, 380);

            getContentPane().add(jPanel1);
            jPanel1.setBounds(20, 180, 520, 410);

            lbusername.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
            lbusername.setForeground(new java.awt.Color(102, 0, 102));
            lbusername.setText("lbusername");
            getContentPane().add(lbusername);
            lbusername.setBounds(520, 20, 200, 30);

            jPanel2.setBackground(new java.awt.Color(204, 153, 255));
            jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
            jPanel2.setLayout(null);

            btchangepass.setBackground(new java.awt.Color(255, 255, 255));
            btchangepass.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            btchangepass.setForeground(new java.awt.Color(102, 0, 102));
            btchangepass.setText("Change Password");
            btchangepass.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btchangepassActionPerformed(evt);
                }
            });
            jPanel2.add(btchangepass);
            btchangepass.setBounds(40, 20, 200, 70);

            bteditprofile.setBackground(new java.awt.Color(255, 255, 255));
            bteditprofile.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            bteditprofile.setForeground(new java.awt.Color(102, 0, 102));
            bteditprofile.setText("Edit Profile");
            bteditprofile.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bteditprofileActionPerformed(evt);
                }
            });
            jPanel2.add(bteditprofile);
            bteditprofile.setBounds(40, 90, 200, 60);

            bteditprofilepic.setBackground(new java.awt.Color(255, 255, 255));
            bteditprofilepic.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            bteditprofilepic.setForeground(new java.awt.Color(102, 0, 102));
            bteditprofilepic.setText("Edit Profile Pic");
            bteditprofilepic.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bteditprofilepicActionPerformed(evt);
                }
            });
            jPanel2.add(bteditprofilepic);
            bteditprofilepic.setBounds(40, 150, 200, 60);

            btaddnotes.setBackground(new java.awt.Color(255, 255, 255));
            btaddnotes.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            btaddnotes.setForeground(new java.awt.Color(102, 0, 102));
            btaddnotes.setText("Add Notes");
            btaddnotes.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btaddnotesActionPerformed(evt);
                }
            });
            jPanel2.add(btaddnotes);
            btaddnotes.setBounds(40, 210, 200, 60);

            bthistory.setBackground(new java.awt.Color(255, 255, 255));
            bthistory.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            bthistory.setForeground(new java.awt.Color(102, 0, 102));
            bthistory.setText("View Note History");
            bthistory.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bthistoryActionPerformed(evt);
                }
            });
            jPanel2.add(bthistory);
            bthistory.setBounds(40, 270, 200, 60);

            btexit.setBackground(new java.awt.Color(255, 255, 255));
            btexit.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
            btexit.setForeground(new java.awt.Color(102, 0, 102));
            btexit.setText("Exit");
            btexit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btexitActionPerformed(evt);
                }
            });
            jPanel2.add(btexit);
            btexit.setBounds(40, 330, 200, 60);

            getContentPane().add(jPanel2);
            jPanel2.setBounds(570, 180, 290, 410);

            pack();
        }// </editor-fold>                        

        private void btchangepassActionPerformed(java.awt.event.ActionEvent evt) {
            objpass = new Facultyhomepage.FacultyChangePassword();

            objpass.setVisible(true);
        }

        public class FacultyChangePassword extends javax.swing.JFrame {

            public FacultyChangePassword() {

                initComponents();
                setVisible(true);
                setSize(800, 650);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                tffacultyid.setText(id + "");

            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                lbfacultychangepassword = new javax.swing.JLabel();
                facultychangepasswordpanel2 = new javax.swing.JPanel();
                facultychangepasswordpanel = new javax.swing.JPanel();
                btchangepassword = new javax.swing.JButton();
                lbfacultyid = new javax.swing.JLabel();
                tffacultyid = new javax.swing.JTextField();
                lboldpass = new javax.swing.JLabel();
                tfoldpass = new javax.swing.JPasswordField();
                lbnewpass = new javax.swing.JLabel();
                tfnewpass = new javax.swing.JPasswordField();
                lbconfirmpass = new javax.swing.JLabel();
                tfconfirmpass = new javax.swing.JPasswordField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(null);

                lbfacultychangepassword.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
                lbfacultychangepassword.setForeground(new java.awt.Color(102, 0, 102));
                lbfacultychangepassword.setText("Faculty Change Password");
                getContentPane().add(lbfacultychangepassword);
                lbfacultychangepassword.setBounds(160, 0, 400, 40);

                facultychangepasswordpanel2.setBackground(new java.awt.Color(204, 153, 253));
                facultychangepasswordpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                facultychangepasswordpanel2.setLayout(null);

                facultychangepasswordpanel.setBackground(new java.awt.Color(255, 255, 255));
                facultychangepasswordpanel.setLayout(null);

                btchangepassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                btchangepassword.setText("Change Password");
                btchangepassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                btchangepassword.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btchangepasswordActionPerformed(evt);
                    }
                });
                facultychangepasswordpanel.add(btchangepassword);
                btchangepassword.setBounds(110, 320, 180, 50);

                lbfacultyid.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbfacultyid.setForeground(new java.awt.Color(102, 0, 102));
                lbfacultyid.setText("Faculty_id");
                facultychangepasswordpanel.add(lbfacultyid);
                lbfacultyid.setBounds(20, 50, 130, 40);

                tffacultyid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultychangepasswordpanel.add(tffacultyid);
                tffacultyid.setBounds(190, 50, 220, 40);

                lboldpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lboldpass.setForeground(new java.awt.Color(102, 0, 102));
                lboldpass.setText("Old Password");
                facultychangepasswordpanel.add(lboldpass);
                lboldpass.setBounds(20, 110, 160, 40);

                tfoldpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultychangepasswordpanel.add(tfoldpass);
                tfoldpass.setBounds(190, 110, 220, 40);

                lbnewpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbnewpass.setForeground(new java.awt.Color(102, 0, 102));
                lbnewpass.setText("New Password");
                facultychangepasswordpanel.add(lbnewpass);
                lbnewpass.setBounds(20, 170, 150, 30);

                tfnewpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultychangepasswordpanel.add(tfnewpass);
                tfnewpass.setBounds(190, 170, 220, 40);

                lbconfirmpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbconfirmpass.setForeground(new java.awt.Color(102, 0, 102));
                lbconfirmpass.setText("Confirm Password");
                facultychangepasswordpanel.add(lbconfirmpass);
                lbconfirmpass.setBounds(20, 230, 160, 30);

                tfconfirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultychangepasswordpanel.add(tfconfirmpass);
                tfconfirmpass.setBounds(190, 230, 220, 40);

                facultychangepasswordpanel2.add(facultychangepasswordpanel);
                facultychangepasswordpanel.setBounds(30, 30, 420, 420);

                getContentPane().add(facultychangepasswordpanel2);
                facultychangepasswordpanel2.setBounds(100, 110, 480, 480);

                pack();
            }// </editor-fold>                        

            private void btchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {

                try {
                    if (tffacultyid.getText().equals("") || tfoldpass.getText().equals("") || tfnewpass.getText().equals("") || tfconfirmpass.getText().equals("")) {
                        JOptionPane.showMessageDialog(FacultyChangePassword.this, "Fill all Field first");
                    } else {
                        //  String name = tffacultyid.getText();
                        String oldpass = tfoldpass.getText();
                        String newpass = tfnewpass.getText();
                        String confirmpass = tfconfirmpass.getText();
                        if (!tfnewpass.getText().equals(tfconfirmpass.getText())) {
                            JOptionPane.showMessageDialog(FacultyConnect.this, "New password and confirm password don't match");
                        } else {
                            dos.writeBytes("Faculty Change Password\r\n");
                            dos.writeBytes(id + "\r\n");
                            dos.writeBytes(oldpass + "\r\n");
                            dos.writeBytes(newpass + "\r\n");
                            dos.writeBytes(confirmpass + "\r\n");
                            //  String s = dis.readLine();

                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JButton btchangepassword;
            private javax.swing.JPanel facultychangepasswordpanel;
            private javax.swing.JPanel facultychangepasswordpanel2;
            private javax.swing.JLabel lbconfirmpass;
            private javax.swing.JLabel lbfacultychangepassword;
            private javax.swing.JLabel lbfacultyid;
            private javax.swing.JLabel lbnewpass;
            private javax.swing.JLabel lboldpass;
            private javax.swing.JPasswordField tfconfirmpass;
            private javax.swing.JTextField tffacultyid;
            private javax.swing.JPasswordField tfnewpass;
            private javax.swing.JPasswordField tfoldpass;
            // End of variables declaration                   
        }

        private void bteditprofileActionPerformed(java.awt.event.ActionEvent evt) {
            obj1 = new FacultyEditProfile();
            obj1.setVisible(true);
        }

        public class FacultyEditProfile extends javax.swing.JFrame {

            public FacultyEditProfile() {
                initComponents();
                setVisible(true);
                setSize(690, 700);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                tfeditname.setText(name);
                tfeditname.setEditable(false);
                tfeditemail.setText(email);
                tfeditaddress.setText(address);
                tfeditphone.setText(phone);
                tfeditexperience.setText(experience);
            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
                lbeditprofile = new javax.swing.JLabel();
                facultyeditprofilepanel2 = new javax.swing.JPanel();
                facultyeditprofilepanel = new javax.swing.JPanel();
                lbeditname = new javax.swing.JLabel();
                lbeditemail = new javax.swing.JLabel();
                tfeditname = new javax.swing.JTextField();
                tfeditemail = new javax.swing.JTextField();
                lbeditcontact = new javax.swing.JLabel();
                lbeditaddress = new javax.swing.JLabel();
                lbeditexp = new javax.swing.JLabel();
                tfeditphone = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                tfeditaddress = new javax.swing.JTextArea();
                tfeditexperience = new javax.swing.JTextField();
                bteditprofileinner = new javax.swing.JButton();

                jCheckBoxMenuItem1.setSelected(true);
                jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                getContentPane().setLayout(null);

                lbeditprofile.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
                lbeditprofile.setForeground(new java.awt.Color(102, 0, 102));
                lbeditprofile.setText("Edit Profile");
                getContentPane().add(lbeditprofile);
                lbeditprofile.setBounds(240, 10, 220, 40);

                facultyeditprofilepanel2.setBackground(new java.awt.Color(204, 153, 253));
                facultyeditprofilepanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                facultyeditprofilepanel2.setLayout(null);

                facultyeditprofilepanel.setBackground(new java.awt.Color(255, 255, 255));
                facultyeditprofilepanel.setLayout(null);

                lbeditname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditname.setForeground(new java.awt.Color(102, 0, 102));
                lbeditname.setText("Username");
                facultyeditprofilepanel.add(lbeditname);
                lbeditname.setBounds(10, 30, 110, 30);

                lbeditemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditemail.setForeground(new java.awt.Color(102, 0, 102));
                lbeditemail.setText("Email");
                facultyeditprofilepanel.add(lbeditemail);
                lbeditemail.setBounds(10, 80, 100, 30);

                tfeditname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultyeditprofilepanel.add(tfeditname);
                tfeditname.setBounds(140, 30, 200, 40);

                tfeditemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultyeditprofilepanel.add(tfeditemail);
                tfeditemail.setBounds(140, 80, 200, 40);

                lbeditcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditcontact.setForeground(new java.awt.Color(102, 0, 102));
                lbeditcontact.setText("Contact");
                facultyeditprofilepanel.add(lbeditcontact);
                lbeditcontact.setBounds(10, 130, 90, 30);

                lbeditaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditaddress.setForeground(new java.awt.Color(102, 0, 102));
                lbeditaddress.setText("Address");
                facultyeditprofilepanel.add(lbeditaddress);
                lbeditaddress.setBounds(10, 190, 90, 30);

                lbeditexp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                lbeditexp.setForeground(new java.awt.Color(102, 0, 102));
                lbeditexp.setText("Experience");
                facultyeditprofilepanel.add(lbeditexp);
                lbeditexp.setBounds(10, 290, 110, 30);

                tfeditphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultyeditprofilepanel.add(tfeditphone);
                tfeditphone.setBounds(140, 130, 200, 40);

                tfeditaddress.setColumns(20);
                tfeditaddress.setRows(5);
                tfeditaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                jScrollPane1.setViewportView(tfeditaddress);

                facultyeditprofilepanel.add(jScrollPane1);
                jScrollPane1.setBounds(140, 190, 200, 80);

                tfeditexperience.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                facultyeditprofilepanel.add(tfeditexperience);
                tfeditexperience.setBounds(140, 290, 200, 40);

                bteditprofileinner.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                bteditprofileinner.setText("Edit Profile");
                bteditprofileinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                bteditprofileinner.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        bteditprofileinnerActionPerformed(evt);
                    }
                });
                facultyeditprofilepanel.add(bteditprofileinner);
                bteditprofileinner.setBounds(100, 390, 170, 50);

                facultyeditprofilepanel2.add(facultyeditprofilepanel);
                facultyeditprofilepanel.setBounds(40, 40, 390, 450);

                getContentPane().add(facultyeditprofilepanel2);
                facultyeditprofilepanel2.setBounds(110, 90, 470, 530);

                pack();
            }// </editor-fold>                        

            private void bteditprofileinnerActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    String username = tfeditname.getText();

                    String email = tfeditemail.getText();
                    String phone = tfeditphone.getText();
                    String add = tfeditaddress.getText();
                    String experience = tfeditexperience.getText();
                    if (username.equals("") || email.equals("") || phone.equals("") || add.equals("") || experience.equals("")) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Fill all field first");
                    } else {
                        dos.writeBytes("Faculty Edit Profile\r\n");
                        dos.writeBytes(id + "\r\n");
                        dos.writeBytes(username + "\r\n");
                        dos.writeBytes(email + "\r\n");
                        dos.writeBytes(phone + "\r\n");
                        dos.writeBytes(add + "\r\n");
                        dos.writeBytes(experience + "\r\n");

                    }

                } catch (Exception e) {
                }
            }

            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JButton bteditprofileinner;
            private javax.swing.JPanel facultyeditprofilepanel;
            private javax.swing.JPanel facultyeditprofilepanel2;
            private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
            private javax.swing.JScrollPane jScrollPane1;
            private javax.swing.JLabel lbeditaddress;
            private javax.swing.JLabel lbeditcontact;
            private javax.swing.JLabel lbeditemail;
            private javax.swing.JLabel lbeditexp;
            private javax.swing.JLabel lbeditname;
            private javax.swing.JLabel lbeditprofile;
            private javax.swing.JTextArea tfeditaddress;
            private javax.swing.JTextField tfeditemail;
            private javax.swing.JTextField tfeditexperience;
            private javax.swing.JTextField tfeditname;
            private javax.swing.JTextField tfeditphone;
            // End of variables declaration                   
        }

        private void bteditprofilepicActionPerformed(java.awt.event.ActionEvent evt) {
            obj2 = new EditFacultyPic();
            obj2.setVisible(true);
        }

        public class EditFacultyPic extends javax.swing.JFrame {

            JFileChooser chooser;
            String path;
            File f;

            public EditFacultyPic() {
                initComponents();
                setVisible(true);
                setSize(650, 600);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

                lbeditpic = new javax.swing.JLabel();
                editpicpanel = new javax.swing.JPanel();
                tfpicpath = new javax.swing.JTextField();
                btbrowse = new javax.swing.JButton();
                editpicpanel2 = new javax.swing.JPanel();
                btupload = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(null);

                lbeditpic.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
                lbeditpic.setForeground(new java.awt.Color(102, 0, 102));
                lbeditpic.setText("Edit Profile Pic");
                getContentPane().add(lbeditpic);
                lbeditpic.setBounds(230, 40, 240, 40);

                editpicpanel.setBackground(new java.awt.Color(204, 153, 253));
                editpicpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
                editpicpanel.setLayout(null);

                tfpicpath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                editpicpanel.add(tfpicpath);
                tfpicpath.setBounds(10, 10, 430, 40);

                btbrowse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                btbrowse.setForeground(new java.awt.Color(102, 0, 102));
                btbrowse.setText("Browse");
                btbrowse.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btbrowseActionPerformed(evt);
                    }
                });
                editpicpanel.add(btbrowse);
                btbrowse.setBounds(460, 10, 120, 40);

                getContentPane().add(editpicpanel);
                editpicpanel.setBounds(20, 190, 590, 60);

                editpicpanel2.setBackground(new java.awt.Color(204, 153, 253));
                editpicpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
                editpicpanel2.setLayout(null);

                btupload.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
                btupload.setForeground(new java.awt.Color(102, 0, 102));
                btupload.setText("Upload");
                btupload.setBorder(null);
                btupload.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btuploadActionPerformed(evt);
                    }
                });
                editpicpanel2.add(btupload);
                btupload.setBounds(20, 20, 130, 40);

                getContentPane().add(editpicpanel2);
                editpicpanel2.setBounds(230, 350, 170, 80);

                pack();
            }// </editor-fold>                        

            private void btuploadActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    JOptionPane.showMessageDialog(FacultyConnect.this, "upload pic");
                    EditFacultyPic.this.dispose();
                    obj.setVisible(true);

                    BufferedImage orgimage = ImageIO.read(new File(path));
                    BufferedImage resizedImage = FacultyConnect.resize(orgimage, 210, 270);

                    lbprofile.setIcon(new ImageIcon(resizedImage));
                } catch (IOException ex) {
                    Logger.getLogger(FacultyConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void btbrowseActionPerformed(java.awt.event.ActionEvent evt) {
                int ans = chooser.showOpenDialog(FacultyConnect.this);
                if (ans == JFileChooser.APPROVE_OPTION) {
                    f = chooser.getSelectedFile();
                    path = f.getPath();
                    tfpicpath.setText(path);
                } else if (ans == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(FacultyConnect.this, "You Selected cancel option");
                }
                try {
                    FileInputStream fis = new FileInputStream(f);
                    long size = f.length();
                    dos.writeBytes("Send profile pic\r\n");
                    dos.writeBytes(id + "\r\n");

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

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JButton btbrowse;
            private javax.swing.JButton btupload;
            private javax.swing.JPanel editpicpanel;
            private javax.swing.JPanel editpicpanel2;
            private javax.swing.JLabel lbeditpic;
            private javax.swing.JTextField tfpicpath;
            // End of variables declaration                   
        }

        private void bthistoryActionPerformed(java.awt.event.ActionEvent evt) {
            try {
                dos.writeBytes("View notes\r\n");
                dos.writeBytes(id + "\r\n");
            } catch (Exception e) {
            }

            obj4 = new Facultyhomepage.ViewNoteHistory();

        }

        // Variables declaration - do not modify                     
        private javax.swing.JButton btaddnotes;
        private javax.swing.JButton btchangepass;
        private javax.swing.JButton bteditprofile;
        private javax.swing.JButton bteditprofilepic;
        private javax.swing.JButton bthistory;
        private javax.swing.JButton btexit;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JLabel lbaddress;
        private javax.swing.JLabel lbcoursename;
        private javax.swing.JLabel lbdpname;
        private javax.swing.JLabel lbemail;
        private javax.swing.JLabel lbexperience;
        private javax.swing.JLabel lbphone;
        private javax.swing.JLabel lbprofile;
        private javax.swing.JLabel lbqualification;
        private javax.swing.JLabel lbusername;
        private javax.swing.JLabel lbwelcome;
        // End of variables declaration    

        private void btaddnotesActionPerformed(java.awt.event.ActionEvent evt) {
            try {
                obj3 = new AddNotes();
                dos.writeBytes("send student list\r\n");
                dos.writeBytes(dpname + "\r\n");
                dos.writeBytes(coursename + "\r\n");
                System.out.println("in add notes");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public class AddNotes extends javax.swing.JFrame {

            JFileChooser chooser;

            public AddNotes() {
                initComponents();
                //  setVisible(true);
                setSize(1000, 750);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                //  jtablestudentdata.setModel(tm);
                chooser = new JFileChooser();
                cbnotestype.addItem("Image");
                cbnotestype.addItem("Audio");
                cbnotestype.addItem("Video");
                cbnotestype.addItem("pdf");
            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

              
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbfacultyaddnotes = new javax.swing.JLabel();
        lbtitle = new javax.swing.JLabel();
        tftitle = new javax.swing.JTextField();
        lbdescription = new javax.swing.JLabel();
        tfdescription = new javax.swing.JTextField();
        lbnotestype = new javax.swing.JLabel();
        cbnotestype = new javax.swing.JComboBox();
        lbselectfile = new javax.swing.JLabel();
        tfselectfile = new javax.swing.JTextField();
        btfilebrowse = new javax.swing.JButton();
        btstuaddnotes = new javax.swing.JButton();
        btselectall = new javax.swing.JButton();
        btdeselectall = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablestudentdata = new javax.swing.JTable();
        Jpaneladdnotes1 = new javax.swing.JPanel();
        jpaneladdnotes2 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbfacultyaddnotes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbfacultyaddnotes.setForeground(new java.awt.Color(102, 0, 102));
        lbfacultyaddnotes.setText("Add Notes");
        getContentPane().add(lbfacultyaddnotes);
        lbfacultyaddnotes.setBounds(370, 0, 250, 40);

        lbtitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(102, 0, 102));
        lbtitle.setText("Title");
        getContentPane().add(lbtitle);
        lbtitle.setBounds(230, 90, 100, 30);

        tftitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tftitle);
        tftitle.setBounds(370, 90, 220, 40);

        lbdescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdescription.setForeground(new java.awt.Color(102, 0, 102));
        lbdescription.setText("Description");
        getContentPane().add(lbdescription);
        lbdescription.setBounds(230, 150, 130, 30);

        tfdescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tfdescription);
        tfdescription.setBounds(370, 150, 220, 40);

        lbnotestype.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotestype.setForeground(new java.awt.Color(102, 0, 102));
        lbnotestype.setText("Type");
        getContentPane().add(lbnotestype);
        lbnotestype.setBounds(230, 210, 90, 30);

        cbnotestype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(cbnotestype);
        cbnotestype.setBounds(370, 210, 220, 40);

        lbselectfile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectfile.setForeground(new java.awt.Color(102, 0, 102));
        lbselectfile.setText("Select File");
        getContentPane().add(lbselectfile);
        lbselectfile.setBounds(230, 270, 110, 30);

        tfselectfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tfselectfile);
        tfselectfile.setBounds(370, 270, 380, 40);

        btfilebrowse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btfilebrowse.setForeground(new java.awt.Color(102, 0, 102));
        btfilebrowse.setText("Browse");
        btfilebrowse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btfilebrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfilebrowseActionPerformed(evt);
            }
        });
        getContentPane().add(btfilebrowse);
        btfilebrowse.setBounds(760, 270, 100, 40);

        btstuaddnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuaddnotes.setForeground(new java.awt.Color(102, 0, 102));
        btstuaddnotes.setText("Add Notes");
        btstuaddnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuaddnotesActionPerformed(evt);
            }
        });
        getContentPane().add(btstuaddnotes);
        btstuaddnotes.setBounds(220, 640, 160, 50);

        btselectall.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btselectall.setForeground(new java.awt.Color(102, 0, 102));
        btselectall.setText("Select All");
        btselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btselectallActionPerformed(evt);
            }
        });
        getContentPane().add(btselectall);
        btselectall.setBounds(430, 640, 160, 50);

        btdeselectall.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdeselectall.setForeground(new java.awt.Color(102, 0, 102));
        btdeselectall.setText("Deselect All");
        btdeselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeselectallActionPerformed(evt);
            }
        });
        getContentPane().add(btdeselectall);
        btdeselectall.setBounds(640, 640, 160, 50);

        jtablestudentdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jtablestudentdata.setModel(tm);
        jScrollPane2.setViewportView(jtablestudentdata);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 330, 730, 300);

        Jpaneladdnotes1.setBackground(new java.awt.Color(255, 255, 255));
        Jpaneladdnotes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Jpaneladdnotes1.setLayout(null);
        getContentPane().add(Jpaneladdnotes1);
        Jpaneladdnotes1.setBounds(150, 80, 730, 610);

        jpaneladdnotes2.setBackground(new java.awt.Color(204, 153, 253));
        jpaneladdnotes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jpaneladdnotes2.setLayout(null);
        getContentPane().add(jpaneladdnotes2);
        jpaneladdnotes2.setBounds(130, 60, 770, 660);

        pack();
    }// </editor-fold>                        
                 

            private void btfilebrowseActionPerformed(java.awt.event.ActionEvent evt) {
                int ans = chooser.showOpenDialog(this);
                if (ans == JFileChooser.APPROVE_OPTION) {
                    f = chooser.getSelectedFile();
                    if (cbnotestype.getSelectedItem().equals("Image") && !(f.getPath().endsWith(".jpg") || f.getPath().endsWith(".jpeg") || f.getPath().endsWith(".png"))) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Select appropriate file");
                        tfselectfile.setText("");
                    } else if (cbnotestype.getSelectedItem().equals("Audio") && !(f.getPath().endsWith(".mp3"))) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Select Appropriate file");
                        tfselectfile.setText("");

                    } else if (cbnotestype.getSelectedItem().equals("Video") && !(f.getPath().endsWith(".mp4") || f.getPath().endsWith(".wmv"))) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Select Appropriate file");
                        tfselectfile.setText("");

                    } else if (cbnotestype.getSelectedItem().equals("pdf") && !(f.getPath().endsWith(".pdf"))) {
                        JOptionPane.showMessageDialog(FacultyConnect.this, "Select Appropriate file");
                        tfselectfile.setText("");

                    } else {
                        String path = f.getPath();

                        tfselectfile.setText(path);
                    }
                } else if (ans == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(FacultyConnect.this, "You selected cancel option");
                }
            }

            private void btstuaddnotesActionPerformed(java.awt.event.ActionEvent evt) {
                String title = tftitle.getText();
                String descrip = tfdescription.getText();
                String type = cbnotestype.getSelectedItem().toString();
                if (tftitle.getText().equals("") || tfdescription.getText().equals("") || tfselectfile.getText().equals("")) {
                    JOptionPane.showMessageDialog(FacultyConnect.this, "Fill all field first");
                } else {
                    try {
                        String name = f.getName();
                        name = name.substring(name.lastIndexOf("."), name.length());
                        String s = "";
                        for (int i = 0; i < al.size(); i++) {
                            if (al.get(i).cb == true) {
                                s = s + al.get(i).rollno + ",";
                            }
                        }
                        if (s.equals("")) {
                            JOptionPane.showMessageDialog(FacultyConnect.this, "Firstly select Student");
                        } else {
                            System.out.println("len of s: " + s.length());
                            s = s.substring(0, s.length() - 1);
                            dos.writeBytes("Add Note\r\n");
                            dos.writeBytes(id + "\r\n");
                            dos.writeBytes(title + "\r\n");
                            dos.writeBytes(descrip + "\r\n");
                            dos.writeBytes(type + "\r\n");
                            dos.writeBytes(s + "\r\n");
                            FileInputStream fis = new FileInputStream(f);
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
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(FacultyConnect.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            private void btdeselectallActionPerformed(java.awt.event.ActionEvent evt) {
                for (int i = 0; i < al.size(); i++) {

                    al.get(i).cb = false;
                }
                tm.fireTableDataChanged();
            }

            private void btselectallActionPerformed(java.awt.event.ActionEvent evt) {
                for (int i = 0; i < al.size(); i++) {

                    al.get(i).cb = true;
                }
                tm.fireTableDataChanged();
            }

            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
            private javax.swing.JPanel Jpaneladdnotes1;
            private javax.swing.JButton btdeselectall;
            private javax.swing.JButton btfilebrowse;
            private javax.swing.JButton btselectall;
            private javax.swing.JButton btstuaddnotes;
            private javax.swing.JComboBox cbnotestype;
            private javax.swing.JScrollPane jScrollPane1;
            private javax.swing.JScrollPane jScrollPane2;
            private javax.swing.JTable jTable1;
            private javax.swing.JPanel jpaneladdnotes2;
            private javax.swing.JTable jtablestudentdata;
            private javax.swing.JLabel lbdescription;
            private javax.swing.JLabel lbfacultyaddnotes;
            private javax.swing.JLabel lbnotestype;
            private javax.swing.JLabel lbselectfile;
            private javax.swing.JLabel lbtitle;
            private javax.swing.JTextField tfdescription;
            private javax.swing.JTextField tfselectfile;
            private javax.swing.JTextField tftitle;
            // End of variables declaration                   
        }

        public class ViewNoteHistory extends javax.swing.JFrame {

            public ViewNoteHistory() {
                initComponents();
                setVisible(true);
                setSize(780, 650);
                getContentPane().setBackground(Color.white);

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            }

            @SuppressWarnings("unchecked")
            // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
            private void initComponents() {

        lbviewnoteshis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableviewnotes = new javax.swing.JTable();
        viewnotehistorypanel = new javax.swing.JPanel();
        btnotesdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbviewnoteshis.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbviewnoteshis.setForeground(new java.awt.Color(102, 0, 102));
        lbviewnoteshis.setText("View Notes History");
        getContentPane().add(lbviewnoteshis);
        lbviewnoteshis.setBounds(210, 10, 310, 40);

        jtableviewnotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtableviewnotes.setModel(tm3);
        jScrollPane1.setViewportView(jtableviewnotes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 650, 270);

        viewnotehistorypanel.setBackground(new java.awt.Color(204, 153, 253));
        viewnotehistorypanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        viewnotehistorypanel.setLayout(null);

        btnotesdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnotesdelete.setForeground(new java.awt.Color(102, 0, 102));
        btnotesdelete.setText("Delete");
        btnotesdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btnotesdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotesdeleteActionPerformed(evt);
            }
        });
        viewnotehistorypanel.add(btnotesdelete);
        btnotesdelete.setBounds(250, 320, 150, 50);

        getContentPane().add(viewnotehistorypanel);
        viewnotehistorypanel.setBounds(20, 120, 710, 390);

        pack();
    }// </editor-fold>       

            private void btnotesdeleteActionPerformed(java.awt.event.ActionEvent evt) {
               int ans = JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "My Confirm Dialog", JOptionPane.YES_NO_OPTION);   
              if(ans==JOptionPane.YES_OPTION)
              {
                int n = obj4.jtableviewnotes.getSelectedRow();
                if (n == -1) {
                    JOptionPane.showMessageDialog(FacultyConnect.this, "Select Row first");
                }
                tm3.fireTableDataChanged();
                try {
                    dos.writeBytes("Delete Note\r\n");
                    dos.writeBytes(pl.get(n).id + "\r\n");
                } catch (IOException ex) {
                    Logger.getLogger(FacultyConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
                pl.remove(n);
            }
            }
            /**
             * @param args the command line arguments
             */
            // Variables declaration - do not modify                     
             private javax.swing.JButton btnotesdelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableviewnotes;
    private javax.swing.JLabel lbviewnoteshis;
    private javax.swing.JPanel viewnotehistorypanel;
            // End of variables declaration                   
        }

        private void btexitActionPerformed(java.awt.event.ActionEvent evt) {
            Facultyhomepage.this.dispose();
            FacultyConnect fc = new FacultyConnect();

        }

    }

    public class Student {

        int rollno;
        String department_name;
        String course_name;
        String email;
        String contact;
        public Boolean cb;

        public Student(int rollno, String department_name, String course_name, String email, String contact, Boolean cb) {
            this.rollno = rollno;
            this.department_name = department_name;
            this.course_name = course_name;
            this.email = email;
            this.contact = contact;
            this.cb = cb;
        }
    }

    public class mytable extends AbstractTableModel {
        String Title[]={"University_rollno","Department_name","Course_name","Email","Contact","Selection box"};
           public String getColumnName(int a)
   {
         return Title[a];
   }


        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount()
        {
                    return Title.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            if (columnIndex == 0) {
                return al.get(rowIndex).rollno;
            } else if (columnIndex == 1) {
                return al.get(rowIndex).department_name;

            } else if (columnIndex == 2) {
                return al.get(rowIndex).course_name;

            } else if (columnIndex == 3) {
                return al.get(rowIndex).email;

            } else if (columnIndex == 4) {
                return al.get(rowIndex).contact;

            } else {
                return al.get(rowIndex).cb;
            }
        }

        public Class getColumnClass(int c) {

            return getValueAt(0, c).getClass();
        }

        public void setValueAt(Object value, int row, int col) {
            //if (col == 1) {
            al.get(row).cb = (Boolean) (value);
            fireTableCellUpdated(row, col);

            //}
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if (columnIndex == 5) {
                return true;
            } else {
                return false;
            }
        }

    }

    public class Viewhistory {

        int id;
        String title;
        String description;
        String time;
        String type;

        public Viewhistory(int id, String title, String description, String time, String type) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.time = time;
            this.type = type;
        }

    }

    public class TableNotesView extends AbstractTableModel {

        String Title[] = {"Note_id", "Title", "Description", "Time", "Type"};

        public String getColumnName(int a) {
            return Title[a];
        }

        public int getRowCount() {
            return pl.size();

        }

        public int getColumnCount() {
            return Title.length;

        }

        public Object getValueAt(int row, int col) {
            if (col == 0) {
                return pl.get(row).id;
            }
            if (col == 1) {
                return pl.get(row).title;
            }
            if (col == 2) {
                return pl.get(row).description;
            }
            if (col == 3) {
                return pl.get(row).time;
            } else {
                return pl.get(row).type;
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btconnect;
    private javax.swing.JButton btlogin;
    private javax.swing.JPanel facultyconnectpanel;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JPanel panellogin;
    private javax.swing.JTextField tfloginid;
    private javax.swing.JPasswordField tfpassword;
    // End of variables declaration//GEN-END:variables
}

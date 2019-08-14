
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class AddStudent extends JInternalFrame {

    public AddStudent() {
        initComponents();
        setVisible(true);
        setSize(800, 800);
        getContentPane().setBackground(Color.white);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next()) {
                String s = rs.getString("department_name");
                cbdpname.addItem(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbaddstudent = new javax.swing.JLabel();
        adstupanel1 = new javax.swing.JPanel();
        adstupanel2 = new javax.swing.JPanel();
        btaddstudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taaddress = new javax.swing.JTextArea();
        cbdpname = new javax.swing.JComboBox();
        lbunirollno = new javax.swing.JLabel();
        lbdpname = new javax.swing.JLabel();
        lbcoursename = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbcontact = new javax.swing.JLabel();
        lbaddress = new javax.swing.JLabel();
        tfcontact = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfunirollno = new javax.swing.JTextField();
        cbcoursename = new javax.swing.JComboBox();

        getContentPane().setLayout(null);

        lbaddstudent.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbaddstudent.setForeground(new java.awt.Color(102, 0, 102));
        lbaddstudent.setText("Add Student");
        getContentPane().add(lbaddstudent);
        lbaddstudent.setBounds(280, 20, 300, 40);

        adstupanel1.setBackground(new java.awt.Color(204, 153, 253));
        adstupanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        adstupanel1.setLayout(null);

        adstupanel2.setBackground(new java.awt.Color(255, 255, 255));
        adstupanel2.setLayout(null);

        btaddstudent.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btaddstudent.setForeground(new java.awt.Color(102, 0, 102));
        btaddstudent.setText("Add Student");
        btaddstudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddstudentActionPerformed(evt);
            }
        });
        adstupanel2.add(btaddstudent);
        btaddstudent.setBounds(160, 380, 160, 50);

        taaddress.setColumns(20);
        taaddress.setForeground(new java.awt.Color(102, 0, 102));
        taaddress.setRows(5);
        jScrollPane1.setViewportView(taaddress);

        adstupanel2.add(jScrollPane1);
        jScrollPane1.setBounds(230, 270, 240, 80);

        cbdpname.setForeground(new java.awt.Color(102, 0, 102));
        cbdpname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdpnameItemStateChanged(evt);
            }
        });
        adstupanel2.add(cbdpname);
        cbdpname.setBounds(230, 70, 240, 40);

        lbunirollno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbunirollno.setForeground(new java.awt.Color(102, 0, 102));
        lbunirollno.setText("University Rollno");
        adstupanel2.add(lbunirollno);
        lbunirollno.setBounds(20, 20, 170, 30);

        lbdpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdpname.setForeground(new java.awt.Color(102, 0, 102));
        lbdpname.setText("Department Name");
        adstupanel2.add(lbdpname);
        lbdpname.setBounds(20, 70, 150, 30);

        lbcoursename.setBackground(new java.awt.Color(255, 255, 255));
        lbcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbcoursename.setText("Course Name");
        adstupanel2.add(lbcoursename);
        lbcoursename.setBounds(20, 120, 150, 30);

        lbemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbemail.setForeground(new java.awt.Color(102, 0, 102));
        lbemail.setText("Email");
        adstupanel2.add(lbemail);
        lbemail.setBounds(20, 170, 110, 30);

        lbcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcontact.setForeground(new java.awt.Color(102, 0, 102));
        lbcontact.setText("Contact");
        adstupanel2.add(lbcontact);
        lbcontact.setBounds(20, 220, 110, 30);

        lbaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbaddress.setForeground(new java.awt.Color(102, 0, 102));
        lbaddress.setText("Address");
        adstupanel2.add(lbaddress);
        lbaddress.setBounds(20, 270, 90, 30);

        tfcontact.setForeground(new java.awt.Color(102, 0, 102));
        adstupanel2.add(tfcontact);
        tfcontact.setBounds(230, 220, 240, 40);

        tfemail.setForeground(new java.awt.Color(102, 0, 102));
        adstupanel2.add(tfemail);
        tfemail.setBounds(230, 170, 240, 40);

        tfunirollno.setForeground(new java.awt.Color(102, 0, 102));
        adstupanel2.add(tfunirollno);
        tfunirollno.setBounds(230, 20, 240, 40);

        cbcoursename.setForeground(new java.awt.Color(102, 0, 102));
        adstupanel2.add(cbcoursename);
        cbcoursename.setBounds(230, 120, 240, 40);

        adstupanel1.add(adstupanel2);
        adstupanel2.setBounds(40, 40, 490, 440);

        getContentPane().add(adstupanel1);
        adstupanel1.setBounds(100, 110, 570, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbdpnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdpnameItemStateChanged
        cbcoursename.removeAllItems();
        try {
            String a = cbdpname.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where department_name='" + a + "' ");
            while (rs.next()) {
                String s = rs.getString("course_name");
                cbcoursename.addItem(s);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbdpnameItemStateChanged

    private void btaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddstudentActionPerformed
        try {
            int rollno = Integer.parseInt(tfunirollno.getText());
            String email = tfemail.getText();
            String contact = tfcontact.getText();
            String add = taaddress.getText();
            int pass = (int) (1000 + (9999 - 1000) * Math.random());
            if (tfunirollno.getText().equals("") || email.equals("") || contact.equals("") || add.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all field first");

            } else if (tfcontact.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Fill valid number");
            } else if (tfemail.getText().indexOf("@") == -1 || tfemail.getText().indexOf(".") == -1) {
                JOptionPane.showMessageDialog(this, "Invalid email");
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                System.out.println("Connection built..");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                System.out.println("Statement created..");
                ResultSet rs = stmt.executeQuery("select * from Student where university_rollno='" + rollno + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Student already exists");
                } else {
                    rs.moveToInsertRow();
                    rs.updateInt("university_rollno", rollno);
                    rs.updateString("password", pass + "");
                    rs.updateString("email", email);
                    rs.updateString("contact", contact);
                    rs.updateString("address", add);
                    rs.updateString("department_name", cbdpname.getSelectedItem().toString());
                    rs.updateString("course_name", cbcoursename.getSelectedItem().toString());
                    rs.insertRow();
                   JOptionPane.showMessageDialog(this, "Data added successfully");

//                      tfunirollno.setText("");
//                    tfcontact.setText("");
//                    tfemail.setText("");
//                    taaddress.setText("");
                  
                    SimpleMailDemo smp = new SimpleMailDemo(email, "Your password is: ", pass + "");
                    System.out.println("after insert");
           tfunirollno.setText("");
                      tfcontact.setText("");
                       tfemail.setText("");
                    taaddress.setText("");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btaddstudentActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adstupanel1;
    private javax.swing.JPanel adstupanel2;
    private javax.swing.JButton btaddstudent;
    private javax.swing.JComboBox cbcoursename;
    private javax.swing.JComboBox cbdpname;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbaddstudent;
    private javax.swing.JLabel lbcontact;
    private javax.swing.JLabel lbcoursename;
    private javax.swing.JLabel lbdpname;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbunirollno;
    private javax.swing.JTextArea taaddress;
    private javax.swing.JTextField tfcontact;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfunirollno;
    // End of variables declaration//GEN-END:variables
}

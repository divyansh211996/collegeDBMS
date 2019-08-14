
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Faculty extends JInternalFrame {

    public Faculty() {
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
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbaddfaculty = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbusername = new javax.swing.JLabel();
        lbdpname = new javax.swing.JLabel();
        lbcoursename = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbphone = new javax.swing.JLabel();
        lbqualification = new javax.swing.JLabel();
        lbaddress = new javax.swing.JLabel();
        lbexperience = new javax.swing.JLabel();
        tfusername = new javax.swing.JTextField();
        cbdpname = new javax.swing.JComboBox();
        cbcoursename = new javax.swing.JComboBox();
        tfemail = new javax.swing.JTextField();
        tfqualification = new javax.swing.JTextField();
        tfphone = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfexperience = new javax.swing.JTextField();
        btadd = new javax.swing.JButton();

        getContentPane().setLayout(null);

        lbaddfaculty.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbaddfaculty.setForeground(new java.awt.Color(102, 0, 102));
        lbaddfaculty.setText("Add Faculty");
        getContentPane().add(lbaddfaculty);
        lbaddfaculty.setBounds(250, 10, 230, 40);

        jPanel2.setBackground(new java.awt.Color(204, 153, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbusername.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbusername.setForeground(new java.awt.Color(102, 0, 102));
        lbusername.setText("Username");
        jPanel1.add(lbusername);
        lbusername.setBounds(20, 20, 150, 30);

        lbdpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdpname.setForeground(new java.awt.Color(102, 0, 102));
        lbdpname.setText("Department Name");
        jPanel1.add(lbdpname);
        lbdpname.setBounds(20, 70, 150, 30);

        lbcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbcoursename.setText("Course Name");
        jPanel1.add(lbcoursename);
        lbcoursename.setBounds(20, 120, 150, 30);

        lbemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbemail.setForeground(new java.awt.Color(102, 0, 102));
        lbemail.setText("Email");
        jPanel1.add(lbemail);
        lbemail.setBounds(20, 170, 110, 30);

        lbphone.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbphone.setForeground(new java.awt.Color(102, 0, 102));
        lbphone.setText("Phone");
        jPanel1.add(lbphone);
        lbphone.setBounds(20, 220, 80, 30);

        lbqualification.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbqualification.setForeground(new java.awt.Color(102, 0, 102));
        lbqualification.setText("Qualification");
        jPanel1.add(lbqualification);
        lbqualification.setBounds(20, 270, 130, 30);

        lbaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbaddress.setForeground(new java.awt.Color(102, 0, 102));
        lbaddress.setText("Address");
        jPanel1.add(lbaddress);
        lbaddress.setBounds(20, 330, 110, 30);

        lbexperience.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbexperience.setForeground(new java.awt.Color(102, 0, 102));
        lbexperience.setText("Experience");
        jPanel1.add(lbexperience);
        lbexperience.setBounds(20, 380, 100, 30);

        tfusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfusername);
        tfusername.setBounds(210, 20, 240, 40);

        cbdpname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        cbdpname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdpnameItemStateChanged(evt);
            }
        });
        jPanel1.add(cbdpname);
        cbdpname.setBounds(210, 70, 240, 40);

        cbcoursename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(cbcoursename);
        cbcoursename.setBounds(210, 120, 240, 40);

        tfemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfemail);
        tfemail.setBounds(210, 170, 240, 40);

        tfqualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfqualification);
        tfqualification.setBounds(210, 270, 240, 40);

        tfphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfphone);
        tfphone.setBounds(210, 220, 240, 40);

        tfaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfaddress);
        tfaddress.setBounds(210, 320, 240, 40);

        tfexperience.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.add(tfexperience);
        tfexperience.setBounds(210, 370, 240, 40);

        btadd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btadd.setForeground(new java.awt.Color(102, 0, 102));
        btadd.setText("Add Faculty");
        btadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        jPanel1.add(btadd);
        btadd.setBounds(130, 440, 140, 50);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(40, 40, 480, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 80, 560, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        try {
            String username = tfusername.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();
            String qualification = tfqualification.getText();
            String address = tfaddress.getText();
            String experience = tfexperience.getText();

            if (username.equals("") || email.equals("") || phone.equals("") || qualification.equals("") || address.equals("") || experience.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all field first");

            } else if (tfphone.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Fill valid number");
            } else if (tfemail.getText().indexOf("@") == -1 || tfemail.getText().indexOf(".") == -1) {
                JOptionPane.showMessageDialog(this, "Invalid email");
            } else {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                System.out.println("Connection built..");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                System.out.println("Statement created..");
                ResultSet rs = stmt.executeQuery("select * from faculty ");

                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("email", email);
                rs.updateString("phone", phone);
                rs.updateString("qualification", qualification);
                rs.updateString("address", address);
                rs.updateString("experience", experience);
                rs.updateString("department_name", cbdpname.getSelectedItem().toString());
                rs.updateString("course_name", cbcoursename.getSelectedItem().toString());

                JOptionPane.showMessageDialog(this, "Data added successfully");
                rs.insertRow();
                System.out.println("after insert");
                tfusername.setText("");
                tfaddress.setText("");
                tfemail.setText("");
                tfexperience.setText("");
                tfqualification.setText("");
                tfphone.setText("");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btaddActionPerformed

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
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JComboBox cbcoursename;
    private javax.swing.JComboBox cbdpname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbaddfaculty;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbcoursename;
    private javax.swing.JLabel lbdpname;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbexperience;
    private javax.swing.JLabel lbphone;
    private javax.swing.JLabel lbqualification;
    private javax.swing.JLabel lbusername;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfexperience;
    private javax.swing.JTextField tfphone;
    private javax.swing.JTextField tfqualification;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}

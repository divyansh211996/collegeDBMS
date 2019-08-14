
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class AddDepartment extends JInternalFrame {

    public AddDepartment() {
        initComponents();
        setVisible(true);
        setSize(600, 600);
        getContentPane().setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbadddepartment = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adddppanel1 = new javax.swing.JPanel();
        btadddept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfdescription = new javax.swing.JTextArea();
        tfcontact = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfdphead = new javax.swing.JTextField();
        tfdepartmentname = new javax.swing.JTextField();
        lbdpname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbcontact = new javax.swing.JLabel();
        lbdescription = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lbadddepartment.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbadddepartment.setForeground(new java.awt.Color(102, 0, 102));
        lbadddepartment.setText("Add Department");
        getContentPane().add(lbadddepartment);
        lbadddepartment.setBounds(290, 30, 310, 40);

        jPanel1.setBackground(new java.awt.Color(204, 153, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        adddppanel1.setBackground(new java.awt.Color(255, 255, 255));
        adddppanel1.setLayout(null);

        btadddept.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btadddept.setForeground(new java.awt.Color(102, 0, 102));
        btadddept.setText("Add Department");
        btadddept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btadddept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadddeptActionPerformed(evt);
            }
        });
        adddppanel1.add(btadddept);
        btadddept.setBounds(140, 380, 180, 50);

        tfdescription.setColumns(20);
        tfdescription.setForeground(new java.awt.Color(102, 0, 102));
        tfdescription.setRows(5);
        jScrollPane1.setViewportView(tfdescription);

        adddppanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 270, 220, 80);

        tfcontact.setForeground(new java.awt.Color(102, 0, 102));
        adddppanel1.add(tfcontact);
        tfcontact.setBounds(240, 210, 220, 40);

        tfemail.setForeground(new java.awt.Color(102, 0, 102));
        adddppanel1.add(tfemail);
        tfemail.setBounds(240, 150, 220, 40);

        tfdphead.setForeground(new java.awt.Color(102, 0, 102));
        adddppanel1.add(tfdphead);
        tfdphead.setBounds(240, 90, 220, 40);

        tfdepartmentname.setForeground(new java.awt.Color(102, 0, 102));
        adddppanel1.add(tfdepartmentname);
        tfdepartmentname.setBounds(240, 30, 220, 40);

        lbdpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdpname.setForeground(new java.awt.Color(102, 0, 102));
        lbdpname.setText("Department name");
        adddppanel1.add(lbdpname);
        lbdpname.setBounds(20, 40, 160, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Department head");
        adddppanel1.add(jLabel1);
        jLabel1.setBounds(20, 90, 150, 30);

        lbemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbemail.setForeground(new java.awt.Color(102, 0, 102));
        lbemail.setText("E-mail");
        adddppanel1.add(lbemail);
        lbemail.setBounds(20, 150, 90, 30);

        lbcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcontact.setForeground(new java.awt.Color(102, 0, 102));
        lbcontact.setText("Contact");
        adddppanel1.add(lbcontact);
        lbcontact.setBounds(20, 210, 80, 20);

        lbdescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdescription.setForeground(new java.awt.Color(102, 0, 102));
        lbdescription.setText("Description");
        adddppanel1.add(lbdescription);
        lbdescription.setBounds(20, 270, 140, 40);

        jPanel1.add(adddppanel1);
        adddppanel1.setBounds(40, 40, 480, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 130, 560, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btadddeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadddeptActionPerformed
        try {
            String dpname = tfdepartmentname.getText();
            String description = tfdescription.getText();
            String head = tfdphead.getText();
            String email = tfemail.getText();
            String contact = tfcontact.getText();
            if (dpname.equals("") || description.equals("") || head.equals("") || email.equals("") || contact.equals("")) {
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
                ResultSet rs = stmt.executeQuery("select * from department where department_name='" + dpname + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "department already added");
                    tfdepartmentname.setText("");
                    tfdphead.setText("");
                    tfcontact.setText("");
                    tfemail.setText("");
                    tfdescription.setText("");

                } else {
                    rs.moveToInsertRow();
                    rs.updateString("department_name", dpname);
                    rs.updateString("department_head", head);
                    rs.updateString("contact", contact);
                    rs.updateString("email", email);
                    rs.updateString("description", description);
                    JOptionPane.showMessageDialog(this, "Department added successfully");
                    rs.insertRow();
                    tfdepartmentname.setText("");
                    tfdphead.setText("");
                    tfcontact.setText("");
                    tfemail.setText("");
                    tfdescription.setText("");
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btadddeptActionPerformed

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
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adddppanel1;
    private javax.swing.JButton btadddept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbadddepartment;
    private javax.swing.JLabel lbcontact;
    private javax.swing.JLabel lbdescription;
    private javax.swing.JLabel lbdpname;
    private javax.swing.JLabel lbemail;
    private javax.swing.JTextField tfcontact;
    private javax.swing.JTextField tfdepartmentname;
    private javax.swing.JTextArea tfdescription;
    private javax.swing.JTextField tfdphead;
    private javax.swing.JTextField tfemail;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class AddCourse extends JInternalFrame {

    public AddCourse() {
        initComponents();
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while(rs.next())
            {
                String s= rs.getString("department_name");
                cbdpname.addItem(s);
            }
        } catch (Exception e) {
        }
        
        setVisible(true);
        setSize(600,600);
        getContentPane().setBackground(Color.white);

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbviewcourse = new javax.swing.JLabel();
        addcoursepanel2 = new javax.swing.JPanel();
        addcoursepanel1 = new javax.swing.JPanel();
        btaddcourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tacoursedesc = new javax.swing.JTextArea();
        tfcoursename = new javax.swing.JTextField();
        cbdpname = new javax.swing.JComboBox();
        lbdpname = new javax.swing.JLabel();
        lbcourse = new javax.swing.JLabel();
        lbdescrip = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lbviewcourse.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbviewcourse.setForeground(new java.awt.Color(102, 0, 102));
        lbviewcourse.setText("Add Course");
        getContentPane().add(lbviewcourse);
        lbviewcourse.setBounds(220, 20, 210, 40);

        addcoursepanel2.setBackground(new java.awt.Color(204, 153, 253));
        addcoursepanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        addcoursepanel2.setForeground(new java.awt.Color(102, 0, 102));
        addcoursepanel2.setLayout(null);

        addcoursepanel1.setBackground(new java.awt.Color(255, 255, 255));
        addcoursepanel1.setLayout(null);

        btaddcourse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btaddcourse.setForeground(new java.awt.Color(102, 0, 102));
        btaddcourse.setText("Add Course");
        btaddcourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btaddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddcourseActionPerformed(evt);
            }
        });
        addcoursepanel1.add(btaddcourse);
        btaddcourse.setBounds(160, 270, 150, 40);

        tacoursedesc.setColumns(20);
        tacoursedesc.setForeground(new java.awt.Color(102, 0, 102));
        tacoursedesc.setRows(5);
        jScrollPane1.setViewportView(tacoursedesc);

        addcoursepanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 160, 200, 80);

        tfcoursename.setForeground(new java.awt.Color(102, 0, 102));
        tfcoursename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcoursenameActionPerformed(evt);
            }
        });
        addcoursepanel1.add(tfcoursename);
        tfcoursename.setBounds(240, 90, 200, 40);

        cbdpname.setForeground(new java.awt.Color(102, 0, 102));
        addcoursepanel1.add(cbdpname);
        cbdpname.setBounds(240, 20, 200, 40);

        lbdpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdpname.setForeground(new java.awt.Color(102, 0, 102));
        lbdpname.setText("Select Department name");
        addcoursepanel1.add(lbdpname);
        lbdpname.setBounds(20, 20, 200, 40);

        lbcourse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcourse.setForeground(new java.awt.Color(102, 0, 102));
        lbcourse.setText("Course name");
        addcoursepanel1.add(lbcourse);
        lbcourse.setBounds(20, 90, 160, 30);

        lbdescrip.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdescrip.setForeground(new java.awt.Color(102, 0, 102));
        lbdescrip.setText("Description");
        addcoursepanel1.add(lbdescrip);
        lbdescrip.setBounds(20, 170, 110, 30);

        addcoursepanel2.add(addcoursepanel1);
        addcoursepanel1.setBounds(40, 40, 460, 330);

        getContentPane().add(addcoursepanel2);
        addcoursepanel2.setBounds(60, 110, 540, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddcourseActionPerformed
        try {
           String dpname= cbdpname.getSelectedItem().toString();
           String coursename=tfcoursename.getText();
           String description=tacoursedesc.getText();
            if (dpname.equals("")||coursename.equals("")||description.equals(""))
             {
                 JOptionPane.showMessageDialog(this, "Fill all field first");
            }
            else
            {
                Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where course_name='"+coursename+"'and department_name='"+dpname+"'");
                if (rs.next())
                {   
                    JOptionPane.showMessageDialog(this, "course already added");
                }
                else
                {
                  rs.moveToInsertRow();
                  rs.updateString("department_name",dpname);
            rs.updateString("course_name", coursename);
            rs.updateString("description", description);
            JOptionPane.showMessageDialog(this,"course added successfully");
            rs.insertRow();
            tfcoursename.setText("");
            tacoursedesc.setText("");
    
                }
            

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btaddcourseActionPerformed

    private void tfcoursenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcoursenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcoursenameActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addcoursepanel1;
    private javax.swing.JPanel addcoursepanel2;
    private javax.swing.JButton btaddcourse;
    private javax.swing.JComboBox cbdpname;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcourse;
    private javax.swing.JLabel lbdescrip;
    private javax.swing.JLabel lbdpname;
    private javax.swing.JLabel lbviewcourse;
    private javax.swing.JTextArea tacoursedesc;
    private javax.swing.JTextField tfcoursename;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ViewStudent extends JInternalFrame {

    tabelmodel tm5;
    ArrayList<Student> al = new ArrayList<>();

    public ViewStudent() {
        tm5 = new tabelmodel();
        initComponents();
        setVisible(true);
        setSize(800, 800);
        getContentPane().setBackground(Color.white);

        jTablestudentview.setVisible(false);

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

        lbviewstudent = new javax.swing.JLabel();
        viewstypanel2 = new javax.swing.JPanel();
        viewstupanel1 = new javax.swing.JPanel();
        btdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablestudentview = new javax.swing.JTable();
        btstudentview = new javax.swing.JButton();
        cbselectcourse = new javax.swing.JComboBox();
        cbdpname = new javax.swing.JComboBox();
        lbselectcoursename = new javax.swing.JLabel();
        lbselectdepartment = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lbviewstudent.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbviewstudent.setForeground(new java.awt.Color(102, 0, 102));
        lbviewstudent.setText("View Student");
        getContentPane().add(lbviewstudent);
        lbviewstudent.setBounds(330, 10, 230, 30);

        viewstypanel2.setBackground(new java.awt.Color(204, 153, 253));
        viewstypanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        viewstypanel2.setLayout(null);

        viewstupanel1.setBackground(new java.awt.Color(255, 255, 255));
        viewstupanel1.setLayout(null);

        btdelete.setBackground(new java.awt.Color(255, 255, 255));
        btdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdelete.setForeground(new java.awt.Color(102, 0, 102));
        btdelete.setText("Delete");
        btdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        viewstupanel1.add(btdelete);
        btdelete.setBounds(300, 460, 160, 50);

        jTablestudentview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jTablestudentview.setModel(tm5
        );
        jScrollPane1.setViewportView(jTablestudentview);

        viewstupanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 770, 270);

        btstudentview.setBackground(new java.awt.Color(255, 255, 255));
        btstudentview.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstudentview.setForeground(new java.awt.Color(102, 0, 102));
        btstudentview.setText("View");
        btstudentview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstudentview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstudentviewActionPerformed(evt);
            }
        });
        viewstupanel1.add(btstudentview);
        btstudentview.setBounds(310, 120, 160, 50);

        cbselectcourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        viewstupanel1.add(cbselectcourse);
        cbselectcourse.setBounds(390, 70, 240, 40);

        cbdpname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        cbdpname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbdpnameItemStateChanged(evt);
            }
        });
        viewstupanel1.add(cbdpname);
        cbdpname.setBounds(390, 20, 240, 40);

        lbselectcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbselectcoursename.setText("Select Course");
        viewstupanel1.add(lbselectcoursename);
        lbselectcoursename.setBounds(200, 80, 140, 30);

        lbselectdepartment.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectdepartment.setForeground(new java.awt.Color(102, 0, 102));
        lbselectdepartment.setText("Select Department");
        viewstupanel1.add(lbselectdepartment);
        lbselectdepartment.setBounds(200, 20, 180, 40);

        viewstypanel2.add(viewstupanel1);
        viewstupanel1.setBounds(30, 30, 810, 520);

        getContentPane().add(viewstypanel2);
        viewstypanel2.setBounds(20, 70, 870, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbdpnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbdpnameItemStateChanged
        cbselectcourse.removeAllItems();
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
                cbselectcourse.addItem(s);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbdpnameItemStateChanged

    private void btstudentviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstudentviewActionPerformed
        try {
            jTablestudentview.setVisible(true);
            al.clear();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from Student where department_name='" + cbdpname.getSelectedItem() + "' and course_name='" + cbselectcourse.getSelectedItem() + "'");
            while (rs.next()) {
                int rollno = rs.getInt("university_rollno");
                String email = rs.getString("email");
                String photo = rs.getString("photo");
                String add = rs.getString("address");
                String phone = rs.getString("contact");
                al.add(new Student(rollno, email, photo, add, phone));

            }
            tm5.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btstudentviewActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "My Confirm Dialog", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            int r = jTablestudentview.getSelectedRow();
            if (r == -1) {
                JOptionPane.showMessageDialog(this, "select row first");
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                    System.out.println("Connection built..");
                    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    System.out.println("Statement created..");
                    ResultSet rs = stmt.executeQuery("select * from student where department_name='" + cbdpname.getSelectedItem() + "' and course_name='" + cbselectcourse.getSelectedItem() + "'");
                    if (rs.next()) {
                        rs.deleteRow();
                        al.remove(r);
                        tm5.fireTableDataChanged();

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btdeleteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btstudentview;
    private javax.swing.JComboBox cbdpname;
    private javax.swing.JComboBox cbselectcourse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablestudentview;
    private javax.swing.JLabel lbselectcoursename;
    private javax.swing.JLabel lbselectdepartment;
    private javax.swing.JLabel lbviewstudent;
    private javax.swing.JPanel viewstupanel1;
    private javax.swing.JPanel viewstypanel2;
    // End of variables declaration//GEN-END:variables
class Student {

        int rollno;
        String email;
        String photo;
        String add;
        String phone;

        Student(int rollno, String email, String photo, String add, String phone) {
            this.rollno = rollno;
            this.email = email;
            this.photo = photo;
            this.add = add;
            this.phone = phone;
        }
    }

    class tabelmodel extends AbstractTableModel {

        String Title[] = {"University_rollno", "E-mail", "Address", "Contact"};

        public String getColumnName(int a) {
            return Title[a];
        }

        public int getRowCount() {
            return al.size();
        }

        public int getColumnCount() {
            return Title.length;
        }

        public Object getValueAt(int row, int col) {
            if (col == 0) {
                return al.get(row).rollno;
            } else if (col == 1) {
                return al.get(row).email;
            } else if (col == 2) {
                return al.get(row).add;
            } else {
                return al.get(row).phone;
            }

        }

    }
}

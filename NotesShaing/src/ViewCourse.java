
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ViewCourse extends JInternalFrame {

    ArrayList<course> al = new ArrayList<>();
    tabelmodel tm1;

    public ViewCourse() {
        tm1 = new tabelmodel();
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next()) {
                String s = rs.getString("department_name");
                cbview.addItem(s);
            }

        } catch (Exception e) {
        }
        setVisible(true);
        setSize(1000, 650);
        getContentPane().setBackground(Color.white);

        jtable2.setVisible(false);
        coursepanel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbviewcourse = new javax.swing.JLabel();
        lbselectdept = new javax.swing.JLabel();
        cbview = new javax.swing.JComboBox();
        btviewdp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable2 = new javax.swing.JTable();
        btcoursedelete = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        btrefresh = new javax.swing.JButton();
        coursepanel = new javax.swing.JPanel();
        lbcoursename = new javax.swing.JLabel();
        panelcoursename = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tades = new javax.swing.JTextArea();
        btpaneledit = new javax.swing.JButton();
        paneldescription = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        coursepanel1 = new javax.swing.JPanel();

        getContentPane().setLayout(null);

        lbviewcourse.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbviewcourse.setForeground(new java.awt.Color(102, 0, 102));
        lbviewcourse.setText("View Course");
        getContentPane().add(lbviewcourse);
        lbviewcourse.setBounds(320, 20, 290, 42);

        lbselectdept.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectdept.setForeground(new java.awt.Color(102, 0, 102));
        lbselectdept.setText("Select Department");
        getContentPane().add(lbselectdept);
        lbselectdept.setBounds(160, 110, 200, 30);

        cbview.setForeground(new java.awt.Color(102, 0, 102));
        cbview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        cbview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbviewActionPerformed(evt);
            }
        });
        getContentPane().add(cbview);
        cbview.setBounds(370, 110, 220, 40);

        btviewdp.setBackground(new java.awt.Color(255, 255, 255));
        btviewdp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btviewdp.setForeground(new java.awt.Color(102, 0, 102));
        btviewdp.setText("View");
        btviewdp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btviewdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewdpActionPerformed(evt);
            }
        });
        getContentPane().add(btviewdp);
        btviewdp.setBounds(610, 110, 80, 40);

        jtable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jtable2.setModel(tm1
        );
        jScrollPane1.setViewportView(jtable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 210, 550, 240);

        btcoursedelete.setBackground(new java.awt.Color(255, 255, 255));
        btcoursedelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btcoursedelete.setForeground(new java.awt.Color(102, 0, 102));
        btcoursedelete.setText("Delete");
        btcoursedelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btcoursedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcoursedeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btcoursedelete);
        btcoursedelete.setBounds(150, 470, 130, 50);

        btedit.setBackground(new java.awt.Color(255, 255, 255));
        btedit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btedit.setForeground(new java.awt.Color(102, 0, 102));
        btedit.setText("Edit");
        btedit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });
        getContentPane().add(btedit);
        btedit.setBounds(350, 470, 130, 50);

        btrefresh.setBackground(new java.awt.Color(255, 255, 255));
        btrefresh.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btrefresh.setForeground(new java.awt.Color(102, 0, 102));
        btrefresh.setText("Refresh");
        btrefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btrefresh);
        btrefresh.setBounds(560, 470, 130, 50);

        coursepanel.setBackground(new java.awt.Color(255, 255, 255));
        coursepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        coursepanel.setLayout(null);

        lbcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbcoursename.setText("Course Name");
        coursepanel.add(lbcoursename);
        lbcoursename.setBounds(10, 50, 120, 40);

        panelcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        panelcoursename.setText("Course");
        coursepanel.add(panelcoursename);
        panelcoursename.setBounds(150, 50, 170, 40);

        tades.setColumns(20);
        tades.setRows(5);
        tades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane2.setViewportView(tades);

        coursepanel.add(jScrollPane2);
        jScrollPane2.setBounds(150, 120, 180, 80);

        btpaneledit.setBackground(new java.awt.Color(255, 255, 255));
        btpaneledit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btpaneledit.setForeground(new java.awt.Color(102, 0, 102));
        btpaneledit.setText("Edit");
        btpaneledit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btpaneledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpaneleditActionPerformed(evt);
            }
        });
        coursepanel.add(btpaneledit);
        btpaneledit.setBounds(100, 260, 130, 50);

        paneldescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        paneldescription.setForeground(new java.awt.Color(102, 0, 102));
        paneldescription.setText("Description");
        coursepanel.add(paneldescription);
        paneldescription.setBounds(10, 130, 120, 40);

        getContentPane().add(coursepanel);
        coursepanel.setBounds(770, 180, 340, 320);

        jPanel1.setBackground(new java.awt.Color(204, 153, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jPanel1.setLayout(null);

        coursepanel1.setBackground(new java.awt.Color(255, 255, 255));
        coursepanel1.setLayout(null);
        jPanel1.add(coursepanel1);
        coursepanel1.setBounds(20, 20, 590, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 80, 630, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbviewActionPerformed

    private void btviewdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewdpActionPerformed
        jtable2.setVisible(true);
        al.clear();
        try {
            String name = cbview.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where department_name='" + name + "'");
            while (rs.next()) {
                String coursename = rs.getString("course_name");
                String description = rs.getString("description");
                al.add(new course(coursename, description));
            }
            tm1.fireTableDataChanged();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btviewdpActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        int r = jtable2.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "select row first");
        } else {
            coursepanel.show(true);
            try {
                String name = al.get(r).coursename;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                System.out.println("Connection built..");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                System.out.println("Statement created..");
                ResultSet rs = stmt.executeQuery("select * from course where course_name='" + name + "'");
                if (rs.next()) {
                    String coursename = rs.getString("course_name");
                    String des = rs.getString("description");
                    panelcoursename.setText(coursename);
                    tades.setText(des);

                }

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_bteditActionPerformed

    private void btcoursedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcoursedeleteActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "My Confirm Dialog", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            int r = jtable2.getSelectedRow();
            if (r == -1) {
                JOptionPane.showMessageDialog(this, "select row first");
            } else {
                try {

                    String name = al.get(r).coursename;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                    System.out.println("Connection built..");
                    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    System.out.println("Statement created..");
                    ResultSet rs = stmt.executeQuery("select * from course where course_name='" + name + "'");
                    if (rs.next()) {
                        rs.deleteRow();
                        al.remove(r);
                        tm1.fireTableDataChanged();
                    }

                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_btcoursedeleteActionPerformed

    private void btpaneleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpaneleditActionPerformed
        try {
            String name = panelcoursename.getText();

            String descrip = tades.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where course_name='" + name + "'");
            if (rs.next()) {
                rs.updateString("description", descrip);
                rs.updateRow();
                JOptionPane.showMessageDialog(this, "update is successful");
                coursepanel.setVisible(false);

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btpaneleditActionPerformed

    private void btrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrefreshActionPerformed
        al.clear();
        try {
            String name = cbview.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where department_name='" + name + "'");
            while (rs.next()) {
                String coursename = rs.getString("course_name");
                String description = rs.getString("description");
                al.add(new course(coursename, description));
            }
            tm1.fireTableDataChanged();
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcoursedelete;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btpaneledit;
    private javax.swing.JButton btrefresh;
    private javax.swing.JButton btviewdp;
    private javax.swing.JComboBox cbview;
    private javax.swing.JPanel coursepanel;
    private javax.swing.JPanel coursepanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable2;
    private javax.swing.JLabel lbcoursename;
    private javax.swing.JLabel lbselectdept;
    private javax.swing.JLabel lbviewcourse;
    private javax.swing.JLabel panelcoursename;
    private javax.swing.JLabel paneldescription;
    private javax.swing.JTextArea tades;
    // End of variables declaration//GEN-END:variables
      class course {

        String coursename;
        String description;

        course(String coursename, String description) {
            this.coursename = coursename;
            this.description = description;
        }
    }

    class tabelmodel extends AbstractTableModel {

        String Title[] = {"Course Name", "Description"};

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
                return al.get(row).coursename;
            } else {
                return al.get(row).description;

            }
        }

    }
}


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class ViewFaculty extends JInternalFrame {

    ArrayList<Faculty> al = new ArrayList<>();
    tabelmodel tm4;

    public ViewFaculty() {
        tm4 = new tabelmodel();
        initComponents();
        setVisible(true);
        setSize(1000, 650);
                getContentPane().setBackground(Color.white);

        jtabelview.setVisible(false);
        
          jtabelview.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value,
                    boolean isSelected,
                    boolean hasFocus,
                    int row, int column) {
                
                
                
                try {
                    System.out.println(row);
                    JLabel lb = al.get(row).lb;
                    BufferedImage orgimage = ImageIO.read(new File(al.get(row).photo));
                    BufferedImage resizedImage = ViewFaculty.this.resize(orgimage, 40, 40);
                    lb.setIcon(new ImageIcon(resizedImage));
                    return lb;
                } catch (Exception ex) {
                    return null;
                }
                
                
                
            }
        });
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next()) {
                String s = rs.getString("department_name");
                cbselectdp.addItem(s);
            }

        } catch (Exception e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbviewfaculty = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        viewfacultypanel1 = new javax.swing.JPanel();
        cbselectcoursename = new javax.swing.JComboBox();
        cbselectdp = new javax.swing.JComboBox();
        lbselectsp = new javax.swing.JLabel();
        lbselectcoursename = new javax.swing.JLabel();
        btview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelview = new javax.swing.JTable();
        btdelete = new javax.swing.JButton();

        getContentPane().setLayout(null);

        lbviewfaculty.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbviewfaculty.setForeground(new java.awt.Color(102, 0, 102));
        lbviewfaculty.setText("View Faculty");
        getContentPane().add(lbviewfaculty);
        lbviewfaculty.setBounds(350, 10, 210, 40);

        jPanel1.setBackground(new java.awt.Color(204, 153, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.setLayout(null);

        viewfacultypanel1.setBackground(new java.awt.Color(255, 255, 255));
        viewfacultypanel1.setLayout(null);

        cbselectcoursename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        viewfacultypanel1.add(cbselectcoursename);
        cbselectcoursename.setBounds(400, 60, 240, 40);

        cbselectdp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        cbselectdp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbselectdpItemStateChanged(evt);
            }
        });
        viewfacultypanel1.add(cbselectdp);
        cbselectdp.setBounds(400, 10, 240, 40);

        lbselectsp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectsp.setForeground(new java.awt.Color(102, 0, 102));
        lbselectsp.setText("Select Department");
        viewfacultypanel1.add(lbselectsp);
        lbselectsp.setBounds(150, 20, 210, 30);

        lbselectcoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbselectcoursename.setText("Select CourseName");
        viewfacultypanel1.add(lbselectcoursename);
        lbselectcoursename.setBounds(150, 60, 170, 30);

        btview.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btview.setForeground(new java.awt.Color(102, 0, 102));
        btview.setText("View");
        btview.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btviewActionPerformed(evt);
            }
        });
        viewfacultypanel1.add(btview);
        btview.setBounds(350, 120, 130, 50);

        jtabelview.setModel(tm4);
        jtabelview.setRowHeight(40);
        jScrollPane1.setViewportView(jtabelview);

        viewfacultypanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 890, 250);

        btdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdelete.setForeground(new java.awt.Color(102, 0, 102));
        btdelete.setText("Delete");
        btdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        viewfacultypanel1.add(btdelete);
        btdelete.setBounds(350, 440, 130, 50);

        jPanel1.add(viewfacultypanel1);
        viewfacultypanel1.setBounds(30, 30, 910, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 970, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbselectdpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbselectdpItemStateChanged
        cbselectcoursename.removeAllItems();
        try {
            String a = cbselectdp.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from course where department_name='" + a + "' ");
            while (rs.next()) {
                String s = rs.getString("course_name");
                cbselectcoursename.addItem(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cbselectdpItemStateChanged

    private void btviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btviewActionPerformed
        try {
            jtabelview.setVisible(true);

            al.clear();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from faculty where department_name='" + cbselectdp.getSelectedItem() + "' and course_name='" + cbselectcoursename.getSelectedItem() + "'");
            while (rs.next()) {
                String name = rs.getString("username");
                String email = rs.getString("email");
                String photo = rs.getString("photo");
                String qualification = rs.getString("qualification");
                String add = rs.getString("address");
                String experience = rs.getString("experience");
                String phone = rs.getString("phone");

                if (photo.equals("NO")) {
                    photo = "E:\\Cloud Note Sharing Complete Project\\NotesShaing\\src\\empty_pic.jpg";
                }
                System.out.println("photo: "+photo);
                al.add(new Faculty(name, email, photo, qualification, add, experience, phone, new JLabel()));

            }
            tm4.fireTableDataChanged();
            System.out.println("after while");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btviewActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "My Confirm Dialog", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            int r = jtabelview.getSelectedRow();
            if (r == -1) {
                JOptionPane.showMessageDialog(this, "select row first");
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
                    System.out.println("Connection built..");
                    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    System.out.println("Statement created..");
                    ResultSet rs = stmt.executeQuery("select * from faculty where department_name='" + cbselectdp.getSelectedItem() + "' and course_name='" + cbselectcoursename.getSelectedItem() + "'");
                    if (rs.next()) {
                        rs.deleteRow();
                        al.remove(r);
                        tm4.fireTableDataChanged();

                    }
                } catch (Exception e) {
                }
            }

    }//GEN-LAST:event_btdeleteActionPerformed

    }

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
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFaculty().setVisible(true);
            }
        });
    }

    public BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btview;
    private javax.swing.JComboBox cbselectcoursename;
    private javax.swing.JComboBox cbselectdp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabelview;
    private javax.swing.JLabel lbselectcoursename;
    private javax.swing.JLabel lbselectsp;
    private javax.swing.JLabel lbviewfaculty;
    private javax.swing.JPanel viewfacultypanel1;
    // End of variables declaration//GEN-END:variables
class Faculty {

        String name;
        String email;
        String photo;
        String qualification;
        String add;
        String experience;
        String phone;
        JLabel lb;

        Faculty(String name, String email, String photo, String qualification, String add, String experience, String phone, JLabel lb) {
            this.name = name;
            this.email = email;
            this.photo = photo;
            this.qualification = qualification;
            this.add = add;
            this.experience = experience;
            this.phone = phone;
            this.lb = lb;
        }

    }

    class tabelmodel extends AbstractTableModel {

        String Title[] = {"Teacher_Name", "E-mail", "Image", "Qualification", "Address", "Experience", "Contact"};

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
                return al.get(row).name;
            }

            if (col == 1) {
                return al.get(row).email;
            }

            if (col == 2) {
                return al.get(row).lb;
            }

            if (col == 3) {
                return al.get(row).qualification;
            }

            if (col == 4) {
                return al.get(row).add;
            }

            if (col == 5) {
                return al.get(row).experience;
            } else {
                return al.get(row).phone;
            }

        }

    }
}

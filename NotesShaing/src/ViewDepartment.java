
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ViewDepartment extends JInternalFrame {

    ArrayList<department>al=new ArrayList<>();
       tabelmodel tm;
    public ViewDepartment() {
              
 tm=new tabelmodel();
        initComponents();
       
     
        setVisible(true);
        setSize(1000,650); 
                getContentPane().setBackground(Color.white);

        jPanel1.setVisible(false);
        
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next())
            {                
             String name=rs.getString("department_name");
             String head=rs.getString("department_head");
             String email=rs.getString("email");
             String contact=rs.getString("contact");
             String description=rs.getString("description");
            al.add(new department(name,head,email,contact,description));
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbviewdepartment = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        blname = new javax.swing.JLabel();
        lbhead = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbcontact = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfhead = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfcontact = new javax.swing.JTextField();
        lbdescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadescription = new javax.swing.JTextArea();
        btpaneledit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btrefresh = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        btedit = new javax.swing.JButton();

        getContentPane().setLayout(null);

        lbviewdepartment.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbviewdepartment.setForeground(new java.awt.Color(102, 0, 102));
        lbviewdepartment.setText("View Department");
        getContentPane().add(lbviewdepartment);
        lbviewdepartment.setBounds(320, 20, 320, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.setLayout(null);

        blname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        blname.setForeground(new java.awt.Color(102, 0, 102));
        blname.setText("Department Name");
        jPanel1.add(blname);
        blname.setBounds(11, 31, 140, 30);

        lbhead.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbhead.setForeground(new java.awt.Color(102, 0, 102));
        lbhead.setText("Department Head");
        jPanel1.add(lbhead);
        lbhead.setBounds(10, 80, 130, 30);

        lbemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbemail.setForeground(new java.awt.Color(102, 0, 102));
        lbemail.setText("Email");
        jPanel1.add(lbemail);
        lbemail.setBounds(10, 130, 80, 30);

        lbcontact.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbcontact.setForeground(new java.awt.Color(102, 0, 102));
        lbcontact.setText("Contact");
        jPanel1.add(lbcontact);
        lbcontact.setBounds(10, 180, 70, 30);

        tfname.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(tfname);
        tfname.setBounds(160, 20, 200, 40);

        tfhead.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(tfhead);
        tfhead.setBounds(160, 70, 200, 40);

        tfemail.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(tfemail);
        tfemail.setBounds(160, 130, 200, 40);

        tfcontact.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.add(tfcontact);
        tfcontact.setBounds(160, 180, 200, 40);

        lbdescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbdescription.setForeground(new java.awt.Color(102, 0, 102));
        lbdescription.setText("Description");
        jPanel1.add(lbdescription);
        lbdescription.setBounds(10, 230, 100, 30);

        tadescription.setColumns(20);
        tadescription.setForeground(new java.awt.Color(102, 0, 102));
        tadescription.setRows(5);
        jScrollPane2.setViewportView(tadescription);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(160, 230, 200, 80);

        btpaneledit.setBackground(new java.awt.Color(255, 255, 255));
        btpaneledit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btpaneledit.setForeground(new java.awt.Color(102, 0, 102));
        btpaneledit.setText("Edit");
        btpaneledit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btpaneledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpaneleditActionPerformed(evt);
            }
        });
        jPanel1.add(btpaneledit);
        btpaneledit.setBounds(120, 330, 130, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(840, 130, 380, 390);

        jPanel3.setBackground(new java.awt.Color(204, 153, 253));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jTable1.setModel(tm);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 720, 300);

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
        jPanel2.add(btrefresh);
        btrefresh.setBounds(540, 340, 150, 50);

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
        jPanel2.add(btdelete);
        btdelete.setBounds(310, 340, 150, 50);

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
        jPanel2.add(btedit);
        btedit.setBounds(50, 340, 150, 50);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(20, 30, 760, 410);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 90, 810, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
   int r=jTable1.getSelectedRow();
        if (r==-1)
        {
            JOptionPane.showMessageDialog(this,"select row first");
        }

   else
        {
                       jPanel1.setVisible(true);

           
            try {
               String name= al.get(r).name;
                  Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department where department_name='"+name+"'" );
                if (rs.next())
                {
                    String dpname=rs.getString("department_name");
                    String dec = rs.getString("description");
                    String head=rs.getString("department_head");
                    String email=rs.getString("email");
                    String contact=rs.getString("contact");  
                   // tfname.setEditable(false);
                    tfname.setText(dpname);
                                        tfname.setEditable(false);

                 tfhead.setText(head);
                 tfcontact.setText(contact);
                 tfemail.setText(email);
                 tadescription.setText(dec);
                }
            } catch (Exception e) {
            }
            
        }
   
  
    }//GEN-LAST:event_bteditActionPerformed

    private void btpaneleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpaneleditActionPerformed
        try {
            String name=tfname.getText();
            String head=tfhead.getText();
            String email=tfemail.getText();
            String contact=tfcontact.getText();
            String des=tadescription.getText();
              Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
             ResultSet rs = stmt.executeQuery("select * from department where department_name='"+name+"'" );           
            if(rs.next())
            {
               rs.updateString("department_head", head);
               rs.updateString("email", email);
               rs.updateString("contact", contact);
               rs.updateString("description", des);
               rs.updateRow();
               JOptionPane.showMessageDialog(this,"update is successful");
               jPanel1.setVisible(false);
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btpaneleditActionPerformed

    private void btrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrefreshActionPerformed
                  al.clear();

        try {
           // al.clear();
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department");
            while (rs.next())
            {                
             String name=rs.getString("department_name");
             String head=rs.getString("department_head");
             String email=rs.getString("email");
             String contact=rs.getString("contact");
             String description=rs.getString("description");
            al.add(new department(name,head,email,contact,description));
            tm.fireTableDataChanged();

            }
           // tm.fireTableDataChanged();

        } catch (Exception e) {
        
        }
    }//GEN-LAST:event_btrefreshActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
                int ans = JOptionPane.showConfirmDialog(this, "Are you sure to delete ?", "My Confirm Dialog", JOptionPane.YES_NO_OPTION);   
                if(ans==JOptionPane.YES_OPTION)
                {
                int r=jTable1.getSelectedRow();
            if (r==-1)
        {
            JOptionPane.showMessageDialog(this,"select row first");
        }
            else
            {
                  try {
                          
                      String name= al.get(r).name;
                    Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from department where department_name='"+name+"'");
                      if (rs.next())
                      {
                        rs.deleteRow();
                        al.remove(r);
                        tm.fireTableDataChanged();
                      }


                } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(ViewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDepartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blname;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btpaneledit;
    private javax.swing.JButton btrefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbcontact;
    private javax.swing.JLabel lbdescription;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbhead;
    private javax.swing.JLabel lbviewdepartment;
    private javax.swing.JTextArea tadescription;
    private javax.swing.JTextField tfcontact;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfhead;
    private javax.swing.JTextField tfname;
    // End of variables declaration//GEN-END:variables
class department
{
  String name;
  String head;
  String contact;
  String email;
  String description;
  department( String name,String head,String email,String contact,String description)
  {
     this.name=name;
     this.head=head;
     this.contact=email;
     this.email=contact;
     this.description=description;
  }
}
class tabelmodel extends AbstractTableModel
{
   String title[]={"Department Name","Department Head","Email","Contact","Description"};
   public String getColumnName(int a)
   {
       return title[a];
   }
        public int getRowCount()
        {
           return al.size();
        }

        public int getColumnCount()
        {
           return title.length; 
        }

        public Object getValueAt(int row, int col) {
            if (col==0) 
            {
             return al.get(row).name;
            }
            if (col==1) 
            {
             return al.get(row).head;
            }
            if (col==2) 
            {
             return al.get(row).contact;
            }
            if (col==3) 
            {
             return al.get(row).email;
            }
            else
            {
             return al.get(row).description;
            }
        }
        
    
}
}

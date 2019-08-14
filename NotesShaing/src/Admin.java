
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Admin extends javax.swing.JFrame {

    public Admin() {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        setVisible(true);
        setSize(650,700);
     getContentPane().setBackground(Color.white);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblogin = new javax.swing.JLabel();
        loginpanel1 = new javax.swing.JPanel();
        loginpanel = new javax.swing.JPanel();
        btlogin = new javax.swing.JButton();
        tfusername = new javax.swing.JTextField();
        tfpass = new javax.swing.JPasswordField();
        lbusername = new javax.swing.JLabel();
        lbpassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblogin.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lblogin.setForeground(new java.awt.Color(102, 0, 102));
        lblogin.setText("Admin Login");
        getContentPane().add(lblogin);
        lblogin.setBounds(200, 60, 300, 40);

        loginpanel1.setBackground(new java.awt.Color(204, 153, 253));
        loginpanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        loginpanel1.setLayout(null);

        loginpanel.setBackground(new java.awt.Color(255, 255, 255));
        loginpanel.setLayout(null);

        btlogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btlogin.setForeground(new java.awt.Color(102, 0, 102));
        btlogin.setText("Login");
        btlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        loginpanel.add(btlogin);
        btlogin.setBounds(120, 250, 120, 40);

        tfusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        loginpanel.add(tfusername);
        tfusername.setBounds(200, 90, 210, 40);

        tfpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        loginpanel.add(tfpass);
        tfpass.setBounds(200, 140, 210, 40);

        lbusername.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbusername.setForeground(new java.awt.Color(102, 0, 102));
        lbusername.setText("Username");
        loginpanel.add(lbusername);
        lbusername.setBounds(10, 100, 120, 40);

        lbpassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(102, 0, 102));
        lbpassword.setText("Password");
        loginpanel.add(lbpassword);
        lbpassword.setBounds(10, 150, 130, 40);

        loginpanel1.add(loginpanel);
        loginpanel.setBounds(40, 40, 420, 340);

        getContentPane().add(loginpanel1);
        loginpanel1.setBounds(80, 170, 500, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
            try {
                String username=tfusername.getText();
                String pass=tfpass.getText();
               Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema1", "root", "");
            System.out.println("Connection built..");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement created..");
            ResultSet rs = stmt.executeQuery("select * from admin where username='"+username+"' and password='"+pass+"'");
            if(rs.next())
            {
                JOptionPane.showMessageDialog(this,"Login Successful");
                Admin.this.dispose();
                Homepage obj=new Homepage();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Login failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btloginActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel loginpanel1;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfusername;
    // End of variables declaration//GEN-END:variables
}

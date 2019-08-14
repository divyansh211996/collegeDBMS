public class FacultyChangePassword extends javax.swing.JFrame {

    public FacultyChangePassword() {
        initComponents();
        setVisible(true);
        setSize(690,700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents

    private void btchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchangepasswordActionPerformed
    }//GEN-LAST:event_btchangepasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}

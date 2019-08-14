
public class StudentChangePassword extends javax.swing.JFrame {

    public StudentChangePassword() {
        initComponents();
        setVisible(true);
        setSize(750,750);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lbstuchange = new javax.swing.JLabel();
        studentpasspanel2 = new javax.swing.JPanel();
        stuchangepasspanel = new javax.swing.JPanel();
        btstuchangepassword = new javax.swing.JButton();
        tfstuconfirmpass = new javax.swing.JPasswordField();
        tfstunewpass = new javax.swing.JPasswordField();
        tfstuoldpass = new javax.swing.JPasswordField();
        tfstuunirollno = new javax.swing.JTextField();
        lbstuconfirmpass = new javax.swing.JLabel();
        lbstunewpass = new javax.swing.JLabel();
        lbstuoldpass = new javax.swing.JLabel();
        lbsturol = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbstuchange.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbstuchange.setForeground(new java.awt.Color(102, 0, 102));
        lbstuchange.setText("Student Change Password");
        getContentPane().add(lbstuchange);
        lbstuchange.setBounds(180, 20, 380, 40);

        studentpasspanel2.setBackground(new java.awt.Color(204, 153, 253));
        studentpasspanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studentpasspanel2.setLayout(null);

        stuchangepasspanel.setBackground(new java.awt.Color(255, 255, 255));
        stuchangepasspanel.setLayout(null);

        btstuchangepassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuchangepassword.setForeground(new java.awt.Color(102, 0, 102));
        btstuchangepassword.setText("Change");
        btstuchangepassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstuchangepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuchangepasswordActionPerformed(evt);
            }
        });
        stuchangepasspanel.add(btstuchangepassword);
        btstuchangepassword.setBounds(160, 310, 140, 50);

        tfstuconfirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stuchangepasspanel.add(tfstuconfirmpass);
        tfstuconfirmpass.setBounds(230, 230, 250, 40);

        tfstunewpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stuchangepasspanel.add(tfstunewpass);
        tfstunewpass.setBounds(230, 180, 250, 40);

        tfstuoldpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stuchangepasspanel.add(tfstuoldpass);
        tfstuoldpass.setBounds(230, 130, 250, 40);

        tfstuunirollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stuchangepasspanel.add(tfstuunirollno);
        tfstuunirollno.setBounds(230, 80, 250, 40);

        lbstuconfirmpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstuconfirmpass.setForeground(new java.awt.Color(102, 0, 102));
        lbstuconfirmpass.setText("Confirm Password");
        stuchangepasspanel.add(lbstuconfirmpass);
        lbstuconfirmpass.setBounds(30, 230, 170, 30);

        lbstunewpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstunewpass.setForeground(new java.awt.Color(102, 0, 102));
        lbstunewpass.setText("New Password");
        stuchangepasspanel.add(lbstunewpass);
        lbstunewpass.setBounds(30, 180, 150, 30);

        lbstuoldpass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstuoldpass.setForeground(new java.awt.Color(102, 0, 102));
        lbstuoldpass.setText("Old Password");
        stuchangepasspanel.add(lbstuoldpass);
        lbstuoldpass.setBounds(30, 130, 170, 30);

        lbsturol.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbsturol.setForeground(new java.awt.Color(102, 0, 102));
        lbsturol.setText("University_Rollno");
        stuchangepasspanel.add(lbsturol);
        lbsturol.setBounds(30, 80, 180, 30);

        studentpasspanel2.add(stuchangepasspanel);
        stuchangepasspanel.setBounds(40, 40, 510, 400);

        getContentPane().add(studentpasspanel2);
        studentpasspanel2.setBounds(90, 150, 590, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btstuchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuchangepasswordActionPerformed
       
    }//GEN-LAST:event_btstuchangepasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btstuchangepassword;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbstuchange;
    private javax.swing.JLabel lbstuconfirmpass;
    private javax.swing.JLabel lbstunewpass;
    private javax.swing.JLabel lbstuoldpass;
    private javax.swing.JLabel lbsturol;
    private javax.swing.JPanel stuchangepasspanel;
    private javax.swing.JPanel studentpasspanel2;
    private javax.swing.JPasswordField tfstuconfirmpass;
    private javax.swing.JPasswordField tfstunewpass;
    private javax.swing.JPasswordField tfstuoldpass;
    private javax.swing.JTextField tfstuunirollno;
    // End of variables declaration//GEN-END:variables
}

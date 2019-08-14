public class Facultyhomepage extends javax.swing.JFrame {

    public Facultyhomepage() {
        initComponents();
        setVisible(true);
        setSize(900,700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbwelcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbprofile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbdpname = new javax.swing.JLabel();
        lbcoursename = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbphone = new javax.swing.JLabel();
        lbaddress = new javax.swing.JLabel();
        lbqualification = new javax.swing.JLabel();
        lbexperience = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btchangepass = new javax.swing.JButton();
        bteditprofile = new javax.swing.JButton();
        bteditprofilepic = new javax.swing.JButton();
        btaddnotes = new javax.swing.JButton();
        bthistory = new javax.swing.JButton();
        btexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbwelcome.setFont(new java.awt.Font("Times New Roman", 2, 44)); // NOI18N
        lbwelcome.setForeground(new java.awt.Color(102, 0, 102));
        lbwelcome.setText("Welcome");
        getContentPane().add(lbwelcome);
        lbwelcome.setBounds(310, 20, 200, 30);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.setLayout(null);

        lbprofile.setText("Profile pic");
        lbprofile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel1.add(lbprofile);
        lbprofile.setBounds(20, 40, 210, 270);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        lbdpname.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbdpname.setForeground(new java.awt.Color(102, 0, 102));
        lbdpname.setText("departmentname");
        jPanel3.add(lbdpname);
        lbdpname.setBounds(10, 20, 190, 30);

        lbcoursename.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbcoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbcoursename.setText("coursename");
        jPanel3.add(lbcoursename);
        lbcoursename.setBounds(10, 70, 190, 30);

        lbemail.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbemail.setForeground(new java.awt.Color(102, 0, 102));
        lbemail.setText("email");
        jPanel3.add(lbemail);
        lbemail.setBounds(10, 110, 200, 30);

        lbphone.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbphone.setForeground(new java.awt.Color(102, 0, 102));
        lbphone.setText("phone");
        jPanel3.add(lbphone);
        lbphone.setBounds(10, 150, 190, 30);

        lbaddress.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbaddress.setForeground(new java.awt.Color(102, 0, 102));
        lbaddress.setText("address");
        jPanel3.add(lbaddress);
        lbaddress.setBounds(10, 190, 200, 30);

        lbqualification.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbqualification.setForeground(new java.awt.Color(102, 0, 102));
        lbqualification.setText("qualification");
        jPanel3.add(lbqualification);
        lbqualification.setBounds(10, 240, 190, 30);

        lbexperience.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        lbexperience.setForeground(new java.awt.Color(102, 0, 102));
        lbexperience.setText("experience");
        jPanel3.add(lbexperience);
        lbexperience.setBounds(10, 290, 190, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(270, 20, 230, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 180, 520, 410);

        lbusername.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lbusername.setForeground(new java.awt.Color(102, 0, 102));
        lbusername.setText("lbusername");
        getContentPane().add(lbusername);
        lbusername.setBounds(520, 20, 200, 30);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jPanel2.setLayout(null);

        btchangepass.setBackground(new java.awt.Color(255, 255, 255));
        btchangepass.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        btchangepass.setForeground(new java.awt.Color(102, 0, 102));
        btchangepass.setText("Change Password");
        btchangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchangepassActionPerformed(evt);
            }
        });
        jPanel2.add(btchangepass);
        btchangepass.setBounds(40, 20, 200, 70);

        bteditprofile.setBackground(new java.awt.Color(255, 255, 255));
        bteditprofile.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        bteditprofile.setForeground(new java.awt.Color(102, 0, 102));
        bteditprofile.setText("Edit Profile");
        bteditprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditprofileActionPerformed(evt);
            }
        });
        jPanel2.add(bteditprofile);
        bteditprofile.setBounds(40, 90, 200, 60);

        bteditprofilepic.setBackground(new java.awt.Color(255, 255, 255));
        bteditprofilepic.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        bteditprofilepic.setForeground(new java.awt.Color(102, 0, 102));
        bteditprofilepic.setText("Edit Profile Pic");
        bteditprofilepic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditprofilepicActionPerformed(evt);
            }
        });
        jPanel2.add(bteditprofilepic);
        bteditprofilepic.setBounds(40, 150, 200, 60);

        btaddnotes.setBackground(new java.awt.Color(255, 255, 255));
        btaddnotes.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        btaddnotes.setForeground(new java.awt.Color(102, 0, 102));
        btaddnotes.setText("Add Notes");
        btaddnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddnotesActionPerformed(evt);
            }
        });
        jPanel2.add(btaddnotes);
        btaddnotes.setBounds(40, 210, 200, 60);

        bthistory.setBackground(new java.awt.Color(255, 255, 255));
        bthistory.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        bthistory.setForeground(new java.awt.Color(102, 0, 102));
        bthistory.setText("View Note History");
        bthistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthistoryActionPerformed(evt);
            }
        });
        jPanel2.add(bthistory);
        bthistory.setBounds(40, 270, 200, 60);

        btexit.setBackground(new java.awt.Color(255, 255, 255));
        btexit.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        btexit.setForeground(new java.awt.Color(102, 0, 102));
        btexit.setText("Exit");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });
        jPanel2.add(btexit);
        btexit.setBounds(40, 330, 200, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(570, 180, 290, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddnotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btaddnotesActionPerformed

    private void btchangepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchangepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchangepassActionPerformed

    private void bteditprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bteditprofileActionPerformed

    private void bteditprofilepicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditprofilepicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bteditprofilepicActionPerformed

    private void bthistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bthistoryActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btexitActionPerformed

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
            java.util.logging.Logger.getLogger(Facultyhomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facultyhomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facultyhomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facultyhomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facultyhomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaddnotes;
    private javax.swing.JButton btchangepass;
    private javax.swing.JButton bteditprofile;
    private javax.swing.JButton bteditprofilepic;
    private javax.swing.JButton btexit;
    private javax.swing.JButton bthistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbcoursename;
    private javax.swing.JLabel lbdpname;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbexperience;
    private javax.swing.JLabel lbphone;
    private javax.swing.JLabel lbprofile;
    private javax.swing.JLabel lbqualification;
    private javax.swing.JLabel lbusername;
    private javax.swing.JLabel lbwelcome;
    // End of variables declaration//GEN-END:variables
}

public class StudentEditProfile extends javax.swing.JFrame {
    public StudentEditProfile() {
        initComponents();
        setVisible(true);
        setSize(750,700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbstuedit = new javax.swing.JLabel();
        stueditpanel2 = new javax.swing.JPanel();
        stueditpanel1 = new javax.swing.JPanel();
        btstuedit = new javax.swing.JButton();
        tfeditrollno = new javax.swing.JTextField();
        lbeditmail = new javax.swing.JLabel();
        lbeditcontact = new javax.swing.JLabel();
        lbeditadd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfeditaddress = new javax.swing.JTextArea();
        tfeditcontact = new javax.swing.JTextField();
        tfeditemail = new javax.swing.JTextField();
        lbeditroll = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbstuedit.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbstuedit.setForeground(new java.awt.Color(102, 0, 102));
        lbstuedit.setText("Edit Profile");
        getContentPane().add(lbstuedit);
        lbstuedit.setBounds(300, 10, 290, 40);

        stueditpanel2.setBackground(new java.awt.Color(204, 153, 253));
        stueditpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        stueditpanel2.setLayout(null);

        stueditpanel1.setBackground(new java.awt.Color(255, 255, 255));
        stueditpanel1.setLayout(null);

        btstuedit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuedit.setText("Edit");
        btstuedit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstuedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstueditActionPerformed(evt);
            }
        });
        stueditpanel1.add(btstuedit);
        btstuedit.setBounds(140, 340, 170, 50);

        tfeditrollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stueditpanel1.add(tfeditrollno);
        tfeditrollno.setBounds(210, 30, 250, 40);

        lbeditmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditmail.setForeground(new java.awt.Color(102, 0, 102));
        lbeditmail.setText("Email");
        stueditpanel1.add(lbeditmail);
        lbeditmail.setBounds(20, 100, 140, 30);

        lbeditcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditcontact.setForeground(new java.awt.Color(102, 0, 102));
        lbeditcontact.setText("Contact");
        stueditpanel1.add(lbeditcontact);
        lbeditcontact.setBounds(20, 160, 100, 30);

        lbeditadd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditadd.setForeground(new java.awt.Color(102, 0, 102));
        lbeditadd.setText("Address");
        stueditpanel1.add(lbeditadd);
        lbeditadd.setBounds(20, 210, 90, 30);

        tfeditaddress.setColumns(20);
        tfeditaddress.setForeground(new java.awt.Color(102, 0, 102));
        tfeditaddress.setLineWrap(true);
        tfeditaddress.setRows(5);
        tfeditaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane1.setViewportView(tfeditaddress);

        stueditpanel1.add(jScrollPane1);
        jScrollPane1.setBounds(210, 220, 250, 90);

        tfeditcontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stueditpanel1.add(tfeditcontact);
        tfeditcontact.setBounds(210, 160, 250, 40);

        tfeditemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        stueditpanel1.add(tfeditemail);
        tfeditemail.setBounds(210, 100, 250, 40);

        lbeditroll.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditroll.setForeground(new java.awt.Color(102, 0, 102));
        lbeditroll.setText("University_rollno");
        stueditpanel1.add(lbeditroll);
        lbeditroll.setBounds(20, 30, 160, 40);

        stueditpanel2.add(stueditpanel1);
        stueditpanel1.setBounds(30, 30, 490, 410);

        getContentPane().add(stueditpanel2);
        stueditpanel2.setBounds(100, 120, 550, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btstueditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstueditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btstueditActionPerformed

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
            java.util.logging.Logger.getLogger(StudentEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentEditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btstuedit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbeditadd;
    private javax.swing.JLabel lbeditcontact;
    private javax.swing.JLabel lbeditmail;
    private javax.swing.JLabel lbeditroll;
    private javax.swing.JLabel lbstuedit;
    private javax.swing.JPanel stueditpanel1;
    private javax.swing.JPanel stueditpanel2;
    private javax.swing.JTextArea tfeditaddress;
    private javax.swing.JTextField tfeditcontact;
    private javax.swing.JTextField tfeditemail;
    private javax.swing.JTextField tfeditrollno;
    // End of variables declaration//GEN-END:variables
}

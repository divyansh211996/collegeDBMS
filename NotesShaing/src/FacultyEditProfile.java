public class FacultyEditProfile extends javax.swing.JFrame {

    public FacultyEditProfile() {
        initComponents();
        setVisible(true);
        setSize(690,700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        lbeditprofile = new javax.swing.JLabel();
        facultyeditprofilepanel2 = new javax.swing.JPanel();
        facultyeditprofilepanel = new javax.swing.JPanel();
        lbeditname = new javax.swing.JLabel();
        lbeditemail = new javax.swing.JLabel();
        tfeditname = new javax.swing.JTextField();
        tfeditemail = new javax.swing.JTextField();
        lbeditcontact = new javax.swing.JLabel();
        lbeditaddress = new javax.swing.JLabel();
        lbeditexp = new javax.swing.JLabel();
        tfeditphone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfeditaddress = new javax.swing.JTextArea();
        tfeditexperience = new javax.swing.JTextField();
        bteditprofile = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lbeditprofile.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbeditprofile.setForeground(new java.awt.Color(102, 0, 102));
        lbeditprofile.setText("Edit Profile");
        getContentPane().add(lbeditprofile);
        lbeditprofile.setBounds(240, 10, 220, 40);

        facultyeditprofilepanel2.setBackground(new java.awt.Color(204, 153, 253));
        facultyeditprofilepanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        facultyeditprofilepanel2.setLayout(null);

        facultyeditprofilepanel.setBackground(new java.awt.Color(255, 255, 255));
        facultyeditprofilepanel.setLayout(null);

        lbeditname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditname.setForeground(new java.awt.Color(102, 0, 102));
        lbeditname.setText("Username");
        facultyeditprofilepanel.add(lbeditname);
        lbeditname.setBounds(10, 30, 110, 30);

        lbeditemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditemail.setForeground(new java.awt.Color(102, 0, 102));
        lbeditemail.setText("Email");
        facultyeditprofilepanel.add(lbeditemail);
        lbeditemail.setBounds(10, 80, 100, 30);

        tfeditname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        facultyeditprofilepanel.add(tfeditname);
        tfeditname.setBounds(140, 30, 200, 40);

        tfeditemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        facultyeditprofilepanel.add(tfeditemail);
        tfeditemail.setBounds(140, 80, 200, 40);

        lbeditcontact.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditcontact.setForeground(new java.awt.Color(102, 0, 102));
        lbeditcontact.setText("Contact");
        facultyeditprofilepanel.add(lbeditcontact);
        lbeditcontact.setBounds(10, 130, 90, 30);

        lbeditaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditaddress.setForeground(new java.awt.Color(102, 0, 102));
        lbeditaddress.setText("Address");
        facultyeditprofilepanel.add(lbeditaddress);
        lbeditaddress.setBounds(10, 190, 90, 30);

        lbeditexp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbeditexp.setForeground(new java.awt.Color(102, 0, 102));
        lbeditexp.setText("Experience");
        facultyeditprofilepanel.add(lbeditexp);
        lbeditexp.setBounds(10, 290, 110, 30);

        tfeditphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        facultyeditprofilepanel.add(tfeditphone);
        tfeditphone.setBounds(140, 130, 200, 40);

        tfeditaddress.setColumns(20);
        tfeditaddress.setRows(5);
        tfeditaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane1.setViewportView(tfeditaddress);

        facultyeditprofilepanel.add(jScrollPane1);
        jScrollPane1.setBounds(140, 190, 200, 80);

        tfeditexperience.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        facultyeditprofilepanel.add(tfeditexperience);
        tfeditexperience.setBounds(140, 290, 200, 40);

        bteditprofile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        bteditprofile.setText("Edit Profile");
        bteditprofile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        bteditprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditprofileActionPerformed(evt);
            }
        });
        facultyeditprofilepanel.add(bteditprofile);
        bteditprofile.setBounds(100, 390, 170, 50);

        facultyeditprofilepanel2.add(facultyeditprofilepanel);
        facultyeditprofilepanel.setBounds(40, 40, 390, 450);

        getContentPane().add(facultyeditprofilepanel2);
        facultyeditprofilepanel2.setBounds(110, 90, 470, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditprofileActionPerformed
    }//GEN-LAST:event_bteditprofileActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyEditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bteditprofile;
    private javax.swing.JPanel facultyeditprofilepanel;
    private javax.swing.JPanel facultyeditprofilepanel2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbeditaddress;
    private javax.swing.JLabel lbeditcontact;
    private javax.swing.JLabel lbeditemail;
    private javax.swing.JLabel lbeditexp;
    private javax.swing.JLabel lbeditname;
    private javax.swing.JLabel lbeditprofile;
    private javax.swing.JTextArea tfeditaddress;
    private javax.swing.JTextField tfeditemail;
    private javax.swing.JTextField tfeditexperience;
    private javax.swing.JTextField tfeditname;
    private javax.swing.JTextField tfeditphone;
    // End of variables declaration//GEN-END:variables
}

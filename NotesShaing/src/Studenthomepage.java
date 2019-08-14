public class Studenthomepage extends javax.swing.JFrame {

    public Studenthomepage() {
        initComponents();
        setVisible(true);
        setSize(1000,650);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbstuwelcome = new javax.swing.JLabel();
        Studenthomepagebuttonpanel = new javax.swing.JPanel();
        btstuchangepass = new javax.swing.JButton();
        btstuexit = new javax.swing.JButton();
        btstuviewnotes = new javax.swing.JButton();
        lbstueditprofile = new javax.swing.JButton();
        studenthomeinfopanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbstucourse = new javax.swing.JLabel();
        lbstudp = new javax.swing.JLabel();
        lbstuemail = new javax.swing.JLabel();
        lbstucon = new javax.swing.JLabel();
        lbstuadd = new javax.swing.JLabel();
        lbstucoursename = new javax.swing.JLabel();
        lbstudpname = new javax.swing.JLabel();
        lbstumail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbstuaddress = new javax.swing.JLabel();
        lbuniroll = new javax.swing.JLabel();
        lbsturollno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbstuwelcome.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbstuwelcome.setForeground(new java.awt.Color(102, 0, 102));
        lbstuwelcome.setText("Welcome");
        getContentPane().add(lbstuwelcome);
        lbstuwelcome.setBounds(350, 10, 170, 50);

        Studenthomepagebuttonpanel.setBackground(new java.awt.Color(204, 153, 253));
        Studenthomepagebuttonpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        Studenthomepagebuttonpanel.setLayout(null);

        btstuchangepass.setBackground(new java.awt.Color(255, 255, 255));
        btstuchangepass.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuchangepass.setForeground(new java.awt.Color(102, 0, 102));
        btstuchangepass.setText("Change Password");
        btstuchangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuchangepassActionPerformed(evt);
            }
        });
        Studenthomepagebuttonpanel.add(btstuchangepass);
        btstuchangepass.setBounds(40, 50, 220, 70);

        btstuexit.setBackground(new java.awt.Color(255, 255, 255));
        btstuexit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuexit.setForeground(new java.awt.Color(102, 0, 102));
        btstuexit.setText("Exit");
        btstuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuexitActionPerformed(evt);
            }
        });
        Studenthomepagebuttonpanel.add(btstuexit);
        btstuexit.setBounds(40, 260, 220, 70);

        btstuviewnotes.setBackground(new java.awt.Color(255, 255, 255));
        btstuviewnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuviewnotes.setForeground(new java.awt.Color(102, 0, 102));
        btstuviewnotes.setText("View Notes");
        btstuviewnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuviewnotesActionPerformed(evt);
            }
        });
        Studenthomepagebuttonpanel.add(btstuviewnotes);
        btstuviewnotes.setBounds(40, 190, 220, 70);

        lbstueditprofile.setBackground(new java.awt.Color(255, 255, 255));
        lbstueditprofile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstueditprofile.setForeground(new java.awt.Color(102, 0, 102));
        lbstueditprofile.setText("Edit Profile");
        lbstueditprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbstueditprofileActionPerformed(evt);
            }
        });
        Studenthomepagebuttonpanel.add(lbstueditprofile);
        lbstueditprofile.setBounds(40, 120, 220, 70);

        getContentPane().add(Studenthomepagebuttonpanel);
        Studenthomepagebuttonpanel.setBounds(600, 140, 310, 420);

        studenthomeinfopanel.setBackground(new java.awt.Color(204, 153, 253));
        studenthomeinfopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studenthomeinfopanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbstucourse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstucourse.setForeground(new java.awt.Color(102, 0, 102));
        lbstucourse.setText("Course Name");
        jPanel1.add(lbstucourse);
        lbstucourse.setBounds(40, 90, 160, 30);

        lbstudp.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstudp.setForeground(new java.awt.Color(102, 0, 102));
        lbstudp.setText("Department Name");
        jPanel1.add(lbstudp);
        lbstudp.setBounds(40, 140, 150, 30);

        lbstuemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstuemail.setForeground(new java.awt.Color(102, 0, 102));
        lbstuemail.setText("Email");
        jPanel1.add(lbstuemail);
        lbstuemail.setBounds(40, 190, 110, 30);

        lbstucon.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstucon.setForeground(new java.awt.Color(102, 0, 102));
        lbstucon.setText("Contact");
        jPanel1.add(lbstucon);
        lbstucon.setBounds(40, 240, 100, 30);

        lbstuadd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstuadd.setForeground(new java.awt.Color(102, 0, 102));
        lbstuadd.setText("Address");
        jPanel1.add(lbstuadd);
        lbstuadd.setBounds(40, 300, 80, 30);

        lbstucoursename.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstucoursename.setForeground(new java.awt.Color(102, 0, 102));
        lbstucoursename.setText("Coursename");
        jPanel1.add(lbstucoursename);
        lbstucoursename.setBounds(230, 90, 200, 30);

        lbstudpname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstudpname.setForeground(new java.awt.Color(102, 0, 102));
        lbstudpname.setText("dpname");
        jPanel1.add(lbstudpname);
        lbstudpname.setBounds(230, 140, 200, 30);

        lbstumail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstumail.setForeground(new java.awt.Color(102, 0, 102));
        lbstumail.setText("email");
        jPanel1.add(lbstumail);
        lbstumail.setBounds(230, 190, 220, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("contact");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 240, 190, 30);

        lbstuaddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbstuaddress.setForeground(new java.awt.Color(102, 0, 102));
        lbstuaddress.setText("address");
        jPanel1.add(lbstuaddress);
        lbstuaddress.setBounds(230, 290, 220, 50);

        lbuniroll.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbuniroll.setForeground(new java.awt.Color(102, 0, 102));
        lbuniroll.setText("University_Rollno");
        jPanel1.add(lbuniroll);
        lbuniroll.setBounds(40, 30, 150, 30);

        lbsturollno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbsturollno.setForeground(new java.awt.Color(102, 0, 102));
        lbsturollno.setText("Rollno");
        jPanel1.add(lbsturollno);
        lbsturollno.setBounds(230, 30, 170, 30);

        studenthomeinfopanel.add(jPanel1);
        jPanel1.setBounds(30, 30, 460, 360);

        getContentPane().add(studenthomeinfopanel);
        studenthomeinfopanel.setBounds(60, 140, 520, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btstuchangepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuchangepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btstuchangepassActionPerformed

    private void lbstueditprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbstueditprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbstueditprofileActionPerformed

    private void btstuviewnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuviewnotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btstuviewnotesActionPerformed

    private void btstuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btstuexitActionPerformed

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
            java.util.logging.Logger.getLogger(Studenthomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studenthomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studenthomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studenthomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studenthomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Studenthomepagebuttonpanel;
    private javax.swing.JButton btstuchangepass;
    private javax.swing.JButton btstuexit;
    private javax.swing.JButton btstuviewnotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbstuadd;
    private javax.swing.JLabel lbstuaddress;
    private javax.swing.JLabel lbstucon;
    private javax.swing.JLabel lbstucourse;
    private javax.swing.JLabel lbstucoursename;
    private javax.swing.JLabel lbstudp;
    private javax.swing.JLabel lbstudpname;
    private javax.swing.JButton lbstueditprofile;
    private javax.swing.JLabel lbstuemail;
    private javax.swing.JLabel lbstumail;
    private javax.swing.JLabel lbsturollno;
    private javax.swing.JLabel lbstuwelcome;
    private javax.swing.JLabel lbuniroll;
    private javax.swing.JPanel studenthomeinfopanel;
    // End of variables declaration//GEN-END:variables
}

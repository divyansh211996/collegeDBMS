public class StudentDownloadNotes extends javax.swing.JFrame {
    public StudentDownloadNotes() {
        initComponents();
        setVisible(true);
        setSize(1200,700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbstudownloadnotes = new javax.swing.JLabel();
        studownloadpanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbnotetitle = new javax.swing.JLabel();
        lbnotedescription = new javax.swing.JLabel();
        lbnotetype = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        tfnotetitle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tfnotetime = new javax.swing.JTextField();
        lbimageicon = new javax.swing.JLabel();
        btdownloadnotes = new javax.swing.JButton();
        jpb = new javax.swing.JProgressBar();
        studownloadpanel2 = new javax.swing.JPanel();
        studownloadpanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabelstunotes = new javax.swing.JTable();
        btstudentviewnotes = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbstudownloadnotes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbstudownloadnotes.setForeground(new java.awt.Color(102, 0, 102));
        lbstudownloadnotes.setText("Download Notes");
        getContentPane().add(lbstudownloadnotes);
        lbstudownloadnotes.setBounds(350, 10, 300, 40);

        studownloadpanel3.setBackground(new java.awt.Color(204, 153, 253));
        studownloadpanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studownloadpanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbnotetitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotetitle.setText("Title");
        jPanel1.add(lbnotetitle);
        lbnotetitle.setBounds(10, 30, 90, 30);

        lbnotedescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotedescription.setText("Description");
        jPanel1.add(lbnotedescription);
        lbnotedescription.setBounds(10, 90, 100, 30);

        lbnotetype.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotetype.setText("Type");
        jPanel1.add(lbnotetype);
        lbnotetype.setBounds(10, 270, 80, 30);

        lbtime.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbtime.setText("Time");
        jPanel1.add(lbtime);
        lbtime.setBounds(10, 160, 80, 30);
        jPanel1.add(tfnotetitle);
        tfnotetitle.setBounds(140, 20, 210, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(140, 70, 210, 80);
        jPanel1.add(tfnotetime);
        tfnotetime.setBounds(140, 160, 210, 40);

        lbimageicon.setText("photo");
        jPanel1.add(lbimageicon);
        lbimageicon.setBounds(150, 230, 110, 110);

        btdownloadnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdownloadnotes.setText("Download");
        btdownloadnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdownloadnotesActionPerformed(evt);
            }
        });
        jPanel1.add(btdownloadnotes);
        btdownloadnotes.setBounds(100, 410, 160, 50);
        jPanel1.add(jpb);
        jpb.setBounds(10, 370, 340, 30);

        studownloadpanel3.add(jPanel1);
        jPanel1.setBounds(30, 30, 360, 470);

        getContentPane().add(studownloadpanel3);
        studownloadpanel3.setBounds(690, 80, 420, 530);

        studownloadpanel2.setBackground(new java.awt.Color(204, 153, 253));
        studownloadpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        studownloadpanel2.setLayout(null);

        studownloadpanel1.setBackground(new java.awt.Color(255, 255, 255));
        studownloadpanel1.setLayout(null);

        jtabelstunotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jtabelstunotes.setModel(null);
        jScrollPane1.setViewportView(jtabelstunotes);

        studownloadpanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 610, 300);

        btstudentviewnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstudentviewnotes.setForeground(new java.awt.Color(102, 0, 102));
        btstudentviewnotes.setText("View Notes");
        btstudentviewnotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btstudentviewnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstudentviewnotesActionPerformed(evt);
            }
        });
        studownloadpanel1.add(btstudentviewnotes);
        btstudentviewnotes.setBounds(60, 330, 170, 50);

        btdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdelete.setForeground(new java.awt.Color(102, 0, 102));
        btdelete.setText("Delete");
        btdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        studownloadpanel1.add(btdelete);
        btdelete.setBounds(340, 330, 180, 50);

        studownloadpanel2.add(studownloadpanel1);
        studownloadpanel1.setBounds(20, 30, 630, 390);

        getContentPane().add(studownloadpanel2);
        studownloadpanel2.setBounds(10, 90, 670, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btdownloadnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdownloadnotesActionPerformed
    }//GEN-LAST:event_btdownloadnotesActionPerformed

    private void btstudentviewnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstudentviewnotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btstudentviewnotesActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StudentDownloadNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDownloadNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDownloadNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDownloadNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDownloadNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btdownloadnotes;
    private javax.swing.JButton btstudentviewnotes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JProgressBar jpb;
    private javax.swing.JTable jtabelstunotes;
    private javax.swing.JLabel lbimageicon;
    private javax.swing.JLabel lbnotedescription;
    private javax.swing.JLabel lbnotetitle;
    private javax.swing.JLabel lbnotetype;
    private javax.swing.JLabel lbstudownloadnotes;
    private javax.swing.JLabel lbtime;
    private javax.swing.JPanel studownloadpanel1;
    private javax.swing.JPanel studownloadpanel2;
    private javax.swing.JPanel studownloadpanel3;
    private javax.swing.JTextField tfnotetime;
    private javax.swing.JTextField tfnotetitle;
    // End of variables declaration//GEN-END:variables
}

public class EditFacultyPic extends javax.swing.JFrame {

    public EditFacultyPic() {
        initComponents();
        setVisible(true);
        setSize(650,600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbeditpic = new javax.swing.JLabel();
        editpicpanel = new javax.swing.JPanel();
        tfpicpath = new javax.swing.JTextField();
        btbrowse = new javax.swing.JButton();
        editpicpanel2 = new javax.swing.JPanel();
        btupload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbeditpic.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbeditpic.setForeground(new java.awt.Color(102, 0, 102));
        lbeditpic.setText("Edit Profile Pic");
        getContentPane().add(lbeditpic);
        lbeditpic.setBounds(230, 40, 240, 40);

        editpicpanel.setBackground(new java.awt.Color(204, 153, 253));
        editpicpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        editpicpanel.setLayout(null);

        tfpicpath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        editpicpanel.add(tfpicpath);
        tfpicpath.setBounds(10, 10, 430, 40);

        btbrowse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btbrowse.setForeground(new java.awt.Color(102, 0, 102));
        btbrowse.setText("Browse");
        btbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbrowseActionPerformed(evt);
            }
        });
        editpicpanel.add(btbrowse);
        btbrowse.setBounds(460, 10, 120, 40);

        getContentPane().add(editpicpanel);
        editpicpanel.setBounds(20, 190, 590, 60);

        editpicpanel2.setBackground(new java.awt.Color(204, 153, 253));
        editpicpanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        editpicpanel2.setLayout(null);

        btupload.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btupload.setForeground(new java.awt.Color(102, 0, 102));
        btupload.setText("Upload");
        btupload.setBorder(null);
        btupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuploadActionPerformed(evt);
            }
        });
        editpicpanel2.add(btupload);
        btupload.setBounds(20, 20, 130, 40);

        getContentPane().add(editpicpanel2);
        editpicpanel2.setBounds(230, 350, 170, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btuploadActionPerformed

    private void btbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbrowseActionPerformed

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
            java.util.logging.Logger.getLogger(EditFacultyPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditFacultyPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditFacultyPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditFacultyPic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditFacultyPic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbrowse;
    private javax.swing.JButton btupload;
    private javax.swing.JPanel editpicpanel;
    private javax.swing.JPanel editpicpanel2;
    private javax.swing.JLabel lbeditpic;
    private javax.swing.JTextField tfpicpath;
    // End of variables declaration//GEN-END:variables
}

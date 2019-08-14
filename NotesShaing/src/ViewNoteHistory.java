public class ViewNoteHistory extends javax.swing.JFrame {

    public ViewNoteHistory() {
        initComponents();
        setVisible(true);
        setSize(780,650);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbviewnoteshis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableviewnotes = new javax.swing.JTable();
        viewnotehistorypanel = new javax.swing.JPanel();
        btnotesdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbviewnoteshis.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbviewnoteshis.setForeground(new java.awt.Color(102, 0, 102));
        lbviewnoteshis.setText("View Notes History");
        getContentPane().add(lbviewnoteshis);
        lbviewnoteshis.setBounds(210, 10, 310, 40);

        jtableviewnotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtableviewnotes.setModel(null);
        jScrollPane1.setViewportView(jtableviewnotes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 650, 270);

        viewnotehistorypanel.setBackground(new java.awt.Color(204, 153, 253));
        viewnotehistorypanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        viewnotehistorypanel.setLayout(null);

        btnotesdelete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnotesdelete.setForeground(new java.awt.Color(102, 0, 102));
        btnotesdelete.setText("Delete");
        btnotesdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btnotesdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotesdeleteActionPerformed(evt);
            }
        });
        viewnotehistorypanel.add(btnotesdelete);
        btnotesdelete.setBounds(250, 320, 150, 50);

        getContentPane().add(viewnotehistorypanel);
        viewnotehistorypanel.setBounds(20, 120, 710, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnotesdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotesdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnotesdeleteActionPerformed

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
            java.util.logging.Logger.getLogger(ViewNoteHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewNoteHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewNoteHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewNoteHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNoteHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnotesdelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableviewnotes;
    private javax.swing.JLabel lbviewnoteshis;
    private javax.swing.JPanel viewnotehistorypanel;
    // End of variables declaration//GEN-END:variables
}

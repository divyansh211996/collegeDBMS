
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AddNotes extends javax.swing.JFrame {

    JFileChooser chooser;

    public AddNotes() {
        initComponents();
        setVisible(true);
        setSize(1000,750);
        chooser = new JFileChooser();
        cbnotestype.addItem("Image");
        cbnotestype.addItem("Audio");
        cbnotestype.addItem("Video");
        cbnotestype.addItem("pdf");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbfacultyaddnotes = new javax.swing.JLabel();
        lbtitle = new javax.swing.JLabel();
        tftitle = new javax.swing.JTextField();
        lbdescription = new javax.swing.JLabel();
        tfdescription = new javax.swing.JTextField();
        lbnotestype = new javax.swing.JLabel();
        cbnotestype = new javax.swing.JComboBox();
        lbselectfile = new javax.swing.JLabel();
        tfselectfile = new javax.swing.JTextField();
        btfilebrowse = new javax.swing.JButton();
        btstuaddnotes = new javax.swing.JButton();
        btselectall = new javax.swing.JButton();
        btdeselectall = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablestudentdata = new javax.swing.JTable();
        Jpaneladdnotes1 = new javax.swing.JPanel();
        jpaneladdnotes2 = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbfacultyaddnotes.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        lbfacultyaddnotes.setForeground(new java.awt.Color(102, 0, 102));
        lbfacultyaddnotes.setText("Add Notes");
        getContentPane().add(lbfacultyaddnotes);
        lbfacultyaddnotes.setBounds(370, 0, 250, 40);

        lbtitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(102, 0, 102));
        lbtitle.setText("Title");
        getContentPane().add(lbtitle);
        lbtitle.setBounds(230, 90, 100, 30);

        tftitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tftitle);
        tftitle.setBounds(370, 90, 220, 40);

        lbdescription.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbdescription.setForeground(new java.awt.Color(102, 0, 102));
        lbdescription.setText("Description");
        getContentPane().add(lbdescription);
        lbdescription.setBounds(230, 150, 130, 30);

        tfdescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tfdescription);
        tfdescription.setBounds(370, 150, 220, 40);

        lbnotestype.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbnotestype.setForeground(new java.awt.Color(102, 0, 102));
        lbnotestype.setText("Type");
        getContentPane().add(lbnotestype);
        lbnotestype.setBounds(230, 210, 90, 30);

        cbnotestype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(cbnotestype);
        cbnotestype.setBounds(370, 210, 220, 40);

        lbselectfile.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lbselectfile.setForeground(new java.awt.Color(102, 0, 102));
        lbselectfile.setText("Select File");
        getContentPane().add(lbselectfile);
        lbselectfile.setBounds(230, 270, 110, 30);

        tfselectfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        getContentPane().add(tfselectfile);
        tfselectfile.setBounds(370, 270, 380, 40);

        btfilebrowse.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btfilebrowse.setForeground(new java.awt.Color(102, 0, 102));
        btfilebrowse.setText("Browse");
        btfilebrowse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        btfilebrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfilebrowseActionPerformed(evt);
            }
        });
        getContentPane().add(btfilebrowse);
        btfilebrowse.setBounds(760, 270, 100, 40);

        btstuaddnotes.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btstuaddnotes.setForeground(new java.awt.Color(102, 0, 102));
        btstuaddnotes.setText("Add Notes");
        btstuaddnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btstuaddnotesActionPerformed(evt);
            }
        });
        getContentPane().add(btstuaddnotes);
        btstuaddnotes.setBounds(220, 640, 160, 50);

        btselectall.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btselectall.setForeground(new java.awt.Color(102, 0, 102));
        btselectall.setText("Select All");
        btselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btselectallActionPerformed(evt);
            }
        });
        getContentPane().add(btselectall);
        btselectall.setBounds(430, 640, 160, 50);

        btdeselectall.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btdeselectall.setForeground(new java.awt.Color(102, 0, 102));
        btdeselectall.setText("Deselect All");
        btdeselectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeselectallActionPerformed(evt);
            }
        });
        getContentPane().add(btdeselectall);
        btdeselectall.setBounds(640, 640, 160, 50);

        jtablestudentdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane2.setViewportView(jtablestudentdata);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 330, 730, 300);

        Jpaneladdnotes1.setBackground(new java.awt.Color(255, 255, 255));
        Jpaneladdnotes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Jpaneladdnotes1.setLayout(null);
        getContentPane().add(Jpaneladdnotes1);
        Jpaneladdnotes1.setBounds(150, 80, 730, 610);

        jpaneladdnotes2.setBackground(new java.awt.Color(204, 153, 253));
        jpaneladdnotes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jpaneladdnotes2.setLayout(null);
        getContentPane().add(jpaneladdnotes2);
        jpaneladdnotes2.setBounds(130, 60, 770, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btfilebrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfilebrowseActionPerformed
        int ans = chooser.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            if (cbnotestype.getSelectedItem().equals("Image") && !(f.getPath().endsWith(".jpg") || f.getPath().endsWith(".jpeg") || f.getPath().endsWith(".png"))) {
                JOptionPane.showMessageDialog(this, "Select appropriate file");
                tfselectfile.setText("");
            } else if (cbnotestype.getSelectedItem().equals("Audio") && !(f.getPath().endsWith(".mp3"))) {
                JOptionPane.showMessageDialog(this, "Select Appropriate file");
                tfselectfile.setText("");

            } else if (cbnotestype.getSelectedItem().equals("Video") && !(f.getPath().endsWith(".mp4") || f.getPath().endsWith(".wmv"))) {
                JOptionPane.showMessageDialog(this, "Select Appropriate file");
                tfselectfile.setText("");

            } else if (cbnotestype.getSelectedItem().equals("pdf") && !(f.getPath().endsWith(".pdf"))) {
                JOptionPane.showMessageDialog(this, "Select Appropriate file");
                tfselectfile.setText("");

            } else {
                String path = f.getPath();

                tfselectfile.setText(path);
            }
        } else if (ans == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "You selected cancel option");
        }
    }//GEN-LAST:event_btfilebrowseActionPerformed

    private void btstuaddnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btstuaddnotesActionPerformed
String title=tftitle.getText();
String descrip=tfdescription.getText();
if(tftitle.getText().equals("")||tfdescription.getText().equals("")||tfselectfile.getText().equals(""))
{
    JOptionPane.showMessageDialog(this, "Fill all field first");
}
    }//GEN-LAST:event_btstuaddnotesActionPerformed

    private void btdeselectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeselectallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdeselectallActionPerformed

    private void btselectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btselectallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btselectallActionPerformed

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
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpaneladdnotes1;
    private javax.swing.JButton btdeselectall;
    private javax.swing.JButton btfilebrowse;
    private javax.swing.JButton btselectall;
    private javax.swing.JButton btstuaddnotes;
    private javax.swing.JComboBox cbnotestype;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpaneladdnotes2;
    private javax.swing.JTable jtablestudentdata;
    private javax.swing.JLabel lbdescription;
    private javax.swing.JLabel lbfacultyaddnotes;
    private javax.swing.JLabel lbnotestype;
    private javax.swing.JLabel lbselectfile;
    private javax.swing.JLabel lbtitle;
    private javax.swing.JTextField tfdescription;
    private javax.swing.JTextField tfselectfile;
    private javax.swing.JTextField tftitle;
    // End of variables declaration//GEN-END:variables
}

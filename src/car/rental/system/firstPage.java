/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental.system;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import car.rental.system.*;

/**
 *
 * @author Dell
 */
public class firstPage extends javax.swing.JFrame {

    /**
     * Creates new form firstPage
     */
    public firstPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SignUpbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LogInBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        AdminBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(3000, 3000));
        getContentPane().setLayout(null);

        jLabel1.setText("<html>\n<body >\n<CENTER>\n<font size =\"36\"  face=\"Algerian\"><u><b> Welcome to Rent My Car</b></u></font>\n</CENTER>\n</body>\n</html>");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(422, 11, 511, 48);

        jLabel2.setText("<html> <body> <font size=\"4\" face=\"Comic Sans MS\"> <i>We simplify car rentals,so that you can focus on what's important to you!</i> </font> ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(422, 99, 551, 21);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/rental/system/crs2.png"))); // NOI18N
        jLabel3.setText("<html> <body> <font size=\"3\" face=\"Arial\"><h4>Flexi Pricing Packages</h4>  One size never fits all! Choose a balance of time and kilometers that works best for you. </font> </body> </html>");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 153, 608, 181);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/rental/system/Capture.PNG"))); // NOI18N
        jLabel5.setText("<html>\n<body>\n<font size=\"3\" face=\"arial\"><h4>Fuel Cost Included</h4>\n\nDon’t worry about mileage! All fuel costs are included.\n</font>\n</body>\n</html>\n\n");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(31, 352, 487, 169);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/rental/system/loc.PNG"))); // NOI18N
        jLabel4.setText("<html>\n<body>\n<font size=\"3\" face=\"arial\"><h4>Go Anywhere</h4>\n\nOur cars have all-India permits.  Just remember to pay state tolls and entry taxes.\n</font>\n</body>\n</html>\n\n");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(648, 164, 595, 158);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/rental/system/hidden.PNG"))); // NOI18N
        jLabel6.setText("<html> <body> <font size=\"3\" face=\"arial\"><pre>      <h4>No Hidden Charges</h4>  Our prices include taxes and insurance.  What you see is what you really pay!</pre> </font> </body> </html>  ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(648, 352, 630, 150);

        jLabel7.setText("<html>\n<body>\n<font size=\"5\" >If not registered?\n</font>\n</body>\n</html>");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(11, 547, 143, 22);

        SignUpbtn.setText("<html>\n<body>\n<font size=\"5\" ><b>Sign up</b>\n</font>\n</body>\n</html>");
        SignUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpbtn);
        SignUpbtn.setBounds(75, 580, 114, 40);

        jLabel8.setText("<html>\n<body>\n<font size=\"5\" >Registered\n</font>\n</body>\n</html>");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(489, 547, 88, 22);

        LogInBtn.setText("<html>\n<body>\n<center>\n<font size=\"5\" ><b>LogIn for customers</b>\n</font>\n</center>\n</body>\n</html>");
        LogInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogInBtn);
        LogInBtn.setBounds(451, 580, 230, 40);

        ExitBtn.setText("<html>\n<body>\n<font size=\"5\"><b>Exit</b></font>\n</body>\n</html>");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn);
        ExitBtn.setBounds(858, 583, 81, 37);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AdminBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdminBtn.setText("Admin LogIn");
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(AdminBtn)
                .addContainerGap(869, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(675, 675, 675)
                .addComponent(AdminBtn)
                .addContainerGap(854, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1330, 1560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBtnActionPerformed
        // TODO add your handling code here:
        systemExit();
        thirdpg Info=new thirdpg();
        Info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogInBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void SignUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        systemExit();
        Secondpg Info=new Secondpg();
        Info.setVisible(true);
    }//GEN-LAST:event_SignUpbtnActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        systemExit();
        AdminLogIn Info=new AdminLogIn();
        Info.setVisible(true);
    }//GEN-LAST:event_AdminBtnActionPerformed

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
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LogInBtn;
    private javax.swing.JButton SignUpbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void systemExit()
{
 WindowEvent windowcloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}

}
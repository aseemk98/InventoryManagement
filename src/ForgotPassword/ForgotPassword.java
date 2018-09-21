package ForgotPassword;

import java.security.SecureRandom;
import javax.swing.JOptionPane;
import loginPage.loginPage;
import java.awt.*;

public class ForgotPassword extends javax.swing.JFrame {
    
    String otp;

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        this.setAlwaysOnTop(true);  //sets always on top
        this.setResizable(false);   //not resizable
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        ChildPanel.setVisible(false);
        ChildChild.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        ChildChild = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NewPassText = new javax.swing.JTextField();
        ConfirmNewPass = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        ChildPanel = new javax.swing.JLayeredPane();
        Information = new javax.swing.JLabel();
        OTPText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VerifyOtp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter email ID");

        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        Send.setText("Verify Email");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Send)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Send)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setText("Enter new password");

        jLabel4.setText("Cinfirm Password");

        NewPassText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPassTextActionPerformed(evt);
            }
        });

        Reset.setText("Reset Password");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChildChildLayout = new javax.swing.GroupLayout(ChildChild);
        ChildChild.setLayout(ChildChildLayout);
        ChildChildLayout.setHorizontalGroup(
            ChildChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChildChildLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChildChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChildChildLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(NewPassText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChildChildLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChildChildLayout.createSequentialGroup()
                        .addComponent(Reset)
                        .addGap(60, 60, 60)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ChildChildLayout.setVerticalGroup(
            ChildChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChildChildLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ChildChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ChildChildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reset)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        OTPText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTPTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter OTP:");

        VerifyOtp.setText("Verify OTP");
        VerifyOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyOtpActionPerformed(evt);
            }
        });

        ChildPanel.setLayer(Information, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ChildPanel.setLayer(OTPText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ChildPanel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ChildPanel.setLayer(VerifyOtp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ChildPanelLayout = new javax.swing.GroupLayout(ChildPanel);
        ChildPanel.setLayout(ChildPanelLayout);
        ChildPanelLayout.setHorizontalGroup(
            ChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChildPanelLayout.createSequentialGroup()
                .addGroup(ChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChildPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(OTPText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChildPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VerifyOtp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChildPanelLayout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ChildPanelLayout.setVerticalGroup(
            ChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChildPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Information, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ChildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(OTPText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerifyOtp)
                .addContainerGap())
        );

        MainPanel.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(ChildChild, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(ChildPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(ChildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChildChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(ChildChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 438, Short.MAX_VALUE))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> baea9c2fab422b31210864ca61c8b2a8ce7076b3
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private String OTP()
    {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        String formatted = String.format("%05d", num); 
        return formatted;
    }
    
    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        // TODO add your handling code here:
        
        otp=OTP();
        String email=EmailText.getText().toString();
        
        SendMailTLS object=new SendMailTLS(email, otp);
        
        String message=object.Execute();
        
        Information.setText(message);
        
        ChildPanel.setVisible(true);
        
        
        
    }//GEN-LAST:event_SendActionPerformed

    private void OTPTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTPTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OTPTextActionPerformed

    private void VerifyOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyOtpActionPerformed
        // TODO add your handling code here:
        System.err.println(OTPText.getText().toString());
        if(OTPText.getText().toString().equals(otp))
        {
            ChildChild.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(this, "The entered OTP is incorrect","Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_VerifyOtpActionPerformed

    private void NewPassTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPassTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPassTextActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        
        String password=NewPassText.getText().toString();
        if(!password.equals(ConfirmNewPass.getText().toString()))
        {
            JOptionPane.showMessageDialog(null, "The entered passwords do not match..","Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            //Update database
        
        this.dispose();
        
        loginPage LoginPage=new loginPage();
        LoginPage.setVisible(true);
        }
        
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChildChild;
    private javax.swing.JLayeredPane ChildPanel;
    private javax.swing.JTextField ConfirmNewPass;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel Information;
    private javax.swing.JLayeredPane MainPanel;
    private javax.swing.JTextField NewPassText;
    private javax.swing.JTextField OTPText;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Send;
    private javax.swing.JButton VerifyOtp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

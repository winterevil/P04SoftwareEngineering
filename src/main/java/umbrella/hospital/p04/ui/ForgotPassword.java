/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package umbrella.hospital.p04.ui;

import java.util.concurrent.*;
import javax.swing.JOptionPane;
import umbrella.hospital.p04.controller.UserManager;
import umbrella.hospital.p04.login.SendEmail;
import umbrella.hospital.p04.model.Doctor;
import umbrella.hospital.p04.model.Patient;

/**
 *
 * @author Admin
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterface
     */
    private Doctor doctor = null;
    private Patient patient = null;
    private boolean isBtnSendEnabled = true;
    private static final int BUTTON_COOLDOWN = 60;

    public ForgotPassword() {
        //setUndecorated(true);
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

        jPanel1 = new javax.swing.JPanel();
        ForgotPassword = new umbrella.hospital.p04.ui.PanelRound();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        chkShow = new javax.swing.JCheckBox();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpwPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 244, 249));
        jPanel1.setMaximumSize(new java.awt.Dimension(577, 426));

        ForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        ForgotPassword.setRoundBottomLeft(40);
        ForgotPassword.setRoundBottomRight(40);
        ForgotPassword.setRoundTopLeft(40);
        ForgotPassword.setRoundTopRight(40);

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("New Password:");

        chkShow.setBackground(new java.awt.Color(255, 255, 255));
        chkShow.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        chkShow.setText("Show Password");
        chkShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(11, 87, 208));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\Logo.png")); // NOI18N
        jLabel5.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Account Recovery");

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\CSE305\\P04SoftwareEngineering\\src\\main\\icons\\Online doctor and medical services.png")); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Your health is our goal");

        jpwPassword.setBackground(new java.awt.Color(255, 255, 255));
        jpwPassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jpwPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwPasswordActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblCode.setForeground(new java.awt.Color(0, 0, 0));
        lblCode.setText("Verification Code:");

        txtCode.setBackground(new java.awt.Color(255, 255, 255));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(11, 87, 208));
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ForgotPasswordLayout = new javax.swing.GroupLayout(ForgotPassword);
        ForgotPassword.setLayout(ForgotPasswordLayout);
        ForgotPasswordLayout.setHorizontalGroup(
            ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForgotPasswordLayout.createSequentialGroup()
                .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ForgotPasswordLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkShow))
                    .addGroup(ForgotPasswordLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForgotPasswordLayout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirm))
                            .addComponent(jpwPassword)
                            .addComponent(txtEmail)
                            .addComponent(lblCode)
                            .addGroup(ForgotPasswordLayout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPassword))))
                .addGap(74, 74, 74))
        );
        ForgotPasswordLayout.setVerticalGroup(
            ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ForgotPasswordLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkShow)
                        .addGap(30, 30, 30)
                        .addGroup(ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirm)
                            .addComponent(btnBack)))
                    .addGroup(ForgotPasswordLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(ForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String code = txtCode.getText();
        String password = String.valueOf(jpwPassword.getPassword());

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in email", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in code", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in password", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (doctor == null && patient == null) {
            doctor = UserManager.findDoctorByEmail(email);
            patient = UserManager.findPatientByEmail(email);

        }
        String verification;
        if (doctor != null) {
            verification = doctor.getCode();
        } else {
            assert patient != null;
            verification = patient.getCode();
        }
        if (verification == null) {
            JOptionPane.showMessageDialog(this, "Wrong verification code", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (verification == null) {
            JOptionPane.showMessageDialog(this, "Wrong email code", "Message", JOptionPane.ERROR_MESSAGE);
        } else {
            if (code.equals(verification)) {
                UserManager.changePassword(email, password);
                LoginInterface login = new LoginInterface();
                this.dispose();
                login.setVisible(true);
            } else {
                JOptionPane.showConfirmDialog(this, "Wrong verification code", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnConfirmActionPerformed

    private void chkShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowActionPerformed
        // TODO add your handling code here:
        if (chkShow.isSelected()) {
            jpwPassword.setEchoChar((char) 0);
        } else {
            jpwPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chkShowActionPerformed

    private void jpwPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwPasswordActionPerformed
        // TODO add your handling code here:
        btnConfirm.doClick();
    }//GEN-LAST:event_jpwPasswordActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        jpwPassword.requestFocusInWindow();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        LoginInterface login = new LoginInterface();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        if (isBtnSendEnabled) {
            String emailId = txtEmail.getText();

            SendEmail sm = new SendEmail();
            String code = sm.getRandom();
            doctor = UserManager.findDoctorByEmail(emailId);
            patient = UserManager.findPatientByEmail(emailId);
            if (doctor != null) {
                doctor.setCode(code);
            } else {
                assert patient != null;
                patient.setCode(code);
            }
            sm.sendEmail(doctor, patient);

            isBtnSendEnabled = false;
            ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
            scheduler.schedule(() -> {
                isBtnSendEnabled = true;
            }, BUTTON_COOLDOWN, TimeUnit.SECONDS);
        } else {
            
            JOptionPane.showMessageDialog(this, "Please wait 1 minute");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jpwPassword.requestFocusInWindow();
    }

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private umbrella.hospital.p04.ui.PanelRound ForgotPassword;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chkShow;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpwPassword;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package umbrella.hospital.p04.ui;

import umbrella.hospital.p04.controller.UserManager;

import javax.swing.*;
import java.util.Objects;

import umbrella.hospital.p04.model.Doctor;
import umbrella.hospital.p04.model.Patient;

/**
 *
 * @author Admin
 */
public class LoginInterface extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterface
     */
    public LoginInterface() {
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
        Signin = new umbrella.hospital.p04.ui.PanelRound();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        chkShow = new javax.swing.JCheckBox();
        lblForgotPassword = new javax.swing.JLabel();
        btnSignin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        popupExample1 = new umbrella.hospital.p04.ui.PopupExample();
        jpwPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 244, 249));
        jPanel1.setMaximumSize(new java.awt.Dimension(577, 426));

        Signin.setBackground(new java.awt.Color(255, 255, 255));
        Signin.setRoundBottomLeft(40);
        Signin.setRoundBottomRight(40);
        Signin.setRoundTopLeft(40);
        Signin.setRoundTopRight(40);

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Email:");

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password:");

        chkShow.setBackground(new java.awt.Color(255, 255, 255));
        chkShow.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        chkShow.setText("Show Password");
        chkShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowActionPerformed(evt);
            }
        });

        lblForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblForgotPassword.setForeground(new java.awt.Color(0, 0, 255));
        lblForgotPassword.setText("Forgot your password?");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
        });

        btnSignin.setBackground(new java.awt.Color(11, 87, 208));
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign in");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        jLabel5.setToolTipText("");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sign In");

        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Your health is our goal");

        popupExample1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout SigninLayout = new javax.swing.GroupLayout(Signin);
        Signin.setLayout(SigninLayout);
        SigninLayout.setHorizontalGroup(
            SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SigninLayout.createSequentialGroup()
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SigninLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkShow))
                    .addGroup(SigninLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SigninLayout.createSequentialGroup()
                                .addComponent(popupExample1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSignin))
                            .addComponent(lblForgotPassword)
                            .addComponent(jpwPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtEmail))))
                .addGap(74, 74, 74))
        );
        SigninLayout.setVerticalGroup(
            SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SigninLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblForgotPassword)
                .addGap(32, 32, 32)
                .addGroup(SigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignin)
                    .addComponent(popupExample1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SigninLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Signin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(Signin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String password = String.valueOf(jpwPassword.getPassword());

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in Username");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in Password");
        } else if (Objects.equals(UserManager.login(email, password), "Patient")) {
            PatientMainInterface patientmf = new PatientMainInterface();
            //this.setVisible(false);
            patientmf.setVisible(true);
            Patient pt = UserManager.findPatientByEmail(email);
            //Doctor dt = UserManager.findDoctorByEmail(pt.getAssignedDoctorEmail());
            javax.swing.JLabel lblPatientName = patientmf.lblPatientName;
            assert pt != null;
            lblPatientName.setText(pt.getName());
            javax.swing.JLabel lblDoctorName = patientmf.lblNameDoctor;
            lblDoctorName.setText(pt.getAssignedDoctor().getName());
            patientmf.setPatient(pt);
            pt.setSensorMachineSimulation(patientmf.ssMc);
            patientmf.startSensorMachineSimulation();
        } else if (Objects.equals(UserManager.login(email, password), "Doctor")) {
            //this.setVisible(false);
            DoctorMainInterface doctormf = new DoctorMainInterface();
            doctormf.setVisible(true);
            Doctor dt = UserManager.findDoctorByEmail(email);
            Patient pt = UserManager.findPatientByEmail(dt.getAssignedPatient().getEmail());
            doctormf.setDoctor(dt);
            doctormf.lblDoctorName.setText(dt.getName());
            doctormf.lblPatient.setText(dt.getAssignedPatient().getName());
            doctormf.lblAddress.setText(dt.getAssignedPatient().getAddress());
            doctormf.ssMc = pt.getSensorMachineSimulation();
            doctormf.setDoctor(dt);
            doctormf.startSensorMachineSimulation();
//        } else if (Objects.equals(UserManager.login(email, password), "No Doctor")) {
//            JOptionPane.showMessageDialog(this, "No Doctor available", "Message", JOptionPane.ERROR_MESSAGE);
//        }
        } else {
            JOptionPane.showMessageDialog(this, "You have entered an invalid username or password", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSigninActionPerformed

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
        btnSignin.doClick();
    }//GEN-LAST:event_jpwPasswordActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        jpwPassword.requestFocusInWindow();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        // TODO add your handling code here:
        ForgotPassword forgot = new ForgotPassword();
        this.dispose();
        forgot.setVisible(true);
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private umbrella.hospital.p04.ui.PanelRound Signin;
    private javax.swing.JButton btnSignin;
    private javax.swing.JCheckBox chkShow;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpwPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblPassword;
    private umbrella.hospital.p04.ui.PopupExample popupExample1;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Doctor.Doctor;
import Pharmac.Pharmacy;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author haroon 
 */
public class Login extends javax.swing.JFrame {
     int attempt = 0 ;
    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel7 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jbtnexit = new javax.swing.JButton();
        jbtnlogin = new javax.swing.JButton();
        jbtncancel = new javax.swing.JButton();
        jbtnPharmacy = new javax.swing.JButton();
        jbtnPatient = new javax.swing.JButton();
        jbtnPayment = new javax.swing.JButton();
        jbtnGPAppointment = new javax.swing.JButton();
        jbtnPharmacyOffice = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 106, -1, 35));

        jtxtUsername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 106, 203, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 178, -1, 35));

        jpassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 210, 40));

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 120, 40));

        jbtnlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnlogin.setText("Login");
        jbtnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnloginActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 40));

        jbtncancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtncancel.setText("Cancel");
        jbtncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncancelActionPerformed(evt);
            }
        });
        jPanel1.add(jbtncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, 40));

        jbtnPharmacy.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPharmacy.setText("Pharmacy");
        jbtnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPharmacyActionPerformed(evt);
            }
        });

        jbtnPatient.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPatient.setText("Paitent");
        jbtnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPatientActionPerformed(evt);
            }
        });

        jbtnPayment.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPayment.setText("Payment");
        jbtnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPaymentActionPerformed(evt);
            }
        });

        jbtnGPAppointment.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnGPAppointment.setText("GPAppointment");
        jbtnGPAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGPAppointmentActionPerformed(evt);
            }
        });

        jbtnPharmacyOffice.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnPharmacyOffice.setText("Pharmacy Office");
        jbtnPharmacyOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPharmacyOfficeActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Pharmacy Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jbtnDoctor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDoctor.setText("Doctor");
        jbtnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnPharmacy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnGPAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnPharmacyOffice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnGPAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnPharmacyOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jbtnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jbtnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPatientActionPerformed
            Pharmacy iPharmacy = new Pharmacy();
        iPharmacy.setVisible(true); 
    }//GEN-LAST:event_jbtnPatientActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         jbtnDoctor.setEnabled(false);
         jbtnPharmacy.setEnabled(false);
         jbtnPatient.setEnabled(false);
         jbtnPayment.setEnabled(false);
         jbtnGPAppointment.setEnabled(false);
         jbtnPharmacyOffice.setEnabled(false);
         
         
                
    }//GEN-LAST:event_formWindowActivated

    private void jbtnPharmacyOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPharmacyOfficeActionPerformed
        Doctor iDoctor = new Doctor();
        iDoctor.setVisible(true);
    }//GEN-LAST:event_jbtnPharmacyOfficeActionPerformed
   private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Pharmacy Management System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
                System.exit(0);{
                    
                }
        
        
    }//GEN-LAST:event_jbtnexitActionPerformed
    }
    private void jbtncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancelActionPerformed
        jtxtUsername.setText("");
        jpassword.setText("");
    }//GEN-LAST:event_jbtncancelActionPerformed

    private void jbtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnloginActionPerformed
        String Username = jtxtUsername.getText();
        String password = jpassword.getText();
        
        if (Username.contains("one")&& (password.contains("one") )){
            jtxtUsername.setText("");
            jpassword.setText("");
            jbtnDoctor.setEnabled(true);
            jbtnPharmacy.setEnabled(true);
            jbtnPatient.setEnabled(true);
            jbtnPayment.setEnabled(true);
            jbtnGPAppointment.setEnabled(true);
            jbtnPharmacyOffice.setEnabled(true);
            
    }//GEN-LAST:event_jbtnloginActionPerformed
else if (!(Username.contains("one")&& (password.contains("one") )))
    {       
            jtxtUsername.setText("");
            jpassword.setText("");
            jbtnDoctor.setEnabled(false);
            jbtnPharmacy.setEnabled(false);
            jbtnPatient.setEnabled(false);
            jbtnPayment.setEnabled(false);
            jbtnGPAppointment.setEnabled(false);
            jbtnPharmacyOffice.setEnabled(false);
            
            attempt +=1 ;
            
            if (attempt == 3)
            {
                System.exit(0);
                
            }
        
    }
    }
    private void jbtnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPharmacyActionPerformed
        Pharmacy myPharmacy = new Pharmacy();
        myPharmacy.setVisible(true);
        
    }//GEN-LAST:event_jbtnPharmacyActionPerformed

    private void jbtnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDoctorActionPerformed
        Doctor iDoctor = new Doctor();
        iDoctor.setVisible(true);
    }//GEN-LAST:event_jbtnDoctorActionPerformed

    private void jbtnGPAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGPAppointmentActionPerformed
        Pharmacy iPharmacy = new Pharmacy();
        iPharmacy.setVisible(true); 
    }//GEN-LAST:event_jbtnGPAppointmentActionPerformed

    private void jbtnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaymentActionPerformed
        Doctor iDoctor = new Doctor();
        iDoctor.setVisible(true);
    }//GEN-LAST:event_jbtnPaymentActionPerformed
    
           
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnDoctor;
    private javax.swing.JButton jbtnGPAppointment;
    private javax.swing.JButton jbtnPatient;
    private javax.swing.JButton jbtnPayment;
    private javax.swing.JButton jbtnPharmacy;
    private javax.swing.JButton jbtnPharmacyOffice;
    private javax.swing.JButton jbtncancel;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnlogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables
}
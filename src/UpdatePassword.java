
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shreyash Haritashya
 */
public class UpdatePassword extends javax.swing.JFrame {

    /**
     * Creates new form UpdateRooms
     */
    public UpdatePassword() {
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
        AppIcon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        HomeButton1 = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        new_pass = new javax.swing.JPasswordField();
        HomeButton2 = new javax.swing.JButton();
        retype_pass = new javax.swing.JPasswordField();
        old_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(89, 95, 239));

        AppIcon.setBackground(new java.awt.Color(255, 255, 255));
        AppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AppIcon.jpg"))); // NOI18N
        AppIcon.setText("Image");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("The Hoteliers");

        HomeButton.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("New Password");
        HomeButton.setBorder(null);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setFocusPainted(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        HomeButton1.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton1.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton1.setText("Old Password");
        HomeButton1.setBorder(null);
        HomeButton1.setContentAreaFilled(false);
        HomeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton1.setFocusPainted(false);
        HomeButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton1ActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(87, 184, 148));
        SubmitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Update");
        SubmitButton.setBorder(null);
        SubmitButton.setBorderPainted(false);
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.setFocusPainted(false);
        SubmitButton.setOpaque(true);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        new_pass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        new_pass.setForeground(new java.awt.Color(112, 112, 112));
        new_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        new_pass.setBorder(null);
        new_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passActionPerformed(evt);
            }
        });

        HomeButton2.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton2.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton2.setText("Re-Type New Password");
        HomeButton2.setBorder(null);
        HomeButton2.setContentAreaFilled(false);
        HomeButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton2.setFocusPainted(false);
        HomeButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton2ActionPerformed(evt);
            }
        });

        retype_pass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        retype_pass.setForeground(new java.awt.Color(112, 112, 112));
        retype_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        retype_pass.setBorder(null);
        retype_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retype_passActionPerformed(evt);
            }
        });

        old_pass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        old_pass.setForeground(new java.awt.Color(112, 112, 112));
        old_pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        old_pass.setBorder(null);
        old_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retype_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(HomeButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(HomeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(HomeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(HomeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(retype_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButton1ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        
        SubmitButton.setBorderPainted( false );
        String old_pass_st = old_pass.getText();
        String new_pass_st = new_pass.getText();
        String retype_pass_st = retype_pass.getText();
        if(new_pass_st.equals(retype_pass_st)){
           try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String q = "select emp_id from logged_in_hotel_id where emp_id is not null";
            ResultSet rs1 = st.executeQuery(q);
            if(rs1.next()){
                q = "select emp_pass from employee where emp_id = '"+ rs1.getString("emp_id") +"'";
                ResultSet rs2 = st.executeQuery(q);
                if(rs2.next()){
                    if(rs2.getString("emp_pass").equals(old_pass_st)){
                        q = "update employee set emp_pass = '"+ new_pass_st +"'";
                            int rs3 = st.executeUpdate(q);
                             JOptionPane.showMessageDialog(null, "Created Customer Successfully");
                             UpdatePassword.this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Old Password!");
                    }
                }
            }
        } catch(Exception e) {
                System.out.print(e);
            } 
    } else {
            JOptionPane.showMessageDialog(null, "Please Enter the same password in retype password field!");
        }
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void new_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passActionPerformed

    private void HomeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeButton2ActionPerformed

    private void retype_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retype_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retype_passActionPerformed

    private void old_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_old_passActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIcon;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton HomeButton1;
    private javax.swing.JButton HomeButton2;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPasswordField old_pass;
    private javax.swing.JPasswordField retype_pass;
    // End of variables declaration//GEN-END:variables
}

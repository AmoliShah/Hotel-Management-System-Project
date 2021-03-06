/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.database.management;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Amoli Shah
 */
public class SignUpPage extends javax.swing.JFrame {
    private String UserName;
    private String Password;
    private String Emailid;

    /**
     * Creates new form SignUpPage
     */
    public SignUpPage() {
        initComponents();
        this.getContentPane().setBackground(Color.PINK);
        PWTxt.setText("");
        PWTxt.setEchoChar('*');
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
        UNLbl = new javax.swing.JLabel();
        PWLbl = new javax.swing.JLabel();
        EIDLbl = new javax.swing.JLabel();
        UNTxt = new javax.swing.JTextField();
        EIDTxt = new javax.swing.JTextField();
        CrtAccBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PWTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("PLEASE ENTER YOUR DETAILS");

        UNLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UNLbl.setForeground(new java.awt.Color(0, 51, 204));
        UNLbl.setText("USERNAME");

        PWLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PWLbl.setForeground(new java.awt.Color(0, 51, 204));
        PWLbl.setText("PASSWORD");

        EIDLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EIDLbl.setForeground(new java.awt.Color(0, 51, 204));
        EIDLbl.setText("EMAIL ID");

        UNTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNTxtActionPerformed(evt);
            }
        });

        EIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDTxtActionPerformed(evt);
            }
        });

        CrtAccBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CrtAccBtn.setForeground(new java.awt.Color(0, 51, 204));
        CrtAccBtn.setText("CREATE ACCOUNT");
        CrtAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrtAccBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PWTxt.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UNLbl)
                                    .addComponent(PWLbl)
                                    .addComponent(EIDLbl))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EIDTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(UNTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(PWTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(CrtAccBtn)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(42, 42, 42)
                        .addComponent(UNLbl))
                    .addComponent(UNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PWLbl)
                    .addComponent(PWTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EIDLbl)
                    .addComponent(EIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(CrtAccBtn)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UNTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNTxtActionPerformed
        UserName = UNTxt.getText();
    }//GEN-LAST:event_UNTxtActionPerformed

    private void EIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDTxtActionPerformed
       Emailid = EIDTxt.getText();
    }//GEN-LAST:event_EIDTxtActionPerformed

    private void CrtAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrtAccBtnActionPerformed
  try {
            // TODO add your handling code here:
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Example1", "root" , "Pranav Mistry");
            
            // 2. Create a statement
            Statement myStmt = myConn.createStatement();
        //    myStmt.executeUpdate("delete from Credentials");
     /* ResultSet myRs = myStmt.executeQuery("select * from credentials");
			// 4. Process the result set
			while (myRs.next()) {
                            
				System.out.println(myRs.getString("UserName") + ", " + myRs.getString("Password") + "," + myRs.getString("EmailID"));
			}*/
          UserName = UNTxt.getText();
           Password = Arrays.toString(PWTxt.getPassword());
           Emailid = EIDTxt.getText();
           if("".equals(UserName) || "".equals(Password) || "".equals(Emailid))
               JOptionPane.showMessageDialog(null,"Fill Up All Details","ERROR",JOptionPane.ERROR_MESSAGE);
           else
           {
                
                    //   myStmt.executeUpdate("alter table Credentials add SR_NO int auto_increment unique FIRST");
                    myStmt.executeUpdate("insert into Credentials (UserName,Password,EmailID) Values('"+UserName+"','"+Password+"','"+Emailid+"')");
                
         /*   ResultSet myRs = myStmt.executeQuery("select * from Credentials");
        ResultSetMetaData rsmd = myRs.getMetaData();
            String i = rsmd.getColumnName(1);
              System.out.println(i);*/
			// 4. Process the result set
	JOptionPane.showMessageDialog(null,"Welcome to Hotel Ramada");
           WelcomePage wp1 = new WelcomePage();
           wp1.setVisible(true);}
          // myStmt.executeUpdate("ALTER TABLE Credentials MODIFY CheckOut datetime NOT NULL");
  }
   catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_CrtAccBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginPage p = new LoginPage();
        p.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrtAccBtn;
    private javax.swing.JLabel EIDLbl;
    private javax.swing.JTextField EIDTxt;
    private javax.swing.JLabel PWLbl;
    private javax.swing.JPasswordField PWTxt;
    private javax.swing.JLabel UNLbl;
    private javax.swing.JTextField UNTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

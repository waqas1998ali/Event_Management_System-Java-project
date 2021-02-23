/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_system;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Login_Frame extends javax.swing.JFrame {

  
   Connection con;
   ResultSet rs;
   Statement st;
   PreparedStatement ps;
    
    
            
    public Login_Frame() {
        initComponents();
        try{
         con = DriverManager.getConnection("jdbc:odbc:bridge","sa","123");
         st=con.createStatement();
        }
        catch(Exception e){
            System.out.println(""+e);
        }
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncencel = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        p2 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Management System");
        setBackground(new java.awt.Color(0, 51, 255));
        setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("       Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("    Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("         Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 30));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 70, 40));

        btnsave.setBackground(new java.awt.Color(153, 0, 153));
        btnsave.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("SIGN_UP");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 100, 40));

        btncencel.setBackground(new java.awt.Color(153, 0, 153));
        btncencel.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        btncencel.setForeground(new java.awt.Color(255, 255, 255));
        btncencel.setText("SIGN_IN");
        btncencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncencelActionPerformed(evt);
            }
        });
        getContentPane().add(btncencel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 100, 40));

        name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 310, 30));

        age.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 310, 30));

        email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 310, 30));

        p2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 310, 30));

        p1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 310, 30));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Pass");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 30));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setText("User Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        username.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 310, 30));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign Up");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -110, 2290, 1140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 530, 50));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-549)/2, (screenSize.height-539)/2, 549, 539);
    }// </editor-fold>//GEN-END:initComponents

    public boolean validate(String pattern,String matcher)
    {
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(matcher);
        
        if(m.matches())
        {
        return true;
        }
        else
        {
        return false;
        }
        
    
    }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if(name.getText().equals("")||username.getText().equals("")||p1.getPassword().equals("")||p2.getPassword().equals("")||age.getText().equals("")||email.getText().equals(""))
        {
        JOptionPane.showMessageDialog(this, "fill the required fields");
        }
        
        else{  
        
        if (evt.getSource() == btnsave)
         {
           
            String s1 = name.getText();
            char[] s3 = p1.getPassword();

            char[] s4 = p2.getPassword();
            
            String s8 = new String(s3);

            String s9 = new String(s4);
            
            String s11= username.getText();
            
            String s2 = age.getText();

            String s6 = email.getText();
 
                       if(!validate("[A-Za-z ]{3,50}",name.getText()))
                         {
          
                           JOptionPane.showMessageDialog(this, "Name is invalid...!!!");     
                             
                         }
                       else if(!validate("[A-Za-z0-9_.-]{3,50}[@]{1}[a-z]{3,15}[.]{1}[a-z]{2,3}",email.getText()))
                       {
                           JOptionPane.showMessageDialog(this, "Invalid Email Address...!!!");     
                       
                       
                       }
                       else
                       {
                            
             
       
            if (s8.equals(s9))
           {

                try
               {
                    PreparedStatement ps = con.prepareStatement("insert into Userid values(?,?,?,?,?)");
                    ps.setString(1,s1);
                    ps.setString(2,s11);
                    ps.setString(3, s8);
                    ps.setString(4, s2);
                    ps.setString(5,s6);
                    
                    int r = ps.executeUpdate();
                    if (r  > 0)
                    {
                        JOptionPane.showMessageDialog(this, "Data Save Susssfully...");
                        dispose();
                        Login_Frame1 L =new Login_Frame1();
                        L.setVisible(true);
                    }
                    
                }
          catch (Exception ex)
                {

                    System.out.println(ex);

                }
            
           }

            name.setText("");

            p1.setText("");

            p2.setText("");

            age.setText("");

            email.setText("");


            }
            
        }
//            

        
                        
     }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncencelActionPerformed
         dispose();
        Login_Frame1 b = new Login_Frame1();
        b.setVisible(true);
                            
    }//GEN-LAST:event_btncencelActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton btncencel;
    private javax.swing.JButton btnsave;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}


package event_management_system;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Events_Frame extends javax.swing.JFrame {
    
    
    
    
   Connection con;
   ResultSet rs;
   Statement st;
   PreparedStatement ps;
   DefaultTableModel dtm = new DefaultTableModel();
   public static String a;
   public static String b;


    
   public void load()
   {
          try {
            
            while(jt.getRowCount()>0)
            {
                dtm.removeRow(0);
            }
            
            rs=st.executeQuery("select * from events");
            
            while(rs.next())
            {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                
            }
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
   }
   
    public Events_Frame() {
        
        initComponents();
        SqlConnection();
      
//        System.out.println(Login_Frame1.uid);
        new use().start();
       
         try{
         
        
         
         dtm.addColumn("Event Id");
         dtm.addColumn("Event Date");
         dtm.addColumn("Event Time");
         dtm.addColumn("Event Title");
         dtm.addColumn("Event Description");
         dtm.addColumn("Event Color");
        jt.setModel(dtm); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            
            // alaram coding
            
        }
    }
    public void SqlConnection()
    {
     try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              
           con = DriverManager.getConnection("jdbc:odbc:bridge","sa","123");
           st=con.createStatement();
         
           
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, ""+e);
        } 
    }
    
     class use extends Thread
           {
        @Override
         public void run()
         {
       while(true)
       {
            try {
                Thread.sleep(5000);
            Date date=new Date();
            
            SimpleDateFormat cdate=new SimpleDateFormat("M/dd/yyyy");
            SimpleDateFormat time=new SimpleDateFormat("hh:mm:a");
         
             String cudate=cdate.format(date).toString();
            String cutime =time.format(date).toString();
            
            
            Pattern p=Pattern.compile(" ");
            String[] ui=p.split(cutime);
            System.out.println(ui[0]+","+cudate);
            
            
           rs= st.executeQuery("select Ev_Date,Ev_Time from Events where Ev_Date='"+cudate+"' and Ev_Time='"+ui[0]+"'");
        System.out.println("run");
           while(rs.next())
         {
            a=cudate;
            b=ui[0];
            Alarm_Form2 d = new Alarm_Form2();
            d.setVisible(true);
         }
         
          
         
        } catch (Exception e1) {
            
            e1.getStackTrace();
        }
       }   
         }
       
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jcolor = new javax.swing.JColorChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        viewE = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        txtdesc = new javax.swing.JTextField();
        txtid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txttitle = new javax.swing.JTextField();
        cmb1 = new javax.swing.JComboBox();
        cmb2 = new javax.swing.JComboBox();
        cmb3 = new javax.swing.JComboBox();
        cmbt1 = new javax.swing.JComboBox();
        cmbt2 = new javax.swing.JComboBox();
        cmbt3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Events Details");

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setText("Event Date :-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 166, 84, 26);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setText("Event Time :- ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 198, 90, 26);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setText("Event Title  :-");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 230, 100, 17);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel2.setText("Event Description:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 260, 120, 26);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel4.setText("Event Color :-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 292, 100, 26);

        submit.setBackground(new java.awt.Color(153, 0, 153));
        submit.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(10, 356, 100, 40);

        jt.setBackground(new java.awt.Color(153, 0, 153));
        jt.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jt.setForeground(new java.awt.Color(255, 255, 255));
        jt.setModel(new javax.swing.table.DefaultTableModel(
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
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 402, 565, 258);

        btnupdate.setBackground(new java.awt.Color(153, 0, 153));
        btnupdate.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);
        btnupdate.setBounds(280, 356, 100, 40);

        viewE.setBackground(new java.awt.Color(153, 0, 153));
        viewE.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        viewE.setForeground(new java.awt.Color(255, 255, 255));
        viewE.setText("View");
        viewE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewEMouseClicked(evt);
            }
        });
        viewE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEActionPerformed(evt);
            }
        });
        jPanel1.add(viewE);
        viewE.setBounds(420, 356, 100, 40);

        btndel.setBackground(new java.awt.Color(153, 0, 153));
        btndel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setText("Delete");
        btndel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndelMouseClicked(evt);
            }
        });
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel);
        btndel.setBounds(148, 356, 100, 40);

        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });
        jPanel1.add(txtdesc);
        txtdesc.setBounds(130, 260, 340, 26);
        jPanel1.add(txtid);
        txtid.setBounds(0, 114, 14, 23);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Choose Color");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 290, 340, 23);
        jPanel1.add(txttitle);
        txttitle.setBounds(130, 230, 340, 26);

        cmb1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmb1);
        cmb1.setBounds(162, 171, 58, 20);

        cmb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmb2);
        cmb2.setBounds(281, 171, 55, 20);

        cmb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel1.add(cmb3);
        cmb3.setBounds(390, 170, 72, 20);

        cmbt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbt1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbt1);
        cmbt1.setBounds(162, 203, 58, 20);

        cmbt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", " ", " " }));
        jPanel1.add(cmbt2);
        cmbt2.setBounds(281, 203, 55, 20);

        cmbt3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        jPanel1.add(cmbt3);
        cmbt3.setBounds(390, 200, 70, 20);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel6.setText("Month");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(112, 173, 40, 16);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel7.setText("Day");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 170, 40, 17);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel8.setText("Year");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(346, 173, 40, 17);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel9.setText("Hours");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(112, 205, 40, 14);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel10.setText("Minute");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(224, 205, 47, 17);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("    Create Your Events");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 565, 40);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        Home.setBackground(new java.awt.Color(153, 0, 153));
        Home.setFont(new java.awt.Font("Trajan Pro", 0, 16)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("HOME");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(153, 0, 153));
        logout.setFont(new java.awt.Font("Trajan Pro", 0, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOG_OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(logout))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 50, 565, 40);

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 100, 540, 20);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(60, 130, 440, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-580)/2, (screenSize.height-655)/2, 580, 655);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Login_Frame1 L = new Login_Frame1();
        L.setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        dispose();
        Upcoming_Event u = new Upcoming_Event();
        u.setVisible(true);

    }//GEN-LAST:event_HomeActionPerformed

    private void cmbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbt1ActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Color color = JColorChooser.showDialog(this,"Color Chooser" ,Color.red );
        String scolor = color.toString();
//        jButton1.setBackground(color);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed

    private void btndelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndelMouseClicked

        int row = jt.getSelectedRow();
        String id =jt.getValueAt(row,0).toString();
        try {
            int result =  st.executeUpdate("delete from Events where Ev_id="+id+"");
            if (result > 0) {
                JOptionPane.showMessageDialog(this,"deleted");
            }
        } catch (Exception e) {

        }
        load();

    }//GEN-LAST:event_btndelMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            String sTime = cmbt1.getSelectedItem()+":"+cmbt2.getSelectedItem() +":"+cmbt3.getSelectedItem();
            String sDate = cmb1.getSelectedItem()+"/"+cmb2.getSelectedItem() +"/"+cmb3.getSelectedItem();

            int result= st.executeUpdate("update Events set Ev_Title='"+txttitle.getText()+"', Ev_Description='"+txtdesc.getText()+"',Ev_Time='"+sTime+"',Ev_Date='"+sDate+"'  where Ev_id='"+idd+"';");

            if(result>0)
            {
                JOptionPane.showMessageDialog(this,"Record has been updated");
                int count=jt.getRowCount();
                for (int i = 0; i < count; i++) {
                    dtm.removeRow(0);
                }
                try {
                  rs=st.executeQuery("select * from Events where uid='"+Login_Frame1.uid+"'");

                    while(rs.next())
                    {
                        dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                    }

                } catch (Exception e) {
                     JOptionPane.showMessageDialog(this,e.toString());
                }

            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
load();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
//      int row = jt.getSelectedRow();
//        String id =jt.getValueAt(row,0).toString();
//        try {
//            
//        } catch (Exception e) {
//
//        }

    }//GEN-LAST:event_btnupdateMouseClicked

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked

        try
        {

            int index = jt.getSelectedRow();

            String tt[] = jt.getValueAt(index, 2).toString().split(":");

            cmbt1.setSelectedItem(tt[0]);
            cmbt2.setSelectedItem(tt[1]);
            cmbt3.setSelectedItem(tt[2]);

            String date11[] = jt.getValueAt(index, 1).toString().split("/");

            cmb1.setSelectedItem(date11[0]);
            cmb2.setSelectedItem(date11[1]);
            cmb3.setSelectedItem(date11[2]);

            String sd = jt.getValueAt(index, 0).toString().trim();

            idd = Integer.parseInt(sd);

            String title = jt.getValueAt(index, 3).toString().trim();
            String descrp = jt.getValueAt(index, 4).toString().trim();
            txttitle.setText(title);
            txtdesc.setText(descrp);

            //        dateChooser123.setDateFormat(dte);
            //        txttitle.setText(title);
            //        txtdesc.setText(descrp);

            //        System.out.println(dte.toString());
            //        System.out.println(title);
            //        System.out.println(descrp);
            //        System.out.println(mdl.toString());
            //        jSpinner1.setValue();
            //
            //
            //
            //         Get the selected row from the table.
            //          int selectedRow = jt.getSelectedRow();
            //          String setToTextField = new String();
            //          for(int i = 0; i < jt.getColumnCount(); i++) {
                //              setToTextField += jt.getValueAt(selectedRow, i) + "  ";
                //          }
            //           Finally set this to your JTextField.
            //        txtid.setText(jt.getValueAt(selectedRow, 0)+"".trim());
            //        txtdate.setText(jt.getValueAt(selectedRow, 1)+"".trim());
            //        txttime.setText(jt.getValueAt(selectedRow, 2)+"".trim());
            //                txttitle.setText(jt.getValueAt(selectedRow, 3)+"".trim());
            //        txtdesc.setText(jt.getValueAt(selectedRow, 4)+"".trim());
            //        txtcolor.setText(jt.getValueAt(selectedRow, 6)+"".trim());
            //
            //        int index = jt.getSelectedRow();
            //        System.out.println(""+index);
            //        rs.absolute(index+1);
            //        evId =Integer.parseInt(jt.getValueAt(index,0).toString());
            //        rs=st.executeQuery("select * from Events where Ev_id = "+evId+"");
            //
            //         int index=jt.getSelectedRow();
            //
            //         txtid.setText("");
            //
            //        txtdate.setText(rs.getString(2));
            //        txttime.setText(rs.getString(3));
            //    txtdesc.setText(rs.getString(5));
            //txtcolor.setText(rs.getString(6));
            //txttitle.setText(rs.getString(4));

            //

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
            e.printStackTrace();
        }

    }//GEN-LAST:event_jtMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
                    int x = 0;

                    String s2=cmbt1.getSelectedItem()+ ":" + cmbt2.getSelectedItem() +":" +cmbt3.getSelectedItem();

                    String s1=cmb1.getSelectedItem()+ "/" + cmb2.getSelectedItem() +"/" +cmb3.getSelectedItem();

                    String s3 =  txttitle.getText();

                    String s4 =  txtdesc.getText();

                    try {
                        con = DriverManager.getConnection("jdbc:odbc:bridge","sa","123");
                        PreparedStatement ps = con.prepareStatement("insert into Events (Ev_Date,Ev_Time,Ev_Title,Ev_Description,Ev_color,[uid])  values(?,?,?,?,?,?)");
                        ps.setString(1,s1);

                    ps.setString(2, s2);

                    ps.setString(3, s3);

                    ps.setString(4, s4);

                    ps.setString(5, scolor);

                    ps.setInt(6, Login_Frame1.uid);

                    int r = ps.executeUpdate();

                    //x++;
                    if (r  > 0)
                    {
                        JOptionPane.showMessageDialog(this, "Event Created...");

                    }

                    } catch (SQLException ex) {
                    ex.printStackTrace();
                    }

                   

    }//GEN-LAST:event_submitActionPerformed
    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
     
    }//GEN-LAST:event_submitMouseClicked

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
    // TODO add your handling code here
    }//GEN-LAST:event_btndelActionPerformed

    private void viewEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEMouseClicked
//        try {
////         int count=dtm.getRowCount();
////        for (int i = 0; i < count; i++) {
////                dtm.removeRow(0);
////        }
//////        jt.setModel(dtm);
//        
//          
//            rs=st.executeQuery("Select * from Events");
////            while(rs.next())
////                    {
////                  dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
////                    }
////           
//            
//        } catch (Exception e) {
//        JOptionPane.showMessageDialog(this, e);
//        }
       
    }//GEN-LAST:event_viewEMouseClicked

    private void viewEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEActionPerformed
     load();
    }//GEN-LAST:event_viewEActionPerformed
String sDate;
String stime;  
    
String id="";
int evId = 0;
String up_id=""; 
int idd;
 String scolor ="";    
    
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
            java.util.logging.Logger.getLogger(Events_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Events_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Events_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Events_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Events_Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JColorChooser Jcolor;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmb1;
    private javax.swing.JComboBox cmb2;
    private javax.swing.JComboBox cmb3;
    private javax.swing.JComboBox cmbt1;
    private javax.swing.JComboBox cmbt2;
    private javax.swing.JComboBox cmbt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JButton logout;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txttitle;
    private javax.swing.JButton viewE;
    // End of variables declaration//GEN-END:variables
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dta;

import static dta.Mainpage.loc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Login extends javax.swing.JFrame {

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
    String s11;
    String s22;
    String s33;
    String loc1;
    String des1;
    String bus;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tbn = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Generate = new javax.swing.JButton();
        tpkp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ttd = new javax.swing.JTextField();
        locbox = new javax.swing.JComboBox();
        desbox = new javax.swing.JComboBox();
        Update_database = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        MP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Administration Panel", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 0, 36), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 600));

        tbn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel1.setText("Location");

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel2.setText("Destinition");

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel3.setText("Bus Name");

        Generate.setBackground(new java.awt.Color(0, 102, 255));
        Generate.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        Generate.setText("Generate Data");
        Generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        tpkp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tpkp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpkpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel4.setText("Per Kilo Price");

        jButton3.setBackground(new java.awt.Color(255, 102, 204));
        jButton3.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jButton3.setText("Admin Page");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton4.setText("Exit");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cp.setBackground(new java.awt.Color(102, 0, 102));
        cp.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        cp.setText("Change Price");
        cp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel7.setText("Total Distance");

        ttd.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        locbox.setBackground(new java.awt.Color(102, 102, 255));
        locbox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        locbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Location", "Azimpur", "Badda", "Banani", "Dhanmondi", "Elephant Road", "Farmgate", "Gulisthan", "Gulshan", "Jatrabari", "Komlapur", "Malibagh", "Mirpur", "Mohakhali", "Motijheel", "Uttara" }));

        desbox.setBackground(new java.awt.Color(102, 255, 102));
        desbox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        desbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Destination", "Azimpur", "Badda", "Banani", "Dhanmondi", "Elephant Road", "Farmgate", "Gulisthan", "Gulshan", "Jatrabari", "Komlapur", "Malibagh", "Mirpur", "Mohakhali", "Motijheel", "Uttara" }));

        Update_database.setBackground(new java.awt.Color(0, 153, 102));
        Update_database.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        Update_database.setText("Update Database");
        Update_database.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_databaseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel5.setText("Database Code");

        output.setEditable(false);
        output.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        MP.setBackground(new java.awt.Color(235, 239, 240));
        MP.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        MP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MP.setLabel("Main Page");
        MP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tpkp, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(desbox, 0, 201, Short.MAX_VALUE)
                            .addComponent(locbox, 0, 201, Short.MAX_VALUE)
                            .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(tbn, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(ttd, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MP, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Update_database, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(output))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cp)
                        .addGap(170, 170, 170))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locbox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desbox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_database, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpkp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Admin ob3=new Admin();
        ob3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
        String price=tpkp.getText();    
        String id="101";          
        
    
        try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con =DriverManager.getConnection("jdbc:odbc:datafile");
        Statement st = con.createStatement();
        PreparedStatement st1 = con.prepareStatement("UPDATE bus SET price = ? WHERE id = ?");
        st1.setString(1, price);
        st1.setString(2, id);
        int i=st1.executeUpdate();
        
        if(i>0)
            output.setText("Price Updated");
            }      
        catch(Exception e){
             //System.out.print(e);
             output.setText("ERROR");
             e.printStackTrace();
    }
    }//GEN-LAST:event_cpActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // TODO add your handling code here:
    
        loc1=(String) locbox.getSelectedItem();
        des1=(String) desbox.getSelectedItem();
        
             try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             String name=(String) locbox.getSelectedItem();
             st.executeQuery("SELECT * FROM code where name='"+name+"' ");
             ResultSet rset = st.getResultSet();
             
            while(rset.next())
            {
             
                s11=rset.getString("id");
             
            }

}
     catch(Exception e){           
           System.out.println(e);
           output.setText("Exception Occured");
           
                    
    }
             try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             String name=(String) desbox.getSelectedItem();
             st.executeQuery("SELECT * FROM code where name='"+name+"' ");
             ResultSet rset = st.getResultSet();
             
            while(rset.next())
            {
                s22=rset.getString("id"); 
               
            }

}
     catch(Exception e){           
           System.out.println(e);
           output.setText("Exception Occured");
           
                    
    }
        
        s33=s11+s22;
        t3.setText(s33);
        //tpkp.setText(Spage.fareRate+"tk");
             
        try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
            
            
             Statement st=con.createStatement();
             bus=s33;
             
             st.executeQuery("SELECT * FROM bus where id='"+bus+"' ");
             ResultSet rset = st.getResultSet();
            
            while(rset.next())
            {
                
                bus=rset.getString("bus");
                String km=rset.getString("km");
               
                tbn.setText(bus);
                ttd.setText(km);
            }
           

}
     catch(Exception e){           
           System.out.println(e);
           output.setText("Exception Occured");
           
                    
    }
        try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             String id="101";
             st.executeQuery("SELECT * FROM bus where id='"+id+"' ");
             ResultSet rset = st.getResultSet();
             String price;
            while(rset.next())
            {
             
                price=rset.getString("price");
                //System.out.println(s1);
                tpkp.setText(price);
             //   jTextField3.setText(rset.getString("address"));
            }

}
     catch(Exception e){           
           System.out.println(e); 
           
                    
    }
        output.setText("Data Generated");
     
    }//GEN-LAST:event_GenerateActionPerformed

    private void tpkpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpkpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpkpActionPerformed

    private void Update_databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_databaseActionPerformed
        // TODO add your handling code here:
        String id1=t3.getText();    
        String bus1=tbn.getText();          
        String km1=ttd.getText();
    
        try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con =DriverManager.getConnection("jdbc:odbc:datafile");
        Statement st = con.createStatement();
        PreparedStatement st1 = con.prepareStatement("UPDATE bus SET bus = ?, km = ? WHERE id = ?");
        st1.setString(1, bus1);
        st1.setString(2, km1);
        st1.setString(3, id1);
        int i=st1.executeUpdate();
        
        if(i>0)
            output.setText("Database Updated");
            }      
        catch(Exception e){
             System.out.print(e);
             output.setText("ERROR");
             e.printStackTrace();
    }
        
        
    }//GEN-LAST:event_Update_databaseActionPerformed

    private void MPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPActionPerformed
        // TODO add your handling code here:
        Front mp=new Front();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MPActionPerformed

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
    private javax.swing.JButton Generate;
    private javax.swing.JButton MP;
    private javax.swing.JButton Update_database;
    private javax.swing.JButton cp;
    private javax.swing.JComboBox desbox;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox locbox;
    private javax.swing.JTextField output;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField tbn;
    private javax.swing.JTextField tpkp;
    private javax.swing.JTextField ttd;
    // End of variables declaration//GEN-END:variables
}

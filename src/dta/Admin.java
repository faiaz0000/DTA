/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dta;


public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1069, 630));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Admin Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 36))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        t1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(512, 212, 189, 31);

        t2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(512, 286, 189, 30);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel1.setText("    Admin Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(262, 211, 142, 31);

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(297, 288, 144, 26);

        jButton1.setBackground(new java.awt.Color(238, 234, 234));
        jButton1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setLabel("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(512, 379, 189, 33);

        jButton2.setBackground(new java.awt.Color(236, 230, 230));
        jButton2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(7, 7, 7));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setLabel("Main Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(297, 469, 164, 33);

        jButton3.setBackground(new java.awt.Color(238, 229, 229));
        jButton3.setFont(new java.awt.Font("BankGothic Lt BT", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(5, 5, 5));
        jButton3.setText("Exit");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(512, 469, 189, 33);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dta/background.jpg"))); // NOI18N
        jPanel1.add(back);
        back.setBounds(130, -40, 1069, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Front mp=new Front();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String n1="faiaz";
        String p1="12345";
        String n2="papin";
        String p2="12345";
        String n3="rabby";
        String p3="12345";
        String name=t1.getText();
        String pass=t2.getText();
        boolean b1;
        boolean b2;
        b1=name.equals(n1);
        b2=pass.equals(p1);
        if(b1){
            if(b2){
                Login l1=new Login();
                this.setVisible(false);
                l1.setVisible(true);
            }
        }
        b1=name.equals(n2);
        b2=pass.equals(p2);
        if(b1){
            if(b2){
                Login l1=new Login();
                this.setVisible(false);
                l1.setVisible(true);
            }
        }
        b1=name.equals(n3);
        b2=pass.equals(p3);
        if(b1){
            if(b2){
                Login l1=new Login();
                this.setVisible(false);
                l1.setVisible(true);
            }
        }
        t1.setText("Wrong username or password");
        t2.setText("");
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}

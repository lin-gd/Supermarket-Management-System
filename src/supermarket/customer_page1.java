/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author LISHA
 */
public class customer_page1 extends javax.swing.JFrame {

    /**
     * Creates new form customer_page1
     */
    Connection conn = null;
    ResultSet rs = null;
    Statement st = null;
    PreparedStatement pst = null;

    public customer_page1() {
        initComponents();
        Random r = new Random();
        int i1 = r.nextInt(8999) + 1000;
        cus_id.setText("CUS" + i1);
    }

    public customer_page1(String str) {
        initComponents();
        //display1();
        cid.setText(str);
        Random r = new Random();
        int i1 = r.nextInt(8999) + 1000;
        cus_id.setText("CUS" + i1);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cus_id = new javax.swing.JTextField();
        cus_name = new javax.swing.JTextField();
        cus_mob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("SUPERMARKET MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 10, 740, 60);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("STORE_ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(890, 20, 100, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("STRMANG01");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1010, 20, 100, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("CONTACT :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(890, 50, 90, 18);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("9854126570");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1010, 50, 90, 18);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("ADDRESS :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(890, 80, 80, 18);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("MANGALORE");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1010, 80, 100, 18);
        jPanel1.add(cid);
        cid.setBounds(380, 90, 140, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("CASHIER ID :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 90, 120, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("CUSTOMER DETAILS :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(230, 150, 310, 35);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("CUSTOMER ID :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(170, 198, 180, 30);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(250, 230, 0, 0);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setText("NAME :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(250, 248, 120, 30);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setText("MOBILE NO :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(200, 308, 150, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(327, 373, 90, 40);

        cus_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_idActionPerformed(evt);
            }
        });
        jPanel1.add(cus_id);
        cus_id.setBounds(360, 200, 140, 30);
        jPanel1.add(cus_name);
        cus_name.setBounds(360, 250, 140, 30);
        jPanel1.add(cus_mob);
        cus_mob.setBounds(360, 300, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LISHA\\Desktop\\lincia\\Supermarket\\supermarketcart.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 1150, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "chen", "Dsouzacompound1");
            pst = conn.prepareStatement("insert into Customer(cusid,cusname,cusmob) values(?,?,?)");
            pst.setString(1, cus_id.getText());
            pst.setString(2, cus_name.getText());
            pst.setString(3, cus_mob.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA SUCESSFULLY ADDED ");

            String c = cus_name.getText();
            String c1 = cus_id.getText();
            String c2 = cus_mob.getText();
            product_page lc = new product_page(cid.getText(), c1, c, c2);
            lc.setVisible(true);
            cus_id.setText(null);
            cus_name.setText(null);
            cus_mob.setText(null);
            conn.close();
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(customer_page1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cus_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_idActionPerformed

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
            java.util.logging.Logger.getLogger(customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cus_id;
    private javax.swing.JTextField cus_mob;
    private javax.swing.JTextField cus_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /*private void display1(){
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Dsouzacompound1");
        st=conn.createStatement();
        rs=st.executeQuery("select * from CUSTOMER");
         
        cus_tble.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(customer_page1.class.getName()).log(Level.SEVERE, null, ex);
    }
   }*/
}

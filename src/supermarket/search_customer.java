/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author LISHA
 */
public class search_customer extends javax.swing.JFrame {

    /**
     * Creates new form search_customer
     */
    Connection conn=null;
    ResultSet rs=null;
    Statement st=null;
    PreparedStatement pst=null;
    public search_customer() {
        initComponents();
        display1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public search_customer(String s){
        initComponents();
        display1();
        cid.setText(s);
       // cus_name1.set
    }
    private void filter(){
        DefaultTableModel tab=(DefaultTableModel)cus_table.getModel();
        String search=cus_name.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<>(tab);
        cus_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        cus_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cus_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("NAME :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 68, 100, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("CASHIER ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(750, 30, 110, 10);

        cid.setBackground(new java.awt.Color(255, 255, 255));
        cid.setOpaque(true);
        jPanel1.add(cid);
        cid.setBounds(854, 24, 90, 20);

        cus_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cus_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cus_nameFocusLost(evt);
            }
        });
        cus_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cus_nameActionPerformed(evt);
            }
        });
        cus_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cus_nameKeyReleased(evt);
            }
        });
        jPanel1.add(cus_name);
        cus_name.setBounds(120, 70, 160, 40);

        cus_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CUS_ID", "CUS_NAME", "CUS_MOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cus_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cus_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cus_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 140, 452, 402);

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 70, 80, 30);

        jButton2.setText("NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 370, 80, 23);

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(610, 420, 80, 23);

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(610, 470, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LISHA\\Desktop\\lincia\\Supermarket\\supermarketcart.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chen","Dsouzacompound1");
            String ss=cus_name.getText();
            st=conn.createStatement();
            rs=st.executeQuery("select * from Customer where cusname='"+ss+"'");
            cus_table.setModel(DbUtils.resultSetToTableModel(rs));
          if(cus_table == null){
              JOptionPane.showMessageDialog(null, "CUSTOMER NOT FOUND");
          }
          cus_name.setText(null);
          conn.close();  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String c=cid.getText();
        new NextPage(c).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x=cus_table.getSelectedRow();
        String s=cus_table.getValueAt(x, 0).toString();
        String s1=cus_table.getValueAt(x, 1).toString();
        String s2=cus_table.getValueAt(x, 2).toString();
        new product_page(cid.getText(),s,s1,s2).setVisible(true);
        dispose();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        int i=cus_table.getSelectedRow();
        int j=cus_table.getSelectedColumn();
        String s=(String) cus_table.getValueAt(i, 0);
        String s1=(String) cus_table.getValueAt(i, 1);
        String s2=(String) cus_table.getValueAt(i, 2);
        new updating_customer(cid.getText(),s,s1,s2).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cus_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cus_tableMouseClicked
        // TODO add your handling code here:
        int i=cus_table.getSelectedRowCount();
        if(i>1){
            cus_table.clearSelection();
        }
    }//GEN-LAST:event_cus_tableMouseClicked

    private void cus_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cus_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cus_nameActionPerformed

    private void cus_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cus_nameKeyReleased
        // TODO add your handling code here:
        //filter();
    }//GEN-LAST:event_cus_nameKeyReleased

    private void cus_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cus_nameFocusGained
        // TODO add your handling code here:
        if("SEARCH CUSTOMER".equals(cus_name.getText().trim())){
            cus_name.setText(null);
        }
    }//GEN-LAST:event_cus_nameFocusGained

    private void cus_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cus_nameFocusLost
        // TODO add your handling code here:
         if("".equals(cus_name.getText().trim())){
            cus_name.setText("SEARCH CUSTOMER");
        }
    }//GEN-LAST:event_cus_nameFocusLost
    
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
            java.util.logging.Logger.getLogger(search_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cid;
    private javax.swing.JTextField cus_name;
    private javax.swing.JTable cus_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void display1(){
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","username","password");
        st=conn.createStatement();
        rs=st.executeQuery("select * from CUSTOMER");
        
       cus_table.setModel(DbUtils.resultSetToTableModel(rs));
       conn.close();
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(search_customer.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex);
    }
}




}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class FASTCASH extends javax.swing.JFrame {

    /**
     * Creates new form FASTCASH
     */
    public FASTCASH() {
        initComponents();
    }

    int MyAccNum;
     public FASTCASH(int AccNum) {
        initComponents();
        MyAccNum= AccNum;
       // AccNumLbl.setText(""+AccNum);
        GetBalance();
    }

   Connection Con = null;
        PreparedStatement pst = null;
        ResultSet Rs = null,Rs1=null;
        Statement St= null,St1=null;
        int OldBalance;
     private void GetBalance()
     {
         String Query = "select * from account where AccNum='"+MyAccNum+"'";
        try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
             St1 = Con.createStatement();
             Rs1 = St1.executeQuery(Query);
             if(Rs1.next())
             {
                 OldBalance = Rs1.getInt(9);
                 BallLbl.setText(""+OldBalance);
             }else
             {
                 
             }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BallLbl = new javax.swing.JLabel();
        DEPOSITBTN = new javax.swing.JButton();
        DEPOSITBTN1 = new javax.swing.JButton();
        DEPOSITBTN2 = new javax.swing.JButton();
        DEPOSITBTN3 = new javax.swing.JButton();
        DEPOSITBTN4 = new javax.swing.JButton();
        DEPOSITBTN5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HPT Bank");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel2)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        BallLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BallLbl.setForeground(new java.awt.Color(0, 51, 255));
        BallLbl.setText("Balance:");

        DEPOSITBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN.setText("RS 1000");
        DEPOSITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTNMouseClicked(evt);
            }
        });

        DEPOSITBTN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN1.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN1.setText("RS 2000");
        DEPOSITBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN1MouseClicked(evt);
            }
        });
        DEPOSITBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN1ActionPerformed(evt);
            }
        });

        DEPOSITBTN2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN2.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN2.setText("RS 5000");
        DEPOSITBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN2MouseClicked(evt);
            }
        });

        DEPOSITBTN3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN3.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN3.setText("RS 10000");
        DEPOSITBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN3MouseClicked(evt);
            }
        });

        DEPOSITBTN4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN4.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN4.setText("RS 20000");
        DEPOSITBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN4MouseClicked(evt);
            }
        });

        DEPOSITBTN5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DEPOSITBTN5.setForeground(new java.awt.Color(0, 51, 255));
        DEPOSITBTN5.setText("RS 500");
        DEPOSITBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEPOSITBTN5MouseClicked(evt);
            }
        });
        DEPOSITBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITBTN5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("BACK");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("FASTCASH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITBTN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117)
                .addComponent(BallLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DEPOSITBTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DEPOSITBTN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(318, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(301, 301, 301)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(314, 314, 314)
                    .addComponent(jLabel7)
                    .addContainerGap(314, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN)
                    .addComponent(DEPOSITBTN5))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN2)
                    .addComponent(DEPOSITBTN1)
                    .addComponent(BallLbl))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DEPOSITBTN3)
                    .addComponent(DEPOSITBTN4))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(438, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(23, 23, 23)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jLabel7)
                    .addContainerGap(343, Short.MAX_VALUE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DEPOSITBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN1ActionPerformed

    private void DEPOSITBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITBTN5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEPOSITBTN5ActionPerformed

    private void DEPOSITBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN5MouseClicked
        if(OldBalance < 500)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-500);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTN5MouseClicked

    private void DEPOSITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTNMouseClicked
        if(OldBalance < 1000)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-1000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTNMouseClicked

    private void DEPOSITBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN1MouseClicked
        if(OldBalance < 2000)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-2000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTN1MouseClicked

    private void DEPOSITBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN2MouseClicked
        if(OldBalance < 5000)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-5000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTN2MouseClicked

    private void DEPOSITBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN3MouseClicked
        if(OldBalance < 10000)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-10000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTN3MouseClicked

    private void DEPOSITBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEPOSITBTN4MouseClicked
       if(OldBalance < 20000)
       {
           JOptionPane.showMessageDialog(this,"No Enough Balance");
       }
       else
       {
          try{ 
            String Query = "Update account set Balance = ? where AccNUm=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1,OldBalance-20000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this,"Balance Updated");
                new MainMenu().setVisible(true);
        this.dispose();
            }else
            {
                JOptionPane.showMessageDialog(this,"Missing Info");
            }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,e);
          }
       }
    }//GEN-LAST:event_DEPOSITBTN4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FASTCASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FASTCASH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BallLbl;
    private javax.swing.JButton DEPOSITBTN;
    private javax.swing.JButton DEPOSITBTN1;
    private javax.swing.JButton DEPOSITBTN2;
    private javax.swing.JButton DEPOSITBTN3;
    private javax.swing.JButton DEPOSITBTN4;
    private javax.swing.JButton DEPOSITBTN5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

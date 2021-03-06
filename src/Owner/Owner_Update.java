/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Owner;

import DAL.NationalityDal;
import DAL.OwnerDal;
import DatabaseConnectivity.DatabaseConnectivity;
import classes.Owner;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class Owner_Update extends javax.swing.JFrame {

    /**
     * Creates new form Add_Owner
     */
    DatabaseConnectivity objConnectivity;
    private Connection Connection;
    Owner o;
    public Owner_Update(Owner o1) {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
        DisplayCombox();
        o=o1;
        if(o!=null){
            ownerid.setText(String.valueOf(o.getId()));
            Ownername.setText(String.valueOf(o.getName()));
            ownermail.setText(String.valueOf(o.getMail()));
            ownerdob.setDate(o.getDate());
            NationalityDal n=new NationalityDal(Connection);
            String nName=n.getNameNationality(o.getNationality());
            ownernationality.setSelectedItem(nName);
            ownerpnumber.setText(String.valueOf(o.getPhonenumber()));
            ownercnic.setText(String.valueOf(o.getCnic()));
        }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ownername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ownermail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ownerpnumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ownercnic = new javax.swing.JTextField();
        ownerdob = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ownerid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        ownernationality = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Owner");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 20, 190, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 230, 45, 22);

        Ownername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(Ownername);
        Ownername.setBounds(370, 220, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mail");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 320, 41, 16);

        ownermail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ownermail);
        ownermail.setBounds(370, 310, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 390, 80, 22);

        ownerpnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ownerpnumber);
        ownerpnumber.setBounds(370, 380, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNIC");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 470, 41, 16);

        ownercnic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ownercnic);
        ownercnic.setBounds(370, 450, 260, 40);

        ownerdob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(ownerdob);
        ownerdob.setBounds(370, 520, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 530, 110, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nationality");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 600, 90, 22);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-update-48.png"))); // NOI18N
        update.setText("Update");
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(670, 590, 140, 57);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 160, 19, 22);

        ownerid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ownerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owneridActionPerformed(evt);
            }
        });
        jPanel1.add(ownerid);
        ownerid.setBounds(370, 150, 260, 40);

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-arrow-48.png"))); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 20, 130, 57);

        jPanel1.add(ownernationality);
        ownernationality.setBounds(370, 600, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/green_background_3-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1070, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void owneridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owneridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_owneridActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Owner_Menu().setVisible(true);
        }
        });
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        // get data in local variables
        if(!(ownerid.getText().isEmpty()&&Ownername.getText().isEmpty()&&ownermail.getText().isEmpty()&&ownerpnumber.getText().isEmpty()&&ownercnic.getText().isEmpty()&&ownerdob.getDate()!=null&&ownernationality.getSelectedItem()!="Select")){
            int id=Integer.parseInt(ownerid.getText());
            String name=Ownername.getText();
            String mail=ownermail.getText();
            long phoneno=Long.parseLong(ownerpnumber.getText());
            long cnic=Long.parseLong(ownercnic.getText());
            java.util.Date utilStartDate = ownerdob.getDate();
            java.sql.Date d = new java.sql.Date(utilStartDate.getTime());
            Connection=objConnectivity.getConnection();
            NationalityDal n=new NationalityDal(Connection);
            int nid=n.getIDNationality((String) ownernationality.getSelectedItem());
            OwnerDal dal=new OwnerDal(Connection);
            boolean check=dal.checkOwner_id(id);
            if(check==true)
            {
                Owner o=new Owner(id, name, mail, phoneno, cnic, d, nid);
                dal.Update(o);
                setClear();
                RunPreviousPage();
                
            }else{
                JOptionPane.showMessageDialog(this,"Sorry this Record isn't Found! ");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Please Fill All Fields to Update!  ");
        }

    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Owner_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Owner o=null;
                new Owner_Update(o).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ownername;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ownercnic;
    private com.toedter.calendar.JDateChooser ownerdob;
    private javax.swing.JTextField ownerid;
    private javax.swing.JTextField ownermail;
    private javax.swing.JComboBox<String> ownernationality;
    private javax.swing.JTextField ownerpnumber;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    void setClear(){
        ownerid.setText("");
        Ownername.setText("");
        ownermail.setText("");
        ownerpnumber.setText("");
        ownercnic.setText("");
        ownernationality.setSelectedIndex(0);
    }
    void RunPreviousPage(){
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Search().setVisible(true);
            }
        });
    }
    void DisplayCombox(){
        NationalityDal n=new  NationalityDal(Connection=objConnectivity.getConnection());
        ownernationality.addItem("-Select-");
        if(n.Combox()!=null){
            int i=0;
            while(i<n.Combox().size()){
                ownernationality.addItem(n.Combox().get(i));
                i++;
            }
        }
    }
}

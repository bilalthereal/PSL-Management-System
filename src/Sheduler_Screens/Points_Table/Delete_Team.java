/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sheduler_Screens.Points_Table;

import Dal.RegistrationDal;
import Dal.SeasonDal;
import DatabaseConnectivity.DatabaseConnectivity;
import Psl_Classes.PointsTable;
import Psl_Classes.Season;
import Psl_Classes.Team;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Delete_Team extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Team
     */
     DatabaseConnectivity objConnectivity;
        private Connection connection;
    public Delete_Team() {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        ComboBoxSeason();
        ComboBoxTeam();
    }
 public void ComboBoxSeason(){
        try{
            SeasonDal objDal=new SeasonDal(objConnectivity.getConnection());
            ArrayList<Season> userList=new ArrayList<Season>();
            objDal.Fill_Season_Combo(userList);
           int i=0;
           while(i<userList.size()){
                comboBox_Season.addItem(userList.get(i).getSeasonName());
                i++;
                   }
        }catch(Exception e){
            e.printStackTrace();
        }
    }  
    String Find_Id_Season;
    public void FindId_Season(){
        try{
            String selected=(String)comboBox_Season.getSelectedItem();
            SeasonDal objDal=new SeasonDal(objConnectivity.getConnection());
            Find_Id_Season=objDal.FindId_Season(selected);
            
             }catch(Exception e){
                    e.printStackTrace();
                }
    }
      public void ComboBoxTeam(){
        try{
           RegistrationDal objDal=new RegistrationDal(objConnectivity.getConnection());
           ArrayList<Team> userList=new ArrayList<Team>();
           objDal.ComboBoxTeam(userList);
           int i=0;
            while(i<userList.size()){
            
                comboBox_Team.addItem(userList.get(i).getName());
                i++;
            }
              
        }catch(Exception e){ 
             e.printStackTrace();
        }
      
        
    }
        String teamId;
        public void get_Selected_Id_Team(){
          try{
              
            String selectedCombo=(String)comboBox_Team.getSelectedItem();
            RegistrationDal objDal=new RegistrationDal(objConnectivity.getConnection());
             teamId=objDal.get_Selected_Id_Team(selectedCombo);
            lbl_TeamId.setText(teamId);
             }catch(Exception e){   
               e.printStackTrace();
        }
           
    }
        public void delete_From_Points_Table(){
            try{
                
                FindId_Season();
                get_Selected_Id_Team();
                  RegistrationDal objDal=new RegistrationDal(objConnectivity.getConnection());
                  PointsTable objTable=new PointsTable();
                 objTable.setSeasonId(Find_Id_Season);
                 objTable.setTeamId(teamId);
                 objDal.delete_From_Points_Table(objTable);
                JOptionPane.showMessageDialog(this," Team Removed From Poinst Table");
               
            }catch(Exception e){
                e.printStackTrace();
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

        panel1 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_TeamId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboBox_Team = new javax.swing.JComboBox<>();
        comboBox_Season = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(51, 0, 51));
        panel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Team");
        jLabel6.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Remove Team from points Table");

        lbl_TeamId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TeamId.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TeamId.setText("TeamId");
        lbl_TeamId.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboBox_Team.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_TeamItemStateChanged(evt);
            }
        });

        comboBox_Season.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_SeasonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select PSL Season");
        jLabel5.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TeamId");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(98, 98, 98)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_Season, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_Team, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(394, 394, 394))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(532, 532, 532))))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2)
                        .addGap(360, 360, 360)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(551, 551, 551)
                        .addComponent(lbl_TeamId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TeamId)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Season, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_From_Points_Table();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBox_SeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_SeasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_SeasonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Season().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboBox_TeamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_TeamItemStateChanged
                 get_Selected_Id_Team();
    }//GEN-LAST:event_comboBox_TeamItemStateChanged

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
            java.util.logging.Logger.getLogger(Delete_Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Team().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox_Season;
    private javax.swing.JComboBox<String> comboBox_Team;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_TeamId;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}

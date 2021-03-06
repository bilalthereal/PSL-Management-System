/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreCard;

import DatabaseConnectivity.DatabaseConnectivity;
import classes.ScoreCard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class ScoreCard_Update extends javax.swing.JFrame {

    /**
     * Creates new form ScoreCard_Update
     */
    DatabaseConnectivity objConnectivity;
    Connection connection;
    ScoreCard s;
    public ScoreCard_Update(ScoreCard s1) {
        initComponents();
        objConnectivity=new DatabaseConnectivity();
        connection=objConnectivity.getConnection();
        s=s1;
        if(s!=null){
            team.setText(GetNameTeam(s.getTeamID()));
            matchid.setText(s.getMatchID());
            player.setText(GetNameplayer(s.getPlayerID()));
            runscored.setText(String.valueOf(s.getRunedScored()));
            inning.setSelectedItem(s.getInning());
            outby.setText(GetNameplayer(s.getOutby()));
            outtype.setText(s.getOutType());
            runsconceed.setText(String.valueOf(s.getRunsConceed()));
            overblowed.setText(String.valueOf(s.getOverBlowed()));
            nowide.setText(String.valueOf(s.getNowide()));
            noballs.setText(String.valueOf(s.getNOBalls()));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        runscored = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inning = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outtype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        runsconceed = new javax.swing.JTextField();
        overblowed = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nowide = new javax.swing.JTextField();
        noballs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        team = new javax.swing.JLabel();
        matchid = new javax.swing.JLabel();
        outby = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Team");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 170, 110, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Match ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(620, 170, 110, 30);

        runscored.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(runscored);
        runscored.setBounds(710, 300, 300, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Runs Scored");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(580, 300, 100, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 280, 80, 22);

        inning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second" }));
        inning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inningActionPerformed(evt);
            }
        });
        jPanel1.add(inning);
        inning.setBounds(210, 390, 280, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Outby");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(610, 390, 60, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inning");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 390, 80, 22);

        outtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outtypeActionPerformed(evt);
            }
        });
        jPanel1.add(outtype);
        outtype.setBounds(210, 490, 280, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OutType");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 490, 110, 30);
        jPanel1.add(runsconceed);
        runsconceed.setBounds(200, 600, 290, 40);
        jPanel1.add(overblowed);
        overblowed.setBounds(710, 480, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Over Blowed");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 480, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Runs Conceed");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 600, 112, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No Wide");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 680, 67, 60);
        jPanel1.add(nowide);
        nowide.setBounds(200, 700, 290, 40);

        noballs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noballsActionPerformed(evt);
            }
        });
        jPanel1.add(noballs);
        noballs.setBounds(710, 570, 300, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("No Balls");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(590, 580, 64, 22);

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
        update.setBounds(1080, 700, 141, 50);

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
        back.setBounds(30, 40, 121, 50);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update ScoreCard");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(480, 40, 230, 50);

        player.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(player);
        player.setBounds(210, 260, 290, 50);

        team.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        team.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(team);
        team.setBounds(220, 160, 200, 50);

        matchid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        matchid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(matchid);
        matchid.setBounds(710, 160, 200, 50);

        outby.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outby.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(outby);
        outby.setBounds(710, 390, 300, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/new.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inningActionPerformed

    private void outtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outtypeActionPerformed

    private void noballsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noballsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noballsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreCard_SearchUpdate2(null).setVisible(true);
            }
        });
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(runscored.getText().isEmpty()&&outby.getText().isEmpty()&&outtype.getText().isEmpty()&&runsconceed.getText().isEmpty()&&overblowed.getText().isEmpty()&&nowide.getText().isEmpty()&&noballs.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter in All Fields! ");
        }else{
            String Team=s.getTeamID();
            String Matchid=s.getMatchID();
            String Playerid=s.getPlayerID();
            int RunsScored=Integer.parseInt(runscored.getText());
            String Inning=(String) inning.getSelectedItem();
            String Outby=s.getOutby();
            String Outtype=outtype.getText();
            int RunsConceed=Integer.parseInt(runsconceed.getText());
            float overBolwed=Float.parseFloat(overblowed.getText());
            int Nowide=Integer.parseInt(nowide.getText());
            int Noball=Integer.parseInt(noballs.getText());
            ScoreCard sc=new ScoreCard(Team, Matchid, Playerid, RunsScored, Inning, Outby, Outtype, RunsConceed, overBolwed, Nowide, Noball);
            try{
                connection=objConnectivity.getConnection();
                PreparedStatement preparedStatement=connection.prepareStatement("Update ScoreCard set runsScored=? , Innings=? ,OutType=?, runs_conceed=?, oversBolwed=? , No_wides=? , No_NoBalls=? where Match_id=? and Team_id=? and Player_idone=?");
                preparedStatement.setInt(1,sc.getRunedScored());
                preparedStatement.setString(2,sc.getInning());
                preparedStatement.setString(3,sc.getOutType());
                preparedStatement.setInt(4,sc.getRunsConceed());
                preparedStatement.setFloat(5,sc.getOverBlowed());
                preparedStatement.setInt(6,sc.getNowide());
                preparedStatement.setInt(7,sc.getNOBalls());
                preparedStatement.setString(8,sc.getMatchID());
                preparedStatement.setString(9,sc.getTeamID());
                preparedStatement.setString(10,sc.getPlayerID());
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this,"Update Successfully! ");
            }catch(Exception e){
                e.printStackTrace();
                //JOptionPane.showMessageDialog(this, e);
            }
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
            java.util.logging.Logger.getLogger(ScoreCard_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScoreCard s = null;
                new ScoreCard_Update(s).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> inning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel matchid;
    private javax.swing.JTextField noballs;
    private javax.swing.JTextField nowide;
    private javax.swing.JLabel outby;
    private javax.swing.JTextField outtype;
    private javax.swing.JTextField overblowed;
    private javax.swing.JLabel player;
    private javax.swing.JTextField runsconceed;
    private javax.swing.JTextField runscored;
    private javax.swing.JLabel team;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    
    String GetNameplayer(String id){
        String Name="";
        try{
            String Query="select Name from player where Playerid=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null&&rs.next()){
                Name=rs.getString("Name");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Name;
    }

    String GetNameTeam(String id){
        String Name="";
        try{
            String Query="select Name from Team where TeamId=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs!=null&&rs.next()){
                Name=rs.getString("Name");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Name;
    }




}

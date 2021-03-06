/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoreCard;

import DatabaseConnectivity.DatabaseConnectivity;
import Psl_Classes.TeamMatch;
import classes.Player_ScoreCard;
import classes.ScoreCard;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author MUHAMMED BILAL
 */
public class ScoreCard_View extends javax.swing.JFrame {

    /**
     * Creates new form ScoreCard_View
     */
    private DatabaseConnectivity Connectivity;
    private Connection connection;
    String Teamone;
    String Teamtwo;
    TeamMatch T;
    String getTeam;
    String Table_Click;
    public ScoreCard_View(TeamMatch T1) {
        initComponents();
        T=T1;
        Connectivity=new DatabaseConnectivity();
        connection=Connectivity.getConnection();
        if(T!=null){
                    
            Teamone=getTeamName(T.getTeamAId());
            Teamtwo=getTeamName(T.getTeamBId());
            LoadTeamCombox(Teamone,Teamtwo);
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
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Team = new javax.swing.JComboBox<>();
        statistically = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 280, 80, 22);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(30, 330, 230, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team", "Match", "Player", "RunsScored", "Innings", "OutBy_id", "OutType", "Runsconceed", "OversBolwed", "No of wides", "No of Balls"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(340, 0, 1240, 880);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-delete-48.png"))); // NOI18N
        delete.setText("Delete");
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(80, 390, 140, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-arrow-48.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 30, 121, 50);

        Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamActionPerformed(evt);
            }
        });
        jPanel1.add(Team);
        Team.setBounds(10, 170, 250, 40);

        statistically.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statistically.setForeground(new java.awt.Color(255, 255, 255));
        statistically.setText("See Statistically");
        statistically.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statisticallyActionPerformed(evt);
            }
        });
        jPanel1.add(statistically);
        statistically.setBounds(30, 550, 160, 50);

        score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(score);
        score.setBounds(120, 660, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Score");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 656, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/new.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1580, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        String Search =search.getText().trim();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(Search));
    }//GEN-LAST:event_searchActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row=table.getSelectedRow();
        Table_Click=(table.getModel().getValueAt(row,2).toString());
        String Query="Delete from ScoreCard Where Match_id=?";
        try{
            connection=Connectivity.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(Query);
            preparedStatement.setString(1,Table_Click.trim());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this,"Deleted Successfully! ");
            newFrame(T);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreCard_Menu().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamActionPerformed
        getTeam=getIDTEAM((String) Team.getSelectedItem());
        table.setModel(new DefaultTableModel(null,new String[]{"Team","Match","Player","RunsScored","Inning","Outby","Outtype","RunsConceed","OversBolwed","No of Wides","No of Ball"}));
        LoadAllTeamData(getTeam);
        score.setText(String.valueOf(TotalScores()));

    }//GEN-LAST:event_TeamActionPerformed

    private void statisticallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statisticallyActionPerformed
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        
        
        int size=s().size();
        for(int i=0;i<size;i++){
            dataset.setValue(s().get(i).getScore(),"Score",s().get(i).getPName());
        }
        JFreeChart chart=ChartFactory.createBarChart("Statistically View","Player Name","Player Score", dataset,PlotOrientation.VERTICAL,false,true,false);
        //JFreeChart chart=ChartFactory.createAreaChart("Statistically View","Player Name","Player Score", dataset,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p=chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame=new ChartFrame("Barchart",chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_statisticallyActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreCard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreCard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TeamMatch T=null;
                new ScoreCard_View(T).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Team;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel score;
    private javax.swing.JTextField search;
    private javax.swing.JButton statistically;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
    void newFrame(TeamMatch T){
        dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreCard_View(T).setVisible(true);
            }
        });
    }

    String getTeamName(String id){
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
    void LoadTeamCombox(String s1,String s2){
        Team.addItem("-Select-");
        Team.addItem(s1);
        Team.addItem(s2);
    }
    String getIDTEAM(String Name){
        String id="";
        try{
            String Query="select TeamId from Team where Name=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, Name);
            ResultSet rs=ps.executeQuery();
            if(rs!=null&&rs.next()){
                id=rs.getString("TeamId");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return id;
    }
    void LoadAllTeamData(String getTeam){
        
        if(getTeam!=null){
            try{
            
                PreparedStatement objstatement=connection.prepareStatement("select T.Name,s.Match_id,P.Name,s.runsScored,s.Innings,Q.Name as Outby,s.OutType,s.runs_conceed,s.oversbolwed,s.No_wides,s.No_NoBalls\n" +
"from Team T join ScoreCard s on s.Team_id=T.TeamId join Player P on P.Playerid=s.Player_idone join Player Q on Q.Playerid=s.OutBy_playerid where s.Team_id=? and s.Match_id=?");
                objstatement.setString(1,getTeam);
                objstatement.setString(2,T.getSeasonid());
                ResultSet objset=objstatement.executeQuery();
                ArrayList<ScoreCard>objList=new ArrayList<ScoreCard>();
                while(objset!=null&&objset.next()){
                    ScoreCard sc=new ScoreCard(objset.getString(1),objset.getString(2),objset.getString(3),objset.getInt(4),objset.getString(5),objset.getString(6),objset.getString(7),objset.getInt(8),objset.getFloat(9),objset.getInt(10),objset.getInt(11));
                    objList.add(sc);
                }
                String[] ColumnsName={"Team","Match","Player","RunsScored","Inning","Outby","Outtype","RunsConceed","OversBolwed","No of Wides","No of Ball"};
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setColumnIdentifiers(ColumnsName);
                Object[] tableLines = new Object[12];
                for(int i=0;i<objList.size();i++){
                    objList.get(i);
                    tableLines[0]=objList.get(i).getTeamID();
                    tableLines[1]=objList.get(i).getMatchID();
                    tableLines[2]=objList.get(i).getPlayerID();
                    tableLines[3]=objList.get(i).getRunedScored();
                    tableLines[4]=objList.get(i).getInning();
                    tableLines[5]=objList.get(i).getOutby();
                    tableLines[6]=objList.get(i).getOutType();
                    tableLines[7]=objList.get(i).getRunsConceed();
                    tableLines[8]=objList.get(i).getOverBlowed();
                    tableLines[9]=objList.get(i).getNowide();
                    tableLines[10]=objList.get(i).getNOBalls();
                    model.addRow(tableLines);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
    public ArrayList<Player_ScoreCard>s(){
        ArrayList<Player_ScoreCard>ps=new ArrayList<Player_ScoreCard>();
        try{
            
            String Query="select s.runsScored,P.Name from ScoreCard s join player P on s.Player_idone=P.Playerid where s.Match_id=? and s.Team_id=?";
            PreparedStatement s1=connection.prepareStatement(Query);
            s1.setString(1,T.getSeasonid());
            s1.setString(2,getTeam);
            ResultSet rs=s1.executeQuery();
            while(rs!=null && rs.next()){
                Player_ScoreCard p=new Player_ScoreCard(rs.getInt("runsScored"),rs.getString("Name"));
                ps.add(p);
            }
            return ps;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public int TotalScores(){
        int TotalScored=0;
        try{
            String Query="select sum(runsScored) as TotalScores from ScoreCard where Match_id=? and Team_id=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,T.getSeasonid());
            ps.setString(2,getTeam);
            ResultSet rs=ps.executeQuery();
            if(rs!=null && rs.next()){
                TotalScored=rs.getInt("TotalScores");
            }
            return TotalScored;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}

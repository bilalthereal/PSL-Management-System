package Player_Screens;



import Dal.CategoryDal;
import Dal.PlayerDal;
import DatabaseConnectivity.DatabaseConnectivity;
import Psl_Classes.Category;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Psl_Classes.Player1;
import java.util.ArrayList;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Add_Player_Form extends javax.swing.JFrame {

    /**
     * Creates new form Add_Player_Form
     */
        DatabaseConnectivity objConnectivity;
        private Connection Connection;

    public Add_Player_Form() {
        initComponents();
                objConnectivity=new DatabaseConnectivity();
                ComboBoxCategory();
                 setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
     public void ComboBoxCategory(){
        try{
            ArrayList<Category> objList=new ArrayList();
            PlayerDal objDal=new PlayerDal(objConnectivity.getConnection());
            objDal.ComboBoxCategory(objList);
            if(objList!=null){
                int i=0;
                while(i<objList.size()){
                    comboBox_Category.addItem(objList.get(i).getCategoryName());
                    i++;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     String Find_Id_Category;
    public void FindId_Category(){
        try{
        String Find_Category_Name=(String)comboBox_Category.getSelectedItem();
         CategoryDal objDal=new CategoryDal(objConnectivity.getConnection());
         Category objCategory=new Category();
         objCategory.setCategoryName(Find_Category_Name);
         Find_Id_Category=objDal.FindId_Category(objCategory.getCategoryName());
             }catch(Exception e){
                    e.printStackTrace();
                }
    }
    public void Add_Player(){
        FindId_Category();
        String id= player_Id.getText();
        String playerName=playerName_Txt.getText();
        String nationality=nationality_text.getText();
        String  phone= (phone_Number_Txt.getText());
        String mail=mail_Txt.getText();
        String Category=Find_Id_Category;
        
        java.util.Date utilStartDate = Date_Chooser.getDate();
        java.sql.Date d = new java.sql.Date(utilStartDate.getTime());
        
        try{ 
            
            Player1 objPlayer1=new Player1( id ,playerName,mail, phone,  nationality,Category);
            objPlayer1.setStatus(status);
            objPlayer1.setDob(d);
            PlayerDal objDal=new PlayerDal(objConnectivity.getConnection());
            objDal.save(objPlayer1);
            JOptionPane.showMessageDialog(this,"Data Succesfully Added!");  
           
         
            
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        player_Id = new javax.swing.JTextField();
        playerName_Txt = new javax.swing.JTextField();
        nationality_text = new javax.swing.JTextField();
        phone_Number_Txt = new javax.swing.JTextField();
        mail_Txt = new javax.swing.JTextField();
        comboBox_Category = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        Date_Chooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        RadioButton_Available = new javax.swing.JRadioButton();
        RadioButton_Reserved = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        player_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_IdActionPerformed(evt);
            }
        });

        playerName_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerName_TxtActionPerformed(evt);
            }
        });

        phone_Number_Txt.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                phone_Number_TxtInputMethodTextChanged(evt);
            }
        });
        phone_Number_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_Number_TxtActionPerformed(evt);
            }
        });

        mail_Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_TxtActionPerformed(evt);
            }
        });

        comboBox_Category.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBox_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_CategoryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PlayerName");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nationality");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PhoneNo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mail");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AddPlayer Form");

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btn_Save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");

        RadioButton_Available.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RadioButton_Available.setText("Available");
        RadioButton_Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_AvailableActionPerformed(evt);
            }
        });

        RadioButton_Reserved.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RadioButton_Reserved.setText("Reserved");
        RadioButton_Reserved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_ReservedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel8)
                                        .addGap(9, 9, 9)))
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(612, 612, 612))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9)))
                        .addGap(92, 92, 92)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerName_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(nationality_text, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(phone_Number_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(mail_Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(Date_Chooser, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(comboBox_Category, 0, 267, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(RadioButton_Available)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RadioButton_Reserved)
                        .addGap(8, 8, 8)))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(517, 517, 517))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(player_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playerName_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationality_text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_Number_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(mail_Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RadioButton_Available)
                    .addComponent(RadioButton_Reserved))
                .addGap(27, 27, 27)
                .addComponent(btn_Save)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         dispose();
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Player().setVisible(true);
            }
        });
                 
      
    }//GEN-LAST:event_backActionPerformed

    private void comboBox_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_CategoryActionPerformed

    private void phone_Number_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_Number_TxtActionPerformed
        
    }//GEN-LAST:event_phone_Number_TxtActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
       Add_Player();
        
    }//GEN-LAST:event_btn_SaveActionPerformed

    public Add_Player_Form(JButton back, JButton btn_Save, JComboBox<String> jComboBox1, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JTextField text_Mail, JTextField text_Phone_Number, JTextField txt_Nationality, JTextField txt_Player_Name) {
        this.back = back;
        this.btn_Save = btn_Save;
        this.comboBox_Category = jComboBox1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.mail_Txt = text_Mail;
        this.phone_Number_Txt = text_Phone_Number;
        this.nationality_text = txt_Nationality;
        this.player_Id = txt_Player_Name;
    }

    private void player_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player_IdActionPerformed

    private void playerName_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerName_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerName_TxtActionPerformed

    private void mail_TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_TxtActionPerformed

    private void RadioButton_AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_AvailableActionPerformed
     status="Available";
    }//GEN-LAST:event_RadioButton_AvailableActionPerformed

    private void RadioButton_ReservedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_ReservedActionPerformed
     status="Reserved";
    }//GEN-LAST:event_RadioButton_ReservedActionPerformed

    private void phone_Number_TxtInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_phone_Number_TxtInputMethodTextChanged
       
    }//GEN-LAST:event_phone_Number_TxtInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Add_Player_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Player_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Player_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Player_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Player_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_Chooser;
    private javax.swing.JRadioButton RadioButton_Available;
    private javax.swing.JRadioButton RadioButton_Reserved;
    private javax.swing.JButton back;
    private javax.swing.JButton btn_Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBox_Category;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail_Txt;
    private javax.swing.JTextField nationality_text;
    private javax.swing.JTextField phone_Number_Txt;
    private javax.swing.JTextField playerName_Txt;
    private javax.swing.JTextField player_Id;
    // End of variables declaration//GEN-END:variables
   String status;
}

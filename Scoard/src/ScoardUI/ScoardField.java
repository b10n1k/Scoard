/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ScoardField.java
 *
 * Created on Jan 28, 2012, 5:51:32 PM
 */
package ScoardUI;

import ScoardGame.Game;
import ScoardGame.ScoardTeam;

/**
 *
 * @author j0ni
 */
public class ScoardField extends javax.swing.JFrame {

    public static int getValue() {
        return totalscore;
    }

    public int getScore(){
        return totalscore;
    }
    
    public void setScore(int sc){
        totalscore=sc;
    }
    
    private void setTeamScore(int sc){
        thegame.setStorePoint(sc);
    }
    
    /** Creates new form ScoardField */
    public ScoardField() {
        initComponents();
        thegame=new Game();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        teamlbl1 = new javax.swing.JLabel();
        teamlbl2 = new javax.swing.JLabel();
        teamscore1 = new javax.swing.JTextField();
        teamscore2 = new javax.swing.JTextField();
        hitsPanel = new javax.swing.JPanel();
        fshoot = new javax.swing.JTextField();
        sshoot = new javax.swing.JTextField();
        tshoot = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaNotes = new javax.swing.JTextArea();
        radiox2r2 = new javax.swing.JRadioButton();
        radiox2r1 = new javax.swing.JRadioButton();
        radiox2r3 = new javax.swing.JRadioButton();
        radiox3r1 = new javax.swing.JRadioButton();
        radiox3r2 = new javax.swing.JRadioButton();
        radiox3r3 = new javax.swing.JRadioButton();
        scorebtn = new javax.swing.JButton();
        helpbar = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        isTurn2 = new javax.swing.JRadioButton();
        isTurn1 = new javax.swing.JRadioButton();
        scoardMenu = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menu_help = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 0));
        setForeground(new java.awt.Color(153, 204, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel1.setText("Score Board");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), null, null));

        teamlbl1.setText("Player 1:");

        teamlbl2.setText("Player 2:");

        teamscore1.setEditable(false);
        teamscore1.setText("501");
        teamscore1.setAutoscrolls(false);
        teamscore1.setPreferredSize(new java.awt.Dimension(30, 19));

        teamscore2.setEditable(false);
        teamscore2.setText("501");
        teamscore2.setAutoscrolls(false);

        hitsPanel.setBackground(new java.awt.Color(102, 102, 255));
        hitsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Round Hits"));
        hitsPanel.setMinimumSize(new java.awt.Dimension(150, 150));

        fshoot.setText("first shoot");
        fshoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshootActionPerformed(evt);
            }
        });

        sshoot.setText("second shoot");

        tshoot.setText("third shoot");

        tareaNotes.setColumns(20);
        tareaNotes.setRows(5);
        jScrollPane1.setViewportView(tareaNotes);

        radiox2r2.setText("x2");
        radiox2r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox2r2ActionPerformed(evt);
            }
        });

        radiox2r1.setText("x2");
        radiox2r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox2r1ActionPerformed(evt);
            }
        });

        radiox2r3.setText("x2");
        radiox2r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox2r3ActionPerformed(evt);
            }
        });

        radiox3r1.setText("x3");
        radiox3r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox3r1ActionPerformed(evt);
            }
        });

        radiox3r2.setText("x3");
        radiox3r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox3r2ActionPerformed(evt);
            }
        });

        radiox3r3.setText("x3");
        radiox3r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiox3r3ActionPerformed(evt);
            }
        });

        scorebtn.setLabel("0");
        scorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hitsPanelLayout = new javax.swing.GroupLayout(hitsPanel);
        hitsPanel.setLayout(hitsPanelLayout);
        hitsPanelLayout.setHorizontalGroup(
            hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hitsPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hitsPanelLayout.createSequentialGroup()
                        .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sshoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tshoot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hitsPanelLayout.createSequentialGroup()
                                .addComponent(radiox2r1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiox3r1))
                            .addGroup(hitsPanelLayout.createSequentialGroup()
                                .addComponent(radiox2r2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiox3r2))
                            .addGroup(hitsPanelLayout.createSequentialGroup()
                                .addComponent(radiox2r3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiox3r3))))
                    .addComponent(scorebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        hitsPanelLayout.setVerticalGroup(
            hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hitsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addGroup(hitsPanelLayout.createSequentialGroup()
                        .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radiox2r1)
                                .addComponent(radiox3r1))
                            .addComponent(fshoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hitsPanelLayout.createSequentialGroup()
                                .addComponent(sshoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tshoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiox2r3)
                                    .addComponent(radiox3r3)))
                            .addGroup(hitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radiox2r2)
                                .addComponent(radiox3r2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scorebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );

        helpbar.setBackground(new java.awt.Color(153, 204, 0));
        helpbar.setForeground(new java.awt.Color(102, 255, 102));
        helpbar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        helpbar.setFocusable(false);
        helpbar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        helpbar.setName("lblnotes"); // NOI18N

        resetbtn.setText("Reset");
        resetbtn.setActionCommand("resetbtn");

        exitbtn.setText("Finish");
        exitbtn.setActionCommand("exitbtn");

        isTurn2.setName("jradio2"); // NOI18N

        isTurn1.setName("jradio1"); // NOI18N

        menu_file.setText("File");

        jMenu5.setText("jMenu5");
        menu_file.add(jMenu5);

        scoardMenu.add(menu_file);

        menu_help.setText("help");
        scoardMenu.add(menu_help);

        setJMenuBar(scoardMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamlbl1)
                    .addComponent(teamlbl2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(teamscore2)
                    .addComponent(teamscore1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isTurn1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isTurn2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(helpbar, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(resetbtn)
                .addGap(18, 18, 18)
                .addComponent(exitbtn)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isTurn1)
                                .addGap(52, 52, 52)
                                .addComponent(isTurn2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(teamlbl1)
                                    .addComponent(teamscore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(teamlbl2)
                                    .addComponent(teamscore2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(hitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetbtn)
                        .addComponent(exitbtn))
                    .addComponent(helpbar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

private void radiox2r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox2r1ActionPerformed
    
        if(radiox2r1.isSelected()){
            //TODO check input
            int getvalue=Integer.parseInt(fshoot.getText());
            int value=getvalue*2;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            fshoot.setText(str);
            scorebtn.setText(score);
            radiox3r1.setEnabled(false);
            fshoot.setEditable(false);
        }
        else{
            radiox2r1.setEnabled(false);
            //TODO prompt to change the state
        }
    
}//GEN-LAST:event_radiox2r1ActionPerformed

private void radiox3r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox3r1ActionPerformed
    if(radiox3r1.isSelected()){
            //TODO check input
            int getvalue=Integer.parseInt(fshoot.getText());
            int value=getvalue*3;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            fshoot.setText(str);
            scorebtn.setText(score);
            radiox2r1.setEnabled(false);
            fshoot.setEditable(false);
        }
        else{
            radiox3r1.setEnabled(false);
            //TODO prompt to change the state
        }
}//GEN-LAST:event_radiox3r1ActionPerformed

private void radiox2r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox2r2ActionPerformed
    if(radiox2r2.isSelected()){
        //TODO check input
            int getvalue=Integer.parseInt(sshoot.getText());
            int value=getvalue*2;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            sshoot.setText(str);
            scorebtn.setText(score);
            radiox3r2.setEnabled(false);
            sshoot.setEditable(false);
        }
        else{
            radiox2r2.setEnabled(false);
            //TODO prompt to change the state
        }
}//GEN-LAST:event_radiox2r2ActionPerformed

private void radiox3r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox3r2ActionPerformed
    if(radiox3r2.isSelected()){
            //TODO check input
            int getvalue=Integer.parseInt(sshoot.getText());
            int value=getvalue*3;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            sshoot.setText(str);
            scorebtn.setText(score);
            radiox2r2.setEnabled(false);
            sshoot.setEditable(false);
        }
        else{
            radiox3r2.setEnabled(false);
            //TODO prompt to change the state
        }
}//GEN-LAST:event_radiox3r2ActionPerformed

private void radiox2r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox2r3ActionPerformed
    if(radiox2r3.isSelected()){
            int getvalue=Integer.parseInt(tshoot.getText());
            int value=getvalue*2;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            tshoot.setText(str);
            scorebtn.setText(score);
            radiox3r3.setEnabled(false);
            tshoot.setEditable(false);
        }
        else{
            radiox2r3.setEnabled(false);
            //TODO prompt to change the state
        }
}//GEN-LAST:event_radiox2r3ActionPerformed

private void radiox3r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiox3r3ActionPerformed
    if(radiox3r3.isSelected()){
            //TODO check input
            int getvalue=Integer.parseInt(tshoot.getText());
            int value=getvalue*3;
            totalscore+=value;
            String str=String.valueOf(value);
            String score=String.valueOf(totalscore);
            tshoot.setText(str);
            scorebtn.setText(score);
            radiox2r3.setEnabled(false);
            tshoot.setEditable(false);
        }
        else{
            radiox3r3.setEnabled(false);
            //TODO prompt to change the state
        }
}//GEN-LAST:event_radiox3r3ActionPerformed

private void scorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorebtnActionPerformed
// TODO add your handling code here:
    if (isTurn1.isSelected()){
        
        teamlbl1.setText(scorebtn.getText());
        isTurn2.enableInputMethods(false);
    }
    else 
        if(isTurn2.isSelected()){
        
        teamlbl1.setText(scorebtn.getText());
        isTurn1.enableInputMethods(false);
    }
}//GEN-LAST:event_scorebtnActionPerformed

private void fshootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshootActionPerformed
// TODO add your handling code here:
    if (fshoot.getAction()!=null){
        scorebtn.setText(fshoot.getText());
        
    }
}//GEN-LAST:event_fshootActionPerformed

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
            java.util.logging.Logger.getLogger(ScoardField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoardField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoardField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoardField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ScoardField().setVisible(true);
            }
        });
        ScoardTeam t1 = new ScoardTeam("player1");
        ScoardTeam t2 = new ScoardTeam("player2");
        Thread playA =
        Game velakia = new Game(t1,t2);
        
        velakia.register(new ScoardTeam("Team A"));
        velakia.register(new ScoardTeam("Team B"));
        
    }
    
    private int teamScore1;
    private int teamScore2;
    private static int totalscore=0;
    private Game thegame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField fshoot;
    private javax.swing.JLabel helpbar;
    private javax.swing.JPanel hitsPanel;
    private javax.swing.JRadioButton isTurn1;
    private javax.swing.JRadioButton isTurn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenu menu_help;
    private javax.swing.JRadioButton radiox2r1;
    private javax.swing.JRadioButton radiox2r2;
    private javax.swing.JRadioButton radiox2r3;
    private javax.swing.JRadioButton radiox3r1;
    private javax.swing.JRadioButton radiox3r2;
    private javax.swing.JRadioButton radiox3r3;
    private javax.swing.JButton resetbtn;
    private javax.swing.JMenuBar scoardMenu;
    private javax.swing.JButton scorebtn;
    private javax.swing.JTextField sshoot;
    private javax.swing.JTextArea tareaNotes;
    private javax.swing.JLabel teamlbl1;
    private javax.swing.JLabel teamlbl2;
    private javax.swing.JTextField teamscore1;
    private javax.swing.JTextField teamscore2;
    private javax.swing.JTextField tshoot;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlayerBoard.java
 *
 * Created on Feb 16, 2012, 4:32:26 PM
 */
package ScoardUI;

import ScoardGame.Game;
import ScoardGame.ScoardTeam;
import javax.swing.JFrame;

/**
 *
 * @author j0ni
 */
public class PlayerBoard extends javax.swing.JFrame {
    private ScoardField dartsboard = null;
    private Game game = null;
    private ScoardTeam teamA;
    private ScoardTeam teamB;
    
    
    /** Creates new form PlayerBoard */
    public PlayerBoard() {
        super("Who wants to play darts???");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        //dartsboard = new ScoardField();
        game=new Game();
        teamA = null;
        teamB = null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        teama = new javax.swing.JLabel();
        teamb = new javax.swing.JLabel();
        teamnameA = new javax.swing.JTextField();
        teamnameB = new javax.swing.JTextField();
        playername_1 = new javax.swing.JTextField();
        playername_3 = new javax.swing.JTextField();
        playername_2 = new javax.swing.JTextField();
        playername_4 = new javax.swing.JTextField();
        teamnamelbl = new javax.swing.JLabel();
        playernameAlbl = new javax.swing.JLabel();
        playernameBlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addPlayersbtn = new javax.swing.JButton();
        scoardplayerlbl = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teama.setText("Team A");

        teamb.setText("Team B");

        teamnameA.setText("team A");

        teamnameB.setText("team B");

        playername_1.setText("name_A1");
        playername_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playername_1ActionPerformed(evt);
            }
        });
        playername_1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                playername_1PropertyChange(evt);
            }
        });

        playername_3.setText("name_A2");

        playername_2.setText("name_B1");

        playername_4.setText("name_B2");

        teamnamelbl.setText("Team Name :");

        playernameAlbl.setText("Player A:");

        playernameBlbl.setText("Player B:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teamnamelbl)
                            .addComponent(playernameAlbl)
                            .addComponent(playernameBlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teama)
                            .addComponent(teamnameA)
                            .addComponent(playername_1)
                            .addComponent(playername_3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playername_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playername_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamnameB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teamb))))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {playername_1, playername_2, playername_3, playername_4, teamnameA, teamnameB});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamb)
                    .addComponent(teama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamnameB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamnameA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamnamelbl))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playername_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playername_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playernameAlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playername_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playername_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playernameBlbl))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {playername_1, playername_2, playername_3, playername_4, teamnameA, teamnameB});

        addPlayersbtn.setText("OK");
        addPlayersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayersbtnActionPerformed(evt);
            }
        });

        scoardplayerlbl.setFont(new java.awt.Font("Dialog", 1, 18));
        scoardplayerlbl.setText("Scoard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(scoardplayerlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(addPlayersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(scoardplayerlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addPlayersbtn)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlayersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayersbtnActionPerformed
       
        if(!"".equals(teamnameA.getText()) && !"".equals(teamnameB.getText())){ //check if team name are determined
            dartsboard = new ScoardField();
            teamA = new ScoardTeam(teamnameA.getText(),dartsboard);
            dartsboard.setlblA(teamnameA.getText());
            teamB = new ScoardTeam(teamnameB.getText(),dartsboard);
            dartsboard.setlblB(teamnameB.getText());
            
            if(!playername_1.getText().equals("")) 
                teamA.addPlayer(playername_1.getText());
            System.out.println(teamA.displayStatus());
            if(!playername_2.getText().equals("")) 
                teamB.addPlayer(playername_2.getText());
            System.out.println(teamB.displayStatus());
            if(!playername_3.getText().equals("")) teamA.addPlayer(playername_3.getText());
            if(!playername_4.getText().equals("")) teamB.addPlayer(playername_4.getText());
            game.register(teamA, teamB);
            game.setDartsboard(dartsboard);
            dartsboard.startgame(game);
            dartsboard.setVisible(true);
            setVisible(false);
        }
        else{}
         
    }//GEN-LAST:event_addPlayersbtnActionPerformed



    private void playername_1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_playername_1PropertyChange
        
        String property = evt.getPropertyName();
        if ("text".equals(property)) {
            System.out.println(evt.getNewValue());
          //button2.setBackground((Color) propertyChangeEvent.getNewValue());
        }
    }//GEN-LAST:event_playername_1PropertyChange

    private void playername_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playername_1ActionPerformed
        //playername_1
          System.out.println("oo");      

    }//GEN-LAST:event_playername_1ActionPerformed


   // public static void main(String[] args){
     //   new PlayerBoard();
    //}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlayersbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel playernameAlbl;
    private javax.swing.JLabel playernameBlbl;
    private javax.swing.JTextField playername_1;
    private javax.swing.JTextField playername_2;
    private javax.swing.JTextField playername_3;
    private javax.swing.JTextField playername_4;
    private javax.swing.JLabel scoardplayerlbl;
    private javax.swing.JLabel teama;
    private javax.swing.JLabel teamb;
    private javax.swing.JTextField teamnameA;
    private javax.swing.JTextField teamnameB;
    private javax.swing.JLabel teamnamelbl;
    // End of variables declaration//GEN-END:variables
}

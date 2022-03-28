/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package feuxAT;

import java.awt.Color;
import javax.swing.Timer;

/**
 *
 * @author topin
 */
public class FeuxAT extends javax.swing.JFrame {

    // ON MODE
    private final int ON_R = 2000;
    private final int ON_RO = 1000;
    private final int ON_G = 1000;
    private final int ON_O = 1500;
    
    private Timer timerON_R = new Timer(ON_R, (ae) -> { cbTimerON_R(); });
    private Timer timerON_RO = new Timer(ON_RO, (ae) -> { cbTimerON_RO(); });
    private Timer timerON_G = new Timer(ON_G, (ae) -> { cbTimerON_G(); });
    private Timer timerON_O = new Timer(ON_O, (ae) -> { cbTimerON_O(); });
    
    // HS MODE
    private final int HS_O = 1000;
    private final int HS_OFF = 500;
    
    private Timer timerHS_O = new Timer(HS_O, (ae) -> { cbTimerHS_O(); });
    private Timer timerHS_OFF = new Timer(HS_OFF, (ae) -> { cbTimerHS_OFF(); });
   
    // CALL BACK TIMERS
    private void cbTimerON_R() {
        switch (state) {
            case OFF:
                break;
            case R:
                state = State.RO;
                turnRedOrange();
                turnTimerON_RO();
                break;
            case RO:
                break;
            case G:
                break;
            case O:
                break;
            case HS_O:
                break;
            case HS_OFF:
                break;
        }
    }
    private void cbTimerON_RO() {
        switch (state) {
            case OFF:
                break;
            case R:
                break;
            case RO:
                state = State.G;
                turnGreen();
                turnTimerON_G();
                break;
            case G:
                break;
            case O:
                break;
            case HS_O:
                break;
            case HS_OFF:
                break;
        }
        
    }
    private void cbTimerON_G() {
        switch (state) {
            case OFF:
                break;
            case R:
                break;
            case RO:
                break;
            case G:
                state = State.O;
                turnOrange();
                turnTimerON_O();
                break;
            case O:
                break;
            case HS_O:
                break;
            case HS_OFF:
                break;
        }
    }
    private void cbTimerON_O() {
        switch (state) {
            case OFF:
                break;
            case R:
                break;
            case RO:
                break;
            case G:
                break;
            case O:
                state = State.R;
                turnRed();
                turnTimerON_R();
                break;
            case HS_O:
                break;
            case HS_OFF:
                break;
        } 
    }
    private void cbTimerHS_O() {
        switch (state) {
            case OFF:
                break;
            case R:
                break;
            case RO:
                break;
            case G:
                break;
            case O:
                break;
            case HS_O:
                state = State.HS_OFF;
                turnOff();
                turnTimerHS_OFF();
                break;
            case HS_OFF:
                break;
        } 
    }
    private void cbTimerHS_OFF() {
        switch (state) {
            case OFF:
                break;
            case R:
                break;
            case RO:
                break;
            case G:
                break;
            case O:
                break;
            case HS_O:
                break;
            case HS_OFF:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                break;
        } 
    }

    // STATES
    private enum State {
        OFF, R, RO, G, O, HS_O, HS_OFF
    }
    private State state;
    
    // FONCTIONS IHM
    private void turnRed() {
        panRed.setBackground(Color.RED);
        panOrange.setBackground(Color.WHITE);
        panGreen.setBackground(Color.WHITE);
    }
    private void turnRedOrange() {
        panRed.setBackground(Color.RED);
        panOrange.setBackground(Color.ORANGE);
        panGreen.setBackground(Color.WHITE);
    }
    private void turnOrange() {
        panRed.setBackground(Color.WHITE);
        panOrange.setBackground(Color.ORANGE);
        panGreen.setBackground(Color.WHITE);
    }
    private void turnGreen() {
        panRed.setBackground(Color.WHITE);
        panOrange.setBackground(Color.WHITE);
        panGreen.setBackground(Color.GREEN);
    }
    private void turnOff() {
        panRed.setBackground(Color.WHITE);
        panOrange.setBackground(Color.WHITE);
        panGreen.setBackground(Color.WHITE);
    }   
    
    // FONCTIONS TIMERS
    private void turnTimerON_R(){
        timerON_R.start();
        timerON_RO.stop();
        timerON_G.stop();
        timerON_O.stop();
        timerHS_O.stop();
        timerHS_OFF.stop();
    }
    private void turnTimerON_RO(){
        timerON_R.stop();
        timerON_RO.start();
        timerON_G.stop();
        timerON_O.stop();
        timerHS_O.stop();
        timerHS_OFF.stop();
    }
    private void turnTimerON_G(){
        timerON_R.stop();
        timerON_RO.stop();
        timerON_G.start();
        timerON_O.stop();
        timerHS_O.stop();
        timerHS_OFF.stop();
    }
    private void turnTimerON_O(){
        timerON_R.stop();
        timerON_RO.stop();
        timerON_G.stop();
        timerON_O.start();
        timerHS_O.stop();
        timerHS_OFF.stop();
    }
    private void turnTimerHS_O(){
        timerON_R.stop();
        timerON_RO.stop();
        timerON_G.stop();
        timerON_O.stop();
        timerHS_O.start();
        timerHS_OFF.stop();
    }
    private void turnTimerHS_OFF(){
        timerON_R.stop();
        timerON_RO.stop();
        timerON_G.stop();
        timerON_O.stop();
        timerHS_O.stop();
        timerHS_OFF.start();
    }
    private void turnTimerOFF() {
        timerON_R.stop();
        timerON_RO.stop();
        timerON_G.stop();
        timerON_O.stop();
        timerHS_O.stop();
        timerHS_OFF.stop();
    }
    
    /**
     * Creates new form FeuxFR
     */
    public FeuxAT() {
        initComponents();
        state = State.OFF;
        turnOff();
        butMarche.setEnabled(true);
        butArret.setEnabled(false);
        butPanne.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panRed = new javax.swing.JPanel();
        panOrange = new javax.swing.JPanel();
        panGreen = new javax.swing.JPanel();
        butArret = new javax.swing.JButton();
        butMarche = new javax.swing.JButton();
        butPanne = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panRed.setBackground(new java.awt.Color(255, 255, 255));
        panRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panRedLayout = new javax.swing.GroupLayout(panRed);
        panRed.setLayout(panRedLayout);
        panRedLayout.setHorizontalGroup(
            panRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panRedLayout.setVerticalGroup(
            panRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        panOrange.setBackground(new java.awt.Color(255, 255, 255));
        panOrange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panOrangeLayout = new javax.swing.GroupLayout(panOrange);
        panOrange.setLayout(panOrangeLayout);
        panOrangeLayout.setHorizontalGroup(
            panOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panOrangeLayout.setVerticalGroup(
            panOrangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        panGreen.setBackground(new java.awt.Color(255, 255, 255));
        panGreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panGreenLayout = new javax.swing.GroupLayout(panGreen);
        panGreen.setLayout(panGreenLayout);
        panGreenLayout.setHorizontalGroup(
            panGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panGreenLayout.setVerticalGroup(
            panGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        butArret.setText("Arrêt");
        butArret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butArretActionPerformed(evt);
            }
        });

        butMarche.setText("Marche");
        butMarche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMarcheActionPerformed(evt);
            }
        });

        butPanne.setText("Panne");
        butPanne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPanneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butArret)
                    .addComponent(butMarche)
                    .addComponent(butPanne))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butMarche))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panOrange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butArret))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPanne))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void butMarcheActionPerformed(java.awt.event.ActionEvent evt) {                                          
        switch (state) {
            case OFF:
                state = State.R;
                turnRed();
                turnTimerON_R();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
            case R:
                break;
            case RO:
                break;
            case G:
                break;
            case O:
                break;
            case HS_O:
                state = State.R;
                turnRed();
                turnTimerON_R();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
            case HS_OFF:
                state = State.R;
                turnRed();
                turnTimerON_R();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
        } 
    }                                         

    private void butArretActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch (state) {
            case OFF:
                break;
            case R:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case RO:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case G:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case O:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case HS_O:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case HS_OFF:
                state = State.OFF;
                turnOff();
                turnTimerOFF();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
        } 
    }                                        

    private void butPanneActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch (state) {
            case OFF:
                break;
            case R:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case RO:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case G:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case O:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case HS_O:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case HS_OFF:
                state = State.HS_O;
                turnOrange();
                turnTimerHS_O();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
        } 
    }                                        

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
            java.util.logging.Logger.getLogger(FeuxAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeuxAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeuxAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeuxAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuxAT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton butArret;
    private javax.swing.JButton butMarche;
    private javax.swing.JButton butPanne;
    private javax.swing.JPanel panGreen;
    private javax.swing.JPanel panOrange;
    private javax.swing.JPanel panRed;
    // End of variables declaration                   
}

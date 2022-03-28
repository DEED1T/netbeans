/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 

 package com.isi.tp2;*/

package feuxFR;

import java.awt.Color;
import javax.swing.Timer;

/**
 *
 * @author topin
 */
public class FeuxFr extends javax.swing.JFrame {

    private final int TIME_RED = 2000;
    private final int TIME_ORANGE = 1500;
    private final int TIME_GREEN = 3000;
    private final int TIME_HS_ORANGE = 1000;
    private final int TIME_HS_WHITE = 500;

    // E0 -> Off
    // E1 -> Red
    // E2 -> Orange
    // E3 -> Green
    // E4 -> HS Orange
    // E5 -> HS Off
    private enum State {
        E0, E1, E2, E3, E4, E5
    }
    private State state;
    
    private Timer timerRED = new Timer(TIME_RED, (ae) -> { cbTimerRED(); });
    private Timer timerORANGE = new Timer(TIME_ORANGE, (ae) -> { cbTimerORANGE(); });
    private Timer timerGREEN = new Timer(TIME_GREEN, (ae) -> { cbTimerGREEN(); });
    private Timer timerHS_ORANGE = new Timer(TIME_HS_ORANGE, (ae) -> { cbTimerHS_ORANGE(); });
    private Timer timerHS_WHITE = new Timer(TIME_HS_WHITE, (ae) -> { cbTimerHS_WHITE(); });

    /**
     * Creates new form FeuxFR
     */
    public FeuxFr() {
        initComponents();
        state = State.E0;
        turnOff();
        butMarche.setEnabled(true);
        butArret.setEnabled(false);
        butPanne.setEnabled(false);
    }

    private void turnRed() {
        panRed.setBackground(Color.RED);
        panOrange.setBackground(Color.WHITE);
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
    
    private void cbTimerRED() {
        switch (state) {
            case E0:
                break;
            case E1:
                state = State.E3;
                turnGreen();
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.start();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                break;
            case E2:
                break;
            case E3:
                break;
            case E4:
                break;
            case E5:
                break;
        }       
    }  
    private void cbTimerORANGE() {
        switch (state) {
            case E0:
                break;
            case E1:
                break;
            case E2:
                state = State.E1;
                turnRed();
                
                timerRED.start();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                break;
            case E3:
                break;
            case E4:
                break;
            case E5:
                break;
        }        
    }
    private void cbTimerGREEN() {
        switch (state) {
            case E0:
                break;
            case E1:
                break;
            case E2:
                break;
            case E3:
                state = State.E2;
                turnOrange();
                
                timerRED.stop();
                timerORANGE.start();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                break;
            case E4:
                break;
            case E5:
                break;
        }     
    }
    private void cbTimerHS_ORANGE() {
        switch (state) {
            case E0:
                break;
            case E1:
                break;
            case E2:
                break;
            case E3:
                break;
            case E4:
                state = State.E5;
                turnOff();
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.start();
                break;
            case E5:
                break;
        }     
    }
    private void cbTimerHS_WHITE() {
        switch (state) {
            case E0:
                break;
            case E1:
                break;
            case E2:
                break;
            case E3:
                break;
            case E4:
                break;
            case E5:
                state = State.E4;
                turnOrange();
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.start();
                timerHS_WHITE.stop();
                break;
        }     
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
            case E0:
                state = State.E1;
                turnRed(); 
                 
                
                timerRED.start();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
            case E1:
                break;
            case E2:
                break;
            case E3:
                break;
            case E4:
                state = State.E1;
                turnRed(); 
                 
                
                timerRED.start();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
            case E5:
                state = State.E1;
                turnRed(); 
                 
                
                timerRED.start();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(false);
                butArret.setEnabled(true);
                butPanne.setEnabled(true);
                break;
        }
    }                                         

    private void butArretActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch (state) {
            case E0:
                break;
            case E1:
                state = State.E0;
                turnOff(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case E2:
                state = State.E0;
                turnOff(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case E3:
                state = State.E0;
                turnOff(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case E4:
                state = State.E0;
                turnOff(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
            case E5:
                state = State.E0;
                turnOff(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.stop();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(false);
                butPanne.setEnabled(false);
                break;
        }
    }                                        

    private void butPanneActionPerformed(java.awt.event.ActionEvent evt) {                                         
        switch (state) {
            case E0:
                break;
            case E1:
                state = State.E4;
                turnOrange(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.start();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case E2:
                state = State.E4;
                turnOrange(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.start();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case E3:
                state = State.E4;
                turnOrange(); 
                 
                
                timerRED.stop();
                timerORANGE.stop();
                timerGREEN.stop();
                timerHS_ORANGE.start();
                timerHS_WHITE.stop();
                
                butMarche.setEnabled(true);
                butArret.setEnabled(true);
                butPanne.setEnabled(false);
                break;
            case E4:
                break;
            case E5:
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
            java.util.logging.Logger.getLogger(FeuxFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeuxFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeuxFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeuxFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeuxFr().setVisible(true);
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

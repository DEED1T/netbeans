package compteurAvanceRecule;

import compteur.*;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author lazaa
 */
public class AvanceRecule extends javax.swing.JFrame {

    private enum State {
        INIT,
        COMPTEAV,
        COMPTEREC
    }

    int compte = 0;

    Timer timer = new Timer(1000, (e) -> {
        timerActionPerformed(e);
    });
    private State etat;

    /**
     * Creates new form NewJFrame
     */
    public AvanceRecule() {
        etat = State.INIT;
        initComponents();
        activerInit();
        jLabel1.setText(Integer.toString(compte));

    }

    public void activerInit() {
        start.setEnabled(true);
        stop.setEnabled(false);
        avance.setEnabled(false);
        recule.setEnabled(false);
        timer.stop();
    }

    public void activerCompteAVANCE() {
        start.setEnabled(false);
        stop.setEnabled(true);
        avance.setEnabled(false);
        recule.setEnabled(true);
        timer.start();

    }

    public void activerCompteRECULE() {
        start.setEnabled(false);
        stop.setEnabled(true);
        avance.setEnabled(true);
        recule.setEnabled(false);
        timer.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        avance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        recule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        avance.setText("Avance");
        avance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanceActionPerformed(evt);
            }
        });

        jLabel1.setText("0");

        recule.setText("Recule");
        recule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reculeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(start)
                        .addGap(18, 18, 18)
                        .addComponent(avance)
                        .addGap(18, 18, 18)
                        .addComponent(recule)
                        .addGap(16, 16, 16)
                        .addComponent(stop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(stop)
                    .addComponent(avance)
                    .addComponent(recule))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        switch (etat) {
            case INIT:
                etat = State.COMPTEAV;
                activerCompteAVANCE();
                compte = 0;
                jLabel1.setText(Integer.toString(compte));
                break;
            case COMPTEAV:
                //interdit
                break;
            case COMPTEREC:
                //interdit
                break;
        }

    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        switch (etat) {
            case INIT:
                //interdit
                break;
            case COMPTEAV:
                etat = State.INIT;
                activerInit();
                jLabel1.setText("Pouf");
                break;
            case COMPTEREC:
                etat = State.INIT;
                activerInit();
                jLabel1.setText("Pouf");
                break;

        }
    }//GEN-LAST:event_stopActionPerformed

    private void avanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanceActionPerformed
        switch (etat) {
            case INIT:
                //interdit
                break;
            case COMPTEAV:
                //interdit
                break;
            case COMPTEREC:
                etat = State.COMPTEAV;
                activerCompteAVANCE();
                break;
        }
    }//GEN-LAST:event_avanceActionPerformed

    private void reculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reculeActionPerformed
        switch (etat) {
            case INIT:
                //interdit
                break;
            case COMPTEAV:
                etat = State.COMPTEREC;
                activerCompteRECULE();
                break;
            case COMPTEREC:
                break;
        }
    }//GEN-LAST:event_reculeActionPerformed

    private void timerActionPerformed(java.awt.event.ActionEvent evt) {
        switch (etat) {
            case INIT:
                //interdit
                break;
            case COMPTEAV:
                if (compte < 10) {
                    etat = State.COMPTEAV;
                    activerCompteAVANCE();
                    compte++;
                    jLabel1.setText(Integer.toString(compte));
                } else {
                    etat = State.INIT;
                    activerInit();
                    jLabel1.setText("Pouf");
                    compte = 0;
                }

                break;
            case COMPTEREC:
                if (compte > 1) {
                    etat = State.COMPTEREC;
                    activerCompteRECULE();
                    compte--;
                    jLabel1.setText(Integer.toString(compte));
                } else {
                    etat = State.INIT;
                    activerInit();
                    jLabel1.setText("Pouf");
                    compte = 0;
                }

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
            java.util.logging.Logger.getLogger(Compteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvanceRecule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton recule;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}

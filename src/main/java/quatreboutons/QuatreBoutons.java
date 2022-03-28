/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quatreboutons;

/**
 *
 * @author Lazaar Hamdi
 */
public class QuatreBoutons extends javax.swing.JFrame {
    
    private enum State {
        PRINTEMPS,
        ETE,
        AUTOMNE,
        HIVER
    }
    
    private State etat;
    
    public QuatreBoutons() {
        etat = State.HIVER;
        initComponents();
        activerHiver();
    }
    
    private void activerPrintemps(){
        printempsButton.setEnabled(false);
        eteButton.setEnabled(true);
        automneButton.setEnabled(false);
        hiverButton.setEnabled(false);
    }
    
    private void activerEte(){
        printempsButton.setEnabled(false);
        eteButton.setEnabled(false);
        automneButton.setEnabled(true);
        hiverButton.setEnabled(false);
    }
    
    private void activerAutomne(){
        printempsButton.setEnabled(false);
        eteButton.setEnabled(false);
        automneButton.setEnabled(false);
        hiverButton.setEnabled(true);
    }
    
    private void activerHiver(){
        printempsButton.setEnabled(true);
        eteButton.setEnabled(false);
        automneButton.setEnabled(false);
        hiverButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printempsButton = new javax.swing.JButton();
        eteButton = new javax.swing.JButton();
        automneButton = new javax.swing.JButton();
        hiverButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        printempsButton.setText("Printemps");
        printempsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printempsButtonActionPerformed(evt);
            }
        });

        eteButton.setText("Été");
        eteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eteButtonActionPerformed(evt);
            }
        });

        automneButton.setText("Automne");
        automneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automneButtonActionPerformed(evt);
            }
        });

        hiverButton.setText("Hiver");
        hiverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(printempsButton)
                    .addComponent(automneButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eteButton)
                    .addComponent(hiverButton))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printempsButton)
                    .addComponent(eteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(automneButton)
                    .addComponent(hiverButton))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printempsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printempsButtonActionPerformed
        switch(etat){
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                //interdit
            case HIVER:
                etat = State.PRINTEMPS;
                activerPrintemps();
                break;
        }
    }//GEN-LAST:event_printempsButtonActionPerformed

    private void eteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eteButtonActionPerformed
        switch(etat){
            case PRINTEMPS:
                etat = State.ETE;
                activerEte();
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                //interdit
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_eteButtonActionPerformed

    private void automneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automneButtonActionPerformed
        switch(etat){
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                etat = State.AUTOMNE;
                activerAutomne();
                break;
            case AUTOMNE:
                break;
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_automneButtonActionPerformed

    private void hiverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiverButtonActionPerformed
        switch(etat){
            case PRINTEMPS:
                //interdit
                break;
            case ETE:
                //interdit
                break;
            case AUTOMNE:
                etat = State.HIVER;
                activerHiver();
                break;
            case HIVER:
                //interdit
                break;
        }
    }//GEN-LAST:event_hiverButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuatreBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuatreBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuatreBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuatreBoutons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuatreBoutons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton automneButton;
    private javax.swing.JButton eteButton;
    private javax.swing.JButton hiverButton;
    private javax.swing.JButton printempsButton;
    // End of variables declaration//GEN-END:variables
}

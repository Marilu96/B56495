/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.applet.AudioClip;

/**
 *
 * @author Usuario
 */
public class FRM_Perdiste extends javax.swing.JFrame {

    FRM_Inicio frm_Inicio;
    AudioClip audioPerdiste;
    public FRM_Perdiste() {
        initComponents();
        this.setSize(600, 600);
        setLocation(400, 100);
        audioPerdiste = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/risa_Nelson_los_simpson_latino_.wav"));
        audioPerdiste.play();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Home = new javax.swing.JButton();
        jl_Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jl_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.gif"))); // NOI18N
        jl_Home.setActionCommand("home");
        jl_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jl_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(jl_Home);
        jl_Home.setBounds(120, 320, 84, 52);

        jl_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.jpg"))); // NOI18N
        jl_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jl_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(jl_Exit);
        jl_Exit.setBounds(290, 320, 73, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perdiste.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jl_HomeActionPerformed
        System.exit(0);
        frm_Inicio.setVisible(true);

    }//GEN-LAST:event_jl_HomeActionPerformed

    private void jl_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jl_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jl_ExitActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jl_Exit;
    private javax.swing.JButton jl_Home;
    // End of variables declaration//GEN-END:variables
}

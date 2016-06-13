/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.applet.AudioClip;
import javax.swing.ImageIcon;
import modelo.Hilo;

/**
 *
 * @author Usuario
 */
public class FRM_Juego extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Juego
     */
    
    Hilo hilo;
    FRM_Ganaste frm_Ganaste;
    FRM_Perdiste frm_Perdiste;
     public String estado = "";
     public String arriba = "arriba";
     public String abajo = "abajo";
     String colision ="";
     int contador =0;
     int contador2 =0;
     AudioClip doh;
     int metros=0;
     int disminuirVida=0;
     
     
    public FRM_Juego() {
        initComponents();
        setLocation(450,100);
        personaje.setLocation(100, 200);
        jl_Obst1.setLocation(500,200);
        jl_Obst2.setLocation(900,370);
        jl_Obst3.setLocation(2000, 120);
        jl_Obst4.setLocation(2800, 350);
        hilo = new Hilo(this);
        frm_Ganaste = new FRM_Ganaste();
       // frm_Perdiste = new FRM_Perdiste();
        doh= java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Homer_-_D_OH_.wav"));
        jProgressBar1.setValue(100);
        

    }
    
    public void metodoMetros()
    {
        metros++;
        if(metros==10)
        {
            this.jl_NumeroMetros.setText((Integer.parseInt(jl_NumeroMetros.getText())+1)+"");
            metros=0;
        }
    }
        
    public void moverFondo()
    {
        if(jl_FondoSprinfield.getX()>-350)
            jl_FondoSprinfield.setLocation(jl_FondoSprinfield.getX()-5, jl_FondoSprinfield.getY());
        
        else
            jl_FondoSprinfield.setLocation(0,jl_FondoSprinfield.getY());
    }
   
    
     public void subiendoPersonaje()
    {
        this.personaje.setLocation(personaje.getX(), personaje.getY()-100);
    }
     public void bajandoPersonaje()
    {
        this.personaje.setLocation(personaje.getX(), personaje.getY()+100);
    }
        
     public void limite()
     {
         if(personaje.getY()<=80)
         {
             personaje.setLocation(personaje.getX(), 100);
         }
         if(personaje.getY()>=350)
         {
             personaje.setLocation(personaje.getX(), 350);

         }
         
     }
     
     public void ganaste()
     {
         if(metros==10)
         {
             this.dispose();
             frm_Ganaste.setVisible(true);
             
         }
     }
     
//     public void disminuirVida()
//     {
//         if(colision.equals("Colision"))
//         {
//             jProgressBar1.setValue(100-disminuirVida);
//             jl_porcentajevida.setText("Vida restante"+"%");
//         }
//         frm_Perdiste.setVisible(true);
//         this.dispose();
//         hilo.stop();
//        
//     }
     
   
     ////////////Obstaculo 1/////////////////////
    
      public void moverObstaculo1()
      {
          
          if(jl_Obst1.getX()+200<0)
          {
              jl_Obst1.setLocation(650, jl_Obst1.getY());
              contador+=-2;
          }
          else
          {
              jl_Obst1.setLocation(jl_Obst1.getX()-15+contador, jl_Obst1.getY());
              
          }
           
      } 
      
      
    
       public void comprobarColision1()
     {
//         if(personaje.getX()+50>jl_Obst1.getX()&&jl_Obst1.getX()+50>personaje.getX()&&personaje.getY()+50>jl_Obst1.getY())
//         {
//             System.out.println("Colisión!!!");
//             doh.play();
//
//         }
         
         if(estado.equalsIgnoreCase("Subiendo")&& personaje.getX()+160>jl_Obst1.getX()&& personaje.getX()-100<jl_Obst1.getX())
         {
             System.out.println("Colisión!!!");
             doh.play();
            
         }
     }
      
      /////////////Obstaculo 2///////////////////
       public void moverObstaculo2()
      {
          if(jl_Obst2.getX()>-50)
          {
              jl_Obst2.setLocation(jl_Obst2.getX()-15, jl_Obst2.getY());
              contador2+=-2;
              
          }

          else
              jl_Obst2.setLocation(700,jl_Obst2.getY());
      } 
     public void comprobarColision2()
     {
         if(personaje.getX()+50>jl_Obst2.getX()&&jl_Obst2.getX()+50>personaje.getX()&&personaje.getY()+50>jl_Obst2.getY())
         {
             System.out.println("Colisión!!!");
             doh.play();
         }
         
     }
      /////////////Obstaculo 3///////////////////
       public void moverObstaculo3()
      {
          if(jl_Obst3.getX()>-50)
              jl_Obst3.setLocation(jl_Obst3.getX()-15, jl_Obst3.getY());

          else
              jl_Obst3.setLocation(800,jl_Obst3.getY());
      } 
     public void comprobarColision3()
     {
         if(personaje.getX()+50>jl_Obst3.getX()&&jl_Obst3.getX()+50>personaje.getX()&&personaje.getY()+50>jl_Obst3.getY())
         {
             System.out.println("Colisión!!!");
             doh.play();
         }
     } /////////////Obstaculo 4///////////////////
       public void moverObstaculo4()
      {
          if(jl_Obst4.getX()>-50)
              jl_Obst4.setLocation(jl_Obst4.getX()-15, jl_Obst4.getY());

          else
              jl_Obst4.setLocation(900,jl_Obst4.getY());
      } 
     public void comprobarColision4()
     {
         if(personaje.getX()+50>jl_Obst4.getX()&&jl_Obst4.getX()+50>personaje.getX()&&personaje.getY()+50>jl_Obst4.getY())
         {
             System.out.println("Colisión!!!");
             doh.play();
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

        personaje = new javax.swing.JLabel();
        jl_Obst1 = new javax.swing.JLabel();
        jl_Obst2 = new javax.swing.JLabel();
        jl_Obst3 = new javax.swing.JLabel();
        jl_Obst4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jl_NumeroMetros = new javax.swing.JLabel();
        jl_Metros = new javax.swing.JLabel();
        jl_porcentajevida = new javax.swing.JLabel();
        jl_Vida = new javax.swing.JLabel();
        jl_FondoSprinfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¡AY! ¡¡LOS FRIJOLES!!");
        setPreferredSize(new java.awt.Dimension(600, 548));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/homero.gif"))); // NOI18N
        getContentPane().add(personaje);
        personaje.setBounds(30, 150, 140, 150);

        jl_Obst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/12.png"))); // NOI18N
        getContentPane().add(jl_Obst1);
        jl_Obst1.setBounds(200, 140, 250, 90);

        jl_Obst2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11.png"))); // NOI18N
        getContentPane().add(jl_Obst2);
        jl_Obst2.setBounds(710, 390, 250, 80);

        jl_Obst3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/111.png"))); // NOI18N
        getContentPane().add(jl_Obst3);
        jl_Obst3.setBounds(1070, 240, 250, 100);

        jl_Obst4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bus.png"))); // NOI18N
        getContentPane().add(jl_Obst4);
        jl_Obst4.setBounds(1430, 380, 250, 100);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(280, 10, 170, 30);

        jl_NumeroMetros.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jl_NumeroMetros.setForeground(new java.awt.Color(153, 0, 153));
        jl_NumeroMetros.setText("0");
        getContentPane().add(jl_NumeroMetros);
        jl_NumeroMetros.setBounds(150, 15, 60, 20);

        jl_Metros.setFont(new java.awt.Font("FangSong", 3, 36)); // NOI18N
        jl_Metros.setForeground(new java.awt.Color(153, 0, 153));
        jl_Metros.setText("Metros:");
        getContentPane().add(jl_Metros);
        jl_Metros.setBounds(0, 0, 170, 40);
        getContentPane().add(jl_porcentajevida);
        jl_porcentajevida.setBounds(334, 15, 70, 20);

        jl_Vida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/heart7plz.gif"))); // NOI18N
        getContentPane().add(jl_Vida);
        jl_Vida.setBounds(230, 10, 50, 40);

        jl_FondoSprinfield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sp3.png"))); // NOI18N
        getContentPane().add(jl_FondoSprinfield);
        jl_FondoSprinfield.setBounds(0, -50, 3000, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==38)
        {   
                 estado = "Subiendo";
                 System.out.println(estado);
        }
       if(evt.getKeyCode()==40)
        {
            estado = "Bajando";
                             System.out.println(estado);
        }
        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRM_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRM_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRM_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRM_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRM_Juego().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jl_FondoSprinfield;
    private javax.swing.JLabel jl_Metros;
    private javax.swing.JLabel jl_NumeroMetros;
    private javax.swing.JLabel jl_Obst1;
    private javax.swing.JLabel jl_Obst2;
    private javax.swing.JLabel jl_Obst3;
    private javax.swing.JLabel jl_Obst4;
    private javax.swing.JLabel jl_Vida;
    private javax.swing.JLabel jl_porcentajevida;
    public javax.swing.JLabel personaje;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Login;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mario-PC
 * @version 190130.0_1
 */
public class LoginMain extends javax.swing.JDialog {

    /**
     * Creates new form LoginMain
     */
    public LoginMain() {
        configurarVentana();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lUsuario = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        etUsuario = new javax.swing.JTextField();
        edClave = new javax.swing.JTextField();
        lClave = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        relojDigital1 = new rubio_avila_mario_di03_tarea_componente.RelojDigital();
        lTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setName("LoginMain"); // NOI18N
        setResizable(false);

        lUsuario.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lUsuario.setText("Usuario :");

        bEntrar.setText("Entrar");
        bEntrar.setToolTipText("Pulse para logearse");
        bEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bEntrarMousePressed(evt);
            }
        });

        etUsuario.setForeground(new java.awt.Color(0, 51, 204));
        etUsuario.setToolTipText("Introduzca su usuario");
        etUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                etUsuarioFocusGained(evt);
            }
        });

        edClave.setForeground(new java.awt.Color(0, 51, 204));
        edClave.setToolTipText("Introduzca su password");

        lClave.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lClave.setForeground(new java.awt.Color(204, 204, 204));
        lClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lClave.setText("Clave :");
        lClave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        bSalir.setText("Salir");
        bSalir.setToolTipText("Salir sin logearse");
        bSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bSalirMousePressed(evt);
            }
        });
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        relojDigital1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        relojDigital1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lTitulo.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("LOGIN");
        lTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edClave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(relojDigital1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(17, 17, 17)
                .addComponent(relojDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(etUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClave)
                    .addComponent(edClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEntrar)
                    .addComponent(bSalir))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMousePressed
        this.dispose();
    }//GEN-LAST:event_bSalirMousePressed

    private void bEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEntrarMousePressed
        validaLogin();
    }//GEN-LAST:event_bEntrarMousePressed

    private void etUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etUsuarioFocusGained
        this.etUsuario.setText("");
    }//GEN-LAST:event_etUsuarioFocusGained

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }


    /**
     * Vamos a darle un toque guay al ejercicio
     */
    private JLabel lblBackgroundImage = new JLabel();
    private JPanel panel1;
    String background = "/res/background/bg_login.jpg";
    private void background(){
        //sets background image of panel
        //initializes panels and panel layout
        panel1 = new JPanel();
        lblBackgroundImage.setLayout(new FlowLayout());
        lblBackgroundImage.setIcon(new ImageIcon(background));
        panel1.add(lblBackgroundImage);
        validate();
    }//Fin de la decoracion
    
    //FUNCION PARA LA CONFIGURACION DE LA JDialog
    private void configurarVentana() {
        this.setTitle("Ejercicio 1: Login Menu");               // Titulo a la ventana
        this.setSize(350, 300);                                 // Tamanio a la ventana (ancho y alto)
        this.setLocationRelativeTo(null);                       // Centrar Ventana
        this.setLayout(null);                                   // Sin Layaut predeterminado
        this.setResizable(false);                               // Ventano no redimensionable
        this.setModal(true);                                    // La hacemos modal para que coja el foco
        //La siguiente linea es para meter el fondo
        this.setContentPane(new JLabel(new javax.swing.ImageIcon(getClass().getResource("/res/background/bg_login.jpg"))));
    }//Esto es para configurar la ventana 
    
    private void validaLogin() {//La clave de prueba es Mario//1234
        if (Login.validate(this.etUsuario.getText(), this.edClave.getText()))
            JOptionPane.showMessageDialog(this, "Acceso aceptado","Login Correctos",JOptionPane.INFORMATION_MESSAGE);
        else{
            JOptionPane.showMessageDialog(this,"Acceso denegado","Login Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSalir;
    private javax.swing.JTextField edClave;
    private javax.swing.JTextField etUsuario;
    private javax.swing.JLabel lClave;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lUsuario;
    private rubio_avila_mario_di03_tarea_componente.RelojDigital relojDigital1;
    // End of variables declaration//GEN-END:variables
}

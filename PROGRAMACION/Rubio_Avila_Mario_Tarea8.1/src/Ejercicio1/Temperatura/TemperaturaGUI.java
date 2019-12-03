/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Temperatura;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario-PC
 */
public class TemperaturaGUI extends javax.swing.JDialog {
    
    private temperaturas t1;
    
    /**
     * Creates new form TemperaturaGUI
     */
    public TemperaturaGUI(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.t1 = new temperaturas();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        bIngresar = new javax.swing.JButton();
        bRecalcular = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        eTempMedia = new java.awt.TextField();
        label1 = new java.awt.Label();
        tTmin = new java.awt.Label();
        eTempMin = new java.awt.TextField();
        tTmax = new java.awt.Label();
        eTempMax = new java.awt.TextField();
        lTitulo1 = new javax.swing.JLabel();
        eDia1 = new javax.swing.JTextField();
        lDia1 = new javax.swing.JLabel();
        eDia2 = new javax.swing.JTextField();
        lDia2 = new javax.swing.JLabel();
        eDia4 = new javax.swing.JTextField();
        eDia3 = new javax.swing.JTextField();
        lDia3 = new javax.swing.JLabel();
        lDia4 = new javax.swing.JLabel();
        eDia5 = new javax.swing.JTextField();
        lDia5 = new javax.swing.JLabel();
        lDia6 = new javax.swing.JLabel();
        eDia6 = new javax.swing.JTextField();
        lDia7 = new javax.swing.JLabel();
        eDia7 = new javax.swing.JTextField();
        lDia8 = new javax.swing.JLabel();
        eDia8 = new javax.swing.JTextField();
        lDia9 = new javax.swing.JLabel();
        eDia9 = new javax.swing.JTextField();
        lDia10 = new javax.swing.JLabel();
        eDia10 = new javax.swing.JTextField();

        lTitulo.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("LOGIN");
        lTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bIngresar.setText("Insertar Temperaturas");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        bRecalcular.setText("Recalcular Valores");
        bRecalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecalcularActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        eTempMedia.setEditable(false);
        eTempMedia.setText("0 �C");

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setText("T� Media");

        tTmin.setAlignment(java.awt.Label.RIGHT);
        tTmin.setText("T� Min");

        eTempMin.setEditable(false);
        eTempMin.setText("0 �C");

        tTmax.setAlignment(java.awt.Label.RIGHT);
        tTmax.setText("T� Max");

        eTempMax.setEditable(false);
        eTempMax.setText("0 �C");

        lTitulo1.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        lTitulo1.setForeground(new java.awt.Color(204, 204, 204));
        lTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo1.setText("TEMPERATURAS");
        lTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia1.setText(" ");
        eDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia1ActionPerformed(evt);
            }
        });

        lDia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia1.setText("DIA 1");
        lDia1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia2.setText(" ");
        eDia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia2ActionPerformed(evt);
            }
        });

        lDia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia2.setText("DIA 2");
        lDia2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia4.setText(" ");
        eDia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia4ActionPerformed(evt);
            }
        });

        eDia3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia3.setText(" ");
        eDia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia3ActionPerformed(evt);
            }
        });

        lDia3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia3.setText("DIA 3");
        lDia3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lDia4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia4.setText("DIA 4");
        lDia4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia5.setText(" ");
        eDia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia5ActionPerformed(evt);
            }
        });

        lDia5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia5.setText("DIA 5");
        lDia5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lDia6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia6.setText("DIA 6");
        lDia6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia6.setText(" ");
        eDia6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia6ActionPerformed(evt);
            }
        });

        lDia7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia7.setText("DIA 7");
        lDia7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia7.setText(" ");
        eDia7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia7ActionPerformed(evt);
            }
        });

        lDia8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia8.setText("DIA 8");
        lDia8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia8.setText(" ");
        eDia8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia8ActionPerformed(evt);
            }
        });

        lDia9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia9.setText("DIA 9");
        lDia9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia9.setText(" ");
        eDia9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia9ActionPerformed(evt);
            }
        });

        lDia10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDia10.setText("DIA 10");
        lDia10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eDia10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eDia10.setText(" ");
        eDia10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDia10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bRecalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tTmin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eTempMin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tTmax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eTempMax, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eTempMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia1)
                                    .addComponent(lDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia2)
                                    .addComponent(lDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia3)
                                    .addComponent(lDia3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia4)
                                    .addComponent(lDia4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia5)
                                    .addComponent(lDia5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia6)
                                    .addComponent(lDia6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia7)
                                    .addComponent(lDia7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia8)
                                    .addComponent(lDia8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia9)
                                    .addComponent(lDia9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eDia10)
                                    .addComponent(lDia10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lTitulo1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIngresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eTempMedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRecalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tTmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(eTempMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tTmax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eTempMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lDia5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eDia5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lDia9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eDia9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lDia10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eDia10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        float[] DialogTemps = new float[10];//Array tempertaturas
        for(int i = 0; i < DialogTemps.length; i++){
            try{
                String temperatura = JOptionPane.showInputDialog(this, "Indique la temperatura de la posicion "+ (i+1) +" : ","Ingrese temperatura",JOptionPane.QUESTION_MESSAGE);
                //if(temperatura == null || (temperatura != null && ("".equals(temperatura)))) return;    //Si no deseo nada a la calle
                DialogTemps[i] = (float)(Math.round(Float.parseFloat(temperatura) * 100d) / 100d);
            }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Cantidad no valida, Compruebe que no inserto un caracter o que la coma es '.'.","Error de valor no esperado",JOptionPane.ERROR_MESSAGE);
            }            
        }
        this.t1.setTemperaturas(DialogTemps);
        this.updateDatos();
    }//GEN-LAST:event_bIngresarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void eDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia1ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia1ActionPerformed

    private void eDia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia2ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia2ActionPerformed

    private void eDia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia4ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia4ActionPerformed

    private void eDia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia3ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia3ActionPerformed

    private void eDia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia5ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia5ActionPerformed

    private void eDia6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia6ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia6ActionPerformed

    private void eDia7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia7ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia7ActionPerformed

    private void eDia8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia8ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia8ActionPerformed

    private void eDia9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia9ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia9ActionPerformed

    private void eDia10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDia10ActionPerformed
        getDatos();
    }//GEN-LAST:event_eDia10ActionPerformed

    private void bRecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecalcularActionPerformed
        getDatos();
    }//GEN-LAST:event_bRecalcularActionPerformed

    /**
     * Actualiza todos los cuadros de texto
     */
    private void updateDatos(){
        eTempMax.setText(Float.toString(this.t1.getTempMaxima()));
        eTempMin.setText(Float.toString(this.t1.getTempMinima()));
        eTempMedia.setText(Float.toString(this.t1.getTempMedia()));
        eDia1.setText(Float.toString(this.t1.getTemperaturas()[0]));
        eDia2.setText(Float.toString(this.t1.getTemperaturas()[1]));
        eDia3.setText(Float.toString(this.t1.getTemperaturas()[2]));
        eDia4.setText(Float.toString(this.t1.getTemperaturas()[3]));
        eDia5.setText(Float.toString(this.t1.getTemperaturas()[4]));
        eDia6.setText(Float.toString(this.t1.getTemperaturas()[5]));
        eDia7.setText(Float.toString(this.t1.getTemperaturas()[6]));
        eDia8.setText(Float.toString(this.t1.getTemperaturas()[7]));
        eDia9.setText(Float.toString(this.t1.getTemperaturas()[8]));
        eDia10.setText(Float.toString(this.t1.getTemperaturas()[9]));       
    }
    
    private void getDatos(){
        float[] getTemps = new float[10];//Array tempertaturas
        try{
            getTemps[0] = Float.parseFloat(eDia1.getText());
            getTemps[1] = Float.parseFloat(eDia2.getText());
            getTemps[2] = Float.parseFloat(eDia3.getText());
            getTemps[3] = Float.parseFloat(eDia4.getText());
            getTemps[4] = Float.parseFloat(eDia5.getText());
            getTemps[5] = Float.parseFloat(eDia6.getText());
            getTemps[6] = Float.parseFloat(eDia7.getText());
            getTemps[7] = Float.parseFloat(eDia8.getText());
            getTemps[8] = Float.parseFloat(eDia9.getText());
            getTemps[9] = Float.parseFloat(eDia10.getText());
            for (float f : getTemps) System.out.println(f);
            this.t1.setTemperaturas(getTemps);
            this.updateDatos();        
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Cantidad no valida, Compruebe que no inserto un caracter o que la coma es '.'.","Error de valor no esperado",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TemperaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperaturaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TemperaturaGUI dialog = new TemperaturaGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bRecalcular;
    private javax.swing.JButton bSalir;
    private javax.swing.JTextField eDia1;
    private javax.swing.JTextField eDia10;
    private javax.swing.JTextField eDia2;
    private javax.swing.JTextField eDia3;
    private javax.swing.JTextField eDia4;
    private javax.swing.JTextField eDia5;
    private javax.swing.JTextField eDia6;
    private javax.swing.JTextField eDia7;
    private javax.swing.JTextField eDia8;
    private javax.swing.JTextField eDia9;
    private java.awt.TextField eTempMax;
    private java.awt.TextField eTempMedia;
    private java.awt.TextField eTempMin;
    private javax.swing.JLabel lDia1;
    private javax.swing.JLabel lDia10;
    private javax.swing.JLabel lDia2;
    private javax.swing.JLabel lDia3;
    private javax.swing.JLabel lDia4;
    private javax.swing.JLabel lDia5;
    private javax.swing.JLabel lDia6;
    private javax.swing.JLabel lDia7;
    private javax.swing.JLabel lDia8;
    private javax.swing.JLabel lDia9;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lTitulo1;
    private java.awt.Label label1;
    private java.awt.Label tTmax;
    private java.awt.Label tTmin;
    // End of variables declaration//GEN-END:variables
}
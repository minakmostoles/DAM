/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cifrado;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Mario-PC
 * @version 190212.0_12
 * Las clases encargadas de la encriptacion/desencriptacion guardado y carga de fichero son cogidas de la tarea anterior. El codigo nuevo solo se encuenta
 * aqui.
 * 
 */
public class CifradoMain extends javax.swing.JDialog {
    
    private final boolean MODEDEBUG = false; //Habilita ciertos mensajes del modo debug para la comprobacion y seguimiento del codigo
    private int nDesplazamiento = 3;
    
    /**
     * Creates new form CifradoMain
     */
    public CifradoMain() {
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

        jMenu1 = new javax.swing.JMenu();
        lTitulo = new javax.swing.JLabel();
        bCifrar = new javax.swing.JButton();
        bDescifrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        etTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        tbArchivo = new javax.swing.JMenu();
        tbAbrir = new javax.swing.JMenuItem();
        tbGuardar = new javax.swing.JMenuItem();
        tbSeparador = new javax.swing.JPopupMenu.Separator();
        tbLimpiar = new javax.swing.JMenuItem();
        tbSeparador1 = new javax.swing.JPopupMenu.Separator();
        tbSalir = new javax.swing.JMenuItem();
        tbCifrado = new javax.swing.JMenu();
        tbAccion = new javax.swing.JMenu();
        tbCifrar = new javax.swing.JMenuItem();
        tbDescifrar = new javax.swing.JMenuItem();
        tbDesplazamiento = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 0, 51));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("CIFRADO CESAR");
        lTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bCifrar.setText("Cifrar");
        bCifrar.setToolTipText("Cifra el contenido de abajo");
        bCifrar.setMaximumSize(new java.awt.Dimension(80, 25));
        bCifrar.setMinimumSize(new java.awt.Dimension(80, 25));
        bCifrar.setPreferredSize(new java.awt.Dimension(80, 25));
        bCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCifrarActionPerformed(evt);
            }
        });

        bDescifrar.setText("Descifrar");
        bDescifrar.setToolTipText("Descifra el contenido abajo");
        bDescifrar.setMaximumSize(new java.awt.Dimension(80, 25));
        bDescifrar.setMinimumSize(new java.awt.Dimension(80, 25));
        bDescifrar.setPreferredSize(new java.awt.Dimension(80, 25));
        bDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDescifrarActionPerformed(evt);
            }
        });

        etTexto.setColumns(20);
        etTexto.setRows(5);
        etTexto.setToolTipText("Aqui puede insertar el texto a cifrar o descifrar");
        jScrollPane1.setViewportView(etTexto);

        tbArchivo.setText("Archivo");

        tbAbrir.setText("Abrir");
        tbAbrir.setToolTipText("Permite cargar un fichero");
        tbAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbAbrirMousePressed(evt);
            }
        });
        tbArchivo.add(tbAbrir);

        tbGuardar.setText("Guardar");
        tbGuardar.setToolTipText("Permite guardar en un fichero");
        tbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbGuardarMousePressed(evt);
            }
        });
        tbArchivo.add(tbGuardar);
        tbArchivo.add(tbSeparador);

        tbLimpiar.setText("Limpiar");
        tbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbLimpiarActionPerformed(evt);
            }
        });
        tbArchivo.add(tbLimpiar);
        tbArchivo.add(tbSeparador1);

        tbSalir.setText("Salir");
        tbSalir.setToolTipText("Salir de la aplicacion");
        tbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbSalirMousePressed(evt);
            }
        });
        tbArchivo.add(tbSalir);

        jMenuBar1.add(tbArchivo);

        tbCifrado.setText("Cifrado");

        tbAccion.setText("Accion");

        tbCifrar.setText("Cifrar");
        tbCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCifrarActionPerformed(evt);
            }
        });
        tbAccion.add(tbCifrar);

        tbDescifrar.setText("Descifrar");
        tbDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDescifrarActionPerformed(evt);
            }
        });
        tbAccion.add(tbDescifrar);

        tbCifrado.add(tbAccion);

        tbDesplazamiento.setText("Desplazamiento");
        tbDesplazamiento.setToolTipText("Permite ajustar el desplazamiento");
        tbDesplazamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDesplazamientoActionPerformed(evt);
            }
        });
        tbCifrado.add(tbDesplazamiento);

        jMenuBar1.add(tbCifrado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bDescifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDescifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCifrarActionPerformed
        cifrarText();
    }//GEN-LAST:event_tbCifrarActionPerformed

    private void tbDesplazamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDesplazamientoActionPerformed
        // TODO add your handling code here:
        try{
            String newdesplazamiento = JOptionPane.showInputDialog(this, "El desplazamiento actual es "+ this.nDesplazamiento+", inserte el nuevo : ","Nuevo desplazamiento",JOptionPane.QUESTION_MESSAGE);
            if(newdesplazamiento == null || (newdesplazamiento != null && ("".equals(newdesplazamiento)))) return;
            this.nDesplazamiento = Integer.parseInt(newdesplazamiento);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No puedes insertar un desplazamiento que no sea un numero.","Error de valor no esperado",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tbDesplazamientoActionPerformed

    
    private void bCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCifrarActionPerformed
        cifrarText();
    }//GEN-LAST:event_bCifrarActionPerformed

    //Abre el fichero
    private void tbAbrirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAbrirMousePressed
        this.selectFileOpen();
    }//GEN-LAST:event_tbAbrirMousePressed

    //Guarda en fichero
    private void tbGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGuardarMousePressed
        this.selectFileWrite();
    }//GEN-LAST:event_tbGuardarMousePressed

    //Cierra la venta
    private void tbSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSalirMousePressed
        this.dispose();
    }//GEN-LAST:event_tbSalirMousePressed

    
    //Limpia la pantalla
    private void tbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbLimpiarActionPerformed
        etTexto.setText ("");
    }//GEN-LAST:event_tbLimpiarActionPerformed

    private void bDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDescifrarActionPerformed
        descifrarText();
    }//GEN-LAST:event_bDescifrarActionPerformed

    private void tbDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDescifrarActionPerformed
        descifrarText();
    }//GEN-LAST:event_tbDescifrarActionPerformed

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
            java.util.logging.Logger.getLogger(CifradoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CifradoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CifradoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CifradoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CifradoMain().setVisible(true);
            }
        });
    }
    
    /**
     * Se encarga de la abrir un fichero
     */
    private void selectFileOpen() {
        
        ArrayList<String> documentoCompleto = new ArrayList<String>(); 
        
        JFileChooser openFile = new JFileChooser("./recurses");//muestra el cuadro de di�logo de archivos y por defecto abrimos una carpeta en la raiz del proyecto
        openFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);//Para que el usuario pueda elegir el archivo y movernos por directoriosa abrir
        
        //Abrimos el cuadro dialogo para cargar la ruta
        int resultado = openFile.showOpenDialog(this);// indica cual fue la accion de usuario sobre el jfilechooser
        if (resultado == JFileChooser.APPROVE_OPTION) {//Si hemos realizado la carga correctamente
            etTexto.setText ("");
            //La funcion leer fichero nos devuelve un array por cada linea
            documentoCompleto = WriteReadToFile.ReadToFile(openFile.getCurrentDirectory()+ "\\" + openFile.getSelectedFile().getName());

            for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
                if (!etTexto.getText().equals("")){etTexto.setText(etTexto.getText()+ "\n" + documentoCompleto.get(x));} //El resto de vueltas
                else etTexto.setText(documentoCompleto.get(x));                                                         //La primera vuelta 
            }
        }
    }
    
    
    /**
    * Se encarga de la guarda en un fichero lo que hay en el editText
    */
    private void selectFileWrite() {
        
        ArrayList<String> documentoCompleto = new ArrayList<String>();  

        //Combierto lo que es el array que obtenemos de split en arraylist
        //El motivo es que writetofile que es la funcion creada en la tarea anterior acepta una coleccion de objetos String
        Collections.addAll(documentoCompleto, etTexto.getText().split("\n"));

        //Las siguiente lineas son solo para el debug
        if (MODEDEBUG){
        for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
            System.out.println(documentoCompleto.get(x));                                                         
        }}

       JFileChooser saveFile = new JFileChooser("./recurses"); //Y por defecto abrimos una carpeta en la raiz del proyecto
       
       saveFile.showSaveDialog(this); 
       //Le indico la ruta y la coleccion de objetos String a copiar en el fichero
       WriteReadToFile.WriteToFile(saveFile.getCurrentDirectory()+ "\\" + saveFile.getSelectedFile().getName() , documentoCompleto);
        
    }
    /**
     * Coje el texto que esta en el editText lo encripta y lo vuelve a colocar en el editText
     */
    private void cifrarText(){
        //Instanciamos los elementos a usar
        ArrayList<String> documentoCompleto = new ArrayList<String>();  
        EncriptacionCesar encriptacion = new EncriptacionCesar();
        encriptacion.setNDesplazamiento(this.nDesplazamiento);// Ajustamos el desplazamiento
       
       //Combierto lo que es el array que obtenemos de split en arraylist
       //El motivo es para trabajar por lineas y mantener el resultado m�s fiel a la realidad
       Collections.addAll(documentoCompleto, etTexto.getText().split("\n"));
       
       //Las se usan para ir decodificando linea por linea y sustituyendo en la lista de String
        for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
           encriptacion.setTextToCodificate(documentoCompleto.get(x));                 //Inserto un linea
           documentoCompleto.set(x,encriptacion.getTextCodificate());                  //La sustituyo por la linea decodificada    
           if (MODEDEBUG)System.out.println(documentoCompleto.get(x));
        }
        
        //Ahora modificamos el editText con la codificacion
        etTexto.setText ("");
        for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
            if (!etTexto.getText().equals("")){etTexto.setText(etTexto.getText()+ "\n" + documentoCompleto.get(x));} //El resto de vueltas
            else etTexto.setText(documentoCompleto.get(x));                                                          //La primera vuelta 
            if (MODEDEBUG)System.out.println(documentoCompleto.get(x));
        }
    }
    
    /**
     * Coje el texto que esta en el editText lo desencripta y lo vuelve a colocar en el editText
     */
    private void descifrarText(){
        //Instanciamos los elementos a usar
        ArrayList<String> documentoCompleto = new ArrayList<String>();  
        DesencriptacionCesar desencriptacion = new DesencriptacionCesar();
        desencriptacion.setNDesplazamiento(this.nDesplazamiento);// Ajustamos el desplazamiento
       
       //Combierto lo que es el array que obtenemos de split en arraylist
       //El motivo es para trabajar por lineas y mantener el resultado m�s fiel a la realidad
       Collections.addAll(documentoCompleto, etTexto.getText().split("\n"));
       
       //Las se usan para ir decodificando linea por linea y sustituyendo en la lista de String
        for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
           desencriptacion.setTextToDecodificate(documentoCompleto.get(x));                 //Inserto un linea
           documentoCompleto.set(x,desencriptacion.getTextDecodificate());                  //La sustituyo por la linea decodificada     
           if (MODEDEBUG)System.out.println(documentoCompleto.get(x));
        }
        
        //Ahora modificamos el editText con la codificacion
        etTexto.setText ("");
        for (int x=0; x<documentoCompleto.size();x++){//Ahora recorremos el array y lo pasamos al cuadro de texto y lo configuramos los saltos de linea
            if (!etTexto.getText().equals("")){etTexto.setText(etTexto.getText()+ "\n" + documentoCompleto.get(x));} //El resto de vueltas
            else etTexto.setText(documentoCompleto.get(x));                                                          //La primera vuelta 
            if (MODEDEBUG)System.out.println(documentoCompleto.get(x));
        }
    }
    
    //FUNCION PARA LA CONFIGURACION DE LA JDialog
    private void configurarVentana() {
        this.setTitle("Ejercicio 3: Cifrado Cesar");            // Titulo a la ventana
        //this.setLocationRelativeTo(this);                       // Centrar Ventana
        this.setLayout(null);                                   // Sin Layaut predeterminado
        this.setResizable(false);                               // Ventano no redimensionable
        this.setModal(true);                                    // La hacemos modal para que coja el foco
    }//Esto es para configurar la ventana 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCifrar;
    private javax.swing.JButton bDescifrar;
    private javax.swing.JTextArea etTexto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JMenuItem tbAbrir;
    private javax.swing.JMenu tbAccion;
    private javax.swing.JMenu tbArchivo;
    private javax.swing.JMenu tbCifrado;
    private javax.swing.JMenuItem tbCifrar;
    private javax.swing.JMenuItem tbDescifrar;
    private javax.swing.JMenuItem tbDesplazamiento;
    private javax.swing.JMenuItem tbGuardar;
    private javax.swing.JMenuItem tbLimpiar;
    private javax.swing.JMenuItem tbSalir;
    private javax.swing.JPopupMenu.Separator tbSeparador;
    private javax.swing.JPopupMenu.Separator tbSeparador1;
    // End of variables declaration//GEN-END:variables
}

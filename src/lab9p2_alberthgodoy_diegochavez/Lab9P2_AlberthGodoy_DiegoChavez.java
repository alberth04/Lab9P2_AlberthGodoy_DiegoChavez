/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_alberthgodoy_diegochavez;

import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class Lab9P2_AlberthGodoy_DiegoChavez extends javax.swing.JFrame {
    
    private ArrayList<usuario> listaUsuarios = new ArrayList();
    private ArrayList<juegos> listaJuegos = new ArrayList();
    private ArrayList<idiomas> listaIdiomas = new ArrayList();
    
    /**
     * Creates new form Lab9P2_AlberthGodoy_DiegoChavez
     */
   
    public Lab9P2_AlberthGodoy_DiegoChavez() {
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

        jDialog_Registro = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_UsuarioRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_NombreRegistro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_PasswordRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_CorreRegistro = new javax.swing.JTextField();
        jSpinner_EdadRegistro = new javax.swing.JSpinner();
        jButton_Registrar = new javax.swing.JButton();
        jDialog_Inicio = new javax.swing.JDialog();
        jTabbedPane_Inicio = new javax.swing.JTabbedPane();
        jPanel_Juego = new javax.swing.JPanel();
        jComboBox_Juego = new javax.swing.JComboBox<>();
        jButton_EjecutarJuego = new javax.swing.JButton();
        jButton_GenerarJuego = new javax.swing.JButton();
        jTextField_NombreJuego2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_NombreJuego = new javax.swing.JTextField();
        jTextField_Categoria = new javax.swing.JTextField();
        jTextField_Categoria2 = new javax.swing.JTextField();
        jTextField_Costo = new javax.swing.JTextField();
        jTextField_Costo2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Juego2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Juego = new javax.swing.JTable();
        jProgressBar_Juego = new javax.swing.JProgressBar();
        jPanel_Idioma = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_NombreIdiomas = new javax.swing.JTextField();
        jButton_AgregarIdioma = new javax.swing.JButton();
        jComboBox_IdiomaJuego = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton_CrearNombreIdiomas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Idiomas = new javax.swing.JTable();
        jPanel_Correo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_ParaCorreo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField_AsuntoCorreo = new javax.swing.JTextField();
        jButton_EnviarCorreo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_MensajeCorreo = new javax.swing.JTextArea();
        jMenuBar_Inicio = new javax.swing.JMenuBar();
        jMenu_Archivo = new javax.swing.JMenu();
        jMenuItem_AbrirArchivo = new javax.swing.JMenuItem();
        jMenu_ArchivosReciente = new javax.swing.JMenu();
        jSeparator_1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Limpiar = new javax.swing.JMenuItem();
        jMenuItem_Salir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField_PasswordLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_UsuarioLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_RegistroButton = new javax.swing.JButton();
        jButton_IngresarLogin = new javax.swing.JButton();

        jDialog_Registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Registro");
        jDialog_Registro.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 20, 80, -1));

        jLabel2.setText("Usuario");
        jDialog_Registro.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 62, 41, -1));

        jTextField_UsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsuarioRegistroActionPerformed(evt);
            }
        });
        jDialog_Registro.getContentPane().add(jTextField_UsuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 84, 150, -1));

        jLabel3.setText("Nombre");
        jDialog_Registro.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        jTextField_NombreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreRegistroActionPerformed(evt);
            }
        });
        jDialog_Registro.getContentPane().add(jTextField_NombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        jLabel7.setText("Edad");
        jDialog_Registro.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 41, -1));

        jLabel8.setText("Contraseña");
        jDialog_Registro.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, -1));

        jTextField_PasswordRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PasswordRegistroActionPerformed(evt);
            }
        });
        jDialog_Registro.getContentPane().add(jTextField_PasswordRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, -1));

        jLabel9.setText("Correo");
        jDialog_Registro.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 41, -1));

        jTextField_CorreRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CorreRegistroActionPerformed(evt);
            }
        });
        jDialog_Registro.getContentPane().add(jTextField_CorreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 150, -1));
        jDialog_Registro.getContentPane().add(jSpinner_EdadRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, -1));

        jButton_Registrar.setText("Registro");
        jDialog_Registro.getContentPane().add(jButton_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 140, 50));

        jDialog_Inicio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_Juego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel_Juego.add(jComboBox_Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        jButton_EjecutarJuego.setText("Ejecutar");
        jPanel_Juego.add(jButton_EjecutarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        jButton_GenerarJuego.setText("Generar");
        jPanel_Juego.add(jButton_GenerarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));
        jPanel_Juego.add(jTextField_NombreJuego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 210, -1));

        jLabel10.setText("Costo");
        jPanel_Juego.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, -1));
        jPanel_Juego.add(jTextField_NombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 210, -1));
        jPanel_Juego.add(jTextField_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 210, -1));
        jPanel_Juego.add(jTextField_Categoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 210, -1));
        jPanel_Juego.add(jTextField_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 210, -1));
        jPanel_Juego.add(jTextField_Costo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 210, -1));

        jLabel11.setText("Nombre");
        jPanel_Juego.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel12.setText("Categoria");
        jPanel_Juego.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        jPanel_Juego.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 720, 20));

        jTable_Juego2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ));
        jScrollPane1.setViewportView(jTable_Juego2);

        jPanel_Juego.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 700, 140));

        jTable_Juego.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ));
        jScrollPane2.setViewportView(jTable_Juego);

        jPanel_Juego.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 700, 140));
        jPanel_Juego.add(jProgressBar_Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, 700, 50));

        jTabbedPane_Inicio.addTab("Juego", jPanel_Juego);

        jPanel_Idioma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Nombre");
        jPanel_Idioma.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 20));
        jPanel_Idioma.add(jTextField_NombreIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));

        jButton_AgregarIdioma.setText("Agregar");
        jPanel_Idioma.add(jButton_AgregarIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, -1));

        jComboBox_IdiomaJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel_Idioma.add(jComboBox_IdiomaJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, 30));

        jLabel15.setText("Idioma a Juego");
        jPanel_Idioma.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        jButton_CrearNombreIdiomas.setText("Crear");
        jPanel_Idioma.add(jButton_CrearNombreIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, -1));

        jTable_Idiomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane3.setViewportView(jTable_Idiomas);

        jPanel_Idioma.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 750, 390));

        jTabbedPane_Inicio.addTab("Idiomas", jPanel_Idioma);

        jPanel_Correo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Para");
        jPanel_Correo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, -1));
        jPanel_Correo.add(jTextField_ParaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        jLabel17.setText("Mensaje");
        jPanel_Correo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, -1));
        jPanel_Correo.add(jTextField_AsuntoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));

        jButton_EnviarCorreo.setText("Enviar");
        jPanel_Correo.add(jButton_EnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 90, -1));

        jLabel18.setText("Asunto");
        jPanel_Correo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        jTextArea_MensajeCorreo.setColumns(20);
        jTextArea_MensajeCorreo.setRows(5);
        jScrollPane4.setViewportView(jTextArea_MensajeCorreo);

        jPanel_Correo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 750, 340));

        jTabbedPane_Inicio.addTab("Correo", jPanel_Correo);

        jDialog_Inicio.getContentPane().add(jTabbedPane_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        jMenu_Archivo.setText("Archivo");

        jMenuItem_AbrirArchivo.setText("Abrir Archivo");
        jMenu_Archivo.add(jMenuItem_AbrirArchivo);

        jMenu_ArchivosReciente.setText("Archivos Reciente");
        jMenu_Archivo.add(jMenu_ArchivosReciente);
        jMenu_Archivo.add(jSeparator_1);

        jMenuItem_Limpiar.setText("Limpiar ");
        jMenu_Archivo.add(jMenuItem_Limpiar);

        jMenuItem_Salir.setText("Salir");
        jMenu_Archivo.add(jMenuItem_Salir);

        jMenuBar_Inicio.add(jMenu_Archivo);

        jDialog_Inicio.setJMenuBar(jMenuBar_Inicio);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(303, 379));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Contraseña");

        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("LOGIN");

        jButton_RegistroButton.setText("Registro");
        jButton_RegistroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RegistroButtonMouseClicked(evt);
            }
        });

        jButton_IngresarLogin.setText("Ingresar");
        jButton_IngresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_IngresarLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jButton_RegistroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_UsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(92, Short.MAX_VALUE)
                    .addComponent(jButton_IngresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(jButton_RegistroButton)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 80, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(28, 28, 28)
                    .addComponent(jTextField_UsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jLabel4)
                    .addGap(24, 24, 24)
                    .addComponent(jTextField_PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 148, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(276, Short.MAX_VALUE)
                    .addComponent(jButton_IngresarLogin)
                    .addGap(80, 80, 80)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsuarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsuarioRegistroActionPerformed

    private void jTextField_NombreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreRegistroActionPerformed

    private void jTextField_PasswordRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PasswordRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PasswordRegistroActionPerformed

    private void jTextField_CorreRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CorreRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CorreRegistroActionPerformed

    private void jButton_RegistroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegistroButtonMouseClicked
        //abrir el dialog de registro
        
    }//GEN-LAST:event_jButton_RegistroButtonMouseClicked

    private void jButton_IngresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_IngresarLoginMouseClicked
        //Ingresar Usuario
        System.out.println("hola");
        
    }//GEN-LAST:event_jButton_IngresarLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Lab9P2_AlberthGodoy_DiegoChavez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_AlberthGodoy_DiegoChavez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_AlberthGodoy_DiegoChavez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_AlberthGodoy_DiegoChavez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab9P2_AlberthGodoy_DiegoChavez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarIdioma;
    private javax.swing.JButton jButton_CrearNombreIdiomas;
    private javax.swing.JButton jButton_EjecutarJuego;
    private javax.swing.JButton jButton_EnviarCorreo;
    private javax.swing.JButton jButton_GenerarJuego;
    private javax.swing.JButton jButton_IngresarLogin;
    private javax.swing.JButton jButton_Registrar;
    private javax.swing.JButton jButton_RegistroButton;
    private javax.swing.JComboBox<String> jComboBox_IdiomaJuego;
    private javax.swing.JComboBox<String> jComboBox_Juego;
    private javax.swing.JDialog jDialog_Inicio;
    private javax.swing.JDialog jDialog_Registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar_Inicio;
    private javax.swing.JMenuItem jMenuItem_AbrirArchivo;
    private javax.swing.JMenuItem jMenuItem_Limpiar;
    private javax.swing.JMenuItem jMenuItem_Salir;
    private javax.swing.JMenu jMenu_Archivo;
    private javax.swing.JMenu jMenu_ArchivosReciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Correo;
    private javax.swing.JPanel jPanel_Idioma;
    private javax.swing.JPanel jPanel_Juego;
    private javax.swing.JProgressBar jProgressBar_Juego;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator_1;
    private javax.swing.JSpinner jSpinner_EdadRegistro;
    private javax.swing.JTabbedPane jTabbedPane_Inicio;
    private javax.swing.JTable jTable_Idiomas;
    private javax.swing.JTable jTable_Juego;
    private javax.swing.JTable jTable_Juego2;
    private javax.swing.JTextArea jTextArea_MensajeCorreo;
    private javax.swing.JTextField jTextField_AsuntoCorreo;
    private javax.swing.JTextField jTextField_Categoria;
    private javax.swing.JTextField jTextField_Categoria2;
    private javax.swing.JTextField jTextField_CorreRegistro;
    private javax.swing.JTextField jTextField_Costo;
    private javax.swing.JTextField jTextField_Costo2;
    private javax.swing.JTextField jTextField_NombreIdiomas;
    private javax.swing.JTextField jTextField_NombreJuego;
    private javax.swing.JTextField jTextField_NombreJuego2;
    private javax.swing.JTextField jTextField_NombreRegistro;
    private javax.swing.JTextField jTextField_ParaCorreo;
    private javax.swing.JTextField jTextField_PasswordLogin;
    private javax.swing.JTextField jTextField_PasswordRegistro;
    private javax.swing.JTextField jTextField_UsuarioLogin;
    private javax.swing.JTextField jTextField_UsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}

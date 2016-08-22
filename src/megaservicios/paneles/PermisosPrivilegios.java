package megaservicios.paneles;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import megaservicios.clases.*;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import megaservicios.interfaces.Principal;


public class PermisosPrivilegios extends javax.swing.JPanel {

    public String var [] = new String[45];
    public int x [] = new int[45];
    public int i = 0;
    Date d = new Date();
    
    public PermisosPrivilegios() throws IOException {
        initComponents();
        funcionCombobox();
        buscarControlAcceso(jLabel3.getText());
        
        String ruta = "C:\\Log\\log.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        
         String text = "@--> " + d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900)+ " "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds() 
                     + " Modulo Permisos&Privilegios(); \n";
              
        bw = new BufferedWriter(new FileWriter(archivo,true));
        System.out.print(text);
        bw.write(text);
        
        bw.close();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/30.png"))); // NOI18N
        jLabel1.setText("Permisos & Privilegios");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));

        jCheckBox4.setText("Ventas");

        jCheckBox5.setText("Certificaciones");

        jCheckBox6.setText("Cotizaciones");

        jCheckBox8.setText("Efectivo de Cajas");

        jCheckBox9.setText("Reportes");

        jCheckBox7.setText("Consulta de Ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("1");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Catalogo"));

        jCheckBox33.setText("Compañias");

        jCheckBox34.setText("Filiales");

        jCheckBox35.setText("Articulos");

        jCheckBox36.setText("Sectores");

        jCheckBox37.setText("Mayoristas");

        jCheckBox38.setText("Clientes");

        jCheckBox39.setText("Doctores");

        jCheckBox40.setText("Cajas");
        jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox40ActionPerformed(evt);
            }
        });

        jCheckBox41.setText("Pagos");

        jCheckBox43.setText("Procesos");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox33)
                    .addComponent(jCheckBox34)
                    .addComponent(jCheckBox35)
                    .addComponent(jCheckBox36)
                    .addComponent(jCheckBox37)
                    .addComponent(jCheckBox38)
                    .addComponent(jCheckBox39)
                    .addComponent(jCheckBox40)
                    .addComponent(jCheckBox41)
                    .addComponent(jCheckBox43))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox43)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jCheckBox1.setText("Usuarios");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Cerrar Sección");

        jCheckBox3.setText("Salir");
        jCheckBox3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Encargado", "Supervisor", "Recepcionista", "Usuario" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Usuario:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Diario"));

        jCheckBox10.setText("Fin de Dia");

        jCheckBox11.setText("Compras");

        jCheckBox12.setText("Cambio de Precios");

        jCheckBox13.setText("Ofertas");

        jCheckBox14.setText("Devoluciones");

        jCheckBox15.setText("Mermas");

        jCheckBox16.setText("Traspasos");

        jCheckBox17.setText("Sincronizacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Utilerias"));

        jCheckBox25.setText("Importaciones");

        jCheckBox26.setText("Exportaciones");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });

        jCheckBox27.setText("Especiales");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });

        jCheckBox28.setText("Respaldos");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });

        jCheckBox29.setText("Configuración");

        jCheckBox30.setText("Log");

        jCheckBox31.setText("Base de Datos");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jCheckBox32.setText("Actualizaciones");

        jCheckBox42.setText("Permisos y Privilegios");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox31)
                    .addComponent(jCheckBox32)
                    .addComponent(jCheckBox42))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Ayuda"));

        jCheckBox44.setText("Acerca de...");
        jCheckBox44.setToolTipText("");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });

        jCheckBox20.setSelected(true);
        jCheckBox20.setText("Ayuda");
        jCheckBox20.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox44)
                    .addComponent(jCheckBox20))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensual"));

        jCheckBox18.setText("Semanal");

        jCheckBox19.setText("Mensual");

        jCheckBox21.setText("Anual");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });

        jCheckBox22.setText("Inventarios");

        jCheckBox23.setText("Consolidación");

        jCheckBox24.setText("OLAP Consolidación");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bPrimero.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bAnterior.png"))); // NOI18N
        jButton3.setEnabled(false);

        jTextField12.setEnabled(false);

        jLabel14.setText("de");
        jLabel14.setEnabled(false);

        jLabel15.setText("0");
        jLabel15.setEnabled(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bSiguiente.png"))); // NOI18N
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bUltimo.png"))); // NOI18N
        jButton5.setEnabled(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bAgregar.png"))); // NOI18N
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bBuscar.png"))); // NOI18N
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bModificar.png"))); // NOI18N
        jButton8.setEnabled(false);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/bEliminar.png"))); // NOI18N
        jButton9.setEnabled(false);

        jButton10.setText("Regresar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addGap(28, 28, 28))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton1)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 313, Short.MAX_VALUE)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        funcionCombobox();
        buscarControlAcceso(jLabel3.getText());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        recuperarCheckBox();
        modificarPermisos();
        JOptionPane.showMessageDialog(null, "Se han modificado con exito los privilegios y permisos de este tipo de usuario");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox40ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Regresar();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public void Regresar() throws IOException{
        Main m = new Main(); 
        m.setSize(1320, 575); 
        this.removeAll(); 
        this.add(m, BorderLayout.CENTER); 
        this.revalidate(); 
        this.repaint();
    }
    public void funcionCombobox(){
        int x = jComboBox1.getSelectedIndex();
        System.out.print("@---> ++ Permisios&privilegios del ");
        
            if (x == 0){
                jLabel3.setText("1");
                System.out.println("administrador();");
            }
            else if (x == 1){
                jLabel3.setText("2");  
                System.out.println("encargado();");
            }
            else if (x == 2){
                jLabel3.setText("3");  
                System.out.println("supervisor();");
            }
            else if (x == 3){
                jLabel3.setText("4");  
                System.out.println("recepcionista();");
            }
            else if (x == 4){
                jLabel3.setText("5");  
                System.out.println("usuario();");
            }
    }
    
    public void buscarControlAcceso(String valor){  
        String sql="";
        
            if(valor.equals("")) {
                sql="SELECT * FROM management";
            }
            else{
                sql="SELECT * FROM management WHERE Id='"+valor+"'";
            
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
            
                    while(rs.next()){
                        for (i = 0; i <= 45; i++){
                            var[i] = rs.getString(i+1);
                        }                    
                    }    
                } catch (SQLException ex) {
                    System.out.print("");
                }
            }
        gestorControlAcceso();
    }
    
    public void gestorControlAcceso(){

        if (var[1].equals("1")){ jCheckBox1.setSelected(true);  }  else { jCheckBox1.setSelected(false);  }
        if (var[2].equals("1")){ jCheckBox2.setSelected(true);  }  else { jCheckBox2.setSelected(false);  }
        if (var[3].equals("1")){ jCheckBox3.setSelected(true);  }  else { jCheckBox3.setSelected(false);  }
        if (var[4].equals("1")){ jCheckBox4.setSelected(true);  }  else { jCheckBox4.setSelected(false);  }
        if (var[5].equals("1")){ jCheckBox5.setSelected(true);  }  else { jCheckBox5.setSelected(false);  }  
        if (var[6].equals("1")){ jCheckBox6.setSelected(true);  }  else { jCheckBox6.setSelected(false);  }
        if (var[7].equals("1")){ jCheckBox7.setSelected(true);  }  else { jCheckBox7.setSelected(false);  }
        if (var[8].equals("1")){ jCheckBox8.setSelected(true);  }  else { jCheckBox8.setSelected(false);  }
        if (var[9].equals("1")){ jCheckBox9.setSelected(true);  }  else { jCheckBox9.setSelected(false);  }
        if (var[10].equals("1")){ jCheckBox10.setSelected(true);  } else { jCheckBox10.setSelected(false);  }
        if (var[11].equals("1")){ jCheckBox11.setSelected(true);  } else { jCheckBox11.setSelected(false);  }
        if (var[12].equals("1")){ jCheckBox12.setSelected(true);  } else { jCheckBox12.setSelected(false);  }
        if (var[13].equals("1")){ jCheckBox13.setSelected(true);  } else { jCheckBox13.setSelected(false);  }
        if (var[14].equals("1")){ jCheckBox14.setSelected(true);  } else { jCheckBox14.setSelected(false);  }
        if (var[15].equals("1")){ jCheckBox15.setSelected(true);  } else { jCheckBox15.setSelected(false);  }
        if (var[16].equals("1")){ jCheckBox16.setSelected(true);  } else { jCheckBox16.setSelected(false);  }
        if (var[17].equals("1")){ jCheckBox17.setSelected(true);  } else { jCheckBox17.setSelected(false);  }
        if (var[18].equals("1")){ jCheckBox18.setSelected(true);  } else { jCheckBox18.setSelected(false);  }
        if (var[19].equals("1")){ jCheckBox19.setSelected(true);  } else { jCheckBox19.setSelected(false);  }
        if (var[20].equals("1")){ jCheckBox20.setSelected(true);  } else { jCheckBox20.setSelected(false);  }
        if (var[21].equals("1")){ jCheckBox21.setSelected(true);  } else { jCheckBox21.setSelected(false);  }
        if (var[22].equals("1")){ jCheckBox22.setSelected(true);  } else { jCheckBox22.setSelected(false);  }
        if (var[23].equals("1")){ jCheckBox23.setSelected(true);  } else { jCheckBox23.setSelected(false);  }
        if (var[24].equals("1")){ jCheckBox24.setSelected(true);  } else { jCheckBox24.setSelected(false);  }
        if (var[25].equals("1")){ jCheckBox25.setSelected(true);  } else { jCheckBox25.setSelected(false);  }
        if (var[26].equals("1")){ jCheckBox26.setSelected(true);  } else { jCheckBox26.setSelected(false);  }
        if (var[27].equals("1")){ jCheckBox27.setSelected(true);  } else { jCheckBox27.setSelected(false);  }
        if (var[28].equals("1")){ jCheckBox28.setSelected(true);  } else { jCheckBox28.setSelected(false);  }
        if (var[29].equals("1")){ jCheckBox29.setSelected(true);  } else { jCheckBox29.setSelected(false);  }
        if (var[30].equals("1")){ jCheckBox30.setSelected(true);  } else { jCheckBox30.setSelected(false);  }
        if (var[31].equals("1")){ jCheckBox31.setSelected(true);  } else { jCheckBox31.setSelected(false);  }
        if (var[32].equals("1")){ jCheckBox32.setSelected(true);  } else { jCheckBox32.setSelected(false);  }
        if (var[33].equals("1")){ jCheckBox33.setSelected(true);  } else { jCheckBox33.setSelected(false);  }
        if (var[34].equals("1")){ jCheckBox34.setSelected(true);  } else { jCheckBox34.setSelected(false);  }
        if (var[35].equals("1")){ jCheckBox35.setSelected(true);  } else { jCheckBox35.setSelected(false);  }
        if (var[36].equals("1")){ jCheckBox36.setSelected(true);  } else { jCheckBox36.setSelected(false);  }
        if (var[37].equals("1")){ jCheckBox37.setSelected(true);  } else { jCheckBox37.setSelected(false);  }
        if (var[38].equals("1")){ jCheckBox38.setSelected(true);  } else { jCheckBox38.setSelected(false);  }
        if (var[39].equals("1")){ jCheckBox39.setSelected(true);  } else { jCheckBox39.setSelected(false);  }
        if (var[40].equals("1")){ jCheckBox40.setSelected(true);  } else { jCheckBox40.setSelected(false);  }
        if (var[41].equals("1")){ jCheckBox41.setSelected(true);  } else { jCheckBox41.setSelected(false);  }
        if (var[42].equals("1")){ jCheckBox42.setSelected(true);  } else { jCheckBox42.setSelected(false);  }
        if (var[43].equals("1")){ jCheckBox43.setSelected(true);  } else { jCheckBox43.setSelected(false);  }
        if (var[44].equals("1")){ jCheckBox44.setSelected(true);  } else { jCheckBox44.setSelected(false);  }
    }
    
    public void recuperarCheckBox(){
        
        if(jCheckBox1.isSelected()) { x[ 1] = 1; } else{ x[ 1] = 0; }
        if(jCheckBox2.isSelected()) { x[ 2] = 1; } else{ x[ 2] = 0; }
        if(jCheckBox3.isSelected()) { x[ 3] = 1; } else{ x[ 3] = 0; }
        if(jCheckBox4.isSelected()) { x[ 4] = 1; } else{ x[ 4] = 0; }
        if(jCheckBox5.isSelected()) { x[ 5] = 1; } else{ x[ 5] = 0; }
        if(jCheckBox6.isSelected()) { x[ 6] = 1; } else{ x[ 6] = 0; }
        if(jCheckBox7.isSelected()) { x[ 7] = 1; } else{ x[ 7] = 0; }
        if(jCheckBox8.isSelected()) { x[ 8] = 1; } else{ x[ 8] = 0; }
        if(jCheckBox9.isSelected()) { x[ 9] = 1; } else{ x[ 9] = 0; }
        if(jCheckBox10.isSelected()){ x[10] = 1; } else{ x[10] = 0; }
        if(jCheckBox11.isSelected()){ x[11] = 1; } else{ x[11] = 0; }
        if(jCheckBox12.isSelected()){ x[12] = 1; } else{ x[12] = 0; }
        if(jCheckBox13.isSelected()){ x[13] = 1; } else{ x[13] = 0; }
        if(jCheckBox14.isSelected()){ x[14] = 1; } else{ x[14] = 0; }
        if(jCheckBox15.isSelected()){ x[15] = 1; } else{ x[15] = 0; }
        if(jCheckBox16.isSelected()){ x[16] = 1; } else{ x[16] = 0; }
        if(jCheckBox17.isSelected()){ x[17] = 1; } else{ x[17] = 0; }
        if(jCheckBox18.isSelected()){ x[18] = 1; } else{ x[18] = 0; }
        if(jCheckBox19.isSelected()){ x[19] = 1; } else{ x[19] = 0; }
        if(jCheckBox20.isSelected()){ x[20] = 1; } else{ x[20] = 0; }
        if(jCheckBox21.isSelected()){ x[21] = 1; } else{ x[21] = 0; }
        if(jCheckBox22.isSelected()){ x[22] = 1; } else{ x[22] = 0; }
        if(jCheckBox23.isSelected()){ x[23] = 1; } else{ x[23] = 0; }
        if(jCheckBox24.isSelected()){ x[24] = 1; } else{ x[24] = 0; }
        if(jCheckBox25.isSelected()){ x[25] = 1; } else{ x[25] = 0; }
        if(jCheckBox26.isSelected()){ x[26] = 1; } else{ x[26] = 0; }
        if(jCheckBox27.isSelected()){ x[27] = 1; } else{ x[27] = 0; }
        if(jCheckBox28.isSelected()){ x[28] = 1; } else{ x[28] = 0; }
        if(jCheckBox29.isSelected()){ x[29] = 1; } else{ x[29] = 0; }
        if(jCheckBox30.isSelected()){ x[30] = 1; } else{ x[30] = 0; }
        if(jCheckBox31.isSelected()){ x[31] = 1; } else{ x[31] = 0; }
        if(jCheckBox32.isSelected()){ x[32] = 1; } else{ x[32] = 0; }
        if(jCheckBox33.isSelected()){ x[33] = 1; } else{ x[33] = 0; }
        if(jCheckBox34.isSelected()){ x[34] = 1; } else{ x[34] = 0; }
        if(jCheckBox35.isSelected()){ x[35] = 1; } else{ x[35] = 0; }
        if(jCheckBox36.isSelected()){ x[36] = 1; } else{ x[36] = 0; }
        if(jCheckBox37.isSelected()){ x[37] = 1; } else{ x[37] = 0; }
        if(jCheckBox38.isSelected()){ x[38] = 1; } else{ x[38] = 0; }
        if(jCheckBox39.isSelected()){ x[39] = 1; } else{ x[39] = 0; }
        if(jCheckBox40.isSelected()){ x[40] = 1; } else{ x[40] = 0; }
        if(jCheckBox41.isSelected()){ x[41] = 1; } else{ x[41] = 0; }
        if(jCheckBox42.isSelected()){ x[42] = 1; } else{ x[42] = 0; }
        if(jCheckBox43.isSelected()){ x[43] = 1; } else{ x[43] = 0; }
        if(jCheckBox44.isSelected()){ x[44] = 1; } else{ x[44] = 0; }
        
    }
   
    public void modificarPermisos(){
        
        try {
            PreparedStatement pst = cn.prepareStatement
                ("UPDATE management SET var1= '" + x[ 1] +
                     "',var2='" +x[ 2]+
                     "',var3='" +x[ 3]+
                     "',var4='" +x[ 4]+
                     "',var5='" +x[ 5]+ 
                     "',var6='" +x[ 6]+
                     "',var7='" +x[ 7]+
                     "',var8='" +x[ 8]+
                     "',var9='" +x[ 9]+
                    "',var10='" +x[10]+
                    "',var11='" +x[11]+
                    "',var12='" +x[12]+
                    "',var13='" +x[13]+
                    "',var14='" +x[14]+
                    "',var15='" +x[15]+
                    "',var16='" +x[16]+
                    "',var17='" +x[17]+
                    "',var18='" +x[18]+
                    "',var19='" +x[19]+
                    "',var20='" +x[20]+
                    "',var21='" +x[21]+
                    "',var22='" +x[22]+
                    "',var23='" +x[23]+
                    "',var24='" +x[24]+
                    "',var25='" +x[25]+
                    "',var26='" +x[26]+
                    "',var27='" +x[27]+
                    "',var28='" +x[28]+
                    "',var29='" +x[29]+
                    "',var30='" +x[30]+
                    "',var31='" +x[31]+
                    "',var32='" +x[32]+
                    "',var33='" +x[33]+
                    "',var34='" +x[34]+
                    "',var35='" +x[35]+
                    "',var36='" +x[36]+
                    "',var37='" +x[37]+
                    "',var38='" +x[38]+
                    "',var39='" +x[39]+
                    "',var40='" +x[40]+
                    "',var41='" +x[41]+
                    "',var42='" +x[42]+
                    "',var43='" +x[43]+
                    "',var44='" +x[44]+
                    "'WHERE Id='" +jLabel3.getText()+ "'");
            pst.executeUpdate();
            System.out.print("@---> ++ Se han modificado los permisos y privilegios del tipo de usuario(");
            System.out.print( x[ 1]+ "" + x[ 2]+ "" + x[ 3]+ "" + x[ 4]+ "" + x[ 5]+ "" );
            System.out.print( x[ 6]+ "" + x[ 7]+ "" + x[ 8]+ "" + x[ 9]+ "" + x[10]+ "" );
            System.out.print( x[11]+ "" + x[12]+ "" + x[13]+ "" + x[14]+ "" + x[15]+ "" );
            System.out.print( x[16]+ "" + x[17]+ "" + x[18]+ "" + x[19]+ "" + x[20]+ "" );
            System.out.print( x[21]+ "" + x[22]+ "" + x[23]+ "" + x[24]+ "" + x[25]+ "" );
            System.out.print( x[26]+ "" + x[27]+ "" + x[28]+ "" + x[29]+ "" + x[30]+ "" );
            System.out.print( x[31]+ "" + x[32]+ "" + x[33]+ "" + x[34]+ "" + x[35]+ "" );
            System.out.print( x[36]+ "" + x[37]+ "" + x[38]+ "" + x[39]+ "" + x[40]+ "" );
            System.out.println( x[41]+ "" + x[42]+ "" + x[43]+ "" + x[44] + ");");
        } catch (Exception e) {
            System.out.println("@---> ++ No se han podido modificar los permisos y privilegios del tipo de usuario();");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField12;
    // End of variables declaration//GEN-END:variables
    Conexion cc= new Conexion();
    Connection cn = cc.conexion();
}

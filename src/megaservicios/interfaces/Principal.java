package megaservicios.interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import megaservicios.clases.*;
import megaservicios.paneles.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {

    public String var [] = new String[45];
    public int i=0;
    public Timer timer;
    Date d = new Date();
    
    public Principal() throws IOException {
        initComponents(); 
        
        String ruta = "C:\\Log\\log.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        
         String text = "@--> " + d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900)+ " "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds() 
                     + " Modulo Principal(";
              
        bw = new BufferedWriter(new FileWriter(archivo,true));
        System.out.print(text);
        bw.write(text);
        
        bw.close(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenu39 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenu51 = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mega Servicios");
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/MegaServiciosPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo del Usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Usuario");

        jLabel5.setText("0");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("00:00:00");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("a.m.");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("00/00/0000");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("jLabel10");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 891, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Principal");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/1.png"))); // NOI18N
        jMenuItem2.setText("Usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/2.png"))); // NOI18N
        jMenuItem3.setText("Cerrar Sesion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator4);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/3.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Ventas");

        jMenuItem54.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/4.png"))); // NOI18N
        jMenuItem54.setText("Ventas");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem54);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/5.png"))); // NOI18N
        jMenuItem7.setText("Certificaciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/6.png"))); // NOI18N
        jMenuItem8.setText("Cotizaciones");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/7.png"))); // NOI18N
        jMenuItem9.setText("Consulta de Ventas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/8.png"))); // NOI18N
        jMenuItem10.setText("Efectivo de Caja");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);
        jMenu5.add(jSeparator1);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/9.png"))); // NOI18N
        jMenuItem11.setText("Reportes");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        jMenu12.setText("Diario");

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/10.png"))); // NOI18N
        jMenuItem13.setText("Fin de Dia");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/11.png"))); // NOI18N
        jMenuItem14.setText("Compras");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/12.png"))); // NOI18N
        jMenuItem15.setText("Cambios de Precios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/13.png"))); // NOI18N
        jMenuItem16.setText("Ofertas");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/14.png"))); // NOI18N
        jMenuItem17.setText("Devoluciones");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem17);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/15.png"))); // NOI18N
        jMenuItem18.setText("Mermas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/16.png"))); // NOI18N
        jMenuItem19.setText("Traspasos");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem19);
        jMenu12.add(jSeparator2);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/17.png"))); // NOI18N
        jMenuItem20.setText("Sincronizacion");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem20);

        jMenuBar1.add(jMenu12);

        jMenu21.setText("Mensual");

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/18.png"))); // NOI18N
        jMenuItem22.setText("Reportes Semanales");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem22);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/19.png"))); // NOI18N
        jMenuItem23.setText("Reportes Mensuales");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem23);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/20.png"))); // NOI18N
        jMenuItem25.setText("Reportes Anual");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem25);

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/21.png"))); // NOI18N
        jMenuItem26.setText("Inventarios");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem26);
        jMenu21.add(jSeparator3);

        jMenuItem27.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/22.png"))); // NOI18N
        jMenuItem27.setText("Consolidación");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem27);

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/23.png"))); // NOI18N
        jMenuItem28.setText("OLAP Consolidación");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem28);

        jMenuBar1.add(jMenu21);

        jMenu30.setText("Utilerias");

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/24.png"))); // NOI18N
        jMenuItem31.setText("Importaciones");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem31);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/25.png"))); // NOI18N
        jMenuItem32.setText("Exportaciones");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem32);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/26.png"))); // NOI18N
        jMenuItem33.setText("Especiales");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/27.png"))); // NOI18N
        jMenuItem34.setText("Respaldos");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem34);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/28.png"))); // NOI18N
        jMenuItem35.setText("Configuración");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem35);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/29.png"))); // NOI18N
        jMenuItem36.setText("Log");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem36);

        jMenuItem49.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/30.png"))); // NOI18N
        jMenuItem49.setText("Permisos & Privilegios");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem49);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/31.png"))); // NOI18N
        jMenuItem37.setText("Base de Datos");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem37);
        jMenu30.add(jSeparator5);

        jMenuItem38.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/32.png"))); // NOI18N
        jMenuItem38.setText("Actualizaciones");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem38);

        jMenuBar1.add(jMenu30);

        jMenu39.setText("Catalogo");

        jMenuItem40.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/33.png"))); // NOI18N
        jMenuItem40.setText("Compañias");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem40);

        jMenuItem41.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/34.png"))); // NOI18N
        jMenuItem41.setText("Filiales");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem41);

        jMenuItem42.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/35.png"))); // NOI18N
        jMenuItem42.setText("Articulos");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem42);

        jMenuItem43.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/36.png"))); // NOI18N
        jMenuItem43.setText("Sectores");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem43);

        jMenuItem44.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/37.png"))); // NOI18N
        jMenuItem44.setText("Mayoristas");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem44);

        jMenuItem45.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/38.png"))); // NOI18N
        jMenuItem45.setText("Clientes");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem45);

        jMenuItem46.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/39.png"))); // NOI18N
        jMenuItem46.setText("Doctores");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem46);

        jMenuItem47.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/40.png"))); // NOI18N
        jMenuItem47.setText("Cajas");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem47);

        jMenuItem48.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/41.png"))); // NOI18N
        jMenuItem48.setText("Pagos");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem48);

        jMenuItem50.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/42.png"))); // NOI18N
        jMenuItem50.setText("Procesos");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu39.add(jMenuItem50);

        jMenuBar1.add(jMenu39);

        jMenu51.setText("Ayuda");

        jMenuItem52.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/43.png"))); // NOI18N
        jMenuItem52.setText("Acerca de...");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu51.add(jMenuItem52);

        jMenuItem53.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megaservicios/img/44.png"))); // NOI18N
        jMenuItem53.setText("Ayuda");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu51.add(jMenuItem53);

        jMenuBar1.add(jMenu51);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            irUsuarios();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            irLogger();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "Hasta pronto Mega-Servicios");
        System.out.print("@-> ++ Salio de Mega-Servicios();");
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        try {
            irVentas( );
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            irCertificaciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            irCotizaciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            irConsultaVentas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            irEfectivoCaja();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            irReportes();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JOptionPane.showMessageDialog(null, "Fin de dia terminado correctamente");
        try {
            irFinDia();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            irCompras();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            irCambioPrecios();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        try {
            irOfertas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try {
            irDevoluciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        try {
            irMermas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        try {
            irTranspasos();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        try {
            irSincronizar();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        try {
            irRSemanal();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        try {
            irRMensual();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        try {
            irRAnual();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        try {
            irInventarios();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        String Fecha = JOptionPane.showInputDialog("Este proceso realizara la consolidacion,\n hasta la Fecha","dd/mm/aaaa");
        try {
            irConsolidacion();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Se ha realizado la Consolidacion Correctamente");
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        String Año = JOptionPane.showInputDialog("Este proceso realizara la OLPConsolidacion,\n hasta la Fecha","aaaa");
        try {
            irOLPConsolidacion();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Se ha realizado la OLPConsolidacion Correctamente");
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        try {
            irImportaciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        try {
            irExportaciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        try {
            irEspeciales();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        try {
            irRespaldos();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        try {
            irConfiguraciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        try {
            irLog();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        try {
            irPermisosPrivilegios();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        try {
            irBD();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        try {
            irActualizaciones();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        try {
            irCompañias();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        try {
            irFiliales();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        try {
            irArticulos();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        try {
            irSectores();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        try {
            irMayoristas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        try {
            irClientes();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        try {
            irDoctores();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        try {
            irCajas();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        try {
            irPagos();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        try {
            irProcesos();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        try {
            irAbout();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        try {
            irHelp();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        buscarUsuario(jLabel4.getText()); 
        buscarControlAcceso(jLabel9.getText());
        timer= new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    public void irVentas() throws IOException{
        Sales p = new Sales(); 
        p.setSize(1320, 575); 
        jPanel2.removeAll(); 
        jPanel2.add(p, BorderLayout.CENTER); 
        jPanel2.revalidate(); 
        jPanel2.repaint();
    }
    
    public void irHelp() throws IOException{
        Help p = new Help();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irAbout() throws IOException{
        About p = new About();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irProcesos() throws IOException{
        Processes p = new Processes();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irPagos() throws IOException{
        Payments p = new Payments();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCajas() throws IOException{
        Boxs p = new Boxs();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irDoctores() throws IOException{
        Doctors p = new Doctors();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint(); 
    }
    
    public void irClientes() throws IOException{
        Customers p = new Customers();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irMayoristas() throws IOException{
        Wholesaler p = new Wholesaler();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irSectores() throws IOException{
        Sectors p = new Sectors();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irArticulos() throws IOException{
        Articles p = new Articles();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irFiliales() throws IOException{
        Affiliates p = new Affiliates();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCompañias() throws IOException{
        Companies p = new Companies();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irActualizaciones() throws IOException{
        Updates p = new Updates();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irBD() throws IOException{
        DataBase p = new DataBase();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irLog() throws IOException{
        Log p = new Log();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irConfiguraciones() throws IOException{
        Settings p = new Settings();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irRespaldos() throws IOException{
        Backups p = new Backups();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irEspeciales() throws IOException{
        Specials p = new Specials();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irExportaciones() throws IOException{
        Exports p = new Exports();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irImportaciones() throws IOException{
        Imports p = new Imports();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irOLPConsolidacion() throws IOException{
        OLPConsolidation p = new OLPConsolidation();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irConsolidacion() throws IOException{
        Consolidation p = new Consolidation();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irInventarios() throws IOException{
        Inventories p = new Inventories();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irRAnual() throws IOException{
        AnnualReport p = new AnnualReport();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irRMensual() throws IOException{
        MonthlyReport p = new MonthlyReport();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irRSemanal() throws IOException{
        WeekReport p = new WeekReport();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irSincronizar() throws IOException{
        Sincronizarcion p = new Sincronizarcion();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irTranspasos() throws IOException{
        Transpasos p = new Transpasos();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irMermas() throws IOException{
        Mermas p = new Mermas();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irDevoluciones() throws IOException{
        Returns p = new Returns();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCambioPrecios() throws IOException{
        PriceChanges p = new PriceChanges();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irOfertas() throws IOException{
        Deals p = new Deals();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCompras() throws IOException{
        Shopping p = new Shopping();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irFinDia() throws IOException{
        EndOfDay p = new EndOfDay();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irReportes() throws IOException{
        Reports p = new Reports();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irEfectivoCaja() throws IOException{
        CashBox p = new CashBox();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCertificaciones() throws IOException{
        Certifications p = new Certifications();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void irCotizaciones() throws IOException{
        Quotes p = new Quotes();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
        
    public void irConsultaVentas() throws IOException{
        SalesInquiry p = new SalesInquiry();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
        
    public void irUsuarios() throws IOException{
        megaservicios.interfaces.Usuarios a = new megaservicios.interfaces.Usuarios();
        a.setVisible(true);
        this.setVisible(false);
    }
    
    public void irLogger() throws IOException, IOException{
        megaservicios.interfaces.Logueo a = new megaservicios.interfaces.Logueo();
        a.setVisible(true);
        this.setVisible(false);
    }
    
    public void irPermisosPrivilegios() throws IOException{    
        PermisosPrivilegios p = new PermisosPrivilegios();
        p.setSize(1320, 575);  
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void buscarUsuario(String valor){    
        String sql="";
        String []datos = new String [3];
        
            if(valor.equals("")) {
                sql="SELECT * FROM logger";
            }
            else{
                sql="SELECT * FROM logger WHERE Usuario='"+valor+"'";
            
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
           
                    while(rs.next()){
                        jLabel9.setText(rs.getString(4));
                    }    
                System.out.println(valor + ");");       
                }catch (SQLException ex) {
                    System.out.print("");
                }
            }
        recuperarTipo();
    }
    
    public void recuperarTipo(){
        int x = parseInt(jLabel9.getText());
        
            if (x == 1){
                jLabel3.setText("Administrador");  
            }
            else if (x == 2){
                jLabel3.setText("Encargado");  
            }
            else if (x == 3){
                jLabel3.setText("Recepcionista");  
            }
            else if (x == 4){
                jLabel3.setText("Usuario");  
            }
    }
    
    public void buscarControlAcceso(String valor){ 
        String sql="";
        
            if(valor.equals("")) {
                sql="SELECT * FROM management";
            }
            else {  
                sql="SELECT * FROM management WHERE Id='"+valor+"'";
            
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    System.out.print("@---> ++ Gestionando sistema de menus (");
            
                    while(rs.next()){
                        for (i = 0; i <= 45; i++){
                            var[i] = rs.getString(i+1);
                            System.out.print("" + var[i]+ "");
                        }                    
                    } 
                    System.out.println(");");
                } catch (SQLException ex) {
                    System.out.println(");");
                }
            }
            condicionesControlAcceso();
    }
    
    public void condicionesControlAcceso(){
        
        if (var[1].equals("1")){ jMenuItem2.setEnabled(true);  } else { jMenuItem2.setEnabled(false);  }
        if (var[2].equals("1")){ jMenuItem3.setEnabled(true);  } else { jMenuItem3.setEnabled(false);  }
        if (var[3].equals("1")){ jMenuItem4.setEnabled(true);  } else { jMenuItem4.setEnabled(false);  }
        if (var[4].equals("1")){ jMenuItem54.setEnabled(true); } else { jMenuItem54.setEnabled(false); }
        if (var[5].equals("1")){ jMenuItem7.setEnabled(true);  } else { jMenuItem7.setEnabled(false);  }  
        if (var[6].equals("1")){ jMenuItem8.setEnabled(true);  } else { jMenuItem8.setEnabled(false);  }
        if (var[7].equals("1")){ jMenuItem9.setEnabled(true);  } else { jMenuItem9.setEnabled(false);  }
        if (var[8].equals("1")){ jMenuItem10.setEnabled(true); } else { jMenuItem10.setEnabled(false); }
        if (var[9].equals("1")){ jMenuItem11.setEnabled(true); } else { jMenuItem11.setEnabled(false); }
        if (var[10].equals("1")){jMenuItem13.setEnabled(true); } else { jMenuItem13.setEnabled(false); }
        if (var[11].equals("1")){jMenuItem14.setEnabled(true); } else { jMenuItem14.setEnabled(false); }
        if (var[12].equals("1")){jMenuItem15.setEnabled(true); } else { jMenuItem15.setEnabled(false); }
        if (var[13].equals("1")){jMenuItem16.setEnabled(true); } else { jMenuItem16.setEnabled(false); }
        if (var[14].equals("1")){jMenuItem17.setEnabled(true); } else { jMenuItem17.setEnabled(false); }
        if (var[15].equals("1")){jMenuItem18.setEnabled(true); } else { jMenuItem18.setEnabled(false); }
        if (var[16].equals("1")){jMenuItem19.setEnabled(true); } else { jMenuItem19.setEnabled(false); }
        if (var[17].equals("1")){jMenuItem20.setEnabled(true); } else { jMenuItem20.setEnabled(false); }
        if (var[18].equals("1")){jMenuItem22.setEnabled(true); } else { jMenuItem22.setEnabled(false); }
        if (var[19].equals("1")){jMenuItem23.setEnabled(true); } else { jMenuItem23.setEnabled(false); }  
        if (var[20].equals("1")){jMenuItem49.setEnabled(true); } else { jMenuItem49.setEnabled(false); }
        if (var[21].equals("1")){jMenuItem25.setEnabled(true); } else { jMenuItem25.setEnabled(false); }
        if (var[22].equals("1")){jMenuItem26.setEnabled(true); } else { jMenuItem26.setEnabled(false); }
        if (var[23].equals("1")){jMenuItem27.setEnabled(true); } else { jMenuItem27.setEnabled(false); }
        if (var[24].equals("1")){jMenuItem28.setEnabled(true); } else { jMenuItem28.setEnabled(false); }
        if (var[25].equals("1")){jMenuItem31.setEnabled(true); } else { jMenuItem31.setEnabled(false); }
        if (var[26].equals("1")){jMenuItem32.setEnabled(true); } else { jMenuItem32.setEnabled(false); }
        if (var[27].equals("1")){jMenuItem33.setEnabled(true); } else { jMenuItem33.setEnabled(false); }
        if (var[28].equals("1")){jMenuItem34.setEnabled(true); } else { jMenuItem34.setEnabled(false); }
        if (var[29].equals("1")){jMenuItem35.setEnabled(true); } else { jMenuItem35.setEnabled(false); }
        if (var[30].equals("1")){jMenuItem36.setEnabled(true); } else { jMenuItem36.setEnabled(false); }
        if (var[31].equals("1")){jMenuItem37.setEnabled(true); } else { jMenuItem37.setEnabled(false); }
        if (var[32].equals("1")){jMenuItem38.setEnabled(true); } else { jMenuItem38.setEnabled(false); }
        if (var[33].equals("1")){jMenuItem40.setEnabled(true); } else { jMenuItem40.setEnabled(false); }
        if (var[34].equals("1")){jMenuItem41.setEnabled(true); } else { jMenuItem41.setEnabled(false); }
        if (var[35].equals("1")){jMenuItem42.setEnabled(true); } else { jMenuItem42.setEnabled(false); }
        if (var[36].equals("1")){jMenuItem43.setEnabled(true); } else { jMenuItem43.setEnabled(false); }
        if (var[37].equals("1")){jMenuItem44.setEnabled(true); } else { jMenuItem44.setEnabled(false); }
        if (var[38].equals("1")){jMenuItem45.setEnabled(true); } else { jMenuItem45.setEnabled(false); }
        if (var[39].equals("1")){jMenuItem46.setEnabled(true); } else { jMenuItem46.setEnabled(false); }
        if (var[40].equals("1")){jMenuItem47.setEnabled(true); } else { jMenuItem47.setEnabled(false); }
        if (var[41].equals("1")){jMenuItem48.setEnabled(true); } else { jMenuItem48.setEnabled(false); }
        if (var[42].equals("1")){jMenuItem49.setEnabled(true); } else { jMenuItem49.setEnabled(false); }
        if (var[43].equals("1")){jMenuItem50.setEnabled(true); } else { jMenuItem50.setEnabled(false); }       
        if (var[44].equals("1")){jMenuItem52.setEnabled(true); } else { jMenuItem52.setEnabled(false); }
    }
    
    public class cronometro implements ActionListener{
    	public void actionPerformed(ActionEvent evt){
            int horas,minutos,segundos, dia, mes, año, SH;
            String SistemaHorario = null;
            GregorianCalendar tiempo = new GregorianCalendar();
		
            horas = tiempo.get(Calendar.HOUR); minutos = tiempo.get(Calendar.MINUTE); segundos = tiempo.get(Calendar.SECOND);                
            dia = tiempo.get(Calendar.DAY_OF_MONTH); mes = tiempo.get(Calendar.MONTH); año = tiempo.get(Calendar.YEAR);
            SH = tiempo.get(Calendar.AM_PM);
                
                if (SH == 0){
                    SistemaHorario = "a.m.";
                }
                else if (SH == 1){
                    SistemaHorario = "p.m.";
                }
            jLabel6.setText(String.valueOf(horas + ":" + minutos + ":" + segundos));
            jLabel8.setText(String.valueOf(dia + "/" + (mes+1) + "/" + año));
            jLabel7.setText(SistemaHorario);
	}
    }
       
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu39;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu51;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
    Conexion cc= new Conexion();
    Connection cn = cc.conexion();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.fundacion.vistas;

import java.text.SimpleDateFormat;


/**
 *
 * @author USUARIO
 */
public class PerfilAdministrador extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    
    /**
     * Creates new form PerfilAdministrador2
     */
    public PerfilAdministrador() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("PERFIL DEL ADMINISTRADOR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Perfiles = new javax.swing.JComboBox<>();
        btn_inscripciones = new javax.swing.JButton();
        btn_listados = new javax.swing.JButton();
        btn_notificaciones = new javax.swing.JButton();
        btn_configuracion = new javax.swing.JButton();
        NomAdmi = new javax.swing.JLabel();
        NomAdm = new javax.swing.JTextField();
        ApelAdm = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        DocAdm = new javax.swing.JLabel();
        documentos = new javax.swing.JTextField();
        CodPerAdm = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        DirPerAdm = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        TelPerAdm = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        RolPerAdm = new javax.swing.JLabel();
        rol = new javax.swing.JTextField();
        FecPerAdm = new javax.swing.JLabel();
        FotoEstudi = new javax.swing.JPanel();
        BotSiguiPerAdm1 = new javax.swing.JButton();
        BotSiguiPerEst = new javax.swing.JButton();
        BotSiguiPerAdm2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1100, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Perfiles.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Perfiles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coordinador", "Estudiante", "Profesor" }));
        Perfiles.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Perfiles.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                PerfilesPopupMenuWillBecomeVisible(evt);
            }
        });
        Perfiles.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                PerfilesCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        Perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilesActionPerformed(evt);
            }
        });

        btn_inscripciones.setBackground(new java.awt.Color(255, 255, 255));
        btn_inscripciones.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btn_inscripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/inscripciones.png"))); // NOI18N
        btn_inscripciones.setText("Inscripciones");
        btn_inscripciones.setBorder(null);
        btn_inscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscripcionesActionPerformed(evt);
            }
        });

        btn_listados.setBackground(new java.awt.Color(255, 255, 255));
        btn_listados.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btn_listados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/listado.png"))); // NOI18N
        btn_listados.setText("Listados");
        btn_listados.setBorder(null);
        btn_listados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listadosMouseClicked(evt);
            }
        });
        btn_listados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listadosActionPerformed(evt);
            }
        });

        btn_notificaciones.setBackground(new java.awt.Color(255, 255, 255));
        btn_notificaciones.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btn_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/notificacion.png"))); // NOI18N
        btn_notificaciones.setText("Notificaciones");
        btn_notificaciones.setBorder(null);
        btn_notificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_notificacionesMouseClicked(evt);
            }
        });
        btn_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notificacionesActionPerformed(evt);
            }
        });

        btn_configuracion.setBackground(new java.awt.Color(255, 255, 255));
        btn_configuracion.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btn_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/ajuste.png"))); // NOI18N
        btn_configuracion.setText("Configuracion");
        btn_configuracion.setBorder(null);
        btn_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracionActionPerformed(evt);
            }
        });

        NomAdmi.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        NomAdmi.setText("Nombres:");

        NomAdm.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        NomAdm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        NomAdm.setCaretColor(new java.awt.Color(153, 153, 153));
        NomAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomAdmActionPerformed(evt);
            }
        });

        ApelAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        ApelAdm.setText("Apellidos:");

        apellidos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        apellidos.setCaretColor(new java.awt.Color(153, 153, 153));

        DocAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        DocAdm.setText("Documento:");

        documentos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        documentos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        documentos.setCaretColor(new java.awt.Color(153, 153, 153));
        documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentosActionPerformed(evt);
            }
        });

        CodPerAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        CodPerAdm.setText("Codigo:");

        codigo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        codigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        codigo.setCaretColor(new java.awt.Color(153, 153, 153));

        DirPerAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        DirPerAdm.setText("Direccion:");

        direccion.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        direccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        direccion.setCaretColor(new java.awt.Color(153, 153, 153));

        TelPerAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        TelPerAdm.setText("Telefono:");

        telefono.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        telefono.setCaretColor(new java.awt.Color(153, 153, 153));

        RolPerAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        RolPerAdm.setText("Rol:");

        rol.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        rol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        rol.setCaretColor(new java.awt.Color(153, 153, 153));

        FecPerAdm.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        FecPerAdm.setText("Fecha de nacimiento:");

        FotoEstudi.setBackground(new java.awt.Color(255, 255, 255));
        FotoEstudi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true));
        FotoEstudi.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout FotoEstudiLayout = new javax.swing.GroupLayout(FotoEstudi);
        FotoEstudi.setLayout(FotoEstudiLayout);
        FotoEstudiLayout.setHorizontalGroup(
            FotoEstudiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        FotoEstudiLayout.setVerticalGroup(
            FotoEstudiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        BotSiguiPerAdm1.setBackground(new java.awt.Color(255, 255, 255));
        BotSiguiPerAdm1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BotSiguiPerAdm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/flecha derecha.png"))); // NOI18N
        BotSiguiPerAdm1.setText("PERFIL COORDINADOR");
        BotSiguiPerAdm1.setBorder(null);
        BotSiguiPerAdm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotSiguiPerAdm1MouseClicked(evt);
            }
        });
        BotSiguiPerAdm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSiguiPerAdm1ActionPerformed(evt);
            }
        });

        BotSiguiPerEst.setBackground(new java.awt.Color(255, 255, 255));
        BotSiguiPerEst.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BotSiguiPerEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/flecha derecha.png"))); // NOI18N
        BotSiguiPerEst.setText("PERFIL PROFESOR");
        BotSiguiPerEst.setBorder(null);
        BotSiguiPerEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotSiguiPerEstMouseClicked(evt);
            }
        });
        BotSiguiPerEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSiguiPerEstActionPerformed(evt);
            }
        });

        BotSiguiPerAdm2.setBackground(new java.awt.Color(255, 255, 255));
        BotSiguiPerAdm2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BotSiguiPerAdm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/flecha derecha.png"))); // NOI18N
        BotSiguiPerAdm2.setText("PERFIL ESTUDIANTE");
        BotSiguiPerAdm2.setBorder(null);
        BotSiguiPerAdm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotSiguiPerAdm2MouseClicked(evt);
            }
        });
        BotSiguiPerAdm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSiguiPerAdm2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logo2.setBackground(new java.awt.Color(153, 153, 153));
        logo2.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setText("PERFIL ADMINISTRADOR");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/logoFNH2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DirPerAdm)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(RolPerAdm)
                                            .addComponent(TelPerAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FecPerAdm)
                                        .addGap(3, 3, 3)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(NomAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(NomAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DocAdm)
                                            .addComponent(CodPerAdm))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ApelAdm)
                                        .addGap(55, 55, 55)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentos, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FotoEstudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_inscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btn_listados, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 737, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotSiguiPerEst, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotSiguiPerAdm2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotSiguiPerAdm1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_inscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Perfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_listados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApelAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodPerAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DirPerAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelPerAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RolPerAdm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FotoEstudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FecPerAdm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(BotSiguiPerAdm1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotSiguiPerEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotSiguiPerAdm2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PerfilesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_PerfilesPopupMenuWillBecomeVisible
      
    }//GEN-LAST:event_PerfilesPopupMenuWillBecomeVisible

    private void PerfilesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PerfilesCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_PerfilesCaretPositionChanged

    private void PerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilesActionPerformed

    }//GEN-LAST:event_PerfilesActionPerformed

    private void btn_inscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscripcionesActionPerformed
        this.dispose();
       RegistroPersonas abrir = new RegistroPersonas();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_inscripcionesActionPerformed

    private void btn_listadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listadosMouseClicked
        this.dispose();
        Listado_Estudiantes abrir = new Listado_Estudiantes();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_listadosMouseClicked

    private void btn_listadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listadosActionPerformed

    private void btn_notificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notificacionesMouseClicked
        this.dispose();
        Notificaciones abrir = new Notificaciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_notificacionesMouseClicked

    private void btn_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_notificacionesActionPerformed

    private void btn_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracionActionPerformed
        this.dispose();
        configuraciones abrir = new configuraciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_configuracionActionPerformed

    private void NomAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomAdmActionPerformed

    private void BotSiguiPerAdm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotSiguiPerAdm1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotSiguiPerAdm1MouseClicked

    private void BotSiguiPerAdm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSiguiPerAdm1ActionPerformed
        this.dispose();
        PerfilCoordinador abrir = new PerfilCoordinador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotSiguiPerAdm1ActionPerformed

    private void BotSiguiPerEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotSiguiPerEstMouseClicked
        this.dispose();
        PerfilCoordinador abrir = new PerfilCoordinador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotSiguiPerEstMouseClicked

    private void BotSiguiPerEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSiguiPerEstActionPerformed
        this.dispose();
        perfil_profesor abrir = new perfil_profesor();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotSiguiPerEstActionPerformed

    private void BotSiguiPerAdm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotSiguiPerAdm2MouseClicked
        this.dispose();
        Perfil_estudiante abrir = new Perfil_estudiante();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotSiguiPerAdm2MouseClicked

    private void BotSiguiPerAdm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSiguiPerAdm2ActionPerformed
        this.dispose();
        Perfil_estudiante p_estudiante = new Perfil_estudiante();
        p_estudiante.setVisible(true);
        
    }//GEN-LAST:event_BotSiguiPerAdm2ActionPerformed

    private void documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApelAdm;
    private javax.swing.JButton BotSiguiPerAdm1;
    private javax.swing.JButton BotSiguiPerAdm2;
    private javax.swing.JButton BotSiguiPerEst;
    private javax.swing.JLabel CodPerAdm;
    private javax.swing.JLabel DirPerAdm;
    private javax.swing.JLabel DocAdm;
    private javax.swing.JLabel FecPerAdm;
    private javax.swing.JPanel FotoEstudi;
    private javax.swing.JTextField NomAdm;
    private javax.swing.JLabel NomAdmi;
    private javax.swing.JComboBox<String> Perfiles;
    private javax.swing.JLabel RolPerAdm;
    private javax.swing.JLabel TelPerAdm;
    private javax.swing.JTextField apellidos;
    private javax.swing.JButton btn_configuracion;
    private javax.swing.JButton btn_inscripciones;
    private javax.swing.JButton btn_listados;
    private javax.swing.JButton btn_notificaciones;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField documentos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo2;
    private javax.swing.JTextField rol;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

    private static class Date_fecha_naci {

        private static Object getDate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Date_fecha_naci() {
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.fundacion.vistas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import proyecto.fundacion.controller.PersonasController;
import proyecto.fundacion.dao.PersonaDAO;
import proyecto.fundacion.models.Personas;

/**
 *
 * @author USUARIO
 */
public class Listado_Estudiantes extends javax.swing.JFrame {
     Personas P = new Personas();
    PersonaDAO Pdao= new PersonaDAO();
     DefaultTableModel modelo = new DefaultTableModel();
     TableRowSorter trs = null;

    PersonasController pcontroller = new PersonasController();

    public Listado_Estudiantes() {
        initComponents();
        this.ListarPersonas();
        this.setLocationRelativeTo(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("LISTADO DE ESTUDIANTES");
    }
private void ListarPersonas(){

         List<Personas> lp = new PersonaDAO().Listar();
    System.out.println(lp);
        modelo = (DefaultTableModel) TablaListado.getModel();

        Object[] ob = new Object[6];

        for (int i = 0; i < lp.size(); i++) {

            ob[0] = lp.get(i).getPerId();
            ob[1] = lp.get(i).getPerNombres();
            ob[2] = lp.get(i).getPerApellidos();
            ob[3] = lp.get(i).getPerTipodeDocumento();
            ob[4] = lp.get(i).getPerNumerodeDocumento();
            ob[5] = lp.get(i).getPerEdad();
           
            modelo.addRow(ob);
    }
 

        TablaListado.setModel(modelo);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaListado = new javax.swing.JTable();
        Busqueda_estudiante = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BarraMorada = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo_eliminar_persona = new javax.swing.JTextField();
        EliminarPersona = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        TablaListado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TablaListado.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Tipo de Documento", "Numero de Documento", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaListado);
        if (TablaListado.getColumnModel().getColumnCount() > 0) {
            TablaListado.getColumnModel().getColumn(0).setHeaderValue("ID");
            TablaListado.getColumnModel().getColumn(1).setHeaderValue("Nombres");
            TablaListado.getColumnModel().getColumn(2).setHeaderValue("Apellidos");
            TablaListado.getColumnModel().getColumn(3).setHeaderValue("Tipo de Documento");
            TablaListado.getColumnModel().getColumn(4).setHeaderValue("Numero de Documento");
            TablaListado.getColumnModel().getColumn(5).setHeaderValue("Edad");
        }

        Busqueda_estudiante.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Busqueda_estudiante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Busqueda_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busqueda_estudianteActionPerformed(evt);
            }
        });
        Busqueda_estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Busqueda_estudianteKeyTyped(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        BarraMorada.setBackground(new java.awt.Color(204, 204, 255));
        BarraMorada.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        BarraMorada.setText("  Lista de Estudiantes");
        BarraMorada.setOpaque(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/logoFNH2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        campo_eliminar_persona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        campo_eliminar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_eliminar_personaActionPerformed(evt);
            }
        });

        EliminarPersona.setBackground(new java.awt.Color(255, 255, 255));
        EliminarPersona.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        EliminarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/borrar.png"))); // NOI18N
        EliminarPersona.setText("Eliminar");
        EliminarPersona.setBorder(null);
        EliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPersonaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/fundacion/imagenes/icons8-izquierda-32.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_eliminar_persona)
                            .addComponent(Busqueda_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Busqueda_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(EliminarPersona))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(campo_eliminar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        this.dispose();
        inscripciones abrir = new inscripciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void Busqueda_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busqueda_estudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Busqueda_estudianteActionPerformed

    private void campo_eliminar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_eliminar_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_eliminar_personaActionPerformed

    private void EliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPersonaActionPerformed
        
        //realizo validaciones
        String id = campo_eliminar_persona.getText();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el estudiante con el id: " + id + "?", "ATENCION", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirmacion == 0) {

            boolean respuesta = pcontroller.eliminar(id);

            if (respuesta) {

                JOptionPane.showMessageDialog(rootPane, "Se elimino el estudiante con exito con el documento: " + id, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                campo_eliminar_persona.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se pudo completar la operacion", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EliminarPersonaActionPerformed

    private void Busqueda_estudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda_estudianteKeyTyped
         Busqueda_estudiante.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {

                trs.setRowFilter(RowFilter.regexFilter(Busqueda_estudiante.getText(), 1));

            }
        });

        trs = new TableRowSorter(modelo);
        TablaListado.setRowSorter(trs);
    }//GEN-LAST:event_Busqueda_estudianteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        PerfilAdministrador ir = new PerfilAdministrador();
        ir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraMorada;
    public javax.swing.JTextField Busqueda_estudiante;
    private javax.swing.JButton EliminarPersona;
    public javax.swing.JTable TablaListado;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_eliminar_persona;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

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
        campo_eliminar_persona = new javax.swing.JTextField();
        EliminarPersona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        TablaListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TablaListado.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TablaListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Telefono", "Direccion", "Edad", "Mariculado?", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaListado);

        Busqueda_estudiante.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Busqueda_estudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BarraMorada.setBackground(new java.awt.Color(255, 255, 255));
        BarraMorada.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        BarraMorada.setText("  Lista de Estudiantes");
        BarraMorada.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(BarraMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        campo_eliminar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_eliminar_personaActionPerformed(evt);
            }
        });

        EliminarPersona.setText("Eliminar");
        EliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_eliminar_persona)
                            .addComponent(Busqueda_estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(EliminarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(Busqueda_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_eliminar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarPersona))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraMorada;
    public javax.swing.JTextField Busqueda_estudiante;
    private javax.swing.JButton EliminarPersona;
    public javax.swing.JTable TablaListado;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JTextField campo_eliminar_persona;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

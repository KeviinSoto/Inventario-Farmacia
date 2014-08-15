/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.awt.Toolkit;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kevin Soto
 */
public class RegistroLaboratorios extends JPanel {
    JDialog dialogo = new JDialog();
   
    public RegistroLaboratorios() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectofarmacia?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM Laboratorios l");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        nombrelaboratoriosLabel = new javax.swing.JLabel();
        telefonolaboratorios1Label = new javax.swing.JLabel();
        telefonolaboratorios2Label = new javax.swing.JLabel();
        sucursalLabel = new javax.swing.JLabel();
        nombrelaboratoriosField = new javax.swing.JTextField();
        telefonolaboratorios1Field = new javax.swing.JTextField();
        telefonolaboratorios2Field = new javax.swing.JTextField();
        sucursalField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        masterTable.setEnabled(false);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idlaboratorios}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombrelaboratorios}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefonolaboratorios1}"));
        columnBinding.setColumnName("Telefono 1");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefonolaboratorios2}"));
        columnBinding.setColumnName("Telefono 2");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sucursal}"));
        columnBinding.setColumnName("Sucursal");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        masterTable.getColumnModel().getColumn(0).setResizable(false);
        masterTable.getColumnModel().getColumn(1).setResizable(false);
        masterTable.getColumnModel().getColumn(2).setResizable(false);
        masterTable.getColumnModel().getColumn(3).setResizable(false);
        masterTable.getColumnModel().getColumn(4).setResizable(false);

        nombrelaboratoriosLabel.setText("Nombre laboratorio:");

        telefonolaboratorios1Label.setText("Telefono 1:");

        telefonolaboratorios2Label.setText("Telefono 2:");

        sucursalLabel.setText("Sucursal:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nombrelaboratorios}"), nombrelaboratoriosField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nombrelaboratoriosField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        nombrelaboratoriosField.addKeyListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefonolaboratorios1}"), telefonolaboratorios1Field, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), telefonolaboratorios1Field, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        telefonolaboratorios1Field.addKeyListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefonolaboratorios2}"), telefonolaboratorios2Field, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), telefonolaboratorios2Field, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        telefonolaboratorios2Field.addKeyListener(formListener);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sucursal}"), sucursalField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), sucursalField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        sucursalField.addKeyListener(formListener);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/save.png"))); // NOI18N
        saveButton.setText("Guardar");
        saveButton.setEnabled(false);
        saveButton.addActionListener(formListener);

        limpiarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/refresh.png"))); // NOI18N
        limpiarButton.setText("Limpiar");
        limpiarButton.addActionListener(formListener);

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/laboratorio.jpg"))); // NOI18N
        newButton.setText("Nuevo");
        newButton.addActionListener(formListener);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        buscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmacia/find.png"))); // NOI18N
        buscarButton.setText("Buscar");
        buscarButton.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrelaboratoriosLabel)
                            .addComponent(telefonolaboratorios1Label)
                            .addComponent(telefonolaboratorios2Label)
                            .addComponent(sucursalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonolaboratorios1Field)
                            .addComponent(telefonolaboratorios2Field)
                            .addComponent(nombrelaboratoriosField)
                            .addComponent(sucursalField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(newButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarButton))))
                    .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {limpiarButton, newButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrelaboratoriosLabel)
                    .addComponent(nombrelaboratoriosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonolaboratorios1Label)
                    .addComponent(telefonolaboratorios1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonolaboratorios2Label)
                    .addComponent(telefonolaboratorios2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sucursalLabel)
                    .addComponent(sucursalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(limpiarButton)
                    .addComponent(newButton)
                    .addComponent(buscarButton))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.KeyListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                RegistroLaboratorios.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == limpiarButton) {
                RegistroLaboratorios.this.limpiarButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                RegistroLaboratorios.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == buscarButton) {
                RegistroLaboratorios.this.buscarButtonActionPerformed(evt);
            }
        }

        public void keyPressed(java.awt.event.KeyEvent evt) {
        }

        public void keyReleased(java.awt.event.KeyEvent evt) {
        }

        public void keyTyped(java.awt.event.KeyEvent evt) {
            if (evt.getSource() == nombrelaboratoriosField) {
                RegistroLaboratorios.this.nombrelaboratoriosFieldKeyTyped(evt);
            }
            else if (evt.getSource() == telefonolaboratorios1Field) {
                RegistroLaboratorios.this.telefonolaboratorios1FieldKeyTyped(evt);
            }
            else if (evt.getSource() == telefonolaboratorios2Field) {
                RegistroLaboratorios.this.telefonolaboratorios2FieldKeyTyped(evt);
            }
            else if (evt.getSource() == sucursalField) {
                RegistroLaboratorios.this.sucursalFieldKeyTyped(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    

    @SuppressWarnings("unchecked")
    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
        newButton.setEnabled(true);
        saveButton.setEnabled(false);
    }//GEN-LAST:event_limpiarButtonActionPerformed
        
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        farmacia.Laboratorios l = new farmacia.Laboratorios();
        entityManager.persist(l);
        list.add(l);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        saveButton.setEnabled(true);
        newButton.setEnabled(false);
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if(nombrelaboratoriosField.getText().trim().isEmpty() || telefonolaboratorios1Field.getText().trim().isEmpty() || sucursalField.getText().trim().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos marcados con * como minimo para poder guardar.", "ADVERTENCIA", WIDTH);
        }
        else
        {
            try 
            {
                entityManager.getTransaction().commit();
                entityManager.getTransaction().begin();
                JOptionPane.showMessageDialog(this, "Laboratorio guardado existosamente.", "Laboratorio guardado", WIDTH);
                entityManager.getTransaction().rollback();
                entityManager.getTransaction().begin();
                java.util.Collection data = query.getResultList();
                for (Object entity : data) 
                {
                    entityManager.refresh(entity);
                }
                list.clear();
                list.addAll(data);
                newButton.setEnabled(true);
                saveButton.setEnabled(false);
            } 
            catch (RollbackException rex)
            {
                rex.printStackTrace();
                entityManager.getTransaction().begin();
                List<farmacia.Laboratorios> merged = new ArrayList<farmacia.Laboratorios>(list.size());
                for (farmacia.Laboratorios l : list) {
                    merged.add(entityManager.merge(l));
                }
                list.clear();
                list.addAll(merged);
                newButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nombrelaboratoriosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrelaboratoriosFieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetterOrDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()) && evt.getKeyChar() != '.' && evt.getKeyChar() != '-')        
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if(nombrelaboratoriosField.getText().length() == 45)
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Nombre de laboratorio demasiado largo.", "ADVERTENCIA", WIDTH);
        }
    }//GEN-LAST:event_nombrelaboratoriosFieldKeyTyped

    private void telefonolaboratorios1FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonolaboratorios1FieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))        
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if(telefonolaboratorios1Field.getText().length() == 13)
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Telefono demasiado largo.", "ADVERTENCIA", WIDTH);
        }
    }//GEN-LAST:event_telefonolaboratorios1FieldKeyTyped

    private void telefonolaboratorios2FieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonolaboratorios2FieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))        
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if(telefonolaboratorios2Field.getText().length() == 13)
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Telefono demasiado largo.", "ADVERTENCIA", WIDTH);
        }
    }//GEN-LAST:event_telefonolaboratorios2FieldKeyTyped

    private void sucursalFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursalFieldKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()) && !Character.isWhitespace(evt.getKeyChar()))        
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
          if(sucursalField.getText().length() == 45)
        {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Nombre de la sucursal demadiado largo.", "ADVERTENCIA", WIDTH);
        }
    }//GEN-LAST:event_sucursalFieldKeyTyped

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        // TODO add your handling code here:
        BuscarLaboratorio buscar_laboratorio = new BuscarLaboratorio();
        buscar_laboratorio.setVisible(true);
        dialogo.setModal(false);
    }//GEN-LAST:event_buscarButtonActionPerformed

         public void mostrar() 
          {
              dialogo.setContentPane(new RegistroLaboratorios());
              dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
              dialogo.setTitle("Registro de laboratorios");
              dialogo.setResizable(false);
              dialogo.pack();
              dialogo.setModal(true);
              dialogo.setLocationRelativeTo(null);
              dialogo.setVisible(true);  
          }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limpiarButton;
    private java.util.List<farmacia.Laboratorios> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField nombrelaboratoriosField;
    private javax.swing.JLabel nombrelaboratoriosLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField sucursalField;
    private javax.swing.JLabel sucursalLabel;
    private javax.swing.JTextField telefonolaboratorios1Field;
    private javax.swing.JLabel telefonolaboratorios1Label;
    private javax.swing.JTextField telefonolaboratorios2Field;
    private javax.swing.JLabel telefonolaboratorios2Label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(RegistroLaboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLaboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLaboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLaboratorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */

    }
}

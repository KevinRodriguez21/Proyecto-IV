package app.modulos.cliente;

import app.mtr.entidades.Cliente;
import app.mtr.logica.LCliente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author kevin
 */
public class ListarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarCliente
     */
    public ListarCliente() {
        initComponents();
        this.CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jLabel1.setText("Buscar:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(TCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.txtBuscar.getText().equals("")) {
                this.txtBuscar.setText("");
                this.txtBuscar.requestFocus();
                this.CargarTabla();
            } else {
                this.Buscar();
            }
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void CargarTabla() {
        ArrayList<Cliente> clientes = new LCliente().Listar();
        
        clientes.sort(Comparator.comparingInt(Cliente::getIdCliente));
        
        String[] columnas = new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "Direccion",
            "Telefono",
            "Correo"
        };
        
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        
        for (Cliente cliente : clientes) {
            obModelo.addRow(new Object[]{
                cliente.getIdCliente()+ "",
                cliente.getNombreCliente() + " ",
                cliente.getApellidoCliente(),
                cliente.getDireccionCliente(),
                cliente.getTelefonoCliente(),
                cliente.getCorreoCliente()
            });
        }
        
        this.TCliente.setModel(obModelo);
    }
    
    private void CargarTabla(ArrayList<Cliente> clientes) {
        String[] columnas = new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "Direccion",
            "Telefono",
            "Correo"
        };
        
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        
        for (Cliente cliente : clientes) {
            obModelo.addRow(new Object[]{
                cliente.getIdCliente()+ "",
                cliente.getNombreCliente() + " ",
                cliente.getApellidoCliente(),
                cliente.getDireccionCliente(),
                cliente.getTelefonoCliente(),
                cliente.getCorreoCliente()
            });
        }
        
        this.TCliente.setModel(obModelo);
    }
    
    
    private void Buscar() {
        String valor = this.txtBuscar.getText().trim().toLowerCase();

        if (!valor.isEmpty() && !valor.isBlank()) {
            ArrayList<Cliente> clientes = new LCliente().Listar();

            if (clientes != null && !clientes.isEmpty()) {
                List<Cliente> finales = clientes.stream()
                        .filter(emp -> (emp.getIdCliente() + "").equals(valor))
                        .collect(Collectors.toList());

                this.CargarTabla((ArrayList<Cliente>) finales);
            }
        }
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.CargarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
        this.txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

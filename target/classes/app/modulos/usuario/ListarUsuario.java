package app.modulos.usuario;

import app.mtr.entidades.Usuario;
import app.mtr.logica.LUsuario;
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
public class ListarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarUsuario
     */
    public ListarUsuario() {
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

        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Puesto", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(TProveedor);

        jLabel1.setText("Buscar:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(454, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(362, 362, 362))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
        this.txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.CargarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        ArrayList<Usuario> usuarios = new LUsuario().Listar();
        
        usuarios.sort(Comparator.comparingInt(Usuario::getIdUsuario));
        
        String[] columnas = new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "Puesto",
            "Telefono",
            "Correo"
        };
        
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        
        for (Usuario usuario : usuarios) {
            obModelo.addRow(new Object[]{
                usuario.getIdUsuario()+ "",
                usuario.getNombreUsuario() + " ",
                usuario.getApellidoUsuario(),
                usuario.getPuesto(),
                usuario.getTelefonoUsuario(),
                usuario.getCorreoUsuario()
            });
        }
        
        this.TProveedor.setModel(obModelo);
    }
    
    private void CargarTabla(ArrayList<Usuario> usuarios) {
        String[] columnas = new String[]{
            "Id",
            "Nombre",
            "Apellido",
            "Puesto",
            "Telefono",
            "Correo"
        };
        
        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);
        
        for (Usuario cliente : usuarios) {
            obModelo.addRow(new Object[]{
                cliente.getIdUsuario()+ "",
                cliente.getNombreUsuario() + " ",
                cliente.getApellidoUsuario(),
                cliente.getPuesto(),
                cliente.getTelefonoUsuario(),
                cliente.getCorreoUsuario()
            });
        }
        
        this.TProveedor.setModel(obModelo);
    }
    
    
    private void Buscar() {
        String valor = this.txtBuscar.getText().trim().toLowerCase();

        if (!valor.isEmpty() && !valor.isBlank()) {
            ArrayList<Usuario> clientes = new LUsuario().Listar();

            if (clientes != null && !clientes.isEmpty()) {
                List<Usuario> finales = clientes.stream()
                        .filter(emp -> (emp.getIdUsuario() + "").equals(valor))
                        .collect(Collectors.toList());

                this.CargarTabla((ArrayList<Usuario>) finales);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TProveedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

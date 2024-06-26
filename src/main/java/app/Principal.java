/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import app.modulos.inventario.GuardarInventario;
import app.modulos.inventario.ListarInventario;
import app.modulos.inventario.ActualizarInventario;
import app.modulos.inventario.EliminarInventario;
import app.modulos.proveedor.GuardarProveedor;
import app.modulos.proveedor.ActualizarProveedor;
import app.modulos.proveedor.ListarProveedor;
import app.modulos.proveedor.EliminarProveedor;
import app.modulos.cliente.GuardarCliente;
import app.modulos.cliente.ActualizarCliente;
import app.modulos.cliente.ListarCliente;
import app.modulos.cliente.EliminarCliente;
import app.modulos.usuario.GuardarUsuario;
import app.modulos.usuario.ActualizarUsuario;
import app.modulos.usuario.ListarUsuario;
import app.modulos.usuario.EliminarUsuario;
import app.modulos.factura.GuardarFactura;
import app.modulos.factura.ActualizarFactura;
import app.modulos.factura.ListarFactura;
import app.modulos.factura.EliminarFactura;
import app.modulos.transaccion.GuardarTransaccion;
import app.modulos.transaccion.ActualizarTransaccion;
import app.modulos.transaccion.ListarTransaccion;
import app.modulos.transaccion.EliminarTransaccion;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author kevin
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(new ImageIcon(getClass().getResource("/recursos/imagenes/Imagen.png")).getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        mInicio = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenu();
        mRegistrarCliente = new javax.swing.JMenuItem();
        mActualizarCliente = new javax.swing.JMenuItem();
        mListarCliente = new javax.swing.JMenuItem();
        mEliminarCliente = new javax.swing.JMenuItem();
        mUsuario = new javax.swing.JMenu();
        mRegistrarUsuario = new javax.swing.JMenuItem();
        mActualizarUsuario = new javax.swing.JMenuItem();
        mListarUsuario = new javax.swing.JMenuItem();
        mEliminarUsuario = new javax.swing.JMenuItem();
        mProveedor = new javax.swing.JMenu();
        mRegistrarProveedor = new javax.swing.JMenuItem();
        mActualizarProveedor = new javax.swing.JMenuItem();
        mListarProveedor = new javax.swing.JMenuItem();
        mEliminarProveedor = new javax.swing.JMenuItem();
        mInventario = new javax.swing.JMenu();
        mRegistrarInventario = new javax.swing.JMenuItem();
        mActualizarInventario = new javax.swing.JMenuItem();
        mListarInventario = new javax.swing.JMenuItem();
        mEliminarInventario = new javax.swing.JMenuItem();
        mFactura = new javax.swing.JMenu();
        mRegistrarFactura = new javax.swing.JMenuItem();
        mActualizarFactura = new javax.swing.JMenuItem();
        mListarFactura = new javax.swing.JMenuItem();
        mEliminarFactura = new javax.swing.JMenuItem();
        mTransaccion = new javax.swing.JMenu();
        mRegistrarTransaccion = new javax.swing.JMenuItem();
        mActualizarTransaccion = new javax.swing.JMenuItem();
        mListarTransaccion = new javax.swing.JMenuItem();
        mEliminarTransaccion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        mInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-system-16.png"))); // NOI18N
        mInicio.setText("Inicio");

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-close-program-16.png"))); // NOI18N
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mInicio.add(exitMenuItem);

        jMenuBar1.add(mInicio);

        mCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Cliente.png"))); // NOI18N
        mCliente.setText("Cliente");

        mRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarCliente.setText("Registrar");
        mRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarClienteActionPerformed(evt);
            }
        });
        mCliente.add(mRegistrarCliente);

        mActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarCliente.setText("Actualizar");
        mActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarClienteActionPerformed(evt);
            }
        });
        mCliente.add(mActualizarCliente);

        mListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarCliente.setText("Listar");
        mListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarClienteActionPerformed(evt);
            }
        });
        mCliente.add(mListarCliente);

        mEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarCliente.setText("Eliminar");
        mEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarClienteActionPerformed(evt);
            }
        });
        mCliente.add(mEliminarCliente);

        jMenuBar1.add(mCliente);

        mUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Usuario.png"))); // NOI18N
        mUsuario.setText("Usuario");

        mRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarUsuario.setText("Registrar");
        mRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(mRegistrarUsuario);

        mActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarUsuario.setText("Actualizar");
        mActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(mActualizarUsuario);

        mListarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarUsuario.setText("Listar");
        mListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(mListarUsuario);

        mEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarUsuario.setText("Eliminar");
        mEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(mEliminarUsuario);

        jMenuBar1.add(mUsuario);

        mProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Proveedor.png"))); // NOI18N
        mProveedor.setText("Proveedor");

        mRegistrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarProveedor.setText("Registrar");
        mRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarProveedorActionPerformed(evt);
            }
        });
        mProveedor.add(mRegistrarProveedor);

        mActualizarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarProveedor.setText("Actualizar");
        mActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarProveedorActionPerformed(evt);
            }
        });
        mProveedor.add(mActualizarProveedor);

        mListarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarProveedor.setText("Listar");
        mListarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarProveedorActionPerformed(evt);
            }
        });
        mProveedor.add(mListarProveedor);

        mEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarProveedor.setText("Eliminar");
        mEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarProveedorActionPerformed(evt);
            }
        });
        mProveedor.add(mEliminarProveedor);

        jMenuBar1.add(mProveedor);

        mInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Inventario.png"))); // NOI18N
        mInventario.setText("Inventario");
        mInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventarioActionPerformed(evt);
            }
        });

        mRegistrarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarInventario.setText("Registrar");
        mRegistrarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarInventarioActionPerformed(evt);
            }
        });
        mInventario.add(mRegistrarInventario);

        mActualizarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarInventario.setText("Actualizar");
        mActualizarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarInventarioActionPerformed(evt);
            }
        });
        mInventario.add(mActualizarInventario);

        mListarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarInventario.setText("Listar");
        mListarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarInventarioActionPerformed(evt);
            }
        });
        mInventario.add(mListarInventario);

        mEliminarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarInventario.setText("Eliminar");
        mEliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarInventarioActionPerformed(evt);
            }
        });
        mInventario.add(mEliminarInventario);

        jMenuBar1.add(mInventario);

        mFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Factura.png"))); // NOI18N
        mFactura.setText("Factura");

        mRegistrarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarFactura.setText("Registrar");
        mRegistrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarFacturaActionPerformed(evt);
            }
        });
        mFactura.add(mRegistrarFactura);

        mActualizarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarFactura.setText("Actualizar");
        mActualizarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarFacturaActionPerformed(evt);
            }
        });
        mFactura.add(mActualizarFactura);

        mListarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarFactura.setText("Listar");
        mListarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarFacturaActionPerformed(evt);
            }
        });
        mFactura.add(mListarFactura);

        mEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarFactura.setText("Eliminar");
        mEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarFacturaActionPerformed(evt);
            }
        });
        mFactura.add(mEliminarFactura);

        jMenuBar1.add(mFactura);

        mTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Transaccion.png"))); // NOI18N
        mTransaccion.setText("Transaccion");

        mRegistrarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Guardar.png"))); // NOI18N
        mRegistrarTransaccion.setText("Registrar");
        mRegistrarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarTransaccionActionPerformed(evt);
            }
        });
        mTransaccion.add(mRegistrarTransaccion);

        mActualizarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Actualizar.png"))); // NOI18N
        mActualizarTransaccion.setText("Actualizar");
        mActualizarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarTransaccionActionPerformed(evt);
            }
        });
        mTransaccion.add(mActualizarTransaccion);

        mListarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Consultar.png"))); // NOI18N
        mListarTransaccion.setText("Listar");
        mListarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarTransaccionActionPerformed(evt);
            }
        });
        mTransaccion.add(mListarTransaccion);

        mEliminarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/Eliminar.png"))); // NOI18N
        mEliminarTransaccion.setText("Eliminar");
        mEliminarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarTransaccionActionPerformed(evt);
            }
        });
        mTransaccion.add(mEliminarTransaccion);

        jMenuBar1.add(mTransaccion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mRegistrarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarInventarioActionPerformed
        GuardarInventario myForm = new GuardarInventario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarInventarioActionPerformed

    private void mInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mInventarioActionPerformed

    private void mActualizarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarInventarioActionPerformed
        ActualizarInventario myForm = new ActualizarInventario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarInventarioActionPerformed

    private void mListarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarInventarioActionPerformed
        ListarInventario myForm = new ListarInventario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarInventarioActionPerformed

    private void mRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarProveedorActionPerformed
        GuardarProveedor myForm = new GuardarProveedor();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarProveedorActionPerformed

    private void mActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarProveedorActionPerformed
        ActualizarProveedor myForm = new ActualizarProveedor();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarProveedorActionPerformed

    private void mListarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarProveedorActionPerformed
        ListarProveedor myForm = new ListarProveedor();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarProveedorActionPerformed

    private void mRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarClienteActionPerformed
        GuardarCliente myForm = new GuardarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarClienteActionPerformed

    private void mListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarClienteActionPerformed
        ListarCliente myForm = new ListarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarClienteActionPerformed

    private void mActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarClienteActionPerformed
        ActualizarCliente myForm = new ActualizarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarClienteActionPerformed

    private void mRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarUsuarioActionPerformed
        GuardarUsuario myForm = new GuardarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarUsuarioActionPerformed

    private void mActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarUsuarioActionPerformed
        ActualizarUsuario myForm = new ActualizarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarUsuarioActionPerformed

    private void mListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarUsuarioActionPerformed
        ListarUsuario myForm = new ListarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarUsuarioActionPerformed

    private void mListarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarFacturaActionPerformed
        ListarFactura myForm = new ListarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarFacturaActionPerformed

    private void mActualizarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarFacturaActionPerformed
        ActualizarFactura myForm = new ActualizarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarFacturaActionPerformed

    private void mRegistrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarFacturaActionPerformed
        GuardarFactura myForm = new GuardarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarFacturaActionPerformed

    private void mRegistrarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarTransaccionActionPerformed
        GuardarTransaccion myForm = new GuardarTransaccion();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarTransaccionActionPerformed

    private void mActualizarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarTransaccionActionPerformed
        ActualizarTransaccion myForm = new ActualizarTransaccion();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarTransaccionActionPerformed

    private void mListarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarTransaccionActionPerformed
        ListarTransaccion myForm = new ListarTransaccion();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarTransaccionActionPerformed

    private void mEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarClienteActionPerformed
        EliminarCliente myForm = new EliminarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarClienteActionPerformed

    private void mEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarUsuarioActionPerformed
        EliminarUsuario myForm = new EliminarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarUsuarioActionPerformed

    private void mEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarProveedorActionPerformed
        EliminarProveedor myForm = new EliminarProveedor();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarProveedorActionPerformed

    private void mEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarInventarioActionPerformed
        EliminarInventario myForm = new EliminarInventario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarInventarioActionPerformed

    private void mEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarFacturaActionPerformed
        EliminarFactura myForm = new EliminarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarFacturaActionPerformed

    private void mEliminarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarTransaccionActionPerformed
        EliminarTransaccion myForm = new EliminarTransaccion();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mEliminarTransaccionActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mActualizarCliente;
    private javax.swing.JMenuItem mActualizarFactura;
    private javax.swing.JMenuItem mActualizarInventario;
    private javax.swing.JMenuItem mActualizarProveedor;
    private javax.swing.JMenuItem mActualizarTransaccion;
    private javax.swing.JMenuItem mActualizarUsuario;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenuItem mEliminarCliente;
    private javax.swing.JMenuItem mEliminarFactura;
    private javax.swing.JMenuItem mEliminarInventario;
    private javax.swing.JMenuItem mEliminarProveedor;
    private javax.swing.JMenuItem mEliminarTransaccion;
    private javax.swing.JMenuItem mEliminarUsuario;
    private javax.swing.JMenu mFactura;
    private javax.swing.JMenu mInicio;
    private javax.swing.JMenu mInventario;
    private javax.swing.JMenuItem mListarCliente;
    private javax.swing.JMenuItem mListarFactura;
    private javax.swing.JMenuItem mListarInventario;
    private javax.swing.JMenuItem mListarProveedor;
    private javax.swing.JMenuItem mListarTransaccion;
    private javax.swing.JMenuItem mListarUsuario;
    private javax.swing.JMenu mProveedor;
    private javax.swing.JMenuItem mRegistrarCliente;
    private javax.swing.JMenuItem mRegistrarFactura;
    private javax.swing.JMenuItem mRegistrarInventario;
    private javax.swing.JMenuItem mRegistrarProveedor;
    private javax.swing.JMenuItem mRegistrarTransaccion;
    private javax.swing.JMenuItem mRegistrarUsuario;
    private javax.swing.JMenu mTransaccion;
    private javax.swing.JMenu mUsuario;
    private javax.swing.JDesktopPane panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

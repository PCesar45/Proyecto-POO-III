/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Singleton;
import Modelo.Combo;
import Modelo.LeerCombos;
import Modelo.LeerPlatos;
import Modelo.Plato;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrés
 */
public class VistaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VistaCliente
     */
    public VistaCliente() {
        initComponents();
        ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagenes/restaurante.png"));
        Icon icono1 = new ImageIcon(img1.getImage().getScaledInstance(lblImg.getWidth(),lblImg.getHeight(),Image.SCALE_SMOOTH));
        lblImg.setIcon(icono1);
        
        ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagenes/delivery.png"));
        Icon icono2 = new ImageIcon(img2.getImage().getScaledInstance(lblImg2.getWidth(),lblImg2.getHeight(),Image.SCALE_SMOOTH));
        lblImg2.setIcon(icono2);
        
        ImageIcon img3 = new ImageIcon(getClass().getResource("/Imagenes/Combo.jpg"));
        Icon icono3 = new ImageIcon(img3.getImage().getScaledInstance(lblImg3.getWidth(),lblImg3.getHeight(),Image.SCALE_SMOOTH));
        lblImg3.setIcon(icono3);
        
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBienvenida = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImg3 = new javax.swing.JLabel();
        pnlMCEspacios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMCReservas = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        pnlMCMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnMCMenu = new javax.swing.JButton();
        lblImg2 = new javax.swing.JLabel();
        btnMCMenu1 = new javax.swing.JButton();
        pnlMCConsultas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCtarReserva = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCtarPedido = new javax.swing.JTextField();
        btnCtaPedido = new javax.swing.JButton();
        btnCtarReserva = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente - La Sodita");

        lblBienvenida.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(51, 153, 0));
        lblBienvenida.setText("¡Bienvenido a la Sodita en línea!");

        lblInfo1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblInfo1.setText("Debido a la situación vivida por el COVID-19, queremos cuidar a nuestros clientes sin dejar de ofrecer nuestros servicios");

        lblInfo2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblInfo2.setText("por ello, la Sodita le ofrece ahora sus servicios de manera VIRTUAL");

        javax.swing.GroupLayout pnlBienvenidaLayout = new javax.swing.GroupLayout(pnlBienvenida);
        pnlBienvenida.setLayout(pnlBienvenidaLayout);
        pnlBienvenidaLayout.setHorizontalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addGroup(pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblInfo1))
                    .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblBienvenida))
                    .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(lblInfo2)))
                .addGap(18, 18, 18)
                .addComponent(lblImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlBienvenidaLayout.setVerticalGroup(
            pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBienvenidaLayout.createSequentialGroup()
                        .addComponent(lblBienvenida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInfo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel1.setText("¿Extrañas venir a comer a nuestro amigable local?");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel2.setText("Consulta si hay algún espacio disponible, ¡Haz tu reservación!");

        btnMCReservas.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnMCReservas.setText("¡Ver Espacios!");

        javax.swing.GroupLayout pnlMCEspaciosLayout = new javax.swing.GroupLayout(pnlMCEspacios);
        pnlMCEspacios.setLayout(pnlMCEspaciosLayout);
        pnlMCEspaciosLayout.setHorizontalGroup(
            pnlMCEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCEspaciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(pnlMCEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMCEspaciosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMCEspaciosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114)))
                .addComponent(btnMCReservas)
                .addGap(64, 64, 64))
        );
        pnlMCEspaciosLayout.setVerticalGroup(
            pnlMCEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCEspaciosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMCEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMCReservas)
                    .addGroup(pnlMCEspaciosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(pnlMCEspaciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel3.setText("¿Antojado de alguno de nuestros platillos?");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel4.setText("Mira nuestro menú, haz tu pedido y te lo llevamos a donde estes!");

        btnMCMenu.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnMCMenu.setText("¡Ver Menú Platos!");
        btnMCMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCMenuActionPerformed(evt);
            }
        });

        btnMCMenu1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btnMCMenu1.setText("¡Ver Menú combos!");
        btnMCMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMCMenuLayout = new javax.swing.GroupLayout(pnlMCMenu);
        pnlMCMenu.setLayout(pnlMCMenuLayout);
        pnlMCMenuLayout.setHorizontalGroup(
            pnlMCMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(pnlMCMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMCMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(85, 85, 85)
                        .addComponent(btnMCMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMCMenuLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMCMenu1)
                        .addGap(4, 4, 4))))
        );
        pnlMCMenuLayout.setVerticalGroup(
            pnlMCMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlMCMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(btnMCMenu))
                .addGap(13, 13, 13)
                .addGroup(pnlMCMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMCMenu1))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMCMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("? Ingresa tu número de reservación y consultá:   ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("¿Deseas conocer el detalle de tu   ");

        btnCtaPedido.setText("Ver");

        btnCtarReserva.setText("Ver");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Reserva");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("¿Deseas conocer el detalle de tu  ");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 102, 0));
        jLabel9.setText("Pedido");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("? Ingresa tu número de pedido y consultá:    ");

        javax.swing.GroupLayout pnlMCConsultasLayout = new javax.swing.GroupLayout(pnlMCConsultas);
        pnlMCConsultas.setLayout(pnlMCConsultasLayout);
        pnlMCConsultasLayout.setHorizontalGroup(
            pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                        .addComponent(txtCtarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCtaPedido))
                    .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                        .addComponent(txtCtarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCtarReserva)))
                .addGap(157, 157, 157))
        );
        pnlMCConsultasLayout.setVerticalGroup(
            pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMCConsultasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCtarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCtarReserva)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMCConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCtaPedido)
                    .addComponent(txtCtarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMCConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMCMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMCEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMCEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlMCMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(pnlMCConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMCMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCMenuActionPerformed
        LeerPlatos plts= new LeerPlatos();
        plts.Recuperar();
         
        Menus vista=new Menus();
        DefaultTableModel modelo=new DefaultTableModel();
        JTable tabla=vista.DatosExcel;
        tabla.setModel(modelo);
        ArrayList<Plato> platos=Singleton.getInstance().getMiLocal().getMenu().VerPlatos();
     //   ArrayList<Combo> combost=Singleton.getInstance().getMiLocal().getMenu().VerCombos();
        vista.setModicar(false);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        Object[]ListaColumna=new Object[9999];
        for(int j=0;j!=platos.size();j++){
             //   System.out.println("1");
                ListaColumna[0]=platos.get(j).getCodigo();
                ListaColumna[1]=platos.get(j).getNombre();
                ListaColumna[2]=platos.get(j).getPrecio();
                if(platos.get(j).isDisponibilidad()==false){
                    ListaColumna[3]="No esta disponible";
                }
                else{
                    ListaColumna[3]="Disponible";
                }

                modelo.addRow(ListaColumna);
             }
            
        
        
         vista.setVisible(true);
    }//GEN-LAST:event_btnMCMenuActionPerformed

    private void btnMCMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCMenu1ActionPerformed
        LeerPlatos plts= new LeerPlatos();
        plts.Recuperar();
        LeerCombos p1 = new LeerCombos();
        p1.Recuperar();
       
        Menus vista=new Menus();
        DefaultTableModel modelo=new DefaultTableModel();
        JTable tabla=vista.DatosExcel;
        tabla.setModel(modelo);
        vista.setModicar(false);
        //ArrayList<Plato> platos=Singleton.getInstance().getMiLocal().getMenu().VerPlatos();
        ArrayList<Combo> combost=Singleton.getInstance().getMiLocal().getMenu().VerCombos();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        
        modelo.addColumn("Descripcion");
        Object[]ListaColumna=new Object[9999];
         //int cont;
       System.out.println(combost.size());
       
            for(int j=0;j!=combost.size();j++){
               /// System.out.println("1");
                ListaColumna[0]=combost.get(j).getCodigo();
                ListaColumna[1]=combost.get(j).getNombre();
                ListaColumna[2]=combost.get(j).getPrecio();
                if(combost.get(j).isDisponibilidad()==false){
                    ListaColumna[3]="No esta disponible";
                }
                else{
                    ListaColumna[3]="Disponible";
                }
                ListaColumna[4]=combost.get(j).getDescripcion();
                modelo.addRow(ListaColumna);
             }
            
        
        vista.setVisible(true);
    }//GEN-LAST:event_btnMCMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCtaPedido;
    private javax.swing.JButton btnCtarReserva;
    private javax.swing.JButton btnMCMenu;
    private javax.swing.JButton btnMCMenu1;
    private javax.swing.JButton btnMCReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JPanel pnlBienvenida;
    private javax.swing.JPanel pnlMCConsultas;
    private javax.swing.JPanel pnlMCEspacios;
    private javax.swing.JPanel pnlMCMenu;
    private javax.swing.JTextField txtCtarPedido;
    private javax.swing.JTextField txtCtarReserva;
    // End of variables declaration//GEN-END:variables
}

package Controlador;

import Gui.LienzoDeVentana;
import Vista.GestionDeRecetas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class GestionDeManufactura extends javax.swing.JFrame {

    private GestionDeRecetas gdr = null;
    private EntityManagerFactory emf;
    private EntityManager em;

    /**
     * Creates new form GestionDeManufactura
     */
    public GestionDeManufactura() {
        emf = Persistence.createEntityManagerFactory("GestionDeManufacturaPU");
        em = emf.createEntityManager();

        String nombreImagen = "/Recursos/navi_india.jpg";
        Image ima;

        ima = Toolkit.getDefaultToolkit().
                getImage(getClass().getResource(nombreImagen));
        LienzoDeVentana lienzo = new LienzoDeVentana("/Recursos/navi_india.jpg");
        setContentPane(lienzo);

        initComponents();
        setVisible(true);
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
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        granPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botSalir = new javax.swing.JButton();
        botCompras = new javax.swing.JButton();
        botComponente2 = new javax.swing.JButton();
        botComponente3 = new javax.swing.JButton();
        botComponente4 = new javax.swing.JButton();
        botRecetas = new javax.swing.JButton();

        jTextPane1.setEditable(false);
        jTextPane1.setContentType("Hola"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setEditable(false);
        jTextPane2.setContentType("Cosa");
        jScrollPane2.setViewportView(jTextPane2);

        granPanel.setOpaque(false);
        granPanel.setPreferredSize(new java.awt.Dimension(350, 350));
        granPanel.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                granPanelAncestorResized(evt);
            }
        });

        javax.swing.GroupLayout granPanelLayout = new javax.swing.GroupLayout(granPanel);
        granPanel.setLayout(granPanelLayout);
        granPanelLayout.setHorizontalGroup(
            granPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        granPanelLayout.setVerticalGroup(
            granPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion de Manufactura");

        botSalir.setBackground(new java.awt.Color(255, 255, 255));
        botSalir.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/SalirIcono.png"))); // NOI18N
        botSalir.setToolTipText("Salir");
        botSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.pink, null, null));
        botSalir.setBorderPainted(false);
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        botCompras.setBackground(new java.awt.Color(255, 255, 255));
        botCompras.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Compras.png"))); // NOI18N
        botCompras.setToolTipText("Compras");
        botCompras.setBorder(null);
        botCompras.setBorderPainted(false);
        botCompras.setFocusPainted(false);

        botComponente2.setBackground(new java.awt.Color(255, 255, 255));
        botComponente2.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botComponente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/costos.png"))); // NOI18N
        botComponente2.setToolTipText("Costos de produccion");
        botComponente2.setBorder(null);
        botComponente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botComponente2ActionPerformed(evt);
            }
        });

        botComponente3.setBackground(new java.awt.Color(255, 255, 255));
        botComponente3.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botComponente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/inventario.jpeg"))); // NOI18N
        botComponente3.setToolTipText("Inventarios");
        botComponente3.setBorder(null);
        botComponente3.setBorderPainted(false);
        botComponente3.setFocusPainted(false);

        botComponente4.setBackground(new java.awt.Color(255, 255, 255));
        botComponente4.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botComponente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ventas.png"))); // NOI18N
        botComponente4.setToolTipText("Ventas");
        botComponente4.setBorder(null);
        botComponente4.setBorderPainted(false);
        botComponente4.setFocusPainted(false);
        botComponente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botComponente4ActionPerformed(evt);
            }
        });

        botRecetas.setBackground(new java.awt.Color(255, 255, 255));
        botRecetas.setFont(new java.awt.Font("Umpush", 0, 24)); // NOI18N
        botRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/receta.png"))); // NOI18N
        botRecetas.setToolTipText("Recetas");
        botRecetas.setBorder(null);
        botRecetas.setBorderPainted(false);
        botRecetas.setFocusPainted(false);
        botRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRecetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botComponente2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botComponente3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botComponente4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botComponente2, botComponente3, botComponente4, botCompras, botRecetas, botSalir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botComponente2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botCompras)
                    .addComponent(botComponente3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botComponente4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botComponente2, botComponente3, botComponente4, botCompras, botRecetas, botSalir});

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void granPanelAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_granPanelAncestorResized
    }//GEN-LAST:event_granPanelAncestorResized

    private void botRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRecetasActionPerformed
        if (gdr == null || !gdr.isEnabled())
            gdr = new GestionDeRecetas(em);
    }//GEN-LAST:event_botRecetasActionPerformed

    private void botComponente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botComponente4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botComponente4ActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        if (gdr != null && gdr.isEnabled())
            JOptionPane.showMessageDialog(this, "Tiene procesos abiertos en ejecución.\n"
                    + "Cierrelos antes de terminar");
        else
            System.exit(0);
    }//GEN-LAST:event_botSalirActionPerformed

    private void botComponente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botComponente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botComponente2ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeManufactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeManufactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeManufactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeManufactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeManufactura();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botComponente2;
    private javax.swing.JButton botComponente3;
    private javax.swing.JButton botComponente4;
    private javax.swing.JButton botCompras;
    private javax.swing.JButton botRecetas;
    private javax.swing.JButton botSalir;
    private javax.swing.JPanel granPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}

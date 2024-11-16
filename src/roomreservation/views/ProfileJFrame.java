/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package roomreservation.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;

/**
 *
 * @author USUARIO
 */
public class ProfileJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MiCuenta
     */
    
    Color mColorFondo = new Color(18, 54, 41);
    
    
    private final JMenuItem mniRoomc;
    private final JMenuItem mniHome;
    private final JMenuItem mniReservation;
    private final JMenuItem mniHistory;
    private final JMenuItem mniAdministration;
    private final JMenuItem mniProfile;
    private final JMenuItem mniUserManagement;
    private final JMenuItem mniExit;
    
    public ProfileJFrame() {
        initComponents();
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
       // Configuración del JMenuBar
        mbMenu = new JMenuBar();
        mbMenu.setPreferredSize(new Dimension(1468, 140));
        mbMenu.setOpaque(false);     // Para ajustar la opacidad
        mbMenu.setBackground(mColorFondo);   
        mbMenu.setBorder(new LineBorder(mColorFondo, 1));        
        
        // Configuración de los elementos del menú
        mniRoomc = new JMenuItem("Roomc");
        mniRoomc.setOpaque(true);
        mniRoomc.setFont(new Font("Inter", Font.BOLD, 40)); // Configuración de fuente para "Roomc"
        mniRoomc.setForeground(Color.white);
        mniRoomc.setBackground(mColorFondo);

        Font menuFont = new Font("Inter", Font.PLAIN, 16); // Fuente para los otros menús
        mniHome = createMenuItem("Inicio", menuFont);
        mniReservation = createMenuItem("Reservar", menuFont);
        mniHistory = createMenuItem("Historial", menuFont);
        mniAdministration = createMenuItem("Administrar", menuFont);
        mniProfile = createMenuItem("Perfil", menuFont);
        mniUserManagement = createMenuItem("Gestionar Usuarios", menuFont);
        mniExit = createMenuItem("Salir", menuFont);

        // Agregar ítems al menú
        mbMenu.add(mniRoomc);
        mbMenu.add(mniHome);
        mbMenu.add(mniReservation);
        mbMenu.add(mniHistory);
        mbMenu.add(mniAdministration);
        mbMenu.add(mniProfile);
        mbMenu.add(mniUserManagement);
        mbMenu.add(mniExit);
        
        mniHome.addActionListener((ActionEvent e) -> {
            new HomeJFrame().setVisible(true); // Abre otro JFrame Inicio
            dispose(); // Cierra el JFrame actual
        });
        
        mniReservation.addActionListener((var e) -> {
            new ReservationJFrame().setVisible(true); // Abre el JFrame Reservar
            dispose(); // Cierra el JFrame actual
        });
        
        mniHistory.addActionListener((var e) -> {
            new ReservationJFrame().setVisible(true); // Abre el JFrame Reservar
            dispose(); // Cierra el JFrame actual
        });
        
        mniAdministration.addActionListener((var e) -> {
            new ReservationJFrame().setVisible(true); // Abre el JFrame Reservar
            dispose(); // Cierra el JFrame actual
        });
        
        mniUserManagement.addActionListener((var e) -> {
            new ReservationJFrame().setVisible(true); // Abre el JFrame Reservar
            dispose(); // Cierra el JFrame actual
        });
        
         mniExit.addActionListener((ActionEvent e) -> {
         System.exit(0);
         });


        setJMenuBar(mbMenu);
        

    }
      private JMenuItem createMenuItem(String text, Font font) {
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.setOpaque(true);
        menuItem.setFont(font);
        menuItem.setForeground(Color.white);
        menuItem.setBackground(mColorFondo);
        return menuItem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mbMenu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mbMenu;
    // End of variables declaration//GEN-END:variables
}

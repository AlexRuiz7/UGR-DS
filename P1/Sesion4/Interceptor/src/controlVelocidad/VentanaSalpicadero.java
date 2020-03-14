/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlVelocidad;

/**
 *
 * @author pablorobles
 */
public class VentanaSalpicadero extends javax.swing.JFrame {

    /**
     * Creates new form VentanaControl
     */
    public VentanaSalpicadero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_salpicadero = new javax.swing.JPanel();
        panel_velocimetro = new javax.swing.JPanel();
        panel_kmh = new javax.swing.JPanel();
        etiqueta_km = new javax.swing.JLabel();
        panel_cuentaKm = new javax.swing.JPanel();
        panel_cuentaRec = new javax.swing.JPanel();
        etiqueta_km_rec = new javax.swing.JLabel();
        panel_cuentaTotal = new javax.swing.JPanel();
        etiqueta_km_total = new javax.swing.JLabel();
        panel_cuentaRevoluciones = new javax.swing.JPanel();
        panel_RPM = new javax.swing.JPanel();
        etiqueta_rpm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        panel_salpicadero.setBorder(javax.swing.BorderFactory.createTitledBorder("Salpicadero"));
        panel_salpicadero.setPreferredSize(new java.awt.Dimension(400, 400));
        panel_salpicadero.setLayout(new java.awt.GridLayout(3, 1));

        panel_velocimetro.setBorder(javax.swing.BorderFactory.createTitledBorder("Velocimetro"));
        panel_velocimetro.setLayout(new java.awt.BorderLayout());

        panel_kmh.setBorder(javax.swing.BorderFactory.createTitledBorder("km/h"));
        panel_kmh.setLayout(new java.awt.BorderLayout());

        etiqueta_km.setText("00.00");
        panel_kmh.add(etiqueta_km, java.awt.BorderLayout.CENTER);

        panel_velocimetro.add(panel_kmh, java.awt.BorderLayout.CENTER);

        panel_salpicadero.add(panel_velocimetro);

        panel_cuentaKm.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Kilometros"));
        panel_cuentaKm.setLayout(new java.awt.GridLayout(2, 1));

        panel_cuentaRec.setBorder(javax.swing.BorderFactory.createTitledBorder("km/h"));
        panel_cuentaRec.setLayout(new java.awt.BorderLayout());

        etiqueta_km_rec.setText("00.00");
        panel_cuentaRec.add(etiqueta_km_rec, java.awt.BorderLayout.CENTER);

        panel_cuentaKm.add(panel_cuentaRec);

        panel_cuentaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("km/h"));
        panel_cuentaTotal.setLayout(new java.awt.BorderLayout());

        etiqueta_km_total.setText("00.00");
        panel_cuentaTotal.add(etiqueta_km_total, java.awt.BorderLayout.CENTER);

        panel_cuentaKm.add(panel_cuentaTotal);

        panel_salpicadero.add(panel_cuentaKm);

        panel_cuentaRevoluciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Revoluciones"));
        panel_cuentaRevoluciones.setLayout(new java.awt.BorderLayout());

        panel_RPM.setBorder(javax.swing.BorderFactory.createTitledBorder("RPM"));
        panel_RPM.setLayout(new java.awt.BorderLayout());

        etiqueta_rpm.setText("00.00");
        panel_RPM.add(etiqueta_rpm, java.awt.BorderLayout.CENTER);

        panel_cuentaRevoluciones.add(panel_RPM, java.awt.BorderLayout.CENTER);

        panel_salpicadero.add(panel_cuentaRevoluciones);

        getContentPane().add(panel_salpicadero, java.awt.BorderLayout.PAGE_START);

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
            java.util.logging.Logger.getLogger(VentanaSalpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSalpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSalpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSalpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSalpicadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta_km;
    private javax.swing.JLabel etiqueta_km_rec;
    private javax.swing.JLabel etiqueta_km_total;
    private javax.swing.JLabel etiqueta_rpm;
    private javax.swing.JPanel panel_RPM;
    private javax.swing.JPanel panel_cuentaKm;
    private javax.swing.JPanel panel_cuentaRec;
    private javax.swing.JPanel panel_cuentaRevoluciones;
    private javax.swing.JPanel panel_cuentaTotal;
    private javax.swing.JPanel panel_kmh;
    private javax.swing.JPanel panel_salpicadero;
    private javax.swing.JPanel panel_velocimetro;
    // End of variables declaration//GEN-END:variables
}
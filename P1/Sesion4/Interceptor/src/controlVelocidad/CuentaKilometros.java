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
public class CuentaKilometros extends javax.swing.JPanel {

    /**
     * Creates new form CuentaKilometros
     */
    public CuentaKilometros() {
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

        panel_cuentaRec = new javax.swing.JPanel();
        etiqueta_km_rec = new javax.swing.JLabel();
        panel_cuentaTotal = new javax.swing.JPanel();
        etiqueta_km_total = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentakilómetros"));
        setLayout(new java.awt.GridLayout(2, 1));

        panel_cuentaRec.setBorder(javax.swing.BorderFactory.createTitledBorder("contador reciente"));
        panel_cuentaRec.setLayout(new java.awt.BorderLayout());

        etiqueta_km_rec.setText("00.00");
        panel_cuentaRec.add(etiqueta_km_rec, java.awt.BorderLayout.CENTER);

        add(panel_cuentaRec);

        panel_cuentaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("contador total"));
        panel_cuentaTotal.setLayout(new java.awt.BorderLayout());

        etiqueta_km_total.setText("00.00");
        panel_cuentaTotal.add(etiqueta_km_total, java.awt.BorderLayout.CENTER);

        add(panel_cuentaTotal);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta_km_rec;
    private javax.swing.JLabel etiqueta_km_total;
    private javax.swing.JPanel panel_cuentaRec;
    private javax.swing.JPanel panel_cuentaTotal;
    // End of variables declaration//GEN-END:variables
}

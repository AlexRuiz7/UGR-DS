<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

=======
package GUI;

import java.util.Observable;

>>>>>>> origin/master
/**
 *
 * @author pablorobles
 */
<<<<<<< HEAD
public class CuentaRevoluciones extends javax.swing.JPanel {

    /**
     * Creates new form CuentaRevoluciones
     */
    public CuentaRevoluciones() {
        initComponents();
    }
    
    public void actualizar(double rpm){
        this.etiqueta_rpm.setText(""+rpm);
    }

=======
public class CuentaRevoluciones extends ObservadorMotor {

    private int RPM;
    
    
    public CuentaRevoluciones() {
        initComponents();
        
        RPM = 0;
    }

    
    @Override
    public void update(Observable o, Object arg) {
        RPM = this.miObservable.getRPM();
        
        etiqueta_rpm.setText(Double.toString(RPM));
    }
    
>>>>>>> origin/master
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_RPM = new javax.swing.JPanel();
        etiqueta_rpm = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentarrevoluciones"));
        setLayout(new java.awt.BorderLayout());

        panel_RPM.setBorder(javax.swing.BorderFactory.createTitledBorder("RPM"));
        panel_RPM.setLayout(new java.awt.BorderLayout());

        etiqueta_rpm.setText("00.00");
        panel_RPM.add(etiqueta_rpm, java.awt.BorderLayout.CENTER);

        add(panel_RPM, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta_rpm;
    private javax.swing.JPanel panel_RPM;
    // End of variables declaration//GEN-END:variables
}

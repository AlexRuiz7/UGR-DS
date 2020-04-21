package GUI;

import controlVelocidad.Objetivo;

/**
 *
 * @author pablorobles
 */
public class SalpicaderoSteelSeries extends javax.swing.JPanel {
    
    
    /**
     * Creates new form Salpicadero
     */
    public SalpicaderoSteelSeries() {
        initComponents();
    }
    
    
    public void setObjetivo(Objetivo motor) {
        this.cuentaKilometrosSteelSeries.setObservable(motor);
        this.cuentaRevolucionesSteelSeries.setObservable(motor);
        this.velocimetroSteelSeries.setObservable(motor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        velocimetroSteelSeries = new GUI.VelocimetroSteelSeries();
        subpanelA = new javax.swing.JPanel();
        cuentaRevolucionesSteelSeries = new GUI.CuentaRevolucionesSteelSeries();
        cuentaKilometrosSteelSeries = new GUI.CuentaKilometrosSteelSeries();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Salpicadero"));
        setMaximumSize(new java.awt.Dimension(250, 600));
        setMinimumSize(new java.awt.Dimension(250, 600));
        setPreferredSize(new java.awt.Dimension(250, 600));
        setLayout(new java.awt.GridLayout(2, 1));
        add(velocimetroSteelSeries);

        subpanelA.setLayout(new java.awt.BorderLayout());
        subpanelA.add(cuentaRevolucionesSteelSeries, java.awt.BorderLayout.PAGE_START);
        subpanelA.add(cuentaKilometrosSteelSeries, java.awt.BorderLayout.CENTER);

        add(subpanelA);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.CuentaKilometrosSteelSeries cuentaKilometrosSteelSeries;
    private GUI.CuentaRevolucionesSteelSeries cuentaRevolucionesSteelSeries;
    private javax.swing.JPanel subpanelA;
    private GUI.VelocimetroSteelSeries velocimetroSteelSeries;
    // End of variables declaration//GEN-END:variables
}
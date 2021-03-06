package GUI;

import java.util.Observable;

/**
 *
 * @author pablorobles
 */
public class CuentaKilometrosSteelSeries extends ObservadorMotor {


    public CuentaKilometrosSteelSeries() {
        initComponents();
    }

    
    @Override
    public void update(Observable o, Object arg) {        
        this.displayKm_rec.setValue(miObservable.getDistanciaRecorrida());
        this.displayKm_total.setValue(miObservable.getDistanciaRecorrida());
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
        displayKm_rec = new eu.hansolo.steelseries.gauges.DisplaySingle();
        panel_cuentaTotal = new javax.swing.JPanel();
        displayKm_total = new eu.hansolo.steelseries.gauges.DisplaySingle();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentakilómetros"));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panel_cuentaRec.setBorder(javax.swing.BorderFactory.createTitledBorder("Contador reciente"));
        panel_cuentaRec.setDoubleBuffered(false);
        panel_cuentaRec.setFocusable(false);
        panel_cuentaRec.setRequestFocusEnabled(false);
        panel_cuentaRec.setVerifyInputWhenFocusTarget(false);
        panel_cuentaRec.setLayout(new javax.swing.BoxLayout(panel_cuentaRec, javax.swing.BoxLayout.LINE_AXIS));

        displayKm_rec.setLcdDecimals(2);
        displayKm_rec.setUnitString("Km");
        panel_cuentaRec.add(displayKm_rec);

        add(panel_cuentaRec);

        panel_cuentaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Contador total"));
        panel_cuentaTotal.setDoubleBuffered(false);
        panel_cuentaTotal.setLayout(new javax.swing.BoxLayout(panel_cuentaTotal, javax.swing.BoxLayout.LINE_AXIS));

        displayKm_total.setLcdDecimals(2);
        displayKm_total.setUnitString("Km");
        panel_cuentaTotal.add(displayKm_total);

        add(panel_cuentaTotal);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eu.hansolo.steelseries.gauges.DisplaySingle displayKm_rec;
    private eu.hansolo.steelseries.gauges.DisplaySingle displayKm_total;
    private javax.swing.JPanel panel_cuentaRec;
    private javax.swing.JPanel panel_cuentaTotal;
    // End of variables declaration//GEN-END:variables
}

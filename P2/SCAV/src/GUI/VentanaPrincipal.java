package GUI;

import GUI.SCAV.ControlesSCAV;
import controlAutomatico.ControlAutomatico;
import controlVelocidad.Filtros.FiltroCalcularRPM;
import controlVelocidad.Filtros.FiltroRozamiento;
import controlVelocidad.Cliente;
import controlVelocidad.GestorFiltros;
import controlVelocidad.Objetivo;

/**
 *
 * @author alex
 */
public class VentanaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        Objetivo motor = new Objetivo();
        GestorFiltros gestor = new GestorFiltros(motor);
        Cliente controlador = new Cliente(gestor);
        
        /****/
        
        FiltroCalcularRPM filtro_velocidad = new FiltroCalcularRPM();
        FiltroRozamiento filtro_rozamiento = new FiltroRozamiento();
        gestor.setFiltro(filtro_velocidad);
        gestor.setFiltro(filtro_rozamiento);
        
        /****/
        
        /*
        
        //Las siguientes lineas estan comentadas 
        //porque afectan a la pestaña Steelseries
        
        
        salpicadero.setObjetivo(motor);        
        controles.setControlador(controlador);
        monitorMecanico.setObjetivo(motor);
        */
        this.salpicaderoSteelSeries.setObjetivo(motor);
        this.controles_SteelSeries.setControlador(controlador);
        this.monitorMecanicoSteelSeries.setObjetivo(motor);
        
        /****/
        /*
        
        //Las siguientes lineas estan comentadas 
        //porque afectan a la pestaña Steelseries
        
        ControlAutomatico scav = ControlAutomatico.getInstancia(controles);
        scav.setObservable(motor);
        controlesSCAV.setObservable(scav);
        */
        ControlAutomatico scav_ss = ControlAutomatico.getInstancia(controles_SteelSeries);
        scav_ss.setObservable(motor);
        this.controlesSCAV_SteelSeries.setObservable(scav_ss);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsPanel = new javax.swing.JTabbedPane();
        swingPanel = new javax.swing.JPanel();
        controles = new GUI.Controles();
        controlesSCAV = new GUI.SCAV.ControlesSCAV();
        salpicadero = new GUI.Salpicadero();
        monitorMecanico = new GUI.MonitorMecanico.MonitorMecanico();
        SteelSeriesPanel = new javax.swing.JPanel();
        controles_SteelSeries = new GUI.Controles();
        monitorMecanicoSteelSeries = new GUI.MonitorMecanico.MonitorMecanicoSteelSeries();
        controlesSCAV_SteelSeries = new GUI.SCAV.ControlesSCAV();
        salpicaderoSteelSeries = new GUI.SalpicaderoSteelSeries();

        setPreferredSize(new java.awt.Dimension(1024, 768));
        setLayout(new java.awt.BorderLayout());

        swingPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        swingPanel.setLayout(new java.awt.BorderLayout());
        swingPanel.add(controles, java.awt.BorderLayout.PAGE_START);
        swingPanel.add(controlesSCAV, java.awt.BorderLayout.PAGE_END);
        swingPanel.add(salpicadero, java.awt.BorderLayout.CENTER);
        swingPanel.add(monitorMecanico, java.awt.BorderLayout.LINE_END);

        tabsPanel.addTab("Swing", null, swingPanel, "Interfaz con componentes Swing");
        swingPanel.getAccessibleContext().setAccessibleName("");

        SteelSeriesPanel.setLayout(new java.awt.BorderLayout());
        SteelSeriesPanel.add(controles_SteelSeries, java.awt.BorderLayout.PAGE_START);
        SteelSeriesPanel.add(monitorMecanicoSteelSeries, java.awt.BorderLayout.LINE_END);
        SteelSeriesPanel.add(controlesSCAV_SteelSeries, java.awt.BorderLayout.PAGE_END);
        SteelSeriesPanel.add(salpicaderoSteelSeries, java.awt.BorderLayout.CENTER);

        tabsPanel.addTab("SteelSeries", SteelSeriesPanel);

        add(tabsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SteelSeriesPanel;
    private GUI.Controles controles;
    private GUI.SCAV.ControlesSCAV controlesSCAV;
    private GUI.SCAV.ControlesSCAV controlesSCAV_SteelSeries;
    private GUI.Controles controles_SteelSeries;
    private GUI.MonitorMecanico.MonitorMecanico monitorMecanico;
    private GUI.MonitorMecanico.MonitorMecanicoSteelSeries monitorMecanicoSteelSeries;
    private GUI.Salpicadero salpicadero;
    private GUI.SalpicaderoSteelSeries salpicaderoSteelSeries;
    private javax.swing.JPanel swingPanel;
    private javax.swing.JTabbedPane tabsPanel;
    // End of variables declaration//GEN-END:variables
}

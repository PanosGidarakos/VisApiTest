package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;


public class Plots {
    private PlotModel pdp;
    private PlotModel pdp2d;
    private PlotModel ale;

    // Getters and Setters
    public PlotModel getPdp() {
        return pdp;
    }

    public void setPdp(PlotModel pdp) {
        this.pdp = pdp;
    }

    public PlotModel getPdp2d() {
        return pdp2d;
    }

    public void setPdp2d(PlotModel pdp2d) {
        this.pdp2d = pdp2d;
    }

    public PlotModel getAle() {
        return ale;
    }

    public void setAle(PlotModel ale) {
        this.ale = ale;
    }
}
package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;


public class Tables {
    private PlotModel counterfactuals;
    private PlotModel influenceFunctions;

    // Getters and Setters
    public PlotModel getCounterfactuals() {
        return counterfactuals;
    }

    public void setCounterfactuals(PlotModel counterfactuals) {
        this.counterfactuals = counterfactuals;
    }

    public PlotModel getInfluenceFunctions() {
        return influenceFunctions;
    }

    public void setInfluenceFunctions(PlotModel influenceFunctions) {
        this.influenceFunctions = influenceFunctions;
    }
}
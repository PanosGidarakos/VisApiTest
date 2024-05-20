package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;
import java.util.Map;

public class InitializationRequest {
    private ModelDetails model;
    private PipelineDetails pipeline;


    public ModelDetails getModel() {
        return model;
    }

    public void setModel(ModelDetails model) {
        this.model = model;
    }

    public PipelineDetails getPipeline() {
        return pipeline;
    }

    public void setPipeline(PipelineDetails pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public String toString() {
        return "InitializationRequest{" +
                "model=" + model +
                ", pipeline=" + pipeline +
                '}';
    }
}

class ModelDetails {
    private String[] featuresNames;
    private Plots plots;
    private Tables tables;
    public String[] getFeaturesNames() {
        return featuresNames;
    }
    public void setFeaturesNames(String[] featuresNames) {
        this.featuresNames = featuresNames;
    }
    public Plots getPlots() {
        return plots;
    }
    public void setPlots(Plots plots) {
        this.plots = plots;
    }
    public Tables getTables() {
        return tables;
    }
    public void setTables(Tables tables) {
        this.tables = tables;
    }

}

class PipelineDetails {
    private String[] hyperparameterNames;
    private Plots plots;
    private Tables tables;
    public String[] getHyperparameterNames() {
        return hyperparameterNames;
    }
    public void setHyperparameterNames(String[] hyperparameterNames) {
        this.hyperparameterNames = hyperparameterNames;
    }
    public Plots getPlots() {
        return plots;
    }
    public void setPlots(Plots plots) {
        this.plots = plots;
    }
    public Tables getTables() {
        return tables;
    }
    public void setTables(Tables tables) {
        this.tables = tables;
    }

}

class Plots {
    private PlotModel pdp;
    private PlotModel pdp2d;
    private PlotModel ale;

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

class Tables {
    private TableContent counterfactuals;
    private TableContent influenceFunctions;
    public TableContent getCounterfactuals() {
        return counterfactuals;
    }
    public void setCounterfactuals(TableContent counterfactuals) {
        this.counterfactuals = counterfactuals;
    }
    public TableContent getInfluenceFunctions() {
        return influenceFunctions;
    }
    public void setInfluenceFunctions(TableContent influenceFunctions) {
        this.influenceFunctions = influenceFunctions;
    }

}

class TableContent {
    private Map<String, Number[]> content;

    public Map<String, Number[]> getContent() {
        return content;
    }

    public void setContent(Map<String, Number[]> content) {
        this.content = content;
    }

}

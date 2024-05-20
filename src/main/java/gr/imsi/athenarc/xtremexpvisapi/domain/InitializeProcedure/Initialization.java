package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;

import java.util.Map;

public class Initialization {
    private Model model;
    private Pipeline pipeline;

    // Getters and Setters
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    @Override
    public String toString() {
        return "Initialization{" +
                "model=" + model +
                ", pipeline=" + pipeline +
                '}';
    }
}

class Model {
    private String[] featuresNames;
    private Plots plots;
    private Tables tables;

    // Getters and Setters
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

class Pipeline {
    private String[] hyperparameterNames;
    private Plots plots;
    private CounterfactualsTable tables;

    // Getters and Setters
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

    public CounterfactualsTable getTables() {
        return tables;
    }

    public void setTables(CounterfactualsTable tables) {
        this.tables = tables;
    }
}

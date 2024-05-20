package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;

public class InitializationRequest {
    private String modelName;

    // Getters and Setters
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "InitializationRequest{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
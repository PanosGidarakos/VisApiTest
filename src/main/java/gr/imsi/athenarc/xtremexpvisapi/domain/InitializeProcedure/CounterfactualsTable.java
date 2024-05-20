package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;


import java.util.Map;

public class CounterfactualsTable {
    private Map<String, double[]> content;

    // Getters and Setters
    public Map<String, double[]> getContent() {
        return content;
    }

    public void setContent(Map<String, double[]> content) {
        this.content = content;
    }
}
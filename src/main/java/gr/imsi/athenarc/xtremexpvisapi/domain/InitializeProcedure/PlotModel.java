package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;

public class PlotModel {
    private String explainabilityType;
    private String explanationMethod;
    private String explainabilityModel;
    private String plotName;
    private String plotDescr;
    private String plotType;
    private Features features;
    private Axis xAxis;
    private Axis yAxis;
    private Axis zAxis;


    public String getExplainabilityType() {
        return explainabilityType;
    }

    public void setExplainabilityType(String explainabilityType) {
        this.explainabilityType = explainabilityType;
    }

    public String getExplanationMethod() {
        return explanationMethod;
    }

    public void setExplanationMethod(String explanationMethod) {
        this.explanationMethod = explanationMethod;
    }

    public String getExplainabilityModel() {
        return explainabilityModel;
    }

    public void setExplainabilityModel(String explainabilityModel) {
        this.explainabilityModel = explainabilityModel;
    }

    public String getPlotName() {
        return plotName;
    }

    public void setPlotName(String plotName) {
        this.plotName = plotName;
    }

    public String getPlotDescr() {
        return plotDescr;
    }

    public void setPlotDescr(String plotDescr) {
        this.plotDescr = plotDescr;
    }

    public String getPlotType() {
        return plotType;
    }

    public void setPlotType(String plotType) {
        this.plotType = plotType;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Axis getXAxis() {
        return xAxis;
    }

    public void setXAxis(Axis xAxis) {
        this.xAxis = xAxis;
    }

    public Axis getYAxis() {
        return yAxis;
    }

    public void setYAxis(Axis yAxis) {
        this.yAxis = yAxis;
    }

    public Axis getZAxis() {
        return zAxis;
    }

    public void setZAxis(Axis zAxis) {
        this.zAxis = zAxis;
    }

    @Override
    public String toString() {
        return "PlotModel{" +
                "explainabilityType='" + explainabilityType + '\'' +
                ", explanationMethod='" + explanationMethod + '\'' +
                ", explainabilityModel='" + explainabilityModel + '\'' +
                ", plotName='" + plotName + '\'' +
                ", plotDescr='" + plotDescr + '\'' +
                ", plotType='" + plotType + '\'' +
                ", features=" + features +
                ", xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", zAxis=" + zAxis +
                '}';
    }
}
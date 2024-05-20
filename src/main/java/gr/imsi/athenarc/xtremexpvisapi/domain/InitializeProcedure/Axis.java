package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;

import java.util.Arrays;

public class Axis {
    private String axisName;
    private double[] axisValues;
    private String axisType;


    public String getAxisName() {
        return axisName;
    }

    public void setAxisName(String axisName) {
        this.axisName = axisName;
    }

    public double[] getAxisValues() {
        return axisValues;
    }

    public void setAxisValues(double[] axisValues) {
        this.axisValues = axisValues;
    }

    public String getAxisType() {
        return axisType;
    }

    public void setAxisType(String axisType) {
        this.axisType = axisType;
    }

    @Override
    public String toString() {
        return "Axis{" +
                "axisName='" + axisName + '\'' +
                ", axisValues=" + Arrays.toString(axisValues) +
                ", axisType='" + axisType + '\'' +
                '}';
    }
}
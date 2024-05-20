package gr.imsi.athenarc.xtremexpvisapi.domain.InitializeProcedure;

public class InitializationResponse {
    private String data;
    private String message;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InitializationResponse{" +
                "data='" + data + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

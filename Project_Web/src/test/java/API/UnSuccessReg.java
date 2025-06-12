package API;

public class UnSuccessReg {
    public String error;

    public UnSuccessReg() {
    }

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}

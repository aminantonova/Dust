package API;

import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class UnSuccessReg {
    public String error;

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}

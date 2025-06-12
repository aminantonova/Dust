package API;

public class UserTimeResponse extends UserTime{
    public String updatedAt;

    public UserTimeResponse() {
        super(null, null);
    }

    public UserTimeResponse(String name, String job, String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }
}

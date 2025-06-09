package API;

public class Register {
    public String email;
    public String password;

    public Register(String email, String password) {
        this.email = email;
        this.password = password;
        //  геттеры не нужны потому что это post запрос
    }
}

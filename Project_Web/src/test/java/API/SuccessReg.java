package API;

public class SuccessReg {
    //мы заранее объявляем переменные, которые нужны – ожидаемый результат
    //и через assert с помощью геттеров получим токен и id
    public int id;
    public String token;

    public SuccessReg(int id, String token) {
        this.id = id;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}

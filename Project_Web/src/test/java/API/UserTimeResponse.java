package API;

public class UserTimeResponse extends UserTime{
    public String updatedAt;

    //cоздать конструктор
    public UserTimeResponse(String name, String job, String updatedAt) {
        super(name, job);
        this.updatedAt = updatedAt;
        //мы наследуемся от UserTime потому что у нас в этом классе добавляется всего одна строка
        //так как на сайте идет name, job и в ответе добавляется updatedAt
    }
    //геттеры

    public String getUpdatedAt() {
        return updatedAt;
    }
}

package API;

public class UserData {
  public Integer id;
  public String email;
  public String first_name;
  public String last_name;
  public String avatar;
//это мы закинули с data (на сайте) первый список и перевели его с json в java
  public UserData () {
  }
    public UserData(String avatar, String last_name, String first_name, String email, Integer id) {
        this.avatar = avatar;
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAvatar() {
        return avatar;
    }
}

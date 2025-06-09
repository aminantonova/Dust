package API;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/"; //вынесем ссылку в отдельный метод

    @Test
    public void checkAvatarAndIdTest(){
    Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseError400());
    //у нас есть метод, который устанавливает наши спецификации installSpecification
    //в аргументе нужно указать спецификаицю и метод запроса и ответа
        List<UserData> users = given()
                .when()
//                .contentType(ContentType.JSON) //нужно указать какой формат чтения у нашего запроса, то есть ответ придет в формате json.
                .get("api/users?page=2") //в аргументе нужно вставить ссылку, которую мы пошлем на наш запрос
               //вместо get может быть post, delete, put.
                .then().log().all() //То есть мы написали: when, какой у нас тип данных, куда мы обращаемся, then (результаты которые мы получаем all или body)
                .extract().body().jsonPath().getList("data",UserData.class);
//getList – метод, чтобы получить список. Нужно указать путь (от куда мы получаем данные:data в json на сайте), и указать класс в который мы извлечем ответ
// в консоле у нас будет тоже самое что и на сайте – весь json
// в threads & Variables будет сам List этих пользователей (6 экземпляров класса 0-5). Каждый пользователь извлекся в каждый созданный pojo class

//По тест кейсу нам нужно убедиться что имена файлов аватаров пользователя совпадают.
//Есть два способа:
//Первый это с помощью получения отдельного списка с аватарами и ID.
//Второй это напрямую через stream достать из списка отдельно и аватар и ID.

        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

        //stream – позволяет перебрать наш список и вызвать какой-то метод по очередности
        //в метод forEach пропишем наш assert который сравнивает avatar и id
        //x – это локальная переменная, в нашем списке это просто счетчик экземпляров класса
        //getAvatar contains ID.
        // Так как ID это Integer то мы не можем сравнить строку с числом. По этому id нужно превратить в строку String
        // С помощью этой одной строки у нас по каждому пользователю произошел перебор и мы у каждого получили аватар
        // и сравнили что id содержится в нашем аватаре

//        3.	Убедиться, что email пользователей имеет окончание reqres.in

        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        //если все проверки проходят нам возвращается true, если нет то false,
        // то есть если в одном месте будет false то assert не пройдет
        //через stream вызываем метод allmatch (все совпадения) – получить email, который заканчивается на...

//        2.	Убедиться, что имена файлов-аватаров пользователей совпадают (ReqresTest)

 //Другой вариант: как отдельно собрать какие-то переменные (проверить аватарки и id)

        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        //достаем пока что-то одно, достаем список аватаров из класса userdata
        List<String> ids = users.stream().map(x->x.getId().toString()).toList();
        //Так как это integer то тут надо вызвать лямбду, получить айдишку, и превратить ее в строку.
        for(int i = 0; i<avatars.size(); i++) {
        //Нам нужно сделать проверку. Нужно перебрать один список и второй.
        // Указываем размер нашего списка (коллекции), и плюсуем один.
        //И так мы будем по очереди доставать аватар и id.
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        //Достаем какой-то элемент из нашего списка. В цикле у нас есть локальный индекс i.
       // Мы берём какой-то элемент индекса i. И достаем со списка ids элемент с таким же индексом.
        // И мы в цикле будем каждый раз вызывать assert.
        }
    //Спецификации нужны для того, чтобы сделать какие-то заготовки для библиотеки rest assured.
    // То есть мы можем в заготовках указать какой статус ответ нам стоит ожидать.
    // Если статус ответ приходит 400, а нам нужен 200, то дальше код не выполняется и мы экономим время.

    }

    //создаем тест для задания Тест 2.1
    //на сайте заходим в post register successful
    @Test
    public void successRegTest() {
    //успешная регистрация это значит что нам нужно получить 200 ответ
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
    //нужно создать два класса с регистрацией и с регистрацией ответа
    }
}

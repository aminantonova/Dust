package API;

import org.junit.Assert;
import org.junit.Test;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/"; //вынесем ссылку в отдельный метод

    @Test
    public void checkAvatarAndIdTest(){
    Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseError400());
    //у нас есть метод, который устанавливает наши спецификации installSpecification
    //в аргументе нужно указать спецификацию и метод запроса (requestSpec) и ответа (responseError400)
        List<UserData> users = given()
                .when()
//                .contentType(ContentType.JSON) //нужно указать какой формат чтения у нашего запроса, то есть ответ придет в формате json.
                .get("api/users?page=2") //в аргументе нужно вставить ссылку, которую мы пошлем на наш запрос
               //вместо get может быть post, delete, put.
                .then().log().all() //То есть мы написали: when, какой у нас тип данных, куда мы обращаемся, then (результаты которые мы получаем all или body)
                .extract().body().jsonPath().getList("data",UserData.class);
//getList – метод, чтобы получить список. Нужно указать путь (от куда мы получаем данные:data в json на сайте), и указать класс в который мы извлечем ответ
// Результат в консоле
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

    //создаем тест для задания Тест 2.1 (post register – successful) на сайте
    //на сайте заходим в post register successful
    @Test
    public void successRegTest() {
    //успешная регистрация это значит что нам нужно получить 200 ответ
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
    //нужно создать два класса с регистрацией и с регистрацией ответа


    //мы будем использовать post запрос по этому в тело запроса нам обязательно нужно что-то поместить
    //мы через конструктор класса засунем туда какие-то данные, потом данные отправим на сервер
    //нам нужно отправить email и password, но сначала нужно объявить то, что нужно получить
        int id = 4; //был integer поменяла на int бо assert горит красным
        String token = "QpwL5tke4Pnpja7X4";
        //теперь нужно создать экземпляр класса
        Register user = new Register("eve.holt@reqres.in", "pistol");
        //нужно создать класс и для этого класса вызвать метод given и ответ извлечь в виде этого класса
        SuccessReg successReg = given()
                .body(user) //клаcс user
                .when()
                .post("api/register") //ссылка по которой нам нужно обратиться, куда нудно отрпавить
                .then().log().all() //извлечь всё
                .extract().as(SuccessReg.class);
        //так как это небольшой json файл (не как data), то мы можем сразу указать класс

        //мы можем сделать проверку на то, что нам приходит не пустой результат (хоть какой-то ответ)
        //и потом сравним пришел ли нам тот ответ который нам нужен
        //    Assert.assertNotNull(successReg.getId()); //горит желтым
    Assert.assertNotNull(successReg.getToken());


        //у нас есть класс SuccessReg который будет содержать ответ и теперь через assert мы проверим наши данные
        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
        //выбрать long expected, long actual
        //у на есть ожидаемый результат – id

        //Результат
        //то есть у нас отправиться post запрос, у нас появятся какие-то данные,
        //и у нас сровняются ожидаемый и актуальный результат
        //мы извлекли id и token (в assert), и сравнили с нашими заготовками выше (int id и String token)
        //в консоле ответ будет такой же, как и на сайте в Response

        //теперь сделаем тест для неуспешной регистрации
    }
    //(post register - unsuccessful) на сайте
    @Test
    public void unSuccessRegTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseError400());
        //400 так как мы как сайте ожидаем ошибку 400
        Register user = new Register("sydney@fife", "");
        //создаем класс для неуспешной регистрации с методом given
        UnSuccessReg unSuccessReg = given()
                .body(user)
                .post("api/register")
                .then().log().all() //извлечь всё
                .extract().as(UnSuccessReg.class);
Assert.assertEquals("Missing password", unSuccessReg.getError());//актуальный и ожидаемый результат

        //Тест 3. Get (List <resource>)
        //нужно получить весь список, получить все года по отдельности,
        // с начала нужно в ручную отсортировать все года методом sort,
        // и через stream или for проверить либо по отдельности, либо просто сравнить два списка
        //закидываем с data первый список переведя json в java
    }
    @Test
    public void sortedYearsTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        //нужно получить список
        List<ColorsData> colors = given() //так как это get запрос, то структура та же: given, when, get и тд.
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("date", ColorsData.class); //извлекаем в класс ColorsData

        //Результат в консоле
        //В variables будет такой же список как и на сайте


        //Теперь нужно создать список с годами и отсортировать года,
        // хоть они и отсортированы (но по заданию нужно убедиться что это так)
        List<Integer> years = colors.stream().map(ColorsData::getYear).toList(); //актуальный результат
        //Integer потому что год
        //через stream достанем все что на нужно (года)
        //map это вроде получить список
        List<Integer> sortedYears = years.stream().sorted().toList(); //ожидаемый результат
        //то есть мы получаем список и потом сортируем его по возрастанию

        //и теперь через обычный assert сравниваем ожидаемый результат с актуальным
        Assert.assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
        //Результат в консоле
        //Спецификации работают, get запрос отправляется, списки создаются
        //так же там должны быть года полученные из наших классов по порядку(вроде years)
        //дальше мы получаем года которые у нас отсортированы (вроде sortedYears)
        //и затем мы сравниваем эти года
    }
    //Тест 4.1 (на сайте delete)
    //добавить новую спецификацию в классе specifications
    @Test
    public void deleteUserTest() {
    Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUnique(204));
    //204 как на сайте
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
        //даже assert не надо вызывать,
        // потому что нам нужно только убедиться что статус 204 получается, потому что у нас тело пустое

        //Тест 4.2 (на сайте put update)
        //время на компьютере и время на сервере всегда отличаются
        //время на сайте возвращается в формате json, и в конце там есть ряд ненужных символов
        //с помощью регулярных выражений нам нужно отделить последние пять символов,
        // чтоб получить нормальный ответ
        //потому что если сравнивать полностью рядок то времени уйдет больше и время не совпадет
    }
    @Test
    public void timeTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
    //нужно создать пользователя и отправить на сервер
        UserTime user = new UserTime("morpheus", "zion resident");
        //отправить эти данные на сервер
        //нужно ответ сервера и ответ сервера распаковать в класс
        //ответ сервера это UserTimeResponse
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class); //нужно извлечь в нас созданный класс
        System.out.println();
        //так как время в json, нужно убрать лишние 5 символов, сайт regex101 (регулярные выражения)
        String regex = "(.{5})$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex, "");
        //это мы получили точь такое же время как и на сайте
        //regex, "" – означает что меняем на ничего
        //в test string вставляем время (2025-06-10T21:52:41.998Z)
        // и в regular expression – (.{5})$, $ означает с конца
        //методом replace заменим это все
        System.out.println(currentTime); //выводим текущее время
        //теперь сравниваем текущее время с сервером
        Assert.assertEquals(currentTime, response.getUpdatedAt().replaceAll(regex, ""));
        //currentTime сравниваем с ответом сервера response
        //replaceAll заменяем полученный ответ
        System.out.println(response.getUpdatedAt().replaceAll(regex, ""));
        // выводим время, которое получили с сервера
        // в консоле будет и такое и такое время






    }
}

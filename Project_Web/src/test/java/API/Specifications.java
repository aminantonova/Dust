package API;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
    //нужно написать статические методы в которых укажем спецификацию для запроса и спецификацию для ответа
    //Это специфика для запроса
    public static RequestSpecification requestSpec (String url) {
    //напишем по какой ссылке нам нужно обращаться и какой тип данных нам стоит ожидать
    //в метод передаем ссылку
        return new RequestSpecBuilder()
                .setBaseUri(url)
        //то какая ссылка будет базовая
        //сюда вставляем эту ссылку
                .setContentType(ContentType.JSON)
                .build();
//создали спецификацию, которая позволяет каждый раз не прописывать адрес и указывать тип ответа
    }
//Нужно указать какой ответ стоит ожидать.
//Так как ответ на сайте ожидаем 200 (response), то мы это можем прописать

//Это специфика для ответа
//можно сделать заготовку (создать спецификацию для ответа: например ожидать какой-то статус код 200)
//можно статус код передавать в (), а можем сделать заготовки для статусов 200 и 400.
    public static ResponseSpecification responseSpecOK200(){
    return new ResponseSpecBuilder()
        .expectStatusCode(200)
//указываем что мы ожидаем 200 статус ответа
        .build();
//если статус приходит другой, то у нас на начале теста всё падает и лишние ресурсы не тратятся
    }
//метод с 400 ошибкой и в reqrestest вписывать название этого метода в поле после названии метода там
    public static ResponseSpecification responseError400() {
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }
//создать метод в котором мы применим наши статические методы

    public static void installSpecification(RequestSpecification request, ResponseSpecification response){
//теперь из библиотеки rest assured достать те самые библиотеки (две сверху)
    RestAssured.requestSpecification = request;
    RestAssured.responseSpecification = response;
    //этот класс готов для того, чтобы сократить ReqresTest
    //в ReqresTest после public void checkAvatarAndIdTest(){ – по идее нужно дать доступ к классу Specifications
    //и дальше сократить
}
    public static ResponseSpecification responseSpecUnique(int status) {
        return new ResponseSpecBuilder()
                .expectStatusCode(status) //мы ожидаем определнный статус
                .build();
    }
}

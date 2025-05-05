package com.example.selenium;

//import com.google.gson.Gson;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class UI {

//    public static void main(String[] args) throws Exception {
//        // Gson
//        String gsonJson = new Gson().toJson("Hello from Gson!");
//        System.out.println("Gson JSON: " + gsonJson);
//
//        // Jackson
//        String json = "{\"name\":\"Ivan\",\"age\":35}";
//        ObjectMapper mapper = new ObjectMapper();
//        User user = mapper.readValue(json, User.class);
//        System.out.println("Jackson name: " + user.name);
//    }
//
//    public static class User {
//        public String name;
//        public int age;

        public int sum(int number) {
            int result = 0;
            for (int i = 0; i <= number; i++) {
                result += i;  // Добавляем число i к результату
            }
            return result;  // Возвращаем результат



        }
        }

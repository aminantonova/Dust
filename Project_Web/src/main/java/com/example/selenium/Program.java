package com.example.selenium;

public class Program {

        public static void main(String[] args) {
            UI numbers = new UI();

            // Вызываем метод sum и передаем число, например, 5
            int sum = numbers.sum(5);

            // Выводим результат в консоль
            System.out.println("Sum from 0 till 5 = " + sum);
        }
}
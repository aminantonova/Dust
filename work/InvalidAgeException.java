package work;

public class InvalidAgeException extends Exception {
    // Створюємо власний клас-виняток, який наслідує Exception

    public InvalidAgeException (String message) {
        // Конструктор приймає повідомлення про помилку
        super (message);
        // Передаємо це повідомлення до конструктора батьківського класу (Exception),
        // щоб пізніше його можна було отримати через getMessage()
    }
}

package work;

public class MyCustomException extends Exception{
    // Це наш власний тип помилки, що наслідує вбудований Exception
public MyCustomException (String message) {
    // Конструктор, який приймає повідомлення про помилку
        super (message); //Викликає конструктор батьківського класу Exception
    }
}

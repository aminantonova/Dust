package work;

import java.util.Scanner;
import java.util.*;

public class Newone {

    public static void main(String[] args) {

        // int num = -5;
        //System.out.println ("Variable: " + num);
        // num = 501;
        //System.out.println ("Variable: " + num);

// byte - Діапазон чисел від -128 до 127;
// short - Діапазон чисел від -32768 до 32767;
// int - Діапазон чисел від -2147483648 до 2147483647;
// Long - Діапазон чисел від 9 223 372 036 854 775 808 до 9 223 372 036 854 775 809.
// Тобто якщо обирати не той варіант, то тоді ми просто не ефективно працюємо з памʼятью компʼютера.

// byte num1 = 100; // 1 byte (байт, а не бит)
// short num2 = 150; // 2 byte
// int num3 = 5000000; // 4 byte
// long num4 = 50000000; // 8 byte

// Числа з крапкою:
// float num5 = 5.505f; // 4 byte (обовʼязково вкінці перед ; ставиться f)
// double num6 = 5.2345675f; // 8 byte (обовʼязково вкінці перед ; ставиться f або d)

//Символи та текст:
// char sym = ('t');// (обовʼязково одинарні лапки ’текст’) тільки один символ (1 byte)
// String word = ("sobaka");
// (для тексту, обовʼязково подвійні лапки «») (кожен символ важить 2 byte, слово hello 10 byte)

//Логічний тип данних:
//boolean isHappy = false; // (true/false це для умовних конструкцій)  (1 byte)

        //        Scanner scan = new Scanner(System.in);
        //        String text = scan.nextLine();
        //        System.out.print(text);

// Нажать консоль, там ничего не будет, но туда  можно писать.
// Нужно написать текст Some hello, нажать enter и оно отобразится еще раз.
// Можно написать число

        //        Scanner scan = new Scanner(System.in);
        //        int userNum = scan.nextInt();
        //        System.out.print(userNum);

// Математичні дії
        //        int a = 5, b = 10, res;
        //        res = a + b;
        //        System.out.print(res);
// Консоль > 15 > res = a + b, res = a - b, res = a * b

        //        int a = 5, b = 10, res;
        //        res = a + b;
        //        res = res + 1; // или res +=1; или res++;
        //        System.out.print(res);

        //        Scanner scan = new Scanner(System.in);
        //        System.out.print("Enter 1 num: ");
        //        int num1 = scan.nextInt();
        //
        //        System.out.print("Enter 2 num: ");
        //        int num2 = scan.nextInt();
        //
        //        int res = num1 + num2;
        //        System.out.print("Res 1: " + (num1 + num2));

// Консоль > вписать число > enter > вписать другое число > enter (3,4=7)

        //        System.out.print("Res 1: " + (num1 + num2));
        //        System.out.print("Res 2: " + (num1 - num2));
        //        System.out.print("Res 3: " + (num1 * num2));
        //        System.out.print("Res 4: " + (num1 / num2));
        //        System.out.print("Res 5: " + (num1 % num2));

//Оператори: Логічні оператори: &&, ||, !.

//        a && b – логічне "і" - обидва елементи повинні бути істиною
//        a || b – логічне або - хоча б один елемент повинен бути істиною
//        a ^ b – логічне двійкове виключення (один з елементів має бути істиною, і один має бути брехнею)
//        a ! b – логічне не, або ж "інверсія" (перетворює булеве значення справа від себе на протилежне)

        //створити три змінних
//       int zoloto = 1, sriblo = 2, bronza = 3;
        //Загальна інформація про те скільки у нас медалей:
//       System.out.println("Загальна кількість медалей:" + (zoloto + sriblo + bronza));

// чи має наша збірна всі три види медалей (золото, срібло, бронза)
// обов’явзково кожну медаль писати в {}

//          if (zoloto > 0) {
//           if (sriblo > 0) {
//            if (bronza > 0) {
//             System.out.println("У нашої збірної є всі три види медалей"); // (перед этой строчкой тоже открываем {}
//Загальна кількість медалей:6
//У нашої збірної є всі три види медалей
// Якщо змінити bronza = 0, то тоді загальна кількість: 3
// І не буде строчки У нашої збірної є всі три види медалей

//    }
//   }
//  }

//Замість цього можна зробити простіше використовуючи амперсант &&. (і)
//a && b – логічне "і" - обидва елементи повинні бути істиною

//          int zoloto = 1, sriblo = 2, bronza = 1;
//
//          System.out.println("Загальна кількість медалей: " + (zoloto + sriblo + bronza));
// чи має наша збірна всі три види медалей (золото, срібло, бронза)
//           if (zoloto > 0 && sriblo > 0 && bronza > 0)
//           {
//            System.out.println("У нашої збірної є всі три види медалей");
//
//       }

// консоль: Загальна кількість медалей: 4
//У нашої збірної є всі три види медалей
//АЛЕ для оператора && важливо щоб кожне значення (zoloto > 0 && sriblo > 0 && bronza > 0) було true, інакше if не спрацює

//a || b – логічне або - хоча 6 один елемент повинен бути істиною
// чи має наша збірна хочаб одну медаль

//       if (zoloto > 0 || sriblo > 0 || bronza > 0)
//       {
//        System.out.println("У вас як мінімум одна медаль");
//       }

//Загальна кількість медалей: 4
//У нашої збірної є всі три види медалей
//У вас як мінімум одна медаль
//АЛЕ для оператора || важливо щоб ОДНЕ значення (zoloto > 0 || sriblo > 0 || bronza > 0) було true, інакше if не спрацює.
// Якщо змінити на int zoloto = 0, sriblo = 0, bronza = 1;
// Консоль > Загальна кількість медалей: 1
//У вас як мінімум одна медаль
//ТОБТО так як бронза = 1, то || спрацював бо хоча б одне значення є правдою.
// В методі можна робити скільки завгодно операторів IF, але якщо написати ELSE, то він буде залежний від попереднього IF.

//        System.out.println(5);
//        System.out.println(2 * 5);
//        System.out.println(1 == 1);
//        System.out.println(1 == 2);
//        System.out.println(1 > 2);

// Консоль: 5, 10, true, false, false

//     if (true) {
//         System.out.println("Істина");
//     }
// Консоль: Істина
// Або замість if (true) можна написати if (false==false)

// a ^ b – логічне двійкове виключення (один з елементів має бути істиною, і один має бути брехнею)

//     int a = 5, b = 10;
//     if (a == 1 ^ b == 10) {
//         System.out.println("так");
//     } else {
//         System.out.println("ні");
//     }

// Консоль: так, тому що один з елементів є істиною, а інший брехнею
// b true ==10
// Якщо буде два невірних, то буде ні. І якщо буде дві істини то буде ні.

// a ! b – логічне не, або ж "інверсія" (перетворює булеве значення справа від себе на протилежне)
//             System.out.println (true);
//Консоль: true
//           System.out.println (!true);
// Консоль: false
//          System.out.println (!false);
//Консоль: true
//        System.out.println (5>4);
//Консоль: true
//      System.out.println (! (5>4));
//Консоль: false
//в дужках правда, а консоль дає зворотнє значення

//Оператори: Оператори порівняння: ==, !=, >, <, >=, <=. різниця між == та equals()
//Оператори порівнянь (повертають) одне з двох можливих значень – true or false.
// > : більше ніж           5>3
// < : менше ніж            7<15
// == : дорівнює            2==2
// != : не дорівнює         3!=5
// >= : більше або дорівнює 4>=1
// <= : менше або дорівнює  9<=9
// чи (a "менше" ніж б)? фура < велосіпед – false
// чи (a "дорівнює" б)? телефон = гусь – false
// чи (a "не дорівнює" б)? яблоко != кирпич – true (тому що не дорівнюють)
// чи (a "не дорівнює" б)? яблоко != яблоко – false (тому що дорівнюють)
// чи (a "більше або дорівнює" б)? 10 кг гантеля >= 10 кг гантеля – true
// чи (a "більше або дорівнює" б)? 10 кг гантеля >= 6 кг гантеля – true
// чи (a "більше або дорівнює" б)? 10 кг гантеля >= 25 кг гантеля – false

//int chyslo =7;
//більше
//if (chyslo>5) {
// System.out.println("> : Число більше ніж 5");
//} else {
// System.out.println("> : Число НЕ більше ніж 5");
//}

//меньше
//  if (chyslo<11) {
//   System.out.println("> : Число меньше ніж 11");
//  } else {
//   System.out.println("> : Число НЕ меньше ніж 11");
//  }
// дорівнює (якщо одне дорівнює, то це лператор присвоїня)
//  if (chyslo==10) {
//   System.out.println("== : Число дорівнює 10");
//  } else {
//   System.out.println("== : Число НЕ дорівнює 10");
//  }
        //НЕ дорівнює (оператор перевірки нерівності)
        //повертає true (істину) якщо об'єкти неоднакові, і false – якщо однакові
//  if (chyslo !=9) {
//   System.out.println("!= : Число НЕ дорівнює 9");
//  } else {
//   System.out.println("!= : Число дорівнює 9");
//  }
        //більше/рівне (>=)
//  if (chyslo >=8) {
//   System.out.println(">= : Число більше-або-дорівнює 8");
//  } else {
//   System.out.println(">= : Число НЕ більше-або-дорівнює 8");
//  }
        //меньше/рівне (<=)
//  if (chyslo <=20) {
//   System.out.println(">= : Число меньше-або-дорівнює 20");
//  } else {
//   System.out.println(">= : Число НЕ меньше-або-дорівнює 20");
//  }

        // Консоль:
        // > : Число більше ніж 5
        //> : Число меньше ніж 11
        //== : Число НЕ дорівнює 10
        //!= : Число НЕ дорівнює 9
        //>= : Число НЕ більше-або-дорівнює 8
        //>= : Число меньше-або-дорівнює 20

        //Цикли та методи

// FOR

//Цикли існують для того, щоб виконувати певний код декілька разів поспіль.
//For – Для for треба зробити 3 обов’язкових елементи.
//for ( де початок; де кінець; крок-інкремент (наскільки це число зміниться з кожним повтореням циклу))

        // i < 10 – це до якого моменту наш цикл буде виконуватись
        // i++ – яким чинном наша змінна буде мінятися під час виконная самого циклу
        // i++ – тобто наша змінна за одне коло циклу буде змінюватись на одиницю вперед 0,1,2,3,4,5,6,7,8,9
        // якщо один рядок коду то фігурні дужки можна не прописувати, але якщо більше то після строчки з for { sys }
        // якщо треба щоб було Element is 10, то треба i <=10.

//  for (int i = 0; i < 10; i++)
//   System.out.println("Element is " + i);

        // Консоль:
        //Element is 0
        //Element is 1
        //Element is 2
        //Element is 3
        //Element is 4
        //Element is 5
        //Element is 6
        //Element is 7
        //Element is 8
        //Element is 9

//  for (int i = 1; i <= 5; i++)
//   System.out.println("Element is " + i);

        //Консоль:
        //Element is 1
        //Element is 2
        //Element is 3
        //Element is 4
        //Element is 5

//  for (float i = 100f; i > 0.5f; i /=2)
//   System.out.println("Element is " + i);

        //Консоль:
        //Element is 100.0
        //Element is 50.0
        //Element is 25.0
        //Element is 12.5
        //Element is 6.25
        //Element is 3.125
        //Element is 1.5625
        //Element is 0.78125

//  for (int lichylka = 0; lichylka <= 10; lichylka = lichylka+2)
//   System.out.println("Element is " + lichylka);

        //Консоль:
        //Element is 0
        //Element is 2
        //Element is 4
        //Element is 6
        //Element is 8
        //Element is 10

//  for (int lichylka = 0; lichylka <= 10; lichylka = lichylka+5)
//   System.out.println("Element is " + lichylka);

        //Консоль:
        //Element is 0
        //Element is 5
        //Element is 10

// Щоб вивести всі парні числа:

//  for (int lichylka = 20; lichylka <= 30; lichylka = lichylka+2)
//   System.out.println("Element is " + lichylka);

        //Консоль:
        //
        //Element is 20
        //Element is 22
        //Element is 24
        //Element is 26
        //Element is 28
        //Element is 30

//WHILE

// Якщо int =0, а while (0<10), то знак такий тому що це так і є, і рядок йде за зростанням.
// Якщо б int=100, a while (100>10).
// В нашому випадку знизу ми хочемо щоб 10 було включно,
// Тому ставимо знак >= –100>=10. Знак >, тому что 100 і вправду більше 10.
//І відповідно рядок буде йти в зворотному порядку.

//                int i = 0;
//                while (i<10) {
//               System.out.println("Element is " + i);
//                i++;
//                }
        // Консоль:
        //Element is 0
        //Element is 1
        //Element is 2
        //Element is 3
        //Element is 4
        //Element is 5
        //Element is 6
        //Element is 7
        //Element is 8
        //Element is 9

//     int i = 100;
//     while (i >= 10) {
//         System.out.println("Element is " + i);
//         i -= 10;
//     }
// По сути значення рухаются від 100 до 10 через 10, знак дорівнюю означає включаючи Element is 10
// Те який знак треба ставити залежить від чисел (100>10)
// Консоль:
//Element is 100
//Element is 90
//Element is 80
//Element is 70
//Element is 60
//Element is 50
//Element is 40
//Element is 30
//Element is 20
//Element is 10

//                 Scanner scan = new Scanner(System.in);
//                 int chyslo = 0;
// chyslo може бути будь яким, навіть більше ніж 7
// для запуску програми це не важливо, головне щоб не 7.

//                 while (chyslo != 7) // елемент коду виконується тільки якщо 0 !=7
//                 {
//                     System.out.println("Введіть/вгадайте число між 0 і 10");
//                     chyslo = scan.nextInt();
//                 if (chyslo <0 || chyslo > 10) {
//                     System.out.println("Число має бути між 0 і 10");
//                 }
//                 }
//                 System.out.println("Вітаю! Ви вгадали");

// Консоль:
//Введіть/вгадайте число між 0 і 10
//2 (вводимо власноруч)
//Введіть/вгадайте число між 0 і 10
// 11
//Число має бути між 0 і 10
//Введіть/вгадайте число між 0 і 10
//7 (вводимо власноруч)
//Вітаю! Ви вгадали

//     Scanner scan = new Scanner(System.in);
//     String slovo = "";
// Scanner це клас, а scan.nextLine це метод
// суть така ж як і в минулому випадку, не важливо яке число або яке слово для запуску програми.

//     while (slovo.equals("чай") != true) // або простіше while (!slovo.equals("чай"))
//  // без true навіть якщо у відповіді написати чай, то все одно програма буде продовжуватись
//     {
//         System.out.println("Хочу чаю");
//         slovo = scan.nextLine();
//     }
//     System.out.println("Дякую за чай!");

//     Консоль:
//     Хочу чаю
//     кава (сами вводим)
//     Хочу чаю
//     чай (сами вводим)
//     Дякую за чай!

// DO WHILE

// do while - це після умова
// кожне коло числа це ітерація циклу
//     int i = 0;
//     do {
//         System.out.println("Element is " + i);
//         i++; // інкермент
//     } while(i<10);

        // Консоль:
        //Element is 0
        //Element is 1
        //Element is 2
        //Element is 3
        //Element is 4
        //Element is 5
        //Element is 6
        //Element is 7
        //Element is 8
        //Element is 9


//             int i = 100;
//             do {
//                 System.out.println("Element is " + i);
//                 i++;
//             } while(i<10);

        // Консоль:
        //Element is 100
        // Тобто цикл хоча б один раз виконується, хоча умова відразу неправильна 100<10

        // Оператори в циклах

// В цьому випадку ми можемо власноруч зупинитись на числі 8, не доводячи до 10, командою if (1==8)
// Тіпа програма буде працювати, допоки i=1, буде меньше 8
// Коли (і) дійде до 8, буде 8==8, програма зупиниться, не включаючи 8, тобто до 7.
//Можна або break або continue прибрати, воно не впливає на роботу один одного.

//     for (byte i =1; i<=10; i++) {
//         if (i==8)
//             break; // програма йде до 8 (не включаючи)
//         if (i % 2 ==0) // пропускає парні числа

// Це перевіряє, чи число парне. i % 2 == 0 означає: остача від ділення i на 2 дорівнює 0 → тобто парне число.
// Якщо число парне — команда continue пропускає цю ітерацію циклу і переходить до наступного i.
// Пропускає цикл тіпа пропускає числа 2,4,6.
// Щоб були в консолі парні числа то тоді (i % 2 !==0)

//             continue; // програма йде виключаючи кожне друге число, тобто всі парні числа
//         System.out.println(i);
//     }
// continue — “пропусти все нижче і йди на наступне коло”
// break — “все, стоп, вийти з циклу повністю”
        //Консоль:
        //1
        //2
        //3
        //4
        //5
        //6
        //7

        //(i % 2 ==0)
        //Консоль:
        //1
        //3
        //5
        //7

        //Умовні конструкції

        // IF

        // if (я вивчу джаву) умова
        //{
        // я буду програмістом
        //}

        // if (мій кіт купить акваланг) умова
        // {
        // мій кіт зможе плавати
        //}
        // else // в будь якому іншому випадку
        //{
        // виконати ту дію, яка тут написана
        //}

//     int chyslo = 10; // 11
//     if (chyslo == 10) {
//         System.out.println("Ваше число - 10");
//     }
//     else {
//        System.out.println("Ваше число не 10");
//     }
        // Консоль: Ваше число - 10
        // 11 Консоль: Ваше число не 10

//     int chyslo = 11; 5
//     if (chyslo > 10) {
//         System.out.println("Ваше число > 10");
//     }
//     else {
//         System.out.println("Ваше число не > 10");
//     }
// Консоль: Ваше число > 10
// Если 5. Консоль: Ваше число не > 10

//     int chyslo = 10;
//     if (chyslo >= 10) {
//         System.out.println("Ваше число >= 10");
//     }
//     else {
//         System.out.println("Ваше число не >= 10");
//     }
        //Консоль: Ваше число >= 10

//     int chyslo = 11;
//     if (chyslo != 10) {
//         System.out.println("Ваше число не дорівнює 10");
//     }
        // else тут не треба

        // IF ELSE

//int tsina_lanos = 10000;
//int tsina_audi = 50000;
//int tsina_ferrari = 200000;
//int zarplata = 10000; // ланос, якщо поставити 50000 ауді, якщо 0, то на автобусі
//if (zarplata==tsina_lanos) { // якщо (..), то (..),
        // можна поставити >= щоб по суті можна було купити все, але програма візьме пераий варіант
//    System.out.println ("Я можу купити ланос");
//}
//else if (zarplata==tsina_audi) { //або якщо (..), то (..)
//    System.out.println ("Я можу купити ауді");
//}
//else if (zarplata==tsina_ferrari) { //або якщо (..), то (..)
//    System.out.println ("Я можу купити феррари");
//}
//else {
//    System.out.println ("Я буду їздити на автобусі");
//
//}
        // спочатку отримуємо дані від користувача
//                 Scanner scan = new Scanner(System.in);
//                 System.out.println("Enter number: " );
//                 int user = scan.nextInt(); // user – це те що ми пишемо в консолі
//                 char sym = 't'; // цю додатку умову можна прописати в будь-яку умовну конструкцію окрім else
        // && пишеться, щоб зазначити, що обидні частини і та і та маються виконатись, щоб спрацював код
//                 if (user == 5 && sym == 't') { //знаки можуть бути різні <, >, <=, >=, !=
        // Якщо перевіряти на !=, то якщо писати в консоль будь-яке число окрім 5, то команда буде винокуватись
//                 System.out.println("Number is 5");
// В консоль якщо написати 5, то воно напише Number is 5, а якщо інше число, то нічого не буде
//                 boolean isHappy = false;
//                 if (isHappy == false); // цей рядок можна на писати, він не зовсім вірний
//                 if (!isHappy) // можна  начебто написати простіше if (number == 5) {
// конкретно тут дужки можна не ставити, бо для цієї умови лише один рядок коду знизу
        // а зверху потрібні, бо там декілька рядків коду
        // isHappy==true можна не писати, бо воно і так true, але це начебто тільки для boolean
        // якщо хочемо перевірити на false, то if (!isHappy)
        // два верхніх рядка по суті означають одне і те саме, і правильніше буде писати тільки другу
        // if (!isHappy) це умова для запуску програми, якщо цей рядок є вірним, то код всередині (те що написано нижче) виконується

//                 System.out.println("Bool is false");
//                 } else if (user ==60)
        //<, >, <=, >=, !=. Це як додаткова умова.
        // Також {} тут не потрібні, бо після іде тільки один рядок, а далі вже новий оператор
        // Можна поставити {} і можна прописати ще рядки коду і вони будуть виновутись якщо умова else if вірна
        // Таких додаткових операторів else if може бути безліч, с різними знаками, та різними числами
//                     System.out.println("Number is 60");
        //Консоль: 60, Number is 60
        // Таким чином перша умова if виявилась некоректною і весь код до else if не спрацював, так само як і після (else)
//                 else if (user ==70)
//                 System.out.println("Number is 70");
//                 else if (user > 100)
//                 System.out.println("Number is > 100");
//Консоль: 4, то жодна умова не виконалась, це не 5, не 60, не 70, не число > 100
//                 else {
        // код (те шо буде написано знизу) в цьому операторі else буде виконуватись, коли умова if не буде виконуватись
        // оператор else не обов'язковий, просто не буде якогось коду, який буде показуватись, якщо не виконався один з попередніх
//         System.out.println("Number is underfined");
//     }

        // Консоль: Enter number: 5; Number is 5; Bool is false
        // else ігнорується, бо перша умова (if) виконалась
        // якщо в консоль написати не 5, а 7, то умови не виконаються
        // І код далі не піде і виконується else


        //SWITCH-CASE

        // Switch означає перевіряти
        // Switch дужки не ігноруються
        // В середині коду прописуєм різні випадки case, перевірки
        // Суть в тому, що ми перевіряємо одну едину зміну на декілька різних значень
        // case 5: після : буде виконуватись певний код
        // break обов'язково пишеться в кінці,
        // щоб програма зрозуміла де закінчується код, який підходить під цю умову
        // В switch не можна перевіряти на <, >, <=, >=, !=
        // Перевіряти можемо тільки на співпадіння
        // По суті яке значення введемо в консоль так і буде вірним 50, 7, 5
        // Default це по суті як Else в кінці, якщо вверхні умови не виконуються
        // Після default можна не писати break. І сам по собі він не обов'язковий
        //Switch (literal) вказуєм значення яке ми порівнюєм, тобто співпадіння для якого ми шукаємо
        // Break - зупини виконання даного сегмента після того елемент буде виконано

//        System.out.println(" Введіть першу літеру своєї області: ");
//        Scanner scan = new Scanner(System.in);
//        String litera = scan.nextLine();
//
//        if (litera.equals("в")) {
//            System.out.println(" Вінницька або Волинська: ");
//        } else if (litera.equals("д")) {
//            System.out.println(" Дніпропетровська або Донецька: ");
//        } else if (litera.equals("к")) {
//            System.out.println(" Київська або Кіровоградська: ");
//        } else {//якщо ввести будь-яку іншу букву
//            System.out.println(" Такої області не існує: ");
//        }

        //замість цього можна використати switch

//        System.out.println(" Введіть першу літеру своєї області: ");
//        Scanner scan = new Scanner(System.in);
//        String litera = scan.nextLine();

//        switch (litera) // щоб при написанні великої літери працювало switch (litera.toLowerCase())
//        {
//            case "в":
//                System.out.println(" Вінницька або Волинська: ");
//                break;
//            case "д":
//                System.out.println(" Дніпропетровська або Донецька: ");
//                break;
//            case "к":
//                System.out.println(" Київська або Кіровоградська: ");
//                break;
//            default: //якщо ввести будь-яку іншу букву
//                System.out.println(" Такої області не існує: ");
//        }

//        System.out.println(" Введіть число: ");
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        switch (a) {
//            case 0:
//                System.out.println(0);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            case 7:
//                System.out.println(7);
//                break;
//            default:
//                System.out.println("Такої цифри не існує:");
//        }

//        System.out.println(" Введіть літеру: ");
//        Scanner scan = new Scanner(System.in);
//        String litera = scan.nextLine();

        // або можна замість того що вище ці дві строчки
        // System.out.println(" Введіть літеру: ");
        //        String litera = "а"; //підставити будь-яку букву

//        switch (litera)
//        {
//            case "а":
//            case "е":
//            case "і":
//                System.out.println("Це голосна");
//                break;
//            case "т":
//            case "п":
//            case "р":
//                System.out.println("Це приголосна");
//                break;
//            default:
//                System.out.println("Я не знаю що це за буква");
//                break; }


//                 Scanner scan = new Scanner(System.in);
//                 System.out.println("Enter number: " );
//                 int user = scan.nextInt(); //можна просто поставити будь яке значення з умов (50), не вик.Scanner
//                 switch (user) {
//                     case 5:
//                         System.out.println(" Number is 5");
//                     break;
//                     case 50:
//                         System.out.println(" Number is 50");
//                         break;
//                     case 7:
//                         System.out.println(" Number is 7");
//                         break;
//                     default:
//                         System.out.println(" Number is underfined");
//
//                 }

        // По суті nextLine це для String, але з charAt(0) можна вказувати символи
        // Нажимаємо на консоль і вводимо свої числа

//                 Scanner scan = new Scanner(System.in);
//                 System.out.println("Enter number 1: " );
//                 int a = scan.nextInt();
//
//                 System.out.println("Enter number 2: " );
//                 int b = scan.nextInt();
//
//                 System.out.println("Enter math sum: " );
//                 scan.nextLine();
//                 char math = scan.nextLine().charAt(0);
//
//                 int res = 0;
//                 switch (math) {
//                     case '+':
//                         res = a + b;
//                         System.out.println("Res: " + res);
//                         break;
//                     case '-':
//                         res = a - b;
//                         System.out.println("Res: " + res);
//                         break;
//                     case '*':
//                         res = a * b;
//                         System.out.println("Res: " + res);
//                         break;
//                     case '/':
//                         if (b == 0)
//                         System.out.println("Error");
//                         else {
//                             res = a / b;
//                             System.out.println("Res: " + res);
//                         }
//                         break;
//                             default:
//                             System.out.println("Error");
//                 }

        //МЕТОДИ
        // PUBLIC

        // в main
//        Scanner miyScan = new Scanner(System.in);
//        System.out.println("Введіть своє імʼя");
//        String imya = miyScan.nextLine();
//        System.out.println("Введіть своє місто");
//        String misto = miyScan.nextLine();

//        SkazatyPryvit(imya, misto); // сюди теж треба передати ці параметри
//        SkazatyYakSpravy();
//    }

//Треба створити метод, придумати назву, запустити
// Але він все одно не спрацює, бо буде зчитувати перший метод
// Треба с першого методу відправитись на другий,
// написавши назву зверху, в середині першого методу
// Також їх можна всі міняти місцями, навіть main
// Порядок виклику методів має значення
// Воно спрацює, але в тому порядку як і вказано
//    public static void SkazatyPryvit(String imya, String misto)
        // додаємо ПАРАМЕТРИ в дужках (тип параметру+назва)
//    {
//        System.out.println("Привіт, " + imya + " з міста " + misto);

        //Можна сюди перекинути SkazatyYakSpravy();
        // Тобто main викликає pryvit, а pryvit викликає YakSpravy
        // Але метод не може запустити сам себе, це небезпечно
        //Можна двічі викликати один й той самий метод для комфортнішої роботи, для використання коду знову і знову
        // Так код буде компактніше, його буде легше читати, код не буде повторюватись
//    }
//    public static void SkazatyYakSpravy()
//    {
//        System.out.println("Як справи");
//    }
// Консоль: Введіть своє імʼя, Amina, Привіт, Amina, Як справи
// при додаванні misto,
// Консоль: Введіть своє імʼя, Amina, Введіть своє місто, Brovary, Привіт, Amina з міста Brovary, Як справи
// Послідовність змінних дуже важлива imya, потім misto


        //Можна зробити простіше, без Scanner
        // Не обовʼязково передавати змінну можна передати значення
        // змінна це mojeImya, значення Amina
        // Знаходячись в методі main

        // цей рядок в середені методу main
//    SkazatyPryvit("Amina", "Brovary");
//    }
//    public static void SkazatyPryvit(String imya, String misto) {
//        System.out.println("Привіт, " + imya + " з міста " + misto);
//    }


        //ці 4 рядки в середені методу main
//        String mojeImya = "Amina";
//        int vik = 24;
//        double mojavaga = 57.5;
//        SkazatyPryvit (mojeImya, "Brovary", vik, mojavaga);
        //можна або зі змінних брати значення
        // а можна писати напряму значення в "" без створення змінних "Brovary"
//    }
//    public static void SkazatyPryvit(String imya, String misto, int vik, double vaga) {
//  System.out.println("Привіт, " + imya + " з міста " + misto + "; вік " + vik + ", моя вага " + vaga);
        // пишемо тут vaga, а не mojavaga,
        // бо важливі значені в середині методу, щоб змінні були відомі нашому методу

        //ПОВЕРНЕННЯ ЗНАЧЕНЬ
        //Значення повертається тому методу який його викликав
        //Щоб метод SkazatyPryvit повертав main значення треба
        //Треба void змінити на String

        //два рядки в середені методу main
//        String resultat = SkazatyPryvit ("Аміна");
//        System.out.println (resultat);
//    }
//        public static String SkazatyPryvit (String imya)
//        {
//            String text = "Привіт, " + imya;
//            return text;
        // Консоль: Привіт, Аміна
        //Текст повернется на resultat
//        }

        // приклад для розуміння, він не працює
//        public static salat ZrobytySalat (pomidor po, ogirok og, zelen ze)
//        {
//            salat gotovyiSalat = porizaty(po + og + ze);
//            return gotovyiSalat;
//        }

        //три рядки в середені методу main
//        Nichogo ();
//        String text = PovernuText();
//        int chyslo = PovernuChyslo();
//    }
//
        // void означає нічого не повертає
        // створимо метод який нічого не повертає

//    public static void Nichogo() {
//        System.out.println("Я не повертаю нічого");
//    }
        // тепер створимо метод який повертає

//    public static String PovernuText(){
//        String text = "якийсь текст";
//        return text;
//    }
//    public static int PovernuChyslo () {
//        return 5;

        //два рядки в середені методу main
//        int suma = Suma (5,12); // suma = 17
//        System.out.println (suma);
//    }
//public static int Suma (int a, int b) {
//     int sumaChysel = a+b;
//     return sumaChysel;
// можна без створення зміної, просто return a+b
// Консоль: 17
//


        //PRIVATE
        //public – доступний усім, навіть з інших класів.
        //private — доступний лише всередині того самого класу.
        //Уяви, що в тебе є Клас - це як коробка з інструментами.
//        public class Toolbox {
//
//            public void openToolbox() {
//                System.out.println("Відкриваємо коробку з інструментами.");
//                secretMethod(); // можна викликати private метод усередині самого класу
//            }
//
//            private void secretMethod() {
//                System.out.println("Це секретний спосіб відкриття, доступний тільки всередині коробки!");
//            }
//        }

        //А тепер інший клас (наче інша людина намагається скористатися коробкою):
//        public class Main {
//            public static void main(String[] args) {
//                Toolbox myBox = new Toolbox();
//                myBox.openToolbox(); // 👍 Працює, тому що метод public
//
//                // myBox.secretMethod(); // ❌ Помилка! Цей метод private, не можна викликати зовні
//            }
//        }

        //Значення Toolbox myBox = new Toolbox();
        //Toolbox - це клас, тобто шаблон для об'єкта (у нашому випадку - коробка з інструментами).
        //myBox – це ім'я змінної, під яким ми звертатимемося до нашої коробки.
        //new Toolbox() – це створення нового об'єкта на основі класу Toolbox.
        //Життевий приклад:"Створюємо нову коробку з інструментами і називаємо її myBox."
        //Або: "Купи нову коробку з інструментами з магазину Toolbox і постав її у себе в кімнаті під ім'ям myBox."

//        Toolbox myBox = new Toolbox(); // створюємо нову коробку
//        myBox.openToolbox();           // відкриваємо коробку
//
//        //Повсякдена анологія
//        CoffeeMachine myCoffee = new CoffeeMachine(); // купляем кавомашину
//        myCoffee.makeCoffee(); // говориш їй зварити каву
//

//ФУНКЦІЇ
//Функція – це підпрограма, яка містить певний код
// І коли ми захочемо виповнити цей код, треба звернутися до неї по імені
//Це треба коли ми постійно повторюємо якусь частину
// Щоб ії багато разів не копіювати,
// А просто щоб цей код зберігався в одному місці (в функції),і коли треба звертатися до неї
// Створюється функція за межами методу, перед останньою }

//        info(); // треба викликати цю функцію через main
        //цю функцію можна викликати скільки завгодно разів
//        info(); //і вона буде стільки разів повторюватись в консоль
        // Консоль: Hello Hello
//    }
//    public static void info () { // те що написано в цих фігурних лапках це тіло функції
        // і коли я буду викликати info, то буде виконуватись код всередині
//        System.out.println ("Hello");

        // ПЕРЕДАЧА ІНФОРМАЦІЇ
        //Щоб при виклику функції передавати туди якусь інформацію,
        // і щоб вона відображалася в консолі
        // треба в public static void info в () прописати параметри

//        info("Hello");
//        info ("Hi");
//        String words = "hi all";
//        info (words);
//
//    }
//
//
//    public static void info (String word) {
//        System.out.print(word);
//        System.out.println("!");
//
//    }

        //в main
//      summa (5, 7); //виклик методу – це як використання інструкції
//    }
//    public static void summa (int a, int b) { //опис методу – це як шаблон (інструкція).
//        int res = a+b;
//        info (String.valueOf(res)); //res буде перетворена на текст
        // консоль: 12!
//        System.out.println(res);
        //консоль: 12
// через info можна простіше вивести певну інформацію у консоль, без sys
//    }
//
//    public static void info(String word) {
//        System.out.print(word);
//        System.out.println("!");
//    }
// Тут параметр word отримує значення, яке йому передали
//А передали ми: String.valueOf(res) → тобто "12"
//}
//Порівняй з рецептом:
//Опис методу: Рецепт каже: “візьми a грам борошна і b грам цукру”
//Виклик: Ти кажеш: “я беру a = 5, b = 7 грамів”

//main — це вчитель, який дає учням приклад і каже: «Візьми 5 і 7, порахуй суму (summa), потім напиши результат (info)!”
//summa — це учень, який вміє рахувати будь-які числа, які скажуть

//ПОВЕРНЕННЯ ДАНИХ

//        int result = summa (5, 7); //щоб записати результат цієї функції (12) в певну змінну
        // для цього треба змінити void на int
        // в кінці треба прописати return і вказати що ми повертаємо (res)
//    }
//public static int summa (int a, int b) {
//    int res = a + b;
//    info(String.valueOf(res));
//    return res;
        //Це працює так, що ми викликаємо функцію summa, передаємо туди значення summa (5, 7);
        // Підраховуємо ці значення a + b, виводимо їх на екран String.valueOf(
        //  І повертаємо їх назад return res;
        //  і записуємо ці значення в змінну resultat (int result = summa)
        // І можна наприклад це значення вивести в консоль через info або через sys
//
//        public static void info (String word){
//        System.out.print(word);
//        System.out.println("!");
// Консоль: 24!
//    }
//


        //треба створити масиви
        //nums1 - це масив
//         int [] nums1 = {6, 7, 4, 7};
        //підрахувати суму всіх цих елементів
//        int summa1 = 0;
        //створити цикл
//        for (int el: nums1) {
//            summa1 += el;
//        }
//        System.out.println("Summa of all elements: " + summa1);
        // Консоль: 24

        // створюємо другий масив
//        int [] nums2 = {6, 7, 4, 7, 6};
//        int summa2 = 0;
//        for (int el: nums2) { // nums2 - це масив
//            summa2 += el;
//        }
//        System.out.println("Summa of all elements: " + summa2);
        // Консоль: 30



        // можна зробити простіше через функцію, щоб не копіювати другий масив
        // створюємо функцію

//        int [] nums1 = {6, 7, 4, 7};
//        summa (nums1);
//
//        int [] nums2 = {6, 7, 4, 7, 6};
//        summa (nums2);
//    }
//
//    public static void summa (int [] arr) { //arr - це назва, переклад масив
//        int sum = 0;
//        for (int el: arr) {
//            sum += el;
//        }
//        System.out.println("Summa of all elements: " + sum);
//        // Консоль: 24 30

//        ФУНКЦІЯ БЕЗ ЗМІНИ (чиста функція)

// нічого не змінює назовні, нічого не друкує, не має побічних ефектів
// лише повертає результат на основі вхідних даних
// якщо дати ті ж самі дані — завжди отримаєш той самий результат
// просто повертає значення	return

//        public class Main {
//        //     Функція без змінної
//            public static int f() {
//                return 7;
//            }
//
//            public static void main(String[] args) {
//                int result = f();  // Викликаємо функцію без аргументів
//                System.out.println("f() = " + result); // Виведе: f() = 7
//            }
//        }
//        Тут:
//        f() — метод без параметрів
//        Завжди повертає 7, незалежно від ситуації


//        ФУНКЦІЯ ЗІ ЗМІННОЮ (з побічним ефектом)

//Це коли функція змінює щось поза собою:
// наприклад, змінює значення змінної, друкує в консоль, записує в файл тощо.

//        public class Main {
//            // Функція зі змінною x
//            public static int f(int x) {
//                return 2 * x + 3;
//            }
//
//            public static void main(String[] args) {
//                int result = f(5);  // Викликаємо функцію з x = 5
//                System.out.println("f(5) = " + result); // Виведе: f(5) = 13
//            }
//        }

//Тут:
// f(int x) — метод, який приймає число x
// return 2 * x + 3; — формула, яка виконує обчислення

//Колекції
// ArrayList

//        ArrayList<Short> nums = new ArrayList<>();
//        nums.add((short)56); // додати новий елемент до нашої колекції
//        short num1 = 45; // можна створити окрему якусь зміну
//        nums.add(num1); // додати в якості елементу
        // потім їх можна видали або замінити, в звичайному масиві таке не можна робити
//        nums.add (1, (short)13);
// можна в функцію передавати два значення індекс куди ми будемо встановлювати елемент і саме значення

//         nums.remove(1); // щоб видалити елемент треба звернутися до індексу

//         nums.set (0, (short)90); // щоб замінити значення існуючого елементу
        // вказати індекс (напевно це рядок в консолі),вказати нове значення, зробити перетворення short
        //  56 стає 90

//   Short [] numbers = (Short[])nums.toArray(); // перетворити всю колекцію на масив > створити масив
        // звернутися до колекції nums і до функції toArray, яка перетворює колекцію на звичайний масив
        // помилка бо тип даних по різному написаний short Short, змінити на Short
        //toArray повертає object, треба сконвертувати в short (Short[]) і це буде масив

         // nums.clear(); // і в консолі нічого не буде
        // nums.isEmpty (); // щоб перевірити чи є елементи в самій колекції, якщо є true і навпаки

// Щоб вивести всі елементи у консоль:
//        for (int i = 0; i < nums.size(); i++) // цикл буде йти до кількісті елементів у колекції
// і в консолі це значення буде другим, наскільки я зрозуміла через вказаний індекс
//System.out.println (nums.get(i));
        // Консоль: 56,45

       // або скорочена версія for

//        for (short num : nums) // просто створити якусь зміну і nums (перебираємо таку колекцію)
        // тобто в num буде записуватись всі елементи колекції
//            System.out.println(num); // num - кожен елемент нашої колекції


//        List<String> fruits = new ArrayList<>();
//        fruits.add ("яблоко");
//        fruits.add("вишня");
//        fruits.add("арбуз");
//        fruits.add ("яблоко");
//        System.out.println(fruits);

        // Консоль: яблоко, вишня, арбуз, яблоко
       // - допускає повторення елементів
       //  - зберігає порядок елементів

//        Set<String> fruits = new HashSet<>();
//        fruits.add ("яблоко");
//        fruits.add("вишня");
//        fruits.add("арбуз");
//        fruits.add ("яблоко");
//        System.out.println(fruits);

        // Консоль: арбуз, яблоко, вишня
        //- не допускає повторення елементів
        //- не зберігає порядок елементів

//        Map<String, Integer> fruits = new HashMap<>();
        // довжина рядка це цифрове значення
//        fruits.put ("яблоко", 6);
//        fruits.put ("ананас", 6);
//        fruits.put ("вишня", 5);
//        fruits.put ("яблоко", 4);
//        System.out.println(fruits);

        // Консоль: яблоко - 4, ананас - 6, вишня - 5
        // порядок не зберігається
        // put - перезаписує елемент, якщо він повторюється, то спочатку перший варіант запише, потім другий

        // Щоб зберегти перші значення:
//        fruits.putIfAbsent ("яблоко", 6);
//        fruits.putIfAbsent ("ананас", 6);
//        fruits.putIfAbsent ("вишня", 5);
//        fruits.putIfAbsent ("яблоко", 4);

        // Консоль: яблоко - 6, ананас - 6, вишня - 5

//        Map<String, Integer> fruits = new LinkedHashMap<>();
//        fruits.put ("яблоко", 6);
//        fruits.put ("ананас", 6);
//        fruits.put ("вишня", 5);
//        fruits.put ("яблоко", 4);
//        System.out.println(fruits);
        // Консоль: яблоко - 6, ананас - 6, вишня - 5
        // порядок зберігається
        // не допсукає повторення елементів

//        Map<String, Integer> fruits = new TreeMap<>();
//        fruits.put ("яблоко", 6);
//        fruits.put ("ананас", 6);
//        fruits.put ("вишня", 5);
//        fruits.put ("яблоко", 4);
//        System.out.println(fruits);
        // Консоль: ананас - 6, вишня - 5, яблоко - 6

        // Винятки
        // ці оператори завжди використовуються разом

        // спробувати
//        try {
//            System.out.println(" Введіть своє улюблене число: ");
//            Scanner s = new Scanner(System.in);
//            int iChyslo = s.nextInt();
//            System.out.println("Ваше улблене число - " + iChyslo);
//        }
        // зловити
//        catch (Exception spiymanaPomylka) {
//            System.out.println("Такого робити не можна ");
//        }
//        System.out.println("Программа закінчила своє виконання");

        // Консоль: три - Такого робити не можна, 3 - Программа закінчила своє виконання
//  якщо замість цифри будуть введені букви – InputMismatchException,
//  якщо цю частину поділити на 0 або виконати якусь заборонену операцію – ArithmeticException
//  Але якщо хочемо спіймати всі помилки, а не якийсь тип, то треба використовувати зміну класу Exception
// Джава запише нашу помилку в зміну spiymanaPomylka

//        System.out.println(" Введіть своє улюблене число: ");
//        Scanner s = new Scanner(System.in);
//        if (s.hasNextInt()) {
//            int iChyslo = s.nextInt();
//            System.out.println("Ваше улблене число - " + iChyslo);
//        } else {
//            System.out.println("Введення не є цілим числом");
//        }
        // Консоль: написати не скажу, выбʼє помилку
        // Консоль: Введіть своє улюблене число: сім. Введення не є цілим числом
        Scanner s = null; // оголошення поза try
        // Throwable (control h) ієрархія наслідування помилок
        try {
            Scanner s = new Scanner(System.in);
            System.out.println(" Введіть чисельник: ");
            int c1 = s.nextInt();
            System.out.println("Введіть займенник: ");
            int c2 = s.nextInt();
            System.out.println("Результат: " + c1 / c2); // ділення першого числа на друге
        } catch (Exception pomylka){
            System.out.println("Такого робити не можна" + pomylka.getMessage());
            // Консоль: Введіть чисельник:5 Введіть займенник:0 Такого робити не можна/ by zero
            //У нас тут може бути як мінімум два типи різних помилок:
            // 1 - Користувач може ввести число яке не співпадає з типом данних який ми очікуємо
            // 2 - Користувач може ввести друге число 0. А на нуль ділити не можна
        } finally {
            if (s !=null){
                s.close(); // закриваємо ресурс
                System.out.println("Ресурси звільнено. Scanner закрито");
            }
        }
        // В finally буде виконуватись закриття потоку, звільнення ресурсів
        // В цьому випадку Scanner вдкриває вхідний потік
        // Який добре було б закрити у finally, щоб уникнути витоку пам'яті

        // Є ще такий метод після catch PrintStackTrace - який показує у консолі помилки
        //    public static void main() throws Scanner або s я точно не розумію
//По суті throws просто додається в методі, і коли цей виняток (исключение) буде викидуватись/зʼявлятися
// то в нас у консолі буде червоний текст кажучий про помилку.

    }
    }
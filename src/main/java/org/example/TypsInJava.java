package org.example;
//1:11:52
public class TypsInJava { //Описание класса
    public static void main(String[] args){ //Описание точки хапуска программы
        // В java единицей компиляции является Class - байт код

        // Совпадение имени класса с названием файла нужно, так как,
        // джава при запуске программы будет искать класс файл с названием,
        // совпадающем с названием класса

        // Typs
        int inteher1 = 32;
        short integer2 = 16;
        byte integer3 = 8;
        long integer4 = 64;

        float float1 = 32.0F;
        double float2 = 64.0;

        char symbol = 16;

        boolean bool = true;

        // Operation
        // Int
        System.out.println(5/3);// 1
        System.out.println(5%3);// 2
        System.out.println();
        System.out.println(-5/3);// -1
        System.out.println(-5%3);// -2
        System.out.println();
        // Float
        System.out.println(100.0/0);// Infinity
        System.out.println();
        System.out.println(0.0/0);// NaN
        System.out.println();
        // byte ассемблируется в тип int, имеет место их заменять только при массиве byte, тогда круто
        // Присваивание
        // Множественного присваивания нет - int a = c = 10; - Ошибка
        int a = 10;
        int c = (a*2);
        int d = ((a = 20)+1);
        System.out.println(c);// 20
        System.out.println(d);//21
        System.out.println();

        // Switch case в java работает и с целыми типами, и со строками, так же как и в C++
        // В java в switch case надо ставить break для предотвращения последовательного выполнения всех модулей

        c = a==20? 2:10;
        System.out.println(c);// 2
        System.out.println();

        // В java switch case можно исользовать в качесвте выражения при присваивании переменной
        int dayOfWeek = 2;
        String nameDayOfWeek = switch (dayOfWeek){
            case 1 -> "понедельник";
            case 2 -> {
                String result = "Вто" + "рник";
                yield result;
            }
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "Не день недели";
        };
        System.out.println(nameDayOfWeek);// Вторник
        System.out.println();

        // В яве есть 4 цикла:
        // 1 - for(){}
        // 2 - while(){}
        // 3 - do{}while()
        // 4 -

        // loop1: while(<>){
        //  while(){
        //      if(<>){
        //          break loop1;
        //      }
        //    }
        // }

        // В java String - ссылочный тип
    }
}

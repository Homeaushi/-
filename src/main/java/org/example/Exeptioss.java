package org.example;

public class Exeptioss {
    public static void main(String[] args){
        // Исключение - класс-контейнер с информацией об ошибке
        int a = 5;
        int b = 0;
        if (b == 0){
            throw new ArithmeticException("Деление на 0");
        }
        int c = a/b;

        // Для отлавливания отшибок используется модель
        try{
            // Если тут всё супер, то дуем к finaly(Если есть)
        }catch (Exception e){
            // Если в трай лажа, то сюда ловить ошибку, если поймали, то что
            // -то с ней делаем и финале
        }finally {
            // Если везде всё плохо, то делаем меня и остаёмся в режиме обработки ошибок
        }
    }
}

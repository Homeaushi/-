package org.example;

public interface Student {
    default void printSpecialization() {
        System.out.println("Специализация этих студентов: " + getSpecialization());
    }
    String getSpecialization();
    void printFatigue();
    int getFatigue();
    int getHunger();
}

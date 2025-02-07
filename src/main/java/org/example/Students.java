package org.example;

public class Students implements Student {
    private int fatigue;
    private int hunger;
    private final String specialization = "Никакой";

    public Students(int fatigue, int hunger){
        this.fatigue = fatigue;
        this.hunger = hunger;
    }

    @Override
    public void printFatigue() {
        System.out.println("Нынешняя усталость равна: " + getFatigue());
    }

    @Override
    public int getFatigue(){
        return fatigue;
    }

    public String getSpecialization(){
        return specialization;
    }

    @Override
    public int getHunger() {
        return hunger;
    }
}

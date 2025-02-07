package org.example;

abstract class AbstractStudents {
    private int fatigue;
    private int hunger;
    private final String specialization = "Никакой";

    public AbstractStudents(int fatigue, int hunger){
        this.fatigue = fatigue;
        this.hunger = hunger;
    }

    abstract public void printSpecialization();

    abstract public void printFatigue();

    abstract public int getFatigue();

    abstract public String getSpecialization();

    abstract public int getHunger();

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}

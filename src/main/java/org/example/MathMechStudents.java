package org.example;

public class MathMechStudents extends Students{
    private boolean fatigueFromMatan;
    private final String specialization = "Матан";

    public MathMechStudents(int fatigue, int hunger,boolean fatigueFromMatan) {
        super(fatigue, hunger);
        this.fatigueFromMatan = fatigueFromMatan;
    }

    @Override
    public String getSpecialization(){
        return specialization;
    }

    public boolean getFatigueFromMatan(){
        return fatigueFromMatan;
    }
}

package sk.itsovy.jackanin.goodSchool;

public class Student extends Person {
    private int g_Mat;
    private int g_Eng;
    private int g_Inf;
    private int absence;

    //CONSTRUCTOR
    public Student(String firstName, String lastName, int g_Mat, int g_Eng, int g_Inf, int absence) {
        super(firstName, lastName);
        this.g_Mat = g_Mat;
        this.g_Eng = g_Eng;
        this.g_Inf = g_Inf;
        this.absence = absence;
    }

    //GETTER
    public int getG_Mat() {
        return g_Mat;
    }
    public int getG_Eng() {
        return g_Eng;
    }
    public int getG_Inf() {
        return g_Inf;
    }

    //METHOD
    protected double getAverageGrade(){
        return -1;
    }
    public int getAbsence(){
        return absence;
    }
}

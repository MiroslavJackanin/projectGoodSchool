package sk.itsovy.jackanin.goodSchool;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Karol", "Novak", (byte)1, (byte)2, (byte)1, 24);
        school.addStudent(student1);
    }
}

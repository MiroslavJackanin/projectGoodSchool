package sk.itsovy.jackanin.goodSchool;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Karol", "Novak", 1, 2, 1, 24);
        school.addStudent(student1);

    }
}

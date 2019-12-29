package sk.itsovy.jackanin.goodSchool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School implements SchoolStat{
    private List<Student> list;
    private int count = 0;

    //CONSTRUCTOR
    public School(){
        list = new ArrayList<>();
    }

    //GETTER
    public void getList(){
        for(Student student: list) {
            System.out.println(student);
        }
    }

    //METHOD
    public void addStudent(Student student){
        list.add(student);
        count++;
    }
    public int getCount(){
        return count;
    }

    @Override
    public Student getTheBestStudent() {
        double best = 5;
        for(Student student: list) {
            if (student.getAverageGrade() < best){
                best = student.getAverageGrade();
            }
        }
        for(Student student: list) {
            if (student.getAverageGrade() == best){
                return student;
            }
        }
        return null;
    }
    @Override
    public int getAverageAbsence() {
        double avrg = 0;
        for(Student student: list) {
            avrg += student.getAbsence();
        }
        return (int)avrg/getCount();
    }
    @Override
    public double getAverageGrade() {
        double avrg = 0;
        for(Student student: list) {
            avrg += student.getAverageGrade();
        }
        return avrg/getCount();
    }
    @Override
    public double getAverageGradeFromMath() {
        double avrg = 0;
        for(Student student: list) {
            avrg += student.getG_Mat();
        }
        return avrg/getCount();
    }
    @Override
    public Student getTheWorstStudent() {
        double worst = 1;
        for(Student student: list) {
            if (student.getAverageGrade() > worst){
                worst = student.getAverageGrade();
            }
        }
        for(Student student: list) {
            if (student.getAverageGrade() == worst){
                return student;
            }
        }
        return null;
    }
    @Override
    public int getTheLowestAbsence() {
        int lowest = 200;
        for(Student student: list) {
            if (student.getAbsence() < lowest){
                lowest = student.getAbsence();
            }
        }
        return lowest;
    }
    @Override
    public List getListSortedByLastNameAsc() {
        list.sort(Comparator.comparing(Student::getFirstName));
        list.sort(Comparator.comparing(Student::getLastName));
        return null;
    }
    @Override
    public List getListSortedByAbsenceDesc() {
        list.sort(Comparator.comparingInt(Student::getAbsence));
        Collections.reverse(list);
        return list;
    }
}

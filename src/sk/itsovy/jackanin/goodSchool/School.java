package sk.itsovy.jackanin.goodSchool;
import java.util.List;

public class School implements SchoolStat{
    private List<Student> list;
    private int count = 0;

    //CONSTRUCTOR
    public School(){

    }

    //METHOD
    public void addStudent(Student student){
        count++;
    }
    public int getCount(){
        return count;
    }

    @Override
    public Student getTheBestStudent() {
        return null;
    }
    @Override
    public int getAverageAbsence() {
        return 0;
    }
    @Override
    public double getAverageGrade() {
        return 0;
    }
    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }
    @Override
    public Student getTheWorstStudent() {
        return null;
    }
    @Override
    public int getTheLowestAbsence() {
        return 0;
    }
    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }
    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}
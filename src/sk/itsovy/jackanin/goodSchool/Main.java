package sk.itsovy.jackanin.goodSchool;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student;
        String data;

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/sourceFile/students.dat"));

            while((data = br.readLine()) != null) {
                String[] splitData = data.split("\\s+");

                student = new Student(
                        splitData[0],
                        splitData[1],
                        (byte)Character.getNumericValue(splitData[2].charAt(0)),
                        (byte)Character.getNumericValue(splitData[3].charAt(0)),
                        (byte)Character.getNumericValue(splitData[4].charAt(0)),
                        Integer.parseInt(splitData[5]));

                school.addStudent(student);
            }

            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //METHOD TESTING
        school.getList();
        System.out.println("Best student: " + school.getTheBestStudent());
        System.out.println("Average absence: " + school.getAverageAbsence());
        System.out.println("Average grade: " + school.getAverageGrade());
        System.out.println("Average grade from Math: " + school.getAverageGradeFromMath());
        System.out.println("The worst student: " + school.getTheWorstStudent());
        System.out.println("Lowest absence: " + school.getTheLowestAbsence());

    }
}

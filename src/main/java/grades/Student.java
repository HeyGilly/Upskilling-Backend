package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int num) {
        grade.add(num);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int count = 0;
        for (int num : grade){
            count += num;
        }
        return count/grade.size();
    }


}

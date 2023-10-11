package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student susie = new Student("susie");
        susie.addGrade(90);
        susie.addGrade(94);
        susie.addGrade(97);
        susie.addGrade(99);
        susie.addGrade(92);

        String susieName = susie.getName();
        String susieAverageGrade = String.valueOf(susie.getGradeAverage());


        System.out.println(susieName);
        System.out.println(susieAverageGrade);
        System.out.println(susieName+" Ave Grade: "+susie.getGradeAverage());

    }
}

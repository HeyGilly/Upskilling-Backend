package Employment;

public class Programmer extends Employee{
    private int bonus = 35_000;


    public String status(){
        return "CODE CODE CODE!";
    }

    public static void main(String[] args) {

        Programmer coder = new Programmer();
        Employee employee = new Employee();


        System.out.println("Programmer salary is: $"+coder.getSalary());
        System.out.println("Programmer bonus is: $"+coder.bonus);

        System.out.println("Employee Status: "+employee.status());
        System.out.println("Programmer Status: "+coder.status());


    }
}

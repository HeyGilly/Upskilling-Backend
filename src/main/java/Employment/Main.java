package Employment;

public class Main {

    public static void doWork(Employee e) {
        System.out.println(e.currentStatus());
    }

    public static void main(String[] args) {

        Programmer lucy = new Programmer(1,"lucy",65_000,5_000);

        System.out.println("ID: "+lucy.getId());
        System.out.println("Name: "+lucy.getName());
        System.out.println("Salary: $"+lucy.getSalary());
        System.out.println(lucy.currentStatus());

        System.out.println();

        System.out.println("Congrats!!! Time for your annual Bonus");
        System.out.print("Bonus: $");
        System.out.println(lucy.getAnnualBonus());

        System.out.println();

        System.out.print("Back to reg pay: $");
        System.out.println(lucy.getSalary());

        System.out.println();


        //-- Polymorphism
        Employee one = new Employee();
        Employee two = new Programmer();

        System.out.println("Poly:");
        doWork(one);
        doWork(two);

        System.out.println();

        //-- Polymorphism Example #2
        System.out.println("Poly Example #2");
        Employee susie = new Employee(2, "susie", 65000);
        Employee chris = new Programmer(3, "chris", 70000, 6000);

        System.out.println(susie.currentStatus());
        System.out.println(chris.currentStatus());

    }
}

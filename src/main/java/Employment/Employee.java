package Employment;

public class Employee {

    //-- Properties
    private int id;
    private String name;
    protected int salary;

    //--Constructor
    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Empty Constructor
    public Employee() {}

    //Getters
    public int getId(){
        return  this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    //-- Method
    public String currentStatus(){
        return "Current Status: I am Hired!";
    }

    //-- Protected Method
    protected String greetings(){
        return "Welcome to the Team!";
    }

}

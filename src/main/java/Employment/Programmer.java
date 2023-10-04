package Employment;

public class Programmer extends Employee{

    //Field
    private int bonus = 5_000;

    //-- constructor with SUPER keyword
    public Programmer(int id, String name, int salary, int bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }

    // Empty Constructor
    public Programmer() {
        super();
    }

    //-- Programmers Get bonus Annually
    //   Notice an error appears
    //   This happens because our salary is private.
    //   Once changed to protected look at error go away.
    //   Add super.salary
    //      Notify you that the property is coming from the superclass (Parent)
    public int getAnnualBonus(){
        return super.salary + bonus;
    }


    //Override
    @Override
    public String currentStatus(){
        return super.greetings() + "\nCurrent Status: I am a programmer";
    }



}

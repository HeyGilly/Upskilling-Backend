
public class Person {

    private String name;



    public Person(String name){
      setName(name);
  }

    public String getName(){
//    TODO: return the person's name
        return name;
    }

    public void setName(String name){
//    TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello(){
//  TODO: print a message to the console using the person's name
        return "Hello "+ getName();
    }

    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);






    }

}

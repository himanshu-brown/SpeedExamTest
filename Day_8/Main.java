import java.util.ArrayList;
import java.util.List;

public class Brick{

}

class Person{
    public static final String designation="Person";
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Brick> getDedicatedBricks() {
        return dedicatedBricks;
    }
    public void setDedicatedBricks(List<Brick> dedicatedBricks) {
        this.dedicatedBricks = dedicatedBricks;
    }
    private int age;
    private List<Brick>dedicatedBricks=new ArrayList<>();
    public void dedicateBrick(Brick brick, Person person){
        person.getDedicatedBricks().add(brick);
        if(!(PersonChecker.getPersons().contains(person)))
            PersonChecker.getPersons().add(person);
    }
    
    
    }

    class User extends Person{
        public static final String designation="User";
    }

    class Admin extends Person{
        public static final String designation="Admin";
    }

 










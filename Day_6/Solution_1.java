public class Solution_1{
    public static void main(String[] args) {
       
    }
}
class Persons{
    private String name;
    private int age;
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
}
interface Vehicles{
public void move();
}

class Cars implements Vehicles{
private Driver driver;
private static final int tyres=4;
public static int getTyres() {
    return tyres;
}

public Driver getDriver() {
    return driver;
}

public void setDriver(Driver driver) {
    this.driver = driver;
}

@Override
public void move() {
    System.out.println("It runs..");
    
}
}

class Aircraft implements Vehicles{
    private static final int tyres=3;
    private Driver driver;
    @Override
    public void move() {
        System.out.println("Aircraft Fly..");
        
    }
    public static int getTyres() {
        return tyres;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
}
class Driver extends Persons{
    int drivingExperience;

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
   

}
class MP extends Persons{
String constituency;
int spendingLimit;
Cars car;
public void setConstituency(String constituency) {
    this.constituency = constituency;
}
public int getSpendingLimit() {
    return spendingLimit;
}
public void setSpendingLimit(int spendingLimit) {
    this.spendingLimit = spendingLimit;
}
public Cars getCar() {
    return car;
}
public void setCar(Cars car) {
    this.car = car;
}
public String getConstituency(){
    return constituency;
}
public boolean exceedsSpendingLimit(){
    if(spendingLimit>100000)
        return true;
    else
        return false;
}
public Driver getDriver(){
    return car.getDriver();
}
}

class Minister extends MP{
    public boolean exceedsSpendingLimit(){
        if(spendingLimit>1000000)
            return true;
        else
            return false;
    }
    
}

class PM extends MP{
Aircraft aircraft;
public boolean exceedsSpendingLimit(){
    if(spendingLimit>1000000)
        return true;
    else
        return false;
}

}
class Commisioner{
  String name;
  String age;
  boolean permission;
  public void canArrest(MP mp){
      System.out.println("MP can be arrested..");
  }
  public void canArrest(Minister minister){
    if(permission)
        System.out.println("Minister can be arrested..");
    else
    System.out.println("Minister cannot be arrested..");
  }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getAge() {
    return age;
}
public void setAge(String age) {
    this.age = age;
}
public boolean isPermission() {
    return permission;
}
public void setPermission(boolean permission) {
    this.permission = permission;
}
   
}
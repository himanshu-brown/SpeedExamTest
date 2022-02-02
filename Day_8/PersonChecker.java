class PersonChecker{
    private static List<Person> persons=new ArrayList<>();
    public static void hottestFinder(){
        if(persons.isEmpty())
           { System.out.println("No brick dedicated to anyone..");
            return;}
        int max=0;
        Person hottest=new Person();
        for(Person person:persons)
        {
            if(person.getDedicatedBricks().size()>max)
                {
                    max=person.getDedicatedBricks().size();
                    hottest=person;
                }
        }
        System.out.println(hottest.getName());
    }
    public static List<Person> getPersons() {
        return persons;
    }
    public static void setPersons(List<Person> persons) {
        PersonChecker.persons = persons;
    }
   
}
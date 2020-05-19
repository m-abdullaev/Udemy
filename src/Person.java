public class Person {

    String name;
    static int age;

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public Person(String name){
        this.name = name;
        System.out.println("Person created");
    }


    public void sayHelloTo(Person person) {
        System.out.println(getName()+ " said hello to " +  person.getName() );
    }
}

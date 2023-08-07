public class Person {
    //properties and fields
    private String name;
    //constructors
    public Person(String name){
        this.name = name;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public String setName(String name){
       return this.name = name;
    }
    //other methods

    public void sayHello(){
        System.out.println("Hello, " + this.name + "!");
    }

    public static void main(String[] args) {
//        Person jose = new Person();
//        System.out.println(jose.name);
//        jose.setName("Jose De La Luz");
//        System.out.println(jose.name);
//        jose.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

}

public class Person {
    private String name;

    public static void main(String[] args) {
        Person person1 = new Person("Po");
        Person person2 = new Person("Steve");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return getName();
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println(this.name);
    }


}





//public class Person {
//    private String name;
//
//    public static void main(String[] args) {
//        Person person1 = new Person("Mary");
//        Person person2 = new Person("Po");
//
//        // next line is true b/c the strings are the same
//        System.out.println(person1.getName().equals(person2.getName()));
//
//        // next line is false b/c each object has a separate reference in memory.
//        // they are separate objects.
//        System.out.println(person1 == person2);
//
//        Person person3 = new Person("Sukari");
//        Person person4 = person3;
//        // The next line is true b/c person4 = person3 is assigning the reference.
//        // that means that both person3 and person4 reference the same location in memory
//        System.out.println(person3 == person4);
//
//        // b/c objects assign a reference to a variable, not a value.
//        Person person5 = new Person("Steve");
//        Person person6 = person1;
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());
//        person6.setName("Tito");
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());
//
//    }
//
//
////      returns the person's name
////      Ex: public String getName();
//
//    // getter is a generic name for a method that gets a property
//    public String getName() {
//        return name;
//    }
//
//
////    changes the name property to the passed value
////    Ex: public void setName(String name);
//
//    // setter sets a value on an object
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
////    prints a message to the console using the person's name
////    Ex: public void sayHello();
//    public Person(String name) {
//        this.name = name;
//    }
//
//
//
//
//
//
//}

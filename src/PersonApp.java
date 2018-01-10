public class PersonApp {
    public static void main(String[] args) {
        Person2 person1 = new Person2("Cameron");
        Person2 person2 = new Person2("Joe");

        System.out.println(person1.getName().equals(person2.getName()));

        System.out.println(person1 == person2);

        Person2 person3 = new Person2("Donna");
        Person2 person4 = person3;

        System.out.println(person3 == person4);

        Person2 person5 = new Person2("Gordo");
        Person2 person6 = person1;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Cameron");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}

// bring in USER on public class


    //  1 //
//  This class should have two protected string properties: firstName and lastName.
    // protected String last/firstNAme;
//
//  2 //
//    Add a CONSTRUCTOR method that takes in two strings
// that will be used to set the firstName and lastName properties.
//      COMMAND + N CONSTRUCTOR
//
//  3 //
//    If the firstName or lastName (or both) argument is NULL
// the constructor should THROW an IllegalArgumentException with a descriptive error message.
/*
    use if statement
    conditional if firstname == NULL OR || lastname == NULL

 */
    //
//
//  4 //
//    Write a getter and setter for BOTH
// the firstName and lastName properties.
//      COMMAND + N


// GREETER IMPLEMENTATION
// The implementation of the sayHello method on the Person class should use the firstName and lastName properties to create a greeting message that is returned.




public class Person implements Greeter {

//        if (firstName == null || lastName == null) {
//        throw new IllegalArgumentException("Illegal Exception thrown for constructor because " + firstName" and/or " + lastName + " is null");
//    }
    //1
    protected String firstName;
    protected String lastName;

    //2

//4
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;



        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Illegal Exception thrown for constructor because " + firstName + " and/or " + lastName + " is null");
        }
    }

        public String sayHello(){
            String greeting = "Hello " + firstName + lastName + " !";
            System.out.println(greeting);
            return greeting;
        }
    }



//    //3
//        if (firstName == null || lastName == null) {
//        throw new IllegalArgumentException("Illegal Exception thrown for constructor because " + firstName" and/or " + lastName + " is null");
//    }






















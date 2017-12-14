//Create a class named User that inherits from Person
// EXTENDS inheritance



public class User extends Person {

//    The User class should have a protected property named admin that is a boolean.
//
// Create a constructor for the User class
// that accepts the same parameters as the Person constructor
// plus a third parameter, a BOOLEAN
// for whether or not the user is an administrator
//
// Use this to set the admin property.
//

    // COME BACK TO LAST QUESTION IN USER
// Write a method on the User class named isAdmin()
// that functions as a getter for the admin property.


    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;

    }
   public boolean isAdmin(){
        return admin;
   }
}

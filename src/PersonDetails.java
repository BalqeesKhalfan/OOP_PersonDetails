/**
 * Write a Java class named PersonDetails with private attributes
 * for firstName and lastName.
 * Include a method to concatenate and return the full name.
 */
public class PersonDetails {
    private String firstName;
    private  String lastName;

    public PersonDetails(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

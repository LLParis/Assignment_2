/**
 * 
 * @author London Paris
 *
 */

public class PersonData extends HasState 
{
    protected String lastName;
    protected String firstName;
    protected String address;
    protected String phone;

    public PersonData() {

    }


    /**
     * Constructor with arguments
     * @param firstName
     * @param lastName
     * @param address
     * @param phone
     */
    public PersonData(String firstName, String lastName, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Accessor for firstName field.
     * @return firstName of the person
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Accessor for lastName field.
     * @return lastName of the person
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Mutator for firstName field.
     * @return firstName of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Mutator for lastName field.
     * @return lastName of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * to string method
     * @return string representation of the object.
     */
    public String toString()
    {
        //Do not change this implementation
        return "First name: "+firstName+"; Last name: "+lastName+"; Address: "+address+"; Phone: "+phone;
    }
 }
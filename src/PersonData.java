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

    /**
     * No-argument constructor that sets all fields to empty strings.
     */
    public PersonData() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.phone = "";
    }

    /**
     * Constructor that accepts firstName, lastName, address, and phone.
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param address the person's address
     * @param phone the person's phone number
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
     * Accessor for the address field
     * @return the person's address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor method for the person's phone number
     * @return the person's phone number
     */
    public String getPhone() {
        return this.phone;
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
     * Mutator method for address field
     * @param address of the person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Mutator method for phone field
     * @param phone number of the person
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Clone method
     * @return clone of object
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: Clone not supported.");
            return null;
        }
    }

    /**
     * Equals method to compare two people
     * @param obj
     * @return true if people are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersonData other = (PersonData) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName) && this.address.equals(other.address) && this.phone.equals(other.phone);
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
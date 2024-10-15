import java.util.ArrayList;
/**
 * 
 * @author London Paris
 *
 */

public class CustomerData extends PersonData
{
    private int customerNumber;
    private boolean mailingList;
    private ArrayList<Long> transactions;

    /**
     * Non-argument Constructor
     * Customer number is set to 0, mailingList to false, and transactions to an empty ArrayList.
     */
    public CustomerData() {
        this.customerNumber = 0;
        this.mailingList = false;
        this.transactions = new ArrayList<Long>();
    }

    /**
     * Constructor that accepts customer data including inherited fields, customerNumber, mailingList, and transactions.
     * @param firstName the customer's first name
     * @param lastName the customer's last name
     * @param address the customer's address
     * @param phone the customer's phone number
     * @param customerNumber the customer's unique number
     * @param mailingList whether the customer is on the mailing list
     * @param transactions the list of transactions (deep copied)
     */
    public CustomerData(String firstName, String lastName, String address, String phone, int customerNumber, boolean mailingList, ArrayList<Long> transactions) {
        super(firstName, lastName, address, phone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
        setTransactions(transactions);
    }

    /**
     * Accessor for customerNumber.
     * @return the customer's unique number
     */
    public int getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Mutator for customerNumber.
     * @param customerNumber the customer's unique number
     */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * Accessor for mailingList.
     * @return true if the customer is on the mailing list, false otherwise
     */
    public boolean isMailingList() {
        return mailingList;
    }

    /**
     * Mutator for mailingList.
     * @param mailingList whether the customer is on the mailing list
     */
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    /**
     * Accessor for transactions. Returns a deep copy of the transactions ArrayList.
     * @return a deep copy of the transactions list
     */
    public ArrayList<Long> getTransactions() {
        return new ArrayList<>(transactions); // Return deep copy
    }

    /**
     * Mutator for transactions. Ensures a deep copy is made. If a null list is passed, throws an IllegalArgumentException.
     * @param transactions list of transactions
     * @throws IllegalArgumentException if transactions is null
     */
    public void setTransactions(ArrayList<Long> transactions) {
        if (transactions == null) {
            throw new IllegalArgumentException("Transactions list cannot be null.");
        }
        this.transactions = new ArrayList<>(transactions); // Make a deep copy
    }

    /**
     * Method to add a transaction to the list after validation.
     * @param t the transaction value
     * @throws IllegalArgumentException if transaction is invalid
     */
    public void addTransaction(long t) {
        if (t <= 0 || String.valueOf(t).length() > 15) {
            throw new IllegalArgumentException("Transaction must be a positive number with no more than 15 digits.");
        }
        transactions.add(t);
    }

    /**
     * Equals method to compare two CustomerData objects by their fields.
     * @param obj the object to compare
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerData)) {
            return false;
        }
        CustomerData other = (CustomerData) obj;
        return super.equals(other) && this.customerNumber == other.customerNumber && this.mailingList == other.mailingList && this.transactions.equals(other.transactions);
    }

    /**
     * Clone method to create a deep copy of the CustomerData object.
     * @return a deep copy of the object
     */
    @Override
    public Object clone() {
        CustomerData cloned = (CustomerData) super.clone();
        cloned.transactions = new ArrayList<>(this.transactions); // Deep copy of transactions
        return cloned;
    }

    public String toString()
    {
        //Do not change this implementation
        String str = super.toString()+"; Customer number: "+customerNumber+"; Mailing list: "+mailingList+"; Transactions: "+transactions.toString();
        return str;
    }

}

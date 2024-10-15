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
     */
    public CustomerData() {
        this.customerNumber = 0;
        this.mailingList = false;
        this.transactions = new ArrayList<Long>();
    }

    public String toString()
    {
        //Do not change this implementation
        String str = super.toString()+"; Customer number: "+customerNumber+"; Mailing list: "+mailingList+"; Transactions: "+transactions.toString();
        return str;
    }

}

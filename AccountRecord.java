
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 11/08/2014
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    //no- argument contructor calls other contructor with default values

    public AccountRecord()
    {
        this(0, "", "", 0.0);
    }

    // initialize a record

    public AccountRecord(int acct, String first, String last, double ba1)
    {
        setAccount( acct);
        setFirstName( first);
        setLastName( last);
        setBalance( ba1);
    } // end four - argument AccountRecord contructor
    // set account number

    public void combine( TransactionRecord transaction)
    {
        balance = balance + transaction.getAmount();
    }
    public void setAccount(int acct)
    {
        account = acct;
    }
    public int getAccount()
    {
        return account;
    }
    public void setFirstName(String first)
    {
        firstName = first;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName( String last)
    {
        lastName = last;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setBalance( double ba1)
    {
        balance = ba1;
    }
    public double getBalance()
    {
        return balance;
    }

}

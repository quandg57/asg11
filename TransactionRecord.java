
/**
 * Created with IntelliJ IDEA.
 * User: GIAQUAN
 * Date: 11/08/2014
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class TransactionRecord {
    private int account;
    private double amount;

    public TransactionRecord(int ac, double am)
    {
        account = ac;
        amount = am;
    }
    public TransactionRecord()
    {
        this.account =0;
        this.amount = 0.0;
    }

    public void setAccount(int ac)
    {
        account = ac;
    }

    public int getAccount()
    {
        return account;
    }

    public void setAmount(double am)
    {
        amount = am;
    }
    public double getAmount()
    {
        return amount;
    }
}

class Account
{
    static float IRate= 10.25f;
   static int ac_no;
    static float balance;
    static void setIRate(int n, float bal)
    {
        ac_no = n;
        balance = bal;
        System.out.println("Account no is "+n+" and balance is "+bal);
    }
    public static void main(String args[])
    {
        Account.setIRate(3412,688f);
    }
}
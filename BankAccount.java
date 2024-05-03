/*write a java program to create a class called bankAccount 
with private instance variables accountNumber and balance. provide public getter and setter
methods to access andmodify these variables.
 
 */

public class BankAccount {
    public static void main(String[] args) {
        Account a=new Account();
        a.getAccount("SB-09876", 4000);
        a.setAccount();
     
    }
    
}
 class Account {
    private String acconutNum;
    private float balance;

    public void getAccount(String ac,float bal )
    {
      acconutNum=ac;
      balance=bal;

    }

    public void setAccount()
{
  System.out.println("acconutNum: "+acconutNum);
  System.out.println("balance: "+balance);

}
    
    
}
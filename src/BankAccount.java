public class BankAccount {
    String owner = "Marielle Zabala";
    float balance = 120f;

    public float deposit(float Dollars){
        return Dollars + balance;
    }

    public float widthdrawal(float Dollars){
        return Dollars - balance;
    }



}

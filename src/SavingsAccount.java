public class SavingsAccount {
    float annualInterestRate = 10f;

    public  void depositMonthlyInterest(){
        System.out.println(annualInterestRate/12);
    }

    public float widthdrawal(int dollars){
        return annualInterestRate * dollars;
    }


}

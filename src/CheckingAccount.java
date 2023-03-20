public class CheckingAccount {
    float insufficientFundsFee = 13.8f;

    public boolean getInsufficientFundsFee(float dollars) {
        return insufficientFundsFee < dollars;
    }

    public boolean processCheck(boolean checkToProcess){
        return false;
    }

    public float widthrawal(float dollars){
        return dollars;
    }


}

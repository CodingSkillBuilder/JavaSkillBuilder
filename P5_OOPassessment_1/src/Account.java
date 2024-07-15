public class Account {

    private int accNumber;
    private int accBalance = 5000;
    private String accName;
    private String accEmail;
    private int accPhoneNumber;

    public int getAccNumber(){
        return accNumber;
    }

    public int getAccBalance(){
        return accBalance;
    }

    public String getAccEmail() {
        return accEmail;
    }

    public int getAccPhoneNumber() {
        return accPhoneNumber;
    }

    public String getAccName(){
        return accName;
    }

    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }

    public void setAccBalance(String command, int accBalance){
        this.accBalance = accBalance;
    }

    public void setAccEmail(String accEmail){
        this.accEmail = accEmail;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccPhoneNumber(int accPhoneNumber) {
        this.accPhoneNumber = accPhoneNumber;
    }
}

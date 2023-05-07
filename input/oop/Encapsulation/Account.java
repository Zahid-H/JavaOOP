//This is class 
package input.oop.Encapsulation;

public class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    // public setter and getter menthodfor this Account
    public long getAcc() {
        return acc_no;

    }

    public void setAcc(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getmail() {
        return email;
    }

    public float getamount() {
        return amount;
    }

    public void setamount(float amount) {
        this.amount = amount;
    }
}
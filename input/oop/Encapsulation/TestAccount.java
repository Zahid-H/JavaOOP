//This is object 
package input.oop.Encapsulation;

public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc(101010);
        acc.setname("Zahid Hasan Juel");
        acc.setamount(100000);
        System.out.println(
                "ACC_NO: " + acc.getAcc() + "ACC_Holder_Name:\n" + acc.getname() + "ACC_Amount:\n" + acc.getamount());
    }
}
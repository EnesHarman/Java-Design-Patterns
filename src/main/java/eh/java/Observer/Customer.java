package eh.java.Observer;

public class Customer implements Observer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void getUpdates(String update) {
        System.out.println(this.name+" notification: Discount Alert In "+update+" store !!!");
    }
}

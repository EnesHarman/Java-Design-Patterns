package eh.java.Observer;

public class ObserverMain {
    public static void main(String[] args){
        Store hNm = new Store(5,"H&M");
        Store nike = new Store(7,"Nike");

        Customer tom = new Customer("Tom");
        Customer helen = new Customer("Helen");

        hNm.addObserver(helen);
        hNm.addObserver(tom);

        nike.addObserver(tom);

        hNm.setDiscount(15);
        nike.setDiscount(25);

    }
}

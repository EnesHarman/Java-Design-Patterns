package eh.java.Adapter;

public class AdapterMain {
    public static void main(String[] args){
        DistanceCalculatorAdapter distanceCalculator = new DistanceCalculaterAdapterImpl();
        System.out.println( distanceCalculator.calculate("London", "Berlin"));
    }
}

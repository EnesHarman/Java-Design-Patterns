package eh.java.Adapter;

public class DistanceCalculaterAdapterImpl implements DistanceCalculatorAdapter{

    ExternalDistanceCalculator distanceCalculator = new ExternalDistCalculatorImpl();

    @Override
    public long calculate(String dest1, String dest2) {
        return this.distanceCalculator.calculate(dest1,dest2) + 200;
    }
}

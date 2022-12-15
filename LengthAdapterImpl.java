public class LengthAdapterImpl implements LengthAdapter {
    private Length landmark;
    
    public LengthAdapterImpl(Length landmark) {
        this.landmark = landmark;
    }

    @Override
    public double getLength() {
        double meter = landmark.getLength();
        return convertMetertohm(meter);
    }
    
    private double convertMetertohm(double meter) {
        return meter * 0.01;
    }
}

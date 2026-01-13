package lab1;

public class Cyclist implements IsMobile {

    private static final double f = 15.0;

    @Override
    public double travelFlat(double distkm) {
        return distkm / f;
    }

    @Override
    public double travelElevated(double distkm, double angleDegrees) {
        double slopeFactor = 1 + (angleDegrees / 30.0);
        double elevatedSpeed = f / slopeFactor;
        return distkm / elevatedSpeed;
    }
}
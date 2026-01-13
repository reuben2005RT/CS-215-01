package lab1;

public class Pedestrian implements IsMobile {

    private static final double F = 5.0; 

    @Override
    public double travelFlat(double distkm) {
        return distkm / F;
    }

    @Override
    public double travelElevated(double distkm, double angleDegrees) {
        double slopeFactor = 1 + (angleDegrees / 45.0); 
        double elevatedSpeed = F / slopeFactor;
        return distkm / elevatedSpeed;
    }
}

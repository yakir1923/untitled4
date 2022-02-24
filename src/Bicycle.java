public class Bicycle extends WayToTravel{

    @Override
    public int calculatingETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int calculatingDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}

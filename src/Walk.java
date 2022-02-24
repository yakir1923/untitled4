public class Walk extends WayToTravel{
    @Override
    public int calculatingETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int calculatingDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}

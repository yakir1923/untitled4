public class Drive extends WayToTravel{
    @Override
    public int calculatingETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int calculatingDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}

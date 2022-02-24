public class Transit extends WayToTravel{
    @Override
    public int calculatingETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int calculatingDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        Drive d=new Drive();
        Transit t=new Transit();
        Walk w=new Walk();
        DirectionService directionService=new DirectionService();
        directionService.setTravelMode(b);
        System.out.println( directionService.getTravelMode().calculatingDirection());
        directionService.setTravelMode(t);
        System.out.println( directionService.getTravelMode().calculatingETA());


    }
}

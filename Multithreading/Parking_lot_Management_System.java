public class ShoppingMall {
	public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();

        CarThread car1 = new CarThread(parkingLot, "Car 1");
        CarThread car2 = new CarThread(parkingLot, "Car 2");
        CarThread car3 = new CarThread(parkingLot, "Car 3");
        CarThread car4 = new CarThread(parkingLot, "Car 4");
        CarThread car5 = new CarThread(parkingLot, "Car 5");
        CarThread car6 = new CarThread(parkingLot, "Car 6");

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
    }
}


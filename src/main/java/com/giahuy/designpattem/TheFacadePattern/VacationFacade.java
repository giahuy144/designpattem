package main.java.com.giahuy.designpattem.TheFacadePattern;

public class VacationFacade {
    private HotelBooking hotel;
    private FlightBooking flight;
    private CarRental car;

    public VacationFacade() {
        hotel = new HotelBooking();
        flight = new FlightBooking();
        car = new CarRental();
    }

    public void bookVacation() {
        System.out.println("Booking full vacation...");
        hotel.bookRoom();
        flight.bookFlight();
        car.rentCar();
        System.out.println("Thanh cong!!");
    }
}

import controller.HotelController;
import model.Hotel;
import model.HotelLocations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HotelController hotelController = new HotelController();


        hotelController.createLocation("Chennai");
        hotelController.createLocation("Bengalure");
        hotelController.createLocation("Hydrabad");

        hotelController.createHotel(1 , "Dhoni" , 10);
        hotelController.createHotel(2 , "Kohli" , 11);
        hotelController.createHotel(3 , "Kane" ,12);


        hotelController.displayAllHotels();
    }
}
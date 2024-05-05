import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Create instances of your classes
        User user = new User();
        Flight flight = new Flight();
        RolesAndPermissions rolesAndPermissions = new RolesAndPermissions();
        RandomGenerator randomGenerator = new RandomGenerator();
        FlightReservation flightReservation = new FlightReservation();
//       FlightDistance flightDistance = new FlightDistance();
        Customer customer = new Customer();

        // Call methods on your instances
//        user.addNewCustomer();
//        flight.someMethod();
//        rolesAndPermissions.someMethod();
//        randomGenerator.randomIDGen();
//        flightReservation.reserveFlight();
//        flightDistance.calculateDistance();
        customer.addNewCustomer();
        customer.displayCustomersData(true);
        String ID = "806 354 ";
        customer.searchUser(ID);
        customer.editUserInfo(ID);
        customer.displayCustomersData(true);
        customer.deleteUser(ID);
        customer.displayCustomersData(true);
        flightReservation.bookFlight("", 2, "");
//        flight.flightScheduler();
//        flight.addNewCustomerToFlight(customer);
//
//        flight.displayFlightSchedule();

        // Call the cancelFlight method
        flightReservation.cancelFlight("806 354 ");
        String status = flightReservation.flightStatus(flight);
        System.out.println("Flight status: " + status);
        flightReservation.displayFlightsRegisteredByOneUser("806 354 ");
//        List<Customer> customers = new ArrayList<>();
//        flightReservation.displayHeaderForUsers(flight,customers);
        flightReservation.displayRegisteredUsersForAllFlight();
        flightReservation.displayRegisteredUsersForASpecificFlight("");
        flightReservation.displayArtWork(1);



    }
}

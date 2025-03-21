enum TicketClass {
    ECONOMY, 
    BUSINESS, 
    FIRST_CLASS
}

class FlightTicket {
    private int ticketNumber;
    private String passengerName;
    private TicketClass ticketclass;

    FlightTicket (int ticketNumber , String passengerName , TicketClass ticketclass) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.ticketclass = ticketclass;
    }

    public  void changeTicketclass (TicketClass newTicket) {    
        this.ticketclass = newTicket;
        System.out.println("Ticket class Update to : " + ticketclass);
    }

    public void displayTicket () {
        System.out.println(ticketNumber + " " + passengerName + " : " + ticketclass);
    }
}

public class Flight_Ticket_Management_System_Using_Enum {
    public static void main(String[] args) {
        FlightTicket flightTicket = new FlightTicket(154, "Nor", TicketClass.ECONOMY);

        flightTicket.displayTicket();

        flightTicket.changeTicketclass(TicketClass.BUSINESS);
        flightTicket.displayTicket();

        flightTicket.changeTicketclass(TicketClass.FIRST_CLASS);
        flightTicket.displayTicket();
    }
}
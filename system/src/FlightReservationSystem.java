public interface FlightReservationSystem<List> {
    void addReservation(Reservation rezerwacja);
    void cancelReservation(Reservation rezerwacja);
    Flight searchFlight(Flight lot);
    List getAvailableFlights();
}

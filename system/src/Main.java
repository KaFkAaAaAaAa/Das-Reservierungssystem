public class Main {
    public static void main(String[] args) {
        FlightBookingSystem lotnisko = new FlightBookingSystem();

        Flight lotPraOle = new Flight("Praga", "Oleśnica", "21.03.2137", 30, 34);
        Flight lotKorOza = new Flight("Korsyka", "Ożarów", "26.04.1986", 300, 101);
        Flight lotPisOlt = new Flight("Piszkawa", "Ołtaszyn", "24.04.2006", 56, 78);

        lotnisko.loty.add(lotPraOle);
        lotnisko.loty.add(lotKorOza);
        lotnisko.loty.add(lotPisOlt);

        Reservation reserEins = new Reservation(lotPraOle, "Jon", "Doe", 300);
        Reservation reserZwei = new Reservation(lotKorOza, "Will", "Smith", 32);
        Reservation reserDrei = new Reservation(lotPisOlt, "Elon", "Muzg", 111);

        lotnisko.addReservation(reserEins);
        lotnisko.addReservation(reserZwei);
        lotnisko.addReservation(reserDrei);


        lotnisko.cancelReservation(reserZwei);
        System.out.println(lotnisko.searchFlight(lotPraOle).getMiejsce_docelowe());

        System.out.println(lotnisko.getAvailableFlights());
    }
}
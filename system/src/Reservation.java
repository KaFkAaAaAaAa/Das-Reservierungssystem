public class Reservation {
    private Flight flight;
    private String imie_posiadacza;
    private String nazwisko_posiadacza;
    private int cena_biletu;

    public Reservation(Flight flight, String imie_posiadacza, String nazwisko_posiadacza, int cena_biletu) {
        this.flight = flight;
        this.imie_posiadacza = imie_posiadacza;
        this.nazwisko_posiadacza = nazwisko_posiadacza;
        this.cena_biletu = cena_biletu;
        flight.setLiczba_dostepnych_miejsc(flight.getLiczba_dostepnych_miejsc()-1);
    }

}

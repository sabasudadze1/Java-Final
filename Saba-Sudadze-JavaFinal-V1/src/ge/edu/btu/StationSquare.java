package ge.edu.btu;

public class StationSquare {


    public static void main(String[] args) {

        Passenger kalduna = new Passenger("Kalduna", true);

        Passenger shit = new Passenger("Trio Mandili", false);

        Passenger shit2 = new Passenger("Russian Tourists", false);

        Passenger sheshlilijoni = new Passenger("Sheshlili joni", true);


        Train train = new Train();

        train.addPassenger(kalduna);
        train.addPassenger(shit);
        train.addPassenger(sheshlilijoni);
        train.addPassenger(shit2);


        for(Passenger passenger: train.getPassengerList())
            System.out.println(passenger.getName());
    }
}

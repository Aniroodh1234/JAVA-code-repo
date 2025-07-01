import java.util.ArrayList;
import java.util.List;

class Booking {
    String date;
    String startTime;
    String endTime;
    String name;

    public Booking(String date, String startTime, String endTime, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }

    public boolean conflictsWith(String date, String startTime, String endTime) {
        return this.date.equals(date) && ((this.startTime.compareTo(endTime) < 0 && this.endTime.compareTo(startTime) > 0));
    }
}

public class Booking_Room {
    private static final List<Booking> bookings = new ArrayList<>();

    public static boolean bookRoom(String date, String startTime, String endTime, String name) {
        for (Booking booking : bookings) {
            if (booking.conflictsWith(date, startTime, endTime)) {
                System.out.println("Room is already booked during this time slot.");
                return false;
            }
        }
        bookings.add(new Booking(date, startTime, endTime, name));
        System.out.println("Booking successful for " + name + " on " + date + " from " + startTime + " to " + endTime);
        return true;
    }

    public static void main(String[] args) {
        bookRoom("2025-02-10", "10:00", "12:00", "Aniroodh");
        bookRoom("2025-02-10", "11:00", "13:00", "Abhighyan");
        bookRoom("2025-02-10", "13:00", "14:00", "Shayan");
    }
}

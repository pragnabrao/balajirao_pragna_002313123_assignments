package info5100.university.example.CourseSchedule;

public class Seat {
    
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment; // links back to studentprofile
    CourseOffer courseoffer;
    
    public Seat(CourseOffer co, int n) {
        courseoffer = co;
        number = n;
        occupied = false;
    }
    
    public Boolean isOccupied() {
        return occupied;
    }

    // Creates a new SeatAssignment and marks the seat as occupied
    public SeatAssignment newSeatAssignment(CourseLoad cl) {
        seatassignment = new SeatAssignment(cl, this); // links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }

    public CourseOffer getCourseOffer() {
        return courseoffer;
    }

    public int getCourseCredits() {
        return courseoffer.getCreditHours();
    }

    // Assigns a SeatAssignment to this seat and marks it as occupied
    public void assignSeat(SeatAssignment sa) {
        this.seatassignment = sa;
        this.occupied = true;
    }
}

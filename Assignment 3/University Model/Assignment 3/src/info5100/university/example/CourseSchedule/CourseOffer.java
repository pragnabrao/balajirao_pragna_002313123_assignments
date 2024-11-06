/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;

public class CourseOffer {
    Course course;
    ArrayList<Seat> seatlist;
    String facultyName;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList<>();
        facultyName = "No faculty assigned"; // Default faculty name
    }

    // Assign a faculty member to the course by their name
    public void AssignAsTeacher(String facultyName) {
        this.facultyName = facultyName;
    }

    // Get the assigned faculty member's name
    public String getFacultyName() {
        return facultyName;
    }

    // Generate seats for this course offer
    public void generatSeats(int n) {
        for (int i = 0; i < n; i++) {
            Seat seat = new Seat(this, i);
            seatlist.add(seat);
        }
    }

    // Get an empty seat in the course offer (null if no seats are available)
    public Seat getEmptySeat() {
        for (Seat s : seatlist) {
            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    // Assign a student to an empty seat in this course offer and return the seat assignment
    public SeatAssignment assignEmptySeat(CourseLoad cl) {
        Seat seat = getEmptySeat();
        if (seat == null) {
            return null; // No empty seat available
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); // Creates a new seat assignment for this seat
        cl.registerStudent(sa); // Registers the student for this course
        return sa;
    }

    // Get the total credit hours of the associated course
    public int getCreditHours() {
        return course.getCredits();
    }

    // Get the course number of the associated course
    public String getCourseNumber() {
        return course.getCourseNumber();
    }

    // Calculate the total revenue from occupied seats
    public int getTotalCourseRevenues() {
        int sum = 0;
        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                sum += course.getCoursePrice();
            }
        }
        return sum;
    }

    // Get the course associated with this course offer
    public Course getCourse() {
        return course;
    }
}

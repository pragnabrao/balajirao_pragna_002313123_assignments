/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.SeatAssignment;

/**
 *
 * @author Pragna B Rao
 */
public class Seat {
    private CourseOffer courseOffer;
    private int seatNumber;
    private boolean occupied;
    private SeatAssignment seatAssignment;

    public Seat(CourseOffer courseOffer, int seatNumber) {
        this.courseOffer = courseOffer;
        this.seatNumber = seatNumber;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void assignSeat(SeatAssignment assignment) {
        this.seatAssignment = assignment;
        this.occupied = true;
    }

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }
}

package info5100.university.example.CourseSchedule;

import java.util.ArrayList;

public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments; // each represents one course registration
    
    public CourseLoad(String s) {
        seatassignments = new ArrayList<>();
        semester = s;
    }
    
    // Registers a student in a class, returns the seat assignment if successful
    public SeatAssignment registerStudentInClass(CourseOffer co) {
        Seat seat = co.getEmptySeat();
        if (seat == null) {
            System.out.println("No available seats for course: " + co.getCourseNumber());
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(this); 
        seatassignments.add(sa);
        System.out.println("Registered in course: " + co.getCourseNumber());
        return sa;
    }

    public ArrayList<SeatAssignment> getSeatAssignments() {
        return seatassignments;
    }

    // Calculates total GPA for this course load
    public float calculateGPA() {
        float totalGPA = 0;
        int totalCredits = 0;
        
        for (SeatAssignment sa : seatassignments) {
            float gpa = sa.getGPAForGrade();
            int credits = sa.getCreditHours();
            totalGPA += gpa * credits;
            totalCredits += credits;
            System.out.println("Course: " + sa.getCourseOffer().getCourseNumber() + ", GPA: " + gpa + ", Credits: " + credits);
        }
        
        float calculatedGPA = totalCredits > 0 ? totalGPA / totalCredits : 0;
        System.out.println("Total GPA for semester " + semester + ": " + calculatedGPA);
        return calculatedGPA;
    }

    // Calculate total tuition for the course load
    public int calculateTotalTuition() {
        int totalCost = 0;
        for (SeatAssignment sa : seatassignments) {
            int courseCost = sa.getSeat().getCourseOffer().getCourse().getCoursePrice(); // Assuming getCoursePrice is the price per student
            totalCost += courseCost;
            System.out.println("Course: " + sa.getCourseOffer().getCourseNumber() + ", Tuition: $" + courseCost);
        }
        System.out.println("Total tuition for semester " + semester + ": $" + totalCost);
        return totalCost;
    }

    // Returns total score for all courses in the semester (example implementation)
    public float getSemesterScore() {
        float sum = 0;
        for (SeatAssignment sa : seatassignments) {
            sum += sa.GetCourseStudentScore();
        }
        System.out.println("Total score for semester " + semester + ": " + sum);
        return sum;
    }

    // Registers a student with a seat assignment in the course load
    public void registerStudent(SeatAssignment sa) {
        seatassignments.add(sa);
        System.out.println("Added seat assignment for course: " + sa.getCourseOffer().getCourseNumber());
    }
}

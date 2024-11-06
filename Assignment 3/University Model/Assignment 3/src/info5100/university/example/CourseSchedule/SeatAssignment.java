

package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;

public class SeatAssignment {
    private String grade; // e.g., "A", "B+"
    private Seat seat;
    private CourseLoad courseload;

    public SeatAssignment(CourseLoad cl, Seat s) {
        seat = s;
        courseload = cl;
        seat.assignSeat(this); // Link the SeatAssignment to the seat
        System.out.println("SeatAssignment created for course: " + s.getCourseOffer().getCourse().getCourseName());
    }

    public int getCreditHours() {
        return seat.getCourseOffer().getCourse().getCredits();
    }

    public Seat getSeat() {
        return seat;
    }

    public CourseOffer getCourseOffer() {
        return seat.getCourseOffer();
    }

    public Course getAssociatedCourse() {
        return getCourseOffer().getCourse();
    }

    // Sets the letter grade
    public void setGrade(String grade) {
        this.grade = grade;
        System.out.println("Grade set for course: " + getCourseOffer().getCourse().getCourseName() + " - Grade: " + grade);
    }

    // Retrieves the letter grade
    public String getGrade() {
        return grade;
    }
    

    // Maps letter grades to GPA values
    
    public float getGPAForGrade() {
    float gpa;
    switch (grade) {
        case "A":
            gpa = 4.0f;
            break;
        case "A-":
            gpa = 3.7f;
            break;
        case "B+":
            gpa = 3.3f;
            break;
        case "B":
            gpa = 3.0f;
            break;
        case "B-":
            gpa = 2.7f;
            break;
        case "C+":
            gpa = 2.3f;
            break;
        case "C":
            gpa = 2.0f;
            break;
        case "C-":
            gpa = 1.7f;
            break;
        case "D+":
            gpa = 1.3f;
            break;
        case "D":
            gpa = 1.0f;
            break;
        case "F":
            gpa = 0.0f;
            break;
        default:
            gpa = 0.0f; // Handle undefined grades
            break;
    }
    System.out.println("GPA for grade " + grade + " is " + gpa);
    return gpa;
}

    // Calculates the weighted course score based on GPA and credit hours
    public float GetCourseStudentScore() {
        float courseScore = getGPAForGrade() * getCreditHours();
        System.out.println("Course Student Score for course: " + getCourseOffer().getCourse().getCourseName() 
                + " - Score: " + courseScore);
        return courseScore;
    }

    // Remove or implement this method as needed
    public boolean getLike() {
        // Remove this if not needed, or set a simple return for now
        return false;
    }
}

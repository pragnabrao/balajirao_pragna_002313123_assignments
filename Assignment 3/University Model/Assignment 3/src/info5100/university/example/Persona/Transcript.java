/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;
    CourseLoad currentcourseload;

    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap<>();
    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassignments; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public CourseLoad newCourseLoad(String sem) {
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {
        return currentcourseload;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {
        return courseloadlist.get(semester);
    }

    public float getStudentTotalScore() {
        float sum = 0;
        for (CourseLoad cl : courseloadlist.values()) {
            sum = sum + cl.getSemesterScore();
        }
        return sum;
    }

    public int getStudentSatifactionIndex() {
        ArrayList<SeatAssignment> courseregistrations = getCourseList();
        int sum = 0;
        for (SeatAssignment sa : courseregistrations) {
            if (sa.getLike()) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    // Generate a list of all courses taken so far (seat assignments) 
    // from multiple semesters (course loads)
    // from seat assignments we will be able to access the course offers
    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList<SeatAssignment> temp2 = new ArrayList<>();
        for (CourseLoad cl : courseloadlist.values()) { // Extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatAssignments()); // Merge one array list to another
        }
        return temp2;
    }

    // Calculate the GPA for a given semester
    public float calculateGPA(String semester) {
        CourseLoad courseLoad = getCourseLoadBySemester(semester);
        if (courseLoad == null) {
            return 0.0f; // No courses registered in this semester
        }

        ArrayList<SeatAssignment> seatAssignments = courseLoad.getSeatAssignments();
        float totalGPA = 0;
        int numCourses = 0;

        for (SeatAssignment seat : seatAssignments) {
            String grade = seat.getGrade();
            float gpa = mapGradeToGPA(grade); // GPA mapping
            totalGPA += gpa;
            numCourses++;
        }

        return numCourses > 0 ? totalGPA / numCourses : 0.0f; // Return average GPA for the semester
    }

    // Helper method to map grades to GPA points
    private float mapGradeToGPA(String grade) {
        switch (grade) {
            case "A": return 4.0f;
            case "A-": return 3.7f;
            case "B+": return 3.3f;
            case "B": return 3.0f;
            case "B-": return 2.7f;
            case "C+": return 2.3f;
            case "C": return 2.0f;
            case "C-": return 1.7f;
            case "D+": return 1.3f;
            case "D": return 1.0f;
            case "F": return 0.0f;
            default: return 0.0f;
        }
    }
}

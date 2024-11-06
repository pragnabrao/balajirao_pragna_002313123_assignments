/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog; 

    ArrayList<CourseOffer> schedule;
    String semester; 

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    

    public CourseOffer newCourseOffer(String courseNumber) {
    System.out.println("Looking for course number in newCourseOffer: " + courseNumber); // Debug print

    Course c = coursecatalog.getCourseByNumber(courseNumber);
    if (c == null) {
        System.out.println("Course " + courseNumber + " not found in catalog.");
        return null;
    }

    CourseOffer co = new CourseOffer(c);
    schedule.add(co);
    System.out.println("Course offer created for course number: " + courseNumber); // Confirm successful creation
    return co;

    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }
    
     // Method to get the list of all course offers in this schedule
    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
        
    }

}

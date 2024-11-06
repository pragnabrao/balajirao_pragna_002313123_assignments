/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author Pragna Balaji Rao
 */
public class CourseCatalog {
    Department department; // belongs to the department
    ArrayList<Course> courselist; // list of all courses in the catalog
    
    // Constructor to initialize the CourseCatalog with a given department
    public CourseCatalog(Department d) {
        courselist = new ArrayList<>(); // initialize the course list
        department = d; // set the department
    }
    
    // Method to return the full list of courses (browse courses)
    public ArrayList<Course> getCourseList() {
        return courselist;
    }
    
    // Method to add a new course to the catalog
    public Course newCourse(String n, String nm, int cr) {
        // Create a new Course object and add it to the course list
        Course c = new Course(n, nm, cr);
        courselist.add(c);
        System.out.println("Added course to catalog: " + nm + " (" + n + ")"); // Debug print
        return c; // return the newly added course
    }

    // Method to get a course by its course number
    public Course getCourseByNumber(String courseNumber) {
       System.out.println("Looking for course number: " + courseNumber); // Debug statement
        for (Course course : courselist) {
            System.out.println("Checking course number: " + course.getCourseNumber()); // Debug each course in the list
            if (course.getCourseNumber().equals(courseNumber)) {
            System.out.println("Match found for course number: " + courseNumber); // Debug when a match is found
            return course;
        }
    }
    System.out.println("No match found for course number: " + courseNumber); // Debug when no match is found
    return null;
    }
}
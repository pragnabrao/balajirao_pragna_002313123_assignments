/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author Pragna Balaji Rao
 */
public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour

    public Course(String numb, String n, int ch) {
        name = n;
        number = numb;
        credits = ch;

    }
    // Getter for course name
    public String getCourseName() {
        return name;
    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }

    public int getCredits() {
        return credits;
    
}

}
    

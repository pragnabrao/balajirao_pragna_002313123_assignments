package info5100.university.example.main;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.Random;

public class UniversityDemo {

    public static void main(String[] args) {
        Department department = new Department("Information Systems");
        CourseCatalog courseCatalog = new CourseCatalog(department);

        // Add courses to the catalog
        System.out.println("Courses added to the catalog:");
        addCoursesToCatalog(courseCatalog);

        // Display all courses in the catalog
        System.out.println("\nBrowsing courses:");
        displayCourses(courseCatalog);

        // Create Course Schedule for a new semester
        CourseSchedule fall2024 = new CourseSchedule("Fall2024", courseCatalog);

        // Add 10 Course Offers for some courses in the schedule
        createCourseOffers(fall2024);

        // Assign faculty names
        ArrayList<String> facultyNames = getFacultyNames();
        ArrayList<CourseOffer> courseOffers = fall2024.getSchedule();
        assignFacultyToCourses(courseOffers, facultyNames);

        // Display the Course Schedule with Faculty Assignments
        System.out.println("\nCourse Schedule for Fall 2024:");
        displayCourseSchedule(fall2024);

        // Create students with specific names
        ArrayList<StudentProfile> students = createStudentProfiles();

        // Register students in courses
        System.out.println("\nRegistering students in courses...");
        createAndRegisterStudents(students, courseOffers);

        // Display student course registrations for verification
        System.out.println("\nStudent Course Registrations:");
        displayStudentRegistrations(students);

        // Generate and print the semester report
        System.out.println("\n=== Semester Report for Fall2024 ===\n");
        for (StudentProfile student : students) {
            printSemesterReport(student, "Fall2024");
        }
    }

    private static void addCoursesToCatalog(CourseCatalog courseCatalog) {
        courseCatalog.newCourse("IS5100", "Application Engineering & Development", 4);
        courseCatalog.newCourse("IS6150", "Web Design & User Experience", 4);
        courseCatalog.newCourse("IS6210", "Database Management & Database Design", 4);
        courseCatalog.newCourse("IS7200", "Business Process Engineering", 4);
        courseCatalog.newCourse("IS6879", "User Experience Design", 4);
        courseCatalog.newCourse("IS7300", "Designing Advanced Data Architectures", 4);
        courseCatalog.newCourse("IS6105", "Data Analysis and Visualization", 4);
        courseCatalog.newCourse("IS7500", "Advanced Machine Learning", 4);
        courseCatalog.newCourse("IS7000", "Cybersecurity Fundamentals", 4);
        courseCatalog.newCourse("IS7022", "Business Intelligence", 4);
    }

    private static ArrayList<String> getFacultyNames() {
        ArrayList<String> facultyNames = new ArrayList<>();
        facultyNames.add("Prof. Kal Bugrara");
        facultyNames.add("Prof. Adrei Guschin");
        facultyNames.add("Prof. Naveen Kuragayala");
        facultyNames.add("Prof. Dino Konstantopoulos");
        facultyNames.add("Prof. Peter Mckeown");
        facultyNames.add("Prof. Jessica Fisher");
        facultyNames.add("Prof. McFarland Tyler");
        facultyNames.add("Prof. Gail Schwatz");
        facultyNames.add("Prof. Yousuf Ozbek");
        facultyNames.add("Prof. Maya Harris");
        return facultyNames;
    }  
    private static void assignFacultyToCourses(ArrayList<CourseOffer> courseOffers, ArrayList<String> facultyNames) {
        for (int i = 0; i < courseOffers.size() && i < facultyNames.size(); i++) {
            courseOffers.get(i).AssignAsTeacher(facultyNames.get(i));
        }
    
    }

    private static void createCourseOffers(CourseSchedule fall2024){
        fall2024.newCourseOffer("IS5100");
        fall2024.newCourseOffer("IS6150");
        fall2024.newCourseOffer("IS6210");
        fall2024.newCourseOffer("IS7200");
        fall2024.newCourseOffer("IS6879");
        fall2024.newCourseOffer("IS7300");
        fall2024.newCourseOffer("IS6105");
        fall2024.newCourseOffer("IS7500");
        fall2024.newCourseOffer("IS7000");
        fall2024.newCourseOffer("IS7022");
    
    //Generate seats for each course offer
        ArrayList<CourseOffer> courseOffers = fall2024.getSchedule();
        for (CourseOffer offer : courseOffers) {
            offer.generatSeats(30); // Set 30 seats for each course, or any number you prefer

        
        } 
    }

    

    private static ArrayList<StudentProfile> createStudentProfiles() {
        ArrayList<StudentProfile> students = new ArrayList<>();
        students.add(new StudentProfile(new Person("IS001", "Tina Jones")));
        students.add(new StudentProfile(new Person("IS002", "Pooja D")));
        students.add(new StudentProfile(new Person("IS003", "Christina John")));
        students.add(new StudentProfile(new Person("IS004", "Sara Thomas")));
        students.add(new StudentProfile(new Person("IS005", "Leelyn McIntire")));
        students.add(new StudentProfile(new Person("IS006", "Kim Degaro")));
        students.add(new StudentProfile(new Person("IS007", "Hui Tung")));
        students.add(new StudentProfile(new Person("IS008", "Rita Klingkesmith")));
        students.add(new StudentProfile(new Person("IS009", "Christine Ferguson")));
        students.add(new StudentProfile(new Person("IS010", "John Doe")));
        // ... add remaining students
        return students;
    }

    private static void createAndRegisterStudents(ArrayList<StudentProfile> students, ArrayList<CourseOffer> courseOffers) {
        Random random = new Random();
        for (StudentProfile student : students) {
            CourseLoad courseLoad = student.newCourseLoad("Fall2024");

            // Register for a core course (first course in the list)
            SeatAssignment seat1 = courseLoad.registerStudentInClass(courseOffers.get(0));
            if (seat1 != null) {
                seat1.setGrade(generateGrade(random));
                System.out.println("Registered " + student.getPerson().getName() + " in " + courseOffers.get(0).getCourse().getCourseName());
            }

            // Register for 2 electives
            int electiveIndex1 = random.nextInt(courseOffers.size() - 1) + 1;
            int electiveIndex2 = (electiveIndex1 + 1) % (courseOffers.size() - 1) + 1;

            SeatAssignment seat2 = courseLoad.registerStudentInClass(courseOffers.get(electiveIndex1));
            if (seat2 != null) {
                seat2.setGrade(generateGrade(random));
                System.out.println("Registered " + student.getPerson().getName() + " in " + courseOffers.get(electiveIndex1).getCourse().getCourseName());
            }

            SeatAssignment seat3 = courseLoad.registerStudentInClass(courseOffers.get(electiveIndex2));
            if (seat3 != null) {
                seat3.setGrade(generateGrade(random));
                System.out.println("Registered " + student.getPerson().getName() + " in " + courseOffers.get(electiveIndex2).getCourse().getCourseName());
            }

            // Half of the students take an extra elective
            if (students.indexOf(student) % 2 == 0) {
                SeatAssignment seat4 = courseLoad.registerStudentInClass(courseOffers.get(3));
                if (seat4 != null) {
                    seat4.setGrade(generateGrade(random));
                    System.out.println("Registered " + student.getPerson().getName() + " in " + courseOffers.get(3).getCourse().getCourseName());
                }
            }
        }
    }

    // Display all courses in the catalog
    private static void displayCourses(CourseCatalog courseCatalog) {
        for (Course course : courseCatalog.getCourseList()) {
            System.out.println("Course Number: " + course.getCourseNumber()
                    + ", Name: " + course.getCourseName()
                    + ", Credits: " + course.getCredits());
        }
    }

    // Display course schedule with assigned professors
    private static void displayCourseSchedule(CourseSchedule courseSchedule) {
        for (CourseOffer courseOffer : courseSchedule.getSchedule()) {
            if (courseOffer != null) {
                System.out.printf("Course: %s, Name: %s, Faculty: %s\n",
                        courseOffer.getCourse().getCourseNumber(),
                        courseOffer.getCourse().getCourseName(),
                        courseOffer.getFacultyName());
            }
        }
    }

    // Display student course registrations
    private static void displayStudentRegistrations(ArrayList<StudentProfile> students) {
        for (StudentProfile student : students) {
            System.out.println("Student ID: " + student.getPerson().getId()
                    + ", Name: " + student.getPerson().getName());

            CourseLoad courseLoad = student.getCourseLoadBySemester("Fall2024");
            if (courseLoad != null) {
                System.out.println("Registered Courses for Fall2024:");
                for (SeatAssignment sa : courseLoad.getSeatAssignments()) {
                    CourseOffer courseOffer = sa.getSeat().getCourseOffer();
                    System.out.printf(" - Course: %s, Name: %s, Faculty: %s",
                            courseOffer.getCourse().getCourseNumber(),
                            courseOffer.getCourse().getCourseName(),
                            courseOffer.getFacultyName());
                            //.getGrade());
                }
            } else {
                System.out.println("No courses registered.");
            }
            System.out.println();
        }
    }

    // Print a detailed semester report for a student
    private static void printSemesterReport(StudentProfile student, String semester) {
        System.out.println("Student ID: " + student.getPerson().getId()
                + ", Name: " + student.getPerson().getName());

        CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
        if (courseLoad != null) {
            ArrayList<SeatAssignment> seats = courseLoad.getSeatAssignments();
            int totalCredits = 0;
            int totalCost = 0;
            float totalGPA = 0;
            int numCourses = 0;

            System.out.println("Courses Registered:");
            for (SeatAssignment seat : seats) {
                CourseOffer offer = seat.getCourseOffer();
                Course course = offer.getCourse();
                String grade = seat.getGrade();
                float gpa = mapGradeToGPA(grade);

                totalCredits += course.getCredits();
                totalCost += course.getCoursePrice();
                totalGPA += gpa;
                numCourses++;

                System.out.printf("  - Course: %s,Name: %s, Credits: %d, Faculty: %s, Grade: %s, GPA: %.2f\n",
                        course.getCourseNumber(),
                        course.getCourseName(), 
                        course.getCredits(),
                        offer.getFacultyName(),
                        grade,
                        gpa);
            }

            float avgGPA = numCourses > 0 ? totalGPA / numCourses : 0;
            System.out.println("Total Credits: " + totalCredits);
            System.out.println("Total Tuition Fees: $" + totalCost);
            System.out.printf("Average GPA: %.2f\n", avgGPA);
            System.out.println("--------------------\n");
        } else {
            System.out.println("No courses registered for this semester.\n");
        }
    }

    // Generate a random grade for a student
    private static String generateGrade(Random random) {
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
        return grades[random.nextInt(grades.length)];
    }

    // Map a letter grade to its GPA value
    private static float mapGradeToGPA(String grade) {
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

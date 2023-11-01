package ie.atu;

import java.util.Scanner;

/*This is a method; it defines the behaviour of the class
 and prints out the information about the students*/
public class StudentApp {
    private String name;
    private String email;
    private String course;

    //Constructor - initializes the state of name, email and course
    public StudentApp(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    /*'Setters' and 'getters' are used to allow the user to input
    * information, while the getters are used to call the data to
    * display the info that has been previously set*/
    public StudentApp(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


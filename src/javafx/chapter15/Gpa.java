/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eyas
 */
public class Gpa {
    
    private final List<Course> courses = new ArrayList<>();

    public Gpa(Course... courses) {
        this.courses.addAll(Arrays.asList(courses));
    }
    
    public void addCourse(Course course){
        this.courses.add(course);
    }
    
    public double getGpa(){
        double gpa = 0;
        double hours = 0;
        for(Course course: courses){
            gpa += course.getGrade() * course.getHours();
            hours += course.getHours();
        }
        if(hours == 0){
            return 0;
        }
        gpa /= hours;
        return gpa;
    }
    
}

package Uni;

import java.util.Objects;

public class Course {
    String courseName;
    int finalGrade;

    public Course(String courseName, int finalGrade) {
        this.courseName = courseName;
        this.finalGrade = finalGrade;
    }

    public Course(Course courseToCopy) {
        this.courseName = courseToCopy.courseName;
        this.finalGrade = courseToCopy.finalGrade;
    }

    @Override
    public String toString() {
        return "Course name: " + courseName + " and the final grade is: " + finalGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseName.equals(course.courseName);
    }

}

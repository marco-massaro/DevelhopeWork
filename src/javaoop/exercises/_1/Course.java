package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int courseAge;
    int maxStudents;
    int qualityRatingOutOf10;
    String tutorName;
    int monthsOfCourse;
    List<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", maxStudents=" + maxStudents +
                ", courseAge=" + courseAge +
                ", qualityRatingOutOf10=" + qualityRatingOutOf10 +
                ", tutorName='" + tutorName + '\'' +
                ", monthsOfCourse=" + monthsOfCourse +
                ", students=" + students +
                '}';
    }
}

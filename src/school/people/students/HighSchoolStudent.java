package school.people.students;

import school.subjects.Grade;

import java.io.File;

public class HighSchoolStudent extends Student{
    public HighSchoolStudent(String name, String lastName, int age, double averageRating) {
        super(name, lastName, age, averageRating, Grade.HIGH_SCHOOL,new File("src//school//files//", "high_school_student.txt"));
    }
}

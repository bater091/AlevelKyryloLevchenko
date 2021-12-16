package com.levchenko.hw16;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Students {
    private String name;
    private int group, course, rating;

    public Students(String name, int group, int course, int rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }


}

class StudentsAction {
    public static void removeBadStudents(List<Students> list) {
        list.removeIf(students -> students.getRating() < 3);

    }

    public static void pushNextCourse(List<Students> list) {
        for (Students students : list) {
            if (students.getRating() >= 3) {
                students.setCourse(students.getCourse() + 1);
            }

        }
        list.removeIf(students -> students.getCourse() == 6);
    }

    public static void printStudents(List<Students> list, int course) {
        for (Students students : list) {
            if (students.getCourse() == course) {
                System.out.println(students.getName());
            }
        }
    }
}


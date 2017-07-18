package app.tt;

import app.tt.Parts.Lesson;
import app.tt.Parts.Teacher;
import app.tt.Parts.Time;
import app.tt.Ranking.TeacherRanker;
import app.tt.Ranking.TimeRanker;

import java.util.List;
import java.util.Set;

/**
 * Created by daszabo on 2017.07.10..
 */
public class Structure {
    private static Set<Teacher> allTeachers;
    private static Set<Lesson> allLessons;

    public static void addTeacher(Teacher t) {
        allTeachers.add(t);
    }

    public static void addLesson(Lesson l) {
        allLessons.add(l);
    }

    public static Set<Teacher> getAllTeachers() {
        return allTeachers;
    }

    public static Set<Lesson> getAllLessons() {
        return allLessons;
    }

    public static void printLessons() {
        for (Lesson l : getAllLessons()) {
            System.out.println(l.toString());
        }
    }

    public static void printSortedLessons() {
        List<Time> l = TimeRanker.sort();
        System.out.println(l.toString());
    }

    public static void printTeachers() {
        for (Teacher t : getAllTeachers()) {
            System.out.println(t.toString());
        }
    }

    public static void printSortedTeachers() {
        List<Teacher> l = TeacherRanker.sort();
        System.out.println(l);
    }
}

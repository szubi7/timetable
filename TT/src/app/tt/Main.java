package app.tt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Osszes ora:");
        Structure.printLessons();

        System.out.println("Rendezett orak:");
        Structure.printSortedLessons();

        System.out.println("Osszes tanar:");
        Structure.printTeachers();

        System.out.println("Rendezett tanarok:");
        Structure.printSortedTeachers();
    }
}

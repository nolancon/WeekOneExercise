import java.util.Scanner;

public class WeekOneExercise {
    public static void main(String[] args) {
        if (didOswaldActAlone()){
            System.out.println("Oswald acted alone.");
        }else {
            System.out.println("Oswald did not act alone.");
        }

        WeekOneExercise weekOneExercise = new WeekOneExercise();
        if (weekOneExercise.wasOjGuilty()){
            System.out.println("OJ was guilty.");
        }else {
            System.out.println("OJ was innocent.");
        }

        System.out.println(filmRating(favouriteFilm()));
    }
    private static boolean didOswaldActAlone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Did Oswald act alone?");
        return sc.nextBoolean();
    }

    private boolean wasOjGuilty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Was OJ guilty?");
        return sc.nextBoolean();
    }

    private static String favouriteFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name your favourite film.");
        return sc.next();
    }

    private static String filmRating(String filmName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter film rating:");
        return filmName + " Rating: " + sc.next();
    }
}
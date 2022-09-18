import java.util.Scanner;

public class WeekOneExercise {
    static Scanner sc = new Scanner(System.in);
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

        String favouriteFilm = favouriteFilm();
        System.out.println(favouriteFilm +" is rated: " + filmRating(favouriteFilm));
    }
    public static boolean didOswaldActAlone() {
        System.out.println("Did Oswald act alone?");
        return sc.nextBoolean();
    }

    public boolean wasOjGuilty() {
        System.out.println("Was OJ guilty?");
        return sc.nextBoolean();
    }

    public static String favouriteFilm() {
        System.out.println("Name your favourite film:");
        return sc.next();
    }

    public static int filmRating(String filmName) {
        System.out.println("Enter film rating:");
        return sc.nextInt();
    }
}
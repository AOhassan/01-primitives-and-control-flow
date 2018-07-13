public class Pluralize {
    public static void pluralize(String animal, int count) {

        String plural;

        if (count != 1) {
            plural = ".";
        }
        else {
            plural = "'s";

            System.out.println("I own " + count + " " + animal + plural );
        }
    }
}

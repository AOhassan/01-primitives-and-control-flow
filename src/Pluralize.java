public class Pluralize {
    public static void main(String[] args) {
        pluralize("dog",3);
        pluralize("dog", 1);
    }
    public static void pluralize(String animal, int count) {

        String plural;

        if (count != 1) {
            plural = "s";
        }
        else {
            plural = ".";
        }
        System.out.println("I own " + count + " " + animal + plural );
    }
}

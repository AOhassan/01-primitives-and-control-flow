public class pluralize {
    public static void main(String[] args) {

        String animal;
        int count;

        animal = "turtle";
        count = 2;

        //animal = "turtle";
        //count = 1;

        //animal = "turtle";
        //count = 0;

        if(count == 0 || count > 1) {

            System.out.println("I own " + count + " " + animal + "'s");
        } else {
            System.out.println("I own " + count + " " + animal);
        }
    }
}

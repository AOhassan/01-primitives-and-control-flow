public class FlipNHeads {
    public static void flipNHeads(int n) {

        int flips = 0;
        int heads = 0;

        do {
            if (Math.random() >= .5) {
                System.out.println("tails");
                heads++;
            }
            else {
                System.out.println("heads");
                heads = 0;
            }
            flips++;
        }

        while (heads != n) {

            if (heads <= 1) {
                System.out.println("It took " + flips + " flips to flip " + n + " head in a row");
            }
            else {
                System.out.println("It took " + flips + " flips to flip " + n + " heads in a row");
            }
        }
    }
}
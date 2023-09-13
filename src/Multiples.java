public class Multiples {

    public static void main(String[] args) {
        int val = 0;

        for (int i = 1; i < 1000; i++) {

            // Print our appropriate result.
            if (i % 3 == 0 || i % 5 == 0) {
                val += 1;

            }

        }
        System.out.println(val);
    }
}
package javacalss_19_12_18;

public class Q2_for_loop {

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i == 5 || i == 10 || i == 15) {
                continue;
            }
            System.out.println(i);
        }
    }
}

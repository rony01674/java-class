package javacalss_19_12_18;

public class Q3_do_while_loop {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}

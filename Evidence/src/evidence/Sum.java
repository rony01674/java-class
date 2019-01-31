package evidence;

public class Sum {

    public static void main(String[] args) {
        int num = 200;
        int sum = 0;
        while (true) {
            if (sum > 500) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
    }
}

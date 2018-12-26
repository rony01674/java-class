
public class Page180 {

    public static void main(String[] args) {
        System.out.println(findOutGCD(1, 23));
    }

    public static int findOutGCD(int n1, int n2) {
        int gcd = 1; //initial GD
        int possibleGCD = 2;

        while (possibleGCD <= n1 && possibleGCD <= n2) {
            if (n1 % possibleGCD == 0 && n2 % possibleGCD == 0) {
                gcd = possibleGCD;
            }
            possibleGCD++;
        }

        return gcd;
    }
}

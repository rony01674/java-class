package javaclass_09_01_19;

public class TotalArea_Page352 {

    /**
     * MAIN METHOD
     */
    public static void main(String[] args) {
        //declare circleArray
        CircleWithPrivateDataFields[] circleArray;

        // create circleArray
        circleArray = createCircleArray();
        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /**
     * create an array of circle objects
     */
    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            CircleWithPrivateDataFields(Math.random() * 100);
        }
        //return circle array
        return circleArray;
    }

    /**
     * print an array of circles and their total area
     */
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("---------------------------------------------------");

        //compute adn display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }

    /**
     * add circle areas
     */
    public static double sum(CircleWithPrivateDataFields[] circleArray) {
        //initialize sum
        double sum = 0;

        //add radius to sum
        for (int i = 0; circleArray.length < 10; i++) {
            sum += circleArray[i].getArea();

        }
        return sum;
    }

    private static void CircleWithPrivateDataFields(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

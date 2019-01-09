package javaclass_07_01_19;

public class SelectionSort_Page270 {

    public static void main(String[] args) {
        int[] list = {5, 26, 7, 1, 2, 584, 3, 35, 64};
        for (int d : SelectionSort(list)) {
            System.out.println(d + ", ");
        }
    }

    public static int[] SelectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // find the maximum in the list[i...list.length - 1]
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // swap list[i] with list[currenMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}

package gr.aueb.cf.exercises.week5;

/**
 * Αναπτύξτε ένα πρόγραμμα που βρίσκει το
 * 2ο μικρότερο στοιχείο ενός πίνακα, το
 * στοιχείο δηλαδή που είναι αμέσως
 * μεγαλύτερο από το ελάχιστο στοιχείο
 */
public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 3, 12, 14, -1, 2, 4};
        int secMinPoint = -1;

        secMinPoint = getMinPosition(arr);
        if (secMinPoint != -1) {
            System.out.println("The second minimum element is: " + arr[secMinPoint]);
        } else {
            System.out.println("Error in procedure");
        }
    }

    public static int getMinPosition(int[] arr){
        if (arr == null) return -1;

        int point1 = -1;
        int point2 = -1;
        int min1 = arr[0];
        int min2 = arr[1];

        if (min1 < min2 ){
            point1 = 0;
            point2 = 1;
        }else{
            point1 = 1;
            point2 = 0;
        }
        // int[] arr = {1, 8, 5, 3, 12, 14, -1, 2, 4}; try array
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]< arr[point2]){
                point2 = i;
                if (arr[i]< arr[point1]){
                    point2 = point1;
                    point1 = i;
                }
            }


        }
        return point2;
    }
}

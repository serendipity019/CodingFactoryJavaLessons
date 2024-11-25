package gr.aueb.cf.exercises.week5;

/**
 * Αναπτύξτε μία γενική μέθοδο εύρεσης του
 * μέγιστου ενός πίνακα getMaxPosition (int[]
 * arr, int low, int high) που επιστρέφει τη
 * θέση στον πίνακα arr του μέγιστου
 * στοιχείου του πίνακα
 */
public class GetMaxPosition {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 12, 14, 5, 2, 4};
        int maxPoint = -1;

        maxPoint = getMaxPosition(arr, 2, 8);
        if (maxPoint != -1) {
            System.out.println("The maximum element is on position: " + (maxPoint + 1));
        } else {
            System.out.println("Error in procedure");
        }
    }

    public static int getMaxPosition(int[] arr, int low, int high){
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int point = -1;
        int max = arr[low];
        for (int i = low+1; i < high; i++) {
          if (arr[i]> max ){
              max = arr[i];
              point = i;
          }
        }
        return point;
    }
}

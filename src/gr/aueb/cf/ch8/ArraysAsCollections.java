package gr.aueb.cf.ch8;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 5 ,7, 9};
        int[] arr2 = new int[4];
        int sum = 0;
        double avg = 0.0;

        arr2 = mapToDouble(arr);
        sum = sum(arr);
        avg = avg(arr);

        System.out.println("The average is: " + avg);
    }
        // filtering
    public static int[] getEvents(int[] arr){
        int count = 0;

        for( int el : arr){
            if(el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot =0;
        for (int el : arr){
            if (el % 2 == 0){
                evens[pivot++] = el;
               // pivot++; επειδή βαλαμε πάνω ++ δεν χρειάζετε να κάνουμε την προσθεση εδώ
                // πρώτα καταχωρείτε στο 0 και μετα γίνεται 1. κ.ο.κ
            }
        }
        return evens;
    }

        // mapping
    public static int[] mapToDouble(int[] arr){
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){

            arr2[i] = arr[i] * 2;
        }
        return arr2;
    }
        // producing
    public static int sum(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){

            sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr){
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++){

            avg += arr[i];
        }
        return (avg / arr.length) ;
    }

    public  static boolean anyEven(int[] arr){
        boolean isAnyEven = false;

        for (int el : arr){
            if (el % 2 == 0){
            isAnyEven = true;
            break;
            }
        }
        return  isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr){

        return  getEvents(arr).length > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.lenght -2; i++){
            if( arr[i] == arr[i + 1] - 1 && arr[i] == arr[i+2] - 2){
                count++;
                break;
            }
        }
        return count >= 1 ;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr){
            endings[num % 10]++;
        }

        for (int count : endings){
            if (count >= 3){
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr){
        boolean isAllEven = true;

        for( int el : arr){
            if(el % 2 != 0) {
                isAllEven = false;
                break;
            }
        }

        return  isAllEven;
    }
}

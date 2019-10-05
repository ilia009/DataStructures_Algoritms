package SortingAlgorithms;

/**
 * Created by Admin on 14.08.2019.
 */
public class InsertionSortRecurtion {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        //growing the sorted partition by one
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];


            //loking for right position for each EL and do shifting
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;

        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
    public void insertRecSort(int input[]){



    }
}

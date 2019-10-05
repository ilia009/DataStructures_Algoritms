package HomeWork;

/**
 * Created by Admin on 26.08.2019.
 */
public class Sorts {

    public static void main(String[] args) {

        int[] arr = {2, 1, 6, 2, 4, 2, 1, 0};


        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        quickSort(arr,0, arr.length);

        System.out.println();
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void  quickSort(int [] input, int start, int end){

        if(end-start <2){
            return;
        }

        int pivot = partition(input,start,end);
        quickSort(input,start,pivot);
        quickSort(input,pivot+1, end);

    }

  public static int partition(int[]input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j= end;

        while (i<j){
            while (i<j && input[--j] >= pivot);
            if (i < j) {

                input[i] = input[j];
            }



            while (i<j && input[++i] <=pivot);
            if(i<j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

  }
}
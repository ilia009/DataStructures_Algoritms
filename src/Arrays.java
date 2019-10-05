/**
 * Created by Admin on 05.08.2019.
 */
public class Arrays {

    public static void main(String[] args) {
        int arr[] = new int[7];

        arr[0] = 13;
        arr[1] = 2;
        arr[2] = 31;
        arr[3] = -4;
        arr[4] = 52;
        arr[5] = -6;
        arr[6] = 7;


        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        bubleSort(arr);
        System.out.println("Sotred array");

        for(int i = 0; i<arr.length; i++){

            System.out.println(arr[i]);
        }

    }

    public static int[] bubleSort(int[] arrSort){

        for(int i=0;i<arrSort.length; i++){
            for (int j=i+1; j<arrSort.length; j++ ){

                if(arrSort[i]>arrSort[j]){
                 int t= arrSort[j];
                 arrSort[j] = arrSort[i];
                 arrSort[i] =t;
                }
            }

            return arrSort;
        }


        return arrSort;
    }
}

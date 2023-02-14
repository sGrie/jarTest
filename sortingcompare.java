import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;



class MergeSort{
    void merge(int arr[], int beg, int mid, int end){

        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for(int i = 0; i < n1; ++i){
            leftArray[i] = arr[beg + i];
        }
        for(int j = 0; j < n2; ++j){
            rightArray[j] = arr[mid + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = beg;

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                ++j;
            }
            ++k;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            ++i;
            ++k;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }


    }

    void sort(int arr[], int beg, int end){
        if(beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }
}
public class sortingcompare {

    public static int[] createRandomArray(int arrayLength){
        Random rand = new Random();
        int arr[] = new int[arrayLength];

        for(int i = 0; i < arrayLength; ++i){
            arr[i] = rand.nextInt(10000);
        }

        return arr;
    }

    static void bubble(int nums[]){
        int placeHold;
        int length = nums.length;
        for(int x = 0; x < length - 1; x++){
            for(int y = 0; y < length - 1 - x; y++){
                if (nums[y] > nums[y + 1]){
                    placeHold = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = placeHold;
                }
            }
        }
    }

    


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("How long should the array be?  ");
        int length = scnr.nextInt();
        int myArray[] = createRandomArray(length);
        int myArray2[] = myArray;

        long start = System.currentTimeMillis();

        bubble(myArray2);
        System.out.println(Arrays.toString(myArray2));
        
        long end = System.currentTimeMillis() - start;
        

        System.out.println("\n\n\n\n\n\n\n\n");

        long start2 = System.currentTimeMillis();

        //System.out.println(Arrays.toString(myArray));
        MergeSort x = new MergeSort();
        x.sort(myArray, 0, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));

        long end2 = System.currentTimeMillis() - start2;

        System.out.println("\nTotal runtime for bubble sort " + (end) + "ms");
        System.out.println("Total runtime for merge sort " + end2 + "ms");
        
    }
}


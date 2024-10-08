import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x: arr){
            System.out.print(x + " | ");
        }
        System.out.println();
        insertionSort(arr);
        
        for(int x: arr){
            System.out.print(x + " | ");
        }
        sc.close();
    }

    public static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
    }
}

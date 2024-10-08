import java.util.*;

public class BubbleSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        String order = sc.nextLine();        
        
        for(int x: arr){
            System.out.print(x + " | ");
        }
        System.out.println("");
        bubbleSort(arr, order);

        for(int x: arr){
            System.out.print(x + " | ");
        }
        sc.close();
    }

    public static void bubbleSort(int[] arr, String order){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                Boolean condition = arr[j] > arr[j+1];
                if(order.equalsIgnoreCase("desc")) 
                    condition = !condition; 

                if(condition){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}


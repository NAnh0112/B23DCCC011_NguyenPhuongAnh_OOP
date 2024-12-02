package Main1;
import java.util.Scanner;
public class SXep_Bot_Noi {
	  
	    private static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false; 
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true; 
	                }
	            }
	            if (swapped) {
	                System.out.print("Buoc " + (i + 1) + ": ");
	                for (int k = 0; k < arr.length; k++) {
	                    System.out.print(arr[k] + " ");
	                }
	                System.out.println(); 
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = sc.nextInt();
	        }
	        bubbleSort(arr);
	    }

	}


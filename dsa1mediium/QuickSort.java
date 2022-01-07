package dsa1mediium;

import java.util.Arrays;

public class QuickSort {
  
	public static int[] quicksort(int[] arr,int n) {
		if(n<2) {
			return arr;
		}
	int idx = 0;
	int pivot = arr[0];
	for(int i=1;i<n;i++) {
		if(arr[i]<arr[0]) {
			idx++;
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	int temp = arr[idx];
	arr[idx]= arr[0];
	arr[0] = temp;
	
	int[] leftarr = quicksort(arr,idx);
	int[] rightpart = new int[n-1-idx];
	for(int i=0;i<rightpart.length;i++) {
		rightpart[i]=arr[idx+1+i];
	}
	int rightarr[] = quicksort(rightpart,n-1-idx);
	int[] finalarray = new int[n];
	int i=0;
	for(i=0;i<idx;i++) {
		finalarray[i]=leftarr[i];
	}
	finalarray[idx]=arr[idx];
    for(i=idx+1;i<n;i++) {
    	finalarray[i]=rightarr[i-(idx+1)];
    }
	return finalarray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {4,3,7,2,9,1,8};

System.out.println(Arrays.toString(quicksort(arr,arr.length)));
	}

}

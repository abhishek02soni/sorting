package dsa1mediium;

import java.util.Arrays;

public class MergeSort {

public static void merge(int [] arr, int left, int mid, int right) {
	int len1=mid-left+1;
	int len2=right-mid;
	int[] leftarr = new int[len1];
	int[] rightarr = new int[len2];
	
	for(int i=left,j=0;i<=mid;i++,j++) {
		leftarr[j] = arr[i];
	}
	for(int i=mid+1,j=0;i<=right;i++,j++) {
		rightarr[j]=arr[i];
	}
int i=0,j=0;
int k=left;

while(i<leftarr.length && j<rightarr.length) {
	if(leftarr[i]<rightarr[j]) {
		arr[k]=leftarr[i];
		i++;
	}
	else {
		arr[k] = rightarr[j];
		j++;
	}
 k++;
}
if(i!=leftarr.length) {
 while(i<leftarr.length) {
	 arr[k]=leftarr[i];
	 k++;i++;
 }
}
else {
	while(j<rightarr.length) {
		arr[k++]=rightarr[j++];
	}
}
}
public static void mergesort(int[] arr, int left,int right) {
	if(left<right) {
		int mid =(left + right)/2;
	mergesort(arr,left,mid);
	mergesort(arr,mid+1,right);
	merge(arr,left,mid,right);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr1 = {11,2,4,5,10,7,8};
	System.out.println(Arrays.toString(arr1));
	mergesort(arr1,0,arr1.length-1);
	System.out.println(Arrays.toString(arr1));
	}

}

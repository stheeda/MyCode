package com.Java.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {7, 2, 1, 0, 6, 5, 4, 8};
		int n = a.length;
		
		for (int i=0;i<n-1;i++) {
			
			int minInd = i;
			
			for (int j=i;j<n;j++) {
				
				if(a[j] < a[minInd]) {
					minInd = j; //logic
				}
			}
			int temp = a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		for (int e: a) {
			System.out.print(e+","+" ");
		}

	}

}

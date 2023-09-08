package com.java.array;

public class MergingArray {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,0};
		int a=arr1.length;
		int b=arr2.length;
		int[] arr=new int[a+b];
		
		for(int j=0;j<a;j++) {
			arr[j]=arr1[j];
		}
		for(int k=0;k<b;k++) {
			arr[k+a]=arr2[k];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

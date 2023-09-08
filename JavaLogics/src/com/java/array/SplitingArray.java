package com.java.array;

public class SplitingArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		
		int[] arr1=new int[arr.length/2];
		int[] arr2=new int[arr.length-arr1.length];
		
		for(int i=0;i<arr.length;i++) {
			if(i<arr1.length) {
				arr1[i]=arr[i];
			}
			else {
				arr2[i-arr1.length]=arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}

package com.java.array;

public class DistinctArray {
	public static void main(String[] args) {
		int[] arr= {3,6,5,9,3,4,5,3};
		
		for(int i=0;i<arr.length;i++) {
			boolean isDistinct=true;
			for(int j=0;j<arr.length;j++) {
				if(i!=j&&arr[i]==arr[j]) {
					isDistinct=false;
					break;
				}
			}
			if(isDistinct==true) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}

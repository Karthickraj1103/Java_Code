package com.java.array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr= {34,2,30,6,81,34,6};
		
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate=true;
				}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}

package com.java.array;

public class LargestValue {
	public static void main(String[] args) {
		int[] arr = {54,546,548,60};
		String output=largestNumber(arr);
		System.out.println(output);
	}
	
	public static String largestNumber(int[] arr){
		String[] num=new String[arr.length];
		
		//converting integer to string
		for(int i=0;i<num.length;i++) {
			num[i]=String.valueOf(arr[i]);
		}
		//comparing two values & sorting them
		for(int i=0;i<num.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<num.length-i-1;j++) {
				String num1=num[j]+num[j+1];
				String num2=num[j+1]+num[j];
				if(num2.compareTo(num1)>0) {
					String temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					swapped=true;
				}
				
			}
			if(!swapped) {
				break;
			}
		}
		
		// first is 0 it will return 0
		if(num[0].charAt(0)=='0') {
			return "0";
		}
		
		//returning output
		String result="";
		for(String nums:num) {
			result=result+nums;
		}
		
		return result;
		
	}
}

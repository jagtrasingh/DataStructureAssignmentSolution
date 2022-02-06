package com.gl.driver;

import java.util.Scanner;

public class SkyScraper {
	static int printFloor(int[] sortedArray, int start, int end) {
		System.out.println("Day: " + (end));
		for(int i = start; i < end; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		System.out.println("");
		return end;
	}

	static int[] bubbleSortExample(int sortedArray[]) {
		int num, i, j, temp;
		num = sortedArray.length;
		for (i = 0; i < ( num - 1 ); i++) {
			for (j = 0; j < num - i - 1; j++) {
				if (sortedArray[j] < sortedArray[j+1]) 
				{
					temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
			}
		}

		return sortedArray;
	}

	public static void main(String[] args) {
		int noOfFloor;
		int iHead = 0;
		System.out.println("Enter the total no of floors in the building");
		Scanner sc = new Scanner(System.in);
		noOfFloor = sc.nextInt();
		
		int floorArray[] = new int[noOfFloor];
		int sortedArray[] = new int[noOfFloor];
		
		
		for (int i = 0; i < noOfFloor; i++) {
			System.out.println("Enter the floor size given on day :" + (i + 1));
			floorArray[i] = sc.nextInt();
			sortedArray[i] = floorArray[i];
		}
		sortedArray = bubbleSortExample(sortedArray);
		System.out.println("The order of construction is as follows");

		for (int i = 0; i < noOfFloor; i++) {
			if(floorArray[i] == sortedArray[iHead]) {
				iHead = printFloor(sortedArray,iHead,(i+1));
			}else {
				System.out.println("Day: " + (i + 1));
				System.out.println("");
			}
		}
	}
}

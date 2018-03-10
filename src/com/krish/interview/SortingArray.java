package com.krish.interview;

public class SortingArray {

	public static void main(String[] args) {

		int[] a = { 23, 1, 34, 5, 6, 78, 41, 34, 67, 345 };
		int temp;
		long startloop = System.nanoTime();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Time for loop : " + (System.nanoTime() - startloop));

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr = { 23, 1, 34, 5, 6, 78, 41, 34, 67, 345 };
		int n = arr.length;
		long buble = System.nanoTime();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Time Buuble loop  : " + (System.nanoTime() - buble));

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arrs = { 23, 1, 34, 5, 6, 78, 41, 34, 67, 345 };
		long selection = System.nanoTime();
		for (int i = 0; i < arrs.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arrs.length; j++) {
				if (arrs[j] < arrs[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arrs[index];
			arrs[index] = arrs[i];
			arrs[i] = smallerNumber;
		}
		System.out.println("Time Selection loop  : " + (System.nanoTime() - selection));

		for (int i : arrs) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] array_insertion = { 23, 1, 34, 5, 6, 78, 41, 34, 67, 345 };
		int n_insertion = array_insertion.length;
		long insertion = System.nanoTime();
		for (int j = 1; j < n_insertion; j++) {
			int key = array_insertion[j];
			int i = j - 1;
			while ((i > -1) && (array_insertion[i] > key)) {
				array_insertion[i + 1] = array_insertion[i];
				i--;
			}
			array_insertion[i + 1] = key;
		}
		System.out.println("Time Inertion loop : " + (System.nanoTime() - insertion));

		for (int i : array_insertion) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}

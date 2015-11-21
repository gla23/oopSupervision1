package uk.ac.cam.gla23.oopjava.supervision1;

import java.util.Arrays;

public class Supervision1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 1
		// Data is immutable in functional languages
		// something is always returned in functional languages
		// for functional, a expression is continually evaluated untli a single
		// value remains, whereas
		// imperative executes code line by line until it reaches the end of the
		// program.

		// 2
		// Primitive
		int three = 3;
		// Reference
		three = 4; // three is the reference to the memory location storing 3
		// Class/Object
		Supervision1 classExample = new Supervision1();
		// Instantiates the class Supervision1 into an object, stored with a
		// reference classExample

		// 4
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(sum(arr));
		int[] arr1 = { 1, -2, 3, 4, -5 };
		System.out.println(Arrays.toString(positives(arr1)));
		faultyCode();
		
		// 7 and 8 in ListMain and LinkedList classes
		
		// 9
		// stack is a last in first out data structure. You can push a value on top of it, 
		// or pop to return the top value and remove it from the stack.
		// 10
		Stack s = new Stack(100);
		s.push(3);
		s.push(2);
		s.push(2);
		int a = s.pop();
		a = s.pop();
		a = s.pop();
	}

	static int sum(int[] a) {
		int summ = 0;
		for (int i = 0; i < a.length; i++) {
			summ += a[i];
		}
		return summ;
	}

	static int[] positives(int[] a) {

		int l = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				l += 1;
			}
		}
		int[] summ = new int[l];

		l = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				summ[l] = a[i];
				l += 1;
			}
		}
		return summ;
	}

	// 5
	static float[][] aofa(int n) {
		float[][] k = new float[n][n];
		return k;
	}

	// 6
	// it changes the values that are copied into the function when it is
	// called, so it doesn't actually change the values. Use an array as that can be passed as a reference
	public static void vectorAdd(int[] x, int[] y, int dx, int dy) {
		x[0] = x[0] + dx;
		y[0] = y[0] + dy;
	}

	static void faultyCode() {
		int[] a = {0};
		int[] b = {2};
		vectorAdd(a, b, 1, 1);
		System.out.println(a[0] + " " + b[0]);// (a,b) is still (0,2)
	}
	
	
}

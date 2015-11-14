package uk.ac.cam.gla23.oopjava.supervisions;

public class Stack {
	private int size;
	private int pointer = -1;
	private int[] stk;
	
	public Stack(int s) {
		size = s;
		stk = new int[s];
	}
	public int pop() {
		//if (pointer >= 0) {
			pointer -= 1;
			return stk[pointer+1];
		//}
	}
	public void push(int a) {
		pointer += 1;
		stk[pointer] = a;
	}
}
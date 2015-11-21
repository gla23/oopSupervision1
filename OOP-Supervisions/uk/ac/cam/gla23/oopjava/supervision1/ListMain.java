package uk.ac.cam.gla23.oopjava.supervision1;

// 7
public class ListMain {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.setHead(1);
		LinkedList b = new LinkedList();
		b.setHead(2);
		LinkedList c = new LinkedList();
		c.setHead(3);

		b.setTail(c);
		a.setTail(b);
		// [1,2,3]
		System.out.println(nth(0, a));
		System.out.println(nth(1, a));
		System.out.println(nth(2, a));
		System.out.println(lth(a));
		System.out.println(lth(b));
		System.out.println(cycles(a));
		c.setTail(a);
		System.out.println(cycles(a));
	}

	public static int nth(int n, LinkedList l) {
		LinkedList cur = l;
		for (int i = 0; i <= n - 1; i++) {
			cur = cur.getTail();
		}
		return cur.getHead();
	}

	public static int lth(LinkedList l) {
		LinkedList cur = l;
		int i = 0;
		while (true) {
			if (cur == null) {
				return i;
			}
			cur = cur.getTail();
			i += 1;
		}

	}
	
	// 8
	public static boolean cycles(LinkedList l) {
		LinkedList cur = l;
		LinkedList[] met = new LinkedList[100];
		
		for (int i = 0; true; i++) {
			met[i] = cur;
			for (int j = 0; j < i; j++) {
				if (cur == met[j]){
					return true;
				}
			}
			cur = cur.getTail();
			if (cur == null) {
				return false;
			}
		}
		
	}
}

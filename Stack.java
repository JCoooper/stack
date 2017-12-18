/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one integer
 * parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any of the
 * data structures we have already studied (arrays, ArrayLists, linked lists,
 * binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	private String[] stack;
	private int top;

	/*
	 * This is the constructor for the Stack class. Notice there is one integer
	 * parameter (the size of the stack).
	 */
	public Stack(int size) {
		String[] arr = new String[size];
		stack = arr;
		this.top = size;
	}

	@Override
	public boolean push(String record) {
		int counter = 0;
		int x = 0;
		boolean bot = false;
		while (x == 0 && counter < top) {
			if (stack[counter] == null) {
				stack[counter] = record;
				x++;
				bot = true;
			} else {
				counter++;
			}
		}
		if (x == 0 && counter == top) {
			bot = false;
		}
		return bot;
	}

	

	@Override
	public String pop() {
		int counter = 0;
		int num = top - 1;
		String n = null;
		while (num == 0 && num >= 0) {
			if (stack[num] != null) {
				n = stack[num];
				stack[num] = null;
				num++;
			} else {
				num--;
			}
		}
		return n;
	}

	@Override
	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			if (stack[i] != null) {
				System.out.println(stack[i]);
			}
		}
	}

	/*
	 * Implement the other methods specified in the interface below.
	 */

}

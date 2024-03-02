package dsa.gradedproject.question1;

import java.util.*;

public class SkyScraperBuilding {

	Stack<Integer> newStack = new Stack<>();
	Stack<Integer> dummyStack = new Stack<>();

	static int dayCount;

	public void assembleFloor(List<Integer> floors) {

		List<Integer> newList = new ArrayList<Integer>();

		for (int i = 0; i < floors.size(); i++) {
			newList.add(floors.get(i));
		}

		newList.sort(null);

		for (int i : newList) {
			newStack.push(i);
		}

		System.out.println("\nThe Order of construction is as follows\n");

		for (int j : floors) {
			System.out.println("Day: " + (++dayCount));

			if (j != newStack.peek()) {
				dummyStack.push(j);
				dummyStack.sort(null);
			} else {
				System.out.print(newStack.pop() + " ");

				while (!dummyStack.isEmpty() && dummyStack.peek().equals(newStack.peek())) {
					dummyStack.pop();
					System.out.print(newStack.pop() + " ");

				}
			}

			System.out.println();
		}
	}

}

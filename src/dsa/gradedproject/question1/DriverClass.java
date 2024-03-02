package dsa.gradedproject.question1;

import java.util.*;

public class DriverClass {

	public static void main(String[] args) {

		List<Integer> floors = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		SkyScraperBuilding skyScraperBuilding = new SkyScraperBuilding();

		System.out.println("Enter the total no of floors in the building");
		int floorsCount = scanner.nextInt();

		for (int i = 0; i < floorsCount; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			floors.add(scanner.nextInt());
		}

		skyScraperBuilding.assembleFloor(floors);

		scanner.close();
	}

}

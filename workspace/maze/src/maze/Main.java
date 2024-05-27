package maze;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Maze m = new Maze();
		Location lc = new Location();
		int roadCount = 0;
		String direction;
		do {
			direction = lc.findDirection(m.getMaze(););
			if (lc.getRoadCount() == 1) {
				lc.setRoadCount(0);
				lc.Move(direction);
			}if (lc.getRoadCount() == 0) {
				maze[lc.getLoR()][lc.getLoC()] = 0;
			}if (lc.getRoadCount()>1) {
				
			}
		} while (lc.getLoR() != maze.length && lc.getLoC() != maze[0].length);
	}

}

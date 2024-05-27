package maze;

public class Location {
	private int loR = 0; // 현재 로우위치
	private int loC = 0; // 현재 컬럼위치
	private int roadCount = 0;
	private int moveCount = 0;

	public Location() {
		super();
	}
	

	public Location(int loR, int loC) {
		super();
		this.loR = loR;
		this.loC = loC;
	}


	public String findDirection(int[][] maze) {
		String direction = "이동불가";
		if (loC + 1 != maze[0].length) {
			if (maze[loR][loC + 1] == 1) {
				direction = "오른쪽";
				roadCount++;
			}
		}
		if (loR + 1 != maze.length) {
			if (maze[loR + 1][loC] == 1) {
				direction = "아래";
				roadCount++;
			}
		}
		if (loR - 1 >= 0) {
			if (maze[loR - 1][loC] == 1) {
				direction = "위";
				roadCount++;
			}
		}
		if (loR - 1 >= 0) {
			if (maze[loR][loC - 1] == 1) {
				direction = "왼쪽";
				roadCount++;
			}
		}
		return direction;
	}

	public void Move(String direction) {
		switch (direction) {
		case "오른쪽":
			loC++;
			moveCount++;
			break;
		case "아래":
			loR++;
			moveCount++;
			break;
		case "위":
			loR--;
			moveCount++;
			break;
		case "왼쪽":
			loC--;
			moveCount++;
			break;
		}
	}

	public int getLoR() {
		return loR;
	}

	public void setLoR(int loR) {
		this.loR = loR;
	}

	public int getLoC() {
		return loC;
	}

	public void setLoC(int loC) {
		this.loC = loC;
	}

	public int getRoadCount() {
		return roadCount;
	}

	public void setRoadCount(int roadCount) {
		this.roadCount = roadCount;
	}

}

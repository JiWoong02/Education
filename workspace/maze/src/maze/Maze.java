package maze;

public class Maze {
	private int[][] maze = null;
	public Maze() {
		String mazeString = "46101111101010101011111011";
		int row = Integer.parseInt(mazeString.substring(0, 1));
		int column = Integer.parseInt(mazeString.substring(1, 2));
		int charAtCount = 2;
		int[][] maze = new int[row][column];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = Integer.parseInt(mazeString.substring(charAtCount, charAtCount + 1));
				charAtCount++;
			}
		}
		this.maze = maze;
	}
	public void mazeClose(int row, int column) {
		this.maze[row][column]=0;
	}
	public int[][] getMaze() {
		return maze;
	}
	public void setMaze(int[][] maze) {
		this.maze = maze;
	}
	
}

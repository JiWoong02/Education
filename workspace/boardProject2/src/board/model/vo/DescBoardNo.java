package board.model.vo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import board.controller.BoardManager;

public class DescBoardNo {
	public void compare(Map maps) {
		BoardManager bm = new BoardManager();
		TreeMap tMap = new TreeMap(maps);
		bm.displayAllMaps(tMap.descendingMap());
	}
}

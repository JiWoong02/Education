package board.model.vo;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import board.controller.BoardManager;

public class AscBoardDate {
	public void compare(Map maps) {
		BoardManager bm = new BoardManager();
		TreeMap<Date, Board> treeMap = new TreeMap<>();

		// 모든 엔트리를 TreeMap에 추가
		Set<Map.Entry<Integer, Board>> entrySet = maps.entrySet();
		for (Map.Entry<Integer, Board> entry : entrySet) {
			treeMap.put(entry.getValue().getBoardDate(), entry.getValue());
		}
		bm.displayAllMaps(treeMap);
	}
}
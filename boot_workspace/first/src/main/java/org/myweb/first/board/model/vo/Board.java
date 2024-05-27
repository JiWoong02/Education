package org.myweb.first.board.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Getter
 * @Setter
 * @ToString
 */
@Data//@ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiedArgsConstructor 모두 사용한 것과 같음
//@RequiedArgsConstructor DB와 연동되었을때 필수 입력받아야하는 항목으로 구성된 생성자
@NoArgsConstructor
@AllArgsConstructor	
public class Board/* implements java.io.Serializable */ {
	/* private static final long serialVersionUID = -5219066150385199445L; */

	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardOriginalFileName;
	private String boardRenameFileName;
	private int boardRef;
	private int boardReplyRef;
	private int boardLev;
	private int boardReplySeq;
	private int boardReadCount;
	private java.sql.Date boardDate;

}

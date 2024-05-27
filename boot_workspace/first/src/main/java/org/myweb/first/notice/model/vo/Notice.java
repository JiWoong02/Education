package org.myweb.first.notice.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notice/* implements java.io.Serializable */{
	/* private static final long serialVersionUID = 5875954839993211121L; */
	
	private int noticeNo;
	private String noticeTitle;
	private java.sql.Date noticeDate;
	private String noticeWriter;
	private String noticeContent;
	private String originalFilePath;
	private String renameFilePath;
	private String importance;
	private java.sql.Date impEndDate;
	private int readCount;
	
}

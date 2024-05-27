package org.ict.testjpa.notice.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.GregorianCalendar;

//테이블 생성과 관련된 가이드 클래스임
//@Entity 어노테이션 표시함 => 엔티티로 자동 등록됨 => Repository와 연결됨
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="NOTICE")   // 컬럼과 property 매핑할 테이블 이름 지정, NOTICE 테이블을 자동으로 만들어 주기도 함
@Entity //JPA가 관리함. 테이블과 DTO(VO)클래스 매핑시 반드시 필요함
public class NoticeEntity {
    @Id //JPA가 객체를 관리할 때 식별할 기본키 지정하는 어노테이션임
    @GeneratedValue(strategy = GenerationType.IDENTITY) //primary key 지정하는 어노테이션
    @Column(name="NOTICENO")
    private int noticeNo;
    @Column(name="NOTICETITLE", nullable=false, length = 50) //nullable=false ==> 제약조건 NOT NULL
    private String noticeTitle;
    @Column(name="NOTICEDATE")
    private Date noticeDate;
    @Column(name="NOTICEWRITER", nullable=false, length=50)
    private String noticeWriter;
    @Column(name="NOTICECONTENT", length=2000)
    private String noticeContent;
    @Column(name="ORIGINAL_FILEPATH", length=100)
    private String originalFilepath;
    @Column(name="RENAME_FILEPATH", length=100)
    private String renameFilepath;
    @Column(name="IMPORTANCE", nullable=false, length=1)
    private String importance;
    @Column(name="IMP_END_DATE", nullable=false, columnDefinition = "N")
    private Date impEndDate;
    @Column(name="READCOUNT", nullable=false, columnDefinition = "1")
    private int readCount;

    @PrePersist         //jpa 로 넘어가기 전에 작동하라는 의미의 어노테이션
    public void prePersist(){
        noticeDate = new GregorianCalendar().getGregorianChange();   //현재 날짜, 시간 적용  
    }

}

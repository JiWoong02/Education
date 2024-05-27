--토큰 관련 테이블 : refresh_tokens (참고 예)
--목적 : 사용자의 리프레시 토큰 정보를 저장하는 용도임
--필드 목록:
--id : 리프레시 토큰의 고유 식별자, CHAR(36), 필수입력
--user_id : 리프레시 토큰을 소유한 사용자의 아이디(이메일), VARCHAR2(40), 필수입력
--token_value : 리프레시 토큰 값, VARCHAR2(255), 필수입력
--issued_at : 토큰 발급 날짜 및 시간, TIMESTAMP, 기본값 현재 시간
--expires_in : 토큰 만료 시간(초), BIGINT(NUMBER), 필수입력
--expiration_date : 토큰 만료 날짜 및 시간, TIMESTAMP, 필수입력
--user_agent : 토큰 발급 당시 사용된 사용자 에이전트, TEXT(LONG)
--status : 토큰 상태, VARCHAR2(50)
--제약조건 : PRIMARY KEY (id), FOREIGN KEY (user_id) REFERENCES 회원테이블명 (참조컬럼명) ON DELETE CASCADE
--인덱스 : 없음
--기타 코멘트 : 토큰의 상태는 status 필드를 통해 확인하고 관리됨



DROP TABLE REFRESH_TOKENS CASCADE CONSTRAINTS;
CREATE TABLE REFRESH_TOKENS(
    ID CHAR(36) PRIMARY KEY,
    USER_ID VARCHAR2(50) REFERENCES MEMBER(USERID) ON DELETE CASCADE NOT NULL,
    TOKEN_VALUE VARCHAR2(255) NOT NULL,
    ISSUED_AT TIMESTAMP DEFAULT SYSTIMESTAMP,
    EXPIRES_IN NUMBER NOT NULL,
    EXPIRATION_DATE TIMESTAMP NOT NULL,
    USER_AGENT LONG,
    STATUS VARCHAR2(50)
);

COMMENT ON COLUMN REFRESH_TOKENS.ID IS '토큰식별ID';
COMMENT ON COLUMN REFRESH_TOKENS.USER_ID IS '유저아이디';
COMMENT ON COLUMN REFRESH_TOKENS.TOKEN_VALUE IS '리프레시 토큰 값';
COMMENT ON COLUMN REFRESH_TOKENS.ISSUED_AT IS '토큰 발급 날짜 및 시간';
COMMENT ON COLUMN REFRESH_TOKENS.EXPIRES_IN IS '토큰 만료 시간(초)';
COMMENT ON COLUMN REFRESH_TOKENS.EXPIRATION_DATE IS '토큰 만료 날짜 및 시간';
COMMENT ON COLUMN REFRESH_TOKENS.USER_AGENT IS '토큰 발급 당시 사용된 사용자 에이전트';
COMMENT ON COLUMN REFRESH_TOKENS.STATUS IS '토큰 상태';






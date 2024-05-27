DROP TABLE VISION CASCADE CONSTRAINTS;

CREATE TABLE VISION (
    NAME VARCHAR2(100) NOT NULL,
    TEL VARCHAR2(25) NOT NULL
);

COMMENT ON COLUMN VISION.NAME IS '상호명';
COMMENT ON COLUMN VISION.TEL IS '전화번호';

COMMIT;
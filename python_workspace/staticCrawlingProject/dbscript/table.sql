-- ũ�Ѹ� ������ ����� ���̺� ���� ��ũ��Ʈ
-- table.sql

-- ���̹� ��ȭ�� ���� ���� ������ ũ�Ѹ� ��� ����� ���̺�
-- ���̺��� : movie
-- ���̽��� Movie Ŭ���� �ʵ���� ���̺� �÷��� ��ġ��Ŵ => �ʵ���� '__' ������
-- rank : pk, ������ �÷��� not null
-- �÷� comment �� ����

DROP TABLE MOVIE CASCADE CONSTRAINTS;

CREATE TABLE MOVIE (
    RANK NUMBER CONSTRAINT PK_MOVIE PRIMARY KEY,
    TITLE VARCHAR2(100) NOT NULL,
    STAR_POINT NUMBER(7, 2) NOT NULL,
    RELEASE_DATE VARCHAR2(100) NOT NULL,
    GENRE VARCHAR2(30),
    LINK VARCHAR2(2000)
);

COMMENT ON COLUMN MOVIE.RANK IS '�󿵼���';
COMMENT ON COLUMN MOVIE.TITLE IS '��ȭ����';
COMMENT ON COLUMN MOVIE.STAR_POINT IS '��ȭ����';
COMMENT ON COLUMN MOVIE.RELEASE_DATE IS '������';
COMMENT ON COLUMN MOVIE.GENRE IS '�帣';
COMMENT ON COLUMN MOVIE.LINK IS '�������� URL';

COMMIT;
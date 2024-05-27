--��ū ���� ���̺� : refresh_tokens (���� ��)
--���� : ������� �������� ��ū ������ �����ϴ� �뵵��
--�ʵ� ���:
--id : �������� ��ū�� ���� �ĺ���, CHAR(36), �ʼ��Է�
--user_id : �������� ��ū�� ������ ������� ���̵�(�̸���), VARCHAR2(40), �ʼ��Է�
--token_value : �������� ��ū ��, VARCHAR2(255), �ʼ��Է�
--issued_at : ��ū �߱� ��¥ �� �ð�, TIMESTAMP, �⺻�� ���� �ð�
--expires_in : ��ū ���� �ð�(��), BIGINT(NUMBER), �ʼ��Է�
--expiration_date : ��ū ���� ��¥ �� �ð�, TIMESTAMP, �ʼ��Է�
--user_agent : ��ū �߱� ��� ���� ����� ������Ʈ, TEXT(LONG)
--status : ��ū ����, VARCHAR2(50)
--�������� : PRIMARY KEY (id), FOREIGN KEY (user_id) REFERENCES ȸ�����̺�� (�����÷���) ON DELETE CASCADE
--�ε��� : ����
--��Ÿ �ڸ�Ʈ : ��ū�� ���´� status �ʵ带 ���� Ȯ���ϰ� ������



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

COMMENT ON COLUMN REFRESH_TOKENS.ID IS '��ū�ĺ�ID';
COMMENT ON COLUMN REFRESH_TOKENS.USER_ID IS '�������̵�';
COMMENT ON COLUMN REFRESH_TOKENS.TOKEN_VALUE IS '�������� ��ū ��';
COMMENT ON COLUMN REFRESH_TOKENS.ISSUED_AT IS '��ū �߱� ��¥ �� �ð�';
COMMENT ON COLUMN REFRESH_TOKENS.EXPIRES_IN IS '��ū ���� �ð�(��)';
COMMENT ON COLUMN REFRESH_TOKENS.EXPIRATION_DATE IS '��ū ���� ��¥ �� �ð�';
COMMENT ON COLUMN REFRESH_TOKENS.USER_AGENT IS '��ū �߱� ��� ���� ����� ������Ʈ';
COMMENT ON COLUMN REFRESH_TOKENS.STATUS IS '��ū ����';






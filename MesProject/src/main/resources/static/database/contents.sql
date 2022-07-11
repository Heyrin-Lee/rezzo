
--CCDS
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('100', '테스트코드')
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('101', '테스트코드2')

--PRCS
INSERT INTO PRCS VALUES ('TEST001', 'TEST01', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST002', 'TEST02', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST003', 'TEST03', 'TEST2', '테스트');

--EQM
INSERT INTO EQM VALUES ('test1','test1','test1','test1',sysdate,1,100,0,'Y','test1');
INSERT INTO EQM VALUES ('test2','test2','test2','test2',sysdate,1,100,0,'Y','test2');

--EQM_LINE
INSERT INTO EQM_LINE VALUES('test1', 1, 'test1', 'Y');
INSERT INTO EQM_LINE VALUES('test2', 1, 'test2', 'Y');
INSERT INTO EQM_LINE VALUES('test3', 1, 'test3', 'Y');
INSERT INTO EQM_LINE VALUES('test4', 1, 'test4', 'Y');
INSERT INTO EQM_LINE VALUES('test5', 1, 'test5', 'Y');
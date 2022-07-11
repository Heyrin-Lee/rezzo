
--CCDS
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('100', '테스트코드')
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('101', '테스트코드2')

--CCDS_DTL
INSERT INTO CCDS_DTL (CCD_DTL, CCD, CCD_DTL_NM, CCD_DTL_DESCT, USE_YN) VALUES ('01', '100', '상세코드1', '100번의상세코드입니다.', 'Y')
INSERT INTO CCDS_DTL (CCD_DTL, CCD, CCD_DTL_NM, CCD_DTL_DESCT, USE_YN) VALUES ('01', '101', '상세코드', '101번의상세코드입니다.', 'N')


--PRCS
INSERT INTO PRCS VALUES ('TEST001', 'TEST01', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST002', 'TEST02', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST003', 'TEST03', 'TEST2', '테스트');

--EQM
INSERT INTO EQM VALUES ('test1','test1','test1','test1',sysdate,1,100,0,'Y','test1');
INSERT INTO EQM VALUES ('test2','test2','test2','test2',sysdate,1,100,0,'Y','test2');
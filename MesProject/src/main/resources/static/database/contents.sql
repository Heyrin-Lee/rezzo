
--CCDS
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('100', '테스트코드')
INSERT INTO CCDS (CCD, CCD_NM) VALUES ('101', '테스트코드2')
INSERT INTO CCDS (CCD, CCD_NM, CCD_DESCT, USE_YN) VALUES ('EQM', '설비코드', '설비공통코드입니다.', 'Y')

--CCDS_DTL
INSERT INTO CCDS_DTL (CCD_DTL, CCD, CCD_DTL_NM, CCD_DTL_DESCT, USE_YN) VALUES ('01', '100', '상세코드1', '100번의상세코드입니다.', 'Y')
INSERT INTO CCDS_DTL (CCD_DTL, CCD, CCD_DTL_NM, CCD_DTL_DESCT, USE_YN) VALUES ('01', '101', '상세코드', '101번의상세코드입니다.', 'N')
INSERT INTO CCDS_DTL (CCD_DTL, CCD, CCD_DTL_NM, CCD_DTL_DESCT, DTL_USE_YN) VALUES ('QHT', 'EQM', '가열기', '가열공정시 사용되는 가열기', 'Y')

--BOM
INSERT INTO BOM VALUES ('utea1', '100' ,  'rs3001', 'ml', 10, 'TEST001', '비고', 'Y');
INSERT INTO BOM VALUES ('utea2', '100' ,  'rs2001', 'g', 5,  'TEST002', '비고', 'Y');
INSERT INTO BOM VALUES ('utea3', '100' ,  'rs1001', 'g', 13,  'TEST001', '비고', 'Y');

INSERT INTO BOM VALUES ('gtea1', '200' ,  'rs3001', 'ml', 10,  'TEST001', '비고', 'Y');
INSERT INTO BOM VALUES ('gtea2', '200' ,  'rs2001', 'g', 5,  'TEST002', '비고', 'Y');
INSERT INTO BOM VALUES ('gtea3', '200' ,  'rs1002', 'g', 13,  'TEST001', '비고', 'Y');

--PRCS
INSERT INTO PRCS VALUES ('TEST001', '세척', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST002', '혼합', 'TEST1', '테스트');
INSERT INTO PRCS VALUES ('TEST003', '포장', 'TEST2', '테스트');
INSERT INTO PRCS VALUES ('TEST004', '가열', 'TEST2', '테스트');

--PRCS_FLOW
INSERT INTO PRCS_FLOW VALUES (1, '100', '세척', 'TEST001');
INSERT INTO PRCS_FLOW VALUES (2, '100', '혼합', 'TEST002');
INSERT INTO PRCS_FLOW VALUES (3, '100', '포장', 'TEST003');
INSERT INTO PRCS_FLOW VALUES (1, '200', '세척', 'TEST001');
INSERT INTO PRCS_FLOW VALUES (2, '200', '가열', 'TEST004');
INSERT INTO PRCS_FLOW VALUES (3, '200', '포장', 'TEST003');

--EQM
INSERT INTO EQM VALUES ('test1','test1','test1','test1',sysdate,1,100,0,'Y','test1');
INSERT INTO EQM VALUES ('test2','test2','test2','test2',sysdate,1,100,0,'Y','test2');

--EQM_LINE
INSERT INTO EQM_LINE VALUES('test1', 1, 'test1', 'Y');
INSERT INTO EQM_LINE VALUES('test2', 1, 'test2', 'Y');
INSERT INTO EQM_LINE VALUES('test3', 1, 'test3', 'Y');
INSERT INTO EQM_LINE VALUES('test4', 1, 'test4', 'Y');
INSERT INTO EQM_LINE VALUES('test5', 1, 'test5', 'Y');

--RSC_IST
INSERT INTO RSC_IST VALUES ('IC1002', 'WH1001', 1001, 'rs1002', '2022-07-07', 30, 'RLOT1001');
INSERT INTO RSC_IST VALUES ('IC1003', 'WH1002', 1003, 'rs2001', '2022-07-10', 30, 'RLOT1003');
INSERT INTO RSC_IST VALUES ('IC1004', 'WH1003', 1004, 'rs3001', '2022-07-12', 75, 'RLOT1004');

--RSC_ORDR_DTL
INSERT INTO RSC_ORDR_DTL VALUES (1003, 'rs2001', '설탕', 30, 50);
INSERT INTO RSC_ORDR_DTL VALUES (1004, 'rs3001', '정제수', 50, 300);

--ORDER_SHEET
insert into order_sheet (order_no, edcts_cd, vend_cd, vend_nm, order_dt, prog_appe, paprd_dt, prdt_nm, order_cnt)
values('ORS20220714001','100','v1001','오뚜기','2022-07-14','진행','2022-07-23','유자차',100);

insert into order_sheet (order_no, edcts_cd, vend_cd, vend_nm, order_dt, prog_appe, paprd_dt, prdt_nm, order_cnt)
values('ORS20220714002','200','v1002','대상','2022-07-14','진행','2022-07-23','자몽차',100);

--EDCTS
insert into edcts (edcts_cd, prdt_nm, spec, unit, saf_stc, cutd_wrhous, wrhous_cd)
values('100','유자차','규격','단위',300,'A창고','aa');

insert into edcts (edcts_cd, prdt_nm, spec, unit, saf_stc, cutd_wrhous, wrhous_cd)
values('200','자몽차','규격','단위',300,'B창고','bb');
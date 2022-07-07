DROP TABLE EQM_LINE;

CREATE TABLE EQM_LINE (
    LINE_CD    VARCHAR2(50)      NOT NULL,
    UPH_CNT    NUMBER      NULL,
    EQM_PSCH   VARCHAR2(30)      NULL,
    USE_YN    VARCHAR2(2)      NULL
);

DROP TABLE EQM;

CREATE TABLE EQM (
            EQM_CD   VARCHAR2(50)      NOT NULL,
    LINE_CD    VARCHAR2(50)      NOT NULL,
    PRCS_CD   VARCHAR2(50)      NOT NULL,
    EQM_NM   VARCHAR2(30)      NULL,
    EQM_IST_DT   DATE      NULL,
    MIN_TEMP   NUMBER      NULL,
    MAX_TEMP   NUMBER      NULL,
    CHCK_PERD   NUMBER      NULL,
    USE_YN    VARCHAR2(2)      NULL,
    PRCS_NM   VARCHAR2(30)      NULL
);

DROP TABLE EQM_CHCK;

CREATE TABLE EQM_CHCK (
    CHCK_NO   NUMBER      NOT NULL,
    EQM_CD   VARCHAR2(50)      NOT NULL,
    PRCS_CD   VARCHAR2(50)      NOT NULL,
    CHCK_FG   VARCHAR2(20)      NULL,
    CHCK_DT   DATE      NULL,
    JDGMNT   VARCHAR2(10)      NULL,
    DISPO_MATTER   VARCHAR2(10)      NULL,
    DISPO_CTNT   VARCHAR2(2000)      NULL
);

DROP TABLE  PLAN;

CREATE TABLE PLAN (
   PLAN_CD    VARCHAR2(50)      NOT NULL,
   PAPRD_DT   DATE      NULL,
   PREF_RANK   NUMBER      NULL,
   NOW_ST    VARCHAR2(10)      NULL,
   ORDER_CD   VARCHAR2(50)      NOT NULL,
   PLAN_DT    DATE      NULL
);

DROP TABLE PLAN_DTL;

CREATE TABLE PLAN_DTL (
   WK_FR_DT   DATE      NOT NULL,
   LINE_CD   VARCHAR2(50)      NOT NULL,
   PRDT_CD   VARCHAR2(50)      NULL,
   ND_CNT   NUMBER      NULL,
   INDICA_CNT   NUMBER      NULL,
   OPR_TM   NUMBER      NULL,
   PRCS_CD   VARCHAR2(50)      NOT NULL,
   PLAN_CD   VARCHAR2(50)      NOT NULL
);

DROP TABLE INDICA;

CREATE TABLE INDICA (
   INDICA_DT   DATE      NULL,
   PLAN_CD   VARCHAR2(50)      NOT NULL,
   PREF_RANK   NUMBER      NULL,
   PROD_CLS_DT   DATE      NULL,
   NOW_ST   VARCHAR2(10)      NULL
);

DROP TABLE INDICA_DTL;

CREATE TABLE INDICA_DTL (
   SEQ   NUMBER      NOT NULL,
   INDICA_DT   DATE      NULL,
   PRDT_CD   VARCHAR2(50)      NULL,
   INDICA_CNT   NUMBER      NULL,
   PROD_CNT   NUMBER      NULL,
   WK_FR_DT   DATE      NULL,
   OPR_TM   NUMBER      NULL,
   BOM_CD   VARCHAR2(50)      NOT NULL,
   PRCS_CD   VARCHAR2(50)      NOT NULL,
   LINE_CD   VARCHAR2(50)      NOT NULL,
   PRCS_PSCH   VARCHAR2(30)      NULL
);

DROP TABLE PRCS;

CREATE TABLE PRCS (
   PRCS_CD   VARCHAR2(50)      NOT NULL,
   PRCS_NM   VARCHAR2(50)      NULL,
   PRCS_FG   VARCHAR2(50)      NULL
);

DROP TABLE PROG_PRCS;

CREATE TABLE PROG_PRCS (
   PROG_PRCS_CD   VARCHAR2(50)      NOT NULL,
   INDICA_DT   DATE      NULL,
   LINE_CD   VARCHAR2(50)      NULL,
   PRCS_CD   VARCHAR2(50)      NULL,
   WK_FR_DTTM   DATE      NULL,
   WK_TO_DTTM   DATE      NULL,
   PRCS_PSCH   VARCHAR2(30)      NULL,
   INFER_CNT   NUMBER      NULL,
   PROD_CNT   NUMBER      NULL,
   NOW_ST   VARCHAR2(10)      NULL,
   EDCTS_LOT_NO   NUMBER      NULL
);

DROP TABLE PRCS_FLOW;

CREATE TABLE PRCS_FLOW (
   PRCS_ORD   NUMBER      NOT NULL,
   EDCTS_CD   VARCHAR2(6)      NOT NULL,
   PRCS_NM   VARCHAR2(50)      NULL,
   PRCS_CD   VARCHAR2(50)      NOT NULL
);

DROP TABLE CCDS;

CREATE TABLE CCDS (
   CCD   VARCHAR2(6)      NOT NULL,
   CCD_NM   VARCHAR2(50)      NULL
);

DROP TABLE VEND;

CREATE TABLE VEND (
   VEND_CD   VARCHAR2(6)      NOT NULL,
   VEND_NM   VARCHAR2(50)      NULL,
   BIZNO   VARCHAR2(20)      NULL,
   TELNO   VARCHAR2(20)      NULL,
   REMK   VARCHAR2(1000)      NULL,
   VEND_TYP   VARCHAR2(50)      NULL
);

DROP TABLE RSC_IST;

CREATE TABLE RSC_IST (
   Field   VARCHAR(255)      NULL,
   WRHOUS_CD   VARCHAR2(6)      NOT NULL,
   ORDR_CD   VARCHAR2(50)      NOT NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   IST_DT   DATE      NULL,
   IST_CNT   NUMBER      NULL,
   Field2   VARCHAR(255)      NULL
);

DROP TABLE RSC_OUST;

CREATE TABLE RSC_OUST (
   RSC_OUST_NO   NUMBER      NOT NULL,
   WRHOUS_CD   VARCHAR2(6)      NOT NULL,
   OUST_DT   DATE      NULL,
   OUST_TYP   VARCHAR2(10)      NULL,
   Field   VARCHAR(255)      NULL
);

DROP TABLE RSC_STC;

CREATE TABLE RSC_STC (
   RSC_CD   VARCHAR2(6)      NOT NULL,
   BASE_CNT   NUMBER      NULL,
   IST_CNT   NUMBER      NULL,
   OUST_CNT   NUMBER      NULL,
   SAF_STC   NUMBER      NULL,
   AVAL_STC   NUMBER      NULL
);

DROP TABLE RSC_STC_HIST;

CREATE TABLE RSC_STC_HIST (
   CLS_YYMM   DATE      NOT NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   IST_CNT   NUMBER      NULL,
   OUST_CNT   NUMBER      NULL,
   PRVMM_STC   NUMBER      NULL,
   THSMM_STC   NUMBER      NULL
);

DROP TABLE RSC_STC_CLS;

CREATE TABLE RSC_STC_CLS (
   CLS_YYMM   DATE      NOT NULL,
   CLS_YN   VARCHAR2(2)      NULL,
   CLS_DT   DATE      NULL
);

DROP TABLE RSC;

CREATE TABLE RSC (
   RSC_CD   VARCHAR2(6)      NOT NULL,
   RSC_NM   VARCHAR2(50)      NULL,
   RSC_SPEC   VARCHAR2(50)      NULL,
   MNG_UNIT   VARCHAR2(30)      NULL,
   RSC_TYP   VARCHAR2(50)      NULL,
   VEND_NM   VARCHAR2(50)      NULL,
   SAF_STC   NUMBER      NULL,
   USE_YN   VARCHAR2(2)      NULL,
   WRHOUS_CD   VARCHAR2(6)      NOT NULL,
   VEND_CD   VARCHAR2(6)      NOT NULL
);

DROP TABLE BOM;

CREATE TABLE BOM (
   BOM_CD   VARCHAR2(6)      NOT NULL,
   PRDT_NM   VARCHAR2(50)      NULL,
   RSC_NM   VARCHAR2(50)      NULL,
   USE_CNT   NUMBER      NULL,
   UNIT   VARCHAR2(30)      NULL,
   PRCS_NM   VARCHAR2(30)      NULL,
   REMK   VARCHAR2(1000)      NULL,
   USE_YN   VARCHAR2(2)      NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   EDCTS_CD   VARCHAR2(6)      NOT NULL
);

DROP TABLE WRHOUS;

CREATE TABLE WRHOUS (
   WRHOUS_CD   VARCHAR2(6)      NOT NULL,
   WRHOUS_NM   VARCHAR2(50)      NULL,
   WRHOUS_TYP   VARCHAR2(50)      NULL,
   WRHOUS_INFO   VARCHAR2(50)      NULL,
   USE_YN   VARCHAR2(2)      NULL
);

DROP TABLE EDCTS;

CREATE TABLE EDCTS (
   EDCTS_CD   VARCHAR2(6)      NOT NULL,
   PRDT_NM   VARCHAR2(50)      NULL,
   SPEC   VARCHAR2(50)      NULL,
   UNIT   VARCHAR2(30)      NULL,
   SAF_STC   NUMBER      NULL,
   CUTD_WRHOUS   VARCHAR20)      NULL,
   WRHOUS_CD   VARCHAR2(6)      NOT NULL
);

DROP TABLE PRDT_INSP;

CREATE TABLE PRDT_INSP (
   EDCTS_LOT_NO   NUMBER      NOT NULL,
   EDCTS_CD   VARCHAR2(6)      NULL,
   EDCTS_NM   VARCHAR2(50)      NULL,
   ORDER_CD   VARCHAR2(50)      NULL,
   INSP_RSLT   VARCHAR2(30)      NULL,
   INSP_PSCH   VARCHAR2(30)      NULL,
   INSP_DT   DATE      NULL
);

DROP TABLE PRDT_INSP_INFER;

CREATE TABLE PRDT_INSP_INFER (
   EDCTS_LOT_NO   NUMBER      NOT NULL,
   EDCTS_CD   VARCHAR2(6)      NULL,
   EDCTS_NM   VARCHAR2(30)      NULL,
   INFER_TYP   VARCHAR2(50)      NULL,
   INFER_DETA   VARCHAR2(100)      NULL,
   INFER_INST_PSCH   VARCHAR2(30)      NULL,
   INSP_DT   DATE      NULL
);

DROP TABLE EQM_OPR;

CREATE TABLE EQM_OPR (
   NOPR_CD   VARCHAR2(50)      NOT NULL,
   EQM_CD   VARCHAR2(50)      NOT NULL,
   EQM_NM   VARCHAR2(30)      NULL,
   FR_DT   DATE      NULL,
   TO_DT   DATE      NULL,
   EQM_PSCH   VARCHAR2(30)      NULL,
   OPERT_CTNT   VARCHAR2(2000)      NULL
);

DROP TABLE CCDS_DTL;

CREATE TABLE CCDS_DTL (
   CCD_DTL   VARCHAR2(6)      NOT NULL,
   CCD   VARCHAR2(6)      NOT NULL,
   CCD_DTL_NM   VARCHAR2(50)      NULL,
   CCD_DTL_DESCT   VARCHAR2(50)      NULL,
   USE_YN   VARCHAR2(2)      NULL
);

DROP TABLE RLTM_EQM;

CREATE TABLE RLTM_EQM (
   EQM_CD   VARCHAR2(50)      NOT NULL,
   PRCS_CD   VARCHAR2(50)      NOT NULL,
   RLTM_TEMP   NUMBER      NULL,
   RLTM_CNT   NUMBER      NULL
);

DROP TABLE EQM_IMG;

CREATE TABLE EQM_IMG (
   EQM_CD   VARCHAR2(50)      NOT NULL,
   PRCS_CD   VARCHAR2(50)      NOT NULL,
   IMG_PATH   VARCHAR2(2000)      NULL,
   EQM_IMG   VARCHAR2(2000)      NOT NULL
);

DROP TABLE RSC_ORDR;

CREATE TABLE RSC_ORDR (
   ORDR_NO   NUMBER      NOT NULL,
   VEND_NM   VARCHAR2(50)      NULL,
   PAPRD_CMND_DT   DATE      NULL,
   ORDR_REQ_DT   DATE      NULL
);

DROP TABLE RSC_ORDR_DTL;

CREATE TABLE RSC_ORDR_DTL (
   ORDR_NO   NUMBER      NOT NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   RSC_NM   VARCHAR2(50)      NULL,
   RSC_CNT   NUMBER      NULL,
   ORDR_CNT   NUMBER      NULL
);

DROP TABLE PROG_PRCS_DTL;

CREATE TABLE PROG_PRCS_DTL (
   PROG_PRCS_CD   VARCHAR2(50)      NOT NULL,
   LOG_TM   DATE      NULL
);

DROP TABLE ORDER_SHEET;

CREATE TABLE ORDER_SHEET (
   ORDER_NO   NUMBER      NOT NULL,
   EDCTS_CD   VARCHAR2(6)      NOT NULL,
   VEND_CD   VARCHAR2(6)      NOT NULL,
   VEND_NM   VARCHAR2(50)      NULL,
   ORDER_DT   DATE      NULL,
   PROG_APPE   VARCHAR2(10)      NULL,
   PAPRD_DT   DATE      NULL,
   PRDT_NM   VARCHAR2(50)      NULL,
   ORDER_CNT   NUMBER      NULL
);

DROP TABLE PROG_PRCS_INFER;

CREATE TABLE PROG_PRCS_INFER (
   PROG_PRCS_CD   VARCHAR2(100)      NOT NULL,
   INFER_CNT   NUMBER      NULL,
   INFER_NM   VARCHAR2(50)      NULL
);

DROP TABLE RSC_INSP_DTL;

CREATE TABLE RSC_INSP_DTL (
   RSC_CD   VARCHAR2(6)      NOT NULL,
   RSC_INSP_NO   NUMBER      NOT NULL,
   ORDR_NO   NUMBER      NOT NULL,
   INSP_CNT   NUMBER      NULL,
   INFER_CNT   NUMBER      NULL,
   INFER_TYP   VARCHAR2(50)      NULL,
   INFER_CNTN   VARCHAR2(50)      NULL
);

DROP TABLE RSC_INSP;

CREATE TABLE RSC_INSP (
   RSC_INSP_NO   NUMBER      NOT NULL,
   INSP_DT   DATE      NULL,
   INSP_TSTR   VARCHAR2(30)      NULL,
   INSP_INST   DATE      NULL
);

DROP TABLE EDCTS_OUST;

CREATE TABLE EDCTS_OUST (
   EDCTS_OUST_NO   NUMBER      NOT NULL,
   EDCTS_OUST_DT   DATE      NULL,
   EDCTS_OUST_CNT   NUMBER      NULL,
   EDCTS_CD   VARCHAR2(6)      NOT NULL
);

DROP TABLE EDCTS_IST;

CREATE TABLE EDCTS_IST (
   EDCTS_IST_NO   NUMBER      NOT NULL,
   EDCTS_IST_DT   DATE      NULL,
   EDCTS_IST_CNT   NUMBER      NULL,
   EDCTS_CD   VARCHAR2(6)      NOT NULL,
   EDCTS_LOT_NO   NUMBER      NOT NULL
);

DROP TABLE EDCTS_STC;

CREATE TABLE EDCTS_STC (
   EDCTS_CD   VARCHAR2(6)      NOT NULL,
   PRDT_NM   VARCHAR2(50)      NULL,
   MAKE_DT   DATE      NULL,
   STC_CNT   NUMBER      NULL,
   DISTB_TERM   DATE      NULL
);

DROP TABLE RSC_OUST_DTL;

CREATE TABLE RSC_OUST_DTL (
   RSC_OUST_NO   NUMBER      NOT NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   OUST_CNT   NUMBER      NULL
);

DROP TABLE HOLDING;

CREATE TABLE HOLDING (
   PLAN_CD   VARCHAR2(50)      NOT NULL,
   RSC_CD   VARCHAR2(6)      NOT NULL,
   RSC_USE   NUMBER      NULL
);

ALTER TABLE EQM_LINE ADD CONSTRAINT PK_EQM_LINE PRIMARY KEY (
   LINE_CD
);

ALTER TABLE EQM ADD CONSTRAINT PK_EQM PRIMARY KEY (
   EQM_CD,
   LINE_CD,
   PRCS_CD
);

ALTER TABLE EQM_CHCK ADD CONSTRAINT PK_EQM_CHCK PRIMARY KEY (
   CHCK_NO,
   EQM_CD,
   PRCS_CD
);

ALTER TABLE PLAN ADD CONSTRAINT PK_PLAN PRIMARY KEY (
   PLAN_CD
);

ALTER TABLE PLAN_DTL ADD CONSTRAINT PK_PLAN_DTL PRIMARY KEY (
   WK_FR_DT,
   LINE_CD
);

ALTER TABLE INDICA ADD CONSTRAINT PK_INDICA PRIMARY KEY (
   INDICA_DT
);

ALTER TABLE INDICA_DTL ADD CONSTRAINT PK_INDICA_DTL PRIMARY KEY (
   SEQ,
   INDICA_DT
);

ALTER TABLE PRCS ADD CONSTRAINT PK_PRCS PRIMARY KEY (
   PRCS_CD
);

ALTER TABLE PROG_PRCS ADD CONSTRAINT PK_PROG_PRCS PRIMARY KEY (
   PROG_PRCS_CD
);

ALTER TABLE PRCS_FLOW ADD CONSTRAINT PK_PRCS_FLOW PRIMARY KEY (
   PRCS_ORD,
   EDCTS_CD
);

ALTER TABLE CCDS ADD CONSTRAINT PK_CCDS PRIMARY KEY (
   CCD
);

ALTER TABLE VEND ADD CONSTRAINT PK_VEND PRIMARY KEY (
   VEND_CD
);

ALTER TABLE RSC_IST ADD CONSTRAINT PK_RSC_IST PRIMARY KEY (
   Field
);

ALTER TABLE RSC_OUST ADD CONSTRAINT PK_RSC_OUST PRIMARY KEY (
   RSC_OUST_NO
);

ALTER TABLE RSC_STC ADD CONSTRAINT PK_RSC_STC PRIMARY KEY (
   RSC_CD
);

ALTER TABLE RSC_STC_HIST ADD CONSTRAINT PK_RSC_STC_HIST PRIMARY KEY (
   CLS_YYMM,
   RSC_CD
);

ALTER TABLE RSC_STC_CLS ADD CONSTRAINT PK_RSC_STC_CLS PRIMARY KEY (
   CLS_YYMM
);

ALTER TABLE RSC ADD CONSTRAINT PK_RSC PRIMARY KEY (
   RSC_CD
);

ALTER TABLE BOM ADD CONSTRAINT PK_BOM PRIMARY KEY (
   BOM_CD
);

ALTER TABLE WRHOUS ADD CONSTRAINT PK_WRHOUS PRIMARY KEY (
   WRHOUS_CD
);

ALTER TABLE EDCTS ADD CONSTRAINT PK_EDCTS PRIMARY KEY (
   EDCTS_CD
);

ALTER TABLE PRDT_INSP ADD CONSTRAINT PK_PRDT_INSP PRIMARY KEY (
   EDCTS_LOT_NO
);

ALTER TABLE PRDT_INSP_INFER ADD CONSTRAINT PK_PRDT_INSP_INFER PRIMARY KEY (
   EDCTS_LOT_NO
);

ALTER TABLE EQM_OPR ADD CONSTRAINT PK_EQM_OPR PRIMARY KEY (
   NOPR_CD,
   EQM_CD
);

ALTER TABLE CCDS_DTL ADD CONSTRAINT PK_CCDS_DTL PRIMARY KEY (
   CCD_DTL,
   CCD
);

ALTER TABLE RLTM_EQM ADD CONSTRAINT PK_RLTM_EQM PRIMARY KEY (
   EQM_CD,
   PRCS_CD
);

ALTER TABLE EQM_IMG ADD CONSTRAINT PK_EQM_IMG PRIMARY KEY (
   EQM_CD,
   PRCS_CD
);

ALTER TABLE RSC_ORDR ADD CONSTRAINT PK_RSC_ORDR PRIMARY KEY (
   ORDR_NO
);

ALTER TABLE RSC_ORDR_DTL ADD CONSTRAINT PK_RSC_ORDR_DTL PRIMARY KEY (
   ORDR_NO
);

ALTER TABLE PROG_PRCS_DTL ADD CONSTRAINT PK_PROG_PRCS_DTL PRIMARY KEY (
   PROG_PRCS_CD
);

ALTER TABLE ORDER_SHEET ADD CONSTRAINT PK_ORDER_SHEET PRIMARY KEY (
   ORDER_NO
);

ALTER TABLE PROG_PRCS_INFER ADD CONSTRAINT PK_PROG_PRCS_INFER PRIMARY KEY (
   PROG_PRCS_CD
);

ALTER TABLE RSC_INSP_DTL ADD CONSTRAINT PK_RSC_INSP_DTL PRIMARY KEY (
   RSC_CD,
   RSC_INSP_NO,
   ORDR_NO
);

ALTER TABLE RSC_INSP ADD CONSTRAINT PK_RSC_INSP PRIMARY KEY (
   RSC_INSP_NO
);

ALTER TABLE EDCTS_OUST ADD CONSTRAINT PK_EDCTS_OUST PRIMARY KEY (
   EDCTS_OUST_NO
);

ALTER TABLE EDCTS_IST ADD CONSTRAINT PK_EDCTS_IST PRIMARY KEY (
   EDCTS_IST_NO
);

ALTER TABLE EDCTS_STC ADD CONSTRAINT PK_EDCTS_STC PRIMARY KEY (
   EDCTS_CD
);

ALTER TABLE RSC_OUST_DTL ADD CONSTRAINT PK_RSC_OUST_DTL PRIMARY KEY (
   RSC_OUST_NO,
   RSC_CD
);

ALTER TABLE HOLDING ADD CONSTRAINT PK_HOLDING PRIMARY KEY (
   PLAN_CD,
   RSC_CD
);

ALTER TABLE EQM ADD CONSTRAINT FK_EQM_LINE_TO_EQM_1 FOREIGN KEY (
   LINE_CD
)
REFERENCES EQM_LINE (
   LINE_CD
);

ALTER TABLE EQM ADD CONSTRAINT FK_PRCS_TO_EQM_1 FOREIGN KEY (
   PRCS_CD
)
REFERENCES PRCS (
   PRCS_CD
);

ALTER TABLE EQM_CHCK ADD CONSTRAINT FK_EQM_TO_EQM_CHCK_1 FOREIGN KEY (
   EQM_CD
)
REFERENCES EQM (
   EQM_CD
);

ALTER TABLE EQM_CHCK ADD CONSTRAINT FK_EQM_TO_EQM_CHCK_2 FOREIGN KEY (
   PRCS_CD
)
REFERENCES EQM (
   PRCS_CD
);

ALTER TABLE PLAN_DTL ADD CONSTRAINT FK_EQM_LINE_TO_PLAN_DTL_1 FOREIGN KEY (
   LINE_CD
)
REFERENCES EQM_LINE (
   LINE_CD
);

ALTER TABLE INDICA_DTL ADD CONSTRAINT FK_INDICA_TO_INDICA_DTL_1 FOREIGN KEY (
   INDICA_DT
)
REFERENCES INDICA (
   INDICA_DT
);

ALTER TABLE PRCS_FLOW ADD CONSTRAINT FK_EDCTS_TO_PRCS_FLOW_1 FOREIGN KEY (
   EDCTS_CD
)
REFERENCES EDCTS (
   EDCTS_CD
);

ALTER TABLE RSC_STC ADD CONSTRAINT FK_RSC_TO_RSC_STC_1 FOREIGN KEY (
   RSC_CD
)
REFERENCES RSC (
   RSC_CD
);

ALTER TABLE RSC_STC_HIST ADD CONSTRAINT FK_RSC_STC_CLS_TO_RSC_STC_HIST_1 FOREIGN KEY (
   CLS_YYMM
)
REFERENCES RSC_STC_CLS (
   CLS_YYMM
);

ALTER TABLE RSC_STC_HIST ADD CONSTRAINT FK_RSC_TO_RSC_STC_HIST_1 FOREIGN KEY (
   RSC_CD
)
REFERENCES RSC (
   RSC_CD
);

ALTER TABLE PRDT_INSP_INFER ADD CONSTRAINT FK_PRDT_INSP_TO_PRDT_INSP_INFER_1 FOREIGN KEY (
   EDCTS_LOT_NO
)
REFERENCES PRDT_INSP (
   EDCTS_LOT_NO
);

ALTER TABLE EQM_OPR ADD CONSTRAINT FK_EQM_TO_EQM_OPR_1 FOREIGN KEY (
   EQM_CD
)
REFERENCES EQM (
   EQM_CD
);

ALTER TABLE CCDS_DTL ADD CONSTRAINT FK_CCDS_TO_CCDS_DTL_1 FOREIGN KEY (
   CCD
)
REFERENCES CCDS (
   CCD
);

ALTER TABLE RLTM_EQM ADD CONSTRAINT FK_EQM_TO_RLTM_EQM_1 FOREIGN KEY (
   EQM_CD
)
REFERENCES EQM (
   EQM_CD
);

ALTER TABLE RLTM_EQM ADD CONSTRAINT FK_EQM_TO_RLTM_EQM_2 FOREIGN KEY (
   PRCS_CD
)
REFERENCES EQM (
   PRCS_CD
);

ALTER TABLE EQM_IMG ADD CONSTRAINT FK_EQM_TO_EQM_IMG_1 FOREIGN KEY (
   EQM_CD
)
REFERENCES EQM (
   EQM_CD
);

ALTER TABLE EQM_IMG ADD CONSTRAINT FK_EQM_TO_EQM_IMG_2 FOREIGN KEY (
   PRCS_CD
)
REFERENCES EQM (
   PRCS_CD
);

ALTER TABLE RSC_ORDR_DTL ADD CONSTRAINT FK_RSC_ORDR_TO_RSC_ORDR_DTL_1 FOREIGN KEY (
   ORDR_NO
)
REFERENCES RSC_ORDR (
   ORDR_NO
);

ALTER TABLE PROG_PRCS_DTL ADD CONSTRAINT FK_PROG_PRCS_TO_PROG_PRCS_DTL_1 FOREIGN KEY (
   PROG_PRCS_CD
)
REFERENCES PROG_PRCS (
   PROG_PRCS_CD
);

ALTER TABLE PROG_PRCS_INFER ADD CONSTRAINT FK_PROG_PRCS_TO_PROG_PRCS_INFER_1 FOREIGN KEY (
   PROG_PRCS_CD
)
REFERENCES PROG_PRCS (
   PROG_PRCS_CD
);

ALTER TABLE RSC_INSP_DTL ADD CONSTRAINT FK_RSC_TO_RSC_INSP_DTL_1 FOREIGN KEY (
   RSC_CD
)
REFERENCES RSC (
   RSC_CD
);

ALTER TABLE RSC_INSP_DTL ADD CONSTRAINT FK_RSC_INSP_TO_RSC_INSP_DTL_1 FOREIGN KEY (
   RSC_INSP_NO
)
REFERENCES RSC_INSP (
   RSC_INSP_NO
);

ALTER TABLE RSC_INSP_DTL ADD CONSTRAINT FK_RSC_ORDR_DTL_TO_RSC_INSP_DTL_1 FOREIGN KEY (
   ORDR_NO
)
REFERENCES RSC_ORDR_DTL (
   ORDR_NO
);

ALTER TABLE EDCTS_STC ADD CONSTRAINT FK_EDCTS_TO_EDCTS_STC_1 FOREIGN KEY (
   EDCTS_CD
)
REFERENCES EDCTS (
   EDCTS_CD
);

ALTER TABLE RSC_OUST_DTL ADD CONSTRAINT FK_RSC_OUST_TO_RSC_OUST_DTL_1 FOREIGN KEY (
   RSC_OUST_NO
)
REFERENCES RSC_OUST (
   RSC_OUST_NO
);

ALTER TABLE RSC_OUST_DTL ADD CONSTRAINT FK_RSC_TO_RSC_OUST_DTL_1 FOREIGN KEY (
   RSC_CD
)
REFERENCES RSC (
   RSC_CD
);

ALTER TABLE HOLDING ADD CONSTRAINT FK_PLAN_TO_HOLDING_1 FOREIGN KEY (
   PLAN_CD
)
REFERENCES PLAN (
   PLAN_CD
);

ALTER TABLE HOLDING ADD CONSTRAINT FK_RSC_TO_HOLDING_1 FOREIGN KEY (
   RSC_CD
)
REFERENCES RSC (
   RSC_CD
);